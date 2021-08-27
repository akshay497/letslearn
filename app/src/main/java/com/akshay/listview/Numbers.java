package com.akshay.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        Toast.makeText(Numbers.this, "opening numbers activity", Toast.LENGTH_SHORT).show();
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one ", "ek"));
        words.add(new Word("two  ", "don"));
        words.add(new Word("three ", "tin"));
        words.add(new Word("four ", "char"));
        words.add(new Word("five ", "pach"));
        words.add(new Word("six ", "saha"));
        words.add(new Word("seven ", "sath"));
        words.add(new Word("eight ", "aath"));
        words.add(new Word("nine ", "nau"));
        words.add(new Word("ten ", "daha"));

        WordAdapter adapter=new WordAdapter(this,words);

        ListView listview=(ListView)findViewById(R.id.list1);
        listview.setAdapter(adapter);
    }
}