package top.xuqingquan.navigationtest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class test2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_test2, container, false)
        val test_tv2 = view.findViewById<TextView>(R.id.test_tv2)
        if (arguments == null) {
            test_tv2.text = "arguments==null"
        } else if (arguments!!.getString("user") == null) {
            test_tv2.text = "arguments!!.getString(\"user\")==null"
        } else {
            test_tv2.text = arguments!!.getString("user")
        }
        return view
    }


}
