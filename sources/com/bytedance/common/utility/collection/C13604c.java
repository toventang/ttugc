package com.bytedance.common.utility.collection;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.common.utility.collection.c */
public final class C13604c<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 3805937866184666407L;

    /* renamed from: a */
    final int f33080a;

    static {
        Covode.recordClassIndex(15631);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.f33080a) {
            return true;
        }
        return false;
    }

    public C13604c(int i, int i2) {
        this(i, i2, false);
    }

    public C13604c(int i, int i2, boolean z) {
        super(i2, 0.75f, true);
        this.f33080a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
