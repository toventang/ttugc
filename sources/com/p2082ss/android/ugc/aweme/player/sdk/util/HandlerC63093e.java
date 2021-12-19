package com.p2082ss.android.ugc.aweme.player.sdk.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.util.e */
public final class HandlerC63093e extends Handler {

    /* renamed from: a */
    private final Object f143397a = new Object();

    /* renamed from: b */
    private final List<Runnable> f143398b = new ArrayList();

    /* renamed from: c */
    private final Runnable f143399c = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.player.sdk.util.HandlerC63093e.RunnableC630941 */

        static {
            Covode.recordClassIndex(73934);
        }

        public final void run() {
            Runnable a = HandlerC63093e.this.mo101243a();
            if (a != null) {
                a.run();
            }
        }
    };

    static {
        Covode.recordClassIndex(73933);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Runnable mo101243a() {
        Runnable runnable;
        MethodCollector.m26663i(11511);
        synchronized (this.f143397a) {
            try {
                if (!this.f143398b.isEmpty()) {
                    runnable = this.f143398b.remove(0);
                } else {
                    runnable = null;
                }
            } finally {
                MethodCollector.m26664o(11511);
            }
        }
        return runnable;
    }

    public HandlerC63093e(Looper looper) {
        super(looper);
    }

    /* renamed from: b */
    private void m114027b(Runnable runnable) {
        MethodCollector.m26663i(11354);
        synchronized (this.f143397a) {
            try {
                this.f143398b.add(runnable);
            } finally {
                MethodCollector.m26664o(11354);
            }
        }
    }

    /* renamed from: a */
    public final void mo101244a(Runnable runnable) {
        if (runnable != null) {
            m114027b(runnable);
            Message obtain = Message.obtain(this, this.f143399c);
            if (C84191b.m144795v() && Build.VERSION.SDK_INT >= 22) {
                obtain.setAsynchronous(true);
            }
            sendMessageAtFrontOfQueue(obtain);
        }
    }
}
