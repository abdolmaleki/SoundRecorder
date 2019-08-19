package ir.example.activity

import android.content.Intent
import android.os.Bundle
import android.view.Window

class SplashActivity : BaseActivity() {
    var splashThread: Thread?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFullScreen()
        setContentView(ir.example.R.layout.activity_splash)
    }

    private fun setFullScreen() {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
    }

    private fun goToMain() {
    startActivity(Intent(this,MainActivity::class.java))
    }

    private fun startSplash() {
        splashThread = object : Thread() {
            override fun run() {

                try {
                    var waited = 0
                    // Splash screen pause time
                    while (waited < 13000) {
                        Thread.sleep(100)
                        waited += 100
                    }

                } catch (e: InterruptedException) {
                    // do nothing
                } finally {
                    goToMain()
                }
            }
        }

        (splashThread as Thread).start()
    }
}