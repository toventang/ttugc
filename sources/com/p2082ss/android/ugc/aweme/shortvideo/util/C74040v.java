package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.v */
public final class C74040v {

    /* renamed from: a */
    public static final C74040v f166186a = new C74040v();

    /* renamed from: b */
    private static HandlerThread f166187b;

    private C74040v() {
    }

    /* renamed from: a */
    public static final Looper m130196a() {
        Looper looper = f166187b.getLooper();
        C89219l.m154716b(looper, "");
        return looper;
    }

    static {
        Covode.recordClassIndex(86792);
        HandlerThread handlerThread = new HandlerThread("AVUtilThread");
        f166187b = handlerThread;
        handlerThread.start();
    }
}
