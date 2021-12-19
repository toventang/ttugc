package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.o */
public final /* synthetic */ class RunnableC4925o implements Runnable {

    /* renamed from: a */
    private final LinkControlWidget f12884a;

    static {
        Covode.recordClassIndex(5508);
    }

    RunnableC4925o(LinkControlWidget linkControlWidget) {
        this.f12884a = linkControlWidget;
    }

    public final void run() {
        EnumC5847l.INTERACTION_PK.unload(this.f12884a.dataChannel);
    }
}
