package androidx.p025c;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: androidx.c.e */
public class C0490e<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f1857a;

    /* renamed from: b */
    private int f1858b;

    /* renamed from: c */
    private int f1859c;

    /* renamed from: d */
    private int f1860d;

    /* renamed from: e */
    private int f1861e;

    /* renamed from: f */
    private int f1862f;

    /* renamed from: g */
    private int f1863g;

    static {
        Covode.recordClassIndex(556);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo2096b(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final void mo2093a() {
        mo2094a(-1);
    }

    /* renamed from: b */
    public final synchronized int mo2095b() {
        return this.f1858b;
    }

    /* renamed from: c */
    public final synchronized Map<K, V> mo2098c() {
        return new LinkedHashMap(this.f1857a);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f1862f;
        int i3 = this.f1863g + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return C1764a.m5929a(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f1859c), Integer.valueOf(this.f1862f), Integer.valueOf(this.f1863g), Integer.valueOf(i)});
    }

    public C0490e(int i) {
        if (i > 0) {
            this.f1859c = i;
            this.f1857a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: b */
    public final V mo2097b(K k) {
        V remove;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            remove = this.f1857a.remove(k);
            if (remove != null) {
                this.f1858b -= m1768c(k, remove);
            }
        }
        return remove;
    }

    /* renamed from: a */
    public final V mo2091a(K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f1857a.get(k);
            if (v != null) {
                this.f1862f++;
                return v;
            }
            this.f1863g++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2094a(int r5) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p025c.C0490e.mo2094a(int):void");
    }

    /* renamed from: c */
    private int m1768c(K k, V v) {
        int b = mo2096b(k, v);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + ((Object) k) + "=" + ((Object) v));
    }

    /* renamed from: a */
    public final V mo2092a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1860d++;
            this.f1858b += m1768c(k, v);
            put = this.f1857a.put(k, v);
            if (put != null) {
                this.f1858b -= m1768c(k, put);
            }
        }
        mo2094a(this.f1859c);
        return put;
    }
}
