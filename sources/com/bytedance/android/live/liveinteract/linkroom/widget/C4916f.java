package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.linkroom.p291c.C4870b;
import com.bytedance.android.live.liveinteract.linkroom.widget.C4905ac;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.f */
final /* synthetic */ class C4916f implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12875a;

    static {
        Covode.recordClassIndex(5499);
    }

    C4916f(LinkControlWidget linkControlWidget) {
        this.f12875a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f12875a;
        Runnable runnable = (Runnable) obj;
        if (linkControlWidget.f12831e && LinkEntranceExperiment.INSTANCE.getValue() && (linkControlWidget.f12835i instanceof C4870b)) {
            C4905ac.m11131a(((C4870b) linkControlWidget.f12835i).f12728c.f12804c, new RunnableC4931u(linkControlWidget), C4905ac.EnumC4907b.MULTIGUEST);
        }
        runnable.run();
        C4905ac.m11132a(C4905ac.EnumC4906a.COHOST);
        return C89391z.f203057a;
    }
}
