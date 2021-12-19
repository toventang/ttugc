package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25446d;
import com.google.android.gms.common.api.internal.C25446d.AbstractC25447a;
import com.google.android.gms.common.api.internal.C25450f;

/* renamed from: com.google.android.gms.common.api.internal.cb */
public final class C25420cb<A extends C25446d.AbstractC25447a<? extends AbstractC25485p, C25335a.AbstractC25337b>> extends AbstractC25404bn {

    /* renamed from: a */
    private final A f60316a;

    static {
        Covode.recordClassIndex(30819);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public final void mo41621a(Status status) {
        this.f60316a.mo41682b(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: c */
    public final void mo41624c(C25450f.C25451a<?> aVar) {
        try {
            this.f60316a.mo41683b(aVar.f60420a);
        } catch (RuntimeException e) {
            mo41623a(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public final void mo41623a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        this.f60316a.mo41682b(new Status(10, new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length()).append(simpleName).append(": ").append(localizedMessage).toString()));
    }

    public C25420cb(int i, A a) {
        super(i);
        this.f60316a = a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public final void mo41622a(C25441cv cvVar, boolean z) {
        A a = this.f60316a;
        cvVar.f60385a.put(a, Boolean.valueOf(z));
        a.mo41541a(new C25473w(cvVar, a));
    }
}
