package com.p2082ss.ugc.live.sdk.message.data;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.message.data.LimitedSizeHashMap */
public class LimitedSizeHashMap<K, V> extends LinkedHashMap<K, V> {
    private int mMaxSize;

    static {
        Covode.recordClassIndex(102855);
    }

    public LimitedSizeHashMap(int i) {
        this.mMaxSize = i;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }
}
