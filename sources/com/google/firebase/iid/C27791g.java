package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.p1939a.ThreadFactoryC25597b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.g */
public final class C27791g {

    /* renamed from: a */
    static final Executor f65294a = ExecutorC27792h.f65295a;

    static {
        Covode.recordClassIndex(33379);
    }

    /* renamed from: a */
    static ExecutorService m55574a() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC25597b("firebase-iid-executor"));
    }
}
