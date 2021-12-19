package com.bytedance.android.live.liveinteract.linkroom;

import com.bytedance.android.live.liveinteract.cohost.p273f.p274a.C4624a;
import com.bytedance.android.live.liveinteract.cohost.p273f.p275b.C4625a;
import com.bytedance.android.live.liveinteract.cohost.p273f.p277d.C4629a;
import com.bytedance.android.live.liveinteract.cohost.p273f.p278e.C4630a;
import com.bytedance.android.live.liveinteract.match.p295b.p300e.p301a.C4963a;
import com.bytedance.android.live.liveinteract.match.p305d.p306a.C5011a;
import com.bytedance.android.live.liveinteract.match.p307e.p308a.C5014a;
import com.bytedance.android.live.liveinteract.match.p307e.p309b.C5015a;
import com.bytedance.android.live.liveinteract.multiguest.p327f.p328a.C5204a;
import com.bytedance.android.live.liveinteract.multiguest.p327f.p329b.C5205a;
import com.bytedance.android.live.liveinteract.multiguest.p327f.p331d.C5209a;
import com.bytedance.android.live.liveinteract.multiguest.p327f.p332e.C5210a;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5881a;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5882b;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5883c;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5884d;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e;
import com.bytedance.android.livesdk.model.message.C9608ak;
import com.bytedance.android.livesdk.model.message.C9609al;
import com.bytedance.android.livesdk.model.message.C9615ao;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.b */
public final class C4865b implements AbstractC5885e {
    static {
        Covode.recordClassIndex(5447);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e
    /* renamed from: a */
    public final void mo10595a(AbstractC5881a aVar) {
        C89219l.m154721d(aVar, "");
        aVar.mo11734a(C9615ao.class, new C4963a());
        aVar.mo11734a(C9608ak.class, new C4629a());
        aVar.mo11734a(C9609al.class, new C5209a());
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e
    /* renamed from: a */
    public final void mo10596a(AbstractC5882b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo11735a(EnumC9596a.LINK_MIC_BATTLE_NOTICE.getIntType());
        bVar.mo11735a(EnumC9596a.LINK_CO_HOST_GUIDE.getIntType());
        bVar.mo11735a(EnumC9596a.LINK_AUDIENCE_NOTICE.getIntType());
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e
    /* renamed from: a */
    public final void mo10597a(AbstractC5883c cVar) {
        C89219l.m154721d(cVar, "");
        cVar.mo11736a(C9608ak.class, new C4625a());
        cVar.mo11736a(C9615ao.class, new C5015a());
        cVar.mo11736a(C9609al.class, new C5205a());
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e
    /* renamed from: a */
    public final void mo10598a(AbstractC5884d dVar) {
        C89219l.m154721d(dVar, "");
        dVar.mo11737a(C4630a.class, new C4624a());
        dVar.mo11737a(C5011a.class, new C5014a());
        dVar.mo11737a(C5210a.class, new C5204a());
    }
}
