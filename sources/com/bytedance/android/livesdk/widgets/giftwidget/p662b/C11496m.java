package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.C8972i;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.m */
final /* synthetic */ class C11496m implements AbstractC88433f {

    /* renamed from: a */
    private final C11483b f27569a;

    static {
        Covode.recordClassIndex(13155);
    }

    C11496m(C11483b bVar) {
        this.f27569a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C11483b bVar = this.f27569a;
        C8972i iVar = (C8972i) obj;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        boolean booleanValue = ((Boolean) bVar.f27546a.mo28318b(C9076co.class)).booleanValue();
        if ((room == null || !(room.getStreamType() == EnumC11728i.THIRD_PARTY || C10890a.m19496b() == C10890a.EnumC10891a.LINK_MIC_ANCHOR || C10890a.m19496b() == C10890a.EnumC10891a.LINK_MIC_PK)) && booleanValue && iVar.f22082a != null) {
            bVar.f27547b.mo18277a(iVar.f22082a.intValue() + C3966y.m9653a(16.0f));
        }
    }
}
