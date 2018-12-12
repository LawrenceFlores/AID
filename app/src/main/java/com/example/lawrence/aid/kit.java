package com.example.lawrence.aid;

import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class kit extends AppCompatActivity implements View.OnClickListener{
    ImageButton alcohol, bandage, bandaid, battery, candle,
            flashlight, can, gloves, match, medicine, scissors, tape, tissue,
            umbrella, water, whistle;
    ImageView itemImage;
    TextView itemName, itemDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kit);


        itemImage = (ImageView) findViewById(R.id.item_image);
        itemName = (TextView) findViewById(R.id.item_name);
        itemDescription = (TextView) findViewById(R.id.text_description);

        alcohol = (ImageButton) findViewById(R.id.alcohol_id);
        alcohol.setOnClickListener(this);
        bandage = (ImageButton) findViewById(R.id.gauze_id);
        bandage.setOnClickListener(this);
        bandaid = (ImageButton) findViewById(R.id.bandaid_id);
        bandaid.setOnClickListener(this);
        battery = (ImageButton) findViewById(R.id.battery_id);
        battery.setOnClickListener(this);
        candle = (ImageButton) findViewById(R.id.candle_id);
        candle.setOnClickListener(this);
        flashlight = (ImageButton) findViewById(R.id.flashlight_id);
        flashlight.setOnClickListener(this);
        can = (ImageButton) findViewById(R.id.can_id);
        can.setOnClickListener(this);
        gloves = (ImageButton) findViewById(R.id.gloves_id);
        gloves.setOnClickListener(this);
        match = (ImageButton) findViewById(R.id.matches_id);
        match.setOnClickListener(this);
        medicine = (ImageButton) findViewById(R.id.medicine_id);
        medicine.setOnClickListener(this);
        scissors = (ImageButton) findViewById(R.id.scissors_id);
        scissors.setOnClickListener(this);
        tape = (ImageButton) findViewById(R.id.tape_id);
        tape.setOnClickListener(this);
        tissue = (ImageButton) findViewById(R.id.tissue_id);
        tissue.setOnClickListener(this);
        umbrella = (ImageButton) findViewById(R.id.umbrella_id);
        umbrella.setOnClickListener(this);
        water = (ImageButton) findViewById(R.id.water_id);
        water.setOnClickListener(this);
        whistle = (ImageButton) findViewById(R.id.whistle_id);
        whistle.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.alcohol_id:
                itemImage.setImageResource(R.drawable.alcohol);
                itemName.setText("Alcohol");
                itemDescription.setText("This is alcohol!");
                break;
            case R.id.gauze_id:
                itemImage.setImageResource(R.drawable.bandage);
                itemName.setText("Gauze");
                itemDescription.setText("This is gauze!");
                break;
            case R.id.bandaid_id:
                itemImage.setImageResource(R.drawable.bandaid);
                itemName.setText("Bandaid");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.battery_id:
                itemImage.setImageResource(R.drawable.battery);
                itemName.setText("Battery");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.candle_id:
                itemImage.setImageResource(R.drawable.candle);
                itemName.setText("candle");
                itemDescription.setText("This is candle");
                break;
            case R.id.flashlight_id:
                itemImage.setImageResource(R.drawable.flashlightkit);
                itemName.setText("Battery");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.can_id:
                itemImage.setImageResource(R.drawable.food);
                itemName.setText("Food");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.gloves_id:
                itemImage.setImageResource(R.drawable.gloves);
                itemName.setText("Gloves");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.matches_id:
                itemImage.setImageResource(R.drawable.match);
                itemName.setText("Match/Lighter");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.medicine_id:
                itemImage.setImageResource(R.drawable.medicine);
                itemName.setText("Medicine");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.scissors_id:
                itemImage.setImageResource(R.drawable.scissors);
                itemName.setText("Scissors");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.tape_id:
                itemImage.setImageResource(R.drawable.tape);
                itemName.setText("Tape");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.tissue_id:
                itemImage.setImageResource(R.drawable.tissue);
                itemName.setText("Tissue/Wipes");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.umbrella_id:
                itemImage.setImageResource(R.drawable.umbrella);
                itemName.setText("Umbrella");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.water_id:
                itemImage.setImageResource(R.drawable.water);
                itemName.setText("Water");
                itemDescription.setText("This is bandaid");
                break;
            case R.id.whistle_id:
                itemImage.setImageResource(R.drawable.whistle);
                itemName.setText("Whistle");
                itemDescription.setText("This is bandaid");
                break;

            default:
                break;
        }
    }

}
