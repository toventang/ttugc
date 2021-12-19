package com.p2082ss.android.ugc.aweme.plugin.aab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18117b;
import com.bytedance.ies.ugc.aweme.plugin.p1266b.C18123a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.plugin.aab.b */
public final class C63126b {

    /* renamed from: a */
    static final AtomicInteger f143461a = new AtomicInteger(0);

    /* renamed from: b */
    static C18117b f143462b;

    /* renamed from: c */
    public static final C63126b f143463c = new C63126b();

    private C63126b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.plugin.aab.b$a */
    static final class CallableC63127a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC63127a f143464a = new CallableC63127a();

        static {
            Covode.recordClassIndex(73971);
        }

        CallableC63127a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C63126b.m114081a();
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(73970);
    }

    /* renamed from: a */
    public static void m114081a() {
        AtomicInteger atomicInteger = f143461a;
        if (atomicInteger.compareAndSet(1, 2)) {
            C63128c.m114082c();
            C18117b bVar = f143462b;
            if (bVar == null) {
                bVar = new C18117b.C18118a().mo28876a();
            }
            C89219l.m154716b(bVar, "");
            if (bVar.f43137a) {
                C18123a.f43179d = true;
            }
            atomicInteger.set(3);
        }
    }
}
