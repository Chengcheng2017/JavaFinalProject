package chengcheng.leaguage.CourseDe;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import chengcheng.leaguage.R;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class detailsIntro extends FrameLayout {
    public detailsIntro(Context context) {
        super(context);
        init();
    }

    public detailsIntro(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public detailsIntro(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(21)
    public detailsIntro(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
    public void init(){
        inflate(getContext(), R.layout.course_details_intro,this);
    }
}
