package chengcheng.leaguage;

import java.util.ArrayList;

/**
 * Created by chengchengwang on 4/8/17.
 */

public class User {
    public String name;
    public int age;
    public String country;
    private ArrayList<Course> purchasedCourses;
    private ArrayList<Course> wishCourse;



    public User(String name, int age, String country, ArrayList<Course> purchasedCourses, ArrayList<Course> wishCourse) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.purchasedCourses = purchasedCourses;
        this.wishCourse = wishCourse;
    }

    public User() {
    }
}

