package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.C25632i;
import com.google.firebase.installations.C27818a;
import com.google.firebase.installations.p2016a.AbstractC27825d;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.installations.j */
public final class C27849j implements AbstractC27853m {

    /* renamed from: a */
    private final C27854n f65423a;

    /* renamed from: b */
    private final C25632i<AbstractC27850k> f65424b;

    static {
        Covode.recordClassIndex(33438);
    }

    @Override // com.google.firebase.installations.AbstractC27853m
    /* renamed from: a */
    public final boolean mo46549a(AbstractC27825d dVar) {
        if (!dVar.mo46508i() || C27854n.m55758a(dVar)) {
            return false;
        }
        this.f65424b.mo41894a(new C27818a.C27819a().mo46481a(dVar.mo46486c()).mo46480a(dVar.mo46488e()).mo46483b(dVar.mo46490f()).mo46482a());
        return true;
    }

    public C27849j(C27854n nVar, C25632i<AbstractC27850k> iVar) {
        this.f65423a = nVar;
        this.f65424b = iVar;
    }

    @Override // com.google.firebase.installations.AbstractC27853m
    /* renamed from: a */
    public final boolean mo46550a(AbstractC27825d dVar, Exception exc) {
        if (!dVar.mo46509j() && !dVar.mo46511l() && !dVar.mo46510k()) {
            return false;
        }
        this.f65424b.mo41895b(exc);
        return true;
    }
}
