package com.bytedance.android.live.publicscreen.impl.p399e;

import android.text.TextUtils;
import com.bytedance.android.live.network.model.C5820b;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.p */
final /* synthetic */ class C5964p implements AbstractC88433f {

    /* renamed from: a */
    private final C5953h f14955a;

    /* renamed from: b */
    private final AbstractC6017f f14956b;

    /* renamed from: c */
    private final long f14957c;

    static {
        Covode.recordClassIndex(6572);
    }

    C5964p(C5953h hVar, AbstractC6017f fVar, long j) {
        this.f14955a = hVar;
        this.f14956b = fVar;
        this.f14957c = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C5953h hVar = this.f14955a;
        AbstractC6017f fVar = this.f14956b;
        long j = this.f14957c;
        Throwable th = (Throwable) obj;
        fVar.mo11876b(false);
        fVar.mo11875a(true);
        hVar.mo11836c(fVar);
        if (th instanceof C5820b) {
            C2912a aVar = (C2912a) th;
            if (!TextUtils.isEmpty(aVar.getPrompt())) {
                C6501b.C6502a.m13948a("livesdk_translate_comment").mo12643a(hVar.f14930m.f14755l).mo12651a("user_type", hVar.f14930m.f14752i ? "anchor" : "user").mo12646a("to_user_id", j).mo12651a("translation_failed_reason", aVar.getPrompt()).mo12651a("translation_succeed", "0").mo12655b();
            }
        }
    }
}
