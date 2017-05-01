package chengcheng.leaguage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import chengcheng.leaguage.Homep.HomePage;

public class Recommendation extends AppCompatActivity {
    private List<Course> courses;
    private CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);
        initialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //courseAdapter = new CourseAdapter(courses, this);
        recyclerView.setAdapter(courseAdapter);
    }


    private void initialData() {
        courses = new ArrayList<>();
        courses.add(new Course("Intro to English", "200", R.drawable.c1));
        courses.add(new Course("Grammar", "100", R.drawable.c3));
    }


    public void skip(View view) {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}

