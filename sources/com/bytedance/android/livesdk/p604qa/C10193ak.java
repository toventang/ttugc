package com.bytedance.android.livesdk.p604qa;

import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.livesdk.model.message.C9678bk;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.ak */
public final class C10193ak implements AbstractC5859b<C9678bk> {
    static {
        Covode.recordClassIndex(11759);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5859b
    /* renamed from: a */
    public final /* synthetic */ boolean mo10373a(C9678bk bkVar, C5889g gVar) {
        C89219l.m154721d(bkVar, "");
        C89219l.m154721d(gVar, "");
        if (!C5762c.m12632a(gVar.f14755l)) {
            return true;
        }
        if (!gVar.f14752i) {
            return false;
        }
        EnumC5847l.QUESTION.showRedDot(gVar.f14755l);
        return false;
    }
}
