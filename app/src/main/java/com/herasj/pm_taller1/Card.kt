package com.herasj.pm_taller1

import android.graphics.drawable.Drawable
import android.util.Log
import android.widget.ImageButton

class Card {
    public val imageButton: ImageButton;
    private var isHidden: Boolean;
    private val id: Int;
    public var cardDrawable: Int;
    private var completed: Boolean;

    constructor(imageButton: ImageButton, id: Int, cardDrawable: Int) {
        this.isHidden = true;
        this.imageButton = imageButton;
        this.id = id;
        this.cardDrawable = cardDrawable;
        this.completed = false;
    }

    public fun flip() {
        if (this.isHidden == true && completed == false) {
            this.imageButton.setImageResource(cardDrawable)
        } else {
            this.imageButton.setImageResource(R.drawable.ic_launcher_foreground)
        }
        this.isHidden = !this.isHidden;
    }

    public fun userFlip() {
        Log.d("card", "completed? ${this.completed} is hidden: ${this.isHidden}")
        if (this.isHidden == true && this.completed == false) {
            this.imageButton.setImageResource(cardDrawable)
            this.isHidden = !this.isHidden;
        }
    }

    public fun completeCard(){
        this.completed = true;
    }

    public fun setHidden(){
        this.isHidden=!this.isHidden
    }
}