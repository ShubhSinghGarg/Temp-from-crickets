package com.example.temperature_with_crickets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_NumChirps;
    TextView tv_Result;
    Button btn_Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    edt_NumChirps = findViewById(R.id.edt_NumChirps);
    tv_Result = findViewById(R.id.tv_Result);
    btn_Submit = findViewById(R.id.btn_Submit);

    tv_Result.setVisibility(View.GONE);

    btn_Submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int chirps = Integer.parseInt(edt_NumChirps.getText().toString());

            int temp_in_c = (chirps/3) + 4;

            String result = "The approximate temperature outside is " + temp_in_c + getString(R.string.degree_celcius);

            tv_Result.setText(result);

            tv_Result.setVisibility(View.VISIBLE);
        }
    });



    }
}
