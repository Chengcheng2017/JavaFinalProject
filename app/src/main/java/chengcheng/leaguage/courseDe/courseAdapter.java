package chengcheng.leaguage.courseDe;



import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

import chengcheng.leaguage.Course;
import chengcheng.leaguage.R;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class courseAdapter extends FirebaseRecyclerAdapter<Course, courseViewHolder> {

    public courseAdapter(Query ref) {
        super(Course.class, R.layout.course_card_view, courseViewHolder.class, ref);
    }

    @Override
    protected void populateViewHolder(courseViewHolder viewHolder, Course course, int position) {
        viewHolder.bind(course);
    }
}

