package com.media.bp3_explicitintent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btnMove = findViewById(R.id.btn_move_activity);
        Button btnMoveWithData = findViewById(R.id.btn_move_activity_data);
        btnMove.setOnClickListener(this);
        btnMoveWithData.setOnClickListener(this);

    }
    public void onClick(View v) {
        // Use switch-case to handle button clicks
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent intent = new Intent(MainActivity.this, MoveWithData.class);
                intent.putExtra(MoveWithData.EXTRA_AGE,25);
                intent.putExtra(MoveWithData.EXTRA_NAME,"RIFKY DEWANI YANUAR");
                startActivity(intent);
                break;
        }
}   }
