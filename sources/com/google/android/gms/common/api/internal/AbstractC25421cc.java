package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25450f;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.common.api.internal.cc */
abstract class AbstractC25421cc<T> extends AbstractC25382as {

    /* renamed from: a */
    protected final C25632i<T> f60317a;

    static {
        Covode.recordClassIndex(30820);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public void mo41622a(C25441cv cvVar, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo41650d(C25450f.C25451a<?> aVar);

    public AbstractC25421cc(C25632i<T> iVar) {
        super(4);
        this.f60317a = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public void mo41623a(RuntimeException runtimeException) {
        this.f60317a.mo41895b(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: a */
    public void mo41621a(Status status) {
        this.f60317a.mo41895b(new C25351e(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25404bn
    /* renamed from: c */
    public final void mo41624c(C25450f.C25451a<?> aVar) {
        try {
            mo41650d(aVar);
        } catch (DeadObjectException e) {
            mo41621a(AbstractC25404bn.m48932a(e));
            throw e;
        } catch (RemoteException e2) {
            mo41621a(AbstractC25404bn.m48932a(e2));
        } catch (RuntimeException e3) {
            mo41623a(e3);
        }
    }
}
