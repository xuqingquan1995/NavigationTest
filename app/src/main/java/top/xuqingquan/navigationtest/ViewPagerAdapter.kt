package top.xuqingquan.navigationtest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * Created by 许清泉 on 2019/4/6 23:17
 */
class ViewPagerAdapter(fm: FragmentManager, private val fragments: List<Fragment>) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int) = fragments[position]

    override fun getCount() = fragments.size
}