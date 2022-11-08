package com.gb.alkhelm.calculator_kh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Themes_activity extends AppCompatActivity {

    RadioButton rb_red_themes;
    RadioButton rb_green_themes;
    RadioButton rb_blue_themes;

    static final String PREFERENCE_NAME = "MyDataBaseForCalculator";
    static final String PREFERENCE_THEME_NAME = "MyDataBaseForCalculator";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);

        initButton();

        View.OnClickListener rbOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case (R.id.rb_red_themes):



                }
            }
        };

        rb_red_themes.setOnClickListener(rbOnClickListener);
        rb_green_themes.setOnClickListener(rbOnClickListener);
        rb_blue_themes.setOnClickListener(rbOnClickListener);
    }

    private void initButton() {
        rb_red_themes = findViewById(R.id.rb_red_themes);
        rb_green_themes = findViewById(R.id.rb_green_themes);
        rb_blue_themes = findViewById(R.id.rb_blue_themes);
    }


    // Сохранение настроек в базу данных shared preference
    protected void saveThemes(int codeStyle) {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(PREFERENCE_THEME_NAME, codeStyle);
        editor.apply();
    }

    protected void getThemes() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
        //return sharedPreferences.getInt(PREFERENCE_THEME_NAME, R.style.MyStyleThemes); // R.style.MyStyleThemes стоит на шару
    }

}