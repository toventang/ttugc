package com.p2082ss.android.ugc.aweme.awemeservice.p2353a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2000b.AbstractC27340m;
import com.google.p1998c.p2000b.C27341n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.i */
public final /* synthetic */ class C34286i implements AbstractC27340m {

    /* renamed from: a */
    private final C34283g f81070a;

    static {
        Covode.recordClassIndex(41227);
    }

    C34286i(C34283g gVar) {
        this.f81070a = gVar;
    }

    @Override // com.google.p1998c.p2000b.AbstractC27340m
    /* renamed from: a */
    public final void mo45365a(C27341n nVar) {
        C34283g gVar = this.f81070a;
        if (nVar.getValue() != null) {
            gVar.mo60708a((String) nVar.getKey(), (Aweme) nVar.getValue());
        }
    }
}
