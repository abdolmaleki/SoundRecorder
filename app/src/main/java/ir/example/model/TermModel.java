package ir.example.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

@RealmClass(name = "Term")
public class TermModel extends RealmObject {
    @PrimaryKey
    public long id;
    @Required
    public String name;
    @Required
    public boolean isAcademic;
    public short year;
    public short section;
    public RealmList<LessonModel> lessons;

}
