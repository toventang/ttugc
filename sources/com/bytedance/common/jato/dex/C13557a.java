package com.bytedance.common.jato.dex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.p903b.C13532b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.common.jato.dex.a */
public final class C13557a {

    /* renamed from: a */
    private static int f32987a;

    /* renamed from: b */
    private static int f32988b;

    /* renamed from: c */
    private static volatile boolean f32989c;

    static {
        Covode.recordClassIndex(15571);
    }

    /* renamed from: a */
    public static void m24357a() {
        if (!f32989c) {
            Jato.getListener().mo21786a("none_class_verify fail", new IllegalStateException("not init"));
        } else if (Build.VERSION.SDK_INT >= 21) {
            int verifyNone = DexTricksNativeHolder.verifyNone(f32988b, f32987a);
            if (verifyNone != 0) {
                Jato.getListener().mo21786a("none_class_verify disable fail", new IllegalStateException("result: ".concat(String.valueOf(verifyNone))));
            }
        } else if (Build.VERSION.SDK_INT != 19 || C13532b.m24311c()) {
            Jato.getListener().mo21785a("none_class_verify fail because Android OS version not support");
        } else {
            int dvmVerifyNone = DexTricksNativeHolder.dvmVerifyNone();
            if (dvmVerifyNone != 0) {
                Jato.getListener().mo21786a("none_class_verify disable fail", new IllegalStateException("result: ".concat(String.valueOf(dvmVerifyNone))));
            }
        }
    }

    /* renamed from: b */
    public static void m24359b() {
        if (!f32989c) {
            Jato.getListener().mo21786a("none_class_verify fail", new IllegalStateException("not init"));
        } else if (Build.VERSION.SDK_INT >= 21) {
            int verifyEnable = DexTricksNativeHolder.verifyEnable();
            if (verifyEnable != 0) {
                Jato.getListener().mo21786a("none_class_verify enable fail", new IllegalStateException("result: ".concat(String.valueOf(verifyEnable))));
            }
        } else if (Build.VERSION.SDK_INT != 19 || C13532b.m24311c()) {
            Jato.getListener().mo21785a("none_class_verify fail because Android OS version not support");
        } else {
            int dvmVerifyEnable = DexTricksNativeHolder.dvmVerifyEnable();
            if (dvmVerifyEnable != 0) {
                Jato.getListener().mo21786a("none_class_verify disable fail", new IllegalStateException("result: ".concat(String.valueOf(dvmVerifyEnable))));
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m24358a(Context context) {
        synchronized (C13557a.class) {
            MethodCollector.m26663i(10976);
            if (!C13532b.m24310b()) {
                if (!C13532b.m24309a()) {
                    if (f32989c) {
                        MethodCollector.m26664o(10976);
                        return;
                    }
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    f32987a = Build.VERSION.SDK_INT;
                    f32988b = applicationInfo.targetSdkVersion;
                    f32989c = true;
                    MethodCollector.m26664o(10976);
                    return;
                }
            }
            f32989c = false;
            MethodCollector.m26664o(10976);
        }
    }
}
