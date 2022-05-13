package kr.ac.yeonsung.mp1.mobileproject_0513_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearRed, linearBlue, linearYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnRed = findViewById(R.id.btn_red);
        Button btnBlue = findViewById(R.id.btn_blue);
        Button btnYellow = findViewById(R.id.btn_yellow);

        btnRed.setOnClickListener(btnListener);
        btnBlue.setOnClickListener(btnListener);
        btnYellow.setOnClickListener(btnListener);

        linearRed = findViewById(R.id.linear_red);
        linearBlue = findViewById(R.id.linear_blue);
        linearYellow = findViewById(R.id.linear_yellow);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            linearRed.setVisibility(view.INVISIBLE);
            linearBlue.setVisibility(view.INVISIBLE);
            linearYellow.setVisibility(view.INVISIBLE);
            switch (view.getId()){
                case R.id.btn_red:
                    linearRed.setVisibility(view.VISIBLE);
                    break;

                case R.id.btn_blue:
                    linearBlue.setVisibility(view.VISIBLE);
                    break;

                case R.id.btn_yellow:
                    linearYellow.setVisibility(view.VISIBLE);
                    break;
            }
        }
    };
}