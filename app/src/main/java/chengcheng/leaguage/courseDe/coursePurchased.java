package chengcheng.leaguage.courseDe;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import chengcheng.leaguage.R;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class coursePurchased extends FrameLayout {
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

    public coursePurchased(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init(){
        inflate(getContext(), R.layout.course_purchased,this);
    }
}
