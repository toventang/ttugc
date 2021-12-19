package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.f */
final /* synthetic */ class RunnableC85463f implements Runnable {

    /* renamed from: a */
    private final C85410d f191400a;

    /* renamed from: b */
    private final int f191401b;

    /* renamed from: c */
    private final int f191402c;

    static {
        Covode.recordClassIndex(99584);
    }

    RunnableC85463f(C85410d dVar, int i, int i2) {
        this.f191400a = dVar;
        this.f191401b = i;
        this.f191402c = i2;
    }

    public final void run() {
        C85410d dVar = this.f191400a;
        int i = this.f191401b;
        int i2 = this.f191402c;
        if (dVar.f191269u != 2) {
            C85315al.m146642d(C85410d.f191200a, "pausePlayTrack in state:" + dVar.f191269u);
            return;
        }
        C85315al.m146637a(C85410d.f191200a, "pausePlayTrack trackIndex " + i + " trackType " + i2);
        dVar.f191251c.mo53361m();
        dVar.f191204C = true;
        dVar.mo130968a(C85310ah.f190921I, i, (float) i2, "");
    }
}
