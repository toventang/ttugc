package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65397cj;
import com.p2082ss.android.ugc.aweme.services.IPreloadVESo;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.g */
public final /* synthetic */ class C74017g implements AbstractC89171a {

    /* renamed from: a */
    private final IPreloadVESo f166133a;

    static {
        Covode.recordClassIndex(86767);
    }

    C74017g(IPreloadVESo iPreloadVESo) {
        this.f166133a = iPreloadVESo;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        return new C84425b().mo129407a("ab_load_ve_sdk", C65397cj.m117097a()).mo129403a("status_load_ve_sdk", this.f166133a.getPreLoadVESoStatus().toStatusCode()).f188764a;
    }
}
