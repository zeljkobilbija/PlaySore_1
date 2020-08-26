package com.interfacemockup.kalendar;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.huawei.hms.aaid.HmsInstanceId;

public class DemoHmsMessageService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    HmsInstanceId instanceId;

}
