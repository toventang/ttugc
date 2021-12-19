package com.airbnb.epoxy;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.epoxy.m */
public final class C1943m {

    /* renamed from: a */
    public static final Handler f5815a = m6167a(Looper.getMainLooper(), false);

    /* renamed from: b */
    public static final Handler f5816b = m6167a(Looper.getMainLooper(), true);

    /* renamed from: c */
    private static Handler f5817c;

    static {
        Covode.recordClassIndex(2134);
    }

    /* renamed from: a */
    public static Handler m6166a() {
        if (f5817c == null) {
            f5817c = m6167a(m6168a("epoxy"), true);
        }
        return f5817c;
    }

    /* renamed from: a */
    private static Looper m6168a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    /* renamed from: a */
    private static Handler m6167a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        int i = Build.VERSION.SDK_INT;
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (Throwable unused) {
            return new Handler(looper);
        }
    }
}
