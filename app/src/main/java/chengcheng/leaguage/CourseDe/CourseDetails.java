package chengcheng.leaguage.CourseDe;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import chengcheng.leaguage.LearningP.LearningPath;
import chengcheng.leaguage.LearningP.TabPagerAdapter;
import chengcheng.leaguage.R;

public class CourseDetails extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private TextView lesson;
    private Button joinCo;

    private FirebaseAuth auth = FirebaseAuth.getInstance();
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference userRef = database.getReference("user");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        viewPager=(ViewPager)findViewById(R.id.course_viewPager);
        tabLayout=(TabLayout)findViewById(R.id.course_tabs);

        viewPager.setAdapter(new CourPagerAdapter());
        tabLayout.setupWithViewPager(viewPager);

        lesson = (TextView) findViewById(R.id.course_lesson1);

        joinCo = (Button) findViewById(R.id.joinCourse);
        joinCo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseUser user = auth.getCurrentUser();
                String id = user.getUid();

                Intent intent = new Intent(CourseDetails.this, LearningPath.class);
                startActivity(intent);
            }
        });
    }

//    public void c_display(){
//        String url = "https://www.youtube.com";
//        Intent i = new Intent(Intent.ACTION_VIEW);
//        i.setData(Uri.parse(url));
//        startActivity(i);
//        }

}
