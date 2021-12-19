package com.bytedance.p1777x.p1780c;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.x.c.a */
public final class C23690a {
    static {
        Covode.recordClassIndex(27792);
    }

    /* renamed from: a */
    public static final <T> List<T> m44774a(List<T> list, T t) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(t);
        return list;
    }

    /* renamed from: a */
    public static final <T> Set<T> m44775a(Set<T> set, T t) {
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(t);
        return set;
    }
}
