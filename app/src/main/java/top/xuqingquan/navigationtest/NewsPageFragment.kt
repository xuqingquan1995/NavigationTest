package top.xuqingquan.navigationtest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_news_page.*

class NewsPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news_page, container, false)
        view.findViewById<Button>(R.id.btn_2).setOnClickListener {
            findNavController().navigate(R.id.test1Fragment, bundleOf("from" to "NEWS"))
        }
        return view
    }


}
