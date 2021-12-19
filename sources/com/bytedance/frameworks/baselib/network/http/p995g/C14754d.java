package com.bytedance.frameworks.baselib.network.http.p995g;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g.d */
public final class C14754d<K, V> {

    /* renamed from: a */
    private Map<K, V> f35961a;

    /* renamed from: b */
    private int f35962b;

    /* renamed from: c */
    private int f35963c;

    /* renamed from: d */
    private int f35964d;

    /* renamed from: e */
    private int f35965e;

    /* renamed from: f */
    private int f35966f;

    /* renamed from: g */
    private int f35967g;

    static {
        Covode.recordClassIndex(16851);
    }

    /* renamed from: b */
    public final synchronized int mo23772b() {
        int i;
        MethodCollector.m26663i(9900);
        i = this.f35962b;
        MethodCollector.m26664o(9900);
        return i;
    }

    /* renamed from: c */
    public final synchronized Map<K, V> mo23774c() {
        Map<K, V> map;
        MethodCollector.m26663i(10052);
        map = this.f35961a;
        MethodCollector.m26664o(10052);
        return map;
    }

    /* renamed from: a */
    public final synchronized void mo23771a() {
        MethodCollector.m26663i(9751);
        m27044a(-1);
        MethodCollector.m26664o(9751);
    }

    public final synchronized String toString() {
        int i;
        String a;
        MethodCollector.m26663i(10054);
        int i2 = this.f35966f;
        int i3 = this.f35967g + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        a = C1764a.m5928a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f35963c), Integer.valueOf(this.f35966f), Integer.valueOf(this.f35967g), Integer.valueOf(i)});
        MethodCollector.m26664o(10054);
        return a;
    }

    public C14754d(int i) {
        if (i > 0) {
            this.f35963c = i;
            this.f35961a = Collections.synchronizedMap(new LinkedHashMap(0, 0.75f, true));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final synchronized V mo23769a(K k) {
        MethodCollector.m26663i(9605);
        if (k != null) {
            V v = this.f35961a.get(k);
            if (v != null) {
                this.f35966f++;
                MethodCollector.m26664o(9605);
                return v;
            }
            this.f35967g++;
            MethodCollector.m26664o(9605);
            return null;
        }
        NullPointerException nullPointerException = new NullPointerException("key == null");
        MethodCollector.m26664o(9605);
        throw nullPointerException;
    }

    /* renamed from: b */
    public final synchronized V mo23773b(K k) {
        V remove;
        MethodCollector.m26663i(9750);
        if (k != null) {
            remove = this.f35961a.remove(k);
            if (remove != null) {
                this.f35962b--;
            }
            MethodCollector.m26664o(9750);
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null");
            MethodCollector.m26664o(9750);
            throw nullPointerException;
        }
        return remove;
    }

    /* renamed from: a */
    private void m27044a(int i) {
        Map.Entry<K, V> next;
        while (this.f35962b > i && !this.f35961a.isEmpty() && (next = this.f35961a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            next.getValue();
            this.f35961a.remove(key);
            this.f35962b--;
            this.f35965e++;
        }
        if (this.f35962b < 0 || (this.f35961a.isEmpty() && this.f35962b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    /* renamed from: a */
    public final synchronized V mo23770a(K k, V v) {
        V put;
        MethodCollector.m26663i(9606);
        if (k == null || v == null) {
            NullPointerException nullPointerException = new NullPointerException("key == null || value == null");
            MethodCollector.m26664o(9606);
            throw nullPointerException;
        }
        this.f35964d++;
        this.f35962b++;
        put = this.f35961a.put(k, v);
        if (put != null) {
            this.f35962b--;
        }
        m27044a(this.f35963c);
        MethodCollector.m26664o(9606);
        return put;
    }
}
