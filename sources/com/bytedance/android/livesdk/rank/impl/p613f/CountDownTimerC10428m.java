package com.bytedance.android.livesdk.rank.impl.p613f;

import android.os.CountDownTimer;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.rank.impl.f.m */
public final class CountDownTimerC10428m extends CountDownTimer {

    /* renamed from: a */
    public AbstractC10429a f25141a;

    /* renamed from: com.bytedance.android.livesdk.rank.impl.f.m$a */
    public interface AbstractC10429a {
        static {
            Covode.recordClassIndex(12003);
        }

        /* renamed from: a */
        void mo17288a();

        /* renamed from: a */
        void mo17289a(long j);
    }

    static {
        Covode.recordClassIndex(12002);
    }

    public final void onFinish() {
        AbstractC10429a aVar = this.f25141a;
        if (aVar != null) {
            aVar.mo17288a();
        }
    }

    public CountDownTimerC10428m(long j) {
        super(j, 1000);
    }

    public final void onTick(long j) {
        AbstractC10429a aVar = this.f25141a;
        if (aVar != null) {
            aVar.mo17289a(j);
        }
    }
}
