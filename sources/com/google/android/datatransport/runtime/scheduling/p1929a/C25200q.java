package com.google.android.datatransport.runtime.scheduling.p1929a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.p1926c.C25143a;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.q */
final /* synthetic */ class C25200q implements C25188h.AbstractC25189a {

    /* renamed from: a */
    static final C25200q f59671a = new C25200q();

    static {
        Covode.recordClassIndex(30566);
    }

    private C25200q() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        throw new C25143a("Timed out while trying to acquire the lock.", (Throwable) obj);
    }
}
