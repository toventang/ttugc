package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5277b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.s */
final /* synthetic */ class C4929s implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12888a;

    static {
        Covode.recordClassIndex(5512);
    }

    C4929s(LinkControlWidget linkControlWidget) {
        this.f12888a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C5277b bVar;
        LinkControlWidget linkControlWidget = this.f12888a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (linkControlWidget.f12830d == null) {
            return null;
        }
        linkControlWidget.f12836j = booleanValue;
        linkControlWidget.f12835i.mo10606d(booleanValue);
        if (linkControlWidget.f12836j) {
            linkControlWidget.f12830d.f12689f = true;
            if (C4394ah.m10505a(linkControlWidget.f12833g, 4)) {
                linkControlWidget.mo10638l();
                if (linkControlWidget.f12828b == null) {
                    return null;
                }
                LinkCrossRoomWidget linkCrossRoomWidget = linkControlWidget.f12828b;
                if (linkCrossRoomWidget.f12643g == null) {
                    return null;
                }
                C4566e eVar = linkCrossRoomWidget.f12643g;
                if (eVar.f12174b) {
                    C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.dyy), 0);
                    eVar.mo10305b(210);
                    return null;
                }
                eVar.mo10308b(PrivacyCert.Builder.with("bpea-524").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                return null;
            } else if (!C4394ah.m10505a(linkControlWidget.f12833g, 2)) {
                return null;
            } else {
                linkControlWidget.f12837k = true;
                if (linkControlWidget.f12827a == null || (bVar = linkControlWidget.f12827a.f13849a) == null) {
                    return null;
                }
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dyy);
                bVar.mo11129a(LinkApi.EnumC7285c.MIC_ROOM, PrivacyCert.Builder.Companion.with("bpea-528").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                return null;
            }
        } else {
            linkControlWidget.f12830d.f12689f = false;
            if (!linkControlWidget.f12837k) {
                return null;
            }
            linkControlWidget.f12830d.mo10568a(LinkApi.EnumC7287e.RESTART_AFTER_MIC_ROOM);
            linkControlWidget.f12837k = false;
            return null;
        }
    }
}
