package com.bytedance.android.live.publicscreen.impl.p399e;

import android.text.TextUtils;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.publicscreen.impl.api.PublicScreenApi;
import com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.n */
final /* synthetic */ class C5962n implements AbstractC89171a {

    /* renamed from: a */
    private final C5953h f14949a;

    /* renamed from: b */
    private final AbstractC6017f f14950b;

    /* renamed from: c */
    private final AbstractC5877k f14951c;

    static {
        Covode.recordClassIndex(6570);
    }

    C5962n(C5953h hVar, AbstractC6017f fVar, AbstractC5877k kVar) {
        this.f14949a = hVar;
        this.f14950b = fVar;
        this.f14951c = kVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        C6501b a;
        String charSequence;
        C5953h hVar = this.f14949a;
        AbstractC6017f fVar = this.f14950b;
        long E = this.f14951c.mo11704E();
        if (!(hVar.f14930m == null || hVar.f14930m.f14755l == null)) {
            String str = "anchor";
            String str2 = "user_type";
            if (fVar.mo11878s()) {
                fVar.mo11875a(false);
                hVar.mo11836c(fVar);
                C6501b a2 = C6501b.C6502a.m13948a("livesdk_undo_translate_comment").mo12643a(hVar.f14930m.f14755l);
                if (!hVar.f14930m.f14752i) {
                    str = "user";
                }
                a = a2.mo12651a(str2, str);
                str2 = "click_icon";
                str = "undo_translate";
            } else if (!TextUtils.isEmpty(fVar.mo11879t())) {
                fVar.mo11875a(true);
                hVar.mo11836c(fVar);
                a = C6501b.C6502a.m13948a("livesdk_translate_comment_click").mo12643a(hVar.f14930m.f14755l);
                if (!hVar.f14930m.f14752i) {
                    str = "user";
                }
            } else if (!fVar.mo11877c()) {
                fVar.mo11876b(true);
                hVar.mo11836c(fVar);
                PublicScreenApi publicScreenApi = (PublicScreenApi) C5805e.m12718a().mo11572a(PublicScreenApi.class);
                if (fVar.mo11880u() == null) {
                    charSequence = "";
                } else {
                    charSequence = fVar.mo11880u().toString();
                }
                ((AbstractC11181z) publicScreenApi.translateComment(charSequence, hVar.f14930m.f14746c).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143274a(C11152e.m19790a(hVar.f14930m.f14748e))).mo17950a(new C5963o(hVar, fVar, E), new C5964p(hVar, fVar, E));
                C6501b a3 = C6501b.C6502a.m13948a("livesdk_translate_comment_click").mo12643a(hVar.f14930m.f14755l);
                if (!hVar.f14930m.f14752i) {
                    str = "user";
                }
                a3.mo12651a(str2, str).mo12646a("to_user_id", E).mo12655b();
            }
            a.mo12651a(str2, str).mo12646a("to_user_id", E).mo12655b();
        }
        return C89391z.f203057a;
    }
}
