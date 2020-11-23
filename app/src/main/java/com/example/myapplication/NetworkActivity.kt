package com.example.myapplication

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_network.*
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class NetworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network)

        NetworkTask(
            recycler_person,
            LayoutInflater.from(this@NetworkActivity)
            //this@NetworkActivity
        ).execute()
    }
}

class NetworkTask(
    val recyclerView: RecyclerView,
    val inflater: LayoutInflater, // adapter를 만들 때 필요
    //val context: Context // layoutmanager를 만들 때 필요 -> xml에서 처리
) : AsyncTask<Any?, Any?, Array<PersonFromServer>>() {
    // 여기는 UI쓰레드에 접근이 가능하기 때문에, 여기서 뷰를 그려준다.
    override fun onPostExecute(result: Array<PersonFromServer>?) {
        val adapter = PersonAdapter(result!!, inflater) // !!처리 방식은 개발자가 null이 아님을 증명하는거라 비추천
        recyclerView.adapter = adapter
        //recyclerView.layoutManager = LinearLayoutManager(context)
        super.onPostExecute(result)
    }

    //doInBackground의 return이 onPostExecute의 파라 미터로 들어감
    override fun doInBackground(vararg params: Any?): Array<PersonFromServer> {
        val urlString: String = "http://mellowcode.org/json/students/"
        val url: URL = URL(urlString)
        val connection: HttpURLConnection = url.openConnection() as HttpURLConnection

        connection.requestMethod = "GET"
        connection.setRequestProperty("Content-Type", "application/json")

        // HTTP_OK타고 가면 200임
        var buffer = ""
        if (connection.responseCode == HttpURLConnection.HTTP_OK) {
            Log.d("connn", "inputstream : " + connection.inputStream) // 뭐 알수 없는 로그
            val reader = BufferedReader(
                InputStreamReader(
                    connection.inputStream,
                    "UTF-8"
                )
            )
            buffer = reader.readLine()
            Log.d("connn","buffer : " + buffer) // buffer : [{"id":1,"name":"홍길동","age":20,"intro":"나는 홍길동이다!"},...
        }

        //Json Parsing -> Json을 코틀린이나 자바가 이해할수 있게 변형 하는 과정
        //Serializable (직렬화)
        val data = Gson().fromJson(buffer, Array<PersonFromServer>::class.java) // app수준 gradle에 GSON dependency 추가
        val age = data[0].age
        Log.d("connn","data : " + data) // data : [Lcom.example.myapplication.PersonFromServer;@910163a
        Log.d("connn", "age : " + age) // age : 20

        return data
    }
}

class PersonAdapter(
    val personList: Array<PersonFromServer>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView
        val age: TextView
        val intro: TextView

        init {
            name = itemView.findViewById(R.id.person_name)
            age = itemView.findViewById(R.id.person_age)
            intro = itemView.findViewById(R.id.person_intro)
        }
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.person_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.setText(personList.get(position).name)
        holder.age.setText(personList.get(position).age.toString())
        holder.intro.setText(personList.get(position).intro)
    }
}
