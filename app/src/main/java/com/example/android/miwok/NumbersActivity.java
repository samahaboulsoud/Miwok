package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private WordAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti",R.raw.number_one,R.drawable.number_one));
        words.add(new Word("two", "otiiko",R.raw.number_two,R.drawable.number_two));
        words.add(new Word("three", "tolookosu",R.raw.number_three,R.drawable.number_three));
        words.add(new Word("four", "oyyisa",R.raw.number_four,R.drawable.number_four));
        words.add(new Word("five", "massokka",R.raw.number_five,R.drawable.number_five));
        words.add(new Word("six", "temmokka",R.raw.number_six,R.drawable.number_six));
        words.add(new Word("seven", "kenekaku",R.raw.number_seven,R.drawable.number_seven));
        words.add(new Word("eight", "kawinta",R.raw.number_eight,R.drawable.number_eight));
        words.add(new Word("nine", "wo’e",R.raw.number_nine,R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha",R.raw.number_ten,R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        adapter = new WordAdapter(this, words,R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }

    @Override
    protected void onStop() {
        super.onStop();  // Always call the superclass method first
        adapter.releaseMediaPlayer();
    }
}