package net.openid.appauth;

import android.net.Uri;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: net.openid.appauth.a */
public final class C89965a {
    static {
        Covode.recordClassIndex(106136);
    }

    /* renamed from: a */
    static Map<String, String> m156101a(Uri uri, Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!set.contains(str)) {
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    static Map<String, String> m156102a(Map<String, String> map, Set<String> set) {
        if (map == null) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            C90009p.m156198a((Object) key, (Object) "additional parameter keys cannot be null");
            C90009p.m156198a((Object) value, (Object) "additional parameter values cannot be null");
            Object[] objArr = {key};
            if (!set.contains(key)) {
                linkedHashMap.put(key, value);
            } else {
                throw new IllegalArgumentException(C1764a.m5928a("Parameter %s is directly supported via the authorization request builder, use the builder method instead", objArr));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
