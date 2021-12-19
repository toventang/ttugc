package com.bytedance.android.ecommerce.p156b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.p162h.C2799a;
import com.bytedance.android.ecommerce.p165k.C2830e;
import com.bytedance.android.ecommerce.p165k.C2831f;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.EnumC18805o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.b.d */
public class C2756d extends AbstractC2753a {

    /* renamed from: a */
    private final String f8293a = "GET";

    /* renamed from: b */
    private final String f8294b = "POST";

    static {
        Covode.recordClassIndex(3182);
    }

    @Override // com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final String mo7339a() {
        return "pipo.fetch";
    }

    /* renamed from: a */
    private static void m7933a(Map<String, String> map, String str, AbstractC18400b.AbstractC18402b bVar) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C2830e.m8102a(jSONObject2, entry.getKey(), entry.getValue());
                }
                try {
                    jSONObject.put("header", jSONObject2);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        }
        C2830e.m8102a(jSONObject, "response", str);
        C2799a.m8035a(jSONObject, bVar);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b, com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, final AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        final Map<String, Object> map;
        final Map<String, Object> map2;
        final String str;
        final Map<String, Object> map3;
        super.mo7340a(nVar, bVar, eVar);
        try {
            final String f = nVar.mo29763f("method");
            final String f2 = nVar.mo29763f("url");
            if (nVar.mo29757a("headers")) {
                map = nVar.mo29765h("headers").mo29758b();
            } else {
                map = null;
            }
            if (nVar.mo29757a("params")) {
                map2 = nVar.mo29765h("params").mo29758b();
            } else {
                map2 = null;
            }
            AbstractC18659k i = nVar.mo29766i("body");
            if (i.mo29707a() == EnumC18805o.Map) {
                AbstractC18754n g = i.mo29713g();
                if (g != null) {
                    map3 = g.mo29758b();
                } else {
                    map3 = null;
                }
                str = null;
            } else if (i.mo29707a() == EnumC18805o.String) {
                str = i.mo29711e();
                map3 = null;
            } else {
                map3 = null;
                str = null;
            }
            if (!TextUtils.equals(f, "GET") && !TextUtils.equals(f, "POST")) {
                C2799a.m8036a("invalid request_method!", bVar);
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC13596e.m24423a(new Runnable() {
                    /* class com.bytedance.android.ecommerce.p156b.C2756d.RunnableC27571 */

                    static {
                        Covode.recordClassIndex(3183);
                    }

                    public final void run() {
                        if (TextUtils.equals(f, "GET")) {
                            C2756d.this.mo7343a(f2, map, map2, bVar);
                        } else if (TextUtils.equals(f, "POST")) {
                            Map<String, Object> map = map3;
                            if (map != null) {
                                C2756d.this.mo7344b(f2, map, map, bVar);
                            } else {
                                C2756d.this.mo7342a(f2, map, str, bVar);
                            }
                        }
                    }
                });
            } else if (TextUtils.equals(f, "GET")) {
                mo7343a(f2, map, map2, bVar);
            } else if (TextUtils.equals(f, "POST")) {
                mo7344b(f2, map, map3, bVar);
                if (map3 != null) {
                    mo7344b(f2, map, map3, bVar);
                } else {
                    mo7342a(f2, map, str, bVar);
                }
            }
        } catch (Throwable th) {
            C2799a.m8036a(th.getMessage(), bVar);
        }
    }

    /* renamed from: a */
    public final void mo7342a(String str, Map<String, Object> map, String str2, AbstractC18400b.AbstractC18402b bVar) {
        byte[] bArr;
        try {
            AbstractC13621j.C13622a aVar = new AbstractC13621j.C13622a();
            aVar.f33101a = true;
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3).toString());
                }
            }
            if (str2 == null) {
                bArr = null;
            } else {
                bArr = str2.getBytes();
            }
            m7933a(aVar.f33102b, C2778c.f8362a.mo7372d().f8327m.mo21871a(str, bArr, hashMap), bVar);
        } catch (Throwable th) {
            th.getMessage();
            C2799a.m8036a("post failed:" + th.getMessage(), bVar);
        }
    }

    /* renamed from: b */
    public final void mo7344b(String str, Map<String, Object> map, Map<String, Object> map2, AbstractC18400b.AbstractC18402b bVar) {
        try {
            AbstractC13621j.C13622a aVar = new AbstractC13621j.C13622a();
            aVar.f33101a = true;
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    arrayList.add(new Pair(str2, map2.get(str2).toString()));
                }
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3).toString());
                }
            }
            m7933a(aVar.f33102b, C2778c.f8362a.mo7372d().f8327m.mo21869a(str, arrayList, hashMap), bVar);
        } catch (Throwable th) {
            th.getMessage();
            C2799a.m8036a("post failed:" + th.getMessage(), bVar);
        }
    }

    /* renamed from: a */
    public final void mo7343a(String str, Map<String, Object> map, Map<String, Object> map2, AbstractC18400b.AbstractC18402b bVar) {
        try {
            AbstractC13621j.C13622a aVar = new AbstractC13621j.C13622a();
            aVar.f33101a = true;
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    Object obj = map2.get(str2);
                    if (obj != null) {
                        arrayList.add(new Pair(str2, obj.toString()));
                    }
                }
            }
            if (arrayList.size() > 0) {
                str = C2831f.m8103a(str, arrayList);
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3).toString());
                }
            }
            m7933a(aVar.f33102b, C2778c.f8362a.mo7372d().f8327m.mo21870a(str, hashMap), bVar);
        } catch (Throwable th) {
            th.getMessage();
            C2799a.m8036a("get failed:" + th.getMessage(), bVar);
        }
    }
}
