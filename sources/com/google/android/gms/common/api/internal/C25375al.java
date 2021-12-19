package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25357i;

/* renamed from: com.google.android.gms.common.api.internal.al */
final class C25375al implements AbstractC25357i.AbstractC25359b, AbstractC25357i.AbstractC25360c {

    /* renamed from: a */
    private final /* synthetic */ C25368ae f60207a;

    static {
        Covode.recordClassIndex(30774);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: b */
    public final void mo34349b(int i) {
    }

    private C25375al(C25368ae aeVar) {
        this.f60207a = aeVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25462m
    /* renamed from: a */
    public final void mo41581a(ConnectionResult connectionResult) {
        this.f60207a.f60176b.lock();
        try {
            if (this.f60207a.mo41568a(connectionResult)) {
                this.f60207a.mo41577f();
                this.f60207a.mo41576e();
            } else {
                this.f60207a.mo41570b(connectionResult);
            }
        } finally {
            this.f60207a.f60176b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: a */
    public final void mo34348a(Bundle bundle) {
        if (this.f60207a.f60185k.f60594j) {
            this.f60207a.f60176b.lock();
            try {
                if (this.f60207a.f60179e != null) {
                    this.f60207a.f60179e.mo43682a(new BinderC25373aj(this.f60207a));
                    this.f60207a.f60176b.unlock();
                }
            } finally {
                this.f60207a.f60176b.unlock();
            }
        } else {
            this.f60207a.f60179e.mo43682a(new BinderC25373aj(this.f60207a));
        }
    }

    /* synthetic */ C25375al(C25368ae aeVar, byte b) {
        this(aeVar);
    }
}
