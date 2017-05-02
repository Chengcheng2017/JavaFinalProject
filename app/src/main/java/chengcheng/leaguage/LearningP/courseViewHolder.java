package chengcheng.leaguage.LearningP;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import chengcheng.leaguage.Course;
import chengcheng.leaguage.R;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class courseViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView courseNameView;
    private TextView courseInfoView;
    private ImageView coursePhotoView;
    private Context context;

    public courseViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.course_card);
        courseNameView = (TextView) itemView.findViewById(R.id.course_name);
        courseInfoView = (TextView) itemView.findViewById(R.id.course_info);
        coursePhotoView = (ImageView) itemView.findViewById(R.id.course_pic);
        this.context = context;
    }

    public void bind(final Course course) {
        courseNameView.setText(course.name);
        courseInfoView.setText(course.learned);
        coursePhotoView.setImageResource(Integer.parseInt(course.imageId));
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, courseNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
