package Professional_page;

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

import Traffic_page.reviewertraffic;

public class proreview extends AppCompatActivity {
    private ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proreview);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        //preparing list of images from drawable

        List<reviewerslider> sliderItem = new ArrayList<>();
        sliderItem.add(new reviewerslider(R.drawable.proslide1));
        sliderItem.add(new reviewerslider(R.drawable.proslide2));
        sliderItem.add(new reviewerslider(R.drawable.proslide3));
        sliderItem.add(new reviewerslider(R.drawable.proslide4));
        sliderItem.add(new reviewerslider(R.drawable.proslide5));
        sliderItem.add(new reviewerslider(R.drawable.proslide6));
        sliderItem.add(new reviewerslider(R.drawable.proslide7));
        sliderItem.add(new reviewerslider(R.drawable.proslide8));
        sliderItem.add(new reviewerslider(R.drawable.proslide9));
        sliderItem.add(new reviewerslider(R.drawable.proslide10));
        sliderItem.add(new reviewerslider(R.drawable.proslide11));
        sliderItem.add(new reviewerslider(R.drawable.proslide13));
        sliderItem.add(new reviewerslider(R.drawable.proslide14));
        sliderItem.add(new reviewerslider(R.drawable.proslide15));
        sliderItem.add(new reviewerslider(R.drawable.proslide16));
        sliderItem.add(new reviewerslider(R.drawable.proslide17));
        sliderItem.add(new reviewerslider(R.drawable.proslide18));
        sliderItem.add(new reviewerslider(R.drawable.proslide19));
        sliderItem.add(new reviewerslider(R.drawable.proslide20));
        sliderItem.add(new reviewerslider(R.drawable.proslide21));
        sliderItem.add(new reviewerslider(R.drawable.proslide22));
        sliderItem.add(new reviewerslider(R.drawable.proslide23));
        sliderItem.add(new reviewerslider(R.drawable.proslide24));
        sliderItem.add(new reviewerslider(R.drawable.proslide25));
        sliderItem.add(new reviewerslider(R.drawable.proslide26));
        sliderItem.add(new reviewerslider(R.drawable.proslide27));
        sliderItem.add(new reviewerslider(R.drawable.proslide28));
        sliderItem.add(new reviewerslider(R.drawable.proslide29));
        sliderItem.add(new reviewerslider(R.drawable.proslide30));
        sliderItem.add(new reviewerslider(R.drawable.proslide31));
        sliderItem.add(new reviewerslider(R.drawable.proslide32));
        sliderItem.add(new reviewerslider(R.drawable.proslide33));
        sliderItem.add(new reviewerslider(R.drawable.proslide34));
        sliderItem.add(new reviewerslider(R.drawable.proslide35));
        sliderItem.add(new reviewerslider(R.drawable.proslide36));
        sliderItem.add(new reviewerslider(R.drawable.proslide37));
        sliderItem.add(new reviewerslider(R.drawable.proslide38));
        sliderItem.add(new reviewerslider(R.drawable.proslide39));
        sliderItem.add(new reviewerslider(R.drawable.proslide40));
        sliderItem.add(new reviewerslider(R.drawable.proslide41));
        sliderItem.add(new reviewerslider(R.drawable.proslide42));
        sliderItem.add(new reviewerslider(R.drawable.proslide43));
        sliderItem.add(new reviewerslider(R.drawable.proslide44));
        sliderItem.add(new reviewerslider(R.drawable.proslide45));
        sliderItem.add(new reviewerslider(R.drawable.proslide46));
        sliderItem.add(new reviewerslider(R.drawable.proslide47));
        sliderItem.add(new reviewerslider(R.drawable.proslide48));
        sliderItem.add(new reviewerslider(R.drawable.proslide49));
        sliderItem.add(new reviewerslider(R.drawable.proslide50));
        sliderItem.add(new reviewerslider(R.drawable.proslide51));
        sliderItem.add(new reviewerslider(R.drawable.proslide52));
        sliderItem.add(new reviewerslider(R.drawable.proslide53));
        sliderItem.add(new reviewerslider(R.drawable.proslide54));
        sliderItem.add(new reviewerslider(R.drawable.proslide55));
        sliderItem.add(new reviewerslider(R.drawable.proslide56));
        sliderItem.add(new reviewerslider(R.drawable.proslide57));
        sliderItem.add(new reviewerslider(R.drawable.proslide58));
        sliderItem.add(new reviewerslider(R.drawable.proslide59));
        sliderItem.add(new reviewerslider(R.drawable.proslide60));

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