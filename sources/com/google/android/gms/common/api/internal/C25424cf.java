package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.internal.C25565r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.cf */
public class C25424cf extends AbstractDialogInterface$OnCancelListenerC25427ch {

    /* renamed from: b */
    private final SparseArray<C25425a> f60322b = new SparseArray<>();

    static {
        Covode.recordClassIndex(30823);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC25427ch, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public final void mo41559d() {
        super.mo41559d();
        for (int i = 0; i < this.f60322b.size(); i++) {
            C25425a b = m48986b(i);
            if (b != null) {
                b.f60324b.mo41532f();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC25427ch
    /* renamed from: e */
    public final void mo41654e() {
        for (int i = 0; i < this.f60322b.size(); i++) {
            C25425a b = m48986b(i);
            if (b != null) {
                b.f60324b.mo41531e();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC25427ch, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: b */
    public final void mo41556b() {
        super.mo41556b();
        boolean z = this.f60333d;
        String.valueOf(String.valueOf(this.f60322b)).length();
        if (this.f60334e.get() == null) {
            for (int i = 0; i < this.f60322b.size(); i++) {
                C25425a b = m48986b(i);
                if (b != null) {
                    b.f60324b.mo41531e();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.common.api.internal.cf$a */
    public class C25425a implements AbstractC25357i.AbstractC25360c {

        /* renamed from: a */
        public final int f60323a;

        /* renamed from: b */
        public final AbstractC25357i f60324b;

        /* renamed from: c */
        public final AbstractC25357i.AbstractC25360c f60325c;

        static {
            Covode.recordClassIndex(30824);
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC25462m
        /* renamed from: a */
        public final void mo41581a(ConnectionResult connectionResult) {
            String.valueOf(String.valueOf(connectionResult)).length();
            C25424cf.this.mo41656b(connectionResult, this.f60323a);
        }

        public C25425a(int i, AbstractC25357i iVar, AbstractC25357i.AbstractC25360c cVar) {
            this.f60323a = i;
            this.f60324b = iVar;
            this.f60325c = cVar;
            iVar.mo41521a(this);
        }
    }

    private C25424cf(AbstractC25458j jVar) {
        super(jVar);
        this.f60170a.mo41671a("AutoManageHelper", this);
    }

    /* renamed from: b */
    private final C25425a m48986b(int i) {
        if (this.f60322b.size() <= i) {
            return null;
        }
        SparseArray<C25425a> sparseArray = this.f60322b;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: a */
    public final void mo41651a(int i) {
        C25425a aVar = this.f60322b.get(i);
        this.f60322b.remove(i);
        if (aVar != null) {
            aVar.f60324b.mo41527b(aVar);
            aVar.f60324b.mo41532f();
        }
    }

    /* renamed from: b */
    public static C25424cf m48987b(C25457i iVar) {
        AbstractC25458j a = m48795a(iVar);
        C25424cf cfVar = (C25424cf) a.mo41670a("AutoManageHelper", C25424cf.class);
        if (cfVar != null) {
            return cfVar;
        }
        return new C25424cf(a);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC25427ch
    /* renamed from: a */
    public final void mo41653a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C25425a aVar = this.f60322b.get(i);
        if (aVar != null) {
            mo41651a(i);
            AbstractC25357i.AbstractC25360c cVar = aVar.f60325c;
            if (cVar != null) {
                cVar.mo41581a(connectionResult);
            }
        }
    }

    /* renamed from: a */
    public final void mo41652a(int i, AbstractC25357i iVar, AbstractC25357i.AbstractC25360c cVar) {
        boolean z;
        C25565r.m49315a(iVar, "GoogleApiClient instance cannot be null");
        if (this.f60322b.indexOfKey(i) < 0) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49321a(z, new StringBuilder(54).append("Already managing a GoogleApiClient with id ").append(i).toString());
        Object obj = this.f60334e.get();
        boolean z2 = this.f60333d;
        String.valueOf(String.valueOf(obj)).length();
        this.f60322b.put(i, new C25425a(i, iVar, cVar));
        if (this.f60333d && obj == null) {
            String.valueOf(String.valueOf(iVar)).length();
            iVar.mo41531e();
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public final void mo41555a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f60322b.size(); i++) {
            C25425a b = m48986b(i);
            if (b != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(b.f60323a);
                printWriter.println(":");
                b.f60324b.mo41523a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }
}
