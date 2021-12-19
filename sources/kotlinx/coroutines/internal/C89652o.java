package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.AbstractC89587ci;
import p4600h.p4621l.C89309k;

/* renamed from: kotlinx.coroutines.internal.o */
public final class C89652o {

    /* renamed from: a */
    public static final AbstractC89587ci f203399a = m155615a();

    /* renamed from: b */
    public static final C89652o f203400b = new C89652o();

    /* renamed from: c */
    private static final boolean f203401c = C89662y.m155640a("kotlinx.coroutines.fast.service.loader");

    private C89652o() {
    }

    static {
        Covode.recordClassIndex(105745);
    }

    /* renamed from: a */
    private static AbstractC89587ci m155615a() {
        List<MainDispatcherFactory> g;
        T t;
        AbstractC89587ci a;
        try {
            if (f203401c) {
                g = C89641g.m155578a();
            } else {
                g = C89309k.m154813g(C89309k.m154795a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            }
            Iterator<T> it = g.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = t.getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = next.getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            T t2 = t;
            if (t2 == null || (a = C89653p.m155617a(t2, g)) == null) {
                return C89653p.m155618a((Throwable) null, 3);
            }
            return a;
        } catch (Throwable th) {
            return C89653p.m155618a(th, 2);
        }
    }
}
