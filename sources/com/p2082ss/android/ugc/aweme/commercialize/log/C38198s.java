package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.s */
public final /* synthetic */ class C38198s implements AbstractC89183m {

    /* renamed from: a */
    private final Aweme f90241a;

    static {
        Covode.recordClassIndex(45677);
    }

    public C38198s(Aweme aweme) {
        this.f90241a = aweme;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        Aweme aweme = this.f90241a;
        C38182f.C38184b bVar = (C38182f.C38184b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.mo66497b(aweme) : bVar.mo66488a(aweme);
    }
}
