package top.xuqingquan.navigationtest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Test1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_test1, container, false)
        val textView = view.findViewById<Button>(R.id.test_tv1)
        textView.text = arguments!!.getString("from")
        textView.setOnClickListener {
            val fragment = Test1FragmentDirections.actionTest1FragmentToTest2Fragment()
//            findNavController().navigate(R.id.test2Fragment)
            findNavController().navigate(fragment)
        }
        return view
    }


}
