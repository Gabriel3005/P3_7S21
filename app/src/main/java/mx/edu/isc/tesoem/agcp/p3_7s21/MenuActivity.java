package mx.edu.isc.tesoem.agcp.p3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button btnsuma2nump3;
    Button btnresta2nump3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnresta2nump3 = findViewById(R.id.p2btnresta);
        btnresta2nump3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanzar = new Intent(MenuActivity.this, Resta2numActivity.class);
                startActivity(lanzar);
            }
        });

        btnsuma2nump3 = findViewById(R.id.p2btnsuma);
        btnsuma2nump3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanza = new Intent(MenuActivity.this, Suma2numActivity.class);
                startActivity(lanza);
            }
        });

    }
}