package com.herasj.pm_taller1

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.RippleDrawable
import android.widget.ImageButton

class SequenceCard {
    private var valid: Boolean = false
    public val id: Int
    public val imgButton: ImageButton
    constructor(imgButton: ImageButton, id: Int) {
        this.id = id
        this.imgButton = imgButton
    }

    fun flip(rev: Boolean) {
        if(rev){
            this.imgButton.setBackgroundColor(Color.parseColor("#9C27B0"))
            this.imgButton.setImageResource(0)
        }else{
            this.imgButton.setImageResource(R.drawable.idk)
            this.imgButton.setBackgroundColor(Color.parseColor("#00BCD4"))
        }
    }

    fun setWrong() {
        this.imgButton.setImageResource(R.drawable.x)
    }

    fun setValid(valid: Boolean) {
        this.valid = valid
    }
}
