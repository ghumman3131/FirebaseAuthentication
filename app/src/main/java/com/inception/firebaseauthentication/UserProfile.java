package com.inception.firebaseauthentication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        read_profile_data();


    }

    public void save_data(View view) {

        ProfileData data = new ProfileData("lovely" , "amritsar", "male" ,25);


        FirebaseDatabase database = FirebaseDatabase.getInstance();


        database.getReference().child("user").child("xyz@gmailcom").setValue(data);

    }

    public void read_profile_data()
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        ValueEventListener event_listener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                ProfileData recieved_data = dataSnapshot.getValue(ProfileData.class);

                System.out.println( recieved_data.name );
                System.out.println( recieved_data.age );
                System.out.println( recieved_data.address );
                System.out.println( recieved_data.gender );


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };


        database.getReference().child("user").child("xyz@gmailcom").addValueEventListener(event_listener);

    }

}
