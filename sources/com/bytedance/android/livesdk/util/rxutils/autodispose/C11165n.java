package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88425e;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.n */
final class C11165n {
    static {
        Covode.recordClassIndex(12792);
    }

    /* renamed from: a */
    private static String m19813a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: a */
    public static void m19814a(Class<?> cls) {
        C88925a.m154178a(new C88425e(m19813a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m19815a(AtomicReference<AbstractC88412b> atomicReference, AbstractC88412b bVar, Class<?> cls) {
        C11170s.m19819a(bVar, "next is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == EnumC11151d.DISPOSED) {
            return false;
        }
        m19814a(cls);
        return false;
    }
}
