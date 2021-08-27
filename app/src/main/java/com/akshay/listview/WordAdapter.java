package com.akshay.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

// check the existing view group is being resused, other wise inflate the view
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.chints, parent, false);

        }
        //get the{@link word} object located at this position in the list
        Word currentWord = getItem(position);

        //find the text view in the list_item.xml layout with the id miwok
        TextView miwokTextView = (TextView) ListItemView.findViewById(R.id.miwok_text_view);

        //get the version from the current word object and set this text in miwok translation
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView) ListItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getmDefaultTranslation());


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) ListItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {

            // Set the ImageView to the image resource specified in the current Word
            imageView.setImageResource(currentWord.getImageResourceId());

            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
     return ListItemView;

    }
}

