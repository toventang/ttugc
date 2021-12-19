package com.tencent.wcdb.support;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;

/* renamed from: com.tencent.wcdb.support.b */
public class C87274b<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f197780a;

    /* renamed from: b */
    public int f197781b;

    /* renamed from: c */
    private int f197782c;

    /* renamed from: d */
    private int f197783d;

    /* renamed from: e */
    private int f197784e;

    /* renamed from: f */
    private int f197785f;

    /* renamed from: g */
    private int f197786g;

    static {
        Covode.recordClassIndex(103170);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo141193a(V v) {
    }

    /* renamed from: a */
    public final void mo141284a() {
        mo141285a(-1);
    }

    public final synchronized String toString() {
        int i;
        String a;
        MethodCollector.m26663i(4974);
        int i2 = this.f197785f;
        int i3 = this.f197786g + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        a = C1764a.m5928a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f197781b), Integer.valueOf(this.f197785f), Integer.valueOf(this.f197786g), Integer.valueOf(i)});
        MethodCollector.m26664o(4974);
        return a;
    }

    public C87274b(int i) {
        if (i > 0) {
            this.f197781b = i;
            this.f197780a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: b */
    public final V mo141286b(K k) {
        MethodCollector.m26663i(4816);
        if (k != null) {
            synchronized (this) {
                try {
                    V v = this.f197780a.get(k);
                    if (v != null) {
                        this.f197785f++;
                        return v;
                    }
                    this.f197786g++;
                    MethodCollector.m26664o(4816);
                    return null;
                } finally {
                    MethodCollector.m26664o(4816);
                }
            }
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null");
            MethodCollector.m26664o(4816);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public final V mo141287c(K k) {
        V remove;
        MethodCollector.m26663i(4971);
        if (k != null) {
            synchronized (this) {
                try {
                    remove = this.f197780a.remove(k);
                    if (remove != null) {
                        this.f197782c--;
                    }
                } finally {
                    MethodCollector.m26664o(4971);
                }
            }
            if (remove != null) {
                mo141193a(remove);
            }
            return remove;
        }
        NullPointerException nullPointerException = new NullPointerException("key == null");
        MethodCollector.m26664o(4971);
        throw nullPointerException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141285a(int r5) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.support.C87274b.mo141285a(int):void");
    }

    /* renamed from: a */
    public final V mo141283a(K k, V v) {
        V put;
        MethodCollector.m26663i(4958);
        if (k == null || v == null) {
            NullPointerException nullPointerException = new NullPointerException("key == null || value == null");
            MethodCollector.m26664o(4958);
            throw nullPointerException;
        }
        synchronized (this) {
            try {
                this.f197783d++;
                this.f197782c++;
                put = this.f197780a.put(k, v);
                if (put != null) {
                    this.f197782c--;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(4958);
                throw th;
            }
        }
        if (put != null) {
            mo141193a(put);
        }
        mo141285a(this.f197781b);
        MethodCollector.m26664o(4958);
        return put;
    }
}
