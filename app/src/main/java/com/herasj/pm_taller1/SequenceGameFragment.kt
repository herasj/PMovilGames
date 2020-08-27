package com.herasj.pm_taller1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.fragment_sequence_game.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
/**
 * A simple [Fragment] subclass.
 * Use the [SequenceGameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SequenceGameFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var nivel: Int = 2
    private var seqList: List<Int> = listOf()
    private var btnList: MutableList<SequenceCard> = listOf<SequenceCard>().toMutableList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sequence_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnList.add(SequenceCard(image1, 1))
        btnList.add(SequenceCard(image2, 2))
        btnList.add(SequenceCard(image3, 3))
        btnList.add(SequenceCard(image4, 4))
        btnList.add(SequenceCard(image5, 5))
        btnList.add(SequenceCard(image6, 6))
        btnList.add(SequenceCard(image7, 7))
        btnList.add(SequenceCard(image8, 8))
        btnList.add(SequenceCard(image9, 9))
        btnList.add(SequenceCard(image10, 10))
        btnList.add(SequenceCard(image11, 11))
        btnList.add(SequenceCard(image11, 12))
        btnList.add(SequenceCard(image13, 13))
        btnList.add(SequenceCard(image14, 14))
        btnList.add(SequenceCard(image15, 15))
        btnList.add(SequenceCard(image16, 16))
        btnList.add(SequenceCard(image17, 17))
        btnList.add(SequenceCard(image19, 18))
        btnList.add(SequenceCard(image19, 19))
        btnList.add(SequenceCard(image20, 20))
        btnList.add(SequenceCard(image21, 21))
        btnList.add(SequenceCard(image22, 22))
        btnList.add(SequenceCard(image23, 23))
        btnList.add(SequenceCard(image24, 24))
        btnList.add(SequenceCard(image25, 25))

        
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SequenceGameFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SequenceGameFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}