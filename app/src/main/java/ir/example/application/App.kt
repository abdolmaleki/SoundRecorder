package ir.example.application

import android.app.Application
import io.realm.Realm

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        configRealm()
    }

    fun configRealm() {
        Realm.init(this)
    }
}