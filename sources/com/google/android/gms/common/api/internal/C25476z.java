package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.internal.C25446d;

/* renamed from: com.google.android.gms.common.api.internal.z */
public final class C25476z implements AbstractC25383at {

    /* renamed from: a */
    final C25386aw f60470a;

    /* renamed from: b */
    boolean f60471b;

    static {
        Covode.recordClassIndex(30875);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41564a() {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41566a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41567a(ConnectionResult connectionResult, C25335a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: c */
    public final void mo41574c() {
        if (this.f60471b) {
            this.f60471b = false;
            this.f60470a.mo41600a(new C25365ab(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: b */
    public final boolean mo41572b() {
        if (this.f60471b) {
            return false;
        }
        if (this.f60470a.f60253m.mo41589j()) {
            this.f60471b = true;
            for (C25412bv bvVar : this.f60470a.f60253m.f60217f) {
                bvVar.f60295c = null;
            }
            return false;
        }
        this.f60470a.mo41598a((ConnectionResult) null);
        return true;
    }

    public C25476z(C25386aw awVar) {
        this.f60470a = awVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41563a(T t) {
        return (T) mo41569b(t);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41565a(int i) {
        this.f60470a.mo41598a((ConnectionResult) null);
        this.f60470a.f60254n.mo41584a(i, this.f60471b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T extends com.google.android.gms.common.api.internal.d$a<? extends com.google.android.gms.common.api.p, A> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.common.api.a$f, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <A extends com.google.android.gms.common.api.C25335a.AbstractC25337b, T extends com.google.android.gms.common.api.internal.C25446d.AbstractC25447a<? extends com.google.android.gms.common.api.AbstractC25485p, A>> T mo41569b(T r4) {
        /*
            r3 = this;
            com.google.android.gms.common.api.internal.aw r0 = r3.f60470a     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.aq r0 = r0.f60253m     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.bz r0 = r0.f60218g     // Catch:{ DeadObjectException -> 0x0045 }
            r0.mo41638a(r4)     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.aw r0 = r3.f60470a     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.aq r0 = r0.f60253m     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$c<A extends com.google.android.gms.common.api.a$b> r1 = r4.f60401a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r0 = r0.f60215d     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.Object r2 = r0.get(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$f r2 = (com.google.android.gms.common.api.C25335a.AbstractC25343f) r2     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.String r0 = "Appropriate Api was not requested."
            com.google.android.gms.common.internal.C25565r.m49315a(r2, r0)     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r0 = r2.mo41492g()     // Catch:{ DeadObjectException -> 0x0045 }
            if (r0 != 0) goto L_0x0039
            com.google.android.gms.common.api.internal.aw r0 = r3.f60470a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r1 = r0.f60247g     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$c<A extends com.google.android.gms.common.api.a$b> r0 = r4.f60401a     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            if (r0 == 0) goto L_0x0039
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0045 }
            r0 = 17
            r1.<init>(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            r4.mo41682b(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0039:
            boolean r0 = r2 instanceof com.google.android.gms.common.internal.C25566s     // Catch:{ DeadObjectException -> 0x0045 }
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.common.internal.s r2 = (com.google.android.gms.common.internal.C25566s) r2     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$h<T extends android.os.IInterface> r2 = r2.f60636a     // Catch:{ DeadObjectException -> 0x0045 }
        L_0x0041:
            r4.mo41683b(r2)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0045:
            com.google.android.gms.common.api.internal.aw r1 = r3.f60470a
            com.google.android.gms.common.api.internal.ac r0 = new com.google.android.gms.common.api.internal.ac
            r0.<init>(r3, r3)
            r1.mo41600a(r0)
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C25476z.mo41569b(com.google.android.gms.common.api.internal.d$a):com.google.android.gms.common.api.internal.d$a");
    }
}
