package chengcheng.leaguage.LearningP;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class TabPagerAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Purchased";
            case 1:
                return "Wish List";
        }
        return null;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view;
        switch (position) {
            case 0:
                view = new coursePurchased(container.getContext());
                break;
            case 1:
                view = new courseWished(container.getContext());
                break;
            default:
                view = new View(container.getContext());
        }
        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
