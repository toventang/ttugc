package com.bytedance.jedi.p1445a.p1454g.p1456b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1454g.p1455a.AbstractC20192a;
import com.bytedance.jedi.p1445a.p1454g.p1455a.AbstractC20200e;
import com.bytedance.jedi.p1445a.p1454g.p1455a.C20195b;
import com.bytedance.jedi.p1445a.p1454g.p1455a.C20198c;
import com.bytedance.jedi.p1445a.p1454g.p1456b.C20203b;
import com.bytedance.jedi.p1445a.p1454g.p1457c.AbstractC20264a;
import com.bytedance.jedi.p1445a.p1454g.p1457c.C20265b;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.jedi.a.g.b.c */
public class ConcurrentMapC20207c<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a */
    static final Logger f47996a = Logger.getLogger(ConcurrentMapC20207c.class.getName());

    /* renamed from: s */
    static final AbstractC20248u<Object, Object> f47997s = new AbstractC20248u<Object, Object>() {
        /* class com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C202081 */

        static {
            Covode.recordClassIndex(23716);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: a */
        public final int mo33539a() {
            return 0;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: a */
        public final AbstractC20248u<Object, Object> mo33540a(ReferenceQueue<Object> referenceQueue, Object obj, AbstractC20254d<Object, Object> dVar) {
            return this;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: b */
        public final AbstractC20254d<Object, Object> mo33541b() {
            return null;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: c */
        public final boolean mo33542c() {
            return false;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        public final Object get() {
            return null;
        }
    };

    /* renamed from: t */
    static final Queue<?> f47998t = new AbstractQueue<Object>() {
        /* class com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C202092 */

        static {
            Covode.recordClassIndex(23717);
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
            return Collections.emptyIterator();
        }
    };

    /* renamed from: b */
    final int f47999b;

    /* renamed from: c */
    final int f48000c;

    /* renamed from: d */
    final C20236l<K, V>[] f48001d;

    /* renamed from: e */
    final int f48002e;

    /* renamed from: f */
    final AbstractC20192a<Object> f48003f;

    /* renamed from: g */
    final AbstractC20192a<Object> f48004g;

    /* renamed from: h */
    final EnumC20238n f48005h;

    /* renamed from: i */
    final EnumC20238n f48006i;

    /* renamed from: j */
    final long f48007j;

    /* renamed from: k */
    final AbstractC20263h<K, V> f48008k;

    /* renamed from: l */
    final long f48009l;

    /* renamed from: m */
    final long f48010m;

    /* renamed from: n */
    final long f48011n;

    /* renamed from: o */
    final Queue<C20262g<K, V>> f48012o;

    /* renamed from: p */
    final AbstractC20261f<K, V> f48013p;

    /* renamed from: q */
    final AbstractC20200e f48014q;

    /* renamed from: r */
    final EnumC20220d f48015r;

    /* renamed from: u */
    Set<K> f48016u;

    /* renamed from: v */
    Collection<V> f48017v;

    /* renamed from: w */
    Set<Map.Entry<K, V>> f48018w;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.g.b.c$u */
    public interface AbstractC20248u<K, V> {
        static {
            Covode.recordClassIndex(23756);
        }

        /* renamed from: a */
        int mo33539a();

        /* renamed from: a */
        AbstractC20248u<K, V> mo33540a(ReferenceQueue<V> referenceQueue, V v, AbstractC20254d<K, V> dVar);

        /* renamed from: b */
        AbstractC20254d<K, V> mo33541b();

        /* renamed from: c */
        boolean mo33542c();

        V get();
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$aa */
    static final class C20211aa<K, V> extends C20252y<K, V> {

        /* renamed from: a */
        volatile long f48021a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC20254d<K, V> f48022b = EnumC20235k.INSTANCE;

        /* renamed from: c */
        AbstractC20254d<K, V> f48023c = EnumC20235k.INSTANCE;

        static {
            Covode.recordClassIndex(23719);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: h */
        public final long mo33557h() {
            return this.f48021a;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: i */
        public final AbstractC20254d<K, V> mo33558i() {
            return this.f48022b;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: j */
        public final AbstractC20254d<K, V> mo33559j() {
            return this.f48023c;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public final void mo33554b(long j) {
            this.f48021a = j;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: c */
        public final void mo33555c(AbstractC20254d<K, V> dVar) {
            this.f48022b = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: d */
        public final void mo33556d(AbstractC20254d<K, V> dVar) {
            this.f48023c = dVar;
        }

        C20211aa(ReferenceQueue<K> referenceQueue, K k, int i, AbstractC20254d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.g.b.c$ac */
    public final class C20215ac implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f48029a;

        /* renamed from: b */
        V f48030b;

        static {
            Covode.recordClassIndex(23723);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f48029a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f48030b;
        }

        public final int hashCode() {
            return this.f48029a.hashCode() ^ this.f48030b.hashCode();
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) ConcurrentMapC20207c.this.put(this.f48029a, v);
            this.f48030b = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!this.f48029a.equals(entry.getKey()) || !this.f48030b.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        C20215ac(K k, V v) {
            this.f48029a = k;
            this.f48030b = v;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$b */
    static abstract class AbstractC20216b<K, V> implements AbstractC20254d<K, V> {
        static {
            Covode.recordClassIndex(23724);
        }

        AbstractC20216b() {
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public AbstractC20248u<K, V> mo33576a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public AbstractC20254d<K, V> mo33580b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: c */
        public int mo33582c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: d */
        public K mo33583d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: e */
        public long mo33584e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: f */
        public AbstractC20254d<K, V> mo33585f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: g */
        public AbstractC20254d<K, V> mo33586g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: h */
        public long mo33557h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: i */
        public AbstractC20254d<K, V> mo33558i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: j */
        public AbstractC20254d<K, V> mo33559j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public void mo33577a(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public void mo33554b(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: c */
        public void mo33555c(AbstractC20254d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: d */
        public void mo33556d(AbstractC20254d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public void mo33578a(AbstractC20248u<K, V> uVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public void mo33581b(AbstractC20254d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public void mo33579a(AbstractC20254d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.g.b.c$j */
    public static class C20234j<K, V> implements AbstractC20202a<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final ConcurrentMapC20207c<K, V> f48059a;

        static {
            Covode.recordClassIndex(23742);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20202a
        /* renamed from: b */
        public final ConcurrentMap<K, V> mo33501b() {
            return this.f48059a;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20202a
        /* renamed from: a */
        public final void mo33499a() {
            this.f48059a.clear();
        }

        private C20234j(ConcurrentMapC20207c<K, V> cVar) {
            this.f48059a = cVar;
        }

        C20234j(C20203b<? super K, ? super V> bVar) {
            this(new ConcurrentMapC20207c(bVar));
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20202a
        /* renamed from: b */
        public final void mo33502b(Object obj) {
            C20198c.m38190a(obj);
            this.f48059a.remove(obj);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20202a
        /* renamed from: a */
        public final V mo33498a(Object obj) {
            ConcurrentMapC20207c<K, V> cVar = this.f48059a;
            int a = cVar.mo33508a(C20198c.m38190a(obj));
            return cVar.mo33509a(a).mo33609a(obj, a);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20202a
        /* renamed from: a */
        public final void mo33500a(K k, V v) {
            this.f48059a.put(k, v);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$m */
    static class C20237m<K, V> extends SoftReference<V> implements AbstractC20248u<K, V> {

        /* renamed from: a */
        final AbstractC20254d<K, V> f48075a;

        static {
            Covode.recordClassIndex(23745);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: a */
        public final int mo33539a() {
            return 1;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: c */
        public final boolean mo33542c() {
            return true;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: b */
        public final AbstractC20254d<K, V> mo33541b() {
            return this.f48075a;
        }

        C20237m(ReferenceQueue<V> referenceQueue, V v, AbstractC20254d<K, V> dVar) {
            super(v, referenceQueue);
            this.f48075a = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: a */
        public final AbstractC20248u<K, V> mo33540a(ReferenceQueue<V> referenceQueue, V v, AbstractC20254d<K, V> dVar) {
            return new C20237m(referenceQueue, v, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$o */
    static final class C20242o<K, V> extends C20244q<K, V> {

        /* renamed from: a */
        volatile long f48080a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC20254d<K, V> f48081b = EnumC20235k.INSTANCE;

        /* renamed from: c */
        AbstractC20254d<K, V> f48082c = EnumC20235k.INSTANCE;

        static {
            Covode.recordClassIndex(23750);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: e */
        public final long mo33584e() {
            return this.f48080a;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: f */
        public final AbstractC20254d<K, V> mo33585f() {
            return this.f48081b;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: g */
        public final AbstractC20254d<K, V> mo33586g() {
            return this.f48082c;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: a */
        public final void mo33577a(long j) {
            this.f48080a = j;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: b */
        public final void mo33581b(AbstractC20254d<K, V> dVar) {
            this.f48082c = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: a */
        public final void mo33579a(AbstractC20254d<K, V> dVar) {
            this.f48081b = dVar;
        }

        C20242o(K k, int i, AbstractC20254d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$p */
    static final class C20243p<K, V> extends C20244q<K, V> {

        /* renamed from: a */
        volatile long f48083a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC20254d<K, V> f48084b = EnumC20235k.INSTANCE;

        /* renamed from: c */
        AbstractC20254d<K, V> f48085c = EnumC20235k.INSTANCE;

        /* renamed from: d */
        volatile long f48086d = Long.MAX_VALUE;

        /* renamed from: e */
        AbstractC20254d<K, V> f48087e = EnumC20235k.INSTANCE;

        /* renamed from: f */
        AbstractC20254d<K, V> f48088f = EnumC20235k.INSTANCE;

        static {
            Covode.recordClassIndex(23751);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: e */
        public final long mo33584e() {
            return this.f48083a;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: f */
        public final AbstractC20254d<K, V> mo33585f() {
            return this.f48084b;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: g */
        public final AbstractC20254d<K, V> mo33586g() {
            return this.f48085c;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: h */
        public final long mo33557h() {
            return this.f48086d;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: i */
        public final AbstractC20254d<K, V> mo33558i() {
            return this.f48087e;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: j */
        public final AbstractC20254d<K, V> mo33559j() {
            return this.f48088f;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: a */
        public final void mo33577a(long j) {
            this.f48083a = j;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: b */
        public final void mo33554b(long j) {
            this.f48086d = j;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: c */
        public final void mo33555c(AbstractC20254d<K, V> dVar) {
            this.f48087e = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: d */
        public final void mo33556d(AbstractC20254d<K, V> dVar) {
            this.f48088f = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: a */
        public final void mo33579a(AbstractC20254d<K, V> dVar) {
            this.f48084b = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: b */
        public final void mo33581b(AbstractC20254d<K, V> dVar) {
            this.f48085c = dVar;
        }

        C20243p(K k, int i, AbstractC20254d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$q */
    static class C20244q<K, V> extends AbstractC20216b<K, V> {

        /* renamed from: g */
        final K f48089g;

        /* renamed from: h */
        final int f48090h;

        /* renamed from: i */
        final AbstractC20254d<K, V> f48091i;

        /* renamed from: j */
        volatile AbstractC20248u<K, V> f48092j = ((AbstractC20248u<K, V>) ConcurrentMapC20207c.f47997s);

        static {
            Covode.recordClassIndex(23752);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: a */
        public final AbstractC20248u<K, V> mo33576a() {
            return this.f48092j;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: b */
        public final AbstractC20254d<K, V> mo33580b() {
            return this.f48091i;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: c */
        public final int mo33582c() {
            return this.f48090h;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: d */
        public final K mo33583d() {
            return this.f48089g;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: a */
        public final void mo33578a(AbstractC20248u<K, V> uVar) {
            this.f48092j = uVar;
        }

        C20244q(K k, int i, AbstractC20254d<K, V> dVar) {
            this.f48089g = k;
            this.f48090h = i;
            this.f48091i = dVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$r */
    static class C20245r<K, V> implements AbstractC20248u<K, V> {

        /* renamed from: a */
        final V f48093a;

        static {
            Covode.recordClassIndex(23753);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: a */
        public final int mo33539a() {
            return 1;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: a */
        public final AbstractC20248u<K, V> mo33540a(ReferenceQueue<V> referenceQueue, V v, AbstractC20254d<K, V> dVar) {
            return this;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: b */
        public final AbstractC20254d<K, V> mo33541b() {
            return null;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: c */
        public final boolean mo33542c() {
            return true;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        public final V get() {
            return this.f48093a;
        }

        C20245r(V v) {
            this.f48093a = v;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$s */
    static final class C20246s<K, V> extends C20244q<K, V> {

        /* renamed from: a */
        volatile long f48094a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC20254d<K, V> f48095b = EnumC20235k.INSTANCE;

        /* renamed from: c */
        AbstractC20254d<K, V> f48096c = EnumC20235k.INSTANCE;

        static {
            Covode.recordClassIndex(23754);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: h */
        public final long mo33557h() {
            return this.f48094a;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: i */
        public final AbstractC20254d<K, V> mo33558i() {
            return this.f48095b;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: j */
        public final AbstractC20254d<K, V> mo33559j() {
            return this.f48096c;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: b */
        public final void mo33554b(long j) {
            this.f48094a = j;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: c */
        public final void mo33555c(AbstractC20254d<K, V> dVar) {
            this.f48095b = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
        /* renamed from: d */
        public final void mo33556d(AbstractC20254d<K, V> dVar) {
            this.f48096c = dVar;
        }

        C20246s(K k, int i, AbstractC20254d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$w */
    static final class C20250w<K, V> extends C20252y<K, V> {

        /* renamed from: a */
        volatile long f48100a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC20254d<K, V> f48101b = EnumC20235k.INSTANCE;

        /* renamed from: c */
        AbstractC20254d<K, V> f48102c = EnumC20235k.INSTANCE;

        static {
            Covode.recordClassIndex(23758);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: e */
        public final long mo33584e() {
            return this.f48100a;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: f */
        public final AbstractC20254d<K, V> mo33585f() {
            return this.f48101b;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: g */
        public final AbstractC20254d<K, V> mo33586g() {
            return this.f48102c;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final void mo33577a(long j) {
            this.f48100a = j;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public final void mo33581b(AbstractC20254d<K, V> dVar) {
            this.f48102c = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final void mo33579a(AbstractC20254d<K, V> dVar) {
            this.f48101b = dVar;
        }

        C20250w(ReferenceQueue<K> referenceQueue, K k, int i, AbstractC20254d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$x */
    static final class C20251x<K, V> extends C20252y<K, V> {

        /* renamed from: a */
        volatile long f48103a = Long.MAX_VALUE;

        /* renamed from: b */
        AbstractC20254d<K, V> f48104b = EnumC20235k.INSTANCE;

        /* renamed from: c */
        AbstractC20254d<K, V> f48105c = EnumC20235k.INSTANCE;

        /* renamed from: d */
        volatile long f48106d = Long.MAX_VALUE;

        /* renamed from: e */
        AbstractC20254d<K, V> f48107e = EnumC20235k.INSTANCE;

        /* renamed from: f */
        AbstractC20254d<K, V> f48108f = EnumC20235k.INSTANCE;

        static {
            Covode.recordClassIndex(23759);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: e */
        public final long mo33584e() {
            return this.f48103a;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: f */
        public final AbstractC20254d<K, V> mo33585f() {
            return this.f48104b;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: g */
        public final AbstractC20254d<K, V> mo33586g() {
            return this.f48105c;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: h */
        public final long mo33557h() {
            return this.f48106d;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: i */
        public final AbstractC20254d<K, V> mo33558i() {
            return this.f48107e;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: j */
        public final AbstractC20254d<K, V> mo33559j() {
            return this.f48108f;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final void mo33577a(long j) {
            this.f48103a = j;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public final void mo33554b(long j) {
            this.f48106d = j;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: c */
        public final void mo33555c(AbstractC20254d<K, V> dVar) {
            this.f48107e = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: d */
        public final void mo33556d(AbstractC20254d<K, V> dVar) {
            this.f48108f = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final void mo33579a(AbstractC20254d<K, V> dVar) {
            this.f48104b = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20252y, com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public final void mo33581b(AbstractC20254d<K, V> dVar) {
            this.f48105c = dVar;
        }

        C20251x(ReferenceQueue<K> referenceQueue, K k, int i, AbstractC20254d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$y */
    static class C20252y<K, V> extends WeakReference<K> implements AbstractC20254d<K, V> {

        /* renamed from: g */
        final int f48109g;

        /* renamed from: h */
        final AbstractC20254d<K, V> f48110h;

        /* renamed from: i */
        volatile AbstractC20248u<K, V> f48111i = ((AbstractC20248u<K, V>) ConcurrentMapC20207c.f47997s);

        static {
            Covode.recordClassIndex(23760);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final AbstractC20248u<K, V> mo33576a() {
            return this.f48111i;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public final AbstractC20254d<K, V> mo33580b() {
            return this.f48110h;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: c */
        public final int mo33582c() {
            return this.f48109g;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: d */
        public final K mo33583d() {
            return (K) get();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: e */
        public long mo33584e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: f */
        public AbstractC20254d<K, V> mo33585f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: g */
        public AbstractC20254d<K, V> mo33586g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: h */
        public long mo33557h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: i */
        public AbstractC20254d<K, V> mo33558i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: j */
        public AbstractC20254d<K, V> mo33559j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public void mo33577a(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public void mo33554b(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: c */
        public void mo33555c(AbstractC20254d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final void mo33578a(AbstractC20248u<K, V> uVar) {
            this.f48111i = uVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public void mo33581b(AbstractC20254d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: d */
        public void mo33556d(AbstractC20254d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public void mo33579a(AbstractC20254d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        C20252y(ReferenceQueue<K> referenceQueue, K k, int i, AbstractC20254d<K, V> dVar) {
            super(k, referenceQueue);
            this.f48109g = i;
            this.f48110h = dVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$z */
    static class C20253z<K, V> extends WeakReference<V> implements AbstractC20248u<K, V> {

        /* renamed from: a */
        final AbstractC20254d<K, V> f48112a;

        static {
            Covode.recordClassIndex(23761);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: a */
        public final int mo33539a() {
            return 1;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: c */
        public final boolean mo33542c() {
            return true;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: b */
        public final AbstractC20254d<K, V> mo33541b() {
            return this.f48112a;
        }

        C20253z(ReferenceQueue<V> referenceQueue, V v, AbstractC20254d<K, V> dVar) {
            super(v, referenceQueue);
            this.f48112a = dVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20248u
        /* renamed from: a */
        public final AbstractC20248u<K, V> mo33540a(ReferenceQueue<V> referenceQueue, V v, AbstractC20254d<K, V> dVar) {
            return new C20253z(referenceQueue, v, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.g.b.c$l */
    public static class C20236l<K, V> extends ReentrantLock {

        /* renamed from: a */
        final ConcurrentMapC20207c<K, V> f48062a;

        /* renamed from: b */
        volatile int f48063b;

        /* renamed from: c */
        long f48064c;

        /* renamed from: d */
        int f48065d;

        /* renamed from: e */
        int f48066e;

        /* renamed from: f */
        volatile AtomicReferenceArray<AbstractC20254d<K, V>> f48067f;

        /* renamed from: g */
        final long f48068g;

        /* renamed from: h */
        final ReferenceQueue<K> f48069h;

        /* renamed from: i */
        final ReferenceQueue<V> f48070i;

        /* renamed from: j */
        final Queue<AbstractC20254d<K, V>> f48071j;

        /* renamed from: k */
        final AtomicInteger f48072k = new AtomicInteger();

        /* renamed from: l */
        final Queue<AbstractC20254d<K, V>> f48073l;

        /* renamed from: m */
        final Queue<AbstractC20254d<K, V>> f48074m;

        static {
            Covode.recordClassIndex(23744);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final V mo33609a(Object obj, int i) {
            try {
                if (this.f48063b != 0) {
                    long a = this.f48062a.f48014q.mo33497a();
                    AbstractC20254d<K, V> a2 = m38321a(obj, i, a);
                    if (a2 == null) {
                        return null;
                    }
                    V v = a2.mo33576a().get();
                    if (v != null) {
                        if (this.f48062a.mo33519d()) {
                            a2.mo33577a(a);
                        }
                        this.f48071j.add(a2);
                        mo33618b();
                        return v;
                    }
                    mo33612a();
                }
                mo33618b();
                return null;
            } finally {
                mo33618b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo33612a() {
            if (tryLock()) {
                try {
                    m38331d();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo33613a(long j) {
            if (tryLock()) {
                try {
                    m38329c(j);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo33614a(K k, V v, int i, EnumC20255e eVar) {
            this.f48064c -= (long) i;
            if (this.f48062a.f48012o != ConcurrentMapC20207c.f47998t) {
                this.f48062a.f48012o.offer(C20262g.create(k, v, eVar));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.bytedance.jedi.a.g.b.c$d */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final V mo33611a(K k, int i, V v, boolean z) {
            int i2;
            AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray;
            int length;
            lock();
            try {
                long a = this.f48062a.f48014q.mo33497a();
                mo33619b(a);
                if (this.f48063b + 1 > this.f48066e && (length = (atomicReferenceArray = this.f48067f).length()) < 1073741824) {
                    int i3 = this.f48063b;
                    AtomicReferenceArray<AbstractC20254d<K, V>> a2 = m38322a(length << 1);
                    this.f48066e = (a2.length() * 3) / 4;
                    int length2 = a2.length() - 1;
                    for (int i4 = 0; i4 < length; i4++) {
                        AbstractC20254d<K, V> dVar = atomicReferenceArray.get(i4);
                        if (dVar != null) {
                            AbstractC20254d<K, V> b = dVar.mo33580b();
                            int c = dVar.mo33582c() & length2;
                            if (b == null) {
                                a2.set(c, dVar);
                            } else {
                                AbstractC20254d<K, V> dVar2 = dVar;
                                while (b != null) {
                                    int c2 = b.mo33582c() & length2;
                                    if (c2 != c) {
                                        c = c2;
                                        dVar2 = b;
                                    }
                                    b = b.mo33580b();
                                }
                                a2.set(c, dVar2);
                                while (dVar != dVar2) {
                                    int c3 = dVar.mo33582c() & length2;
                                    AbstractC20254d<K, V> a3 = m38319a(dVar, a2.get(c3));
                                    if (a3 != null) {
                                        a2.set(c3, a3);
                                    } else {
                                        m38328b(dVar);
                                        i3--;
                                    }
                                    dVar = dVar.mo33580b();
                                }
                            }
                        }
                    }
                    this.f48067f = a2;
                    this.f48063b = i3;
                }
                AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray2 = this.f48067f;
                int length3 = (atomicReferenceArray2.length() - 1) & i;
                AbstractC20254d<K, V> dVar3 = atomicReferenceArray2.get(length3);
                for (AbstractC20254d<K, V> dVar4 = dVar3; dVar4 != null; dVar4 = dVar4.mo33580b()) {
                    K d = dVar4.mo33583d();
                    if (dVar4.mo33582c() == i && d != null && this.f48062a.f48003f.mo33489a(k, d)) {
                        AbstractC20248u<K, V> a4 = dVar4.mo33576a();
                        V v2 = a4.get();
                        if (v2 == null) {
                            this.f48065d++;
                            if (a4.mo33542c()) {
                                mo33614a(k, v2, a4.mo33539a(), EnumC20255e.COLLECTED);
                                m38325a(dVar4, v, a);
                                i2 = this.f48063b;
                            } else {
                                m38325a(dVar4, v, a);
                                i2 = this.f48063b + 1;
                            }
                            this.f48063b = i2;
                            m38323a(dVar4);
                            return null;
                        } else if (z) {
                            m38324a(dVar4, a);
                            unlock();
                            mo33623c();
                            return v2;
                        } else {
                            this.f48065d++;
                            mo33614a(k, v2, a4.mo33539a(), EnumC20255e.REPLACED);
                            m38325a(dVar4, v, a);
                            m38323a(dVar4);
                            unlock();
                            mo33623c();
                            return v2;
                        }
                    }
                }
                this.f48065d++;
                AbstractC20254d<K, V> a5 = this.f48062a.f48015r.mo33597a(this, C20198c.m38190a(k), i, dVar3);
                m38325a(a5, v, a);
                atomicReferenceArray2.set(length3, a5);
                this.f48063b++;
                m38323a(a5);
                unlock();
                mo33623c();
                return null;
            } finally {
                unlock();
                mo33623c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo33617a(K k, int i, V v, V v2) {
            lock();
            try {
                long a = this.f48062a.f48014q.mo33497a();
                mo33619b(a);
                AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48067f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC20254d<K, V> dVar = atomicReferenceArray.get(length);
                for (AbstractC20254d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.mo33580b()) {
                    K d = dVar2.mo33583d();
                    if (dVar2.mo33582c() == i && d != null && this.f48062a.f48003f.mo33489a(k, d)) {
                        AbstractC20248u<K, V> a2 = dVar2.mo33576a();
                        V v3 = a2.get();
                        if (v3 == null) {
                            if (a2.mo33542c()) {
                                this.f48065d++;
                                atomicReferenceArray.set(length, m38320a(dVar, dVar2, d, v3, a2, EnumC20255e.COLLECTED));
                                this.f48063b--;
                            }
                            return false;
                        } else if (this.f48062a.f48004g.mo33489a(v, v3)) {
                            this.f48065d++;
                            mo33614a(k, v3, a2.mo33539a(), EnumC20255e.REPLACED);
                            m38325a(dVar2, v2, a);
                            m38323a(dVar2);
                            unlock();
                            mo33623c();
                            return true;
                        } else {
                            m38324a(dVar2, a);
                            unlock();
                            mo33623c();
                            return false;
                        }
                    }
                }
                unlock();
                mo33623c();
                return false;
            } finally {
                unlock();
                mo33623c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final V mo33610a(K k, int i, V v) {
            lock();
            try {
                long a = this.f48062a.f48014q.mo33497a();
                mo33619b(a);
                AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48067f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC20254d<K, V> dVar = atomicReferenceArray.get(length);
                for (AbstractC20254d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.mo33580b()) {
                    K d = dVar2.mo33583d();
                    if (dVar2.mo33582c() == i && d != null && this.f48062a.f48003f.mo33489a(k, d)) {
                        AbstractC20248u<K, V> a2 = dVar2.mo33576a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            if (a2.mo33542c()) {
                                this.f48065d++;
                                atomicReferenceArray.set(length, m38320a(dVar, dVar2, d, v2, a2, EnumC20255e.COLLECTED));
                                this.f48063b--;
                            }
                            return null;
                        }
                        this.f48065d++;
                        mo33614a(k, v2, a2.mo33539a(), EnumC20255e.REPLACED);
                        m38325a(dVar2, v, a);
                        m38323a(dVar2);
                        unlock();
                        mo33623c();
                        return v2;
                    }
                }
                unlock();
                mo33623c();
                return null;
            } finally {
                unlock();
                mo33623c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo33615a(AbstractC20254d<K, V> dVar, int i) {
            lock();
            try {
                AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48067f;
                int length = i & (atomicReferenceArray.length() - 1);
                AbstractC20254d<K, V> dVar2 = atomicReferenceArray.get(length);
                for (AbstractC20254d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.mo33580b()) {
                    if (dVar3 == dVar) {
                        this.f48065d++;
                        atomicReferenceArray.set(length, m38320a(dVar2, dVar3, dVar3.mo33583d(), dVar3.mo33576a().get(), dVar3.mo33576a(), EnumC20255e.COLLECTED));
                        this.f48063b--;
                        return true;
                    }
                }
                unlock();
                mo33623c();
                return false;
            } finally {
                unlock();
                mo33623c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo33616a(K k, int i, AbstractC20248u<K, V> uVar) {
            lock();
            try {
                AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48067f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC20254d<K, V> dVar = atomicReferenceArray.get(length);
                for (AbstractC20254d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.mo33580b()) {
                    K d = dVar2.mo33583d();
                    if (dVar2.mo33582c() == i && d != null && this.f48062a.f48003f.mo33489a(k, d)) {
                        if (dVar2.mo33576a() == uVar) {
                            this.f48065d++;
                            atomicReferenceArray.set(length, m38320a(dVar, dVar2, d, uVar.get(), uVar, EnumC20255e.COLLECTED));
                            this.f48063b--;
                            return true;
                        } else {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                mo33623c();
                            }
                            return false;
                        }
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo33623c();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo33623c();
                }
            }
        }

        /* renamed from: i */
        private void m38336i() {
            mo33619b(this.f48062a.f48014q.mo33497a());
            mo33623c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo33618b() {
            if ((this.f48072k.incrementAndGet() & 63) == 0) {
                m38336i();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo33623c() {
            if (!isHeldByCurrentThread()) {
                this.f48062a.mo33527i();
            }
        }

        /* renamed from: d */
        private void m38331d() {
            if (this.f48062a.mo33523g()) {
                m38332e();
            }
            if (this.f48062a.mo33526h()) {
                m38333f();
            }
        }

        /* renamed from: e */
        private void m38332e() {
            int i = 0;
            do {
                Reference<? extends K> poll = this.f48069h.poll();
                if (poll != null) {
                    this.f48062a.mo33511a((AbstractC20254d) ((AbstractC20254d) poll));
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: f */
        private void m38333f() {
            int i = 0;
            do {
                Reference<? extends V> poll = this.f48070i.poll();
                if (poll != null) {
                    this.f48062a.mo33510a((AbstractC20248u) ((AbstractC20248u) poll));
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: g */
        private void m38334g() {
            while (true) {
                AbstractC20254d<K, V> poll = this.f48071j.poll();
                if (poll == null) {
                    return;
                }
                if (this.f48074m.contains(poll)) {
                    this.f48074m.add(poll);
                }
            }
        }

        /* renamed from: h */
        private AbstractC20254d<K, V> m38335h() {
            for (AbstractC20254d<K, V> dVar : this.f48074m) {
                if (dVar.mo33576a().mo33539a() > 0) {
                    return dVar;
                }
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        private static AtomicReferenceArray<AbstractC20254d<K, V>> m38322a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: b */
        private void m38328b(AbstractC20254d<K, V> dVar) {
            K d = dVar.mo33583d();
            dVar.mo33582c();
            mo33614a(d, dVar.mo33576a().get(), dVar.mo33576a().mo33539a(), EnumC20255e.COLLECTED);
            this.f48073l.remove(dVar);
            this.f48074m.remove(dVar);
        }

        /* renamed from: c */
        private void m38329c(long j) {
            AbstractC20254d<K, V> peek;
            AbstractC20254d<K, V> peek2;
            m38334g();
            do {
                peek = this.f48073l.peek();
                if (peek == null || !this.f48062a.mo33513a(peek, j)) {
                    do {
                        peek2 = this.f48074m.peek();
                        if (peek2 == null || !this.f48062a.mo33513a(peek2, j)) {
                            return;
                        }
                    } while (m38326a((AbstractC20254d) peek2, peek2.mo33582c(), EnumC20255e.EXPIRED));
                    throw new AssertionError();
                }
            } while (m38326a((AbstractC20254d) peek, peek.mo33582c(), EnumC20255e.EXPIRED));
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo33619b(long j) {
            if (tryLock()) {
                try {
                    m38331d();
                    m38329c(j);
                    this.f48072k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        private void m38323a(AbstractC20254d<K, V> dVar) {
            if (this.f48062a.mo33512a()) {
                m38334g();
                if (((long) dVar.mo33576a().mo33539a()) <= this.f48068g || m38326a((AbstractC20254d) dVar, dVar.mo33582c(), EnumC20255e.SIZE)) {
                    while (this.f48064c > this.f48068g) {
                        AbstractC20254d<K, V> h = m38335h();
                        if (!m38326a((AbstractC20254d) h, h.mo33582c(), EnumC20255e.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        private AbstractC20254d<K, V> m38327b(AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
            int i = this.f48063b;
            AbstractC20254d<K, V> b = dVar2.mo33580b();
            while (dVar != dVar2) {
                AbstractC20254d<K, V> a = m38319a(dVar, b);
                if (a != null) {
                    b = a;
                } else {
                    m38328b(dVar);
                    i--;
                }
                dVar = dVar.mo33580b();
            }
            this.f48063b = i;
            return b;
        }

        /* renamed from: a */
        private AbstractC20254d<K, V> m38319a(AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
            if (dVar.mo33583d() == null) {
                return null;
            }
            AbstractC20248u<K, V> a = dVar.mo33576a();
            V v = a.get();
            if (v == null && a.mo33542c()) {
                return null;
            }
            AbstractC20254d<K, V> a2 = this.f48062a.f48015r.mo33596a(this, dVar, dVar2);
            a2.mo33578a(a.mo33540a(this.f48070i, v, a2));
            return a2;
        }

        /* renamed from: d */
        private AbstractC20254d<K, V> m38330d(Object obj, int i) {
            AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48067f;
            for (AbstractC20254d<K, V> dVar = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); dVar != null; dVar = dVar.mo33580b()) {
                if (dVar.mo33582c() == i) {
                    K d = dVar.mo33583d();
                    if (d == null) {
                        mo33612a();
                    } else if (this.f48062a.f48003f.mo33489a(obj, d)) {
                        return dVar;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo33620b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f48063b != 0) {
                    AbstractC20254d<K, V> a = m38321a(obj, i, this.f48062a.f48014q.mo33497a());
                    if (a == null) {
                        return false;
                    }
                    if (a.mo33576a().get() != null) {
                        z = true;
                    }
                    mo33618b();
                    return z;
                }
                mo33618b();
                return false;
            } finally {
                mo33618b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final V mo33622c(Object obj, int i) {
            EnumC20255e eVar;
            lock();
            try {
                mo33619b(this.f48062a.f48014q.mo33497a());
                AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48067f;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC20254d<K, V> dVar = atomicReferenceArray.get(length);
                for (AbstractC20254d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.mo33580b()) {
                    K d = dVar2.mo33583d();
                    if (dVar2.mo33582c() == i && d != null && this.f48062a.f48003f.mo33489a(obj, d)) {
                        AbstractC20248u<K, V> a = dVar2.mo33576a();
                        V v = a.get();
                        if (v != null) {
                            eVar = EnumC20255e.EXPLICIT;
                        } else if (a.mo33542c()) {
                            eVar = EnumC20255e.COLLECTED;
                        } else {
                            unlock();
                            mo33623c();
                            return null;
                        }
                        this.f48065d++;
                        atomicReferenceArray.set(length, m38320a(dVar, dVar2, d, v, a, eVar));
                        this.f48063b--;
                        return v;
                    }
                }
                unlock();
                mo33623c();
                return null;
            } finally {
                unlock();
                mo33623c();
            }
        }

        /* renamed from: a */
        private void m38324a(AbstractC20254d<K, V> dVar, long j) {
            if (this.f48062a.mo33519d()) {
                dVar.mo33577a(j);
            }
            this.f48074m.add(dVar);
        }

        C20236l(ConcurrentMapC20207c<K, V> cVar, int i, long j) {
            ReferenceQueue<K> referenceQueue;
            this.f48062a = cVar;
            this.f48068g = j;
            AtomicReferenceArray<AbstractC20254d<K, V>> a = m38322a(i);
            this.f48066e = (a.length() * 3) / 4;
            if (!cVar.mo33514b()) {
                int i2 = this.f48066e;
                if (((long) i2) == j) {
                    this.f48066e = i2 + 1;
                }
            }
            this.f48067f = a;
            ReferenceQueue<V> referenceQueue2 = null;
            if (cVar.mo33523g()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.f48069h = referenceQueue;
            this.f48070i = cVar.mo33526h() ? new ReferenceQueue<>() : referenceQueue2;
            this.f48071j = cVar.mo33520e() ? new ConcurrentLinkedQueue() : (Queue<AbstractC20254d<K, V>>) ConcurrentMapC20207c.f47998t;
            this.f48073l = cVar.mo33515c() ? new C20212ab() : (Queue<AbstractC20254d<K, V>>) ConcurrentMapC20207c.f47998t;
            this.f48074m = cVar.mo33520e() ? new C20217c() : (Queue<AbstractC20254d<K, V>>) ConcurrentMapC20207c.f47998t;
        }

        /* renamed from: a */
        private AbstractC20254d<K, V> m38321a(Object obj, int i, long j) {
            AbstractC20254d<K, V> d = m38330d(obj, i);
            if (d == null) {
                return null;
            }
            if (!this.f48062a.mo33513a(d, j)) {
                return d;
            }
            mo33613a(j);
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo33621b(Object obj, int i, Object obj2) {
            EnumC20255e eVar;
            lock();
            try {
                mo33619b(this.f48062a.f48014q.mo33497a());
                AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48067f;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                AbstractC20254d<K, V> dVar = atomicReferenceArray.get(length);
                for (AbstractC20254d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.mo33580b()) {
                    K d = dVar2.mo33583d();
                    if (dVar2.mo33582c() == i && d != null && this.f48062a.f48003f.mo33489a(obj, d)) {
                        AbstractC20248u<K, V> a = dVar2.mo33576a();
                        V v = a.get();
                        if (this.f48062a.f48004g.mo33489a(obj2, v)) {
                            eVar = EnumC20255e.EXPLICIT;
                        } else if (v != null || !a.mo33542c()) {
                            unlock();
                            mo33623c();
                            return false;
                        } else {
                            eVar = EnumC20255e.COLLECTED;
                        }
                        this.f48065d++;
                        atomicReferenceArray.set(length, m38320a(dVar, dVar2, d, v, a, eVar));
                        this.f48063b--;
                        if (eVar != EnumC20255e.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                mo33623c();
                return false;
            } finally {
                unlock();
                mo33623c();
            }
        }

        /* renamed from: a */
        private void m38325a(AbstractC20254d<K, V> dVar, V v, long j) {
            dVar.mo33576a();
            C20198c.m38194b(true, "Weights must be non-negative");
            dVar.mo33578a(this.f48062a.f48006i.mo33625a(this, dVar, v));
            m38334g();
            this.f48064c++;
            if (this.f48062a.mo33519d()) {
                dVar.mo33577a(j);
            }
            if (this.f48062a.mo33522f()) {
                dVar.mo33554b(j);
            }
            this.f48074m.add(dVar);
            this.f48073l.add(dVar);
        }

        /* renamed from: a */
        private boolean m38326a(AbstractC20254d<K, V> dVar, int i, EnumC20255e eVar) {
            AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48067f;
            int length = i & (atomicReferenceArray.length() - 1);
            AbstractC20254d<K, V> dVar2 = atomicReferenceArray.get(length);
            for (AbstractC20254d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.mo33580b()) {
                if (dVar3 == dVar) {
                    this.f48065d++;
                    atomicReferenceArray.set(length, m38320a(dVar2, dVar3, dVar3.mo33583d(), dVar3.mo33576a().get(), dVar3.mo33576a(), eVar));
                    this.f48063b--;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private AbstractC20254d<K, V> m38320a(AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2, K k, V v, AbstractC20248u<K, V> uVar, EnumC20255e eVar) {
            mo33614a(k, v, uVar.mo33539a(), eVar);
            this.f48073l.remove(dVar2);
            this.f48074m.remove(dVar2);
            return m38327b(dVar, dVar2);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$a */
    abstract class AbstractC20210a<T> extends AbstractSet<T> {

        /* renamed from: a */
        final ConcurrentMap<?, ?> f48019a;

        static {
            Covode.recordClassIndex(23718);
        }

        public void clear() {
            this.f48019a.clear();
        }

        public boolean isEmpty() {
            return this.f48019a.isEmpty();
        }

        public int size() {
            return this.f48019a.size();
        }

        public Object[] toArray() {
            return ConcurrentMapC20207c.m38211a((Collection) this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC20207c.m38211a((Collection) this).toArray(eArr);
        }

        AbstractC20210a(ConcurrentMap<?, ?> concurrentMap) {
            this.f48019a = concurrentMap;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$e */
    final class C20229e extends ConcurrentMapC20207c<K, V>.AbstractC20231g {
        static {
            Covode.recordClassIndex(23737);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            return mo33602a();
        }

        C20229e() {
            super();
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$f */
    final class C20230f extends ConcurrentMapC20207c<K, V>.AbstractC20210a {
        static {
            Covode.recordClassIndex(23738);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C20229e();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && ConcurrentMapC20207c.this.remove(key, entry.getValue())) {
                return true;
            }
            return false;
        }

        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = ConcurrentMapC20207c.this.get(key)) != null && ConcurrentMapC20207c.this.f48004g.mo33489a(entry.getValue(), obj2)) {
                return true;
            }
            return false;
        }

        C20230f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$g */
    abstract class AbstractC20231g<T> implements Iterator<T> {

        /* renamed from: b */
        int f48049b;

        /* renamed from: c */
        int f48050c = -1;

        /* renamed from: d */
        C20236l<K, V> f48051d;

        /* renamed from: e */
        AtomicReferenceArray<AbstractC20254d<K, V>> f48052e;

        /* renamed from: f */
        AbstractC20254d<K, V> f48053f;

        /* renamed from: g */
        ConcurrentMapC20207c<K, V>.C20215ac f48054g;

        /* renamed from: h */
        ConcurrentMapC20207c<K, V>.C20215ac f48055h;

        static {
            Covode.recordClassIndex(23739);
        }

        public boolean hasNext() {
            if (this.f48054g != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m38294c() {
            AbstractC20254d<K, V> dVar = this.f48053f;
            if (dVar == null) {
                return false;
            }
            while (true) {
                this.f48053f = dVar.mo33580b();
                AbstractC20254d<K, V> dVar2 = this.f48053f;
                if (dVar2 == null) {
                    return false;
                }
                if (m38292a(dVar2)) {
                    return true;
                }
                dVar = this.f48053f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ConcurrentMapC20207c<K, V>.C20215ac mo33602a() {
            ConcurrentMapC20207c<K, V>.C20215ac acVar = this.f48054g;
            if (acVar != null) {
                this.f48055h = acVar;
                m38293b();
                return this.f48055h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            ConcurrentMapC20207c<K, V>.C20215ac acVar = this.f48055h;
            if (acVar != null) {
                ConcurrentMapC20207c.this.remove(acVar.getKey());
                this.f48055h = null;
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: b */
        private void m38293b() {
            this.f48054g = null;
            if (!m38294c() && !m38295d()) {
                while (this.f48049b >= 0) {
                    C20236l<K, V>[] lVarArr = ConcurrentMapC20207c.this.f48001d;
                    int i = this.f48049b;
                    this.f48049b = i - 1;
                    C20236l<K, V> lVar = lVarArr[i];
                    this.f48051d = lVar;
                    if (lVar.f48063b != 0) {
                        AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48051d.f48067f;
                        this.f48052e = atomicReferenceArray;
                        this.f48050c = atomicReferenceArray.length() - 1;
                        if (m38295d()) {
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private boolean m38295d() {
            while (true) {
                int i = this.f48050c;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = this.f48052e;
                this.f48050c = i - 1;
                AbstractC20254d<K, V> dVar = atomicReferenceArray.get(i);
                this.f48053f = dVar;
                if (dVar != null && (m38292a(dVar) || m38294c())) {
                    return true;
                }
            }
        }

        AbstractC20231g() {
            this.f48049b = ConcurrentMapC20207c.this.f48001d.length - 1;
            m38293b();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private boolean m38292a(AbstractC20254d<K, V> dVar) {
            try {
                long a = ConcurrentMapC20207c.this.f48014q.mo33497a();
                K d = dVar.mo33583d();
                ConcurrentMapC20207c cVar = ConcurrentMapC20207c.this;
                if (dVar.mo33583d() != null) {
                    V v = dVar.mo33576a().get();
                    if (v != null) {
                        if (!cVar.mo33513a(dVar, a)) {
                            this.f48054g = new C20215ac(d, v);
                            this.f48051d.mo33618b();
                            return true;
                        }
                    }
                }
                this.f48051d.mo33618b();
                return false;
            } catch (Throwable th) {
                this.f48051d.mo33618b();
                throw th;
            }
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$i */
    final class C20233i extends ConcurrentMapC20207c<K, V>.AbstractC20210a {
        static {
            Covode.recordClassIndex(23741);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new C20232h();
        }

        public final boolean contains(Object obj) {
            return this.f48019a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f48019a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        C20233i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$v */
    final class C20249v extends AbstractCollection<V> {

        /* renamed from: b */
        private final ConcurrentMap<?, ?> f48099b;

        static {
            Covode.recordClassIndex(23757);
        }

        public final void clear() {
            this.f48099b.clear();
        }

        public final boolean isEmpty() {
            return this.f48099b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C20247t();
        }

        public final int size() {
            return this.f48099b.size();
        }

        public final Object[] toArray() {
            return ConcurrentMapC20207c.m38211a((Collection) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f48099b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC20207c.m38211a((Collection) this).toArray(eArr);
        }

        C20249v(ConcurrentMap<?, ?> concurrentMap) {
            this.f48099b = concurrentMap;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$ab */
    static final class C20212ab<K, V> extends AbstractQueue<AbstractC20254d<K, V>> {

        /* renamed from: a */
        final AbstractC20254d<K, V> f48024a = new AbstractC20216b<K, V>() {
            /* class com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20212ab.C202131 */

            /* renamed from: a */
            AbstractC20254d<K, V> f48025a = this;

            /* renamed from: b */
            AbstractC20254d<K, V> f48026b = this;

            static {
                Covode.recordClassIndex(23721);
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: b */
            public final void mo33554b(long j) {
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: h */
            public final long mo33557h() {
                return Long.MAX_VALUE;
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: i */
            public final AbstractC20254d<K, V> mo33558i() {
                return this.f48025a;
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: j */
            public final AbstractC20254d<K, V> mo33559j() {
                return this.f48026b;
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: c */
            public final void mo33555c(AbstractC20254d<K, V> dVar) {
                this.f48025a = dVar;
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: d */
            public final void mo33556d(AbstractC20254d<K, V> dVar) {
                this.f48026b = dVar;
            }
        };

        static {
            Covode.recordClassIndex(23720);
        }

        C20212ab() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AbstractC20254d<K, V> peek() {
            AbstractC20254d<K, V> i = this.f48024a.mo33558i();
            if (i == this.f48024a) {
                return null;
            }
            return i;
        }

        public final boolean isEmpty() {
            if (this.f48024a.mo33558i() == this.f48024a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<AbstractC20254d<K, V>> iterator() {
            return new AbstractC20264a<AbstractC20254d<K, V>>(peek()) {
                /* class com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20212ab.C202142 */

                static {
                    Covode.recordClassIndex(23722);
                }

                @Override // com.bytedance.jedi.p1445a.p1454g.p1457c.AbstractC20264a
                /* renamed from: a */
                public final /* synthetic */ Object mo33569a(Object obj) {
                    AbstractC20254d<K, V> i = ((AbstractC20254d) obj).mo33558i();
                    if (i == C20212ab.this.f48024a) {
                        return null;
                    }
                    return i;
                }
            };
        }

        @Override // java.util.Queue
        public final /* synthetic */ Object poll() {
            AbstractC20254d<K, V> i = this.f48024a.mo33558i();
            if (i == this.f48024a) {
                return null;
            }
            remove(i);
            return i;
        }

        public final void clear() {
            AbstractC20254d<K, V> i = this.f48024a.mo33558i();
            while (true) {
                AbstractC20254d<K, V> dVar = this.f48024a;
                if (i != dVar) {
                    AbstractC20254d<K, V> i2 = i.mo33558i();
                    ConcurrentMapC20207c.m38215c(i);
                    i = i2;
                } else {
                    dVar.mo33555c(dVar);
                    AbstractC20254d<K, V> dVar2 = this.f48024a;
                    dVar2.mo33556d(dVar2);
                    return;
                }
            }
        }

        public final int size() {
            int i = 0;
            for (AbstractC20254d<K, V> i2 = this.f48024a.mo33558i(); i2 != this.f48024a; i2 = i2.mo33558i()) {
                i++;
            }
            return i;
        }

        public final boolean contains(Object obj) {
            if (((AbstractC20254d) obj).mo33558i() != EnumC20235k.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        public final /* synthetic */ boolean offer(Object obj) {
            AbstractC20254d dVar = (AbstractC20254d) obj;
            ConcurrentMapC20207c.m38214b(dVar.mo33559j(), dVar.mo33558i());
            ConcurrentMapC20207c.m38214b(this.f48024a.mo33559j(), dVar);
            ConcurrentMapC20207c.m38214b(dVar, this.f48024a);
            return true;
        }

        public final boolean remove(Object obj) {
            AbstractC20254d dVar = (AbstractC20254d) obj;
            AbstractC20254d<K, V> j = dVar.mo33559j();
            AbstractC20254d<K, V> i = dVar.mo33558i();
            ConcurrentMapC20207c.m38214b(j, i);
            ConcurrentMapC20207c.m38215c(dVar);
            if (i != EnumC20235k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$c */
    static final class C20217c<K, V> extends AbstractQueue<AbstractC20254d<K, V>> {

        /* renamed from: a */
        final AbstractC20254d<K, V> f48032a = new AbstractC20216b<K, V>() {
            /* class com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20217c.C202181 */

            /* renamed from: a */
            AbstractC20254d<K, V> f48033a = this;

            /* renamed from: b */
            AbstractC20254d<K, V> f48034b = this;

            static {
                Covode.recordClassIndex(23726);
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: a */
            public final void mo33577a(long j) {
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: e */
            public final long mo33584e() {
                return Long.MAX_VALUE;
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: f */
            public final AbstractC20254d<K, V> mo33585f() {
                return this.f48033a;
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: g */
            public final AbstractC20254d<K, V> mo33586g() {
                return this.f48034b;
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: b */
            public final void mo33581b(AbstractC20254d<K, V> dVar) {
                this.f48034b = dVar;
            }

            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d, com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.AbstractC20216b
            /* renamed from: a */
            public final void mo33579a(AbstractC20254d<K, V> dVar) {
                this.f48033a = dVar;
            }
        };

        static {
            Covode.recordClassIndex(23725);
        }

        C20217c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AbstractC20254d<K, V> peek() {
            AbstractC20254d<K, V> f = this.f48032a.mo33585f();
            if (f == this.f48032a) {
                return null;
            }
            return f;
        }

        public final boolean isEmpty() {
            if (this.f48032a.mo33585f() == this.f48032a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<AbstractC20254d<K, V>> iterator() {
            return new AbstractC20264a<AbstractC20254d<K, V>>(peek()) {
                /* class com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.C20217c.C202192 */

                static {
                    Covode.recordClassIndex(23727);
                }

                @Override // com.bytedance.jedi.p1445a.p1454g.p1457c.AbstractC20264a
                /* renamed from: a */
                public final /* synthetic */ Object mo33569a(Object obj) {
                    AbstractC20254d<K, V> f = ((AbstractC20254d) obj).mo33585f();
                    if (f == C20217c.this.f48032a) {
                        return null;
                    }
                    return f;
                }
            };
        }

        @Override // java.util.Queue
        public final /* synthetic */ Object poll() {
            AbstractC20254d<K, V> f = this.f48032a.mo33585f();
            if (f == this.f48032a) {
                return null;
            }
            remove(f);
            return f;
        }

        public final void clear() {
            AbstractC20254d<K, V> f = this.f48032a.mo33585f();
            while (true) {
                AbstractC20254d<K, V> dVar = this.f48032a;
                if (f != dVar) {
                    AbstractC20254d<K, V> f2 = f.mo33585f();
                    ConcurrentMapC20207c.m38213b(f);
                    f = f2;
                } else {
                    dVar.mo33579a(dVar);
                    AbstractC20254d<K, V> dVar2 = this.f48032a;
                    dVar2.mo33581b(dVar2);
                    return;
                }
            }
        }

        public final int size() {
            int i = 0;
            for (AbstractC20254d<K, V> f = this.f48032a.mo33585f(); f != this.f48032a; f = f.mo33585f()) {
                i++;
            }
            return i;
        }

        public final boolean contains(Object obj) {
            if (((AbstractC20254d) obj).mo33585f() != EnumC20235k.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        public final /* synthetic */ boolean offer(Object obj) {
            AbstractC20254d dVar = (AbstractC20254d) obj;
            ConcurrentMapC20207c.m38212a(dVar.mo33586g(), dVar.mo33585f());
            ConcurrentMapC20207c.m38212a(this.f48032a.mo33586g(), dVar);
            ConcurrentMapC20207c.m38212a(dVar, this.f48032a);
            return true;
        }

        public final boolean remove(Object obj) {
            AbstractC20254d dVar = (AbstractC20254d) obj;
            AbstractC20254d<K, V> g = dVar.mo33586g();
            AbstractC20254d<K, V> f = dVar.mo33585f();
            ConcurrentMapC20207c.m38212a(g, f);
            ConcurrentMapC20207c.m38213b(dVar);
            if (f != EnumC20235k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$h */
    final class C20232h extends ConcurrentMapC20207c<K, V>.AbstractC20231g {
        static {
            Covode.recordClassIndex(23740);
        }

        @Override // java.util.Iterator
        public final K next() {
            return (K) mo33602a().getKey();
        }

        C20232h() {
            super();
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$t */
    final class C20247t extends ConcurrentMapC20207c<K, V>.AbstractC20231g {
        static {
            Covode.recordClassIndex(23755);
        }

        @Override // java.util.Iterator
        public final V next() {
            return (V) mo33602a().getValue();
        }

        C20247t() {
            super();
        }
    }

    /* renamed from: j */
    private boolean m38216j() {
        if (this.f48011n > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo33519d() {
        if (this.f48009l > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo33520e() {
        if (mo33519d() || mo33512a()) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f48018w;
        if (set != null) {
            return set;
        }
        C20230f fVar = new C20230f(this);
        this.f48018w = fVar;
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo33522f() {
        if (mo33515c() || m38216j()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo33523g() {
        if (this.f48005h != EnumC20238n.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo33526h() {
        if (this.f48006i != EnumC20238n.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo33527i() {
        do {
        } while (this.f48012o.poll() != null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f48016u;
        if (set != null) {
            return set;
        }
        C20233i iVar = new C20233i(this);
        this.f48016u = iVar;
        return iVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f48017v;
        if (collection != null) {
            return collection;
        }
        C20249v vVar = new C20249v(this);
        this.f48017v = vVar;
        return vVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.g.b.c$k */
    public enum EnumC20235k implements AbstractC20254d<Object, Object> {
        INSTANCE;

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final AbstractC20248u<Object, Object> mo33576a() {
            return null;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final void mo33577a(long j) {
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final void mo33578a(AbstractC20248u<Object, Object> uVar) {
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: a */
        public final void mo33579a(AbstractC20254d<Object, Object> dVar) {
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public final AbstractC20254d<Object, Object> mo33580b() {
            return null;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public final void mo33554b(long j) {
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: b */
        public final void mo33581b(AbstractC20254d<Object, Object> dVar) {
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: c */
        public final int mo33582c() {
            return 0;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: c */
        public final void mo33555c(AbstractC20254d<Object, Object> dVar) {
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: d */
        public final Object mo33583d() {
            return null;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: d */
        public final void mo33556d(AbstractC20254d<Object, Object> dVar) {
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: e */
        public final long mo33584e() {
            return 0;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: f */
        public final AbstractC20254d<Object, Object> mo33585f() {
            return this;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: g */
        public final AbstractC20254d<Object, Object> mo33586g() {
            return this;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: h */
        public final long mo33557h() {
            return 0;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: i */
        public final AbstractC20254d<Object, Object> mo33558i() {
            return this;
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20254d
        /* renamed from: j */
        public final AbstractC20254d<Object, Object> mo33559j() {
            return this;
        }

        static {
            Covode.recordClassIndex(23743);
        }
    }

    static {
        Covode.recordClassIndex(23715);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo33514b() {
        if (this.f48008k != C20203b.EnumC20206b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo33515c() {
        if (this.f48010m > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.g.b.c$n */
    public enum EnumC20238n {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20238n
            /* renamed from: a */
            public final AbstractC20192a<Object> mo33624a() {
                return AbstractC20192a.C20193a.f47965a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20238n
            /* renamed from: a */
            public final <K, V> AbstractC20248u<K, V> mo33625a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, V v) {
                return new C20245r(v);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20238n
            /* renamed from: a */
            public final AbstractC20192a<Object> mo33624a() {
                return AbstractC20192a.C20194b.f47966a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20238n
            /* renamed from: a */
            public final <K, V> AbstractC20248u<K, V> mo33625a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, V v) {
                return new C20237m(lVar.f48070i, v, dVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20238n
            /* renamed from: a */
            public final AbstractC20192a<Object> mo33624a() {
                return AbstractC20192a.C20194b.f47966a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20238n
            /* renamed from: a */
            public final <K, V> AbstractC20248u<K, V> mo33625a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, V v) {
                return new C20253z(lVar.f48070i, v, dVar);
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC20192a<Object> mo33624a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract <K, V> AbstractC20248u<K, V> mo33625a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, V v);

        static {
            Covode.recordClassIndex(23746);
        }

        /* synthetic */ EnumC20238n(byte b) {
            this();
        }
    }

    public boolean isEmpty() {
        C20236l<K, V>[] lVarArr = this.f48001d;
        long j = 0;
        for (int i = 0; i < lVarArr.length; i++) {
            if (lVarArr[i].f48063b != 0) {
                return false;
            }
            j += (long) lVarArr[i].f48065d;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < lVarArr.length; i2++) {
            if (lVarArr[i2].f48063b != 0) {
                return false;
            }
            j -= (long) lVarArr[i2].f48065d;
        }
        if (j == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        C20236l<K, V>[] lVarArr;
        long j = 0;
        for (C20236l<K, V> lVar : this.f48001d) {
            j += (long) Math.max(0, lVar.f48063b);
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.g.b.c$d */
    public enum EnumC20220d {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33597a(C20236l<K, V> lVar, K k, int i, AbstractC20254d<K, V> dVar) {
                return new C20244q(k, i, dVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33596a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
                AbstractC20254d<K, V> a = super.mo33596a(lVar, dVar, dVar2);
                m38274a(dVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33597a(C20236l<K, V> lVar, K k, int i, AbstractC20254d<K, V> dVar) {
                return new C20242o(k, i, dVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33596a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
                AbstractC20254d<K, V> a = super.mo33596a(lVar, dVar, dVar2);
                m38275b(dVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33597a(C20236l<K, V> lVar, K k, int i, AbstractC20254d<K, V> dVar) {
                return new C20246s(k, i, dVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33596a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
                AbstractC20254d<K, V> a = super.mo33596a(lVar, dVar, dVar2);
                m38274a(dVar, a);
                m38275b(dVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33597a(C20236l<K, V> lVar, K k, int i, AbstractC20254d<K, V> dVar) {
                return new C20243p(k, i, dVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33597a(C20236l<K, V> lVar, K k, int i, AbstractC20254d<K, V> dVar) {
                return new C20252y(lVar.f48069h, k, i, dVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33596a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
                AbstractC20254d<K, V> a = super.mo33596a(lVar, dVar, dVar2);
                m38274a(dVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33597a(C20236l<K, V> lVar, K k, int i, AbstractC20254d<K, V> dVar) {
                return new C20250w(lVar.f48069h, k, i, dVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33596a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
                AbstractC20254d<K, V> a = super.mo33596a(lVar, dVar, dVar2);
                m38275b(dVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33597a(C20236l<K, V> lVar, K k, int i, AbstractC20254d<K, V> dVar) {
                return new C20211aa(lVar.f48069h, k, i, dVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33596a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
                AbstractC20254d<K, V> a = super.mo33596a(lVar, dVar, dVar2);
                m38274a(dVar, a);
                m38275b(dVar, a);
                return a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c.EnumC20220d
            /* renamed from: a */
            public final <K, V> AbstractC20254d<K, V> mo33597a(C20236l<K, V> lVar, K k, int i, AbstractC20254d<K, V> dVar) {
                return new C20251x(lVar.f48069h, k, i, dVar);
            }
        };
        

        /* renamed from: i */
        static final EnumC20220d[] f48045i;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract <K, V> AbstractC20254d<K, V> mo33597a(C20236l<K, V> lVar, K k, int i, AbstractC20254d<K, V> dVar);

        static {
            C202211 r14;
            C202222 r13;
            C202233 r12;
            C202244 r11;
            C202255 r10;
            C202266 r9;
            C202277 r8;
            C202288 r7;
            Covode.recordClassIndex(23728);
            f48045i = new EnumC20220d[]{r14, r13, r12, r11, r10, r9, r8, r7};
        }

        /* renamed from: a */
        static <K, V> void m38274a(AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
            dVar2.mo33577a(dVar.mo33584e());
            ConcurrentMapC20207c.m38212a(dVar.mo33586g(), dVar2);
            ConcurrentMapC20207c.m38212a(dVar2, dVar.mo33585f());
            ConcurrentMapC20207c.m38213b(dVar);
        }

        /* renamed from: b */
        static <K, V> void m38275b(AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
            dVar2.mo33554b(dVar.mo33557h());
            ConcurrentMapC20207c.m38214b(dVar.mo33559j(), dVar2);
            ConcurrentMapC20207c.m38214b(dVar2, dVar.mo33558i());
            ConcurrentMapC20207c.m38215c(dVar);
        }

        /* synthetic */ EnumC20220d(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <K, V> AbstractC20254d<K, V> mo33596a(C20236l<K, V> lVar, AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
            return mo33597a(lVar, dVar.mo33583d(), dVar.mo33582c(), dVar2);
        }
    }

    public void clear() {
        EnumC20255e eVar;
        C20236l<K, V>[] lVarArr = this.f48001d;
        int length = lVarArr.length;
        for (int i = 0; i < length; i++) {
            C20236l<K, V> lVar = lVarArr[i];
            if (lVar.f48063b != 0) {
                lVar.lock();
                try {
                    lVar.mo33619b(lVar.f48062a.f48014q.mo33497a());
                    AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = lVar.f48067f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (AbstractC20254d<K, V> dVar = atomicReferenceArray.get(i2); dVar != null; dVar = dVar.mo33580b()) {
                            if (dVar.mo33576a().mo33542c()) {
                                K d = dVar.mo33583d();
                                V v = dVar.mo33576a().get();
                                if (d != null) {
                                    if (v != null) {
                                        eVar = EnumC20255e.EXPLICIT;
                                        dVar.mo33582c();
                                        lVar.mo33614a(d, v, dVar.mo33576a().mo33539a(), eVar);
                                    }
                                }
                                eVar = EnumC20255e.COLLECTED;
                                dVar.mo33582c();
                                lVar.mo33614a(d, v, dVar.mo33576a().mo33539a(), eVar);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (lVar.f48062a.mo33523g()) {
                        do {
                        } while (lVar.f48069h.poll() != null);
                    }
                    if (lVar.f48062a.mo33526h()) {
                        do {
                        } while (lVar.f48070i.poll() != null);
                    }
                    lVar.f48073l.clear();
                    lVar.f48074m.clear();
                    lVar.f48072k.set(0);
                    lVar.f48065d++;
                    lVar.f48063b = 0;
                } finally {
                    lVar.unlock();
                    lVar.mo33623c();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo33512a() {
        if (this.f48007j >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static <K, V> void m38213b(AbstractC20254d<K, V> dVar) {
        EnumC20235k kVar = EnumC20235k.INSTANCE;
        dVar.mo33579a(kVar);
        dVar.mo33581b(kVar);
    }

    /* renamed from: c */
    static <K, V> void m38215c(AbstractC20254d<K, V> dVar) {
        EnumC20235k kVar = EnumC20235k.INSTANCE;
        dVar.mo33555c(kVar);
        dVar.mo33556d(kVar);
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m38211a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C20265b.m38464a(arrayList, collection.iterator());
        return arrayList;
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int a = mo33508a(obj);
        return mo33509a(a).mo33620b(obj, a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo33508a(obj);
        return mo33509a(a).mo33609a(obj, a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo33508a(obj);
        return mo33509a(a).mo33622c(obj, a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo33508a(Object obj) {
        int a = this.f48003f.mo33488a(obj);
        int i = a + ((a << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.jedi.a.g.b.c<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C20236l<K, V> mo33509a(int i) {
        return this.f48001d[(i >>> this.f48000c) & this.f47999b];
    }

    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long a = this.f48014q.mo33497a();
        C20236l<K, V>[] lVarArr = this.f48001d;
        long j = -1;
        int i = 0;
        do {
            long j2 = 0;
            for (C20236l<K, V> lVar : lVarArr) {
                int i2 = lVar.f48063b;
                AtomicReferenceArray<AbstractC20254d<K, V>> atomicReferenceArray = lVar.f48067f;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (AbstractC20254d<K, V> dVar = atomicReferenceArray.get(i3); dVar != null; dVar = dVar.mo33580b()) {
                        V v = null;
                        if (dVar.mo33583d() == null) {
                            lVar.mo33612a();
                        } else {
                            V v2 = dVar.mo33576a().get();
                            if (v2 == null) {
                                lVar.mo33612a();
                            } else if (lVar.f48062a.mo33513a(dVar, a)) {
                                lVar.mo33613a(a);
                            } else {
                                v = v2;
                            }
                        }
                        if (v != null && this.f48004g.mo33489a(obj, v)) {
                            return true;
                        }
                    }
                }
                j2 += (long) lVar.f48065d;
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
    public final void mo33510a(AbstractC20248u<K, V> uVar) {
        AbstractC20254d<K, V> b = uVar.mo33541b();
        int c = b.mo33582c();
        mo33509a(c).mo33616a((Object) b.mo33583d(), c, (AbstractC20248u) uVar);
    }

    ConcurrentMapC20207c(C20203b<? super K, ? super V> bVar) {
        int i;
        long j;
        long j2;
        long j3;
        boolean z;
        AbstractC20200e eVar;
        char c;
        boolean z2;
        int i2;
        int i3;
        char c2 = 4;
        if (bVar.f47979d == -1) {
            i = 4;
        } else {
            i = bVar.f47979d;
        }
        this.f48002e = Math.min(i, 65536);
        EnumC20238n b = bVar.mo33504b();
        this.f48005h = b;
        this.f48006i = bVar.mo33505c();
        this.f48003f = (AbstractC20192a) C20195b.m38184a(bVar.f47988m, bVar.mo33504b().mo33624a());
        this.f48004g = (AbstractC20192a) C20195b.m38184a(bVar.f47989n, bVar.mo33505c().mo33624a());
        long j4 = 0;
        if (bVar.f47985j == 0 || bVar.f47986k == 0) {
            j = 0;
        } else if (bVar.f47982g == null) {
            j = bVar.f47980e;
        } else {
            j = bVar.f47981f;
        }
        this.f48007j = j;
        this.f48008k = (AbstractC20263h) C20195b.m38184a(bVar.f47982g, C20203b.EnumC20206b.INSTANCE);
        if (bVar.f47986k == -1) {
            j2 = 0;
        } else {
            j2 = bVar.f47986k;
        }
        this.f48009l = j2;
        if (bVar.f47985j == -1) {
            j3 = 0;
        } else {
            j3 = bVar.f47985j;
        }
        this.f48010m = j3;
        this.f48011n = bVar.f47987l != -1 ? bVar.f47987l : j4;
        AbstractC20261f<K, V> fVar = (AbstractC20261f) C20195b.m38184a(bVar.f47990o, C20203b.EnumC20205a.INSTANCE);
        this.f48013p = fVar;
        this.f48012o = fVar == C20203b.EnumC20205a.INSTANCE ? (Queue<C20262g<K, V>>) f47998t : new ConcurrentLinkedQueue();
        int i4 = 0;
        int i5 = 1;
        if (mo33522f() || mo33519d()) {
            z = true;
        } else {
            z = false;
        }
        if (bVar.f47991p != null) {
            eVar = bVar.f47991p;
        } else if (z) {
            eVar = AbstractC20200e.f47974a;
        } else {
            eVar = C20203b.f47975a;
        }
        this.f48014q = eVar;
        if (mo33520e() || mo33519d()) {
            c = 1;
        } else {
            c = 0;
        }
        if (mo33515c() || mo33522f()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = (b != EnumC20238n.WEAK ? 0 : c2) | c;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.f48015r = EnumC20220d.f48045i[i6 | i2];
        if (bVar.f47978c == -1) {
            i3 = 16;
        } else {
            i3 = bVar.f47978c;
        }
        int min = Math.min(i3, 1073741824);
        if (mo33512a() && !mo33514b()) {
            min = (int) Math.min((long) min, j);
        }
        int i7 = 1;
        int i8 = 0;
        while (i7 < this.f48002e && (!mo33512a() || ((long) (i7 * 20)) <= this.f48007j)) {
            i8++;
            i7 <<= 1;
        }
        this.f48000c = 32 - i8;
        this.f47999b = i7 - 1;
        this.f48001d = new C20236l[i7];
        int i9 = min / i7;
        while (i5 < (i9 * i7 < min ? i9 + 1 : i9)) {
            i5 <<= 1;
        }
        if (mo33512a()) {
            long j5 = this.f48007j;
            long j6 = (long) i7;
            long j7 = (j5 / j6) + 1;
            long j8 = j5 % j6;
            while (true) {
                C20236l<K, V>[] lVarArr = this.f48001d;
                if (i4 < lVarArr.length) {
                    if (((long) i4) == j8) {
                        j7--;
                    }
                    lVarArr[i4] = m38210a(i5, j7);
                    i4++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C20236l<K, V>[] lVarArr2 = this.f48001d;
                if (i4 < lVarArr2.length) {
                    lVarArr2[i4] = m38210a(i5, -1);
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33511a(AbstractC20254d<K, V> dVar) {
        int c = dVar.mo33582c();
        mo33509a(c).mo33615a((AbstractC20254d) dVar, c);
    }

    /* renamed from: a */
    private C20236l<K, V> m38210a(int i, long j) {
        return new C20236l<>(this, i, j);
    }

    /* renamed from: b */
    static <K, V> void m38214b(AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
        dVar.mo33555c(dVar2);
        dVar2.mo33556d(dVar);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    /* renamed from: a */
    static <K, V> void m38212a(AbstractC20254d<K, V> dVar, AbstractC20254d<K, V> dVar2) {
        dVar.mo33579a(dVar2);
        dVar2.mo33581b(dVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        C20198c.m38190a(k);
        C20198c.m38190a(v);
        int a = mo33508a((Object) k);
        return mo33509a(a).mo33611a((Object) k, a, (Object) v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        C20198c.m38190a(k);
        C20198c.m38190a(v);
        int a = mo33508a((Object) k);
        return mo33509a(a).mo33611a((Object) k, a, (Object) v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        C20198c.m38190a(k);
        C20198c.m38190a(v);
        int a = mo33508a((Object) k);
        return mo33509a(a).mo33610a((Object) k, a, (Object) v);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a = mo33508a(obj);
        return mo33509a(a).mo33621b(obj, a, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo33513a(AbstractC20254d<K, V> dVar, long j) {
        C20198c.m38190a(dVar);
        if (mo33519d() && j - dVar.mo33584e() >= this.f48009l) {
            return true;
        }
        if (!mo33515c() || j - dVar.mo33557h() < this.f48010m) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        C20198c.m38190a(k);
        C20198c.m38190a(v2);
        if (v == null) {
            return false;
        }
        int a = mo33508a((Object) k);
        return mo33509a(a).mo33617a(k, a, v, v2);
    }
}
