package com.p2082ss.android.ugc.aweme.p2441cf.p2442a;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.cf.a.c */
public final class C35468c {

    /* renamed from: a */
    private static final Map<String, Object> f83647a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(42653);
    }

    /* renamed from: a */
    public static <T> T m72529a(String str) {
        try {
            Map<String, Object> map = f83647a;
            T t = (T) map.get(str);
            if (t != null) {
                return t;
            }
            T t2 = (T) Class.forName(str).newInstance();
            map.put(str, t2);
            return t2;
        } catch (Exception unused) {
            return null;
        }
    }
}
