package com.bytedance.android.live.publicscreen.impl.p397d.p398a;

import com.bytedance.android.live.publicscreen.impl.p400f.C5967b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.livesdk.model.message.C9595a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.d.a.a */
public final class C5938a implements AbstractC5859b<C9595a> {
    static {
        Covode.recordClassIndex(6546);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5859b
    /* renamed from: a */
    public final /* synthetic */ boolean mo10373a(C9595a aVar, C5889g gVar) {
        C9595a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(gVar, "");
        if (aVar2.f23289g && aVar2.f28134O != null && aVar2.f28134O.f28144j != null) {
            return false;
        }
        C5967b.m13084a(aVar2, "AssetMessage discarded because show_message field is false or displayText field is empty.");
        return true;
    }
}
