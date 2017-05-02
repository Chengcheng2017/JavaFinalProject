package chengcheng.leaguage;

import java.util.ArrayList;

/**
 * Created by chengchengwang on 4/8/17.
 */

public class User {
    private String name;
    private int age;
    private String country;
    private ArrayList<Course> purchasedCourses;
    private ArrayList<Course> wishCourse;
    private String email;


    public User(String name, int age, String country, ArrayList<Course> purchasedCourses, ArrayList<Course> wishCourse, String email) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.purchasedCourses = purchasedCourses;
        this.wishCourse = wishCourse;
        this.email = email;
    }

    public User() {
    }
}

