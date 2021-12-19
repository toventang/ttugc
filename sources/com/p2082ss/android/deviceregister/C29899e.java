package com.p2082ss.android.deviceregister;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.deviceregister.e */
public final class C29899e {

    /* renamed from: a */
    final SharedPreferences f71336a;

    /* renamed from: b */
    final PackageManager f71337b;

    /* renamed from: c */
    final ComponentName f71338c;

    /* renamed from: d */
    public final boolean f71339d;

    static {
        Covode.recordClassIndex(36309);
    }

    /* renamed from: a */
    private static String m60269a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "STATE_DISABLED" : "STATE_ENABLED" : "STATE_DEFAULT";
    }

    C29899e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        boolean z = false;
        SharedPreferences a = C34822d.m71158a(applicationContext, "device_register_migrate_detector", 0);
        this.f71336a = a;
        PackageManager packageManager = applicationContext.getPackageManager();
        this.f71337b = packageManager;
        ComponentName componentName = new ComponentName(context, AActivity.class);
        this.f71338c = componentName;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        int i = a.getInt("component_state", 0);
        m60269a(componentEnabledSetting);
        m60269a(i);
        if (componentEnabledSetting == 0 && i == 2) {
            z = true;
        }
        this.f71339d = z;
    }
}
