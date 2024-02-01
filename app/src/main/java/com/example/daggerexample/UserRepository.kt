package com.example.daggerexample

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}

class SqlRepository  @Inject constructor() : UserRepository{

    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User Saved in Db")
    }
}
class FireBaseRepository :UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User Saved in Firebase")
    }

}