package com.p2082ss.android.ugc.aweme.p2725d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C41479dh;

/* renamed from: com.ss.android.ugc.aweme.d.a */
public final class C40909a {

    /* renamed from: a */
    public static final Handler f95720a;

    /* renamed from: b */
    static final C41479dh f95721b = new C41479dh();

    /* renamed from: c */
    public static final C40909a f95722c = new C40909a();

    /* renamed from: d */
    private static final HandlerThread f95723d;

    private C40909a() {
    }

    static {
        Covode.recordClassIndex(48761);
        HandlerThread handlerThread = new HandlerThread("AsyncInflateHandler");
        f95723d = handlerThread;
        handlerThread.start();
        f95720a = new Handler(handlerThread.getLooper());
        Process.setThreadPriority(handlerThread.getThreadId(), -20);
    }
}
