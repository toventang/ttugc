package com.p2082ss.android.ugc.aweme.awemeservice.p2353a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2000b.AbstractC27340m;
import com.google.p1998c.p2000b.C27341n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.h */
public final /* synthetic */ class C34285h implements AbstractC27340m {

    /* renamed from: a */
    private final C34283g f81069a;

    static {
        Covode.recordClassIndex(41226);
    }

    C34285h(C34283g gVar) {
        this.f81069a = gVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.b.b<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.p1998c.p2000b.AbstractC27340m
    /* renamed from: a */
    public final void mo45365a(C27341n nVar) {
        C34283g gVar = this.f81069a;
        gVar.f81061a.mo45356a((String) nVar.getKey(), (Aweme) nVar.getValue());
        gVar.mo60708a((String) nVar.getKey(), (Aweme) nVar.getValue());
    }
}
