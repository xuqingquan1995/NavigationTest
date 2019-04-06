package top.xuqingquan.navigationtest


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class HomePageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_page, container, false)
        view.findViewById<Button>(R.id.btn_1).setOnClickListener {
            val fragment = HomePageFragmentDirections.actionHomePageToTest1Fragment("HOME")
            findNavController().navigate(fragment)
        }
        view.findViewById<Button>(R.id.btn_2).setOnClickListener {
            val intent = Intent()
            intent.data = Uri.parse("navtest://xuqingquan.top/xqq")
            findNavController().handleDeepLink(intent)
        }
        return view
    }


}
