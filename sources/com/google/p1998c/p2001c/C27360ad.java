package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.AbstractC27381ai;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.google.c.c.ad */
final class C27360ad<K, V> extends AbstractC27381ai.AbstractC27383b<K> {

    /* renamed from: a */
    private final AbstractC27349ab<K, V> f64642a;

    static {
        Covode.recordClassIndex(32940);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final boolean mo45578a() {
        return true;
    }

    /* renamed from: com.google.c.c.ad$a */
    static class C27361a<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final AbstractC27349ab<K, ?> f64643a;

        static {
            Covode.recordClassIndex(32941);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.f64643a.keySet();
        }

        C27361a(AbstractC27349ab<K, ?> abVar) {
            this.f64643a = abVar;
        }
    }

    public final int size() {
        return this.f64642a.size();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27536x
    public final Object writeReplace() {
        return new C27361a(this.f64642a);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.AbstractCollection, com.google.p1998c.p2001c.AbstractC27381ai.AbstractC27383b, com.google.p1998c.p2001c.AbstractC27381ai.AbstractC27383b, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
    public final AbstractC27479br<K> iterator() {
        AbstractC27349ab<K, V> abVar = this.f64642a;
        return new AbstractC27479br<K>(abVar.entrySet().iterator()) {
            /* class com.google.p1998c.p2001c.AbstractC27349ab.C273501 */

            /* renamed from: a */
            final /* synthetic */ AbstractC27479br f64627a;

            static {
                Covode.recordClassIndex(32930);
            }

            public final boolean hasNext() {
                return this.f64627a.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                return (K) ((Map.Entry) this.f64627a.next()).getKey();
            }

            {
                this.f64627a = r2;
            }
        };
    }

    C27360ad(AbstractC27349ab<K, V> abVar) {
        this.f64642a = abVar;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public final boolean contains(Object obj) {
        return this.f64642a.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai.AbstractC27383b
    /* renamed from: a */
    public final K mo45585a(int i) {
        return this.f64642a.entrySet().asList().get(i).getKey();
    }
}
