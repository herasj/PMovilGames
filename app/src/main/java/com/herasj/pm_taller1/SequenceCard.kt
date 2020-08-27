package com.herasj.pm_taller1

import android.widget.ImageButton

class SequenceCard {
    private var valid: Boolean = false
    public val id: Int
    public val imgButton: ImageButton
    constructor(imgButton: ImageButton, id: Int) {
        this.id = id
        this.imgButton = imgButton
    }

    fun flip():Boolean {
        if(this.valid){
            this.imgButton.setBackgroundColor(333)
            return this.valid
        }
        return this.valid
    }

    fun setValid(valid: Boolean) {
        this.valid = valid
    }
}
