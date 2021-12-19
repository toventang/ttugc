package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90215d;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.w */
public enum EnumC11177w implements AbstractC90215d {
    CANCELLED;

    @Override // org.p4663a.AbstractC90215d
    public final void cancel() {
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
    }

    static {
        Covode.recordClassIndex(12804);
    }

    /* renamed from: a */
    static boolean m19820a(AtomicReference<AbstractC90215d> atomicReference) {
        AbstractC90215d andSet;
        AbstractC90215d dVar = atomicReference.get();
        EnumC11177w wVar = CANCELLED;
        if (dVar == wVar || (andSet = atomicReference.getAndSet(wVar)) == wVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }
}
