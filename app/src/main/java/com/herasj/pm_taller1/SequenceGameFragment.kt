package com.herasj.pm_taller1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.fragment_sequence_game.*
import kotlinx.android.synthetic.main.fragment_sequence_game.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SequenceGameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SequenceGameFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var nivel: Int = 2
    private var acertadas: Int = 0
    private var vidas: Int = 3
    private val idList: List<Int> = listOf<Int>(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        14,
        15,
        16,
        17,
        18,
        19,
        20,
        21,
        22,
        23,
        24,
        25
    )
    private var seqList: List<Int> = listOf<Int>()
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
        btnList.add(SequenceCard(image12, 12))
        btnList.add(SequenceCard(image13, 13))
        btnList.add(SequenceCard(image14, 14))
        btnList.add(SequenceCard(image15, 15))
        btnList.add(SequenceCard(image16, 16))
        btnList.add(SequenceCard(image17, 17))
        btnList.add(SequenceCard(image18, 18))
        btnList.add(SequenceCard(image19, 19))
        btnList.add(SequenceCard(image20, 20))
        btnList.add(SequenceCard(image21, 21))
        btnList.add(SequenceCard(image22, 22))
        btnList.add(SequenceCard(image23, 23))
        btnList.add(SequenceCard(image24, 24))
        btnList.add(SequenceCard(image25, 25))

        view.findViewById<ImageButton>(R.id.image1).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image2).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image3).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image4).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image5).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image6).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image7).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image8).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image9).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image10).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image11).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image12).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image13).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image14).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image15).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image16).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image17).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image18).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image19).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image20).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image21).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image22).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image23).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image24).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.image25).setOnClickListener(this)

        this.startLevel()
    }

    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.image1 -> {
                handleOnClick(1)
            }
            R.id.image2 -> {
                handleOnClick(2)
            }
            R.id.image3 -> {
                handleOnClick(3)
            }
            R.id.image4 -> {
                handleOnClick(4)
            }
            R.id.image5 -> {
                handleOnClick(5)
            }
            R.id.image6 -> {
                handleOnClick(6)
            }
            R.id.image7 -> {
                handleOnClick(7)
            }
            R.id.image8 -> {
                handleOnClick(8)
            }
            R.id.image9 -> {
                handleOnClick(9)
            }
            R.id.image10 -> {
                handleOnClick(10)
            }
            R.id.image11 -> {
                handleOnClick(11)
            }
            R.id.image12 -> {
                handleOnClick(12)
            }
            R.id.image13 -> {
                handleOnClick(13)
            }
            R.id.image14 -> {
                handleOnClick(14)
            }
            R.id.image15 -> {
                handleOnClick(15)
            }
            R.id.image16 -> {
                handleOnClick(16)
            }
            R.id.image17 -> {
                handleOnClick(17)
            }
            R.id.image18 -> {
                handleOnClick(18)
            }
            R.id.image19 -> {
                handleOnClick(19)
            }
            R.id.image20 -> {
                handleOnClick(20)
            }
            R.id.image21 -> {
                handleOnClick(21)
            }
            R.id.image22 -> {
                handleOnClick(22)
            }
            R.id.image23 -> {
                handleOnClick(23)
            }
            R.id.image24 -> {
                handleOnClick(24)
            }
            R.id.image25 -> {
                handleOnClick(25)
            }
        }
    }

    private fun handleOnClick(index: Int) {
        if (seqList.contains(index)) {
            if (acertadas + 1 == nivel) {
                btnList[index - 1].flip(true)
                GlobalScope.launch(context = Dispatchers.Main) {
                    delay(500)
                    nivel++
                    acertadas = 0
                    view!!.findViewById<TextView>(R.id.nivelText).text = "Nivel: ${nivel}"
                    startLevel()
                }
            } else {
                acertadas++
                btnList[index - 1].flip(true)
            }
        } else {
            if (vidas - 1 == 0) {
                this.gameOver()
            } else {
                btnList[index - 1].setWrong()
                vidas--
                view!!.findViewById<TextView>(R.id.vidasText).text = "Vidas: ${vidas}"
            }
        }
    }

    private fun startLevel() {
        seqList = idList.shuffled().slice((1..this.nivel))
        Toast.makeText(view!!.context, seqList.toString(), Toast.LENGTH_SHORT).show()
        for (imgButton in btnList) {
            if (seqList.contains(imgButton.id)) {
                imgButton.flip(true)
            } else {
                imgButton.flip(false)
            }
        }

        GlobalScope.launch(context = Dispatchers.Main) {
            delay(4000)
            for (imgButton in btnList) {
                if (seqList.contains(imgButton.id)) {
                    imgButton.setValid(true)
                    imgButton.flip(false)
                }
            }
        }
    }

    private fun gameOver() {
        nivel=2
        vidas=3
        view!!.findViewById<TextView>(R.id.nivelText).text = "Nivel: ${nivel}"
        view!!.findViewById<TextView>(R.id.vidasText).text = "Vidas: ${vidas}"
        startLevel()
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