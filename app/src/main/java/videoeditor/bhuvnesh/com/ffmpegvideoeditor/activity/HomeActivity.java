package videoeditor.bhuvnesh.com.ffmpegvideoeditor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import videoeditor.bhuvnesh.com.ffmpegvideoeditor.R;

public class HomeActivity extends AppCompatActivity {
    CardView btnCompress,btnVideoCut,btnImageExtract,btnAudioExtract,btnFade,btnFast,btnReverse,btnSlow;
    InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnCompress =findViewById(R.id.btnCompressVideo);
        btnVideoCut =findViewById(R.id.btnCutVideo);
        btnImageExtract =findViewById(R.id.btnExtractImage);
        btnAudioExtract =findViewById(R.id.btnExtractAudio);
        btnFade =findViewById(R.id.btnFadeInOut);
        btnFast =findViewById(R.id.btnFastMotion);
        btnSlow =findViewById(R.id.btnSlowMotion);
        btnReverse =findViewById(R.id.btnReverseVideo);
        ads();
        btnCompress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("id","CompressVideo");
                startActivity(intent);
            }
        });
        btnVideoCut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("id","CutVideo");
                startActivity(intent);
            }
        });
        btnImageExtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("id","ExtractImages");
                startActivity(intent);
            }
        });
        btnAudioExtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("id","ExtractAudio");
                startActivity(intent);
            }
        });
        btnFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("id","FadeVideo");
                startActivity(intent);
            }
        });
        btnFast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("id","FastMotion");
                startActivity(intent);
            }
        });
        btnSlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("id","SlowMotion");
                startActivity(intent);
            }
        });
        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("id","ReverseVideo");
                startActivity(intent);
            }
        });




    }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
        super.onBackPressed();
    }

    private void ads() {
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView mAdView = findViewById(R.id.adView);
        mAdView.loadAd(new AdRequest.Builder().build());
        //inter

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }
}
