package com.example.ltorerviewerexam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import Professional_page.Professional;
import Tagalog_page.MainTagalogRev;
import Traffic_page.Examtraffic;
import Traffic_page.TrafficSignsMain;
import Nonpro_page.Nonpro;
import professional_heavyvehicle.Main_professional_Heavy;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private boolean euConsent = false;
    SliderView sliderView;
    int[] images = {R.drawable.slider1, R.drawable.slider2, R.drawable.slider3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView card_view1 = (CardView) findViewById(R.id.cardtraffic);

        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TrafficSignsMain.class);
                startActivity(i);
            }
        });

        CardView card_view2 = (CardView) findViewById(R.id.cardtagalog); // creating a CardView and assigning a value.

        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainTagalogRev.class);
                startActivity(i);
            }
        });

        CardView card_view3 = (CardView) findViewById(R.id.cardnonpro); // creating a CardView and assigning a value.

        card_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Nonpro.class);
                startActivity(i);
            }
        });

        CardView card_view4 = (CardView) findViewById(R.id.cardpro); // creating a CardView and assigning a value.

        card_view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Professional.class);
                startActivity(i);
            }
        });


        CardView card_view5 = (CardView) findViewById(R.id.cardproheavy); // creating a CardView and assigning a value.

        card_view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main_professional_Heavy.class);
                startActivity(i);
            }
        });

        CardView card_view6 = (CardView) findViewById(R.id.NewFees); // creating a CardView and assigning a value.

        card_view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Registrationfees.class);
                startActivity(intent);

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Log.d("AdMob", "The interstitial ad wasn't ready yet.");
                }
            }
        });

        CardView card_view7 = (CardView) findViewById(R.id.penalties); // creating a CardView and assigning a value.

        card_view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Penalties.class);
                startActivity(intent);

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Log.d("AdMob", "The interstitial ad wasn't ready yet.");
                }
            }
        });

        ImageView copywrites = (ImageView) findViewById(R.id.copywrite); // creating a CardView and assigning a value.

        copywrites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Copywrite_page.class);
                startActivity(i);
            }
        });


        //slider
   /*     ImageSlider imageSlider = findViewById(R.id.image_slider);

        List<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.slider1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.slider2, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.slider3, ScaleTypes.FIT));

        imageSlider.setImageList(imageList,ScaleTypes.FIT);
*/
        sliderView = findViewById(R.id.image_slider);

        SliderAdaptermain sliderAdapter = new SliderAdaptermain(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        /* ADDS */

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                if (euConsent) {
                    // User consetred
                    createInterstitial();
                } else {
                    //User is not in eu
                    createNonInterstitial();
                }
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }

    // adds interstial
    private void createInterstitial() {
        Log.d("AdMob", "Personalized Ad request");
        AdRequest adRequest = new AdRequest.Builder().build();
        createIntersitialiezed(adRequest);
    }

    private void createNonInterstitial() {
        Bundle networkExtrasBundle = new Bundle();
        networkExtrasBundle.putInt("rdp", 1);
        AdRequest adRequest = new AdRequest.Builder()
                .addNetworkExtrasBundle(AdMobAdapter.class, networkExtrasBundle)
                .build();
        createIntersitialiezed(adRequest);
    }

    private void createIntersitialiezed(AdRequest adRequest) {

        InterstitialAd.load(this, "ca-app-pub-4394473472808077/6980622308", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
                Log.i("AdMob", "onAdLoaded");

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        Log.d("AdMob", "The ad was dismissed.");
                        createInterstitial();
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.d("AdMob", "The ad failed to show.");
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        // Called when fullscreen content is shown.
                        // Make sure to set your reference to null so you don't
                        // show it a second time.
                        mInterstitialAd = null;
                        Log.d("AdMob", "The ad was shown.");
                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                Log.i("AdMob", loadAdError.getMessage());
                mInterstitialAd = null;
            }
        });


    }
}