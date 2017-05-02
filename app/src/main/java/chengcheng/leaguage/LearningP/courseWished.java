package chengcheng.leaguage.LearningP;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import chengcheng.leaguage.R;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class courseWished extends FrameLayout {
    private DatabaseReference courseReference = FirebaseDatabase.getInstance().getReference("course");

    private RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    private courseAdapter courseAdapter  = new courseAdapter(courseReference);

    public courseWished(Context context) {
        super(context);
        init();
    }

    public courseWished(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public courseWished(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(21)
    public courseWished(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init() {
        inflate(getContext(), R.layout.course_wish_list, this);
        //recyclerView.setAdapter(courseAdapter);
    }
}
