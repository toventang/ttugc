package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25450f;
import com.google.android.gms.common.api.internal.C25459k;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.common.api.internal.ce */
public final class C25423ce extends AbstractC25421cc<Boolean> {

    /* renamed from: b */
    private final C25459k.C25460a<?> f60321b;

    static {
        Covode.recordClassIndex(30822);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25421cc, com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41622a(C25441cv cvVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25421cc, com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41621a(Status status) {
        super.mo41621a(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25421cc, com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41623a(RuntimeException runtimeException) {
        super.mo41623a(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25382as
    /* renamed from: a */
    public final Feature[] mo41592a(C25450f.C25451a<?> aVar) {
        C25403bm bmVar = aVar.f60422c.get(this.f60321b);
        if (bmVar == null) {
            return null;
        }
        return bmVar.f60277a.f60453b;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25382as
    /* renamed from: b */
    public final boolean mo41593b(C25450f.C25451a<?> aVar) {
        C25403bm bmVar = aVar.f60422c.get(this.f60321b);
        if (bmVar == null || !bmVar.f60277a.f60454c) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25421cc
    /* renamed from: d */
    public final void mo41650d(C25450f.C25451a<?> aVar) {
        C25403bm remove = aVar.f60422c.remove(this.f60321b);
        if (remove != null) {
            remove.f60277a.f60452a.f60448a = null;
        } else {
            this.f60317a.mo41896b((Object) false);
        }
    }

    public C25423ce(C25459k.C25460a<?> aVar, C25632i<Boolean> iVar) {
        super(iVar);
        this.f60321b = aVar;
    }
}
