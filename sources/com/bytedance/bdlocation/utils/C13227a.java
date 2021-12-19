package com.bytedance.bdlocation.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.bdlocation.utils.a */
public final class C13227a {

    /* renamed from: a */
    public static final C13227a f32333a;

    /* renamed from: b */
    public final Executor f32334b;

    /* renamed from: c */
    public final Executor f32335c;

    /* renamed from: d */
    public final Executor f32336d;

    /* renamed from: com.bytedance.bdlocation.utils.a$a */
    static class ExecutorC13228a implements Executor {

        /* renamed from: a */
        private Handler f32337a;

        static {
            Covode.recordClassIndex(15189);
        }

        private ExecutorC13228a() {
            this.f32337a = new Handler(Looper.getMainLooper());
        }

        /* synthetic */ ExecutorC13228a(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            this.f32337a.post(runnable);
        }
    }

    static {
        Covode.recordClassIndex(15188);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        ExecutorService a2 = C40780g.m82242a(a.mo70028a());
        C40787l.C40788a a3 = C40787l.m82269a(EnumC40793o.FIXED);
        a3.f95505c = 3;
        f32333a = new C13227a(a2, C40780g.m82242a(a3.mo70028a()), new ExecutorC13228a((byte) 0));
    }

    private C13227a(Executor executor, Executor executor2, Executor executor3) {
        this.f32334b = executor;
        this.f32335c = executor2;
        this.f32336d = executor3;
    }
}
