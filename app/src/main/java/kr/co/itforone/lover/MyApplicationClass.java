package kr.co.itforone.lover;

import android.app.Application;
import android.os.Build;

import com.igaworks.v2.core.application.AbxActivityHelper;
import com.igaworks.v2.core.application.AbxActivityLifecycleCallbacks;

public class MyApplicationClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        AbxActivityHelper.initializeSdk(MyApplicationClass.this, "your_adbrix_remastered_app_key", "your_adbrix_remastered_secret_key");

        if (Build.VERSION.SDK_INT >= 14) {
            registerActivityLifecycleCallbacks(new AbxActivityLifecycleCallbacks());
        }
    }
}
