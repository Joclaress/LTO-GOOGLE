package Traffic_page;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.ltorerviewerexam.MainActivity;
import com.example.ltorerviewerexam.R;
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

public class TrafficSignsMain extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private boolean euConsent = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_signs);




        Button Reviewertraffics = (Button) findViewById(R.id.Review); // creating a CardView and assigning a value.
        Reviewertraffics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TrafficSignsMain.this , reviewertraffic.class);
                startActivity(intent);

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(TrafficSignsMain.this);
                } else {
                    Log.d("AdMob", "The interstitial ad wasn't ready yet.");
                }
            }

        });

        RelativeLayout Reviewertraffic = (RelativeLayout) findViewById(R.id.Reviews); // creating a CardView and assigning a value.
        Reviewertraffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TrafficSignsMain.this , reviewertraffic.class);
                startActivity(intent);

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(TrafficSignsMain.this);
                } else {
                    Log.d("AdMob", "The interstitial ad wasn't ready yet.");
                }
            }

        });


        Button Examtraffic = (Button) findViewById(R.id.Exams); // creating a CardView and assigning a value.
        Examtraffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TrafficSignsMain.this , Examtraffic.class);
                startActivity(intent);

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(TrafficSignsMain.this);
                } else {
                    Log.d("AdMob", "The interstitial ad wasn't ready yet.");
                }
            }
        });


        RelativeLayout Examtraffics = (RelativeLayout) findViewById(R.id.Exam); // creating a CardView and assigning a value.
        Examtraffics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( TrafficSignsMain.this , Examtraffic.class);
                startActivity(intent);

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(TrafficSignsMain.this);
                } else {
                    Log.d("AdMob", "The interstitial ad wasn't ready yet.");
                }
            }
        });


        ImageView imgbac = (ImageView) findViewById(R.id.backimg);
        imgbac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
// adds banner
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                if(euConsent) {
                    // User consetred
                    createInterstitial();
                }else{
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
    private void createIntersitialiezed( AdRequest adRequest){

        InterstitialAd.load(this,"ca-app-pub-4394473472808077/8595288002", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
                Log.i("AdMob", "onAdLoaded");

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
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
