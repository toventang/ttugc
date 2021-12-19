package com.p2082ss.android.push.window.oppo;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.push.window.oppo.b */
public final class C30197b<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f72010a;

    /* renamed from: b */
    private int f72011b;

    /* renamed from: c */
    private int f72012c;

    /* renamed from: d */
    private int f72013d;

    /* renamed from: e */
    private int f72014e;

    /* renamed from: f */
    private int f72015f;

    /* renamed from: g */
    private int f72016g;

    static {
        Covode.recordClassIndex(36703);
    }

    /* renamed from: a */
    public final synchronized void mo53623a() {
        MethodCollector.m26663i(12663);
        m61079a(-1);
        MethodCollector.m26664o(12663);
    }

    /* renamed from: b */
    public final synchronized Map<K, V> mo53624b() {
        LinkedHashMap linkedHashMap;
        MethodCollector.m26663i(12778);
        linkedHashMap = new LinkedHashMap(this.f72010a);
        MethodCollector.m26664o(12778);
        return linkedHashMap;
    }

    public final synchronized String toString() {
        int i;
        String a;
        MethodCollector.m26663i(12860);
        int i2 = this.f72015f;
        int i3 = this.f72016g + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        a = C1764a.m5928a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f72012c), Integer.valueOf(this.f72015f), Integer.valueOf(this.f72016g), Integer.valueOf(i)});
        MethodCollector.m26664o(12860);
        return a;
    }

    public C30197b(int i) {
        if (i > 0) {
            this.f72012c = i;
            this.f72010a = new LinkedHashMap<>(0, 0.75f, false);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    private void m61079a(int i) {
        Map.Entry<K, V> next;
        while (this.f72011b > i && !this.f72010a.isEmpty() && (next = this.f72010a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            next.getValue();
            this.f72010a.remove(key);
            this.f72011b--;
            this.f72014e++;
        }
        if (this.f72011b < 0 || (this.f72010a.isEmpty() && this.f72011b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    /* renamed from: a */
    public final synchronized V mo53622a(K k, V v) {
        V put;
        MethodCollector.m26663i(12558);
        if (k != null) {
            this.f72013d++;
            this.f72011b++;
            put = this.f72010a.put(k, v);
            if (put != null) {
                this.f72011b--;
            }
            m61079a(this.f72012c);
            MethodCollector.m26664o(12558);
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null || value == null");
            MethodCollector.m26664o(12558);
            throw nullPointerException;
        }
        return put;
    }
}
