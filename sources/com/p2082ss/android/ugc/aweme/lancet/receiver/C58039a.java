package com.p2082ss.android.ugc.aweme.lancet.receiver;

import android.content.ContextWrapper;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.lancet.receiver.a */
public class C58039a {

    /* renamed from: a */
    private static volatile boolean f132269a;

    static {
        Covode.recordClassIndex(68075);
    }

    /* renamed from: a */
    public static void m104863a(ContextWrapper contextWrapper) {
        MethodCollector.m26663i(13074);
        if (Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 23) {
            synchronized (C58039a.class) {
                try {
                    if (!f132269a) {
                        f132269a = true;
                        try {
                            Field declaredField = Class.forName("android.app.ContextImpl").getDeclaredField("mPackageInfo");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(contextWrapper.getBaseContext());
                            Field declaredField2 = Class.forName("android.app.LoadedApk").getDeclaredField("mReceiverResource");
                            declaredField2.setAccessible(true);
                            declaredField2.set(obj, null);
                        } catch (Exception unused) {
                        }
                        MethodCollector.m26664o(13074);
                    }
                } finally {
                    MethodCollector.m26664o(13074);
                }
            }
        } else {
            MethodCollector.m26664o(13074);
        }
    }
}
