package com.p2082ss.android.medialib.p2156c;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.medialib.c.a */
public class C29993a {

    /* renamed from: a */
    private static final String f71579a = C29993a.class.getSimpleName();

    static {
        Covode.recordClassIndex(36445);
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m60538a(Context context) {
        int i = 256;
        int i2 = 44100;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                packageManager.hasSystemFeature("android.hardware.audio.low_latency");
                packageManager.hasSystemFeature("android.hardware.audio.pro");
            }
            int i3 = Build.VERSION.SDK_INT;
            AudioManager audioManager = (AudioManager) m60539a(context, DataType.AUDIO);
            i2 = m60537a(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), 44100);
            i = m60537a(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), 256);
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: a */
    private static int m60537a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    private static Object m60539a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(331);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(331);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
