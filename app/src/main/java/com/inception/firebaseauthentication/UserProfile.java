package com.inception.firebaseauthentication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.FirebaseDatabase;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);








    }

    public void save_data(View view) {

        ProfileData data = new ProfileData("lovely" , "amritsar", "male" ,25);


        FirebaseDatabase database = FirebaseDatabase.getInstance();


        database.getReference().child("charan@gmailcom").setValue(data);

    }
}
