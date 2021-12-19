package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.ar.core.ae */
final class C27082ae implements AbstractC27115x {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f64078a;

    static {
        Covode.recordClassIndex(32631);
    }

    C27082ae(AtomicReference atomicReference) {
        this.f64078a = atomicReference;
    }

    @Override // com.google.p1970ar.core.AbstractC27115x
    /* renamed from: a */
    public final void mo45119a(ArCoreApk.Availability availability) {
        this.f64078a.set(availability);
    }
}
