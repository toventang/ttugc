package com.p2082ss.android.ugc.aweme.commerce.p2505a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.AbstractC37445b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commerce.a.c */
public final /* synthetic */ class C37467c implements AbstractC37445b {

    /* renamed from: a */
    private final Aweme f88452a;

    static {
        Covode.recordClassIndex(44852);
    }

    C37467c(Aweme aweme) {
        this.f88452a = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.AbstractC37445b
    /* renamed from: a */
    public final void mo65158a() {
        Aweme aweme = this.f88452a;
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            C18129a.m33746a("draw_ad", "viewable_2s", aweme.getAwemeRawAd()).mo28897a("is_piv", 1).mo28901b();
        }
    }
}
