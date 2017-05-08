package chengcheng.leaguage.LearningP;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import chengcheng.leaguage.R;

public class LearningPath extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_path);

        viewPager=(ViewPager)findViewById(R.id.viewPager);
        tabLayout=(TabLayout)findViewById(R.id.tabs);

        viewPager.setAdapter(new TabPagerAdapter());
        tabLayout.setupWithViewPager(viewPager);

   }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
