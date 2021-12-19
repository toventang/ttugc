package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.ab */
final /* synthetic */ class RunnableC72753ab implements Runnable {

    /* renamed from: a */
    private final VEListener.AbstractC85241j f163128a;

    /* renamed from: b */
    private final int f163129b;

    static {
        Covode.recordClassIndex(85439);
    }

    RunnableC72753ab(VEListener.AbstractC85241j jVar, int i) {
        this.f163128a = jVar;
        this.f163129b = i;
    }

    public final void run() {
        this.f163128a.mo56563a(this.f163129b);
    }
}
