package com.facebook.imagepipeline.p1879d;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.AbstractC24092j;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24106c;
import com.facebook.common.p1835g.EnumC24105b;
import com.facebook.common.p1836h.AbstractC24120c;
import com.facebook.common.p1836h.C24117a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.imagepipeline.d.h */
public class C24382h<K, V> implements AbstractC24106c, AbstractC24397p<K, V> {

    /* renamed from: a */
    static final long f57823a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    final C24381g<K, C24386b<K, V>> f57824b;

    /* renamed from: c */
    final C24381g<K, C24386b<K, V>> f57825c;

    /* renamed from: d */
    final Map<Bitmap, Object> f57826d = new WeakHashMap();

    /* renamed from: e */
    protected C24398q f57827e;

    /* renamed from: f */
    private final AbstractC24405w<V> f57828f;

    /* renamed from: g */
    private final AbstractC24385a f57829g;

    /* renamed from: h */
    private final AbstractC24093k<C24398q> f57830h;

    /* renamed from: i */
    private long f57831i;

    /* renamed from: com.facebook.imagepipeline.d.h$a */
    public interface AbstractC24385a {
        static {
            Covode.recordClassIndex(28528);
        }

        /* renamed from: a */
        double mo40173a(EnumC24105b bVar);
    }

    /* renamed from: com.facebook.imagepipeline.d.h$c */
    public interface AbstractC24387c<K> {
        static {
            Covode.recordClassIndex(28530);
        }

        /* renamed from: a */
        void mo40140a(K k, boolean z);
    }

    /* renamed from: a */
    public final void mo40205a(C24386b<K, V> bVar) {
        boolean c;
        C24117a<V> h;
        MethodCollector.m26663i(3833);
        C24091i.m45617a(bVar);
        synchronized (this) {
            try {
                m46428g(bVar);
                c = m46421c((C24386b) bVar);
                h = m46429h(bVar);
            } catch (Throwable th) {
                MethodCollector.m26664o(3833);
                throw th;
            }
        }
        C24117a.m45712c(h);
        if (!(!c || bVar == null || bVar.f57840e == null)) {
            bVar.f57840e.mo40140a(bVar.f57836a, true);
        }
        m46417b();
        m46419c();
        MethodCollector.m26664o(3833);
    }

    static {
        Covode.recordClassIndex(28525);
    }

    /* renamed from: d */
    private synchronized int m46422d() {
        int a;
        MethodCollector.m26663i(4099);
        a = this.f57825c.mo40191a() - this.f57824b.mo40191a();
        MethodCollector.m26664o(4099);
        return a;
    }

    /* renamed from: e */
    private synchronized int m46425e() {
        int b;
        MethodCollector.m26663i(4151);
        b = this.f57825c.mo40195b() - this.f57824b.mo40195b();
        MethodCollector.m26664o(4151);
        return b;
    }

    /* renamed from: b */
    private synchronized void m46417b() {
        MethodCollector.m26663i(4035);
        if (this.f57831i + f57823a > SystemClock.uptimeMillis()) {
            MethodCollector.m26664o(4035);
            return;
        }
        this.f57831i = SystemClock.uptimeMillis();
        this.f57827e = this.f57830h.mo34217b();
        MethodCollector.m26664o(4035);
    }

    /* renamed from: c */
    private void m46419c() {
        ArrayList<C24386b<K, V>> a;
        MethodCollector.m26663i(4043);
        synchronized (this) {
            try {
                a = m46414a(Math.min(this.f57827e.f57852d, this.f57827e.f57850b - m46422d()), Math.min(this.f57827e.f57851c, this.f57827e.f57849a - m46425e()));
                m46420c((ArrayList) a);
            } catch (Throwable th) {
                MethodCollector.m26664o(4043);
                throw th;
            }
        }
        m46415a((ArrayList) a);
        m46418b((ArrayList) a);
        MethodCollector.m26664o(4043);
    }

