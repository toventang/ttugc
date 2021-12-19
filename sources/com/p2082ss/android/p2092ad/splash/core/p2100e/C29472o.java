package com.p2082ss.android.p2092ad.splash.core.p2100e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.e.o */
public final class C29472o {

    /* renamed from: a */
    public List<C29473a> f70117a;

    static {
        Covode.recordClassIndex(35866);
    }

    private C29472o(List<C29473a> list) {
        this.f70117a = list;
    }

    /* renamed from: com.ss.android.ad.splash.core.e.o$a */
    public static class C29473a {

        /* renamed from: a */
        public String f70118a;

        /* renamed from: b */
        public String f70119b;

        /* renamed from: c */
        public String f70120c;

        static {
            Covode.recordClassIndex(35867);
        }

        /* renamed from: a */
        public static C29473a m59059a(JSONObject jSONObject) {
            String optString = jSONObject.optString("vendorKey");
            String optString2 = jSONObject.optString("javaScriptResourceUrl");
            String optString3 = jSONObject.optString("verificationParameters");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                return null;
            }
            return new C29473a(optString, optString2, optString3);
        }

        private C29473a(String str, String str2, String str3) {
            this.f70118a = str;
            this.f70119b = str2;
            this.f70120c = str3;
        }
    }

    /* renamed from: a */
    public static C29472o m59058a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        C29473a a;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("vast")) == null || (optJSONArray = optJSONObject.optJSONArray("adVerifications")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
            if (!(optJSONObject2 == null || (a = C29473a.m59059a(optJSONObject2)) == null)) {
                arrayList.add(a);
            }
        }
        return new C29472o(arrayList);
    }
}
