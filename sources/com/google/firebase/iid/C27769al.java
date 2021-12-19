package com.google.firebase.iid;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25619a;
import com.google.android.gms.p1940d.AbstractC25631h;

/* renamed from: com.google.firebase.iid.al */
final /* synthetic */ class C27769al implements AbstractC25619a {

    /* renamed from: a */
    private final C27766aj f65246a;

    /* renamed from: b */
    private final Bundle f65247b;

    static {
        Covode.recordClassIndex(33357);
    }

    C27769al(C27766aj ajVar, Bundle bundle) {
        this.f65246a = ajVar;
        this.f65247b = bundle;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25619a
    /* renamed from: a */
    public final Object mo41863a(AbstractC25631h hVar) {
        C27766aj ajVar = this.f65246a;
        Bundle bundle = this.f65247b;
        if (hVar.mo41882b() && C27766aj.m55523b((Bundle) hVar.mo41886d())) {
            return ajVar.mo46422c(bundle).mo41876a(C27791g.f65294a, C27772ao.f65252a);
        }
        return hVar;
    }
}
