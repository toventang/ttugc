package com.bytedance.android.live.liveinteract.cohost.widget;

import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e;
import com.bytedance.android.live.liveinteract.platform.p367b.AbstractC5663a;
import com.bytedance.android.live.liveinteract.platform.p368c.C5668c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.Client;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.a */
final /* synthetic */ class C4812a implements AbstractC89172b {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12663a;

    static {
        Covode.recordClassIndex(5394);
    }

    C4812a(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12663a = linkCrossRoomWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f12663a;
        C4566e eVar = linkCrossRoomWidget.f12643g;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!eVar.f12178f.mo11453b()) {
            eVar.f12176d.f11942ae = booleanValue;
            C5668c cVar = eVar.f12178f;
            String str = eVar.f12176d.f11923M;
            C89219l.m154721d(str, "");
            AbstractC5663a aVar = cVar.f14402i;
            if (aVar == null) {
                C89219l.m154710a("mLinkLogger");
            }
            aVar.mo11443a().mo10319d(str);
            Client client = cVar.f14400g;
            if (client != null) {
                client.muteRemoteAudioStream(str, booleanValue);
            }
            eVar.f12178f.mo11456d();
            if (linkCrossRoomWidget.f12647k != null) {
                linkCrossRoomWidget.f12647k.mo10826c();
            }
        }
        return C89391z.f203057a;
    }
}
