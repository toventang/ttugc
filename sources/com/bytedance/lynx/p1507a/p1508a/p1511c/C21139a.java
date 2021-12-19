package com.bytedance.lynx.p1507a.p1508a.p1511c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21138c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.a.a.c.a */
public final class C21139a {

    /* renamed from: a */
    public static final C21139a f50162a = new C21139a();

    /* renamed from: b */
    private static final Map<C21138c, Map<String, String>> f50163b = new ConcurrentHashMap();

    private C21139a() {
    }

    static {
        Covode.recordClassIndex(24755);
    }

    /* renamed from: a */
    public static final Map<String, String> m39799a(C21138c cVar) {
        C89219l.m154719c(cVar, "");
        Map<String, String> map = f50163b.get(cVar);
        if (map == null) {
            return new LinkedHashMap();
        }
        return map;
    }

    /* renamed from: a */
    public static final Map<String, String> m39800a(C21138c cVar, Uri uri, Map<String, String> map) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(uri, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        for (String str : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                C89219l.m154709a((Object) str, "");
                linkedHashMap.put(str, queryParameter);
            }
        }
        f50163b.put(cVar, linkedHashMap);
        return linkedHashMap;
    }
}
