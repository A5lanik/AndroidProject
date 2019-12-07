package com.example.dota2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import static com.example.dota2.MainActivity.EXTRA_MOV;
import static com.example.dota2.MainActivity.EXTRA_DETAIL;
import static com.example.dota2.MainActivity.EXTRA_RATING;
import static com.example.dota2.MainActivity.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String movieName = intent.getStringExtra(EXTRA_MOV);
        String detail = intent.getStringExtra(EXTRA_DETAIL);
        int rating = intent.getIntExtra(EXTRA_RATING, 0);

        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewCreator = findViewById(R.id.text_view_movie_name);
        TextView textViewFlower = findViewById(R.id.text_view_movie_detail);
        TextView textViewLikes = findViewById(R.id.text_view_rating_detail);

        Picasso.get().load(imageUrl).fit().centerInside().into(imageView);
        textViewCreator.setText(movieName);
        textViewFlower.setText(detail);
        textViewLikes.setText("Rating: " + rating);

    }
}