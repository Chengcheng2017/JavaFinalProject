package chengcheng.leaguage;

import java.util.ArrayList;

/**
 * Created by chengchengwang on 4/8/17.
 */

public class Course {
    private String name;
    private String intro;
    private ArrayList<String> content;

    public Course(String name, String intro, ArrayList<String> content) {
        this.name = name;
        this.intro = intro;
        this.content = content;
    }
}
