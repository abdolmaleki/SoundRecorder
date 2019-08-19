package ir.example.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import io.realm.annotations.Required

@RealmClass(name = "Voice")
open class VoiceModel : RealmObject() {
    @PrimaryKey
    var id: Long = 0
    var termID: Long = 0
    var lessonID: Long = -1
    var session: Long = -1
    var name: String = ""
    var path: String = ""
}