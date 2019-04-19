package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView circleImg;
    TextView tvFullName, tvPhone, tvAddress, tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circleImg = findViewById(R.id.circleImg);
        tvAddress = findViewById(R.id.tvAddress);
        tvPhone= findViewById(R.id.tvContact);
        tvEmail = findViewById(R.id.tvEmail);
        tvFullName= findViewById(R.id.tvName);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            circleImg.setImageResource(bundle.getInt("image"));
            tvAddress.setText(bundle.getString("address"));
            tvPhone.setText(bundle.getString("phone"));
            tvFullName.setText(bundle.getString("name"));
            tvEmail.setText(bundle.getString("email"));
        }
    }
}
