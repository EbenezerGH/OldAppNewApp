package com.actions

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent

/** creating deeplinks across modules here */
object Actions {
    fun openNewApplication(context: Context) = internalIntent(context, "action.newapp.open")
    fun openOldApplication(context: Context) = internalIntent(context, "action.oldapp.open")

    @SuppressLint("NewApi")
    private fun internalIntent(context: Context, action: String) =
        Intent(action).setPackage(context.packageName)
}