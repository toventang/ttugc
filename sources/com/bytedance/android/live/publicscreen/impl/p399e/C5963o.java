package com.bytedance.android.live.publicscreen.impl.p399e;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.publicscreen.impl.api.p394a.C5897a;
import com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.o */
final /* synthetic */ class C5963o implements AbstractC88433f {

    /* renamed from: a */
    private final C5953h f14952a;

    /* renamed from: b */
    private final AbstractC6017f f14953b;

    /* renamed from: c */
    private final long f14954c;

    static {
        Covode.recordClassIndex(6571);
    }

    C5963o(C5953h hVar, AbstractC6017f fVar, long j) {
        this.f14952a = hVar;
        this.f14953b = fVar;
        this.f14954c = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C5953h hVar = this.f14952a;
        AbstractC6017f fVar = this.f14953b;
        long j = this.f14954c;
        C5832d dVar = (C5832d) obj;
        if (dVar == null || dVar.data == null) {
            fVar.mo11874a((CharSequence) null);
        } else {
            fVar.mo11874a(((C5897a) dVar.data).f14761a);
            C6501b.C6502a.m13948a("livesdk_translate_comment").mo12643a(hVar.f14930m.f14755l).mo12651a("user_type", hVar.f14930m.f14752i ? "anchor" : "user").mo12651a("translation_succeed", "1").mo12646a("to_user_id", j).mo12655b();
        }
        fVar.mo11876b(false);
        fVar.mo11875a(true);
        hVar.mo11836c(fVar);
    }
}
