package org.neosoft.com.d7challenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView)findViewById(R.id.imgVCar);
        btn =(Button)findViewById(R.id.btnSelect);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img.getVisibility() == View.VISIBLE){
                    btn.setText("SHOW IMAGE");
                    img.setVisibility(View.INVISIBLE);
                }else{
                    btn.setText("HIDE IMAGE");
                    img.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
