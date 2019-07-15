package ir.example.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

@RealmClass(name = "Voice")
public class VoiceModel extends RealmObject {
    @PrimaryKey
    public long id;
    @Required
    public long termID;
    public long lessonID = -1;
    public long session = -1;
    @Required
    public String name;
    @Required
    public String path;


}
