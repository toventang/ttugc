package p4560f.p4561a.p4565b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.AbstractC88440a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4568e.p4584j.C88914l;

/* renamed from: f.a.b.a */
public final class C88411a implements AbstractC88412b, AbstractC88440a {

    /* renamed from: a */
    C88914l<AbstractC88412b> f200684a;

    /* renamed from: b */
    volatile boolean f200685b;

    static {
        Covode.recordClassIndex(104453);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return this.f200685b;
    }

    /* renamed from: a */
    public final void mo142944a() {
        MethodCollector.m26663i(115);
        if (this.f200685b) {
            MethodCollector.m26664o(115);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f200685b) {
                    C88914l<AbstractC88412b> lVar = this.f200684a;
                    this.f200684a = null;
                    m153653a(lVar);
                    MethodCollector.m26664o(115);
                }
            } finally {
                MethodCollector.m26664o(115);
            }
        }
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        MethodCollector.m26663i(64);
        if (this.f200685b) {
            MethodCollector.m26664o(64);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f200685b) {
                    this.f200685b = true;
                    C88914l<AbstractC88412b> lVar = this.f200684a;
                    this.f200684a = null;
                    m153653a(lVar);
                    MethodCollector.m26664o(64);
                }
            } finally {
                MethodCollector.m26664o(64);
            }
        }
    }

    @Override // p4560f.p4561a.p4568e.p4569a.AbstractC88440a
    /* renamed from: b */
    public final boolean mo142946b(AbstractC88412b bVar) {
        if (!mo142947c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // p4560f.p4561a.p4568e.p4569a.AbstractC88440a
    /* renamed from: c */
    public final boolean mo142947c(AbstractC88412b bVar) {
        MethodCollector.m26663i(105);
        C88466b.m153697a((Object) bVar, "Disposable item is null");
        if (this.f200685b) {
            MethodCollector.m26664o(105);
            return false;
        }
        synchronized (this) {
            try {
                if (this.f200685b) {
                    return false;
                }
                C88914l<AbstractC88412b> lVar = this.f200684a;
                if (lVar == null || !lVar.mo143187b(bVar)) {
                    MethodCollector.m26664o(105);
                    return false;
                }
                MethodCollector.m26664o(105);
                return true;
            } finally {
                MethodCollector.m26664o(105);
            }
        }
    }

    /* renamed from: a */
    private static void m153653a(C88914l<AbstractC88412b> lVar) {
        if (lVar != null) {
            ArrayList arrayList = null;
            T[] tArr = lVar.f201922e;
            for (T t : tArr) {
                if (t instanceof AbstractC88412b) {
                    try {
                        t.dispose();
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C88906h.m154104a((Throwable) arrayList.get(0));
            }
            throw new C88417a(arrayList);
        }
    }

    @Override // p4560f.p4561a.p4568e.p4569a.AbstractC88440a
    /* renamed from: a */
    public final boolean mo142945a(AbstractC88412b bVar) {
        MethodCollector.m26663i(72);
        C88466b.m153697a((Object) bVar, "d is null");
        if (!this.f200685b) {
            synchronized (this) {
                try {
                    if (!this.f200685b) {
                        C88914l<AbstractC88412b> lVar = this.f200684a;
                        if (lVar == null) {
                            lVar = new C88914l<>();
                            this.f200684a = lVar;
                        }
                        lVar.mo143186a(bVar);
                        return true;
                    }
                } finally {
                    MethodCollector.m26664o(72);
                }
            }
        }
        bVar.dispose();
        MethodCollector.m26664o(72);
        return false;
    }
}
