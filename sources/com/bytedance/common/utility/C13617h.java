package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.common.utility.h */
public final class C13617h {
    static {
        Covode.recordClassIndex(15644);
    }

    /* renamed from: a */
    public static <T> boolean m24465a(List<T> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m24466b(List<T> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }
}
