package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.livesdk.utils.C11278o;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bl */
public final /* synthetic */ class RunnableC7808bl implements Runnable {

    /* renamed from: a */
    private final C7794bg f19375a;

    /* renamed from: b */
    private final long f19376b;

    /* renamed from: c */
    private final int f19377c;

    /* renamed from: d */
    private final int f19378d;

    static {
        Covode.recordClassIndex(8603);
    }

    RunnableC7808bl(C7794bg bgVar, long j, int i, int i2) {
        this.f19375a = bgVar;
        this.f19376b = j;
        this.f19377c = i;
        this.f19378d = i2;
    }

    public final void run() {
        C7794bg bgVar = this.f19375a;
        long j = this.f19376b;
        int i = this.f19377c;
        int i2 = this.f19378d;
        if (bgVar.isResumed() && bgVar.f19336d) {
            C11278o.m19995a(bgVar.getContext(), bgVar.f19343k);
            bgVar.mo14059a(j, i + 1, i2);
        }
    }
}
