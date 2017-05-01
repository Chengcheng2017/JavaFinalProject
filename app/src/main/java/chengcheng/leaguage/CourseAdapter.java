package chengcheng.leaguage;

/**
 * Created by Jing on 5/1/17.
 */

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

public class CourseAdapter extends FirebaseRecyclerAdapter<Course, CourseViewHolder> {

    public CourseAdapter(Query ref) {
        super(Course.class, R.layout.course_card_view, CourseViewHolder.class, ref);
    }


    @Override
    protected void populateViewHolder(CourseViewHolder viewHolder, Course course, int position) {
        viewHolder.bind(course);
    }
}
