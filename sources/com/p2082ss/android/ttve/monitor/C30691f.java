package com.p2082ss.android.ttve.monitor;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.monitor.f */
public class C30691f {

    /* renamed from: a */
    static boolean f73399a;

    /* renamed from: b */
    public static List<String> f73400b = new ArrayList<String>() {
        /* class com.p2082ss.android.ttve.monitor.C30691f.C306921 */

        static {
            Covode.recordClassIndex(37262);
        }

        {
            add("os_sdk_int");
            add("external_storage");
            add("screen_height");
            add("screen_width");
            add("storage");
            add("memory");
            add("cpu_core");
            add("cpu_freq");
        }
    };

    /* renamed from: c */
    static String f73401c;

    /* renamed from: d */
    static String f73402d;

    /* renamed from: e */
    static String f73403e;

    /* renamed from: f */
    static String f73404f;

    /* renamed from: g */
    static String f73405g;

    /* renamed from: h */
    static String f73406h;

    /* renamed from: i */
    static String f73407i;

    /* renamed from: j */
    static String f73408j;

    /* renamed from: k */
    static String f73409k;

    /* renamed from: l */
    static String f73410l;

    /* renamed from: m */
    static String f73411m;

    /* renamed from: n */
    static String f73412n;

    /* renamed from: o */
    static String f73413o;

    /* renamed from: p */
    static String f73414p;

    /* renamed from: q */
    private static boolean f73415q;

    static {
        Covode.recordClassIndex(37261);
    }

    /* renamed from: a */
    private static String m63055a() {
        if (Build.VERSION.SDK_INT < 21) {
            return Build.CPU_ABI + "," + Build.CPU_ABI2;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i != strArr.length - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m63056a(Context context) {
        int i;
        MethodCollector.m26663i(415);
        if (!f73415q) {
            synchronized (C30691f.class) {
                try {
                    if (!f73415q) {
                        Context applicationContext = context.getApplicationContext();
                        if (C58003a.f132201c) {
                            if (applicationContext == null) {
                                applicationContext = C58003a.f132199a;
                            }
                        }
                        f73401c = Build.MODEL;
                        f73402d = C30687d.m63042a();
                        f73403e = C30687d.m63045b();
                        f73404f = String.valueOf(C30687d.m63046c());
                        f73405g = String.valueOf(C30687d.m63047d());
                        f73406h = "0";
                        f73407i = "0";
                        f73410l = String.valueOf(Build.VERSION.SDK_INT);
                        if (applicationContext == null) {
                            i = 0;
                        } else {
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            ((WindowManager) C30687d.m63041a(applicationContext, "window")).getDefaultDisplay().getMetrics(displayMetrics);
                            i = displayMetrics.widthPixels;
                        }
                        f73408j = String.valueOf(i);
                        f73409k = String.valueOf(C30687d.m63040a(applicationContext));
                        f73411m = applicationContext.getPackageName();
                        f73412n = m63055a();
                        f73413o = Build.BRAND;
                        f73415q = true;
                    }
                } finally {
                    MethodCollector.m26664o(415);
                }
            }
            return;
        }
        MethodCollector.m26664o(415);
    }
}
