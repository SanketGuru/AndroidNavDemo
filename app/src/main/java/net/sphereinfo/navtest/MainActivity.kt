package net.sphereinfo.navtest
//Ian Lake Single Activity
//https://www.youtube.com/watch?v=2k8x8V77CrU&feature=youtu.be
//https://developer.android.com/guide/navigation/navigation-getting-started
//https://medium.com/@umang.burman.micro/navigation-drawer-with-navigation-component-4f032bfdeae6
//https://medium.com/@vepetruskova/the-new-android-in-app-navigation-f7bfbe925b9
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val host = NavHostFragment.create(R.navigation.mobile_navigation)
        supportFragmentManager.beginTransaction().replace(R.id.containerc, host).setPrimaryNavigationFragment(host).commit()

        initialise()
    }
    fun initialise(){
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.checkAttendance -> {
             //       findNavController(R.navigation.mobile_navigation).navigate(R.id.action_blankFragment_to_otherScrrenFragment)
                 //   addFragment(ReportFragment(), ReportFragment.tagTitle)
                }
                R.id.logout -> {
                //    showLogoutAlert()
                }
                R.id.manageUser -> {
            //        Timber.d("Menu 22 %s", it.title)
                }
                R.id.latestStatus -> {
               //     Timber.d("Menu 23 %s", it.title)
                }
            }
            drawer.closeDrawer(GravityCompat.START)
            true
        }
    }
}
