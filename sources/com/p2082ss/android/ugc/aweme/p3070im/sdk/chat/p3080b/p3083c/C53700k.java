package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.k */
public final class C53700k {

    /* renamed from: a */
    public static final C53700k f123216a = new C53700k();

    /* renamed from: b */
    private static final Handler f123217b = new Handler(Looper.getMainLooper());

    private C53700k() {
    }

    static {
        Covode.recordClassIndex(63280);
    }

    /* renamed from: a */
    public static final void m98969a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        if (mainLooper.getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f123217b.post(runnable);
        }
    }

    /* renamed from: a */
    public static final void m98970a(Runnable runnable, long j) {
        C89219l.m154721d(runnable, "");
        f123217b.postDelayed(runnable, j);
    }
}
