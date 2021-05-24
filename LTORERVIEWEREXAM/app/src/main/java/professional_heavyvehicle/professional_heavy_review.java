package professional_heavyvehicle;

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

import Professional_page.proreview;

public class professional_heavy_review extends AppCompatActivity {
    private ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_review);


        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        //preparing list of images from drawable

        List<reviewerslider> sliderItem = new ArrayList<>();
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide1));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide2));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide3));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide4));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide5));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide6));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide7));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide8));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide9));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide10));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide11));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide12));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide13));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide14));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide15));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide16));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide17));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide18));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide19));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide20));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide21));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide22));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide23));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide24));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide25));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide26));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide27));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide28));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide29));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide30));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide31));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide32));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide33));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide34));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide35));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide36));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide37));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide38));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide39));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide40));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide41));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide42));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide43));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide44));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide45));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide46));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide47));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide48));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide49));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide50));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide51));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide52));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide53));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide54));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide55));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide56));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide57));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide58));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide59));
        sliderItem.add(new reviewerslider(R.drawable.proheavyslide60));



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