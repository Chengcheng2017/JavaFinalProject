package chengcheng.leaguage;

import java.util.ArrayList;

/**
 * Created by chengchengwang on 4/8/17.
 */

public class Course {
    private String name;
    private String intro;
    private int imageId;

    public Course(String name, String intro, int imageId) {
        this.name = name;
        this.intro = intro;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getIntro() {
        return intro;
    }

    public int getImageId() {
        return imageId;
    }
}