    /* renamed from: a */
    public final void mo40204a() {
        ArrayList<C24386b<K, V>> d;
        ArrayList<C24386b<K, V>> d2;
        MethodCollector.m26663i(3971);
        synchronized (this) {
            try {
                d = this.f57824b.mo40199d();
                d2 = this.f57825c.mo40199d();
                m46420c((ArrayList) d2);
            } catch (Throwable th) {
                MethodCollector.m26664o(3971);
                throw th;
            }
        }
        m46415a((ArrayList) d2);
        m46418b((ArrayList) d);
        m46417b();
        MethodCollector.m26664o(3971);
    }

    /* renamed from: a */
    private AbstractC24405w<C24386b<K, V>> m46413a(final AbstractC24405w<V> wVar) {
        return new AbstractC24405w<C24386b<K, V>>() {
            /* class com.facebook.imagepipeline.p1879d.C24382h.C243831 */

            static {
                Covode.recordClassIndex(28526);
            }

            @Override // com.facebook.imagepipeline.p1879d.AbstractC24405w
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo34215a(Object obj) {
                return wVar.mo34215a(((C24386b) obj).f57837b.mo39695a());
            }
        };
    }

    /* renamed from: d */
    private static <K, V> void m46423d(C24386b<K, V> bVar) {
        if (bVar != null && bVar.f57840e != null) {
            bVar.f57840e.mo40140a(bVar.f57836a, false);
        }
    }

