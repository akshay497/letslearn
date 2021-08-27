package com.akshay.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);
        ArrayList<Word> wordsp = new ArrayList<Word>();
        wordsp.add(new Word("one ", "ek"));
        wordsp.add(new Word("two  ", "don"));
        wordsp.add(new Word("three ", "tin"));
        wordsp.add(new Word("four ", "char"));
        wordsp.add(new Word("five ", "pach"));
        wordsp.add(new Word("six ", "saha"));
        wordsp.add(new Word("seven ", "sath"));
        wordsp.add(new Word("eight ", "aath"));
        wordsp.add(new Word("nine ", "nau"));
        wordsp.add(new Word("ten ", "daha"));

        WordAdapter adapter=new WordAdapter(this,wordsp);

        ListView listview1=(ListView)findViewById(R.id.list2);
        listview1.setAdapter(adapter);
    }
}