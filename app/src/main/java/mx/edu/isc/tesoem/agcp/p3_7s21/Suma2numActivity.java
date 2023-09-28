package mx.edu.isc.tesoem.agcp.p3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Suma2numActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;

    TextView lblrest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma2num);

        setContentView(R.layout.activity_suma2num);

        txtnum1 = findViewById(R.id.txtnum1p3);
        txtnum2 = findViewById(R.id.txtnum2p3);
        lblrest = findViewById(R.id.lblresp3);

    }

    public void calcular(View v){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        lblrest.setText(String.valueOf(num1+num2));
    }
}