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
    private RecyclerView recyclerView;
    private courseAdapter courseAdapter;

    private DatabaseReference courseReference = FirebaseDatabase.getInstance().getReference("courses");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_path);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        courseAdapter = new courseAdapter(courseReference);

        recyclerView.setAdapter(courseAdapter);



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        courseAdapter.cleanup();
    }

}
