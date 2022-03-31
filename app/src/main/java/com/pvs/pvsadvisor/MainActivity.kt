package com.pvs.pvsadvisor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pvs.pvsadvisor.upload.UploadCategoryFragment
import com.pvs.pvsadvisor.upload.UploadTitleCollectionFragment

/*
 * Main function for Prime Vice Advisor.
 * Developed by Amar, Steven, and Jacob.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //This will vary on user or advisor status
        val status = "user"
        if (status == "user") {
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    replace<UserHomeMain>(R.id.main_act_user_ui_frag_container)
                    setReorderingAllowed(true)
                }
            }
        }
    }

    //Inflates the custom menu from menu asset
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.user_home_menu, menu)
        return true
    }

    //Controls menu actions on home page
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.user_home_profile_directory) {
            //TODO:Direct the user to the profile page
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}