    /* renamed from: a */
    private void m46415a(ArrayList<C24386b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<C24386b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                C24117a.m45712c(m46429h(it.next()));
            }
        }
    }

    /* renamed from: b */
    private synchronized C24117a<V> m46416b(final C24386b<K, V> bVar) {
        C24117a<V> a;
        MethodCollector.m26663i(3825);
        m46427f(bVar);
        a = C24117a.m45707a(bVar.f57837b.mo39695a(), new AbstractC24120c<V>() {
            /* class com.facebook.imagepipeline.p1879d.C24382h.C243842 */

            static {
                Covode.recordClassIndex(28527);
            }

            @Override // com.facebook.common.p1836h.AbstractC24120c
            /* renamed from: a */
            public final void mo39665a(V v) {
                C24382h.this.mo40205a((C24386b) bVar);
            }
        });
        MethodCollector.m26664o(3825);
        return a;
    }

    /* renamed from: c */
    public final synchronized boolean mo40208c(K k) {
        boolean a;
        MethodCollector.m26663i(3972);
        a = this.f57825c.mo40194a((Object) k);
        MethodCollector.m26664o(3972);
        return a;
    }

    /* renamed from: d */
    private synchronized boolean m46424d(V v) {
        MethodCollector.m26663i(3815);
        int a = this.f57828f.mo34215a(v);
        if (a > this.f57827e.f57853e || m46422d() > this.f57827e.f57850b - 1 || m46425e() > this.f57827e.f57849a - a) {
            MethodCollector.m26664o(3815);
            return false;
        }
        MethodCollector.m26664o(3815);
        return true;
    }

    /* renamed from: e */
    private synchronized void m46426e(C24386b<K, V> bVar) {
        boolean z;
        MethodCollector.m26663i(4092);
        C24091i.m45617a(bVar);
        if (!bVar.f57839d) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        bVar.f57839d = true;
        MethodCollector.m26664o(4092);
    }

    /* renamed from: f */
    private synchronized void m46427f(C24386b<K, V> bVar) {
        boolean z;
        MethodCollector.m26663i(4093);
        C24091i.m45617a(bVar);
        if (!bVar.f57839d) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        bVar.f57838c++;
        MethodCollector.m26664o(4093);
    }

    /* renamed from: g */
    private synchronized void m46428g(C24386b<K, V> bVar) {
        boolean z;
        MethodCollector.m26663i(4096);
        C24091i.m45617a(bVar);
        if (bVar.f57838c > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        bVar.f57838c--;
        MethodCollector.m26664o(4096);
    }

    /* renamed from: h */
    private synchronized C24117a<V> m46429h(C24386b<K, V> bVar) {
        MethodCollector.m26663i(4097);
        C24091i.m45617a(bVar);
        if (!bVar.f57839d || bVar.f57838c != 0) {
            MethodCollector.m26664o(4097);
            return null;
        }
        C24117a<V> aVar = bVar.f57837b;
        MethodCollector.m26664o(4097);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24397p
    /* renamed from: a */
    public final int mo40200a(AbstractC24092j<K> jVar) {
        ArrayList<C24386b<K, V>> a;
        ArrayList<C24386b<K, V>> a2;
        MethodCollector.m26663i(3932);
        synchronized (this) {
            try {
                a = this.f57824b.mo40193a((AbstractC24092j) jVar);
                a2 = this.f57825c.mo40193a((AbstractC24092j) jVar);
                m46420c((ArrayList) a2);
            } catch (Throwable th) {
                MethodCollector.m26664o(3932);
                throw th;
            }
        }
        m46415a((ArrayList) a2);
        m46418b((ArrayList) a);
        m46417b();
        m46419c();
        int size = a2.size();
        MethodCollector.m26664o(3932);
        return size;
    }

    /* renamed from: b */
    private static void m46418b(ArrayList<C24386b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<C24386b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m46423d((C24386b) it.next());
            }
        }
    }

    /* renamed from: c */
    private synchronized void m46420c(ArrayList<C24386b<K, V>> arrayList) {
        MethodCollector.m26663i(4089);
        if (arrayList != null) {
            Iterator<C24386b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m46426e(it.next());
            }
        }
        MethodCollector.m26664o(4089);
    }

    /* renamed from: c */
    private synchronized boolean m46421c(C24386b<K, V> bVar) {
        MethodCollector.m26663i(3835);
        if (bVar.f57839d || bVar.f57838c != 0) {
            MethodCollector.m26664o(3835);
            return false;
        }
        this.f57824b.mo40192a(bVar.f57836a, bVar);
        MethodCollector.m26664o(3835);
        return true;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24397p
    /* renamed from: a */
    public final C24117a<V> mo40201a(K k) {
        C24386b<K, V> c;
        C24117a<V> aVar;
        MethodCollector.m26663i(3819);
        C24091i.m45617a(k);
        synchronized (this) {
            try {
                c = this.f57824b.mo40198c(k);
                C24386b<K, V> b = this.f57825c.mo40196b(k);
                if (b != null) {
                    aVar = m46416b((C24386b) b);
                } else {
                    aVar = null;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(3819);
                throw th;
            }
        }
        m46423d((C24386b) c);
        m46417b();
        m46419c();
        MethodCollector.m26664o(3819);
        return aVar;
    }

    /* renamed from: b */
    public final int mo40206b(AbstractC24092j<K> jVar) {
        ArrayList<C24386b<K, V>> a;
        MethodCollector.m26663i(3962);
        ArrayList<C24386b<K, V>> arrayList = new ArrayList<>();
        synchronized (this) {
            try {
                a = this.f57824b.mo40193a((AbstractC24092j) jVar);
                for (int i = 0; i < a.size(); i++) {
                    arrayList.add(this.f57825c.mo40198c(a.get(i).f57836a));
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(3962);
                throw th;
            }
        }
        m46415a((ArrayList) arrayList);
        m46418b((ArrayList) a);
        m46417b();
        m46419c();
        int size = arrayList.size();
        MethodCollector.m26664o(3962);
        return size;
    }

    /* renamed from: b */
    public final C24117a<V> mo40207b(K k) {
        C24386b<K, V> c;
        boolean z;
        C24117a<V> aVar;
        MethodCollector.m26663i(3840);
        C24091i.m45617a(k);
        synchronized (this) {
            try {
                c = this.f57824b.mo40198c(k);
                z = true;
                boolean z2 = false;
                if (c != null) {
                    C24386b<K, V> c2 = this.f57825c.mo40198c(k);
                    C24091i.m45617a(c2);
                    if (c2.f57838c == 0) {
                        z2 = true;
                    }
                    C24091i.m45622b(z2);
                    aVar = c2.f57837b;
                } else {
                    aVar = null;
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(3840);
            }
        }
        if (z) {
            m46423d((C24386b) c);
        }
        return aVar;
    }

    @Override // com.facebook.common.p1835g.AbstractC24106c
    /* renamed from: a */
    public final void mo39663a(EnumC24105b bVar) {
        ArrayList<C24386b<K, V>> a;
        MethodCollector.m26663i(3979);
        double a2 = this.f57829g.mo40173a(bVar);
        synchronized (this) {
            try {
                double b = (double) this.f57825c.mo40195b();
                Double.isNaN(b);
                a = m46414a(Integer.MAX_VALUE, Math.max(0, ((int) (b * (1.0d - a2))) - m46425e()));
                m46420c((ArrayList) a);
            } catch (Throwable th) {
                MethodCollector.m26664o(3979);
                throw th;
            }
        }
        m46415a((ArrayList) a);
        m46418b((ArrayList) a);
        m46417b();
        m46419c();
        MethodCollector.m26664o(3979);
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24397p
    /* renamed from: a */
    public final C24117a<V> mo40202a(K k, C24117a<V> aVar) {
        return mo40203a(k, aVar, null);
    }

    /* renamed from: a */
    private synchronized ArrayList<C24386b<K, V>> m46414a(int i, int i2) {
        MethodCollector.m26663i(4050);
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f57824b.mo40191a() > max || this.f57824b.mo40195b() > max2) {
            ArrayList<C24386b<K, V>> arrayList = new ArrayList<>();
            while (true) {
                if (this.f57824b.mo40191a() > max || this.f57824b.mo40195b() > max2) {
                    K c = this.f57824b.mo40197c();
                    this.f57824b.mo40198c(c);
                    arrayList.add(this.f57825c.mo40198c(c));
                } else {
                    MethodCollector.m26664o(4050);
                    return arrayList;
                }
            }
        } else {
            MethodCollector.m26664o(4050);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.d.h$b */
    public static class C24386b<K, V> {

        /* renamed from: a */
        public final K f57836a;

        /* renamed from: b */
        public final C24117a<V> f57837b;

        /* renamed from: c */
        public int f57838c = 0;

        /* renamed from: d */
        public boolean f57839d = false;

        /* renamed from: e */
        public final AbstractC24387c<K> f57840e;

        static {
            Covode.recordClassIndex(28529);
        }

        C24386b(K k, C24117a<V> aVar, AbstractC24387c<K> cVar) {
            this.f57836a = (K) C24091i.m45617a(k);
            this.f57837b = (C24117a) C24091i.m45617a(C24117a.m45711b(aVar));
            this.f57840e = cVar;
        }
    }

    public C24382h(AbstractC24405w<V> wVar, AbstractC24385a aVar, AbstractC24093k<C24398q> kVar) {
        this.f57828f = wVar;
        this.f57824b = new C24381g<>(m46413a((AbstractC24405w) wVar));
        this.f57825c = new C24381g<>(m46413a((AbstractC24405w) wVar));
        this.f57829g = aVar;
        this.f57830h = kVar;
        this.f57827e = kVar.mo34217b();
        this.f57831i = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public final C24117a<V> mo40203a(K k, C24117a<V> aVar, AbstractC24387c<K> cVar) {
        C24386b<K, V> c;
        C24117a<V> aVar2;
        C24117a<V> aVar3;
        MethodCollector.m26663i(3764);
        C24091i.m45617a(k);
        C24091i.m45617a(aVar);
        m46417b();
        synchronized (this) {
            try {
                c = this.f57824b.mo40198c(k);
                C24386b<K, V> c2 = this.f57825c.mo40198c(k);
                aVar2 = null;
                if (c2 != null) {
                    m46426e(c2);
                    aVar3 = m46429h(c2);
                } else {
                    aVar3 = null;
                }
                if (m46424d((Object) aVar.mo39695a())) {
                    C24386b<K, V> bVar = new C24386b<>(k, aVar, cVar);
                    this.f57825c.mo40192a(k, bVar);
                    aVar2 = m46416b((C24386b) bVar);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(3764);
                throw th;
            }
        }
        C24117a.m45712c(aVar3);
        m46423d((C24386b) c);
        m46419c();
        MethodCollector.m26664o(3764);
        return aVar2;
    }
}
