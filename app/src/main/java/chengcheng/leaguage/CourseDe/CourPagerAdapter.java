package chengcheng.leaguage.CourseDe;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import chengcheng.leaguage.LearningP.coursePurchased;
import chengcheng.leaguage.LearningP.courseWished;

/**
 * Created by chengchengwang on 4/29/17.
 */

public class CourPagerAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Intro";
            case 1:
                return "Content";
            case 2:
                return "Discuss";
        }
        return null;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view;
        switch (position){
            case 0:
                view = new detailsIntro(container.getContext());
                break;
            case 1:
                view = new detailsContent(container.getContext());
                break;
            case 2:
                view = new detailsDiscuss(container.getContext());
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
