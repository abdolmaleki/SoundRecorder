package ir.example.application;

import android.app.Application;

import io.realm.Realm;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        configRealm();
    }

    private void configRealm() {
        Realm.init(this);
    }
}
