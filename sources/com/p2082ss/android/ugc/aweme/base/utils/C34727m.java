package com.p2082ss.android.ugc.aweme.base.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;

/* renamed from: com.ss.android.ugc.aweme.base.utils.m */
public final class C34727m {

    /* renamed from: a */
    private static SoftReference<Handler> f82016a;

    static {
        Covode.recordClassIndex(41719);
    }

    /* renamed from: a */
    public static Handler m70943a() {
        Handler handler;
        SoftReference<Handler> softReference = f82016a;
        if (softReference != null && (handler = softReference.get()) != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        f82016a = new SoftReference<>(handler2);
        return handler2;
    }

    /* renamed from: a */
    public static void m70944a(Runnable runnable) {
        m70943a().post(runnable);
    }

    /* renamed from: a */
    public static void m70945a(Runnable runnable, long j) {
        m70943a().postDelayed(runnable, j);
    }
}
