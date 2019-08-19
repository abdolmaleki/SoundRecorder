package ir.example.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import io.realm.annotations.Required
import io.realm.RealmList



@RealmClass(name="Term")
open class TermModel:RealmObject() {
    @PrimaryKey
    var id:Long = 0
    var name:String =""
    var isAcademic:Boolean = false
    var year: Short = 0
    var section: Short = 0
    var lessons: RealmList<LessonModel>? = null
}