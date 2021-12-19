package com.bytedance.apm.trace.p792c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.apm.trace.c.a */
public final class C12632a {

    /* renamed from: a */
    private static HashMap<String, Integer> f30751a;

    static {
        Covode.recordClassIndex(14449);
        HashMap<String, Integer> hashMap = new HashMap<>();
        f30751a = hashMap;
        hashMap.put("xx", 12334);
    }

    /* renamed from: a */
    public static Integer m22760a(String str) {
        return f30751a.get(str);
    }
}
