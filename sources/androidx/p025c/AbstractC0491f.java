package androidx.p025c;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: androidx.c.f */
public abstract class AbstractC0491f<K, V> {

    /* renamed from: b */
    AbstractC0491f<K, V>.C0493b f1864b;

    /* renamed from: c */
    AbstractC0491f<K, V>.C0494c f1865c;

    /* renamed from: d */
    AbstractC0491f<K, V>.C0496e f1866d;

    static {
        Covode.recordClassIndex(557);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2049a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2050a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo2051a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo2052a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2053a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2054a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo2055b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo2056b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo2057c();

    AbstractC0491f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.c.f$b */
    public final class C0493b implements Set<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(559);
        }

        public final void clear() {
            AbstractC0491f.this.mo2057c();
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C0495d();
        }

        public final int size() {
            return AbstractC0491f.this.mo2049a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final boolean isEmpty() {
            if (AbstractC0491f.this.mo2049a() == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int i = 0;
            for (int a = AbstractC0491f.this.mo2049a() - 1; a >= 0; a--) {
                Object a2 = AbstractC0491f.this.mo2051a(a, 0);
                Object a3 = AbstractC0491f.this.mo2051a(a, 1);
                if (a2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = a2.hashCode();
                }
                if (a3 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = a3.hashCode();
                }
                i += hashCode ^ hashCode2;
            }
            return i;
        }

        C0493b() {
        }

        @Override // java.util.Collection, java.util.Set
        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return AbstractC0491f.m1778a((Set) this, obj);
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.c.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a = AbstractC0491f.this.mo2049a();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC0491f.this.mo2054a(entry.getKey(), entry.getValue());
            }
            if (a != AbstractC0491f.this.mo2049a()) {
                return true;
            }
            return false;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = AbstractC0491f.this.mo2050a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0488c.m1751a(AbstractC0491f.this.mo2051a(a, 1), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.c.f$c */
    public final class C0494c implements Set<K> {
        static {
            Covode.recordClassIndex(560);
        }

        public final void clear() {
            AbstractC0491f.this.mo2057c();
        }

        public final int size() {
            return AbstractC0491f.this.mo2049a();
        }

        public final Object[] toArray() {
            return AbstractC0491f.this.mo2101b(0);
        }

        public final boolean isEmpty() {
            if (AbstractC0491f.this.mo2049a() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new C0492a(0);
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            for (int a = AbstractC0491f.this.mo2049a() - 1; a >= 0; a--) {
                Object a2 = AbstractC0491f.this.mo2051a(a, 0);
                if (a2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = a2.hashCode();
                }
                i += hashCode;
            }
            return i;
        }

        C0494c() {
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return AbstractC0491f.m1778a((Set) this, obj);
        }

        public final boolean contains(Object obj) {
            if (AbstractC0491f.this.mo2050a(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            return AbstractC0491f.m1777a((Map) AbstractC0491f.this.mo2056b(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0491f.this.mo2100a(tArr, 0);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> b = AbstractC0491f.this.mo2056b();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!b.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            int a = AbstractC0491f.this.mo2050a(obj);
            if (a < 0) {
                return false;
            }
            AbstractC0491f.this.mo2053a(a);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> b = AbstractC0491f.this.mo2056b();
            int size = b.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                b.remove(it.next());
            }
            if (size != b.size()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.c.f$e */
    public final class C0496e implements Collection<V> {
        static {
            Covode.recordClassIndex(562);
        }

        public final void clear() {
            AbstractC0491f.this.mo2057c();
        }

        public final int size() {
            return AbstractC0491f.this.mo2049a();
        }

        public final Object[] toArray() {
            return AbstractC0491f.this.mo2101b(1);
        }

        public final boolean isEmpty() {
            if (AbstractC0491f.this.mo2049a() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C0492a(1);
        }

        C0496e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean contains(Object obj) {
            if (AbstractC0491f.this.mo2055b(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0491f.this.mo2100a(tArr, 1);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            int b = AbstractC0491f.this.mo2055b(obj);
            if (b < 0) {
                return false;
            }
            AbstractC0491f.this.mo2053a(b);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int a = AbstractC0491f.this.mo2049a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(AbstractC0491f.this.mo2051a(i, 1))) {
                    AbstractC0491f.this.mo2053a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int a = AbstractC0491f.this.mo2049a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(AbstractC0491f.this.mo2051a(i, 1))) {
                    AbstractC0491f.this.mo2053a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }
    }

    /* renamed from: androidx.c.f$a */
    final class C0492a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f1867a;

        /* renamed from: b */
        int f1868b;

        /* renamed from: c */
        int f1869c;

        /* renamed from: d */
        boolean f1870d;

        static {
            Covode.recordClassIndex(558);
        }

        public final boolean hasNext() {
            if (this.f1869c < this.f1868b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t = (T) AbstractC0491f.this.mo2051a(this.f1869c, this.f1867a);
                this.f1869c++;
                this.f1870d = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f1870d) {
                int i = this.f1869c - 1;
                this.f1869c = i;
                this.f1868b--;
                this.f1870d = false;
                AbstractC0491f.this.mo2053a(i);
                return;
            }
            throw new IllegalStateException();
        }

        C0492a(int i) {
            this.f1867a = i;
            this.f1868b = AbstractC0491f.this.mo2049a();
        }
    }

    /* renamed from: androidx.c.f$d */
    final class C0495d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f1874a;

        /* renamed from: b */
        int f1875b = -1;

        /* renamed from: c */
        boolean f1876c;

        static {
            Covode.recordClassIndex(561);
        }

        public final boolean hasNext() {
            if (this.f1875b < this.f1874a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f1876c) {
                return (K) AbstractC0491f.this.mo2051a(this.f1875b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f1876c) {
                return (V) AbstractC0491f.this.mo2051a(this.f1875b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.f1875b++;
                this.f1876c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        public final int hashCode() {
            int hashCode;
            if (this.f1876c) {
                int i = 0;
                Object a = AbstractC0491f.this.mo2051a(this.f1875b, 0);
                Object a2 = AbstractC0491f.this.mo2051a(this.f1875b, 1);
                if (a == null) {
                    hashCode = 0;
                } else {
                    hashCode = a.hashCode();
                }
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final void remove() {
            if (this.f1876c) {
                AbstractC0491f.this.mo2053a(this.f1875b);
                this.f1875b--;
                this.f1874a--;
                this.f1876c = false;
                return;
            }
            throw new IllegalStateException();
        }

        C0495d() {
            this.f1874a = AbstractC0491f.this.mo2049a() - 1;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.f1876c) {
                return (V) AbstractC0491f.this.mo2052a(this.f1875b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            if (!this.f1876c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C0488c.m1751a(entry.getKey(), AbstractC0491f.this.mo2051a(this.f1875b, 0)) || !C0488c.m1751a(entry.getValue(), AbstractC0491f.this.mo2051a(this.f1875b, 1))) {
                    return false;
                }
                return true;
            }
        }
    }

    /* renamed from: d */
    public final Set<K> mo2102d() {
        if (this.f1865c == null) {
            this.f1865c = new C0494c();
        }
        return this.f1865c;
    }

    /* renamed from: b */
    public final Object[] mo2101b(int i) {
        int a = mo2049a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo2051a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public static <T> boolean m1778a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static <K, V> boolean m1777a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> T[] mo2100a(T[] tArr, int i) {
        int a = mo2049a();
        if (tArr.length < a) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), a));
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo2051a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }
}
