package chengcheng.leaguage;

import java.util.ArrayList;

/**
 * Created by chengchengwang on 4/8/17.
 */

public class Course {
    public String name;
    public String intro;
    public int imageId;

    public Course() {
    }

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
