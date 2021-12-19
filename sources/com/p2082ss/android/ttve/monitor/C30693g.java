package com.p2082ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ttve.monitor.g */
public final class C30693g {

    /* renamed from: a */
    public static WeakReference<AbstractC30694a> f73416a;

    /* renamed from: com.ss.android.ttve.monitor.g$a */
    public interface AbstractC30694a {
        static {
            Covode.recordClassIndex(37264);
        }

        /* renamed from: a */
        void mo55065a(Throwable th);
    }

    static {
        Covode.recordClassIndex(37263);
    }

    /* renamed from: a */
    public static void m63057a(Throwable th) {
        AbstractC30694a aVar;
        WeakReference<AbstractC30694a> weakReference = f73416a;
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            aVar.mo55065a(th);
        }
    }
}
