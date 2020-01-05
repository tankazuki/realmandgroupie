package kazuki.app.realmandgroupie.models

import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kazuki.app.realmandgroupie.R
import kotlinx.android.synthetic.main.item_layout.view.*

class TodoItem(): Item<GroupieViewHolder>(){

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

    }

    override fun getLayout(): Int {
        return R.layout.item_layout
    }

}