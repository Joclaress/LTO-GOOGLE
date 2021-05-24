package Tagalog_page;

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

public class Reviewertagalog extends AppCompatActivity {

    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewertagalog);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        //preparing list of images from drawable

        List<reviewerslider> sliderItem = new ArrayList<>();
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide1));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide2));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide3));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide4));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide5));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide6));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide7));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide8));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide9));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide10));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide11));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide12));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide13));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide14));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide15));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide16));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide17));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide18));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide19));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide20));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide21));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide22));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide23));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide24));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide25));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide26));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide27));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide28));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide29));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide30));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide31));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide32));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide33));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide34));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide35));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide36));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide37));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide38));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide39));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide40));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide41));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide42));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide43));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide44));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide45));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide46));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide48));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide49));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide51));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide52));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide53));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide54));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide55));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide56));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide57));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide58));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide59));
        sliderItem.add(new reviewerslider(R.drawable.tagalogslide60));


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
