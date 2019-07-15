package ir.example.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

@RealmClass(name = "Lesson")
public class LessonModel extends RealmObject {
    @PrimaryKey
    public long id;
    public String name;
}
