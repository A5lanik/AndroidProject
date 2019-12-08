package com.example.dota2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.example.dota2.MainActivity.EXTRA_DETAIL;
import static com.example.dota2.MainActivity.EXTRA_MOV;
import static com.example.dota2.MainActivity.EXTRA_RATING;
import static com.example.dota2.MainActivity.EXTRA_URL;



public class DetailActivity extends AppCompatActivity {
ImageButton ShareButton;
Intent myIntent;
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat timeStampFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    final String currentDateTime = timeStampFormat.format(calendar.getTime());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ShareButton = (ImageButton) findViewById(R.id.share_button);



        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String movieName = intent.getStringExtra(EXTRA_MOV);
        String detail = intent.getStringExtra(EXTRA_DETAIL);
        int rating = intent.getIntExtra(EXTRA_RATING, 0);

        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewName = findViewById(R.id.text_view_movie_name);
        TextView textViewDetail = findViewById(R.id.text_view_movie_detail);
        TextView textViewRating = findViewById(R.id.text_view_rating_detail);
        TextView textViewdate = findViewById(R.id.text_view_date_time);

        Picasso.get().load(imageUrl).fit().centerInside().into(imageView);
        textViewName.setText(movieName);
        textViewDetail.setText(detail);
        textViewRating.setText("Rating: " + rating);
        textViewdate.setText(currentDateTime);
        ShareButton.setOnClickListener(new View.OnClickListener () {

            @Override
            public void onClick(View v) {
        TextView Text1 = findViewById(R.id.text_view_movie_detail);
        TextView Text = findViewById(R.id.text_view_movie_name);
                myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                myIntent.setType("image/jpeg");
                String ShareBody =  Text.getText().toString();
                String ShareSub = Text1.getText().toString();
                myIntent.putExtra(Intent.EXTRA_SUBJECT, ShareBody);
                myIntent.putExtra(Intent.EXTRA_TEXT, ShareSub);
                myIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse(EXTRA_URL));
                startActivity(Intent.createChooser(myIntent, "Share Using"));

            }
        });

    }
}