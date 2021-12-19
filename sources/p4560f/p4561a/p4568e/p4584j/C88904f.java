package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88425e;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.j.f */
public final class C88904f {
    static {
        Covode.recordClassIndex(104946);
    }

    /* renamed from: a */
    private static String m154101a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: a */
    public static void m154102a(Class<?> cls) {
        C88925a.m154178a(new C88425e(m154101a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m154103a(AtomicReference<AbstractC88412b> atomicReference, AbstractC88412b bVar, Class<?> cls) {
        C88466b.m153697a((Object) bVar, "next is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == EnumC88441b.DISPOSED) {
            return false;
        }
        m154102a(cls);
        return false;
    }
}
