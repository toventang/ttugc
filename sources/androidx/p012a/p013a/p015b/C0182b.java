package androidx.p012a.p013a.p015b;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.a.a.b.b */
public class C0182b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public C0185c<K, V> f477b;

    /* renamed from: c */
    public C0185c<K, V> f478c;

    /* renamed from: d */
    public WeakHashMap<AbstractC0188f<K, V>, Boolean> f479d = new WeakHashMap<>();

    /* renamed from: e */
    public int f480e = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.a.a.b.b$f */
    public interface AbstractC0188f<K, V> {
        static {
            Covode.recordClassIndex(212);
        }

        /* renamed from: a_ */
        void mo360a_(C0185c<K, V> cVar);
    }

    static {
        Covode.recordClassIndex(206);
    }

    /* renamed from: androidx.a.a.b.b$c */
    public static class C0185c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f481a;

        /* renamed from: b */
        final V f482b;

        /* renamed from: c */
        C0185c<K, V> f483c;

        /* renamed from: d */
        public C0185c<K, V> f484d;

        static {
            Covode.recordClassIndex(209);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f481a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f482b;
        }

        public final int hashCode() {
            return this.f481a.hashCode() ^ this.f482b.hashCode();
        }

        public final String toString() {
            return ((Object) this.f481a) + "=" + ((Object) this.f482b);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0185c)) {
                return false;
            }
            C0185c cVar = (C0185c) obj;
            if (!this.f481a.equals(cVar.f481a) || !this.f482b.equals(cVar.f482b)) {
                return false;
            }
            return true;
        }

        C0185c(K k, V v) {
            this.f481a = k;
            this.f482b = v;
        }
    }

    /* renamed from: androidx.a.a.b.b$e */
    static abstract class AbstractC0187e<K, V> implements AbstractC0188f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        C0185c<K, V> f488a;

        /* renamed from: b */
        C0185c<K, V> f489b;

        static {
            Covode.recordClassIndex(211);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0185c<K, V> mo352a(C0185c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C0185c<K, V> mo353b(C0185c<K, V> cVar);

        public boolean hasNext() {
            if (this.f489b != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private C0185c<K, V> m606a() {
            C0185c<K, V> cVar = this.f489b;
            C0185c<K, V> cVar2 = this.f488a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo352a(cVar);
        }

        @Override // java.util.Iterator
        public /* synthetic */ Object next() {
            C0185c<K, V> cVar = this.f489b;
            this.f489b = m606a();
            return cVar;
        }

        @Override // androidx.p012a.p013a.p015b.C0182b.AbstractC0188f
        /* renamed from: a_ */
        public final void mo360a_(C0185c<K, V> cVar) {
            if (this.f488a == cVar && cVar == this.f489b) {
                this.f489b = null;
                this.f488a = null;
            }
            C0185c<K, V> cVar2 = this.f488a;
            if (cVar2 == cVar) {
                this.f488a = mo353b(cVar2);
            }
            if (this.f489b == cVar) {
                this.f489b = m606a();
            }
        }

        AbstractC0187e(C0185c<K, V> cVar, C0185c<K, V> cVar2) {
            this.f488a = cVar2;
            this.f489b = cVar;
        }
    }

    /* renamed from: androidx.a.a.b.b$d */
    public class C0186d implements AbstractC0188f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private C0185c<K, V> f486b;

        /* renamed from: c */
        private boolean f487c = true;

        static {
            Covode.recordClassIndex(210);
        }

        public final boolean hasNext() {
            if (!this.f487c) {
                C0185c<K, V> cVar = this.f486b;
                if (cVar == null || cVar.f483c == null) {
                    return false;
                }
                return true;
            } else if (C0182b.this.f477b != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ Object next() {
            C0185c<K, V> cVar;
            if (this.f487c) {
                this.f487c = false;
                cVar = C0182b.this.f477b;
            } else {
                C0185c<K, V> cVar2 = this.f486b;
                if (cVar2 != null) {
                    cVar = cVar2.f483c;
                } else {
                    cVar = null;
                }
            }
            this.f486b = cVar;
            return cVar;
        }

        C0186d() {
        }

        @Override // androidx.p012a.p013a.p015b.C0182b.AbstractC0188f
        /* renamed from: a_ */
        public final void mo360a_(C0185c<K, V> cVar) {
            boolean z;
            C0185c<K, V> cVar2 = this.f486b;
            if (cVar == cVar2) {
                C0185c<K, V> cVar3 = cVar2.f484d;
                this.f486b = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f487c = z;
            }
        }
    }

    /* renamed from: a */
    public final C0182b<K, V>.C0186d mo346a() {
        C0182b<K, V>.C0186d dVar = new C0186d();
        this.f479d.put(dVar, false);
        return dVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0183a aVar = new C0183a(this.f477b, this.f478c);
        this.f479d.put(aVar, false);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.a.a.b.b$a */
    public static class C0183a<K, V> extends AbstractC0187e<K, V> {
        static {
            Covode.recordClassIndex(207);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.p012a.p013a.p015b.C0182b.AbstractC0187e
        /* renamed from: a */
        public final C0185c<K, V> mo352a(C0185c<K, V> cVar) {
            return cVar.f483c;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.p012a.p013a.p015b.C0182b.AbstractC0187e
        /* renamed from: b */
        public final C0185c<K, V> mo353b(C0185c<K, V> cVar) {
            return cVar.f484d;
        }

        C0183a(C0185c<K, V> cVar, C0185c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: androidx.a.a.b.b$b */
    public static class C0184b<K, V> extends AbstractC0187e<K, V> {
        static {
            Covode.recordClassIndex(208);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.p012a.p013a.p015b.C0182b.AbstractC0187e
        /* renamed from: a */
        public final C0185c<K, V> mo352a(C0185c<K, V> cVar) {
            return cVar.f484d;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.p012a.p013a.p015b.C0182b.AbstractC0187e
        /* renamed from: b */
        public final C0185c<K, V> mo353b(C0185c<K, V> cVar) {
            return cVar.f483c;
        }

        public C0184b(C0185c<K, V> cVar, C0185c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0185c<K, V> mo342a(K k) {
        C0185c<K, V> cVar = this.f477b;
        while (cVar != null && !cVar.f481a.equals(k)) {
            cVar = cVar.f483c;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo344b(K k) {
        C0185c<K, V> a = mo342a(k);
        if (a == null) {
            return null;
        }
        this.f480e--;
        if (!this.f479d.isEmpty()) {
            for (AbstractC0188f<K, V> fVar : this.f479d.keySet()) {
                fVar.mo360a_(a);
            }
        }
        if (a.f484d != null) {
            a.f484d.f483c = a.f483c;
        } else {
            this.f477b = a.f483c;
        }
        if (a.f483c != null) {
            a.f483c.f484d = a.f484d;
        } else {
            this.f478c = a.f484d;
        }
        a.f483c = null;
        a.f484d = null;
        return a.f482b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0182b)) {
            return false;
        }
        C0182b bVar = (C0182b) obj;
        if (this.f480e != bVar.f480e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if (next == null) {
                if (next2 == null) {
                }
            } else if (!next.equals(next2)) {
            }
            return false;
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0185c<K, V> mo347b(K k, V v) {
        C0185c<K, V> cVar = new C0185c<>(k, v);
        this.f480e++;
        C0185c<K, V> cVar2 = this.f478c;
        if (cVar2 == null) {
            this.f477b = cVar;
            this.f478c = cVar;
            return cVar;
        }
        cVar2.f483c = cVar;
        cVar.f484d = this.f478c;
        this.f478c = cVar;
        return cVar;
    }

    /* renamed from: a */
    public V mo343a(K k, V v) {
        C0185c<K, V> a = mo342a(k);
        if (a != null) {
            return a.f482b;
        }
        mo347b(k, v);
        return null;
    }
}
