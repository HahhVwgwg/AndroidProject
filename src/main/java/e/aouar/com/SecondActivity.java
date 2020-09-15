package e.aouar.com;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends BaseActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AppCompat_DayNight_DarkActionBar);
        super.onCreate(savedInstanceState);
        text_name.setText(text_name.getText().toString()+2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ThirdActivity.class));
            }
        });
    }
    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_second;
    }
}