package makhmudov.foodiegogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button  canbtn2, canbtn3, canbtn4, canbtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        canbtn2 = findViewById(R.id.canbtn2);
        canbtn3 = findViewById(R.id.canbtn3);
        canbtn4 = findViewById(R.id.canbtn4);
        canbtn5 = findViewById(R.id.canbtn5);


        canbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canbtn = new  Intent(MainActivity.this,CanAct.class);
                startActivity(canbtn);
                overridePendingTransition(R.anim.slideright, R.anim.slideleftout);

            }
        });

        canbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canbtn = new  Intent(MainActivity.this,CanAct.class);
                startActivity(canbtn);

            }
        });

        canbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canbtn = new  Intent(MainActivity.this,CanAct.class);
                startActivity(canbtn);

            }
        });

        canbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canbtn = new  Intent(MainActivity.this,CanAct.class);
                startActivity(canbtn);

            }
        });
    }
}
