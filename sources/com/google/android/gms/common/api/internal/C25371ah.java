package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC25526c;

/* renamed from: com.google.android.gms.common.api.internal.ah */
final class C25371ah extends AbstractC25385av {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25526c.AbstractC25529c f60201a;

    static {
        Covode.recordClassIndex(30770);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25385av
    /* renamed from: a */
    public final void mo41561a() {
        this.f60201a.mo41579a(new ConnectionResult(16, null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25371ah(AbstractC25383at atVar, AbstractC25526c.AbstractC25529c cVar) {
        super(atVar);
        this.f60201a = cVar;
    }
}
