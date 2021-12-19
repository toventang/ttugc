package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.a */
public final /* synthetic */ class C38864a implements AbstractC89183m {

    /* renamed from: a */
    private final AwemeRawAd f91796a;

    static {
        Covode.recordClassIndex(46451);
    }

    C38864a(AwemeRawAd awemeRawAd) {
        this.f91796a = awemeRawAd;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        AwemeRawAd awemeRawAd = this.f91796a;
        C38182f.C38184b bVar = (C38182f.C38184b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.mo66498b(awemeRawAd) : bVar.mo66489a(awemeRawAd);
    }
}
