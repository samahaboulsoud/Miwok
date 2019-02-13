package com.example.android.miwok;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.ListView;

        import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private WordAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "әpә",R.raw.family_father,R.drawable.family_father));
        words.add(new Word("mother", "әṭa",R.raw.family_mother,R.drawable.family_mother));
        words.add(new Word("son", "angsi",R.raw.family_son,R.drawable.family_son));
        words.add(new Word("daughter", "tune",R.raw.family_daughter,R.drawable.family_daughter));
        words.add(new Word("older brother", "taachi",R.raw.family_older_brother,R.drawable.family_older_brother));
        words.add(new Word("younger brother", "chalitti",R.raw.family_younger_brother,R.drawable.family_younger_sister));
        words.add(new Word("older sister", "teṭe",R.raw.family_older_sister,R.drawable.family_older_sister));
        words.add(new Word("younger sister", "kolliti",R.raw.family_younger_sister,R.drawable.family_younger_sister));
        words.add(new Word("grandmother", "ama",R.raw.family_grandmother,R.drawable.family_grandmother));
        words.add(new Word("grandfather", "paapa",R.raw.family_grandfather,R.drawable.family_grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        adapter = new WordAdapter(this, words,R.color.category_family);

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