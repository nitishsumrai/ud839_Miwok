package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    int backgroundColor = -1;

    public WordAdapter(Context context, ArrayList<Word> arrayList, int background) {
        super(context, 0, arrayList);
        backgroundColor = background;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        Word currentWord = getItem(position);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.IsImage()) {
            imageView.setImageResource(currentWord.getReourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);

        }
        TextView miwokTranlationView = (TextView) listItemView.findViewById(R.id.miwok);
        miwokTranlationView.setText(currentWord.getMiwokTranslation());

        TextView englishTranslationView = (TextView) listItemView.findViewById(R.id.english);
        englishTranslationView.setText(currentWord.getEnglishTranslation());

        RelativeLayout relativeLayout = (RelativeLayout) listItemView.findViewById(R.id.playIcon);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linear);
        int color = ContextCompat.getColor(getContext(), backgroundColor);
        linearLayout.setBackgroundColor(color);
        relativeLayout.setBackgroundColor(color);
        return listItemView;
    }
}
