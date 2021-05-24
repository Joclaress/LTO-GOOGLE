package Traffic_page;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.example.ltorerviewerexam.R;
import com.example.ltorerviewerexam.SlideerAdapterreview;
import com.example.ltorerviewerexam.reviewerslider;

import java.util.ArrayList;
import java.util.List;

import Tagalog_page.Reviewertagalog;

public class reviewertraffic extends AppCompatActivity {
    private ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewertraffic);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        //preparing list of images from drawable

        List<reviewerslider> sliderItem = new ArrayList<>();
        sliderItem.add(new reviewerslider(R.drawable.trafficsign1));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign2));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign3));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign4));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign5));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign6));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign7));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign8));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign9));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign10));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign11));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign12));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign13));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign14));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign15));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign16));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign17));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign18));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign19));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign20));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign21));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign22));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign23));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign24));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign25));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign26));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign27));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign28));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign29));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign30));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign31));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign32));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign33));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign34));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign35));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign36));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign37));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign38));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign39));
        sliderItem.add(new reviewerslider(R.drawable.trafficsign40));
        

        viewPager2.setAdapter(new SlideerAdapterreview(sliderItem, viewPager2));

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });
        viewPager2.setPageTransformer(compositePageTransformer);

    }
    }
