package com.p2082ss.android.ugc.aweme.feed.p2946g;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feed.g.a */
public final class C49566a<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f114007a = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: b */
    private int f114008b;

    /* renamed from: c */
    private int f114009c = 31;

    /* renamed from: d */
    private int f114010d;

    /* renamed from: e */
    private int f114011e;

    /* renamed from: f */
    private int f114012f;

    /* renamed from: g */
    private int f114013g;

    static {
        Covode.recordClassIndex(58407);
    }

    public final synchronized String toString() {
        int i;
        String a;
        MethodCollector.m26663i(6548);
        int i2 = this.f114012f;
        int i3 = this.f114013g + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        a = C1764a.m5929a(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f114009c), Integer.valueOf(this.f114012f), Integer.valueOf(this.f114013g), Integer.valueOf(i)});
        MethodCollector.m26664o(6548);
        return a;
    }

    /* renamed from: a */
    public final V mo81318a(K k) {
        MethodCollector.m26663i(6404);
        if (k != null) {
            synchronized (this) {
                try {
                    V v = this.f114007a.get(k);
                    if (v != null) {
                        this.f114012f++;
                        return v;
                    }
                    this.f114013g++;
                    MethodCollector.m26664o(6404);
                    return null;
                } finally {
                    MethodCollector.m26664o(6404);
                }
            }
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null");
            MethodCollector.m26664o(6404);
            throw nullPointerException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m92899a(int r5) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2946g.C49566a.m92899a(int):void");
    }

    /* renamed from: a */
    public final V mo81319a(K k, V v) {
        V put;
        MethodCollector.m26663i(6405);
        if (k != null) {
            synchronized (this) {
                try {
                    this.f114010d++;
                    this.f114008b++;
                    put = this.f114007a.put(k, v);
                    if (put != null) {
                        this.f114008b--;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6405);
                    throw th;
                }
            }
            m92899a(this.f114009c);
            MethodCollector.m26664o(6405);
            return put;
        }
        NullPointerException nullPointerException = new NullPointerException("key == null || value == null");
        MethodCollector.m26664o(6405);
        throw nullPointerException;
    }
}
