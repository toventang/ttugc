package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.p062a.AbstractC1229a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.internal.AbstractC25465p;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
public final class C25305e extends AbstractC1229a<Void> implements AbstractC25465p {

    /* renamed from: f */
    private Semaphore f60050f = new Semaphore(0);

    /* renamed from: g */
    private Set<AbstractC25357i> f60051g;

    static {
        Covode.recordClassIndex(30695);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25465p
    /* renamed from: f */
    public final void mo41409f() {
        this.f60050f.release();
    }

    @Override // androidx.loader.p062a.C1232c
    /* renamed from: g */
    public final void mo4075g() {
        this.f60050f.drainPermits();
        mo4081l();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final Void mo4067d() {
        int i = 0;
        for (AbstractC25357i iVar : this.f60051g) {
            if (iVar.mo41524a(this)) {
                i++;
            }
        }
        try {
            this.f60050f.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public C25305e(Context context, Set<AbstractC25357i> set) {
        super(context);
        this.f60051g = set;
    }
}
