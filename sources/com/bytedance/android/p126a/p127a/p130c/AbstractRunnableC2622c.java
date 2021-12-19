package com.bytedance.android.p126a.p127a.p130c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.a.a.c.c */
public abstract class AbstractRunnableC2622c implements Runnable {

    /* renamed from: a */
    private static final AtomicInteger f7871a = new AtomicInteger(1);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7116a();

    AbstractRunnableC2622c() {
    }

    public final void run() {
        try {
            mo7116a();
        } catch (Throwable unused) {
        }
    }

    static {
        Covode.recordClassIndex(3010);
    }
}
