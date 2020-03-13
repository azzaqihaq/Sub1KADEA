package com.daffzzaqihaq.sub1kade.mvp.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val ID_IMG_DETAIL = 1
        const val ID_TV_DETAIL_YEAR = 2
        const val ID_TV_DETAIL_NAME = 3
        const val ID_TV_DETAIL_COUNTRY = 4
        const val ID_TV_DETAIL_WEB = 5
        const val ID_TV_DETAIL_DESC = 6
        const val ID_VL = 7
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailUI()
    }

    fun detailUI() {

        // TODO RelativeLayout for ImageView
        relativeLayout {
            padding = dip(16)

            imageView {
                id =
                    ID_IMG_DETAIL

            }.lparams(dip(100), dip(100))


            // TODO Vertical Layout for Parenting Year and Name
            verticalLayout {

                // TextView for Formed Year
                textView {
                    id =
                        ID_TV_DETAIL_YEAR
                }.lparams(matchParent, wrapContent)

                // TextView for Name of League
                textView {
                    id =
                        ID_TV_DETAIL_NAME
                }.lparams(matchParent, wrapContent)


                // TODO Linear Layout for Parenting of tv(Country) and tv (Web)
                linearLayout {
                    orientation = LinearLayout.HORIZONTAL

                    // TextView for tv Country
                    textView {
                        id =
                            ID_TV_DETAIL_COUNTRY
                    }.lparams(matchParent, wrapContent) {
                        weight = 1f
                    }

                    // TextView for tv Web
                    textView {
                        id =
                            ID_TV_DETAIL_WEB
                    }.lparams(matchParent, wrapContent) {
                        weight = 1f
                    }
                }.lparams(matchParent, wrapContent)


                // TODO set paramsLayout of Relative Layout Parent Layout
            }.lparams(matchParent, wrapContent) {
                rightOf(ID_IMG_DETAIL)
                alignParentTop()
            }

            textView{
                id =
                    ID_TV_DETAIL_DESC
            }.lparams(matchParent, wrapContent) {
                below(ID_VL)
            }
        }
    }
}
