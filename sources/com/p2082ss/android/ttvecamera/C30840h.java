package com.p2082ss.android.ttvecamera;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ttvecamera.h */
public final class C30840h {

    /* renamed from: a */
    static WeakReference<AbstractC30841a> f73867a;

    /* renamed from: com.ss.android.ttvecamera.h$a */
    public interface AbstractC30841a {
        static {
            Covode.recordClassIndex(37466);
        }

        /* renamed from: a */
        void mo55862a(Throwable th);
    }

    static {
        Covode.recordClassIndex(37465);
    }

    /* renamed from: a */
    public static void m63546a(Throwable th) {
        AbstractC30841a aVar;
        WeakReference<AbstractC30841a> weakReference = f73867a;
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            aVar.mo55862a(th);
        }
    }
}
