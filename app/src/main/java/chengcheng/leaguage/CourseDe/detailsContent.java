package chengcheng.leaguage.CourseDe;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import chengcheng.leaguage.R;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class detailsContent extends FrameLayout{
    public detailsContent(Context context) {
        super(context);
        init();
    }

    public detailsContent(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public detailsContent(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public detailsContent(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init(){
        inflate(getContext(), R.layout.course_details_content,this);
    }
}
