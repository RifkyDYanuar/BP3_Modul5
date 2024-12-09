package com.media.bp3_explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MoveWithData extends AppCompatActivity {

    public final static String EXTRA_AGE = "extra_age";
    public final static String EXTRA_NAME = "extra_name";    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_move_with_data);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView receivedData = findViewById(R.id.received_data);
        Intent intent = getIntent();
        String Name = intent.getStringExtra(EXTRA_NAME);
        int Age = intent.getIntExtra(EXTRA_AGE, 0);
        String text = "Name : " + Name + "  \nAge : " + Age;
        receivedData.setText(text);

    }
}