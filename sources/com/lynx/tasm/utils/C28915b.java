package com.lynx.tasm.utils;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.utils.b */
public final class C28915b {

    /* renamed from: a */
    private static boolean f68340a;

    /* renamed from: b */
    private static boolean f68341b;

    /* renamed from: c */
    private static Typeface f68342c;

    /* renamed from: d */
    private static boolean f68343d;

    static {
        Covode.recordClassIndex(35043);
    }

    /* renamed from: c */
    public static boolean m57917c() {
        return "HUAWEI".equals(Build.MANUFACTURER);
    }

    /* renamed from: a */
    public static synchronized boolean m57915a() {
        boolean z;
        synchronized (C28915b.class) {
            MethodCollector.m26663i(3948);
            if (!f68340a) {
                try {
                    if (Class.forName("miui.os.Build") != null) {
                        f68341b = true;
                    }
                } catch (Exception unused) {
                }
                f68340a = true;
            }
            z = f68341b;
            MethodCollector.m26664o(3948);
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized Typeface m57916b() {
        synchronized (C28915b.class) {
            MethodCollector.m26663i(4023);
            if (!m57915a()) {
                MethodCollector.m26664o(4023);
                return null;
            } else if (f68343d) {
                Typeface typeface = f68342c;
                MethodCollector.m26664o(4023);
                return typeface;
            } else {
                try {
                    TextPaint paint = new TextView(LynxEnv.m56706b().f66634a).getPaint();
                    if (paint != null) {
                        f68342c = paint.getTypeface();
                    }
                } catch (Exception unused) {
                    LLog.m56862d("Lynx", "get default typeface failed");
                }
                f68343d = true;
                Typeface typeface2 = f68342c;
                MethodCollector.m26664o(4023);
                return typeface2;
            }
        }
    }
}
