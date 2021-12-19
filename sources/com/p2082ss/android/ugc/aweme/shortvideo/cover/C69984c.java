package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.c */
final /* synthetic */ class C69984c implements AbstractC89172b {

    /* renamed from: a */
    private final C69980b f156431a;

    static {
        Covode.recordClassIndex(82398);
    }

    C69984c(C69980b bVar) {
        this.f156431a = bVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C69980b bVar = this.f156431a;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            if (bool.booleanValue()) {
                bVar.f156406d.setVisibility(4);
            } else {
                bVar.f156406d.setVisibility(0);
            }
        }
        return C89391z.f203057a;
    }
}
