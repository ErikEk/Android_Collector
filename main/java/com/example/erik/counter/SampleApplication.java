package com.example.erik.counter;

import android.app.Application;
import android.content.Context;

import com.crrepa.ble.CRPBleClient;

public class SampleApplication extends Application {

    private CRPBleClient mBleClient;

    public static CRPBleClient getBleClient(Context context) {
        SampleApplication application = (SampleApplication) context.getApplicationContext();
        return application.mBleClient;
    }

    @Override
    public void onCreate() {
        System.out.print("Hello");
        super.onCreate();
        mBleClient = CRPBleClient.create(this);
    }
}
