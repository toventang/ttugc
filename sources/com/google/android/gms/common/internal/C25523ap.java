package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.p1938c.C25500c;

/* renamed from: com.google.android.gms.common.internal.ap */
public final class C25523ap {

    /* renamed from: a */
    public static String f60537a;

    /* renamed from: b */
    public static int f60538b;

    /* renamed from: c */
    private static Object f60539c = new Object();

    /* renamed from: d */
    private static boolean f60540d;

    static {
        Covode.recordClassIndex(30926);
    }

    /* renamed from: a */
    public static void m49217a(Context context) {
        MethodCollector.m26663i(9451);
        synchronized (f60539c) {
            try {
                if (!f60540d) {
                    f60540d = true;
                    try {
                        Bundle bundle = C25500c.f60481a.mo41741a(context).mo41737a(context.getPackageName(), 128).metaData;
                        if (bundle == null) {
                            MethodCollector.m26664o(9451);
                            return;
                        }
                        f60537a = bundle.getString("com.google.app.id");
                        f60538b = bundle.getInt("com.google.android.gms.version");
                        MethodCollector.m26664o(9451);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                }
            } finally {
                MethodCollector.m26664o(9451);
            }
        }
    }
}
