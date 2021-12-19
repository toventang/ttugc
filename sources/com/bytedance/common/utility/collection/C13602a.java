package com.bytedance.common.utility.collection;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.common.utility.collection.a */
public final class C13602a {
    static {
        Covode.recordClassIndex(15629);
    }

    /* renamed from: a */
    public static long[] m24433a(List<Long> list) {
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = list.get(i).longValue();
        }
        return jArr;
    }
}
