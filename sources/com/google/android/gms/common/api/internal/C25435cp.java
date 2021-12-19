package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.cp */
public final class C25435cp implements AbstractC25401bk {

    /* renamed from: a */
    private final /* synthetic */ C25433cn f60359a;

    static {
        Covode.recordClassIndex(30834);
    }

    private C25435cp(C25433cn cnVar) {
        this.f60359a = cnVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25401bk
    /* renamed from: a */
    public final void mo41585a(Bundle bundle) {
        this.f60359a.f60351g.lock();
        try {
            C25433cn cnVar = this.f60359a;
            if (cnVar.f60347c == null) {
                cnVar.f60347c = bundle;
            } else if (bundle != null) {
                cnVar.f60347c.putAll(bundle);
            }
            this.f60359a.f60348d = ConnectionResult.f60081a;
            C25433cn.m49014a(this.f60359a);
        } finally {
            this.f60359a.f60351g.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25401bk
    /* renamed from: a */
    public final void mo41586a(ConnectionResult connectionResult) {
        this.f60359a.f60351g.lock();
        try {
            this.f60359a.f60348d = connectionResult;
            C25433cn.m49014a(this.f60359a);
        } finally {
            this.f60359a.f60351g.unlock();
        }
    }

    /* synthetic */ C25435cp(C25433cn cnVar, byte b) {
        this(cnVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25401bk
    /* renamed from: a */
    public final void mo41584a(int i, boolean z) {
        this.f60359a.f60351g.lock();
        try {
            if (this.f60359a.f60350f || this.f60359a.f60349e == null || !this.f60359a.f60349e.mo41434b()) {
                this.f60359a.f60350f = false;
                C25433cn.m49015a(this.f60359a, i, z);
                return;
            }
            this.f60359a.f60350f = true;
            this.f60359a.f60346b.mo34349b(i);
            this.f60359a.f60351g.unlock();
        } finally {
            this.f60359a.f60351g.unlock();
        }
    }
}
