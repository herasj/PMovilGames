package com.herasj.pm_taller1

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_memory.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MemoryFragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_memory, container, false)
    }

    companion object {
        var card1: Card? = null;
        var card2: Card? = null;
        var card3: Card? = null;
        var card4: Card? = null;
        var card5: Card? = null;
        var card6: Card? = null;
        var card7: Card? = null;
        var card8: Card? = null;
        var card9: Card? = null;
        var card10: Card? = null;
        var card11: Card? = null;
        var card12: Card? = null;

        var Score: Int = 0;
        var firstPick: Int? = null;
        var secondPick: Int? = null;
        var firstCard: Card? = null;
        var secondCard: Card? = null;

        var action: Boolean = true;
    }

    @ExperimentalStdlibApi
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val drawableList: MutableList<Int> = mutableListOf(
            R.drawable.card1,
            R.drawable.card1,
            R.drawable.card2,
            R.drawable.card2,
            R.drawable.card3,
            R.drawable.card3,
            R.drawable.card4,
            R.drawable.card4,
            R.drawable.card5,
            R.drawable.card5,
            R.drawable.card6,
            R.drawable.card6
        )
        drawableList.shuffle()
        card1 = Card(
            view.findViewById<ImageButton>(R.id.imageButton),
            R.id.imageButton,
            drawableList.removeLast()
        )
        card2 = Card(
            view.findViewById<ImageButton>(R.id.imageButton2),
            R.id.imageButton2,
            drawableList.removeLast()
        )
        card3 = Card(
            view.findViewById<ImageButton>(R.id.imageButton3),
            R.id.imageButton3,
            drawableList.removeLast()
        )
        card4 = Card(
            view.findViewById<ImageButton>(R.id.imageButton4),
            R.id.imageButton4,
            drawableList.removeLast()
        )
        card5 = Card(
            view.findViewById<ImageButton>(R.id.imageButton5),
            R.id.imageButton5,
            drawableList.removeLast()
        )
        card6 = Card(
            view.findViewById<ImageButton>(R.id.imageButton6),
            R.id.imageButton6,
            drawableList.removeLast()
        )
        card7 = Card(
            view.findViewById<ImageButton>(R.id.imageButton7),
            R.id.imageButton7,
            drawableList.removeLast()
        )
        card8 = Card(
            view.findViewById<ImageButton>(R.id.imageButton8),
            R.id.imageButton8,
            drawableList.removeLast()
        )
        card9 = Card(
            view.findViewById<ImageButton>(R.id.imageButton9),
            R.id.imageButton9,
            drawableList.removeLast()
        )
        card10 = Card(
            view.findViewById<ImageButton>(R.id.imageButton10),
            R.id.imageButton10,
            drawableList.removeLast()
        )
        card11 = Card(
            view.findViewById<ImageButton>(R.id.imageButton11),
            R.id.imageButton11,
            drawableList.removeLast()
        )
        card12 = Card(
            view.findViewById<ImageButton>(R.id.imageButton12),
            R.id.imageButton12,
            drawableList.removeLast()
        )

        view.findViewById<ImageButton>(R.id.imageButton).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton2).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton3).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton4).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton5).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton6).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton7).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton8).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton9).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton10).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton11).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageButton12).setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v!!.id) {
            R.id.imageButton -> {
                if (action) {
                    card1!!.flip(); setPicks(card1!!.cardDrawable, card1!!)
                }
            }
            R.id.imageButton2 -> {
                if (action) {
                    card2!!.flip(); setPicks(card2!!.cardDrawable, card2!!)
                }
            }
            R.id.imageButton3 -> {
                if (action) {
                    card3!!.flip(); setPicks(card3!!.cardDrawable, card3!!)
                }
            }
            R.id.imageButton4 -> {
                if (action) {
                    card4!!.flip(); setPicks(card4!!.cardDrawable, card4!!)
                }
            }
            R.id.imageButton5 -> {
                if (action) {
                    card5!!.flip(); setPicks(card5!!.cardDrawable, card5!!)
                }
            }
            R.id.imageButton6 -> {
                if (action) {
                    card6!!.flip(); setPicks(card6!!.cardDrawable, card6!!)
                }
            }
            R.id.imageButton7 -> {
                if (action) {
                    card7!!.flip(); setPicks(card7!!.cardDrawable, card7!!)
                }
            }
            R.id.imageButton8 -> {
                if (action) {
                    card8!!.flip(); setPicks(card8!!.cardDrawable, card8!!)
                }
            }
            R.id.imageButton9 -> {
                if (action) {
                    card9!!.flip(); setPicks(card9!!.cardDrawable, card9!!)
                }
            }
            R.id.imageButton10 -> {
                if (action) {
                    card10!!.flip(); setPicks(card10!!.cardDrawable, card10!!)
                }
            }
            R.id.imageButton11 -> {
                if (action) {
                    card11!!.flip(); setPicks(card11!!.cardDrawable, card11!!)
                }
            }
            R.id.imageButton12 -> {
                if (action) {
                    card12!!.flip(); setPicks(card12!!.cardDrawable, card12!!)
                }
            }
        }
    }

    private fun setPicks(pick: Int, cardPick: Card) {

        if (firstPick != null && secondPick == null) {
            secondPick = pick
            secondCard = cardPick
            Log.d("pick", "2nd")
        } else {
            if (secondPick == null && firstPick == null) {
                firstPick = pick
                firstCard = cardPick
                Log.d("pick", "First")
            }
        }
        Log.d("match", "Matches: $firstPick $secondPick")
        if (firstPick != null && secondPick != null) {
            if (secondPick == firstPick && firstCard!!.imageButton.id != secondCard!!.imageButton.id) {
                Score += 10;
                scoreText.text = "Score: $Score"
                firstCard!!.completeCard()
                secondCard!!.completeCard()
                firstPick = null;
                firstCard = null;
                secondPick = null;
                secondCard = null;
            } else {
                Score -= 5
                scoreText.text = "Score: $Score"
                val numberOne: ImageButton = firstCard!!.imageButton
                val numberTwo: ImageButton = secondCard!!.imageButton
                Log.d("card", "Score: $Score")
                Log.d("res", "RESET")
                firstCard!!.setHidden();
                secondCard!!.setHidden()
                GlobalScope.launch(context = Dispatchers.Main) {
                    delay(700)
                    numberOne.setImageResource(R.drawable.ic_launcher_foreground)
                    numberTwo.setImageResource(R.drawable.ic_launcher_foreground)
                    firstPick = null;
                    firstCard = null;
                    secondPick = null;
                    secondCard = null;
                }

            }

        }

    }

}
