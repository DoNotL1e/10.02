package com.example.a1002;

import android.annotation.SuppressLint;
import android.graphics.Color;  // Import the Color class
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    Button BchnTxt;
    Button BchnColor;  // Declare the button for changing color

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ChangeText), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BchnTxt = findViewById(R.id.BchnTxt);
        text1 = findViewById(R.id.text1);
        BchnColor = findViewById(R.id.BchnColor);  // Initialize the color change button

        BchnTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("Labas Pasauli!");
            }
        });

        @SuppressLint("CutPasteId") TextView title1 = findViewById(R.id.text1);

        BchnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title1.setTextColor(Color.RED);  // Change the text color
            }
        });
    }
}
