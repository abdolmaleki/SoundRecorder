package ir.example.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass(name = "Lesson")
open class LessonModel: RealmObject() {

    @PrimaryKey
    var id:Long =0
    var name:String =""

}