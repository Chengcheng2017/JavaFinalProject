package chengcheng.leaguage.LearningP;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import chengcheng.leaguage.R;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class coursePurchased extends FrameLayout {
    private RecyclerView recyclerView1;
    private courseAdapter courseAdapter1;

    private DatabaseReference courseReference = FirebaseDatabase.getInstance().getReference("courses");
    public coursePurchased(Context context) {
        super(context);
        init();
    }

    public coursePurchased(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public coursePurchased(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(21)
    public coursePurchased(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init(){
        inflate(getContext(), R.layout.course_purchased,this);
        recyclerView1 = (RecyclerView) findViewById(R.id.recycler_view_purchased);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        courseAdapter1 = new courseAdapter(courseReference);
        recyclerView1.setAdapter(courseAdapter1);


    }
}
