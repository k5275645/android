package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        // 아이템리스트 준비
        val carList = ArrayList<CarForList>() // 다른 엑티비티꺼 그냥 씀
        for (i in 0 until 50) {
            carList.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진"))
        }

        val adapter = RecyclerViewAdapter(carList, LayoutInflater.from(this@RecyclerViewActivity))
        recycler_view.adapter = adapter
        //RecyclerView의 기능 LayoutManager(Linear, Grid, StaggeredGrid)
        recycler_view.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
        //그리드레이아웃 사용시, 바둑판 같이 배열 가능
//        recycler_view.layoutManager = GridLayoutManager(this@RecyclerViewActivity, 2)
    }
}

class RecyclerViewAdapter(
    val itemList: ArrayList<CarForList>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carName: TextView
        val carEngine: TextView

        // init 블럭은 초기화 블럭이라고도 함
        init {
            carName = itemView.findViewById(R.id.car_name)
            carEngine = itemView.findViewById(R.id.car_engine)
            // 아이템 하나 클릭시 기능
            itemView.setOnClickListener {
                val position: Int = adapterPosition
                // 그냥 class면 outer class의 itemList를 사용하지 못함 -> inner class로 만듦
                val engineName = itemList.get(position).engine
                Log.d("engine", "engineName" + engineName)
            }
        }
    }

    // 아이템 하나씩을 뷰에 넣고 리턴
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.item_view, parent, false)
        //return RecyclerViewAdapter.ViewHolder(view)
        // -> ViewHolder를 inner클래스로 만들었기 때문에 그냥 ViewHolder(view)리턴
        return ViewHolder(view)
    }

    // 홀더에 글자를 넣는 부분
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.carName.setText(itemList.get(position).name)
        holder.carEngine.setText(itemList.get(position).engine)
    }

    // 뷰의 사이즈?
    override fun getItemCount(): Int {
        return itemList.size
    }
}