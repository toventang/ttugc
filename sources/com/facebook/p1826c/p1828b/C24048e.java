package com.facebook.p1826c.p1828b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1837i.C24123a;
import com.facebook.common.time.AbstractC24139a;
import com.facebook.common.time.C24141c;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1826c.p1827a.AbstractC24022b;
import com.facebook.p1826c.p1827a.AbstractC24024d;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.AbstractC24032k;
import com.facebook.p1826c.p1827a.C24027f;
import com.facebook.p1826c.p1828b.AbstractC24045d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.c.b.e */
public class C24048e implements AbstractC24056i {

    /* renamed from: e */
    private static final Class<?> f56941e = C24048e.class;

    /* renamed from: f */
    private static final long f56942f = TimeUnit.HOURS.toMillis(2);

    /* renamed from: g */
    private static final long f56943g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final CountDownLatch f56944a;

    /* renamed from: b */
    final Set<String> f56945b;

    /* renamed from: c */
    public final Object f56946c = new Object();

    /* renamed from: d */
    public boolean f56947d;

    /* renamed from: h */
    private final long f56948h;

    /* renamed from: i */
    private final long f56949i;

    /* renamed from: j */
    private long f56950j;

    /* renamed from: k */
    private final AbstractC24024d f56951k;

    /* renamed from: l */
    private long f56952l;

    /* renamed from: m */
    private final long f56953m;

    /* renamed from: n */
    private final C24123a f56954n;

    /* renamed from: o */
    private final AbstractC24045d f56955o;

    /* renamed from: p */
    private final AbstractC24055h f56956p;

    /* renamed from: q */
    private final AbstractC24022b f56957q;

    /* renamed from: r */
    private final boolean f56958r;

    /* renamed from: s */
    private final C24050a f56959s;

    /* renamed from: t */
    private final AbstractC24139a f56960t;

