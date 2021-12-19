package com.kakao.util.helper;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Locale;

public class SystemInfo {
    private static final String DEVICE_MODEL = Build.MODEL.replaceAll("\\s", "-").toUpperCase(Locale.ROOT);
    private static String KA_HEADER;
    private static final int OS_VERSION = Build.VERSION.SDK_INT;

    public static String getKAHeader() {
        return KA_HEADER;
    }

    static {
        Covode.recordClassIndex(34062);
    }

    public static synchronized void initialize(Context context) {
        String str;
        synchronized (SystemInfo.class) {
            MethodCollector.m26663i(6063);
            if (KA_HEADER == null) {
                try {
                    str = ("sdk/1.30.1 os/android-" + OS_VERSION + " lang/" + Locale.getDefault().getLanguage().toLowerCase(Locale.ROOT) + "-" + Locale.getDefault().getCountry().toUpperCase(Locale.ROOT) + " origin/" + Utility.getKeyHash(context) + " device/" + DEVICE_MODEL + " android_pkg/" + context.getPackageName()) + " app_ver/" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                KA_HEADER = str;
            }
            MethodCollector.m26664o(6063);
        }
    }
}
