package com.p2082ss.android.ugc.aweme.base.utils;

import com.bytedance.covode.number.Covode;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.base.utils.d */
public final class C34717d {
    static {
        Covode.recordClassIndex(41709);
    }

    /* renamed from: a */
    public static <T> boolean m70908a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m70910b(Collection<T> collection) {
        if (collection == null || collection.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m70909a(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return true;
        }
        return false;
    }
}
