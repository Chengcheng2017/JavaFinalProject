package chengcheng.leaguage.CourseDe;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chengcheng.leaguage.LearningP.TabPagerAdapter;
import chengcheng.leaguage.R;

public class CourseDetails extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        viewPager=(ViewPager)findViewById(R.id.course_viewPager);
        tabLayout=(TabLayout)findViewById(R.id.course_tabs);

        viewPager.setAdapter(new CourPagerAdapter());
        tabLayout.setupWithViewPager(viewPager);
    }
}
