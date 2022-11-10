package com.gb.alkhelm.calculator_kh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Themes_activity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rb_default_themes;
    RadioButton rb_red_themes;
    RadioButton rb_green_themes;
    RadioButton rb_blue_themes;

    Button buttonInstall;

    static final String PREFERENCE_NAME = "MyDataBaseForCalculator";
    static final String PREFERENCE_THEME_KEY = "MyDataBaseForCalculator";

    public static int REQUEST_KEY = 222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getMyTheme());
        setContentView(R.layout.activity_themes);

        ((RadioButton) findViewById(R.id.rb_default_themes)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.rb_red_themes)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.rb_green_themes)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.rb_blue_themes)).setOnClickListener(this);

        ((Button) findViewById(R.id.buttonInstall)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Themes_activity.this, MainActivity.class);
                startActivityForResult(intent, REQUEST_KEY);
            }
        });
    }


    // Сохранение настроек в базу данных shared preference
    protected void setMyTheme(int codeStyle) {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(PREFERENCE_THEME_KEY, codeStyle);
        editor.apply();
    }

    protected int getMyTheme() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
        return sharedPreferences.getInt(PREFERENCE_THEME_KEY, R.style.MyStyleThemes); // R.style.MyStyleThemes стоит на шару
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.rb_default_themes): {
                setMyTheme(R.style.MyStyleThemes);
                break;
            }
            case (R.id.rb_red_themes): {
                setMyTheme(R.style.MyRedThemes);
                break;
            }
            case (R.id.rb_green_themes): {
                setMyTheme(R.style.MyGreenThemes);
                break;
            }
            case (R.id.rb_blue_themes): {
                setMyTheme(R.style.MyBlueThemes);
                break;
            }

        }
        recreate();
    }
}
