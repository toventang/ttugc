package com.bytedance.common.utility.collection;

import com.bytedance.common.utility.reflect.C13635a;
import com.bytedance.covode.number.Covode;
import java.util.Collection;

/* renamed from: com.bytedance.common.utility.collection.b */
public final class C13603b {
    static {
        Covode.recordClassIndex(15630);
    }

    /* renamed from: a */
    public static void m24434a(Object obj) {
        C13635a.m24535a(obj, "clear", new Object[0]);
    }

    /* renamed from: a */
    public static <T> boolean m24435a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
