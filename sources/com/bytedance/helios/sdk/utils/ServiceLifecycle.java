package com.bytedance.helios.sdk.utils;

import android.app.Service;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;

public class ServiceLifecycle {
    static {
        Covode.recordClassIndex(17730);
    }

    public static void onStartCommand(Service service, Intent intent, int i, int i2) {
        C15346a.m28243a(service, new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, 102701, service.getClass().getName());
    }
}
