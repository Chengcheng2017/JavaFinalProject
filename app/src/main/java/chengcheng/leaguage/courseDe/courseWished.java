package chengcheng.leaguage.courseDe;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import chengcheng.leaguage.R;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class courseWished extends FrameLayout {
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

    public courseWished(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init(){
        inflate(getContext(), R.layout.course_wish_list,this);
    }
}