    @Override // com.facebook.common.p1829a.AbstractC24062a
    /* renamed from: e */
    public final void mo39583e() {
        mo39579c();
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24056i
    /* renamed from: a */
    public final long mo39574a() {
        return this.f56959s.mo39590c();
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24056i
    /* renamed from: b */
    public final long mo39577b() {
        return this.f56959s.mo39591d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.c.b.e$a */
    public static class C24050a {

        /* renamed from: a */
        private boolean f56962a;

        /* renamed from: b */
        private long f56963b = -1;

        /* renamed from: c */
        private long f56964c = -1;

        static {
            Covode.recordClassIndex(28176);
        }

        C24050a() {
        }

        /* renamed from: a */
        public final synchronized boolean mo39587a() {
            boolean z;
            MethodCollector.m26663i(3729);
            z = this.f56962a;
            MethodCollector.m26664o(3729);
            return z;
        }

        /* renamed from: c */
        public final synchronized long mo39590c() {
            long j;
            MethodCollector.m26663i(3735);
            j = this.f56963b;
            MethodCollector.m26664o(3735);
            return j;
        }

        /* renamed from: d */
        public final synchronized long mo39591d() {
            long j;
            MethodCollector.m26663i(3736);
            j = this.f56964c;
            MethodCollector.m26664o(3736);
            return j;
        }

        /* renamed from: b */
        public final synchronized void mo39588b() {
            MethodCollector.m26663i(3731);
            this.f56962a = false;
            this.f56964c = -1;
            this.f56963b = -1;
            MethodCollector.m26664o(3731);
        }

        /* renamed from: a */
        public final synchronized void mo39586a(long j, long j2) {
            MethodCollector.m26663i(3733);
            this.f56964c = j2;
            this.f56963b = j;
            this.f56962a = true;
            MethodCollector.m26664o(3733);
        }

        /* renamed from: b */
        public final synchronized void mo39589b(long j, long j2) {
            MethodCollector.m26663i(3734);
            if (this.f56962a) {
                this.f56963b += j;
                this.f56964c += j2;
            }
            MethodCollector.m26664o(3734);
        }
    }

    static {
        Covode.recordClassIndex(28174);
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24056i
    /* renamed from: c */
    public final void mo39579c() {
        MethodCollector.m26663i(4730);
        synchronized (this.f56946c) {
            try {
                this.f56955o.mo39557c();
                this.f56945b.clear();
            } catch (IOException | NullPointerException e) {
                e.getMessage();
            } catch (Throwable th) {
                MethodCollector.m26664o(4730);
                throw th;
            }
            this.f56959s.mo39588b();
        }
        MethodCollector.m26664o(4730);
    }

    /* renamed from: f */
    public final boolean mo39584f() {
        long a = this.f56960t.mo39730a();
        if (this.f56959s.mo39587a()) {
            long j = this.f56952l;
            if (j != -1 && a - j <= f56943g) {
                return false;
            }
        }
        return m45523g();
    }

    @Override // com.facebook.common.p1829a.AbstractC24062a
    /* renamed from: d */
    public final void mo39581d() {
        MethodCollector.m26663i(4746);
        synchronized (this.f56946c) {
            try {
                mo39584f();
                long c = this.f56959s.mo39590c();
                long j = this.f56953m;
                if (j > 0 && c > 0) {
                    if (c >= j) {
                        double d = (double) j;
                        double d2 = (double) c;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        double d3 = 1.0d - (d / d2);
                        if (d3 > 0.02d) {
                            synchronized (this.f56946c) {
                                try {
                                    this.f56959s.mo39588b();
                                    mo39584f();
                                    long c2 = this.f56959s.mo39590c();
                                    double d4 = (double) c2;
                                    Double.isNaN(d4);
                                    m45522a(c2 - ((long) (d3 * d4)), AbstractC24024d.EnumC24025a.CACHE_MANAGER_TRIMMED);
                                } catch (IOException e) {
                                    e.getMessage();
                                } catch (Throwable th) {
                                    MethodCollector.m26664o(4746);
                                    throw th;
                                }
                            }
                        }
                        MethodCollector.m26664o(4746);
                    }
                }
            } finally {
                MethodCollector.m26664o(4746);
            }
        }
    }

    /* renamed from: g */
    private boolean m45523g() {
        Set<String> set;
        Set<String> set2;
        long a = this.f56960t.mo39730a();
        long j = f56942f + a;
        if (this.f56958r && this.f56945b.isEmpty()) {
            set = this.f56945b;
        } else if (this.f56958r) {
            set = new HashSet<>();
        } else {
            set = null;
        }
        try {
            long j2 = 0;
            long j3 = -1;
            int i = 0;
            for (AbstractC24045d.AbstractC24046a aVar : this.f56955o.mo39559d()) {
                i++;
                j2 += aVar.mo39565c();
                if (aVar.mo39564b() > j) {
                    aVar.mo39565c();
                    j3 = Math.max(aVar.mo39564b() - a, j3);
                } else if (this.f56958r) {
                    set.add(aVar.mo39563a());
                }
            }
            long j4 = (long) i;
            if (!(this.f56959s.mo39591d() == j4 && this.f56959s.mo39590c() == j2)) {
                if (this.f56958r && (set2 = this.f56945b) != set) {
                    set2.clear();
                    this.f56945b.addAll(set);
                }
                this.f56959s.mo39586a(j2, j4);
            }
            this.f56952l = a;
            return true;
        } catch (IOException e) {
            e.getMessage();
            return false;
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24056i
    /* renamed from: b */
    public final void mo39578b(AbstractC24026e eVar) {
        MethodCollector.m26663i(4709);
        synchronized (this.f56946c) {
            try {
                List<String> a = C24027f.m45458a(eVar);
                for (int i = 0; i < a.size(); i++) {
                    String str = a.get(i);
                    this.f56955o.mo39554b(str);
                    this.f56945b.remove(str);
                }
            } catch (IOException e) {
                e.getMessage();
            } catch (Throwable th) {
                MethodCollector.m26664o(4709);
                throw th;
            }
        }
        MethodCollector.m26664o(4709);
    }

    /* renamed from: a */
    private Collection<AbstractC24045d.AbstractC24046a> m45521a(Collection<AbstractC24045d.AbstractC24046a> collection) {
        long a = this.f56960t.mo39730a() + f56942f;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (AbstractC24045d.AbstractC24046a aVar : collection) {
            if (aVar.mo39564b() > a) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f56956p.mo39570a());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.p1826c.p1828b.AbstractC24056i
    /* renamed from: c */
    public final boolean mo39580c(AbstractC24026e eVar) {
        MethodCollector.m26663i(4733);
        synchronized (this.f56946c) {
            try {
                List<String> a = C24027f.m45458a(eVar);
                for (int i = 0; i < a.size(); i++) {
                    if (this.f56945b.contains(a.get(i))) {
                        MethodCollector.m26664o(4733);
                        return true;
                    }
                }
                MethodCollector.m26664o(4733);
                return false;
            } catch (Throwable th) {
                MethodCollector.m26664o(4733);
                throw th;
            }
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24056i
    /* renamed from: d */
    public final boolean mo39582d(AbstractC24026e eVar) {
        MethodCollector.m26663i(4738);
        synchronized (this.f56946c) {
            try {
                if (mo39580c(eVar)) {
                    return true;
                }
                try {
                    List<String> a = C24027f.m45458a(eVar);
                    for (int i = 0; i < a.size(); i++) {
                        String str = a.get(i);
                        if (this.f56955o.mo39558c(str, eVar)) {
                            this.f56945b.add(str);
                            MethodCollector.m26664o(4738);
                            return true;
                        }
                    }
                    MethodCollector.m26664o(4738);
                    return false;
                } catch (IOException unused) {
                    MethodCollector.m26664o(4738);
                    return false;
                }
            } finally {
                MethodCollector.m26664o(4738);
            }
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24056i
    /* renamed from: a */
    public final AbstractC24018a mo39575a(AbstractC24026e eVar) {
        AbstractC24018a aVar;
        MethodCollector.m26663i(4593);
        C24057j b = C24057j.m45560b();
        b.f56979a = eVar;
        try {
            synchronized (this.f56946c) {
                try {
                    List<String> a = C24027f.m45458a(eVar);
                    int i = 0;
                    String str = null;
                    aVar = null;
                    while (true) {
                        if (i >= a.size()) {
                            this.f56945b.remove(str);
                            break;
                        }
                        str = a.get(i);
                        b.f56980b = str;
                        aVar = this.f56955o.mo39555b(str, eVar);
                        if (aVar != null) {
                            this.f56945b.add(str);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4593);
                    throw th;
                }
            }
            return aVar;
        } catch (IOException e) {
            b.f56984f = e;
            return null;
        } finally {
            b.mo39592c();
            MethodCollector.m26664o(4593);
        }
    }

    /* renamed from: a */
    private AbstractC24018a m45519a(AbstractC24045d.AbstractC24047b bVar, String str) {
        AbstractC24018a a;
        MethodCollector.m26663i(4608);
        synchronized (this.f56946c) {
            try {
                a = bVar.mo39567a();
                this.f56945b.add(str);
                this.f56959s.mo39589b(a.mo39539b(), 1);
            } finally {
                MethodCollector.m26664o(4608);
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.p1826c.p1828b.AbstractC24045d.AbstractC24047b m45520a(java.lang.String r13, com.facebook.p1826c.p1827a.AbstractC24026e r14) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1826c.p1828b.C24048e.m45520a(java.lang.String, com.facebook.c.a.e):com.facebook.c.b.d$b");
    }

    /* renamed from: a */
    private void m45522a(long j, AbstractC24024d.EnumC24025a aVar) {
        try {
            Collection<AbstractC24045d.AbstractC24046a> a = m45521a(this.f56955o.mo39559d());
            long c = this.f56959s.mo39590c();
            long j2 = c - j;
            int i = 0;
            long j3 = 0;
            for (AbstractC24045d.AbstractC24046a aVar2 : a) {
                if (j3 > j2) {
                    break;
                }
                long a2 = this.f56955o.mo39549a(aVar2);
                this.f56945b.remove(aVar2.mo39563a());
                if (a2 > 0) {
                    i++;
                    j3 += a2;
                    C24057j b = C24057j.m45560b();
                    b.f56980b = aVar2.mo39563a();
                    b.f56985g = aVar;
                    b.f56981c = a2;
                    b.f56983e = c - j3;
                    b.f56982d = j;
                    b.mo39592c();
                }
            }
            this.f56959s.mo39589b(-j3, (long) (-i));
            this.f56955o.mo39556b();
        } catch (IOException e) {
            e.getMessage();
            throw e;
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24056i
    /* renamed from: a */
    public final AbstractC24018a mo39576a(AbstractC24026e eVar, AbstractC24032k kVar) {
        String b;
        MethodCollector.m26663i(4706);
        C24057j b2 = C24057j.m45560b();
        b2.f56979a = eVar;
        synchronized (this.f56946c) {
            try {
                b = C24027f.m45459b(eVar);
            } finally {
                MethodCollector.m26664o(4706);
            }
        }
        b2.f56980b = b;
        try {
            AbstractC24045d.AbstractC24047b a = m45520a(b, eVar);
            try {
                a.mo39568a(kVar);
                AbstractC24018a a2 = m45519a(a, b);
                b2.f56981c = a2.mo39539b();
                b2.f56983e = this.f56959s.mo39590c();
                this.f56951k.mo34229a(b2);
                if (!a.mo39569b()) {
                    C24099a.m45654c(f56941e, "Failed to delete temp file");
                }
                b2.mo39592c();
                MethodCollector.m26664o(4706);
                return a2;
            } catch (Throwable th) {
                if (!a.mo39569b()) {
                    C24099a.m45654c(f56941e, "Failed to delete temp file");
                }
                throw th;
            }
        } catch (IOException e) {
            b2.f56984f = e;
            C24099a.m45648b(f56941e, "Failed inserting a file into the cache", e);
            MethodCollector.m26664o(4706);
            throw e;
        } catch (Throwable th2) {
            b2.mo39592c();
            MethodCollector.m26664o(4706);
            throw th2;
        }
    }

    /* renamed from: com.facebook.c.b.e$b */
    public static class C24051b {

        /* renamed from: a */
        public final long f56965a;

        /* renamed from: b */
        public final long f56966b;

        /* renamed from: c */
        public final long f56967c;

        static {
            Covode.recordClassIndex(28177);
        }

        public C24051b(long j, long j2, long j3) {
            this.f56965a = j;
            this.f56966b = j2;
            this.f56967c = j3;
        }
    }

    public C24048e(AbstractC24045d dVar, AbstractC24055h hVar, C24051b bVar, AbstractC24024d dVar2, AbstractC24022b bVar2, Executor executor, boolean z) {
        this.f56948h = bVar.f56966b;
        this.f56949i = bVar.f56967c;
        this.f56950j = bVar.f56967c;
        this.f56954n = C24123a.m45726a();
        this.f56955o = dVar;
        this.f56956p = hVar;
        this.f56952l = -1;
        this.f56951k = dVar2;
        this.f56953m = bVar.f56965a;
        this.f56957q = bVar2;
        this.f56959s = new C24050a();
        this.f56960t = C24141c.f57092a;
        this.f56958r = z;
        this.f56945b = new HashSet();
        if (z) {
            this.f56944a = new CountDownLatch(1);
            executor.execute(new Runnable() {
                /* class com.facebook.p1826c.p1828b.C24048e.RunnableC240491 */

                static {
                    Covode.recordClassIndex(28175);
                }

                public final void run() {
                    MethodCollector.m26663i(3066);
                    synchronized (C24048e.this.f56946c) {
                        try {
                            C24048e.this.mo39584f();
                        } catch (Throwable th) {
                            MethodCollector.m26664o(3066);
                            throw th;
                        }
                    }
                    C24048e.this.f56947d = true;
                    C24048e.this.f56944a.countDown();
                    MethodCollector.m26664o(3066);
                }
            });
            return;
        }
        this.f56944a = new CountDownLatch(0);
    }
}
