package chengcheng.leaguage;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    private Spinner lanList;
    private ViewPager viewPager;
    private ImageView[] tips;    //store circle image
    private ImageView[] mImageViews;   //store image
    private int[] imgIdArray;   //store image ID

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        initSpinner();
        initView();

    }

    private void initSpinner() {
        lanList = (Spinner) findViewById(R.id.languageList);
        ArrayList<String> lanName = new ArrayList<>();
        lanName.add("English");
        lanName.add("Spanish");
        lanName.add("French");
        lanName.add("Chinese");
        lanName.add("Japanese");
        lanName.add("German");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HomePage.this, android.R.layout.simple_spinner_item, lanName);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lanList.setAdapter(adapter);
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewGroup group = (ViewGroup) findViewById(R.id.viewGroup);
        imgIdArray = new int[]{R.drawable.image1};
        tips = new ImageView[imgIdArray.length];
        for (int i = 0; i < tips.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new LayoutParams(10, 10));
            tips[i] = imageView;
            if (i == 0) {
                // tips[i].setBackgroundResource(R.drawable.indicator_focused);
            } else {
                tips[i].setBackgroundResource(R.drawable.indicator);
            }

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            layoutParams.leftMargin = 5;
            layoutParams.rightMargin = 5;
            group.addView(imageView, layoutParams);
        }
        mImageViews = new ImageView[imgIdArray.length];
        for (int i = 0; i < mImageViews.length; i++) {
            ImageView imageView = new ImageView(this);
            mImageViews[i] = imageView;
            imageView.setBackgroundResource(imgIdArray[i]);
        }

        viewPager.setAdapter(new MyAdapter());
        viewPager.setCurrentItem((mImageViews.length) * 100);

    }
}

