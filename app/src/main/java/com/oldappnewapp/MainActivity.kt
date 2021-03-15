package com.oldappnewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.actions.Actions

/**
 * MainActivity can act as a splash screen while logic decides which flow to take
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isNewAppCompatible = true // arbitrary logic

        when (isNewAppCompatible) {
            true -> startActivity(Actions.openNewApplication(this))
            false -> startActivity(Actions.openOldApplication(this))

        }
        finish()
    }
}