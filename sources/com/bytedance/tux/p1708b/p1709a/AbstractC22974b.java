package com.bytedance.tux.p1708b.p1709a;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.b.a.b */
public abstract class AbstractC22974b<T> {
    static {
        Covode.recordClassIndex(26891);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo37290a(T t, int i, Object obj);

    /* renamed from: a */
    public Map<Integer, Object> mo37289a(T t, Map<Integer, ? extends Object> map) {
        C89219l.m154719c(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, ? extends Object> entry : map.entrySet()) {
            if (!mo37290a(t, entry.getKey().intValue(), entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
