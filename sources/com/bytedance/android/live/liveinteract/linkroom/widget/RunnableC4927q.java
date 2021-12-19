package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.q */
public final /* synthetic */ class RunnableC4927q implements Runnable {

    /* renamed from: a */
    private final LinkControlWidget f12886a;

    static {
        Covode.recordClassIndex(5510);
    }

    RunnableC4927q(LinkControlWidget linkControlWidget) {
        this.f12886a = linkControlWidget;
    }

    public final void run() {
        EnumC5847l.INTERACTION_PK.unload(this.f12886a.dataChannel);
    }
}
