package chengcheng.leaguage;

import android.support.v4.view.PagerAdapter;
import android.view.View;

public class MyAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

}
