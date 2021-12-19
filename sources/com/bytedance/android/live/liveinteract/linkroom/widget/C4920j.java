package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.api.p261b.C4415e;
import com.bytedance.android.live.liveinteract.api.p261b.C4417f;
import com.bytedance.android.live.liveinteract.linkroom.p290b.C4866a;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.j */
final /* synthetic */ class C4920j implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12879a;

    static {
        Covode.recordClassIndex(5503);
    }

    C4920j(LinkControlWidget linkControlWidget) {
        this.f12879a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f12879a;
        EnumC4949c cVar = (EnumC4949c) obj;
        C3854a.m9453a(3, "LinkControlWidget", "Match state: " + cVar.name());
        if (linkControlWidget.f12839m == null || !linkControlWidget.f12839m.equals(cVar)) {
            linkControlWidget.f12839m = cVar;
            int i = LinkControlWidget.C49013.f12853a[cVar.ordinal()];
            if (i == 1) {
                linkControlWidget.dataChannel.mo28320c(C4417f.class, new C4415e(C4415e.f12010g));
                C4866a.m11011a(C4415e.f12010g);
            } else if (i == 2 || i == 3) {
                linkControlWidget.dataChannel.mo28320c(C4417f.class, new C4415e(C4415e.f12007d));
                C4866a.m11011a(C4415e.f12007d);
            } else if (i == 4) {
                linkControlWidget.dataChannel.mo28320c(C4417f.class, new C4415e(C4415e.f12009f));
                C4866a.m11011a(C4415e.f12009f);
            } else if (i == 5) {
                linkControlWidget.dataChannel.mo28320c(C4417f.class, new C4415e(C4415e.f12011h));
                C4866a.m11011a(C4415e.f12011h);
            }
        }
        return C89391z.f203057a;
    }
}
