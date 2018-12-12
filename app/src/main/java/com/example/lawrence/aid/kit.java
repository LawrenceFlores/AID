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
                itemDescription.setText("Rubbing/Ethyl/Isopropyl is a disinfecting and sterilizing agent, because it kills bacteria, fungus and viruses. Nurses use it to clean skin of pathogens prior to giving an injection.");
                break;
            case R.id.gauze_id:
                itemImage.setImageResource(R.drawable.bandage);
                itemName.setText("Bandage");
                itemDescription.setText("Bandage  is a piece of material used either to support a medical device such as a dressing or splint, or on its own to provide support to or to restrict the movement of a part of the body. ");
                break;
            case R.id.bandaid_id:
                itemImage.setImageResource(R.drawable.bandaid);
                itemName.setText("Bandaid");
                itemDescription.setText("Band aids are used to protect the wound and scab from friction, bacteria, damage, and dirt.");
                break;
            case R.id.battery_id:
                itemImage.setImageResource(R.drawable.battery);
                itemName.setText("Battery");
                itemDescription.setText("Battery is used to supply the necessary current to start devices such as flashlight, radios, or other small electronic devices.");
                break;
            case R.id.candle_id:
                itemImage.setImageResource(R.drawable.candle);
                itemName.setText("Candle");
                itemDescription.setText("Use an open flame to ignite the candle's wick, which melts and vaporizes a small amount of the wax and form a constant flame to be used as a light/heat source.");
                break;
            case R.id.flashlight_id:
                itemImage.setImageResource(R.drawable.flashlightkit);
                itemName.setText("Flashlight");
                itemDescription.setText("A flashlight consists of the light source mounted in a reflector, a transparent cover to protect the light source and reflector, a battery, and a switch.");
                break;
            case R.id.can_id:
                itemImage.setImageResource(R.drawable.food);
                itemName.setText("Food");
                itemDescription.setText("food is to keep us alive and fueled. Dried food/food without water lasts longer.");
                break;
            case R.id.gloves_id:
                itemImage.setImageResource(R.drawable.gloves);
                itemName.setText("Gloves");
                itemDescription.setText("Gloves help keep your hands clean and lessen your chance of getting germs that can make you sick.");
                break;
            case R.id.matches_id:
                itemImage.setImageResource(R.drawable.match);
                itemName.setText("Match/Lighter");
                itemDescription.setText("Matchsticks/Lighters provide a small amount of fuel to create an open flame from the burning chemicals on the tip.");
                break;
            case R.id.medicine_id:
                itemImage.setImageResource(R.drawable.medicine);
                itemName.setText("Medicine");
                itemDescription.setText("Medicines are chemicals or compounds used to cure, halt, or prevent disease.");
                break;
            case R.id.scissors_id:
                itemImage.setImageResource(R.drawable.scissors);
                itemName.setText("Scissors");
                itemDescription.setText("Scissors are used for cutting various thin materials, such as paper, cardboard, metal foil, cloth, rope, and wire.");
                break;
            case R.id.tape_id:
                itemImage.setImageResource(R.drawable.tape);
                itemName.setText("Tape");
                itemDescription.setText("A tape is  a strip of cloth, paper, or plastic with an adhesive surface, used for sealing, binding, or attaching items together.");
                break;
            case R.id.tissue_id:
                itemImage.setImageResource(R.drawable.tissue);
                itemName.setText("Tissue/Wipes");
                itemDescription.setText("Hygienic tissue paper is commonly used for facial tissue, napkins, bathroom tissue and household towels. Tissue paper has been used for hygiene purposes.");
                break;
            case R.id.umbrella_id:
                itemImage.setImageResource(R.drawable.umbrella);
                itemName.setText("Umbrella");
                itemDescription.setText("An umbrella is a folding canopy supported by wooden or metal ribs, which is usually mounted on a wooden, metal, or plastic pole designed to protect a person against rain or sunlight.");
                break;
            case R.id.water_id:
                itemImage.setImageResource(R.drawable.water);
                itemName.setText("Water");
                itemDescription.setText("Drinking Water Helps Maintain the balance of body fluids.");
                break;
            case R.id.whistle_id:
                itemImage.setImageResource(R.drawable.whistle);
                itemName.setText("Whistle");
                itemDescription.setText("Whistle is an important item for every emergency preparedness kit. This durable whistle can be heard from long distances and comes with a convenient lanyard so it can be worn around the neck. This highly-visible whistle produces a piercing sound which can be useful in emergency situations.");
                break;

            default:
                break;
        }
    }

    public void back(View v) {

        onBackPressed();

    }
}
