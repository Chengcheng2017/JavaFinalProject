package chengcheng.leaguage;

import java.util.ArrayList;

/**
 * Created by chengchengwang on 4/8/17.
 */

public class Course {
    public String name;
    public String learned;
    public String imageId;
    private String price;

    public Course() {
    }

    public Course(String name, String learned, String imageId, String price) {
        this.name = name;
        this.learned = learned;
        this.imageId = imageId;
        this.price = price;
    }
}
