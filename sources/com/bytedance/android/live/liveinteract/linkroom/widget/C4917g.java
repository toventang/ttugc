package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5485d;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.g */
final /* synthetic */ class C4917g implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12876a;

    static {
        Covode.recordClassIndex(5500);
    }

    C4917g(LinkControlWidget linkControlWidget) {
        this.f12876a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f12876a;
        C5485d dVar = (C5485d) obj;
        C4384b.C4385a.m10496a().f11949al = dVar.f14056a;
        if (linkControlWidget.f12831e && dVar.f14057b.equals("close_link")) {
            if (dVar.f14056a) {
                linkControlWidget.f12829c = linkControlWidget.f12832f.mo10142a(4);
            } else if (linkControlWidget.f12829c != null) {
                linkControlWidget.f12832f.mo10143a(linkControlWidget.f12829c);
            }
        }
        return C89391z.f203057a;
    }
}
