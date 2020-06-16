package videoeditor.bhuvnesh.com.ffmpegvideoeditor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import videoeditor.bhuvnesh.com.ffmpegvideoeditor.R;

public class HomeActivity extends AppCompatActivity {
    CardView btnCompress,btnVideoCut,btnImageExtract,btnAudioExtract,btnFade,btnFast,btnReverse,btnSlow;

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
}
