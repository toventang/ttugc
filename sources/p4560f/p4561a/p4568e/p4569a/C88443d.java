package p4560f.p4561a.p4568e.p4569a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.a.d */
public final class C88443d implements AbstractC88412b, AbstractC88440a {

    /* renamed from: a */
    List<AbstractC88412b> f200693a;

    /* renamed from: b */
    volatile boolean f200694b;

    static {
        Covode.recordClassIndex(104485);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return this.f200694b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r1.hasNext() == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.next().dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        p4560f.p4561a.p4566c.C88422b.m153670a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r2 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r2 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r2.size() != 1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r0 = p4560f.p4561a.p4568e.p4584j.C88906h.m154104a((java.lang.Throwable) r2.get(0));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1752);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        r0 = new p4560f.p4561a.p4566c.C88417a(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1752);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1752);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        return;
     */
    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4569a.C88443d.dispose():void");
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
    /* renamed from: a */
    public final boolean mo142945a(AbstractC88412b bVar) {
        MethodCollector.m26663i(1775);
        C88466b.m153697a((Object) bVar, "d is null");
        if (!this.f200694b) {
            synchronized (this) {
                try {
                    if (!this.f200694b) {
                        List list = this.f200693a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f200693a = list;
                        }
                        list.add(bVar);
                        return true;
                    }
                } finally {
                    MethodCollector.m26664o(1775);
                }
            }
        }
        bVar.dispose();
        MethodCollector.m26664o(1775);
        return false;
    }

    @Override // p4560f.p4561a.p4568e.p4569a.AbstractC88440a
    /* renamed from: c */
    public final boolean mo142947c(AbstractC88412b bVar) {
        MethodCollector.m26663i(1801);
        C88466b.m153697a((Object) bVar, "Disposable item is null");
        if (this.f200694b) {
            MethodCollector.m26664o(1801);
            return false;
        }
        synchronized (this) {
            try {
                if (this.f200694b) {
                    return false;
                }
                List<AbstractC88412b> list = this.f200693a;
                if (list == null || !list.remove(bVar)) {
                    MethodCollector.m26664o(1801);
                    return false;
                }
                MethodCollector.m26664o(1801);
                return true;
            } finally {
                MethodCollector.m26664o(1801);
            }
        }
    }
}
