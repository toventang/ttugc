package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.p1945d.HandlerC25727g;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.ch */
public abstract class AbstractDialogInterface$OnCancelListenerC25427ch extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    private final Handler f60332b;

    /* renamed from: d */
    protected volatile boolean f60333d;

    /* renamed from: e */
    protected final AtomicReference<C25429cj> f60334e;

    /* renamed from: f */
    protected final GoogleApiAvailability f60335f;

    static {
        Covode.recordClassIndex(30826);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41653a(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo41654e();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: b */
    public void mo41556b() {
        super.mo41556b();
        this.f60333d = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public void mo41559d() {
        super.mo41559d();
        this.f60333d = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo41657f() {
        this.f60334e.set(null);
        mo41654e();
    }

    protected AbstractDialogInterface$OnCancelListenerC25427ch(AbstractC25458j jVar) {
        this(jVar, GoogleApiAvailability.getInstance());
    }

    /* renamed from: a */
    private static int m48997a(C25429cj cjVar) {
        if (cjVar == null) {
            return -1;
        }
        return cjVar.f60338a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo41653a(new ConnectionResult(13, null), m48997a(this.f60334e.get()));
        mo41657f();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public final void mo41554a(Bundle bundle) {
        C25429cj cjVar;
        super.mo41554a(bundle);
        if (bundle != null) {
            AtomicReference<C25429cj> atomicReference = this.f60334e;
            if (bundle.getBoolean("resolving_error", false)) {
                cjVar = new C25429cj(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                cjVar = null;
            }
            atomicReference.set(cjVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: b */
    public final void mo41557b(Bundle bundle) {
        super.mo41557b(bundle);
        C25429cj cjVar = this.f60334e.get();
        if (cjVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", cjVar.f60338a);
            bundle.putInt("failed_status", cjVar.f60339b.f60082b);
            bundle.putParcelable("failed_resolution", cjVar.f60339b.f60083c);
        }
    }

    private AbstractDialogInterface$OnCancelListenerC25427ch(AbstractC25458j jVar, GoogleApiAvailability googleApiAvailability) {
        super(jVar);
        this.f60334e = new AtomicReference<>(null);
        this.f60332b = new HandlerC25727g(Looper.getMainLooper());
        this.f60335f = googleApiAvailability;
    }

    /* renamed from: b */
    public final void mo41656b(ConnectionResult connectionResult, int i) {
        C25429cj cjVar = new C25429cj(connectionResult, i);
        if (this.f60334e.compareAndSet(null, cjVar)) {
            this.f60332b.post(new RunnableC25428ci(this, cjVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r3 != false) goto L_0x003b;
     */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41553a(int r7, int r8, android.content.Intent r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC25427ch.mo41553a(int, int, android.content.Intent):void");
    }
}
