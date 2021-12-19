package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.internal.C25446d;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.auth-api.x */
public abstract class AbstractC25702x<R extends AbstractC25485p> extends C25446d.AbstractC25447a<R, C25704z> {
    static {
        Covode.recordClassIndex(31116);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41939a(AbstractC25678ad adVar);

    AbstractC25702x(AbstractC25357i iVar) {
        super(C25253a.f59868d, iVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.auth-api.x<R extends com.google.android.gms.common.api.p> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.C25446d.AbstractC25447a, com.google.android.gms.common.api.internal.C25446d.AbstractC25448b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41419a(Object obj) {
        super.mo41542a((AbstractC25485p) obj);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    @Override // com.google.android.gms.common.api.internal.C25446d.AbstractC25447a
    /* renamed from: a */
    public final /* synthetic */ void mo41418a(C25704z zVar) {
        mo41939a((AbstractC25678ad) zVar.mo41794q());
    }
}
