package com.sl1v1k.bartsimpsonsstoy;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends Activity {

    SoundPool mySound;
    SoundPool mySound2;
    SoundPool mySound3;
    int gotohell;
    int kissmyass;
    int shutup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE );
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySound = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        mySound.load(this, R.raw.gotohell, 1);
        gotohell = mySound.load(this, R.raw.gotohell, 1);

        mySound2 = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        mySound2.load(this, R.raw.kissmyass, 1);
        kissmyass = mySound2.load(this, R.raw.kissmyass, 1);

        mySound3 = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        mySound3.load(this, R.raw.shutup, 1);
        shutup = mySound3.load(this, R.raw.shutup, 1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    public void playButtonKissMyAss(View view)
    {
        mySound2.play(kissmyass, 1, 1, 1, 0, 1 );
    }

    public void playButtonShutUp(View view)
    {
        mySound3.play(shutup, 1, 1, 1, 0, 1 );
    }

    public void playButtonGoToHell(View view)
    {
        mySound.play(gotohell, 1, 1, 1, 0, 1 );
    }

}
