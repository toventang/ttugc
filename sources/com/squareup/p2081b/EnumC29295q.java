package com.squareup.p2081b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.squareup.b.q */
public enum EnumC29295q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: a */
    final int f69510a;

    static {
        Covode.recordClassIndex(35644);
    }

    public static boolean isOfflineOnly(int i) {
        if ((i & OFFLINE.f69510a) != 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldReadFromDiskCache(int i) {
        if ((i & NO_CACHE.f69510a) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToDiskCache(int i) {
        if ((i & NO_STORE.f69510a) == 0) {
            return true;
        }
        return false;
    }

    private EnumC29295q(int i) {
        this.f69510a = i;
    }
}
