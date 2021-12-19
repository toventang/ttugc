package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.fd */
public final class C80421fd {

    /* renamed from: a */
    public static final C80421fd f179981a = new C80421fd();

    private C80421fd() {
    }

    static {
        Covode.recordClassIndex(93689);
    }

    /* renamed from: a */
    public static CommonApi m139419a(String str) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        return (CommonApi) C18097a.m33696a().mo28816a(str).mo28858a(CommonApi.class);
    }

    /* renamed from: a */
    private final void m139420a(Map<String, String> map, JSONObject jSONObject, String str) {
        String str2;
        String obj;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String str3 = "";
                if (TextUtils.isEmpty(str)) {
                    C89219l.m154716b(next, str3);
                    str2 = next;
                } else {
                    str2 = str + '[' + next + ']';
                }
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof JSONObject) {
                    m139420a(map, (JSONObject) obj2, str2);
                } else if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj2;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        m139420a(map, jSONArray.getJSONObject(i), str2);
                    }
                } else {
                    if (!(obj2 == null || (obj = obj2.toString()) == null)) {
                        str3 = obj;
                    }
                    map.put(str2, str3);
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo123729b(String str, JSONObject jSONObject, String str2, List<C22027b> list) {
        C89219l.m154721d(str, "");
        C22099u<String> c = mo123730c(str, jSONObject, str2, list);
        if (c == null) {
            C89219l.m154715b();
        }
        T t = c.f52262b;
        if (t == null) {
            C89219l.m154715b();
        }
        return t;
    }

    /* renamed from: a */
    public static C22099u<String> m139418a(String str, JSONObject jSONObject, String str2, List<C22027b> list) {
        String jSONObject2;
        C89219l.m154721d(str, "");
        byte[] bArr = null;
        String str3 = (String) C14759i.m27066a(str, (Map<String, String>) null).first;
        C89219l.m154716b(str3, "");
        CommonApi a = m139419a(str3);
        if (a != null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(new C22027b("Content-Type", str2));
            }
            if (!(jSONObject == null || (jSONObject2 = jSONObject.toString()) == null)) {
                Charset forName = Charset.forName("UTF-8");
                C89219l.m154716b(forName, "");
                Objects.requireNonNull(jSONObject2, "null cannot be cast to non-null type java.lang.String");
                bArr = jSONObject2.getBytes(forName);
                C89219l.m154716b(bArr, "");
            }
            return a.putBody(str, new TypedByteArray(str2, bArr, new String[0]), list).execute();
        }
        throw new RuntimeException("CommonApi is null,url=".concat(String.valueOf(str)));
    }

    /* renamed from: c */
    public final C22099u<String> mo123730c(String str, JSONObject jSONObject, String str2, List<C22027b> list) {
        String jSONObject2;
        C89219l.m154721d(str, "");
        byte[] bArr = null;
        String str3 = (String) C14759i.m27066a(str, (Map<String, String>) null).first;
        C89219l.m154716b(str3, "");
        CommonApi a = m139419a(str3);
        if (a != null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(new C22027b("Content-Type", str2));
            }
            if (str2 == null || !C89361p.m154874b(str2, "application/json", false)) {
                HashMap hashMap = new HashMap();
                m139420a(hashMap, jSONObject, "");
                return a.doPost(str, hashMap, list).execute();
            }
            if (!(jSONObject == null || (jSONObject2 = jSONObject.toString()) == null)) {
                Charset forName = Charset.forName("UTF-8");
                C89219l.m154716b(forName, "");
                Objects.requireNonNull(jSONObject2, "null cannot be cast to non-null type java.lang.String");
                bArr = jSONObject2.getBytes(forName);
                C89219l.m154716b(bArr, "");
            }
            return a.postBody(str, new TypedByteArray(str2, bArr, new String[0]), list).execute();
        }
        throw new RuntimeException("CommonApi is null,url=".concat(String.valueOf(str)));
    }
}
