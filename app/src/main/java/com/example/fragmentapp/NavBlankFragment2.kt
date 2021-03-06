package com.example.fragmentapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentapp.databinding.FragmentNavBlank2Binding
import com.example.mainFragment.MainActivity2


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NavBlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavBlankFragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_nav_blank2, container, false)
        val binding = FragmentNavBlank2Binding.bind(view)


        val list = mutableListOf(
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),
            Models("Hello", R.drawable.ic_baseline_adb_24),
            Models("World", R.drawable.ic_baseline_bedtime_24),


            )
        val adapter = MyRecyclerView(requireActivity().applicationContext,
            list
        )

        binding.mrecyclerView.layoutManager = LinearLayoutManager(context)
        binding.mrecyclerView.adapter = adapter


        binding.add.setOnClickListener {

            adapter.addItem(Models("New Irem", R.drawable.ic_launcher_background))
        }

        binding.remove.setOnClickListener {
            adapter.remove(0)
        }



        binding.intentNewActivity.setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java)
            startActivity(intent)
        }
        return binding.root
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NavBlankFragment2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NavBlankFragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = childFragmentManager
        fragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.content, fragment)
        }
    }
}