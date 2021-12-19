package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25450f;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.common.api.internal.cd */
public final class C25422cd<ResultT> extends AbstractC25382as {

    /* renamed from: a */
    private final AbstractC25468s<C25335a.AbstractC25337b, ResultT> f60318a;

    /* renamed from: b */
    private final C25632i<ResultT> f60319b;

    /* renamed from: c */
    private final AbstractC25466q f60320c;

    static {
        Covode.recordClassIndex(30821);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public final void mo41623a(RuntimeException runtimeException) {
        this.f60319b.mo41895b(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25382as
    /* renamed from: b */
    public final boolean mo41593b(C25450f.C25451a<?> aVar) {
        return this.f60318a.f60456b;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public final void mo41621a(Status status) {
        this.f60319b.mo41895b(this.f60320c.mo41560a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: c */
    public final void mo41624c(C25450f.C25451a<?> aVar) {
        try {
            this.f60318a.mo41631a(aVar.f60420a, this.f60319b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo41621a(AbstractC25404bn.m48932a(e2));
        } catch (RuntimeException e3) {
            mo41623a(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25382as
    /* renamed from: a */
    public final Feature[] mo41592a(C25450f.C25451a<?> aVar) {
        return this.f60318a.f60455a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public final void mo41622a(C25441cv cvVar, boolean z) {
        C25632i<ResultT> iVar = this.f60319b;
        cvVar.f60386b.put(iVar, Boolean.valueOf(z));
        iVar.f60753a.mo41869a((AbstractC25626c) new C25472v(cvVar, iVar));
    }

    public C25422cd(int i, AbstractC25468s<C25335a.AbstractC25337b, ResultT> sVar, C25632i<ResultT> iVar, AbstractC25466q qVar) {
        super(i);
        this.f60319b = iVar;
        this.f60318a = sVar;
        this.f60320c = qVar;
    }
}
