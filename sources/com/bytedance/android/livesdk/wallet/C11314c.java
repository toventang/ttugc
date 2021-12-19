package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.wallet.c */
public class C11314c {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public int f27055a;
    @AbstractC27891c(mo46611a = "iap_id")

    /* renamed from: b */
    public String f27056b;
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: c */
    public String f27057c;
    @AbstractC27891c(mo46611a = "diamond_count")

    /* renamed from: d */
    public int f27058d;
    @AbstractC27891c(mo46611a = "giving_count")

    /* renamed from: e */
    public int f27059e;

    /* renamed from: f */
    public int f27060f;

    /* renamed from: g */
    public String f27061g = "";

    /* renamed from: h */
    public long f27062h;

    /* renamed from: i */
    public String f27063i = "";

    /* renamed from: j */
    public C11309a f27064j;

    static {
        Covode.recordClassIndex(12952);
    }

    public C11314c() {
    }

    public String toString() {
        return "Diamond{id=" + this.f27055a + ", iapId='" + this.f27056b + '\'' + ", price='" + this.f27057c + '\'' + ", count='" + this.f27058d + '\'' + '}';
    }

    /* renamed from: a */
    public static JSONObject m20058a(C11314c cVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", cVar.f27055a);
            jSONObject.put("iapId", cVar.f27056b);
            jSONObject.put("price", cVar.f27057c);
            jSONObject.put("count", cVar.f27058d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public C11314c(String str, String str2, String str3, long j, String str4) {
        this.f27056b = str;
        this.f27057c = str2;
        this.f27061g = str3;
        this.f27062h = j;
        this.f27063i = str4;
    }
}
