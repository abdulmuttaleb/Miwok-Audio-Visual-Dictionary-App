package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ahmed on 3/3/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceID;

    public WordAdapter(@NonNull Context context, ArrayList<Word> words, int colorResource) {
        super(context, 0, words);
        this.mColorResourceID = colorResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        final Word currentWord = getItem(position);

        TextView englishText = listItemView.findViewById(R.id.default_text_view);
        englishText.setText(currentWord.getDefaultTranslation());

        TextView miwokText = listItemView.findViewById(R.id.miwok_text_view);
        miwokText.setText(currentWord.getMiwokTranslation());

        ImageView wordImage = listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            wordImage.setImageResource(currentWord.getImageResourceID());
        }else{
            wordImage.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceID);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }


}
