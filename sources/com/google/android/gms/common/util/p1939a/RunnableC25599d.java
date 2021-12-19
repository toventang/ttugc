package com.google.android.gms.common.util.p1939a;

import android.os.Process;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.util.a.d */
final class RunnableC25599d implements Runnable {

    /* renamed from: a */
    private final Runnable f60712a;

    /* renamed from: b */
    private final int f60713b = 0;

    static {
        Covode.recordClassIndex(31009);
    }

    public final void run() {
        Process.setThreadPriority(this.f60713b);
        this.f60712a.run();
    }

    public RunnableC25599d(Runnable runnable) {
        this.f60712a = runnable;
    }
}
