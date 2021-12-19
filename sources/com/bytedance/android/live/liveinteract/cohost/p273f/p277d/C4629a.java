package com.bytedance.android.live.liveinteract.cohost.p273f.p277d;

import com.bytedance.android.live.liveinteract.api.C4393ag;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.livesdk.model.message.C9608ak;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.f.d.a */
public final class C4629a implements AbstractC5859b<C9608ak> {
    static {
        Covode.recordClassIndex(5205);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5859b
    /* renamed from: a */
    public final /* synthetic */ boolean mo10373a(C9608ak akVar, C5889g gVar) {
        Integer num;
        C9608ak akVar2 = akVar;
        C89219l.m154721d(akVar2, "");
        C89219l.m154721d(gVar, "");
        DataChannel dataChannel = gVar.f14755l;
        if (dataChannel != null) {
            num = (Integer) dataChannel.mo28318b(C4393ag.class);
        } else {
            num = null;
        }
        if (num == null || (num.intValue() != 1 && num.intValue() != 3)) {
            return true;
        }
        num.intValue();
        if (akVar2.f23340g == 2) {
            C5713h.m12521a(false, true);
        } else {
            C5713h.m12521a(false, false);
        }
        return false;
    }
}
