package com.bytedance.android.live.p408u;

import androidx.core.p033d.C0649c;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchDogStopDelayDurationSetting;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.u.f */
public final class C6201f {

    /* renamed from: a */
    public static final C6201f f15473a = new C6201f();

    /* renamed from: b */
    private static final Object f15474b = new Object();

    private C6201f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.u.f$a */
    public static final class RunnableC6202a implements Runnable {

        /* renamed from: a */
        public static final RunnableC6202a f15475a = new RunnableC6202a();

        static {
            Covode.recordClassIndex(6908);
        }

        RunnableC6202a() {
        }

        public final void run() {
            C6195b.m13446a().mo12108d();
        }
    }

    static {
        Covode.recordClassIndex(6907);
    }

    /* renamed from: a */
    public static final void m13458a() {
        if (C6203g.m13464a() || C6204h.m13480b()) {
            C6195b.m13446a().mo12106b();
            C6195b.m13446a().mo12107c();
        }
    }

    /* renamed from: b */
    public static final void m13459b() {
        if (C6203g.m13464a() || C6204h.m13480b()) {
            C0649c.m2386a(C3940j.m9594a(), RunnableC6202a.f15475a, f15474b, LiveWatchDogStopDelayDurationSetting.INSTANCE.getValue());
        }
    }

    /* renamed from: c */
    public static final void m13460c() {
        if (C6203g.m13464a() || C6204h.m13480b()) {
            C3940j.m9594a().removeCallbacksAndMessages(f15474b);
            C6195b.m13446a().mo12108d();
        }
    }
}
