package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ab */
public final /* synthetic */ class C38155ab implements AbstractC89183m {

    /* renamed from: a */
    private final Aweme f90129a;

    static {
        Covode.recordClassIndex(45634);
    }

    C38155ab(Aweme aweme) {
        this.f90129a = aweme;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        Aweme aweme = this.f90129a;
        C38182f.C38184b bVar = (C38182f.C38184b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.mo66497b(aweme) : bVar.mo66488a(aweme);
    }
}
