package com.bytedance.android.ecommerce.p164j;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.ecommerce.p158d.C2772a;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.p164j.AbstractC2811j;
import com.bytedance.android.ecommerce.p165k.C2825a;
import com.bytedance.android.ecommerce.p165k.C2830e;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.j.o */
public final class C2820o implements AbstractC2811j {

    /* renamed from: a */
    public Map<String, String> f8418a = new ConcurrentHashMap();

    /* renamed from: b */
    public String f8419b;

    /* renamed from: c */
    private final String f8420c = "StarlingService";

    static {
        Covode.recordClassIndex(3246);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2811j
    /* renamed from: a */
    public final String mo7403a(String str) {
        if (!this.f8418a.isEmpty()) {
            return this.f8418a.get(str);
        }
        throw new RuntimeException("mStarlingMap is empty");
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2811j
    /* renamed from: a */
    public final String mo7404a(String str, String str2) {
        try {
            if (TextUtils.equals(str, this.f8419b)) {
                return this.f8418a.get(str2);
            }
            Map<String, String> a = C2830e.m8101a(new JSONObject(C2825a.m8095a(C2778c.f8362a.mo7372d().f8315a, "pipo_starling.json")));
            m8087c(str, null, null);
            return a.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2811j
    /* renamed from: a */
    public final void mo7405a(String str, final AbstractC2811j.AbstractC2812a aVar) {
        if (!TextUtils.equals(this.f8419b, str) && !TextUtils.isEmpty(str)) {
            this.f8419b = str;
            this.f8418a.clear();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC13596e.m24423a(new Runnable() {
                    /* class com.bytedance.android.ecommerce.p164j.C2820o.RunnableC28211 */

                    static {
                        Covode.recordClassIndex(3247);
                    }

                    public final void run() {
                        C2820o oVar = C2820o.this;
                        oVar.mo7411b(oVar.f8419b, aVar, null);
                    }
                });
            } else {
                mo7411b(this.f8419b, aVar, null);
            }
        }
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2811j
    /* renamed from: a */
    public final void mo7406a(String str, AbstractC2811j.AbstractC2812a aVar, String str2) {
        m8087c(str2, aVar, str);
    }

    /* renamed from: c */
    private void m8087c(String str, final AbstractC2811j.AbstractC2812a aVar, final String str2) {
        if (!TextUtils.equals(this.f8419b, str)) {
            this.f8419b = str;
            final C28222 r2 = new AbstractC2811j.AbstractC2812a() {
                /* class com.bytedance.android.ecommerce.p164j.C2820o.C28222 */

                static {
                    Covode.recordClassIndex(3248);
                }

                @Override // com.bytedance.android.ecommerce.p164j.AbstractC2811j.AbstractC2812a
                /* renamed from: a */
                public final void mo7349a(Map<String, String> map) {
                    C2820o.this.f8418a = map;
                    AbstractC2811j.AbstractC2812a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo7349a(map);
                    }
                }
            };
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC13596e.m24423a(new Runnable() {
                    /* class com.bytedance.android.ecommerce.p164j.C2820o.RunnableC28233 */

                    static {
                        Covode.recordClassIndex(3249);
                    }

                    public final void run() {
                        C2820o oVar = C2820o.this;
                        oVar.mo7411b(oVar.f8419b, r2, str2);
                    }
                });
            } else {
                mo7411b(this.f8419b, r2, str2);
            }
        } else if (aVar != null) {
            aVar.mo7349a(this.f8418a);
        }
    }

    /* renamed from: b */
    public final void mo7411b(String str, AbstractC2811j.AbstractC2812a aVar, String str2) {
        String str3;
        JSONObject optJSONObject;
        HashMap hashMap = new HashMap();
        try {
            hashMap.putAll(C2830e.m8101a(new JSONObject(C2825a.m8095a(C2778c.f8362a.mo7372d().f8315a, "pipo_starling.json"))));
        } catch (Throwable unused) {
        }
        AbstractC2810i g = C2778c.f8362a.mo7375g();
        String a = g.mo7399a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                hashMap.putAll(C2830e.m8101a(new JSONObject(a)));
            } catch (Throwable unused2) {
            }
        }
        long b = g.mo7402b(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = C2772a.m7959a("/payment/v1/cashier_starling");
        } else {
            str3 = str2 + "/payment/v1/cashier_starling";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", b);
            jSONObject.put("language", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("Content-Type", "application/json");
            JSONObject jSONObject2 = new JSONObject(C2778c.f8362a.mo7372d().f8327m.mo21871a(str3, jSONObject.toString().getBytes(), hashMap2));
            if (TextUtils.equals(jSONObject2.optString("result_code"), "success") && (optJSONObject = jSONObject2.optJSONObject("text_package")) != null) {
                Map<String, String> a2 = C2830e.m8101a(optJSONObject);
                if (a2.size() > 0) {
                    hashMap.putAll(a2);
                    this.f8418a.putAll(hashMap);
                    AbstractC2810i g2 = C2778c.f8362a.mo7375g();
                    g2.mo7400a(str, Long.valueOf(jSONObject2.optLong("version")));
                    g2.mo7401a(str, optJSONObject.toString());
                    if (aVar != null) {
                        aVar.mo7349a(this.f8418a);
                        return;
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            th.getLocalizedMessage();
        }
        this.f8418a.putAll(hashMap);
        if (aVar != null) {
            aVar.mo7349a(this.f8418a);
        }
    }
}
