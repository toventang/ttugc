package com.bytedance.android.live.publicscreen.impl.p397d.p398a;

import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveAudienceIntroSetting;
import com.bytedance.android.livesdk.model.message.C9620at;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.d.a.d */
public final class C5941d implements AbstractC5859b<C9620at> {
    static {
        Covode.recordClassIndex(6549);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5859b
    /* renamed from: a */
    public final /* synthetic */ boolean mo10373a(C9620at atVar, C5889g gVar) {
        C89219l.m154721d(atVar, "");
        C89219l.m154721d(gVar, "");
        if (!BroadcastLiveAudienceIntroSetting.INSTANCE.disable() || C11279p.m20029f()) {
            return false;
        }
        return true;
    }
}
