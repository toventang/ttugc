package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.m */
final /* synthetic */ class C4923m implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12882a;

    static {
        Covode.recordClassIndex(5506);
    }

    C4923m(LinkControlWidget linkControlWidget) {
        this.f12882a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f12882a;
        C4384b.C4385a.m10496a().f11932V = (String) obj;
        linkControlWidget.mo10637c(false);
        return C89391z.f203057a;
    }
}
