package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.e */
final /* synthetic */ class RunnableC85461e implements Runnable {

    /* renamed from: a */
    private final C85410d f191395a;

    /* renamed from: b */
    private final int f191396b;

    /* renamed from: c */
    private final int f191397c;

    /* renamed from: d */
    private final boolean f191398d;

    static {
        Covode.recordClassIndex(99582);
    }

    RunnableC85461e(C85410d dVar, int i, int i2, boolean z) {
        this.f191395a = dVar;
        this.f191396b = i;
        this.f191397c = i2;
        this.f191398d = z;
    }

    public final void run() {
        C85410d dVar = this.f191395a;
        int i = this.f191396b;
        int i2 = this.f191397c;
        boolean z = this.f191398d;
        if (dVar.f191269u != 2) {
            C85315al.m146642d(C85410d.f191200a, "startPlayTrack in state:" + dVar.f191269u);
            return;
        }
        C85315al.m146637a(C85410d.f191200a, "startPlayTrack trackIndex " + i + " trackType " + i2 + " loop " + z);
        dVar.mo131026c(dVar.mo131024c(true));
        dVar.f191251c.mo53296b(dVar.f191461S, dVar.mo131024c(true), dVar);
        dVar.f191204C = false;
        dVar.f191251c.mo53221a(z, 0, true);
    }
}
