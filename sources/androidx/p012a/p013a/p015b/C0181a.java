package androidx.p012a.p013a.p015b;

import androidx.p012a.p013a.p015b.C0182b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: androidx.a.a.b.a */
public final class C0181a<K, V> extends C0182b<K, V> {

    /* renamed from: a */
    public HashMap<K, C0182b.C0185c<K, V>> f476a = new HashMap<>();

    static {
        Covode.recordClassIndex(205);
    }

    /* renamed from: c */
    public final boolean mo345c(K k) {
        return this.f476a.containsKey(k);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p012a.p013a.p015b.C0182b
    /* renamed from: a */
    public final C0182b.C0185c<K, V> mo342a(K k) {
        return this.f476a.get(k);
    }

    @Override // androidx.p012a.p013a.p015b.C0182b
    /* renamed from: b */
    public final V mo344b(K k) {
        V v = (V) super.mo344b(k);
        this.f476a.remove(k);
        return v;
    }

    @Override // androidx.p012a.p013a.p015b.C0182b
    /* renamed from: a */
    public final V mo343a(K k, V v) {
        C0182b.C0185c<K, V> a = mo342a(k);
        if (a != null) {
            return a.f482b;
        }
        this.f476a.put(k, mo347b(k, v));
        return null;
    }
}
