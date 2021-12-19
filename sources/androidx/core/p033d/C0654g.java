package androidx.core.p033d;

import android.os.Build;
import android.os.Trace;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* renamed from: androidx.core.d.g */
public final class C0654g {

    /* renamed from: a */
    private static long f2649a;

    /* renamed from: b */
    private static Method f2650b;

    /* renamed from: c */
    private static Method f2651c;

    /* renamed from: d */
    private static Method f2652d;

    /* renamed from: e */
    private static Method f2653e;

    /* renamed from: a */
    public static void m2390a() {
        int i = Build.VERSION.SDK_INT;
        Trace.endSection();
    }

    static {
        Covode.recordClassIndex(733);
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2649a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2650b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                f2651c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                f2652d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                f2653e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m2391a(String str) {
        int i = Build.VERSION.SDK_INT;
        Trace.beginSection(str);
    }
}
