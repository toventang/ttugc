package com.bytedance.platform.p1572b.p1573a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.p1572b.C21668d;

/* renamed from: com.bytedance.platform.b.a.b */
public final class C21663b {

    /* renamed from: a */
    public static Handler f51413a = new Handler(f51417e.getLooper());

    /* renamed from: b */
    public static boolean f51414b;

    /* renamed from: c */
    public static int f51415c = 10000;

    /* renamed from: d */
    public static int f51416d = 10000;

    /* renamed from: e */
    private static HandlerThread f51417e = C21668d.m40613a("pool-monitor");

    static {
        Covode.recordClassIndex(25304);
    }

    /* renamed from: a */
    public static String m40611a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr == null) {
            return str;
        }
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            str = str + stackTraceElementArr[i].toString() + "\n";
        }
        return str;
    }
}
