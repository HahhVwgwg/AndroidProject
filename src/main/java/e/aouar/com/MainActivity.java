package e.aouar.com;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private TextView text_item,text_name;
    private Button button,button2;
    private Spinner spinner;
    private final HashMap<Integer,String> map = new HashMap<Integer, String>() {{
        put(1, "Value1");
        put(2, "Value2");
        put(3,"Value3");
    }};

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AppCompat_DayNight_DarkActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_name = findViewById(R.id.text_name);
        text_item = findViewById(R.id.text_itemselected);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        spinner = findViewById(R.id.spinner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_name.setText(R.string.string_name);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_item.setText(map.get(spinner.getSelectedItemPosition()+1));
            }
        });
    }
}