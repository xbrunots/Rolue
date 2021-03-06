package com.devbruno.superfit.presentation.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.devbruno.superfit.R;
import com.devbruno.superfit.infraestruture.Constants;
import com.devbruno.superfit.presentation.BaseActivity;


public class HomeActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
        setContentView(R.layout.activity_main);
        if (!hasCurrentFragment(R.id.frame_contaner)) {
            setCurrentFragment(R.id.frame_contaner,
                    HomeFragment.newInstance(Constants.HOME_TITLE));
        }
    }
}
