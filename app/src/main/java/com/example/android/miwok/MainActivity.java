/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView NumberList = (TextView) findViewById(R.id.numbers);
        NumberList.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent NumberIntent = new Intent(MainActivity.this, NumbersActivity.class);
                        startActivity(NumberIntent);
                    }
                });

        TextView ColorList = (TextView) findViewById(R.id.colors);
        ColorList.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ColorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(ColorIntent);
            }
        });

        TextView PhraseList = (TextView) findViewById(R.id.phrases);
        PhraseList.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PhraseIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(PhraseIntent);
            }
        });

        TextView FamilyList = (TextView) findViewById(R.id.family);
        FamilyList.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FamilyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(FamilyIntent);
            }
        });

    }


}
