package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4566c.C88417a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.c */
public final class C11147c extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    static {
        Covode.recordClassIndex(12774);
    }

    C11147c() {
    }

    /* renamed from: a */
    public final Throwable mo17940a() {
        Throwable th = (Throwable) get();
        if (th != C11178x.f26808a) {
            return (Throwable) getAndSet(C11178x.f26808a);
        }
        return th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Throwable[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final boolean mo17941a(Throwable th) {
        Object obj;
        Throwable aVar;
        do {
            obj = get();
            if (obj == C11178x.f26808a) {
                return false;
            }
            if (obj == null) {
                aVar = th;
            } else {
                aVar = new C88417a(obj, th);
            }
        } while (!compareAndSet(obj, aVar));
        return true;
    }
}
