package com.bytedance.android.monitor.p713k;

import android.view.View;
import com.bytedance.android.monitor.p706d.C11917a;
import com.bytedance.android.monitor.p706d.C11918b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.k.a */
public final class C11943a {

    /* renamed from: a */
    public static final C11943a f28572a = new C11943a();

    /* renamed from: b */
    private static final Map<String, Map<String, Object>> f28573b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<String, Map<String, Object>> f28574c = new LinkedHashMap();

    /* renamed from: d */
    private static final Map<String, C11946d> f28575d = new LinkedHashMap();

    private C11943a() {
    }

    static {
        Covode.recordClassIndex(13669);
    }

    /* renamed from: a */
    public static C11917a m21078a(View view) {
        C89219l.m154719c(view, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m21082c(view).iterator();
        while (it.hasNext()) {
            arrayList.add(m21079a((String) it.next()));
        }
        return new C11917a(arrayList);
    }

    /* renamed from: b */
    public static C11918b m21080b(View view) {
        C89219l.m154719c(view, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m21082c(view).iterator();
        while (it.hasNext()) {
            arrayList.add(m21081b((String) it.next()));
        }
        return new C11918b(arrayList);
    }

    /* renamed from: c */
    private static List<String> m21082c(View view) {
        C89219l.m154719c(view, "");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C11946d> entry : f28575d.entrySet()) {
            View view2 = entry.getValue().f28579a.get();
            if (view2 != null && view2.equals(view)) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<String, Object> m21079a(String str) {
        C89219l.m154719c(str, "");
        Map<String, Map<String, Object>> map = f28573b;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
        }
        Map<String, Object> map2 = map.get(str);
        if (map2 == null) {
            C89219l.m154707a();
        }
        return map2;
    }

    /* renamed from: b */
    private static Map<String, Object> m21081b(String str) {
        C89219l.m154719c(str, "");
        Map<String, Map<String, Object>> map = f28574c;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
        }
        Map<String, Object> map2 = map.get(str);
        if (map2 == null) {
            C89219l.m154707a();
        }
        return map2;
    }
}
