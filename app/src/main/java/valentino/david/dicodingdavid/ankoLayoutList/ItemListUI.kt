package valentino.david.dicodingdavid.ankoLayoutList

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.*
import valentino.david.dicodingdavid.MainActivity
import valentino.david.dicodingdavid.R

class ItemListUI : AnkoComponent<ViewGroup> {

    override fun createView(ui: AnkoContext<ViewGroup>) : View = with(ui) {
        linearLayout {
            lparams(width = matchParent){
                margin = dip(10)
            }
            imageView{
                setImageResource(R.drawable.img_barca)
                id = R.id.imageViewClub
            }.lparams(width = dip(50),height = dip(50))
            textView{
                text = "Barcelona FC"
                padding = dip(10)
                id = R.id.textViewClub
                gravity = Gravity.CENTER_VERTICAL
            }.lparams(width= wrapContent, height = wrapContent)
        }
    }
}