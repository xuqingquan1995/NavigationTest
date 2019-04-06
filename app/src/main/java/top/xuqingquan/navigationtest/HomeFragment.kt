package top.xuqingquan.navigationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.LabelVisibilityMode
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class HomeFragment : Fragment() {

    lateinit var bnve: BottomNavigationViewEx
    lateinit var viewPager: ViewPager
//    lateinit var navController: NavController
    lateinit var adapter: ViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        bnve = view.findViewById(R.id.bnv)
        viewPager = view.findViewById(R.id.viewpager)
        adapter = ViewPagerAdapter(
            childFragmentManager, arrayListOf(
                HomePageFragment(), NewsPageFragment(), UserPageFragment()
            )
        )
//        navController = Navigation.findNavController(requireActivity(), R.id.content)
        viewPager.adapter = adapter
        bnve.setupWithViewPager(viewPager)
        bnve.enableAnimation(false)
        bnve.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        bnve.isItemHorizontalTranslationEnabled = false
//        bnve.setupWithNavController(navController)
        return view
    }

}
