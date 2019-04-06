package top.xuqingquan.navigationtest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class UserPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user_page, container, false)
        view.findViewById<Button>(R.id.btn_3).setOnClickListener {
            val bundle = Bundle()
            bundle.putString("from", "USER")
            findNavController().navigate(R.id.test1Fragment, bundle)
        }
        return view
    }


}
