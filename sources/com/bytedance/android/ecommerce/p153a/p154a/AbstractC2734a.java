package com.bytedance.android.ecommerce.p153a.p154a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.a.a */
public abstract class AbstractC2734a {

    /* renamed from: a */
    public String f8153a;

    /* renamed from: b */
    public String f8154b;

    /* renamed from: c */
    public String f8155c;

    /* renamed from: d */
    public Map<String, String> f8156d;

    static {
        Covode.recordClassIndex(3160);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract JSONObject mo7320b();

    public String toString() {
        return "BaseRequest{, mMerchantId='" + this.f8153a + '\'' + ", mRequestTime='" + this.f8154b + '\'' + ", mSign='" + this.f8155c + '\'' + '}';
    }

    /* renamed from: a */
    public final List<Pair<String, String>> mo7319a() {
        ArrayList arrayList = new ArrayList();
        String jSONObject = mo7320b().toString();
        int indexOf = jSONObject.indexOf("nonce");
        if (indexOf > 0) {
            String str = jSONObject.substring(0, indexOf) + "nonce\":\"";
            String substring = jSONObject.substring(indexOf + 8);
            int indexOf2 = substring.indexOf("\"");
            jSONObject = str + substring.substring(0, indexOf2).replace("\\/", "/") + substring.substring(indexOf2);
        }
        arrayList.add(new Pair("biz_content", jSONObject));
        String str2 = this.f8153a;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        arrayList.add(new Pair("merchant_id", str2));
        String str4 = this.f8154b;
        if (str4 == null) {
            str4 = str3;
        }
        arrayList.add(new Pair("request_time", str4));
        String str5 = this.f8155c;
        if (str5 != null) {
            str3 = str5;
        }
        arrayList.add(new Pair("sign", str3));
        return arrayList;
    }
}
