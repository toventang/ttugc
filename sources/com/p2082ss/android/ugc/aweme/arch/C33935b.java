package com.p2082ss.android.ugc.aweme.arch;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.arch.b */
public final class C33935b<K, V> {

    /* renamed from: a */
    private HashMap<K, V> f80252a = new HashMap<>();

    static {
        Covode.recordClassIndex(40855);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* renamed from: a */
    public final <T> T mo60174a(K k) {
        V v = this.f80252a.get(k);
        if (v != 0) {
            return v;
        }
        return null;
    }

    /* renamed from: a */
    public final C33935b<K, V> mo60173a(K k, V v) {
        this.f80252a.put(k, v);
        return this;
    }
}
