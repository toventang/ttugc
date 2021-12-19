package com.p2082ss.bytertc.engine.utils;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.base.utils.RtcContextUtils;

/* renamed from: com.ss.bytertc.engine.utils.RTCBuildInfo */
public final class RTCBuildInfo {
    static {
        Covode.recordClassIndex(101157);
    }

    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getBuildType() {
        return Build.TYPE;
    }

    public static String getCpuName() {
        return Build.HARDWARE;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static String getGpuName() {
        return GetDeviceHelper.getGpuName();
    }

    public static int getMemSize() {
        try {
            Context applicationContext = RtcContextUtils.getApplicationContext();
            if (applicationContext == null) {
                return 0;
            }
            return GetDeviceHelper.getTotalMemory(applicationContext);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
