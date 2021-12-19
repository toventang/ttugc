package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.internal.AbstractC25526c;
import com.google.android.gms.common.internal.C25565r;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.ag */
public final class C25370ag implements AbstractC25526c.AbstractC25529c {

    /* renamed from: a */
    final boolean f60198a;

    /* renamed from: b */
    private final WeakReference<C25368ae> f60199b;

    /* renamed from: c */
    private final C25335a<?> f60200c;

    static {
        Covode.recordClassIndex(30769);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25529c
    /* renamed from: a */
    public final void mo41579a(ConnectionResult connectionResult) {
        boolean z;
        C25368ae aeVar = this.f60199b.get();
        if (aeVar != null) {
            if (Looper.myLooper() == aeVar.f60175a.f60253m.mo41529c()) {
                z = true;
            } else {
                z = false;
            }
            C25565r.m49321a(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            aeVar.f60176b.lock();
            try {
                if (aeVar.mo41573b(0)) {
                    if (!connectionResult.mo41434b()) {
                        aeVar.mo41571b(connectionResult, this.f60200c, this.f60198a);
                    }
                    if (aeVar.mo41575d()) {
                        aeVar.mo41576e();
                    }
                    aeVar.f60176b.unlock();
                }
            } finally {
                aeVar.f60176b.unlock();
            }
        }
    }

    public C25370ag(C25368ae aeVar, C25335a<?> aVar, boolean z) {
        this.f60199b = new WeakReference<>(aeVar);
        this.f60200c = aVar;
        this.f60198a = z;
    }
}
