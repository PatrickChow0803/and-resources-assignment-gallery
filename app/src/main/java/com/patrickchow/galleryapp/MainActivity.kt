package com.patrickchow.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myImage1 = ImageView(this)
        var myImage2 = ImageView(this)
        var myImage3 = ImageView(this)
        var myImage4 = ImageView(this)
        var myImage5 = ImageView(this)
        var myImage6 = ImageView(this)
        var myImage7 = ImageView(this)
        var myImage8 = ImageView(this)
        var myImage9 = ImageView(this)
        var myImage10 = ImageView(this)
        var myImage11 = ImageView(this)
        var myImage12 = ImageView(this)

        var imageList = mutableListOf<ImageView>(myImage1, myImage2, myImage3, myImage4, myImage5, myImage6,
                                                 myImage7, myImage8, myImage9, myImage10, myImage11, myImage12)
        var counter = 0

        var myList = mutableListOf<Int>(5,6,9)

        imageList[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageList[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092))
        imageList[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847))
        imageList[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285))
        imageList[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))
        imageList[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))
        imageList[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))
        imageList[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
        imageList[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
        imageList[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))
        imageList[10].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965))
        imageList[11].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107))

        var parameters = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        imageList.forEach{
            it.layoutParams = parameters
            it.adjustViewBounds = true
            it.setPadding(5, 5, 5, 5)
                if(counter < imageList.size/2) {
                    ll_left_column.addView(imageList[counter])
                    counter++
                }
                else{
                    ll_right_column.addView(imageList[counter])
                    counter++
                }
        }

    }
}

/*

 */