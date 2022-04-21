package com.pvs.pvsadvisor.database

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

class User: RealmObject {
    @PrimaryKey var userID: Int = 1
    var email:String = ""
    var password:String = ""
    var firstName:String = ""
    var lastName:String = ""
}