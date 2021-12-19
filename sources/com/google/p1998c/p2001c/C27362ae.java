package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.google.c.c.ae */
final class C27362ae<K, V> extends AbstractC27536x<V> {

    /* renamed from: a */
    public final AbstractC27349ab<K, V> f64644a;

    static {
        Covode.recordClassIndex(32942);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final boolean mo45578a() {
        return true;
    }

    /* renamed from: com.google.c.c.ae$a */
    static class C27365a<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final AbstractC27349ab<?, V> f64649a;

        static {
            Covode.recordClassIndex(32945);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.f64649a.values();
        }

        C27365a(AbstractC27349ab<?, V> abVar) {
            this.f64649a = abVar;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
    public final AbstractC27479br<V> iterator() {
        return new AbstractC27479br<V>() {
            /* class com.google.p1998c.p2001c.C27362ae.C273631 */

            /* renamed from: a */
            final AbstractC27479br<Map.Entry<K, V>> f64645a;

            static {
                Covode.recordClassIndex(32943);
            }

            public final boolean hasNext() {
                return this.f64645a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                return this.f64645a.next().getValue();
            }

            {
                this.f64645a = C27362ae.this.f64644a.entrySet().iterator();
            }
        };
    }

    public final int size() {
        return this.f64644a.size();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public final Object writeReplace() {
        return new C27365a(this.f64644a);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public final AbstractC27540z<V> asList() {
        final AbstractC27540z<Map.Entry<K, V>> asList = this.f64644a.entrySet().asList();
        return new AbstractC27540z<V>() {
            /* class com.google.p1998c.p2001c.C27362ae.C273642 */

            static {
                Covode.recordClassIndex(32944);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2001c.AbstractC27536x
            /* renamed from: a */
            public final boolean mo45578a() {
                return true;
            }

            public final int size() {
                return asList.size();
            }

            @Override // java.util.List
            public final V get(int i) {
                return (V) ((Map.Entry) asList.get(i)).getValue();
            }
        };
    }

    C27362ae(AbstractC27349ab<K, V> abVar) {
        this.f64644a = abVar;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public final boolean contains(Object obj) {
        if (obj != null) {
            AbstractC27479br<V> it = iterator();
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
