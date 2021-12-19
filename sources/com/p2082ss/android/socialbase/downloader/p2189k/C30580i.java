package com.p2082ss.android.socialbase.downloader.p2189k;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.k.i */
public final class C30580i<K, T> extends LinkedHashMap<K, T> {

    /* renamed from: a */
    private int f72910a;

    static {
        Covode.recordClassIndex(37108);
    }

    public C30580i() {
        this(4, 4);
    }

    public final void setMaxSize(int i) {
        this.f72910a = i;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, T> entry) {
        if (size() > this.f72910a) {
            return true;
        }
        return false;
    }

    public C30580i(int i, int i2) {
        this(i, i2, true);
    }

    public C30580i(int i, int i2, boolean z) {
        super(i, 0.75f, z);
        setMaxSize(i2);
    }
}
