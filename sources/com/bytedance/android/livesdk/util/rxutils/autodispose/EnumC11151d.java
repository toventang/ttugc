package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.d */
enum EnumC11151d implements AbstractC88412b {
    DISPOSED;

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return true;
    }

    static {
        Covode.recordClassIndex(12778);
    }

    /* renamed from: a */
    static boolean m19787a(AtomicReference<AbstractC88412b> atomicReference) {
        AbstractC88412b andSet;
        AbstractC88412b bVar = atomicReference.get();
        EnumC11151d dVar = DISPOSED;
        if (bVar == dVar || (andSet = atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }
}
