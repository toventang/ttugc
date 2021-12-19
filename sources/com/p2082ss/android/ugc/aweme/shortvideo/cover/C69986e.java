package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.e */
final /* synthetic */ class C69986e implements AbstractC89172b {

    /* renamed from: a */
    private final C69980b f156433a;

    /* renamed from: b */
    private final AbstractC89172b f156434b;

    static {
        Covode.recordClassIndex(82400);
    }

    C69986e(C69980b bVar, AbstractC89172b bVar2) {
        this.f156433a = bVar;
        this.f156434b = bVar2;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C69980b bVar = this.f156433a;
        AbstractC89172b bVar2 = this.f156434b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            if (bVar.f156420r != null) {
                bVar.f156420r.dismiss();
            }
            bVar.f156413k.removeCallbacksAndMessages(null);
            bVar.f156414l.mo110437b().setValue(C88296t.m153437b());
            bVar.f156414l.mo110436a().mo56311a(false);
            bVar.f156414l.mo110437b().setValue(C88296t.m153435a());
            if (bVar.getFragmentManager() != null) {
                bVar.requireFragmentManager().mo3552a().mo3455a(bVar).mo3473c();
                if (bVar2 != null) {
                    bVar2.invoke(true);
                }
            } else if (bVar2 != null) {
                bVar2.invoke(false);
            }
        }
        return C89391z.f203057a;
    }
}
