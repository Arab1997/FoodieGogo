package makhmudov.foodiegogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CanAct extends AppCompatActivity {
    Button canbtn, canbtn3, canbtn4, canbtn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_can);

        canbtn = findViewById(R.id.canbtn);

        canbtn3 = findViewById(R.id.canbtn3);
        canbtn4 = findViewById(R.id.canbtn4);
        canbtn5 = findViewById(R.id.canbtn5);

        canbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canbtn = new  Intent(CanAct.this,CanAct.class);
                startActivity(canbtn);
                overridePendingTransition(R.anim.slideleft, R.anim.sliderightout);

            }
        });


        canbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canbtn = new  Intent(CanAct.this,CanAct.class);
                startActivity(canbtn);

            }
        });

        canbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canbtn = new  Intent(CanAct.this,CanAct.class);
                startActivity(canbtn);

            }
        });

        canbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canbtn = new  Intent(CanAct.this,CanAct.class);
                startActivity(canbtn);

            }
        });
    }
}
