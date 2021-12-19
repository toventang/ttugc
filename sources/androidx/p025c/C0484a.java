package androidx.p025c;

import androidx.p025c.AbstractC0491f;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.c.a */
public class C0484a<K, V> extends C0497g<K, V> implements Map<K, V> {

    /* renamed from: a */
    AbstractC0491f<K, V> f1836a;

    static {
        Covode.recordClassIndex(550);
    }

    public C0484a() {
    }

    /* renamed from: a */
    private AbstractC0491f<K, V> m1723a() {
        if (this.f1836a == null) {
            this.f1836a = new AbstractC0491f<K, V>() {
                /* class androidx.p025c.C0484a.C04851 */

                static {
                    Covode.recordClassIndex(551);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: b */
                public final Map<K, V> mo2056b() {
                    return C0484a.this;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final int mo2049a() {
                    return C0484a.this.f1885h;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: c */
                public final void mo2057c() {
                    C0484a.this.clear();
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: b */
                public final int mo2055b(Object obj) {
                    return C0484a.this.mo2161b(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final int mo2050a(Object obj) {
                    return C0484a.this.mo2158a(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final void mo2053a(int i) {
                    C0484a.this.mo2167d(i);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final Object mo2051a(int i, int i2) {
                    return C0484a.this.f1884g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final V mo2052a(int i, V v) {
                    return (V) C0484a.this.mo2159a(i, v);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final void mo2054a(K k, V v) {
                    C0484a.this.put(k, v);
                }
            };
        }
        return this.f1836a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m1723a().mo2102d();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        AbstractC0491f<K, V> a = m1723a();
        if (a.f1864b == null) {
            a.f1864b = new AbstractC0491f.C0493b();
        }
        return a.f1864b;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        AbstractC0491f<K, V> a = m1723a();
        if (a.f1866d == null) {
            a.f1866d = new AbstractC0491f.C0496e();
        }
        return a.f1866d;
    }

    public C0484a(int i) {
        super(i);
    }

    public C0484a(C0497g gVar) {
        super(gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.c.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        mo2160a(this.f1885h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
