package com.bytedance.android.livesdk.gifttray.p556c;

import com.bytedance.android.livesdk.gifttray.p556c.C8890c;
import com.bytedance.android.livesdk.service.animation.C10646b;
import com.bytedance.android.livesdk.service.p625c.p628c.C10731d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gifttray.c.h */
final /* synthetic */ class RunnableC8897h implements Runnable {

    /* renamed from: a */
    private final C8890c.C88911 f21940a;

    static {
        Covode.recordClassIndex(9781);
    }

    RunnableC8897h(C8890c.C88911 r1) {
        this.f21940a = r1;
    }

    public final void run() {
        C8890c.C88911 r3 = this.f21940a;
        C10731d.C10732a.C10733a.f25859a.mo17656a(99, Long.valueOf((C8890c.this.f21918c == null || C8890c.this.f21918c.f21861z == null) ? 0 : C8890c.this.f21918c.f21861z.getId()), 1, Long.valueOf(System.currentTimeMillis() - r3.f21930a), 1);
        C8890c.this.f21916a = C10646b.m19206b(C8890c.this, C8890c.this.f21923h);
        C8890c.this.f21916a.start();
    }
}
