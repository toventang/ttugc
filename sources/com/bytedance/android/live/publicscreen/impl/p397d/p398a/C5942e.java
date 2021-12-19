package com.bytedance.android.live.publicscreen.impl.p397d.p398a;

import com.bytedance.android.live.publicscreen.impl.p400f.C5967b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.d.a.e */
public final class C5942e implements AbstractC5859b<C9627ay> {
    static {
        Covode.recordClassIndex(6550);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5859b
    /* renamed from: a */
    public final /* synthetic */ boolean mo10373a(C9627ay ayVar, C5889g gVar) {
        C9627ay ayVar2 = ayVar;
        C89219l.m154721d(ayVar2, "");
        C89219l.m154721d(gVar, "");
        if (ayVar2.f23446h == 1) {
            return false;
        }
        C5967b.m13084a(ayVar2, "MemberMessage discarded because it's not an enter message.");
        return true;
    }
}
