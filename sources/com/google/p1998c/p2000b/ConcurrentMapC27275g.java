package com.google.p1998c.p2000b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p1999a.AbstractC27231d;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p1999a.AbstractC27259t;
import com.google.p1998c.p1999a.C27238h;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p1999a.C27252o;
import com.google.p1998c.p2000b.AbstractC27261a;
import com.google.p1998c.p2000b.AbstractC27271d;
import com.google.p1998c.p2000b.C27265c;
import com.google.p1998c.p2001c.AbstractC27381ai;
import com.google.p1998c.p2001c.AbstractC27509i;
import com.google.p1998c.p2001c.C27397an;
import com.google.p1998c.p2004f.C27560a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.AbstractRunnableC27634d;
import com.google.p1998c.p2006h.p2007a.C27638f;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.google.p1998c.p2006h.p2007a.C27659u;
import com.google.p1998c.p2006h.p2007a.C27667v;
import com.google.p1998c.p2006h.p2007a.C27670x;
import com.google.p1998c.p2006h.p2007a.C27671y;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.b.g */
public class ConcurrentMapC27275g<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a */
    static final Logger f64460a = Logger.getLogger(ConcurrentMapC27275g.class.getName());

    /* renamed from: u */
    static final AbstractC27323w<Object, Object> f64461u = new AbstractC27323w<Object, Object>() {
        /* class com.google.p1998c.p2000b.ConcurrentMapC27275g.C272761 */

        static {
            Covode.recordClassIndex(32856);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final int mo45404a() {
            return 0;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final AbstractC27323w<Object, Object> mo45405a(ReferenceQueue<Object> referenceQueue, Object obj, AbstractC27333k<Object, Object> kVar) {
            return this;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final void mo45406a(Object obj) {
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: b */
        public final AbstractC27333k<Object, Object> mo45407b() {
            return null;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: c */
        public final boolean mo45408c() {
            return false;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: d */
        public final boolean mo45409d() {
            return false;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: e */
        public final Object mo45410e() {
            return null;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        public final Object get() {
            return null;
        }
    };

    /* renamed from: v */
    static final Queue<?> f64462v = new AbstractQueue<Object>() {
        /* class com.google.p1998c.p2000b.ConcurrentMapC27275g.C272772 */

        static {
            Covode.recordClassIndex(32857);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return AbstractC27381ai.m54718of().iterator();
        }
    };

    /* renamed from: b */
    final int f64463b;

    /* renamed from: c */
    final int f64464c;

    /* renamed from: d */
    final C27310n<K, V>[] f64465d;

    /* renamed from: e */
    final int f64466e;

    /* renamed from: f */
    final AbstractC27231d<Object> f64467f;

    /* renamed from: g */
    final AbstractC27231d<Object> f64468g;

    /* renamed from: h */
    final EnumC27313p f64469h;

    /* renamed from: i */
    final EnumC27313p f64470i;

    /* renamed from: j */
    final long f64471j;

    /* renamed from: k */
    final AbstractC27345p<K, V> f64472k;

    /* renamed from: l */
    final long f64473l;

    /* renamed from: m */
    final long f64474m;

    /* renamed from: n */
    final long f64475n;

    /* renamed from: o */
    final Queue<C27341n<K, V>> f64476o;

    /* renamed from: p */
    final AbstractC27340m<K, V> f64477p;

    /* renamed from: q */
    final AbstractC27259t f64478q;

    /* renamed from: r */
    final EnumC27290d f64479r;

    /* renamed from: s */
    final AbstractC27261a.AbstractC27263b f64480s;

    /* renamed from: t */
    final AbstractC27271d<? super K, V> f64481t;

    /* renamed from: w */
    Set<K> f64482w;

    /* renamed from: x */
    Collection<V> f64483x;

    /* renamed from: y */
    Set<Map.Entry<K, V>> f64484y;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.b.g$w */
    public interface AbstractC27323w<K, V> {
        static {
            Covode.recordClassIndex(32903);
        }

        /* renamed from: a */
        int mo45404a();

        /* renamed from: a */
        AbstractC27323w<K, V> mo45405a(ReferenceQueue<V> referenceQueue, V v, AbstractC27333k<K, V> kVar);

        /* renamed from: a */
        void mo45406a(V v);

        /* renamed from: b */
        AbstractC27333k<K, V> mo45407b();

        /* renamed from: c */
        boolean mo45408c();

        /* renamed from: d */
        boolean mo45409d();

        /* renamed from: e */
        V mo45410e();

        V get();
    }

    /* renamed from: com.google.c.b.g$aa */
    static class C27279aa<K, V> extends WeakReference<K> implements AbstractC27333k<K, V> {

        /* renamed from: g */
        final int f64487g;

        /* renamed from: h */
        final AbstractC27333k<K, V> f64488h;

        /* renamed from: i */
        volatile AbstractC27323w<K, V> f64489i = ((AbstractC27323w<K, V>) ConcurrentMapC27275g.f64461u);

        static {
            Covode.recordClassIndex(32859);
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final AbstractC27323w<K, V> mo45422a() {
            return this.f64489i;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public final AbstractC27333k<K, V> mo45426b() {
            return this.f64488h;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: c */
        public final int mo45429c() {
            return this.f64487g;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: d */
        public final K mo45431d() {
            return (K) get();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: e */
        public long mo45433e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: f */
        public AbstractC27333k<K, V> mo45434f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: g */
        public AbstractC27333k<K, V> mo45435g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: h */
        public long mo45436h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: i */
        public AbstractC27333k<K, V> mo45437i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: j */
        public AbstractC27333k<K, V> mo45438j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public void mo45423a(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public void mo45427b(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: c */
        public void mo45430c(AbstractC27333k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final void mo45424a(AbstractC27323w<K, V> wVar) {
            this.f64489i = wVar;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public void mo45428b(AbstractC27333k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: d */
        public void mo45432d(AbstractC27333k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public void mo45425a(AbstractC27333k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        C27279aa(ReferenceQueue<K> referenceQueue, K k, int i, AbstractC27333k<K, V> kVar) {
            super(k, referenceQueue);
            this.f64487g = i;
            this.f64488h = kVar;
        }
    }

    /* renamed from: com.google.c.b.g$ab */
    static class C27280ab<K, V> extends WeakReference<V> implements AbstractC27323w<K, V> {

        /* renamed from: a */
        final AbstractC27333k<K, V> f64490a;

        static {
            Covode.recordClassIndex(32860);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final int mo45404a() {
            return 1;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final void mo45406a(V v) {
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: c */
        public final boolean mo45408c() {
            return false;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: d */
        public final boolean mo45409d() {
            return true;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: b */
        public final AbstractC27333k<K, V> mo45407b() {
            return this.f64490a;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: e */
        public final V mo45410e() {
            return get();
        }

        C27280ab(ReferenceQueue<V> referenceQueue, V v, AbstractC27333k<K, V> kVar) {
            super(v, referenceQueue);
            this.f64490a = kVar;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final AbstractC27323w<K, V> mo45405a(ReferenceQueue<V> referenceQueue, V v, AbstractC27333k<K, V> kVar) {
            return new C27280ab(referenceQueue, v, kVar);
        }
    }

    /* renamed from: com.google.c.b.g$ac */
    static final class C27281ac<K, V> extends C27279aa<K, V> {

        /* renamed from: a */
        volatile long f64491a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC27333k<K, V> f64492b = EnumC27309m.INSTANCE;

        /* renamed from: c */
        AbstractC27333k<K, V> f64493c = EnumC27309m.INSTANCE;

        static {
            Covode.recordClassIndex(32861);
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: h */
        public final long mo45436h() {
            return this.f64491a;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: i */
        public final AbstractC27333k<K, V> mo45437i() {
            return this.f64492b;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: j */
        public final AbstractC27333k<K, V> mo45438j() {
            return this.f64493c;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: b */
        public final void mo45427b(long j) {
            this.f64491a = j;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: c */
        public final void mo45430c(AbstractC27333k<K, V> kVar) {
            this.f64492b = kVar;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: d */
        public final void mo45432d(AbstractC27333k<K, V> kVar) {
            this.f64493c = kVar;
        }

        C27281ac(ReferenceQueue<K> referenceQueue, K k, int i, AbstractC27333k<K, V> kVar) {
            super(referenceQueue, k, i, kVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.b.g$ae */
    public final class C27285ae implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f64499a;

        /* renamed from: b */
        V f64500b;

        static {
            Covode.recordClassIndex(32865);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f64499a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f64500b;
        }

        public final int hashCode() {
            return this.f64499a.hashCode() ^ this.f64500b.hashCode();
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) ConcurrentMapC27275g.this.put(this.f64499a, v);
            this.f64500b = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!this.f64499a.equals(entry.getKey()) || !this.f64500b.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        C27285ae(K k, V v) {
            this.f64499a = k;
            this.f64500b = v;
        }
    }

    /* renamed from: com.google.c.b.g$b */
    static abstract class AbstractC27286b<K, V> implements AbstractC27333k<K, V> {
        static {
            Covode.recordClassIndex(32866);
        }

        AbstractC27286b() {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public AbstractC27323w<K, V> mo45422a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public AbstractC27333k<K, V> mo45426b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: c */
        public int mo45429c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: d */
        public K mo45431d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: e */
        public long mo45433e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: f */
        public AbstractC27333k<K, V> mo45434f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: g */
        public AbstractC27333k<K, V> mo45435g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: h */
        public long mo45436h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: i */
        public AbstractC27333k<K, V> mo45437i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: j */
        public AbstractC27333k<K, V> mo45438j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public void mo45423a(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public void mo45427b(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: c */
        public void mo45430c(AbstractC27333k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: d */
        public void mo45432d(AbstractC27333k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public void mo45424a(AbstractC27323w<K, V> wVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public void mo45428b(AbstractC27333k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public void mo45425a(AbstractC27333k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.b.g$k */
    public static class C27306k<K, V> implements AbstractC27264b<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final ConcurrentMapC27275g<K, V> f64533a;

        static {
            Covode.recordClassIndex(32886);
        }

        @Override // com.google.p1998c.p2000b.AbstractC27264b
        /* renamed from: a */
        public final ConcurrentMap<K, V> mo45355a() {
            return this.f64533a;
        }

        /* access modifiers changed from: package-private */
        public final Object writeReplace() {
            return new C27308l(this.f64533a);
        }

        private C27306k(ConcurrentMapC27275g<K, V> gVar) {
            this.f64533a = gVar;
        }

        C27306k(C27265c<? super K, ? super V> cVar) {
            this(new ConcurrentMapC27275g(cVar));
        }

        @Override // com.google.p1998c.p2000b.AbstractC27264b
        /* renamed from: b */
        public final void mo45357b(Object obj) {
            C27245k.m54229a(obj);
            this.f64533a.remove(obj);
        }

        @Override // com.google.p1998c.p2000b.AbstractC27264b
        /* renamed from: a */
        public final V mo45353a(Object obj) {
            ConcurrentMapC27275g<K, V> gVar = this.f64533a;
            int a = gVar.mo45372a(C27245k.m54229a(obj));
            V a2 = gVar.mo45373a(a).mo45483a(obj, a);
            if (a2 == null) {
                gVar.f64480s.mo45350b();
            } else {
                gVar.f64480s.mo45348a();
            }
            return a2;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27264b
        /* renamed from: a */
        public final void mo45356a(K k, V v) {
            this.f64533a.put(k, v);
        }

        @Override // com.google.p1998c.p2000b.AbstractC27264b
        /* renamed from: a */
        public final V mo45354a(K k, final Callable<? extends V> callable) {
            C27245k.m54229a(callable);
            ConcurrentMapC27275g<K, V> gVar = this.f64533a;
            C273071 r2 = new AbstractC27271d<Object, V>() {
                /* class com.google.p1998c.p2000b.ConcurrentMapC27275g.C27306k.C273071 */

                static {
                    Covode.recordClassIndex(32887);
                }

                @Override // com.google.p1998c.p2000b.AbstractC27271d
                /* renamed from: a */
                public final V mo45366a() {
                    return (V) callable.call();
                }
            };
            int a = gVar.mo45372a(C27245k.m54229a(k));
            return gVar.mo45373a(a).mo45484a((Object) k, a, (AbstractC27271d) r2);
        }
    }

    /* renamed from: com.google.c.b.g$l */
    static class C27308l<K, V> extends AbstractC27274f<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final EnumC27313p f64536a;

        /* renamed from: b */
        final EnumC27313p f64537b;

        /* renamed from: c */
        final AbstractC27231d<Object> f64538c;

        /* renamed from: d */
        final AbstractC27231d<Object> f64539d;

        /* renamed from: e */
        final long f64540e;

        /* renamed from: f */
        final long f64541f;

        /* renamed from: g */
        final long f64542g;

        /* renamed from: h */
        final AbstractC27345p<K, V> f64543h;

        /* renamed from: i */
        final int f64544i;

        /* renamed from: j */
        final AbstractC27340m<? super K, ? super V> f64545j;

        /* renamed from: k */
        final AbstractC27259t f64546k;

        /* renamed from: l */
        final AbstractC27271d<? super K, V> f64547l;

        /* renamed from: m */
        transient AbstractC27264b<K, V> f64548m;

        static {
            Covode.recordClassIndex(32888);
        }

        private Object readResolve() {
            return this.f64548m;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p2000b.AbstractC27274f
        /* renamed from: b */
        public final AbstractC27264b<K, V> mo45370b() {
            return this.f64548m;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27274f, com.google.p1998c.p2001c.AbstractC27533u
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ Object mo45371c() {
            return this.f64548m;
        }

        C27308l(ConcurrentMapC27275g<K, V> gVar) {
            this(gVar.f64469h, gVar.f64470i, gVar.f64467f, gVar.f64468g, gVar.f64474m, gVar.f64473l, gVar.f64471j, gVar.f64472k, gVar.f64466e, gVar.f64477p, gVar.f64478q, gVar.f64481t);
        }

        /* JADX DEBUG: Type inference failed for r0v20. Raw type applied. Possible types: com.google.c.b.m<? super K, ? super V>, com.google.c.b.m<? super K1 extends K, ? super V1 extends V> */
        /* JADX DEBUG: Type inference failed for r0v25. Raw type applied. Possible types: com.google.c.b.b<K1 extends K, V1 extends V>, com.google.c.b.b<K, V> */
        private void readObject(ObjectInputStream objectInputStream) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            objectInputStream.defaultReadObject();
            C27265c cVar = new C27265c();
            EnumC27313p pVar = this.f64536a;
            boolean z15 = true;
            if (cVar.f64440k == null) {
                z = true;
            } else {
                z = false;
            }
            C27245k.m54245b(z, "Key strength was already set to %s", cVar.f64440k);
            cVar.f64440k = (EnumC27313p) C27245k.m54229a(pVar);
            C27265c<K, V> a = cVar.mo45359a(this.f64537b);
            AbstractC27231d<Object> dVar = this.f64538c;
            if (a.f64445p == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C27245k.m54245b(z2, "key equivalence was already set to %s", a.f64445p);
            a.f64445p = (AbstractC27231d) C27245k.m54229a(dVar);
            AbstractC27231d<Object> dVar2 = this.f64539d;
            if (a.f64446q == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C27245k.m54245b(z3, "value equivalence was already set to %s", a.f64446q);
            a.f64446q = (AbstractC27231d) C27245k.m54229a(dVar2);
            int i = this.f64544i;
            if (a.f64436g == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i2 = a.f64436g;
            if (z4) {
                if (i > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                C27245k.m54235a(z5);
                a.f64436g = i;
                C27265c<K1, V1> a2 = a.mo45360a((AbstractC27340m<? super K, ? super V>) this.f64545j);
                a2.f64434e = false;
                long j = this.f64540e;
                if (j > 0) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (a2.f64442m == -1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    C27245k.m54238a(z13, "expireAfterWrite was already set to %s ns", a2.f64442m);
                    if (j >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    C27245k.m54239a(z14, "duration cannot be negative: %s %s", j, timeUnit);
                    a2.f64442m = timeUnit.toNanos(j);
                }
                long j2 = this.f64541f;
                if (j2 > 0) {
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    if (a2.f64443n == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C27245k.m54238a(z11, "expireAfterAccess was already set to %s ns", a2.f64443n);
                    if (j2 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    C27245k.m54239a(z12, "duration cannot be negative: %s %s", j2, timeUnit2);
                    a2.f64443n = timeUnit2.toNanos(j2);
                }
                if (this.f64543h != C27265c.EnumC27270b.INSTANCE) {
                    AbstractC27345p<K, V> pVar2 = this.f64543h;
                    if (a2.f64439j == null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    C27245k.m54243b(z6);
                    if (a2.f64434e) {
                        if (a2.f64437h == -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        C27245k.m54238a(z10, "weigher can not be combined with maximum size", a2.f64437h);
                    }
                    a2.f64439j = (AbstractC27345p) C27245k.m54229a(pVar2);
                    long j3 = this.f64542g;
                    if (j3 != -1) {
                        if (a2.f64438i == -1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        C27245k.m54238a(z7, "maximum weight was already set to %s", a2.f64438i);
                        if (a2.f64437h == -1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        C27245k.m54238a(z8, "maximum size was already set to %s", a2.f64437h);
                        a2.f64438i = j3;
                        if (j3 >= 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        C27245k.m54236a(z9, "maximum weight must not be negative");
                    }
                } else {
                    long j4 = this.f64542g;
                    if (j4 != -1) {
                        a2.mo45358a(j4);
                    }
                }
                AbstractC27259t tVar = this.f64546k;
                if (tVar != null) {
                    if (a2.f64448s != null) {
                        z15 = false;
                    }
                    C27245k.m54243b(z15);
                    a2.f64448s = (AbstractC27259t) C27245k.m54229a(tVar);
                }
                this.f64548m = (AbstractC27264b<K1, V1>) a2.mo45363c();
                return;
            }
            throw new IllegalStateException(C27245k.m54233a("concurrency level was already set to %s", Integer.valueOf(i2)));
        }

        private C27308l(EnumC27313p pVar, EnumC27313p pVar2, AbstractC27231d<Object> dVar, AbstractC27231d<Object> dVar2, long j, long j2, long j3, AbstractC27345p<K, V> pVar3, int i, AbstractC27340m<? super K, ? super V> mVar, AbstractC27259t tVar, AbstractC27271d<? super K, V> dVar3) {
            this.f64536a = pVar;
            this.f64537b = pVar2;
            this.f64538c = dVar;
            this.f64539d = dVar2;
            this.f64540e = j;
            this.f64541f = j2;
            this.f64542g = j3;
            this.f64543h = pVar3;
            this.f64544i = i;
            this.f64545j = mVar;
            this.f64546k = (tVar == AbstractC27259t.f64422a || tVar == C27265c.f64432d) ? null : tVar;
            this.f64547l = dVar3;
        }
    }

    /* renamed from: com.google.c.b.g$o */
    static class C27312o<K, V> extends SoftReference<V> implements AbstractC27323w<K, V> {

        /* renamed from: a */
        final AbstractC27333k<K, V> f64570a;

        static {
            Covode.recordClassIndex(32892);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final int mo45404a() {
            return 1;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final void mo45406a(V v) {
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: c */
        public final boolean mo45408c() {
            return false;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: d */
        public final boolean mo45409d() {
            return true;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: b */
        public final AbstractC27333k<K, V> mo45407b() {
            return this.f64570a;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: e */
        public final V mo45410e() {
            return get();
        }

        C27312o(ReferenceQueue<V> referenceQueue, V v, AbstractC27333k<K, V> kVar) {
            super(v, referenceQueue);
            this.f64570a = kVar;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final AbstractC27323w<K, V> mo45405a(ReferenceQueue<V> referenceQueue, V v, AbstractC27333k<K, V> kVar) {
            return new C27312o(referenceQueue, v, kVar);
        }
    }

    /* renamed from: com.google.c.b.g$q */
    static final class C27317q<K, V> extends C27319s<K, V> {

        /* renamed from: a */
        volatile long f64575a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC27333k<K, V> f64576b = EnumC27309m.INSTANCE;

        /* renamed from: c */
        AbstractC27333k<K, V> f64577c = EnumC27309m.INSTANCE;

        static {
            Covode.recordClassIndex(32897);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: e */
        public final long mo45433e() {
            return this.f64575a;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: f */
        public final AbstractC27333k<K, V> mo45434f() {
            return this.f64576b;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: g */
        public final AbstractC27333k<K, V> mo45435g() {
            return this.f64577c;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final void mo45423a(long j) {
            this.f64575a = j;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public final void mo45428b(AbstractC27333k<K, V> kVar) {
            this.f64577c = kVar;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final void mo45425a(AbstractC27333k<K, V> kVar) {
            this.f64576b = kVar;
        }

        C27317q(K k, int i, AbstractC27333k<K, V> kVar) {
            super(k, i, kVar);
        }
    }

    /* renamed from: com.google.c.b.g$r */
    static final class C27318r<K, V> extends C27319s<K, V> {

        /* renamed from: a */
        volatile long f64578a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC27333k<K, V> f64579b = EnumC27309m.INSTANCE;

        /* renamed from: c */
        AbstractC27333k<K, V> f64580c = EnumC27309m.INSTANCE;

        /* renamed from: d */
        volatile long f64581d = Long.MAX_VALUE;

        /* renamed from: e */
        AbstractC27333k<K, V> f64582e = EnumC27309m.INSTANCE;

        /* renamed from: f */
        AbstractC27333k<K, V> f64583f = EnumC27309m.INSTANCE;

        static {
            Covode.recordClassIndex(32898);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: e */
        public final long mo45433e() {
            return this.f64578a;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: f */
        public final AbstractC27333k<K, V> mo45434f() {
            return this.f64579b;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: g */
        public final AbstractC27333k<K, V> mo45435g() {
            return this.f64580c;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: h */
        public final long mo45436h() {
            return this.f64581d;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: i */
        public final AbstractC27333k<K, V> mo45437i() {
            return this.f64582e;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: j */
        public final AbstractC27333k<K, V> mo45438j() {
            return this.f64583f;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final void mo45423a(long j) {
            this.f64578a = j;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public final void mo45427b(long j) {
            this.f64581d = j;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: c */
        public final void mo45430c(AbstractC27333k<K, V> kVar) {
            this.f64582e = kVar;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: d */
        public final void mo45432d(AbstractC27333k<K, V> kVar) {
            this.f64583f = kVar;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final void mo45425a(AbstractC27333k<K, V> kVar) {
            this.f64579b = kVar;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public final void mo45428b(AbstractC27333k<K, V> kVar) {
            this.f64580c = kVar;
        }

        C27318r(K k, int i, AbstractC27333k<K, V> kVar) {
            super(k, i, kVar);
        }
    }

    /* renamed from: com.google.c.b.g$s */
    static class C27319s<K, V> extends AbstractC27286b<K, V> {

        /* renamed from: g */
        final K f64584g;

        /* renamed from: h */
        final int f64585h;

        /* renamed from: i */
        final AbstractC27333k<K, V> f64586i;

        /* renamed from: j */
        volatile AbstractC27323w<K, V> f64587j = ((AbstractC27323w<K, V>) ConcurrentMapC27275g.f64461u);

        static {
            Covode.recordClassIndex(32899);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final AbstractC27323w<K, V> mo45422a() {
            return this.f64587j;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public final AbstractC27333k<K, V> mo45426b() {
            return this.f64586i;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: c */
        public final int mo45429c() {
            return this.f64585h;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: d */
        public final K mo45431d() {
            return this.f64584g;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final void mo45424a(AbstractC27323w<K, V> wVar) {
            this.f64587j = wVar;
        }

        C27319s(K k, int i, AbstractC27333k<K, V> kVar) {
            this.f64584g = k;
            this.f64585h = i;
            this.f64586i = kVar;
        }
    }

    /* renamed from: com.google.c.b.g$t */
    static class C27320t<K, V> implements AbstractC27323w<K, V> {

        /* renamed from: a */
        final V f64588a;

        static {
            Covode.recordClassIndex(32900);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final int mo45404a() {
            return 1;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final AbstractC27323w<K, V> mo45405a(ReferenceQueue<V> referenceQueue, V v, AbstractC27333k<K, V> kVar) {
            return this;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final void mo45406a(V v) {
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: b */
        public final AbstractC27333k<K, V> mo45407b() {
            return null;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: c */
        public final boolean mo45408c() {
            return false;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: d */
        public final boolean mo45409d() {
            return true;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        public final V get() {
            return this.f64588a;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: e */
        public final V mo45410e() {
            return get();
        }

        C27320t(V v) {
            this.f64588a = v;
        }
    }

    /* renamed from: com.google.c.b.g$u */
    static final class C27321u<K, V> extends C27319s<K, V> {

        /* renamed from: a */
        volatile long f64589a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC27333k<K, V> f64590b = EnumC27309m.INSTANCE;

        /* renamed from: c */
        AbstractC27333k<K, V> f64591c = EnumC27309m.INSTANCE;

        static {
            Covode.recordClassIndex(32901);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: h */
        public final long mo45436h() {
            return this.f64589a;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: i */
        public final AbstractC27333k<K, V> mo45437i() {
            return this.f64590b;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: j */
        public final AbstractC27333k<K, V> mo45438j() {
            return this.f64591c;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public final void mo45427b(long j) {
            this.f64589a = j;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: c */
        public final void mo45430c(AbstractC27333k<K, V> kVar) {
            this.f64590b = kVar;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: d */
        public final void mo45432d(AbstractC27333k<K, V> kVar) {
            this.f64591c = kVar;
        }

        C27321u(K k, int i, AbstractC27333k<K, V> kVar) {
            super(k, i, kVar);
        }
    }

    /* renamed from: com.google.c.b.g$y */
    static final class C27325y<K, V> extends C27279aa<K, V> {

        /* renamed from: a */
        volatile long f64595a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC27333k<K, V> f64596b = EnumC27309m.INSTANCE;

        /* renamed from: c */
        AbstractC27333k<K, V> f64597c = EnumC27309m.INSTANCE;

        static {
            Covode.recordClassIndex(32905);
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: e */
        public final long mo45433e() {
            return this.f64595a;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: f */
        public final AbstractC27333k<K, V> mo45434f() {
            return this.f64596b;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: g */
        public final AbstractC27333k<K, V> mo45435g() {
            return this.f64597c;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: a */
        public final void mo45423a(long j) {
            this.f64595a = j;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: b */
        public final void mo45428b(AbstractC27333k<K, V> kVar) {
            this.f64597c = kVar;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: a */
        public final void mo45425a(AbstractC27333k<K, V> kVar) {
            this.f64596b = kVar;
        }

        C27325y(ReferenceQueue<K> referenceQueue, K k, int i, AbstractC27333k<K, V> kVar) {
            super(referenceQueue, k, i, kVar);
        }
    }

    /* renamed from: com.google.c.b.g$z */
    static final class C27326z<K, V> extends C27279aa<K, V> {

        /* renamed from: a */
        volatile long f64598a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC27333k<K, V> f64599b = EnumC27309m.INSTANCE;

        /* renamed from: c */
        AbstractC27333k<K, V> f64600c = EnumC27309m.INSTANCE;

        /* renamed from: d */
        volatile long f64601d = Long.MAX_VALUE;

        /* renamed from: e */
        AbstractC27333k<K, V> f64602e = EnumC27309m.INSTANCE;

        /* renamed from: f */
        AbstractC27333k<K, V> f64603f = EnumC27309m.INSTANCE;

        static {
            Covode.recordClassIndex(32906);
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: e */
        public final long mo45433e() {
            return this.f64598a;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: f */
        public final AbstractC27333k<K, V> mo45434f() {
            return this.f64599b;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: g */
        public final AbstractC27333k<K, V> mo45435g() {
            return this.f64600c;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: h */
        public final long mo45436h() {
            return this.f64601d;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: i */
        public final AbstractC27333k<K, V> mo45437i() {
            return this.f64602e;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: j */
        public final AbstractC27333k<K, V> mo45438j() {
            return this.f64603f;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: a */
        public final void mo45423a(long j) {
            this.f64598a = j;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: b */
        public final void mo45427b(long j) {
            this.f64601d = j;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: c */
        public final void mo45430c(AbstractC27333k<K, V> kVar) {
            this.f64602e = kVar;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: d */
        public final void mo45432d(AbstractC27333k<K, V> kVar) {
            this.f64603f = kVar;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: a */
        public final void mo45425a(AbstractC27333k<K, V> kVar) {
            this.f64599b = kVar;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27279aa
        /* renamed from: b */
        public final void mo45428b(AbstractC27333k<K, V> kVar) {
            this.f64600c = kVar;
        }

        C27326z(ReferenceQueue<K> referenceQueue, K k, int i, AbstractC27333k<K, V> kVar) {
            super(referenceQueue, k, i, kVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.b.g$n */
    public static class C27310n<K, V> extends ReentrantLock {

        /* renamed from: a */
        final ConcurrentMapC27275g<K, V> f64551a;

        /* renamed from: b */
        volatile int f64552b;

        /* renamed from: c */
        long f64553c;

        /* renamed from: d */
        int f64554d;

        /* renamed from: e */
        int f64555e;

        /* renamed from: f */
        volatile AtomicReferenceArray<AbstractC27333k<K, V>> f64556f;

        /* renamed from: g */
        final long f64557g;

        /* renamed from: h */
        final ReferenceQueue<K> f64558h;

        /* renamed from: i */
        final ReferenceQueue<V> f64559i;

        /* renamed from: j */
        final Queue<AbstractC27333k<K, V>> f64560j;

        /* renamed from: k */
        final AtomicInteger f64561k = new AtomicInteger();

        /* renamed from: l */
        final Queue<AbstractC27333k<K, V>> f64562l;

        /* renamed from: m */
        final Queue<AbstractC27333k<K, V>> f64563m;

        /* renamed from: n */
        final AbstractC27261a.AbstractC27263b f64564n;

        static {
            Covode.recordClassIndex(32890);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final V mo45484a(K k, int i, AbstractC27271d<? super K, V> dVar) {
            AbstractC27333k<K, V> e;
            C27245k.m54229a(k);
            C27245k.m54229a(dVar);
            try {
                if (!(this.f64552b == 0 || (e = m54484e(k, i)) == null)) {
                    long a = this.f64551a.f64478q.mo45347a();
                    V a2 = mo45482a(e, a);
                    if (a2 != null) {
                        m54477b(e, a);
                        this.f64564n.mo45348a();
                        V a3 = m54464a(e, k, i, a2, a, dVar);
                        mo45488a();
                        return a3;
                    }
                    AbstractC27323w<K, V> a4 = e.mo45422a();
                    if (a4.mo45408c()) {
                        V a5 = m54465a(e, k, a4);
                        mo45488a();
                        return a5;
                    }
                }
                V b = m54474b((Object) k, i, (AbstractC27271d) dVar);
                mo45488a();
                return b;
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof Error) {
                    throw new C27638f((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new C27670x(cause);
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                mo45488a();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V mo45485a(K r6, int r7, com.google.p1998c.p2000b.ConcurrentMapC27275g.C27304j<K, V> r8, com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q<V> r9) {
            /*
                r5 = this;
                java.lang.Object r4 = com.google.p1998c.p2006h.p2007a.C27671y.m55319a(r9)     // Catch:{ all -> 0x0030 }
                if (r4 == 0) goto L_0x0013
                com.google.c.b.a$b r2 = r5.f64564n     // Catch:{ all -> 0x002e }
                long r0 = r8.mo45480f()     // Catch:{ all -> 0x002e }
                r2.mo45349a(r0)     // Catch:{ all -> 0x002e }
                r5.m54471a(r6, r7, r8, r4)     // Catch:{ all -> 0x002e }
                return r4
            L_0x0013:
                com.google.c.b.d$a r2 = new com.google.c.b.d$a     // Catch:{ all -> 0x002e }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002e }
                java.lang.String r0 = "CacheLoader returned null for key "
                r1.<init>(r0)     // Catch:{ all -> 0x002e }
                java.lang.StringBuilder r1 = r1.append(r6)     // Catch:{ all -> 0x002e }
                java.lang.String r0 = "."
                java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x002e }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x002e }
                r2.<init>(r0)     // Catch:{ all -> 0x002e }
                throw r2     // Catch:{ all -> 0x002e }
            L_0x002e:
                r3 = move-exception
                goto L_0x0032
            L_0x0030:
                r3 = move-exception
                r4 = 0
            L_0x0032:
                if (r4 != 0) goto L_0x0040
                com.google.c.b.a$b r2 = r5.f64564n
                long r0 = r8.mo45480f()
                r2.mo45351b(r0)
                r5.m54470a(r6, r7, r8)
            L_0x0040:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2000b.ConcurrentMapC27275g.C27310n.mo45485a(java.lang.Object, int, com.google.c.b.g$j, com.google.c.h.a.q):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo45490a(K k, V v, int i, EnumC27334l lVar) {
            this.f64553c -= (long) i;
            if (lVar.mo45517a()) {
                this.f64564n.mo45352c();
            }
            if (this.f64551a.f64476o != ConcurrentMapC27275g.f64462v) {
                this.f64551a.f64476o.offer(C27341n.create(k, v, lVar));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final V mo45482a(AbstractC27333k<K, V> kVar, long j) {
            if (kVar.mo45431d() == null) {
                m54479c();
                return null;
            }
            V v = kVar.mo45422a().get();
            if (v == null) {
                m54479c();
                return null;
            } else if (!this.f64551a.mo45377a(kVar, j)) {
                return v;
            } else {
                m54475b(j);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final V mo45483a(Object obj, int i) {
            try {
                if (this.f64552b != 0) {
                    long a = this.f64551a.f64478q.mo45347a();
                    AbstractC27333k<K, V> a2 = m54462a(obj, i, a);
                    if (a2 == null) {
                        return null;
                    }
                    V v = a2.mo45422a().get();
                    if (v != null) {
                        m54477b(a2, a);
                        V a3 = m54464a(a2, a2.mo45431d(), i, v, a, this.f64551a.f64481t);
                        mo45488a();
                        return a3;
                    }
                    m54479c();
                }
                mo45488a();
                return null;
            } finally {
                mo45488a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final V mo45487a(K k, int i, V v, boolean z) {
            int i2;
            lock();
            try {
                long a = this.f64551a.f64478q.mo45347a();
                mo45489a(a);
                if (this.f64552b + 1 > this.f64555e) {
                    m54489i();
                }
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo45426b()) {
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() == i && d != null && this.f64551a.f64467f.mo45316a(k, d)) {
                        AbstractC27323w<K, V> a2 = kVar2.mo45422a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            this.f64554d++;
                            if (a2.mo45409d()) {
                                mo45490a(k, v2, a2.mo45404a(), EnumC27334l.COLLECTED);
                                m54468a(kVar2, v, a);
                                i2 = this.f64552b;
                            } else {
                                m54468a(kVar2, v, a);
                                i2 = this.f64552b + 1;
                            }
                            this.f64552b = i2;
                            m54467a(kVar2);
                            return null;
                        } else if (z) {
                            m54481c(kVar2, a);
                            unlock();
                            mo45494b();
                            return v2;
                        } else {
                            this.f64554d++;
                            mo45490a(k, v2, a2.mo45404a(), EnumC27334l.REPLACED);
                            m54468a(kVar2, v, a);
                            m54467a(kVar2);
                            unlock();
                            mo45494b();
                            return v2;
                        }
                    }
                }
                this.f64554d++;
                AbstractC27333k<K, V> a3 = m54463a((Object) k, i, (AbstractC27333k) kVar);
                m54468a(a3, v, a);
                atomicReferenceArray.set(length, a3);
                this.f64552b++;
                m54467a(a3);
                unlock();
                mo45494b();
                return null;
            } finally {
                unlock();
                mo45494b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo45493a(K k, int i, V v, V v2) {
            lock();
            try {
                long a = this.f64551a.f64478q.mo45347a();
                mo45489a(a);
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo45426b()) {
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() == i && d != null && this.f64551a.f64467f.mo45316a(k, d)) {
                        AbstractC27323w<K, V> a2 = kVar2.mo45422a();
                        V v3 = a2.get();
                        if (v3 == null) {
                            if (a2.mo45409d()) {
                                this.f64554d++;
                                atomicReferenceArray.set(length, m54461a(kVar, kVar2, d, v3, a2, EnumC27334l.COLLECTED));
                                this.f64552b--;
                            }
                            return false;
                        } else if (this.f64551a.f64468g.mo45316a(v, v3)) {
                            this.f64554d++;
                            mo45490a(k, v3, a2.mo45404a(), EnumC27334l.REPLACED);
                            m54468a(kVar2, v2, a);
                            m54467a(kVar2);
                            unlock();
                            mo45494b();
                            return true;
                        } else {
                            m54481c(kVar2, a);
                            unlock();
                            mo45494b();
                            return false;
                        }
                    }
                }
                unlock();
                mo45494b();
                return false;
            } finally {
                unlock();
                mo45494b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final V mo45486a(K k, int i, V v) {
            lock();
            try {
                long a = this.f64551a.f64478q.mo45347a();
                mo45489a(a);
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo45426b()) {
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() == i && d != null && this.f64551a.f64467f.mo45316a(k, d)) {
                        AbstractC27323w<K, V> a2 = kVar2.mo45422a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            if (a2.mo45409d()) {
                                this.f64554d++;
                                atomicReferenceArray.set(length, m54461a(kVar, kVar2, d, v2, a2, EnumC27334l.COLLECTED));
                                this.f64552b--;
                            }
                            return null;
                        }
                        this.f64554d++;
                        mo45490a(k, v2, a2.mo45404a(), EnumC27334l.REPLACED);
                        m54468a(kVar2, v, a);
                        m54467a(kVar2);
                        unlock();
                        mo45494b();
                        return v2;
                    }
                }
                unlock();
                mo45494b();
                return null;
            } finally {
                unlock();
                mo45494b();
            }
        }

        /* renamed from: a */
        private boolean m54471a(K k, int i, C27304j<K, V> jVar, V v) {
            lock();
            try {
                long a = this.f64551a.f64478q.mo45347a();
                mo45489a(a);
                int i2 = this.f64552b + 1;
                if (i2 > this.f64555e) {
                    m54489i();
                    i2 = this.f64552b + 1;
                }
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo45426b()) {
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() == i && d != null && this.f64551a.f64467f.mo45316a(k, d)) {
                        AbstractC27323w<K, V> a2 = kVar2.mo45422a();
                        V v2 = a2.get();
                        if (jVar == a2 || (v2 == null && a2 != ConcurrentMapC27275g.f64461u)) {
                            this.f64554d++;
                            if (jVar.mo45409d()) {
                                mo45490a(k, v2, jVar.mo45404a(), v2 == null ? EnumC27334l.COLLECTED : EnumC27334l.REPLACED);
                                i2--;
                            }
                            m54468a(kVar2, v, a);
                            this.f64552b = i2;
                            m54467a(kVar2);
                            return true;
                        }
                        mo45490a(k, v, 0, EnumC27334l.REPLACED);
                        unlock();
                        mo45494b();
                        return false;
                    }
                }
                this.f64554d++;
                AbstractC27333k<K, V> a3 = m54463a((Object) k, i, (AbstractC27333k) kVar);
                m54468a(a3, v, a);
                atomicReferenceArray.set(length, a3);
                this.f64552b = i2;
                m54467a(a3);
                unlock();
                mo45494b();
                return true;
            } finally {
                unlock();
                mo45494b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo45496b(Object obj, int i, Object obj2) {
            EnumC27334l lVar;
            lock();
            try {
                mo45489a(this.f64551a.f64478q.mo45347a());
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo45426b()) {
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() == i && d != null && this.f64551a.f64467f.mo45316a(obj, d)) {
                        AbstractC27323w<K, V> a = kVar2.mo45422a();
                        V v = a.get();
                        if (this.f64551a.f64468g.mo45316a(obj2, v)) {
                            lVar = EnumC27334l.EXPLICIT;
                        } else if (v != null || !a.mo45409d()) {
                            unlock();
                            mo45494b();
                            return false;
                        } else {
                            lVar = EnumC27334l.COLLECTED;
                        }
                        this.f64554d++;
                        atomicReferenceArray.set(length, m54461a(kVar, kVar2, d, v, a, lVar));
                        this.f64552b--;
                        if (lVar != EnumC27334l.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                mo45494b();
                return false;
            } finally {
                unlock();
                mo45494b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo45491a(AbstractC27333k<K, V> kVar, int i) {
            lock();
            try {
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = i & (atomicReferenceArray.length() - 1);
                AbstractC27333k<K, V> kVar2 = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.mo45426b()) {
                    if (kVar3 == kVar) {
                        this.f64554d++;
                        atomicReferenceArray.set(length, m54461a(kVar2, kVar3, kVar3.mo45431d(), kVar3.mo45422a().get(), kVar3.mo45422a(), EnumC27334l.COLLECTED));
                        this.f64552b--;
                        return true;
                    }
                }
                unlock();
                mo45494b();
                return false;
            } finally {
                unlock();
                mo45494b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo45492a(K k, int i, AbstractC27323w<K, V> wVar) {
            lock();
            try {
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo45426b()) {
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() == i && d != null && this.f64551a.f64467f.mo45316a(k, d)) {
                        if (kVar2.mo45422a() == wVar) {
                            this.f64554d++;
                            atomicReferenceArray.set(length, m54461a(kVar, kVar2, d, wVar.get(), wVar, EnumC27334l.COLLECTED));
                            this.f64552b--;
                            return true;
                        } else {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                mo45494b();
                            }
                            return false;
                        }
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo45494b();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo45494b();
                }
            }
        }

        /* renamed from: a */
        private boolean m54470a(K k, int i, C27304j<K, V> jVar) {
            lock();
            try {
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo45426b()) {
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() == i && d != null && this.f64551a.f64467f.mo45316a(k, d)) {
                        if (kVar2.mo45422a() == jVar) {
                            if (jVar.mo45409d()) {
                                kVar2.mo45424a(jVar.f64529a);
                            } else {
                                atomicReferenceArray.set(length, m54473b(kVar, kVar2));
                            }
                            return true;
                        } else {
                            unlock();
                            mo45494b();
                            return false;
                        }
                    }
                }
                unlock();
                mo45494b();
                return false;
            } finally {
                unlock();
                mo45494b();
            }
        }

        /* renamed from: a */
        private boolean m54469a(AbstractC27333k<K, V> kVar, int i, EnumC27334l lVar) {
            AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
            int length = i & (atomicReferenceArray.length() - 1);
            AbstractC27333k<K, V> kVar2 = atomicReferenceArray.get(length);
            for (AbstractC27333k<K, V> kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.mo45426b()) {
                if (kVar3 == kVar) {
                    this.f64554d++;
                    atomicReferenceArray.set(length, m54461a(kVar2, kVar3, kVar3.mo45431d(), kVar3.mo45422a().get(), kVar3.mo45422a(), lVar));
                    this.f64552b--;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo45488a() {
            if ((this.f64561k.incrementAndGet() & 63) == 0) {
                m54490j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo45489a(long j) {
            if (tryLock()) {
                try {
                    m54483d();
                    m54480c(j);
                    this.f64561k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: j */
        private void m54490j() {
            mo45489a(this.f64551a.f64478q.mo45347a());
            mo45494b();
        }

        /* renamed from: c */
        private void m54479c() {
            if (tryLock()) {
                try {
                    m54483d();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: d */
        private void m54483d() {
            if (this.f64551a.mo45390h()) {
                m54485e();
            }
            if (this.f64551a.mo45391i()) {
                m54486f();
            }
        }

        /* renamed from: e */
        private void m54485e() {
            int i = 0;
            do {
                Reference<? extends K> poll = this.f64558h.poll();
                if (poll != null) {
                    this.f64551a.mo45375a((AbstractC27333k) ((AbstractC27333k) poll));
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: f */
        private void m54486f() {
            int i = 0;
            do {
                Reference<? extends V> poll = this.f64559i.poll();
                if (poll != null) {
                    this.f64551a.mo45374a((AbstractC27323w) ((AbstractC27323w) poll));
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: g */
        private void m54487g() {
            while (true) {
                AbstractC27333k<K, V> poll = this.f64560j.poll();
                if (poll == null) {
                    return;
                }
                if (this.f64563m.contains(poll)) {
                    this.f64563m.add(poll);
                }
            }
        }

        /* renamed from: h */
        private AbstractC27333k<K, V> m54488h() {
            for (AbstractC27333k<K, V> kVar : this.f64563m) {
                if (kVar.mo45422a().mo45404a() > 0) {
                    return kVar;
                }
            }
            throw new AssertionError();
        }

        /* renamed from: i */
        private void m54489i() {
            AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f64552b;
                AtomicReferenceArray<AbstractC27333k<K, V>> a = m54466a(length << 1);
                this.f64555e = (a.length() * 3) / 4;
                int length2 = a.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    AbstractC27333k<K, V> kVar = atomicReferenceArray.get(i2);
                    if (kVar != null) {
                        AbstractC27333k<K, V> b = kVar.mo45426b();
                        int c = kVar.mo45429c() & length2;
                        if (b == null) {
                            a.set(c, kVar);
                        } else {
                            AbstractC27333k<K, V> kVar2 = kVar;
                            do {
                                int c2 = b.mo45429c() & length2;
                                if (c2 != c) {
                                    kVar2 = b;
                                    c = c2;
                                }
                                b = b.mo45426b();
                            } while (b != null);
                            a.set(c, kVar2);
                            while (kVar != kVar2) {
                                int c3 = kVar.mo45429c() & length2;
                                AbstractC27333k<K, V> a2 = m54460a(kVar, a.get(c3));
                                if (a2 != null) {
                                    a.set(c3, a2);
                                } else {
                                    m54476b(kVar);
                                    i--;
                                }
                                kVar = kVar.mo45426b();
                            }
                        }
                    }
                }
                this.f64556f = a;
                this.f64552b = i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo45494b() {
            if (!isHeldByCurrentThread()) {
                this.f64551a.mo45393j();
            }
        }

        /* renamed from: a */
        private static AtomicReferenceArray<AbstractC27333k<K, V>> m54466a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: b */
        private AbstractC27333k<K, V> m54472b(int i) {
            AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: b */
        private void m54475b(long j) {
            if (tryLock()) {
                try {
                    m54480c(j);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        private void m54476b(AbstractC27333k<K, V> kVar) {
            K d = kVar.mo45431d();
            kVar.mo45429c();
            mo45490a(d, kVar.mo45422a().get(), kVar.mo45422a().mo45404a(), EnumC27334l.COLLECTED);
            this.f64562l.remove(kVar);
            this.f64563m.remove(kVar);
        }

        /* renamed from: c */
        private void m54480c(long j) {
            AbstractC27333k<K, V> peek;
            AbstractC27333k<K, V> peek2;
            m54487g();
            do {
                peek = this.f64562l.peek();
                if (peek == null || !this.f64551a.mo45377a(peek, j)) {
                    do {
                        peek2 = this.f64563m.peek();
                        if (peek2 == null || !this.f64551a.mo45377a(peek2, j)) {
                            return;
                        }
                    } while (m54469a((AbstractC27333k) peek2, peek2.mo45429c(), EnumC27334l.EXPIRED));
                    throw new AssertionError();
                }
            } while (m54469a((AbstractC27333k) peek, peek.mo45429c(), EnumC27334l.EXPIRED));
            throw new AssertionError();
        }

        /* renamed from: a */
        private void m54467a(AbstractC27333k<K, V> kVar) {
            if (this.f64551a.mo45376a()) {
                m54487g();
                if (((long) kVar.mo45422a().mo45404a()) <= this.f64557g || m54469a((AbstractC27333k) kVar, kVar.mo45429c(), EnumC27334l.SIZE)) {
                    while (this.f64553c > this.f64557g) {
                        AbstractC27333k<K, V> h = m54488h();
                        if (!m54469a((AbstractC27333k) h, h.mo45429c(), EnumC27334l.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        private AbstractC27333k<K, V> m54473b(AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
            int i = this.f64552b;
            AbstractC27333k<K, V> b = kVar2.mo45426b();
            while (kVar != kVar2) {
                AbstractC27333k<K, V> a = m54460a(kVar, b);
                if (a != null) {
                    b = a;
                } else {
                    m54476b(kVar);
                    i--;
                }
                kVar = kVar.mo45426b();
            }
            this.f64552b = i;
            return b;
        }

        /* renamed from: a */
        private AbstractC27333k<K, V> m54460a(AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
            if (kVar.mo45431d() == null) {
                return null;
            }
            AbstractC27323w<K, V> a = kVar.mo45422a();
            V v = a.get();
            if (v == null && a.mo45409d()) {
                return null;
            }
            AbstractC27333k<K, V> a2 = this.f64551a.f64479r.mo45464a(this, kVar, kVar2);
            a2.mo45424a(a.mo45405a(this.f64559i, v, a2));
            return a2;
        }

        /* renamed from: e */
        private AbstractC27333k<K, V> m54484e(Object obj, int i) {
            for (AbstractC27333k<K, V> b = m54472b(i); b != null; b = b.mo45426b()) {
                if (b.mo45429c() == i) {
                    K d = b.mo45431d();
                    if (d == null) {
                        m54479c();
                    } else if (this.f64551a.f64467f.mo45316a(obj, d)) {
                        return b;
                    }
                }
            }
            return null;
        }

        /* renamed from: c */
        private void m54481c(AbstractC27333k<K, V> kVar, long j) {
            if (this.f64551a.mo45383d()) {
                kVar.mo45423a(j);
            }
            this.f64563m.add(kVar);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: d */
        private C27304j<K, V> m54482d(K k, int i) {
            lock();
            try {
                long a = this.f64551a.f64478q.mo45347a();
                mo45489a(a);
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo45426b()) {
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() == i && d != null && this.f64551a.f64467f.mo45316a(k, d)) {
                        AbstractC27323w<K, V> a2 = kVar2.mo45422a();
                        if (!a2.mo45408c()) {
                            if (a - kVar2.mo45436h() >= this.f64551a.f64475n) {
                                this.f64554d++;
                                C27304j<K, V> jVar = new C27304j<>(a2);
                                kVar2.mo45424a(jVar);
                                unlock();
                                mo45494b();
                                return jVar;
                            }
                        }
                        unlock();
                        mo45494b();
                        return null;
                    }
                }
                this.f64554d++;
                C27304j<K, V> jVar2 = new C27304j<>();
                AbstractC27333k<K, V> a3 = m54463a((Object) k, i, (AbstractC27333k) kVar);
                a3.mo45424a(jVar2);
                atomicReferenceArray.set(length, a3);
                unlock();
                mo45494b();
                return jVar2;
            } catch (Throwable th) {
                unlock();
                mo45494b();
                throw th;
            }
        }

        /* renamed from: b */
        private void m54477b(AbstractC27333k<K, V> kVar, long j) {
            if (this.f64551a.mo45383d()) {
                kVar.mo45423a(j);
            }
            this.f64560j.add(kVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final V mo45497c(Object obj, int i) {
            EnumC27334l lVar;
            lock();
            try {
                mo45489a(this.f64551a.f64478q.mo45347a());
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                for (AbstractC27333k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo45426b()) {
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() == i && d != null && this.f64551a.f64467f.mo45316a(obj, d)) {
                        AbstractC27323w<K, V> a = kVar2.mo45422a();
                        V v = a.get();
                        if (v != null) {
                            lVar = EnumC27334l.EXPLICIT;
                        } else if (a.mo45409d()) {
                            lVar = EnumC27334l.COLLECTED;
                        } else {
                            unlock();
                            mo45494b();
                            return null;
                        }
                        this.f64554d++;
                        atomicReferenceArray.set(length, m54461a(kVar, kVar2, d, v, a, lVar));
                        this.f64552b--;
                        return v;
                    }
                }
                unlock();
                mo45494b();
                return null;
            } finally {
                unlock();
                mo45494b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo45495b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f64552b != 0) {
                    AbstractC27333k<K, V> a = m54462a(obj, i, this.f64551a.f64478q.mo45347a());
                    if (a == null) {
                        return false;
                    }
                    if (a.mo45422a().get() != null) {
                        z = true;
                    }
                    mo45488a();
                    return z;
                }
                mo45488a();
                return false;
            } finally {
                mo45488a();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.b.g$d */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        private AbstractC27333k<K, V> m54463a(K k, int i, AbstractC27333k<K, V> kVar) {
            return this.f64551a.f64479r.mo45465a(this, C27245k.m54229a(k), i, kVar);
        }

        /* renamed from: a */
        private AbstractC27333k<K, V> m54462a(Object obj, int i, long j) {
            AbstractC27333k<K, V> e = m54484e(obj, i);
            if (e == null) {
                return null;
            }
            if (!this.f64551a.mo45377a(e, j)) {
                return e;
            }
            m54475b(j);
            return null;
        }

        /* renamed from: c */
        private V m54478c(final K k, final int i, AbstractC27271d<? super K, V> dVar) {
            final C27304j<K, V> d = m54482d(k, i);
            if (d == null) {
                return null;
            }
            final AbstractFutureC27655q<V> a = d.mo45477a(k, dVar);
            a.mo5481a(new Runnable() {
                /* class com.google.p1998c.p2000b.ConcurrentMapC27275g.C27310n.RunnableC273111 */

                static {
                    Covode.recordClassIndex(32891);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.b.g$n */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    try {
                        C27310n.this.mo45485a(k, i, d, a);
                    } catch (Throwable th) {
                        ConcurrentMapC27275g.f64460a.log(Level.WARNING, "Exception thrown during refresh", th);
                        d.mo45478a(th);
                    }
                }
            }, C27659u.EnumC27662a.INSTANCE);
            if (a.isDone()) {
                try {
                    return (V) C27671y.m55319a(a);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* renamed from: b */
        private V m54474b(K k, int i, AbstractC27271d<? super K, V> dVar) {
            C27304j<K, V> jVar;
            AbstractC27323w<K, V> wVar;
            boolean z;
            V a;
            MethodCollector.m26663i(2797);
            lock();
            try {
                long a2 = this.f64551a.f64478q.mo45347a();
                mo45489a(a2);
                int i2 = this.f64552b - 1;
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64556f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(length);
                AbstractC27333k<K, V> kVar2 = kVar;
                while (true) {
                    jVar = null;
                    if (kVar2 == null) {
                        wVar = null;
                        break;
                    }
                    K d = kVar2.mo45431d();
                    if (kVar2.mo45429c() != i || d == null || !this.f64551a.f64467f.mo45316a(k, d)) {
                        kVar2 = kVar2.mo45426b();
                    } else {
                        wVar = kVar2.mo45422a();
                        if (wVar.mo45408c()) {
                            z = false;
                        } else {
                            V v = wVar.get();
                            if (v == null) {
                                mo45490a(d, v, wVar.mo45404a(), EnumC27334l.COLLECTED);
                            } else if (this.f64551a.mo45377a(kVar2, a2)) {
                                mo45490a(d, v, wVar.mo45404a(), EnumC27334l.EXPIRED);
                            } else {
                                m54481c(kVar2, a2);
                                this.f64564n.mo45348a();
                                return v;
                            }
                            this.f64562l.remove(kVar2);
                            this.f64563m.remove(kVar2);
                            this.f64552b = i2;
                        }
                    }
                }
                z = true;
                if (z) {
                    jVar = new C27304j<>();
                    if (kVar2 == null) {
                        kVar2 = m54463a((Object) k, i, (AbstractC27333k) kVar);
                        kVar2.mo45424a(jVar);
                        atomicReferenceArray.set(length, kVar2);
                    } else {
                        kVar2.mo45424a(jVar);
                    }
                }
                unlock();
                mo45494b();
                if (z) {
                    try {
                        synchronized (kVar2) {
                            try {
                                a = mo45485a((Object) k, i, (C27304j) jVar, (AbstractFutureC27655q) jVar.mo45477a(k, dVar));
                            } catch (Throwable th) {
                                MethodCollector.m26664o(2797);
                                throw th;
                            }
                        }
                        return a;
                    } finally {
                        this.f64564n.mo45350b();
                        MethodCollector.m26664o(2797);
                    }
                } else {
                    V a3 = m54465a(kVar2, k, wVar);
                    MethodCollector.m26664o(2797);
                    return a3;
                }
            } finally {
                unlock();
                mo45494b();
                MethodCollector.m26664o(2797);
            }
        }

        /* renamed from: a */
        private V m54465a(AbstractC27333k<K, V> kVar, K k, AbstractC27323w<K, V> wVar) {
            if (wVar.mo45408c()) {
                C27245k.m54245b(!Thread.holdsLock(kVar), "Recursive load of: %s", k);
                try {
                    V e = wVar.mo45410e();
                    if (e != null) {
                        m54477b(kVar, this.f64551a.f64478q.mo45347a());
                        return e;
                    }
                    throw new AbstractC27271d.C27272a("CacheLoader returned null for key " + ((Object) k) + ".");
                } finally {
                    this.f64564n.mo45350b();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        private void m54468a(AbstractC27333k<K, V> kVar, V v, long j) {
            AbstractC27323w<K, V> a = kVar.mo45422a();
            C27245k.m54244b(true, (Object) "Weights must be non-negative");
            kVar.mo45424a(this.f64551a.f64470i.mo45500a(this, kVar, v));
            m54487g();
            this.f64553c++;
            if (this.f64551a.mo45383d()) {
                kVar.mo45423a(j);
            }
            if (this.f64551a.mo45387g()) {
                kVar.mo45427b(j);
            }
            this.f64563m.add(kVar);
            this.f64562l.add(kVar);
            a.mo45406a(v);
        }

        C27310n(ConcurrentMapC27275g<K, V> gVar, int i, long j, AbstractC27261a.AbstractC27263b bVar) {
            ReferenceQueue<K> referenceQueue;
            this.f64551a = gVar;
            this.f64557g = j;
            this.f64564n = (AbstractC27261a.AbstractC27263b) C27245k.m54229a(bVar);
            AtomicReferenceArray<AbstractC27333k<K, V>> a = m54466a(i);
            this.f64555e = (a.length() * 3) / 4;
            if (!gVar.mo45378b()) {
                int i2 = this.f64555e;
                if (((long) i2) == j) {
                    this.f64555e = i2 + 1;
                }
            }
            this.f64556f = a;
            ReferenceQueue<V> referenceQueue2 = null;
            if (gVar.mo45390h()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.f64558h = referenceQueue;
            this.f64559i = gVar.mo45391i() ? new ReferenceQueue<>() : referenceQueue2;
            this.f64560j = gVar.mo45386f() ? new ConcurrentLinkedQueue() : (Queue<AbstractC27333k<K, V>>) ConcurrentMapC27275g.f64462v;
            this.f64562l = gVar.mo45379c() ? new C27282ad() : (Queue<AbstractC27333k<K, V>>) ConcurrentMapC27275g.f64462v;
            this.f64563m = gVar.mo45386f() ? new C27287c() : (Queue<AbstractC27333k<K, V>>) ConcurrentMapC27275g.f64462v;
        }

        /* renamed from: a */
        private AbstractC27333k<K, V> m54461a(AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2, K k, V v, AbstractC27323w<K, V> wVar, EnumC27334l lVar) {
            mo45490a(k, v, wVar.mo45404a(), lVar);
            this.f64562l.remove(kVar2);
            this.f64563m.remove(kVar2);
            if (!wVar.mo45408c()) {
                return m54473b(kVar, kVar2);
            }
            wVar.mo45406a(null);
            return kVar;
        }

        /* renamed from: a */
        private V m54464a(AbstractC27333k<K, V> kVar, K k, int i, V v, long j, AbstractC27271d<? super K, V> dVar) {
            V c;
            if (!this.f64551a.mo45384e() || j - kVar.mo45436h() <= this.f64551a.f64475n || kVar.mo45422a().mo45408c() || (c = m54478c(k, i, dVar)) == null) {
                return v;
            }
            return c;
        }
    }

    /* renamed from: com.google.c.b.g$a */
    abstract class AbstractC27278a<T> extends AbstractSet<T> {

        /* renamed from: a */
        final ConcurrentMap<?, ?> f64485a;

        static {
            Covode.recordClassIndex(32858);
        }

        public void clear() {
            this.f64485a.clear();
        }

        public boolean isEmpty() {
            return this.f64485a.isEmpty();
        }

        public int size() {
            return this.f64485a.size();
        }

        public Object[] toArray() {
            return ConcurrentMapC27275g.m54310a((Collection) this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC27275g.m54310a((Collection) this).toArray(eArr);
        }

        AbstractC27278a(ConcurrentMap<?, ?> concurrentMap) {
            this.f64485a = concurrentMap;
        }
    }

    /* renamed from: com.google.c.b.g$e */
    final class C27299e extends ConcurrentMapC27275g<K, V>.AbstractC27301g {
        static {
            Covode.recordClassIndex(32879);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            return mo45470a();
        }

        C27299e() {
            super();
        }
    }

    /* renamed from: com.google.c.b.g$f */
    final class C27300f extends ConcurrentMapC27275g<K, V>.AbstractC27278a {
        static {
            Covode.recordClassIndex(32880);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C27299e();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && ConcurrentMapC27275g.this.remove(key, entry.getValue())) {
                return true;
            }
            return false;
        }

        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = ConcurrentMapC27275g.this.get(key)) != null && ConcurrentMapC27275g.this.f64468g.mo45316a(entry.getValue(), obj2)) {
                return true;
            }
            return false;
        }

        C27300f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.google.c.b.g$g */
    abstract class AbstractC27301g<T> implements Iterator<T> {

        /* renamed from: b */
        int f64519b;

        /* renamed from: c */
        int f64520c = -1;

        /* renamed from: d */
        C27310n<K, V> f64521d;

        /* renamed from: e */
        AtomicReferenceArray<AbstractC27333k<K, V>> f64522e;

        /* renamed from: f */
        AbstractC27333k<K, V> f64523f;

        /* renamed from: g */
        ConcurrentMapC27275g<K, V>.C27285ae f64524g;

        /* renamed from: h */
        ConcurrentMapC27275g<K, V>.C27285ae f64525h;

        static {
            Covode.recordClassIndex(32881);
        }

        public boolean hasNext() {
            if (this.f64524g != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m54420c() {
            AbstractC27333k<K, V> kVar = this.f64523f;
            if (kVar == null) {
                return false;
            }
            while (true) {
                this.f64523f = kVar.mo45426b();
                AbstractC27333k<K, V> kVar2 = this.f64523f;
                if (kVar2 == null) {
                    return false;
                }
                if (m54418a(kVar2)) {
                    return true;
                }
                kVar = this.f64523f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ConcurrentMapC27275g<K, V>.C27285ae mo45470a() {
            ConcurrentMapC27275g<K, V>.C27285ae aeVar = this.f64524g;
            if (aeVar != null) {
                this.f64525h = aeVar;
                m54419b();
                return this.f64525h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            if (this.f64525h != null) {
                z = true;
            } else {
                z = false;
            }
            C27245k.m54243b(z);
            ConcurrentMapC27275g.this.remove(this.f64525h.getKey());
            this.f64525h = null;
        }

        /* renamed from: b */
        private void m54419b() {
            this.f64524g = null;
            if (!m54420c() && !m54421d()) {
                while (this.f64519b >= 0) {
                    C27310n<K, V>[] nVarArr = ConcurrentMapC27275g.this.f64465d;
                    int i = this.f64519b;
                    this.f64519b = i - 1;
                    C27310n<K, V> nVar = nVarArr[i];
                    this.f64521d = nVar;
                    if (nVar.f64552b != 0) {
                        AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64521d.f64556f;
                        this.f64522e = atomicReferenceArray;
                        this.f64520c = atomicReferenceArray.length() - 1;
                        if (m54421d()) {
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private boolean m54421d() {
            while (true) {
                int i = this.f64520c;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = this.f64522e;
                this.f64520c = i - 1;
                AbstractC27333k<K, V> kVar = atomicReferenceArray.get(i);
                this.f64523f = kVar;
                if (kVar != null && (m54418a(kVar) || m54420c())) {
                    return true;
                }
            }
        }

        AbstractC27301g() {
            this.f64519b = ConcurrentMapC27275g.this.f64465d.length - 1;
            m54419b();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private boolean m54418a(AbstractC27333k<K, V> kVar) {
            try {
                long a = ConcurrentMapC27275g.this.f64478q.mo45347a();
                K d = kVar.mo45431d();
                ConcurrentMapC27275g gVar = ConcurrentMapC27275g.this;
                if (kVar.mo45431d() != null) {
                    V v = kVar.mo45422a().get();
                    if (v != null) {
                        if (!gVar.mo45377a(kVar, a)) {
                            this.f64524g = new C27285ae(d, v);
                            this.f64521d.mo45488a();
                            return true;
                        }
                    }
                }
                this.f64521d.mo45488a();
                return false;
            } catch (Throwable th) {
                this.f64521d.mo45488a();
                throw th;
            }
        }
    }

    /* renamed from: com.google.c.b.g$i */
    final class C27303i extends ConcurrentMapC27275g<K, V>.AbstractC27278a {
        static {
            Covode.recordClassIndex(32883);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new C27302h();
        }

        public final boolean contains(Object obj) {
            return this.f64485a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f64485a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        C27303i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.b.g$j */
    public static class C27304j<K, V> implements AbstractC27323w<K, V> {

        /* renamed from: a */
        public volatile AbstractC27323w<K, V> f64529a;

        /* renamed from: b */
        final C27667v<V> f64530b;

        /* renamed from: c */
        final C27252o f64531c;

        static {
            Covode.recordClassIndex(32884);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final AbstractC27323w<K, V> mo45405a(ReferenceQueue<V> referenceQueue, V v, AbstractC27333k<K, V> kVar) {
            return this;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: b */
        public final AbstractC27333k<K, V> mo45407b() {
            return null;
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: c */
        public final boolean mo45408c() {
            return true;
        }

        public C27304j() {
            this(ConcurrentMapC27275g.f64461u);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final int mo45404a() {
            return this.f64529a.mo45404a();
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: d */
        public final boolean mo45409d() {
            return this.f64529a.mo45409d();
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: e */
        public final V mo45410e() {
            return (V) C27671y.m55319a(this.f64530b);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        public final V get() {
            return this.f64529a.get();
        }

        /* renamed from: f */
        public final long mo45480f() {
            return this.f64531c.mo45339a(TimeUnit.NANOSECONDS);
        }

        /* renamed from: b */
        public final boolean mo45479b(V v) {
            return this.f64530b.mo46227b((Object) v);
        }

        @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27323w
        /* renamed from: a */
        public final void mo45406a(V v) {
            if (v != null) {
                mo45479b(v);
            } else {
                this.f64529a = (AbstractC27323w<K, V>) ConcurrentMapC27275g.f64461u;
            }
        }

        public C27304j(AbstractC27323w<K, V> wVar) {
            this.f64530b = new C27667v<>();
            this.f64531c = new C27252o();
            this.f64529a = wVar;
        }

        /* renamed from: a */
        public final boolean mo45478a(Throwable th) {
            return this.f64530b.mo46226a(th);
        }

        /* renamed from: a */
        public final AbstractFutureC27655q<V> mo45477a(K k, AbstractC27271d<? super K, V> dVar) {
            AbstractFutureC27655q<V> a;
            try {
                this.f64531c.mo45340b();
                V v = this.f64529a.get();
                if (v == null) {
                    V a2 = dVar.mo45366a();
                    if (mo45479b(a2)) {
                        return this.f64530b;
                    }
                    return C27646l.m55295a((Object) a2);
                }
                C27245k.m54229a(k);
                C27245k.m54229a(v);
                AbstractFutureC27655q a3 = C27646l.m55295a((Object) dVar.mo45366a());
                if (a3 == null) {
                    return C27646l.m55295a((Object) null);
                }
                C273051 r2 = new AbstractC27235f<V, V>() {
                    /* class com.google.p1998c.p2000b.ConcurrentMapC27275g.C27304j.C273051 */

                    static {
                        Covode.recordClassIndex(32885);
                    }

                    @Override // com.google.p1998c.p1999a.AbstractC27235f
                    /* renamed from: a */
                    public final V mo45319a(V v) {
                        C27304j.this.mo45479b(v);
                        return v;
                    }
                };
                C27659u.EnumC27662a aVar = C27659u.EnumC27662a.INSTANCE;
                C27245k.m54229a(r2);
                AbstractRunnableC27634d.C27636b bVar = new AbstractRunnableC27634d.C27636b(a3, r2);
                a3.mo5481a(bVar, C27659u.m55306a(aVar, bVar));
                return bVar;
            } catch (Throwable th) {
                if (mo45478a(th)) {
                    a = this.f64530b;
                } else {
                    a = C27646l.m55296a(th);
                }
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return a;
            }
        }
    }

    /* renamed from: com.google.c.b.g$x */
    final class C27324x extends AbstractCollection<V> {

        /* renamed from: b */
        private final ConcurrentMap<?, ?> f64594b;

        static {
            Covode.recordClassIndex(32904);
        }

        public final void clear() {
            this.f64594b.clear();
        }

        public final boolean isEmpty() {
            return this.f64594b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C27322v();
        }

        public final int size() {
            return this.f64594b.size();
        }

        public final Object[] toArray() {
            return ConcurrentMapC27275g.m54310a((Collection) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f64594b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC27275g.m54310a((Collection) this).toArray(eArr);
        }

        C27324x(ConcurrentMap<?, ?> concurrentMap) {
            this.f64594b = concurrentMap;
        }
    }

    /* renamed from: com.google.c.b.g$ad */
    static final class C27282ad<K, V> extends AbstractQueue<AbstractC27333k<K, V>> {

        /* renamed from: a */
        final AbstractC27333k<K, V> f64494a = new AbstractC27286b<K, V>() {
            /* class com.google.p1998c.p2000b.ConcurrentMapC27275g.C27282ad.C272831 */

            /* renamed from: a */
            AbstractC27333k<K, V> f64495a = this;

            /* renamed from: b */
            AbstractC27333k<K, V> f64496b = this;

            static {
                Covode.recordClassIndex(32863);
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: b */
            public final void mo45427b(long j) {
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: h */
            public final long mo45436h() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: i */
            public final AbstractC27333k<K, V> mo45437i() {
                return this.f64495a;
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: j */
            public final AbstractC27333k<K, V> mo45438j() {
                return this.f64496b;
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: c */
            public final void mo45430c(AbstractC27333k<K, V> kVar) {
                this.f64495a = kVar;
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: d */
            public final void mo45432d(AbstractC27333k<K, V> kVar) {
                this.f64496b = kVar;
            }
        };

        static {
            Covode.recordClassIndex(32862);
        }

        C27282ad() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AbstractC27333k<K, V> peek() {
            AbstractC27333k<K, V> i = this.f64494a.mo45437i();
            if (i == this.f64494a) {
                return null;
            }
            return i;
        }

        public final boolean isEmpty() {
            if (this.f64494a.mo45437i() == this.f64494a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<AbstractC27333k<K, V>> iterator() {
            return new AbstractC27509i<AbstractC27333k<K, V>>(peek()) {
                /* class com.google.p1998c.p2000b.ConcurrentMapC27275g.C27282ad.C272842 */

                static {
                    Covode.recordClassIndex(32864);
                }

                @Override // com.google.p1998c.p2001c.AbstractC27509i
                /* renamed from: a */
                public final /* synthetic */ Object mo45448a(Object obj) {
                    AbstractC27333k<K, V> i = ((AbstractC27333k) obj).mo45437i();
                    if (i == C27282ad.this.f64494a) {
                        return null;
                    }
                    return i;
                }
            };
        }

        @Override // java.util.Queue
        public final /* synthetic */ Object poll() {
            AbstractC27333k<K, V> i = this.f64494a.mo45437i();
            if (i == this.f64494a) {
                return null;
            }
            remove(i);
            return i;
        }

        public final void clear() {
            AbstractC27333k<K, V> i = this.f64494a.mo45437i();
            while (true) {
                AbstractC27333k<K, V> kVar = this.f64494a;
                if (i != kVar) {
                    AbstractC27333k<K, V> i2 = i.mo45437i();
                    ConcurrentMapC27275g.m54314c(i);
                    i = i2;
                } else {
                    kVar.mo45430c(kVar);
                    AbstractC27333k<K, V> kVar2 = this.f64494a;
                    kVar2.mo45432d(kVar2);
                    return;
                }
            }
        }

        public final int size() {
            int i = 0;
            for (AbstractC27333k<K, V> i2 = this.f64494a.mo45437i(); i2 != this.f64494a; i2 = i2.mo45437i()) {
                i++;
            }
            return i;
        }

        public final boolean contains(Object obj) {
            if (((AbstractC27333k) obj).mo45437i() != EnumC27309m.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        public final /* synthetic */ boolean offer(Object obj) {
            AbstractC27333k kVar = (AbstractC27333k) obj;
            ConcurrentMapC27275g.m54313b(kVar.mo45438j(), kVar.mo45437i());
            ConcurrentMapC27275g.m54313b(this.f64494a.mo45438j(), kVar);
            ConcurrentMapC27275g.m54313b(kVar, this.f64494a);
            return true;
        }

        public final boolean remove(Object obj) {
            AbstractC27333k kVar = (AbstractC27333k) obj;
            AbstractC27333k<K, V> j = kVar.mo45438j();
            AbstractC27333k<K, V> i = kVar.mo45437i();
            ConcurrentMapC27275g.m54313b(j, i);
            ConcurrentMapC27275g.m54314c(kVar);
            if (i != EnumC27309m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.c.b.g$c */
    static final class C27287c<K, V> extends AbstractQueue<AbstractC27333k<K, V>> {

        /* renamed from: a */
        final AbstractC27333k<K, V> f64502a = new AbstractC27286b<K, V>() {
            /* class com.google.p1998c.p2000b.ConcurrentMapC27275g.C27287c.C272881 */

            /* renamed from: a */
            AbstractC27333k<K, V> f64503a = this;

            /* renamed from: b */
            AbstractC27333k<K, V> f64504b = this;

            static {
                Covode.recordClassIndex(32868);
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: a */
            public final void mo45423a(long j) {
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: e */
            public final long mo45433e() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: f */
            public final AbstractC27333k<K, V> mo45434f() {
                return this.f64503a;
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: g */
            public final AbstractC27333k<K, V> mo45435g() {
                return this.f64504b;
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: b */
            public final void mo45428b(AbstractC27333k<K, V> kVar) {
                this.f64504b = kVar;
            }

            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.AbstractC27286b, com.google.p1998c.p2000b.AbstractC27333k
            /* renamed from: a */
            public final void mo45425a(AbstractC27333k<K, V> kVar) {
                this.f64503a = kVar;
            }
        };

        static {
            Covode.recordClassIndex(32867);
        }

        C27287c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AbstractC27333k<K, V> peek() {
            AbstractC27333k<K, V> f = this.f64502a.mo45434f();
            if (f == this.f64502a) {
                return null;
            }
            return f;
        }

        public final boolean isEmpty() {
            if (this.f64502a.mo45434f() == this.f64502a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<AbstractC27333k<K, V>> iterator() {
            return new AbstractC27509i<AbstractC27333k<K, V>>(peek()) {
                /* class com.google.p1998c.p2000b.ConcurrentMapC27275g.C27287c.C272892 */

                static {
                    Covode.recordClassIndex(32869);
                }

                @Override // com.google.p1998c.p2001c.AbstractC27509i
                /* renamed from: a */
                public final /* synthetic */ Object mo45448a(Object obj) {
                    AbstractC27333k<K, V> f = ((AbstractC27333k) obj).mo45434f();
                    if (f == C27287c.this.f64502a) {
                        return null;
                    }
                    return f;
                }
            };
        }

        @Override // java.util.Queue
        public final /* synthetic */ Object poll() {
            AbstractC27333k<K, V> f = this.f64502a.mo45434f();
            if (f == this.f64502a) {
                return null;
            }
            remove(f);
            return f;
        }

        public final void clear() {
            AbstractC27333k<K, V> f = this.f64502a.mo45434f();
            while (true) {
                AbstractC27333k<K, V> kVar = this.f64502a;
                if (f != kVar) {
                    AbstractC27333k<K, V> f2 = f.mo45434f();
                    ConcurrentMapC27275g.m54312b(f);
                    f = f2;
                } else {
                    kVar.mo45425a(kVar);
                    AbstractC27333k<K, V> kVar2 = this.f64502a;
                    kVar2.mo45428b(kVar2);
                    return;
                }
            }
        }

        public final int size() {
            int i = 0;
            for (AbstractC27333k<K, V> f = this.f64502a.mo45434f(); f != this.f64502a; f = f.mo45434f()) {
                i++;
            }
            return i;
        }

        public final boolean contains(Object obj) {
            if (((AbstractC27333k) obj).mo45434f() != EnumC27309m.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        public final /* synthetic */ boolean offer(Object obj) {
            AbstractC27333k kVar = (AbstractC27333k) obj;
            ConcurrentMapC27275g.m54311a(kVar.mo45435g(), kVar.mo45434f());
            ConcurrentMapC27275g.m54311a(this.f64502a.mo45435g(), kVar);
            ConcurrentMapC27275g.m54311a(kVar, this.f64502a);
            return true;
        }

        public final boolean remove(Object obj) {
            AbstractC27333k kVar = (AbstractC27333k) obj;
            AbstractC27333k<K, V> g = kVar.mo45435g();
            AbstractC27333k<K, V> f = kVar.mo45434f();
            ConcurrentMapC27275g.m54311a(g, f);
            ConcurrentMapC27275g.m54312b(kVar);
            if (f != EnumC27309m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.c.b.g$h */
    final class C27302h extends ConcurrentMapC27275g<K, V>.AbstractC27301g {
        static {
            Covode.recordClassIndex(32882);
        }

        @Override // java.util.Iterator
        public final K next() {
            return (K) mo45470a().getKey();
        }

        C27302h() {
            super();
        }
    }

    /* renamed from: com.google.c.b.g$v */
    final class C27322v extends ConcurrentMapC27275g<K, V>.AbstractC27301g {
        static {
            Covode.recordClassIndex(32902);
        }

        @Override // java.util.Iterator
        public final V next() {
            return (V) mo45470a().getValue();
        }

        C27322v() {
            super();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo45383d() {
        if (this.f64473l > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo45384e() {
        if (this.f64475n > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f64484y;
        if (set != null) {
            return set;
        }
        C27300f fVar = new C27300f(this);
        this.f64484y = fVar;
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo45386f() {
        if (mo45383d() || mo45376a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo45387g() {
        if (mo45379c() || mo45384e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo45390h() {
        if (this.f64469h != EnumC27313p.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo45391i() {
        if (this.f64470i != EnumC27313p.STRONG) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f64482w;
        if (set != null) {
            return set;
        }
        C27303i iVar = new C27303i(this);
        this.f64482w = iVar;
        return iVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f64483x;
        if (collection != null) {
            return collection;
        }
        C27324x xVar = new C27324x(this);
        this.f64483x = xVar;
        return xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.b.g$m */
    public enum EnumC27309m implements AbstractC27333k<Object, Object> {
        INSTANCE;

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final AbstractC27323w<Object, Object> mo45422a() {
            return null;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final void mo45423a(long j) {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final void mo45424a(AbstractC27323w<Object, Object> wVar) {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: a */
        public final void mo45425a(AbstractC27333k<Object, Object> kVar) {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public final AbstractC27333k<Object, Object> mo45426b() {
            return null;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public final void mo45427b(long j) {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: b */
        public final void mo45428b(AbstractC27333k<Object, Object> kVar) {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: c */
        public final int mo45429c() {
            return 0;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: c */
        public final void mo45430c(AbstractC27333k<Object, Object> kVar) {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: d */
        public final Object mo45431d() {
            return null;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: d */
        public final void mo45432d(AbstractC27333k<Object, Object> kVar) {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: e */
        public final long mo45433e() {
            return 0;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: f */
        public final AbstractC27333k<Object, Object> mo45434f() {
            return this;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: g */
        public final AbstractC27333k<Object, Object> mo45435g() {
            return this;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: h */
        public final long mo45436h() {
            return 0;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: i */
        public final AbstractC27333k<Object, Object> mo45437i() {
            return this;
        }

        @Override // com.google.p1998c.p2000b.AbstractC27333k
        /* renamed from: j */
        public final AbstractC27333k<Object, Object> mo45438j() {
            return this;
        }

        static {
            Covode.recordClassIndex(32889);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo45378b() {
        if (this.f64472k != C27265c.EnumC27270b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo45379c() {
        if (this.f64474m > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo45393j() {
        while (true) {
            C27341n<K, V> poll = this.f64476o.poll();
            if (poll != null) {
                try {
                    this.f64477p.mo45365a(poll);
                } catch (Throwable th) {
                    f64460a.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    public int size() {
        C27310n<K, V>[] nVarArr;
        long j = 0;
        for (C27310n<K, V> nVar : this.f64465d) {
            j += (long) Math.max(0, nVar.f64552b);
        }
        return C27560a.m55098a(j);
    }

    /* renamed from: com.google.c.b.g$p */
    public enum EnumC27313p {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27313p
            /* renamed from: a */
            public final AbstractC27231d<Object> mo45499a() {
                return AbstractC27231d.C27232a.f64394a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27313p
            /* renamed from: a */
            public final <K, V> AbstractC27323w<K, V> mo45500a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, V v) {
                return new C27320t(v);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27313p
            /* renamed from: a */
            public final AbstractC27231d<Object> mo45499a() {
                return AbstractC27231d.C27233b.f64395a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27313p
            /* renamed from: a */
            public final <K, V> AbstractC27323w<K, V> mo45500a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, V v) {
                return new C27312o(nVar.f64559i, v, kVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27313p
            /* renamed from: a */
            public final AbstractC27231d<Object> mo45499a() {
                return AbstractC27231d.C27233b.f64395a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27313p
            /* renamed from: a */
            public final <K, V> AbstractC27323w<K, V> mo45500a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, V v) {
                return new C27280ab(nVar.f64559i, v, kVar);
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC27231d<Object> mo45499a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract <K, V> AbstractC27323w<K, V> mo45500a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, V v);

        static {
            Covode.recordClassIndex(32893);
        }

        /* synthetic */ EnumC27313p(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(32855);
    }

    public boolean isEmpty() {
        C27310n<K, V>[] nVarArr = this.f64465d;
        long j = 0;
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].f64552b != 0) {
                return false;
            }
            j += (long) nVarArr[i].f64554d;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            if (nVarArr[i2].f64552b != 0) {
                return false;
            }
            j -= (long) nVarArr[i2].f64554d;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.b.g$d */
    public enum EnumC27290d {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45465a(C27310n<K, V> nVar, K k, int i, AbstractC27333k<K, V> kVar) {
                return new C27319s(k, i, kVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45464a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
                AbstractC27333k<K, V> a = super.mo45464a(nVar, kVar, kVar2);
                m54400a(kVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45465a(C27310n<K, V> nVar, K k, int i, AbstractC27333k<K, V> kVar) {
                return new C27317q(k, i, kVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45464a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
                AbstractC27333k<K, V> a = super.mo45464a(nVar, kVar, kVar2);
                m54401b(kVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45465a(C27310n<K, V> nVar, K k, int i, AbstractC27333k<K, V> kVar) {
                return new C27321u(k, i, kVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45464a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
                AbstractC27333k<K, V> a = super.mo45464a(nVar, kVar, kVar2);
                m54400a(kVar, a);
                m54401b(kVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45465a(C27310n<K, V> nVar, K k, int i, AbstractC27333k<K, V> kVar) {
                return new C27318r(k, i, kVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45465a(C27310n<K, V> nVar, K k, int i, AbstractC27333k<K, V> kVar) {
                return new C27279aa(nVar.f64558h, k, i, kVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45464a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
                AbstractC27333k<K, V> a = super.mo45464a(nVar, kVar, kVar2);
                m54400a(kVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45465a(C27310n<K, V> nVar, K k, int i, AbstractC27333k<K, V> kVar) {
                return new C27325y(nVar.f64558h, k, i, kVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45464a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
                AbstractC27333k<K, V> a = super.mo45464a(nVar, kVar, kVar2);
                m54401b(kVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45465a(C27310n<K, V> nVar, K k, int i, AbstractC27333k<K, V> kVar) {
                return new C27281ac(nVar.f64558h, k, i, kVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45464a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
                AbstractC27333k<K, V> a = super.mo45464a(nVar, kVar, kVar2);
                m54400a(kVar, a);
                m54401b(kVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2000b.ConcurrentMapC27275g.EnumC27290d
            /* renamed from: a */
            public final <K, V> AbstractC27333k<K, V> mo45465a(C27310n<K, V> nVar, K k, int i, AbstractC27333k<K, V> kVar) {
                return new C27326z(nVar.f64558h, k, i, kVar);
            }
        };
        

        /* renamed from: i */
        static final EnumC27290d[] f64515i;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract <K, V> AbstractC27333k<K, V> mo45465a(C27310n<K, V> nVar, K k, int i, AbstractC27333k<K, V> kVar);

        static {
            C272911 r14;
            C272922 r13;
            C272933 r12;
            C272944 r11;
            C272955 r10;
            C272966 r9;
            C272977 r8;
            C272988 r7;
            Covode.recordClassIndex(32870);
            f64515i = new EnumC27290d[]{r14, r13, r12, r11, r10, r9, r8, r7};
        }

        /* renamed from: a */
        static <K, V> void m54400a(AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
            kVar2.mo45423a(kVar.mo45433e());
            ConcurrentMapC27275g.m54311a(kVar.mo45435g(), kVar2);
            ConcurrentMapC27275g.m54311a(kVar2, kVar.mo45434f());
            ConcurrentMapC27275g.m54312b(kVar);
        }

        /* renamed from: b */
        static <K, V> void m54401b(AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
            kVar2.mo45427b(kVar.mo45436h());
            ConcurrentMapC27275g.m54313b(kVar.mo45438j(), kVar2);
            ConcurrentMapC27275g.m54313b(kVar2, kVar.mo45437i());
            ConcurrentMapC27275g.m54314c(kVar);
        }

        /* synthetic */ EnumC27290d(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <K, V> AbstractC27333k<K, V> mo45464a(C27310n<K, V> nVar, AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
            return mo45465a(nVar, kVar.mo45431d(), kVar.mo45429c(), kVar2);
        }
    }

    public void clear() {
        EnumC27334l lVar;
        C27310n<K, V>[] nVarArr = this.f64465d;
        int length = nVarArr.length;
        for (int i = 0; i < length; i++) {
            C27310n<K, V> nVar = nVarArr[i];
            if (nVar.f64552b != 0) {
                nVar.lock();
                try {
                    nVar.mo45489a(nVar.f64551a.f64478q.mo45347a());
                    AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = nVar.f64556f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (AbstractC27333k<K, V> kVar = atomicReferenceArray.get(i2); kVar != null; kVar = kVar.mo45426b()) {
                            if (kVar.mo45422a().mo45409d()) {
                                K d = kVar.mo45431d();
                                V v = kVar.mo45422a().get();
                                if (d != null) {
                                    if (v != null) {
                                        lVar = EnumC27334l.EXPLICIT;
                                        kVar.mo45429c();
                                        nVar.mo45490a(d, v, kVar.mo45422a().mo45404a(), lVar);
                                    }
                                }
                                lVar = EnumC27334l.COLLECTED;
                                kVar.mo45429c();
                                nVar.mo45490a(d, v, kVar.mo45422a().mo45404a(), lVar);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (nVar.f64551a.mo45390h()) {
                        do {
                        } while (nVar.f64558h.poll() != null);
                    }
                    if (nVar.f64551a.mo45391i()) {
                        do {
                        } while (nVar.f64559i.poll() != null);
                    }
                    nVar.f64562l.clear();
                    nVar.f64563m.clear();
                    nVar.f64561k.set(0);
                    nVar.f64554d++;
                    nVar.f64552b = 0;
                } finally {
                    nVar.unlock();
                    nVar.mo45494b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo45376a() {
        if (this.f64471j >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static <K, V> void m54312b(AbstractC27333k<K, V> kVar) {
        EnumC27309m mVar = EnumC27309m.INSTANCE;
        kVar.mo45425a(mVar);
        kVar.mo45428b(mVar);
    }

    /* renamed from: c */
    static <K, V> void m54314c(AbstractC27333k<K, V> kVar) {
        EnumC27309m mVar = EnumC27309m.INSTANCE;
        kVar.mo45430c(mVar);
        kVar.mo45432d(mVar);
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m54310a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C27397an.m54801a(arrayList, collection.iterator());
        return arrayList;
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int a = mo45372a(obj);
        return mo45373a(a).mo45495b(obj, a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo45372a(obj);
        return mo45373a(a).mo45483a(obj, a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo45372a(obj);
        return mo45373a(a).mo45497c(obj, a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo45372a(Object obj) {
        int a = this.f64467f.mo45315a(obj);
        int i = a + ((a << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.b.g<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C27310n<K, V> mo45373a(int i) {
        return this.f64465d[(i >>> this.f64464c) & this.f64463b];
    }

    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long a = this.f64478q.mo45347a();
        C27310n<K, V>[] nVarArr = this.f64465d;
        long j = -1;
        int i = 0;
        do {
            long j2 = 0;
            for (C27310n<K, V> nVar : nVarArr) {
                int i2 = nVar.f64552b;
                AtomicReferenceArray<AbstractC27333k<K, V>> atomicReferenceArray = nVar.f64556f;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (AbstractC27333k<K, V> kVar = atomicReferenceArray.get(i3); kVar != null; kVar = kVar.mo45426b()) {
                        V a2 = nVar.mo45482a(kVar, a);
                        if (a2 != null && this.f64468g.mo45316a(obj, a2)) {
                            return true;
                        }
                    }
                }
                j2 += (long) nVar.f64554d;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        } while (i < 3);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo45374a(AbstractC27323w<K, V> wVar) {
        AbstractC27333k<K, V> b = wVar.mo45407b();
        int c = b.mo45429c();
        mo45373a(c).mo45492a((Object) b.mo45431d(), c, (AbstractC27323w) wVar);
    }

    ConcurrentMapC27275g(C27265c<? super K, ? super V> cVar) {
        int i;
        long j;
        long j2;
        long j3;
        boolean z;
        AbstractC27259t tVar;
        char c;
        boolean z2;
        int i2;
        int i3;
        char c2 = 4;
        if (cVar.f64436g == -1) {
            i = 4;
        } else {
            i = cVar.f64436g;
        }
        this.f64466e = Math.min(i, 65536);
        EnumC27313p a = cVar.mo45361a();
        this.f64469h = a;
        this.f64470i = cVar.mo45362b();
        this.f64467f = (AbstractC27231d) C27238h.m54216a(cVar.f64445p, cVar.mo45361a().mo45499a());
        this.f64468g = (AbstractC27231d) C27238h.m54216a(cVar.f64446q, cVar.mo45362b().mo45499a());
        long j4 = 0;
        if (cVar.f64442m == 0 || cVar.f64443n == 0) {
            j = 0;
        } else if (cVar.f64439j == null) {
            j = cVar.f64437h;
        } else {
            j = cVar.f64438i;
        }
        this.f64471j = j;
        this.f64472k = (AbstractC27345p) C27238h.m54216a(cVar.f64439j, C27265c.EnumC27270b.INSTANCE);
        if (cVar.f64443n == -1) {
            j2 = 0;
        } else {
            j2 = cVar.f64443n;
        }
        this.f64473l = j2;
        if (cVar.f64442m == -1) {
            j3 = 0;
        } else {
            j3 = cVar.f64442m;
        }
        this.f64474m = j3;
        this.f64475n = cVar.f64444o != -1 ? cVar.f64444o : j4;
        AbstractC27340m<K, V> mVar = (AbstractC27340m) C27238h.m54216a(cVar.f64447r, C27265c.EnumC27269a.INSTANCE);
        this.f64477p = mVar;
        this.f64476o = mVar == C27265c.EnumC27269a.INSTANCE ? (Queue<C27341n<K, V>>) f64462v : new ConcurrentLinkedQueue();
        int i4 = 0;
        int i5 = 1;
        if (mo45387g() || mo45383d()) {
            z = true;
        } else {
            z = false;
        }
        if (cVar.f64448s != null) {
            tVar = cVar.f64448s;
        } else if (z) {
            tVar = AbstractC27259t.f64422a;
        } else {
            tVar = C27265c.f64432d;
        }
        this.f64478q = tVar;
        if (mo45386f() || mo45383d()) {
            c = 1;
        } else {
            c = 0;
        }
        if (mo45379c() || mo45387g()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = (a != EnumC27313p.WEAK ? 0 : c2) | c;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.f64479r = EnumC27290d.f64515i[i6 | i2];
        this.f64480s = (AbstractC27261a.AbstractC27263b) cVar.f64449t.mo5560b();
        this.f64481t = null;
        if (cVar.f64435f == -1) {
            i3 = 16;
        } else {
            i3 = cVar.f64435f;
        }
        int min = Math.min(i3, 1073741824);
        if (mo45376a() && !mo45378b()) {
            min = Math.min(min, (int) j);
        }
        int i7 = 1;
        int i8 = 0;
        while (i7 < this.f64466e && (!mo45376a() || ((long) (i7 * 20)) <= this.f64471j)) {
            i8++;
            i7 <<= 1;
        }
        this.f64464c = 32 - i8;
        this.f64463b = i7 - 1;
        this.f64465d = new C27310n[i7];
        int i9 = min / i7;
        while (i5 < (i9 * i7 < min ? i9 + 1 : i9)) {
            i5 <<= 1;
        }
        if (mo45376a()) {
            long j5 = this.f64471j;
            long j6 = (long) i7;
            long j7 = (j5 / j6) + 1;
            long j8 = j5 % j6;
            while (true) {
                C27310n<K, V>[] nVarArr = this.f64465d;
                if (i4 < nVarArr.length) {
                    if (((long) i4) == j8) {
                        j7--;
                    }
                    nVarArr[i4] = m54309a(i5, j7, (AbstractC27261a.AbstractC27263b) cVar.f64449t.mo5560b());
                    i4++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C27310n<K, V>[] nVarArr2 = this.f64465d;
                if (i4 < nVarArr2.length) {
                    nVarArr2[i4] = m54309a(i5, -1, (AbstractC27261a.AbstractC27263b) cVar.f64449t.mo5560b());
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo45375a(AbstractC27333k<K, V> kVar) {
        int c = kVar.mo45429c();
        mo45373a(c).mo45491a((AbstractC27333k) kVar, c);
    }

    /* renamed from: a */
    static <K, V> void m54311a(AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
        kVar.mo45425a(kVar2);
        kVar2.mo45428b(kVar);
    }

    /* renamed from: b */
    static <K, V> void m54313b(AbstractC27333k<K, V> kVar, AbstractC27333k<K, V> kVar2) {
        kVar.mo45430c(kVar2);
        kVar2.mo45432d(kVar);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        C27245k.m54229a(k);
        C27245k.m54229a(v);
        int a = mo45372a((Object) k);
        return mo45373a(a).mo45487a((Object) k, a, (Object) v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        C27245k.m54229a(k);
        C27245k.m54229a(v);
        int a = mo45372a((Object) k);
        return mo45373a(a).mo45487a((Object) k, a, (Object) v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        C27245k.m54229a(k);
        C27245k.m54229a(v);
        int a = mo45372a((Object) k);
        return mo45373a(a).mo45486a((Object) k, a, (Object) v);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a = mo45372a(obj);
        return mo45373a(a).mo45496b(obj, a, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo45377a(AbstractC27333k<K, V> kVar, long j) {
        C27245k.m54229a(kVar);
        if (mo45383d() && j - kVar.mo45433e() >= this.f64473l) {
            return true;
        }
        if (!mo45379c() || j - kVar.mo45436h() < this.f64474m) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C27310n<K, V> m54309a(int i, long j, AbstractC27261a.AbstractC27263b bVar) {
        return new C27310n<>(this, i, j, bVar);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        C27245k.m54229a(k);
        C27245k.m54229a(v2);
        if (v == null) {
            return false;
        }
        int a = mo45372a((Object) k);
        return mo45373a(a).mo45493a((Object) k, a, (Object) v, (Object) v2);
    }
}
