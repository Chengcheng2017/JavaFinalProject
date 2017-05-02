package chengcheng.leaguage;

/**
 * Created by Jing on 5/1/17.
 */

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CourseViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView courseNameText;
    private TextView courseInfoText;
    private ImageView coursePic;
    private Context context;

    public CourseViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.course_card);
        courseNameText = (TextView) itemView.findViewById(R.id.course_name);
        courseInfoText = (TextView) itemView.findViewById(R.id.course_info);
        coursePic = (ImageView) itemView.findViewById(R.id.course_pic);
        this.context = itemView.getContext();
    }

    public void bind(final Course course) {
        courseNameText.setText(course.name);
        courseInfoText.setText(course.learned);
        coursePic.setImageResource(Integer.parseInt(course.imageId));
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, courseNameText.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}