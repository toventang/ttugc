package com.google.android.gms.internal.p1948g;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.g.l */
final class C25752l extends AbstractC25751k {

    /* renamed from: a */
    private final C25750j f60873a = new C25750j();

    static {
        Covode.recordClassIndex(31167);
    }

    C25752l() {
    }

    @Override // com.google.android.gms.internal.p1948g.AbstractC25751k
    /* renamed from: a */
    public final void mo41980a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f60873a.mo41981a(th).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
