package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_realm.*

class RealmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realm)

        Realm.init(this@RealmActivity)
        val config : RealmConfiguration = RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded() // 기존 table틀에 변경이 생기면, 기존 데이터를 싹다 지우는것?
                .build()
        Realm.setDefaultConfiguration(config)

        // realm을 얻기
        val realm = Realm.getDefaultInstance()

        button_save.setOnClickListener {
            realm.executeTransaction{
                // transaction(하나의 작업단위)
                // A테이블에서 데이터를 가져온다 -> 10
                // B테이블에서 데이터를 가져온다
                // C테이블에서 데이터를 가져온다
                // 조합을 한다.
                // D 테이블에 저장을 한다.
                with(it.createObject(School::class.java)){
                    this.name = "어떤 대학교"
                    this.location = "서울"
                }
            }
        }
        button_load.setOnClickListener {
            realm.executeTransaction {
                val data = it.where(School::class.java).findFirst()
                Log.d("dataa","data : " + data)
            }
        }
        button_delete.setOnClickListener {
            realm.executeTransaction {
                it.where(School::class.java).findAll().deleteAllFromRealm()
//                it.where(School::class.java).findFirst().deleteFromRealm()
            }
        }
    }
}