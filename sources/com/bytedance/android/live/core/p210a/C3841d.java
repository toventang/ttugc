package com.bytedance.android.live.core.p210a;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.a.d */
final class C3841d<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private final int f10620a;

    static {
        Covode.recordClassIndex(4370);
    }

    public C3841d(int i) {
        super(i, 0.75f, true);
        this.f10620a = i;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.f10620a) {
            return true;
        }
        return false;
    }
}
