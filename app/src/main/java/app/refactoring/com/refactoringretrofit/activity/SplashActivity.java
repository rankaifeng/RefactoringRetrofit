package app.refactoring.com.refactoringretrofit.activity;

import android.annotation.SuppressLint;
import android.content.Intent;

import app.refactoring.com.refactoringretrofit.R;
import app.refactoring.com.refactoringretrofit.base.BaseActivity;

/**
 * unknown at 2018/6/14
 */

@SuppressLint("Registered")
public class SplashActivity extends BaseActivity {
    @Override
    protected void initView() {
        getWindow().getDecorView().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this,
                    MainActivity.class));
            finish();
        }, 3000);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.app_start;
    }
}
