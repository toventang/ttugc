package com.p2082ss.android.ugc.aweme.account.login.p2260e;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32852d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.account.login.e.g */
public final /* synthetic */ class C31916g implements AbstractC25626c {

    /* renamed from: a */
    private final C31915f f76262a;

    static {
        Covode.recordClassIndex(38660);
    }

    C31916g(C31915f fVar) {
        this.f76262a = fVar;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25626c
    /* renamed from: a */
    public final void mo36732a(AbstractC25631h hVar) {
        C31915f fVar = this.f76262a;
        if (!hVar.mo41882b()) {
            C31915f.m66287a("Failed to start SMS Retriever, exception: " + (hVar.mo41887e() != null ? C32852d.m67445a(hVar.mo41887e()) : ""), fVar.f76256c, fVar.f76257d);
        } else if (!C31915f.f76254a) {
        }
    }
}
