package kazuki.app.realmandgroupie.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Todo(val text:String, val context: String, val created_at: String, val updated_at: String): Parcelable {
    constructor(): this("", "", "", "")
}
