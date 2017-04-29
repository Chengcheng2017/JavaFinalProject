package chengcheng.leaguage.Homep;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import chengcheng.leaguage.R;

public class HomePage extends AppCompatActivity {

    private ViewPager mViewPager;
    private ViewPager mViewPager1;
    private ViewPager mViewPager2;
    private List<View> mViewList = new ArrayList<View>();
    private List<View> mViewList1 = new ArrayList<View>();
    private List<View> mViewList2 = new ArrayList<View>();
    private LayoutInflater mInflater;
    private View view_01, view_02, view_03, view_04, view_05, view_06, view_07, view_08, view_09;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        initViews();
    }

    private void initViews() {
        mInflater = getLayoutInflater();
        view_01 = mInflater.inflate(R.layout.homepage_layout1, null);
        view_02 = mInflater.inflate(R.layout.homepage_layout2, null);
        view_03 = mInflater.inflate(R.layout.homepage_layout3, null);
        view_04 = mInflater.inflate(R.layout.hp2_layout1, null);
        view_05 = mInflater.inflate(R.layout.hp2_layout2, null);
        view_06 = mInflater.inflate(R.layout.hp2_layout3, null);
        view_07 = mInflater.inflate(R.layout.hp3_layout1, null);
        view_08 = mInflater.inflate(R.layout.hp3_layout2, null);
        view_09 = mInflater.inflate(R.layout.hp2_layout3, null);


        mViewList.add(view_01);
        mViewList.add(view_02);
        mViewList.add(view_03);

        mViewList1.add(view_04);
        mViewList1.add(view_05);
        mViewList1.add(view_06);

        mViewList2.add(view_07);
        mViewList2.add(view_08);
        mViewList2.add(view_09);


        mViewPager = (ViewPager) findViewById(R.id.viewPager_course);
        mViewPager.setAdapter(new MyPagerAdapter());
        mViewPager.setCurrentItem(0);

        mViewPager1 = (ViewPager) findViewById(R.id.viewPager_interested);
        mViewPager1.setAdapter(new MyPagerAdapter());
        mViewPager1.setCurrentItem(0);

        mViewPager2 = (ViewPager) findViewById(R.id.viewPager_popular);
        mViewPager2.setAdapter(new MyPagerAdapter());
        mViewPager2.setCurrentItem(0);
    }

    class MyPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            if (container == mViewPager) {
                container.addView(mViewList.get(position), 0);
                return mViewList.get(position);
            } else if (container == mViewPager1) {
                container.addView(mViewList1.get(position), 0);
                return mViewList1.get(position);
            } else if (container == mViewPager2) {
                container.addView(mViewList2.get(position), 0);
                return mViewList2.get(position);
            } else return null;
        }


    }
}



