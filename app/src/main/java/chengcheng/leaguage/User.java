package chengcheng.leaguage;

import java.util.ArrayList;

/**
 * Created by chengchengwang on 4/8/17.
 */

public class User {
    private String name;
    private int age;
    private String country;
    private ArrayList<Course> courses;
    private String email;

    public User(String name, int age, String country, ArrayList<Course> courses) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.courses = courses;
    }
}

