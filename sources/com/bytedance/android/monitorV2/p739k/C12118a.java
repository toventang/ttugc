package com.bytedance.android.monitorV2.p739k;

import android.view.View;
import com.bytedance.android.monitorV2.p731d.C12081a;
import com.bytedance.android.monitorV2.p731d.C12082b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.k.a */
public final class C12118a {

    /* renamed from: a */
    public static final Map<String, Map<String, Object>> f29140a = new LinkedHashMap();

    /* renamed from: b */
    public static final Map<String, Map<String, Object>> f29141b = new LinkedHashMap();

    /* renamed from: c */
    static final Map<String, C12123e> f29142c = new LinkedHashMap();

    /* renamed from: d */
    public static final C12118a f29143d = new C12118a();

    private C12118a() {
    }

    static {
        Covode.recordClassIndex(13847);
    }

    /* renamed from: a */
    public static Map<String, Object> m21595a(String str) {
        C89219l.m154719c(str, "");
        return m21602d(str);
    }

    /* renamed from: b */
    public static C12123e m21598b(String str) {
        C89219l.m154719c(str, "");
        return f29142c.get(str);
    }

    /* renamed from: c */
    private static Map<String, Object> m21601c(String str) {
        C89219l.m154719c(str, "");
        return m21603e(str);
    }

    /* renamed from: d */
    private static Map<String, Object> m21602d(String str) {
        Map<String, Map<String, Object>> map = f29140a;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
        }
        Map<String, Object> map2 = map.get(str);
        if (map2 == null) {
            C89219l.m154707a();
        }
        return map2;
    }

    /* renamed from: e */
    private static Map<String, Object> m21603e(String str) {
        Map<String, Map<String, Object>> map = f29141b;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
        }
        Map<String, Object> map2 = map.get(str);
        if (map2 == null) {
            C89219l.m154707a();
        }
        return map2;
    }

    /* renamed from: a */
    public static C12081a m21594a(View view) {
        C89219l.m154719c(view, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m21600c(view).iterator();
        while (it.hasNext()) {
            arrayList.add(m21595a((String) it.next()));
        }
        return new C12081a(arrayList);
    }

    /* renamed from: b */
    public static C12082b m21597b(View view) {
        C89219l.m154719c(view, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m21600c(view).iterator();
        while (it.hasNext()) {
            arrayList.add(m21601c((String) it.next()));
        }
        return new C12082b(arrayList);
    }

    /* renamed from: c */
    private static List<String> m21600c(View view) {
        C89219l.m154719c(view, "");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C12123e> entry : f29142c.entrySet()) {
            View a = entry.getValue().mo19496a();
            if (a != null && a.equals(view)) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m21596a(String str, String str2, Object obj) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(obj, "");
        m21602d(str).put(str2, obj);
    }

    /* renamed from: b */
    public static void m21599b(String str, String str2, Object obj) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(obj, "");
        m21603e(str).put(str2, obj);
    }
}
