package com.daffzzaqihaq.sub1kade.mvp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        const val ID_RV = 1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainUI().setContentView(this)

    }

    class MainUI() : AnkoComponent<MainActivity>{
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui){
            verticalLayout {
                recyclerView {
                    id =
                        ID_RV
                }.lparams(matchParent, matchParent)
            }
        }

    }
}
