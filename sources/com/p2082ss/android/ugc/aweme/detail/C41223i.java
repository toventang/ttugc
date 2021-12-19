package com.p2082ss.android.ugc.aweme.detail;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.detail.i */
public final class C41223i {

    /* renamed from: a */
    public static boolean f96336a;

    /* renamed from: b */
    public static Handler f96337b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public static final C41223i f96338c = new C41223i();

    private C41223i() {
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.i$a */
    public static final class RunnableC41224a implements Runnable {

        /* renamed from: a */
        public static final RunnableC41224a f96339a = new RunnableC41224a();

        static {
            Covode.recordClassIndex(49107);
        }

        RunnableC41224a() {
        }

        public final void run() {
            C41223i.m83093a(false);
        }
    }

    static {
        Covode.recordClassIndex(49106);
    }

    /* renamed from: a */
    public static void m83093a(boolean z) {
        if (z) {
            f96337b.removeCallbacksAndMessages(null);
        }
        f96336a = z;
    }
}
