package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.p261b.C4415e;
import com.bytedance.android.live.liveinteract.api.p261b.C4417f;
import com.bytedance.android.live.liveinteract.linkroom.p290b.C4866a;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.i */
final /* synthetic */ class C4919i implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12878a;

    static {
        Covode.recordClassIndex(5502);
    }

    C4919i(LinkControlWidget linkControlWidget) {
        this.f12878a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f12878a;
        EnumC4440k kVar = (EnumC4440k) obj;
        C3854a.m9453a(3, "LinkControlWidget", "co-host state: " + kVar.name());
        if (linkControlWidget.f12838l == null || kVar.getState() != linkControlWidget.f12838l.getState()) {
            linkControlWidget.f12838l = kVar;
            switch (LinkControlWidget.C49013.f12854b[kVar.ordinal()]) {
                case 1:
                case 2:
                    linkControlWidget.dataChannel.mo28320c(C4417f.class, new C4415e(C4415e.f12005b));
                    C4866a.m11011a(C4415e.f12005b);
                    break;
                case 3:
                case 4:
                    linkControlWidget.dataChannel.mo28320c(C4417f.class, new C4415e(C4415e.f12008e));
                    C4866a.m11011a(C4415e.f12008e);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    linkControlWidget.dataChannel.mo28320c(C4417f.class, new C4415e(C4415e.f12007d));
                    C4866a.m11011a(C4415e.f12007d);
                    break;
            }
        }
        return C89391z.f203057a;
    }
}
