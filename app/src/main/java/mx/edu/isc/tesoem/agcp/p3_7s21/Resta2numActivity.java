package mx.edu.isc.tesoem.agcp.p3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resta2numActivity extends AppCompatActivity {

    EditText txtnum3, txtnum4;

    TextView lblrest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta2num);

        setContentView(R.layout.activity_resta2num);

        txtnum3 = findViewById(R.id.txtnum3p3);
        txtnum4 = findViewById(R.id.txtnum4p3);
        lblrest = findViewById(R.id.lblresp4);
    }

    public void calcular(View v){
        int num1 = Integer.parseInt(txtnum3.getText().toString());
        int num2 = Integer.parseInt(txtnum4.getText().toString());
        lblrest.setText(String.valueOf(num1-num2));
    }
}