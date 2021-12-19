package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.cr */
public final class C25437cr implements AbstractC25401bk {

    /* renamed from: a */
    private final /* synthetic */ C25433cn f60361a;

    static {
        Covode.recordClassIndex(30836);
    }

    private C25437cr(C25433cn cnVar) {
        this.f60361a = cnVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25401bk
    /* renamed from: a */
    public final void mo41585a(Bundle bundle) {
        this.f60361a.f60351g.lock();
        try {
            this.f60361a.f60349e = ConnectionResult.f60081a;
            C25433cn.m49014a(this.f60361a);
        } finally {
            this.f60361a.f60351g.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25401bk
    /* renamed from: a */
    public final void mo41586a(ConnectionResult connectionResult) {
        this.f60361a.f60351g.lock();
        try {
            this.f60361a.f60349e = connectionResult;
            C25433cn.m49014a(this.f60361a);
        } finally {
            this.f60361a.f60351g.unlock();
        }
    }

    /* synthetic */ C25437cr(C25433cn cnVar, byte b) {
        this(cnVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25401bk
    /* renamed from: a */
    public final void mo41584a(int i, boolean z) {
        this.f60361a.f60351g.lock();
        try {
            if (this.f60361a.f60350f) {
                this.f60361a.f60350f = false;
                C25433cn.m49015a(this.f60361a, i, z);
                return;
            }
            this.f60361a.f60350f = true;
            this.f60361a.f60345a.mo34349b(i);
            this.f60361a.f60351g.unlock();
        } finally {
            this.f60361a.f60351g.unlock();
        }
    }
}
