package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ac */
public final /* synthetic */ class C38156ac implements AbstractC89183m {

    /* renamed from: a */
    private final AwemeRawAd f90130a;

    static {
        Covode.recordClassIndex(45635);
    }

    C38156ac(AwemeRawAd awemeRawAd) {
        this.f90130a = awemeRawAd;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        AwemeRawAd awemeRawAd = this.f90130a;
        C38182f.C38184b bVar = (C38182f.C38184b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.mo66498b(awemeRawAd) : bVar.mo66489a(awemeRawAd);
    }
}
