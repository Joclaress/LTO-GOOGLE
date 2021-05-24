package Nonpro_page;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
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
import java.util.Random;

import Traffic_page.reviewertraffic;

public class nonproreviewer extends AppCompatActivity {

    private ViewPager2 viewPager2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonproreviewer);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        //preparing list of images from drawable

        List<reviewerslider> sliderItem = new ArrayList<>();
        sliderItem.add(new reviewerslider(R.drawable.nonprolight1));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight2));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight3));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight4));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight5));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight6));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight7));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight8));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight9));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight10));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight11));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight12));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight13));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight14));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight15));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight16));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight17));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight18));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight19));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight20));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight21));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight22));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight23));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight24));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight25));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight26));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight27));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight28));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight29));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight30));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight31));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight32));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight33));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight34));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight35));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight36));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight37));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight38));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight39));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight40));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight41));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight42));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight43));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight44));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight45));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight46));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight47));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight48));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight49));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight50));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight51));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight52));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight53));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight54));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight55));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight56));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight57));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight58));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight59));
        sliderItem.add(new reviewerslider(R.drawable.nonprolight60));

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