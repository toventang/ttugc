package com.google.android.gms.common.api.internal;

import androidx.p025c.C0486b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.x */
public class C25474x extends AbstractDialogInterface$OnCancelListenerC25427ch {

    /* renamed from: b */
    public final C0486b<C25390b<?>> f60466b = new C0486b<>();

    /* renamed from: c */
    public C25450f f60467c;

    static {
        Covode.recordClassIndex(30873);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC25427ch, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: b */
    public final void mo41556b() {
        super.mo41556b();
        m49138g();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: c */
    public final void mo41558c() {
        super.mo41558c();
        m49138g();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC25427ch
    /* renamed from: e */
    public final void mo41654e() {
        this.f60467c.mo41690c();
    }

    /* renamed from: g */
    private final void m49138g() {
        if (!this.f60466b.isEmpty()) {
            this.f60467c.mo41687a(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC25427ch, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public final void mo41559d() {
        MethodCollector.m26663i(8203);
        super.mo41559d();
        C25450f fVar = this.f60467c;
        synchronized (C25450f.f60405f) {
            try {
                if (fVar.f60416m == this) {
                    fVar.f60416m = null;
                    fVar.f60417n.clear();
                }
            } finally {
                MethodCollector.m26664o(8203);
            }
        }
    }

    public C25474x(AbstractC25458j jVar) {
        super(jVar);
        this.f60170a.mo41671a("ConnectionlessLifecycleHelper", this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC25427ch
    /* renamed from: a */
    public final void mo41653a(ConnectionResult connectionResult, int i) {
        this.f60467c.mo41689b(connectionResult, i);
    }
}
