package com.bytedance.bdlocation.traceroute.internet;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bdlocation.traceroute.C13213a;
import com.bytedance.bdlocation.traceroute.p855a.C13214a;
import com.bytedance.bdlocation.traceroute.p856b.AbstractC13216a;
import com.bytedance.bdlocation.traceroute.p857c.C13219b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdlocation.traceroute.internet.a */
public final class C13223a {
    static {
        Covode.recordClassIndex(15178);
    }

    /* renamed from: a */
    public static void m23775a(Context context) {
        SharedPreferences.Editor edit = C13214a.m23759a(context).f32305a.edit();
        edit.putLong("trace_router_interval", System.currentTimeMillis() / 1000);
        edit.apply();
        C13219b.m23767c();
    }

    /* renamed from: b */
    public static String m23776b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("utf-8");
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                bytes[i] = (byte) (bytes[i] ^ -99);
            }
            return Base64.encodeToString(bytes, 10);
        } catch (Exception e) {
            e.getMessage();
            C13219b.m23771g();
            return null;
        }
    }

    /* renamed from: a */
    public static String m23772a(String str) {
        "uploadOuter".concat(String.valueOf(str));
        C13219b.m23767c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("traceroute_info", new JSONObject(str).optJSONArray("tracerouteInfo"));
            byte[] bytes = jSONObject.toString().getBytes();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdk_version", "1.5.6-alpha.2.3-bugfix");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C22027b("Content-Type", "application/json"));
            if (C13213a.f32302e) {
                arrayList.add(new C22027b("x-use-boe", "1"));
            }
            return m23774a("/location/region/", linkedHashMap, bytes, arrayList);
        } catch (Exception e) {
            e.getMessage();
            C13219b.m23770f();
            return "";
        }
    }

    /* renamed from: a */
    public static String m23773a(String str, Map<String, String> map, Map<String, String> map2) {
        try {
            C13219b.m23767c();
            String str2 = C13213a.f32298a;
            AbstractC13216a aVar = C13213a.f32303f;
            if (aVar != null) {
                return aVar.mo21343a(str2, str, map2, map);
            }
            return ((INetworkApiCopy) RetrofitUtils.m43281a(str2, INetworkApiCopy.class)).doPost(-1, str, map2, map, null, null, true).execute().f52262b;
        } catch (Exception e) {
            "submitResult".concat(String.valueOf(e));
            C13219b.m23771g();
            return "";
        }
    }

    /* renamed from: a */
    private static String m23774a(String str, Map<String, String> map, byte[] bArr, List<C22027b> list) {
        String str2 = C13213a.f32298a + str;
        try {
            AbstractC13216a aVar = C13213a.f32303f;
            if (aVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("Content-Type", "application/json");
                if (C13213a.f32302e) {
                    hashMap.put("x-use-boe", "1");
                }
                return aVar.mo21344a(str2, map, hashMap, bArr);
            }
            C13219b.m23766b();
            return ((INetworkApi) RetrofitUtils.m43281a(str2, INetworkApi.class)).postBody(-1, str, map, new TypedByteArray("application/json", bArr, new String[0]), list).execute().f52262b;
        } catch (Exception e) {
            e.getMessage();
            C13219b.m23770f();
            return "";
        }
    }
}
