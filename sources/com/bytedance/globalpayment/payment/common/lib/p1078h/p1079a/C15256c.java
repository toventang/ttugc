package com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15271c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.h.a.c */
public final class C15256c implements AbstractC15271c {

    /* renamed from: a */
    private final Executor f37255a;

    /* renamed from: b */
    private final Executor f37256b = new ExecutorC15257a((byte) 0);

    static {
        Covode.recordClassIndex(17456);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15271c
    /* renamed from: a */
    public final Executor mo24720a() {
        return this.f37256b;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15271c
    /* renamed from: b */
    public final Executor mo24721b() {
        return this.f37255a;
    }

    /* renamed from: com.bytedance.globalpayment.payment.common.lib.h.a.c$a */
    static class ExecutorC15257a implements Executor {

        /* renamed from: a */
        private Handler f37257a;

        static {
            Covode.recordClassIndex(17457);
        }

        private ExecutorC15257a() {
            this.f37257a = new Handler(Looper.getMainLooper());
        }

        /* synthetic */ ExecutorC15257a(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            this.f37257a.post(runnable);
        }
    }

    public C15256c() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 3;
        this.f37255a = C40780g.m82242a(a.mo70028a());
    }
}
