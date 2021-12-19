package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.google.c.c.ac */
abstract class AbstractC27358ac<K, V> extends AbstractC27381ai<Map.Entry<K, V>> {
    static {
        Covode.recordClassIndex(32938);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract AbstractC27349ab<K, V> mo45570b();

    AbstractC27358ac() {
    }

    /* renamed from: com.google.c.c.ac$a */
    static class C27359a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final AbstractC27349ab<K, V> f64641a;

        static {
            Covode.recordClassIndex(32939);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.f64641a.entrySet();
        }

        C27359a(AbstractC27349ab<K, V> abVar) {
            this.f64641a = abVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final boolean mo45578a() {
        return mo45570b().mo45549d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai
    /* renamed from: c */
    public final boolean mo45579c() {
        return mo45570b().mo45550e();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27381ai
    public int hashCode() {
        return mo45570b().hashCode();
    }

    public int size() {
        return mo45570b().size();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27536x
    public Object writeReplace() {
        return new C27359a(mo45570b());
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            V v = mo45570b().get(entry.getKey());
            if (v == null || !v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
