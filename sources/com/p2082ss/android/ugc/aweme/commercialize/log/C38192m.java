package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.m */
public final /* synthetic */ class C38192m implements AbstractC89183m {

    /* renamed from: a */
    private final AwemeRawAd f90233a;

    static {
        Covode.recordClassIndex(45671);
    }

    public C38192m(AwemeRawAd awemeRawAd) {
        this.f90233a = awemeRawAd;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        AwemeRawAd awemeRawAd = this.f90233a;
        C38182f.C38184b bVar = (C38182f.C38184b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.mo66498b(awemeRawAd) : bVar.mo66489a(awemeRawAd);
    }
}
