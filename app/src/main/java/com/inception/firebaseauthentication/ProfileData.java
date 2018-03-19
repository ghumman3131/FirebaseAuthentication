package com.inception.firebaseauthentication;

/**
 * Created by charanghumman on 19/03/18.
 */

public class ProfileData

{

    public String name , address , gender ;

    public   int age ;

    ProfileData()
    {

    }


    ProfileData(String name , String address , String gender , int age)

    {
        this.name = name;

        this.address = address;

        this.gender = gender;

        this.age = age;
    }



}
