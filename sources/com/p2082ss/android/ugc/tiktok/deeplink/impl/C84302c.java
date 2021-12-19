package com.p2082ss.android.ugc.tiktok.deeplink.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.c */
public final class C84302c {

    /* renamed from: a */
    public String f188516a;

    /* renamed from: b */
    public C84304b f188517b;

    static {
        Covode.recordClassIndex(98226);
    }

    /* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.c$c */
    public static class C84305c {

        /* renamed from: a */
        public List<String> f188523a = new ArrayList();

        /* renamed from: b */
        public List<String> f188524b = new ArrayList();

        static {
            Covode.recordClassIndex(98229);
        }

        public C84305c(JSONObject jSONObject) {
            if (jSONObject != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("includes");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("excludes");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f188523a.add(optString);
                        }
                    }
                }
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        String optString2 = optJSONArray2.optString(i2);
                        if (!TextUtils.isEmpty(optString2)) {
                            this.f188524b.add(optString2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.c$b */
    public static class C84304b {

        /* renamed from: a */
        public List<String> f188520a = new ArrayList();

        /* renamed from: b */
        public List<String> f188521b = new ArrayList();

        /* renamed from: c */
        public List<C84303a> f188522c = new ArrayList();

        static {
            Covode.recordClassIndex(98228);
        }

        public C84304b(JSONObject jSONObject) {
            JSONArray names;
            JSONObject optJSONObject;
            if (jSONObject != null) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("param_validator");
                if (!(optJSONObject2 == null || (names = optJSONObject2.names()) == null || names.length() <= 0)) {
                    for (int i = 0; i < names.length(); i++) {
                        String optString = names.optString(i);
                        if (!TextUtils.isEmpty(optString) && (optJSONObject = optJSONObject2.optJSONObject(optString)) != null) {
                            this.f188522c.add(new C84303a(optString, optJSONObject));
                        }
                    }
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("param_includes");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String optString2 = optJSONArray.optString(i2);
                        if (!TextUtils.isEmpty(optString2)) {
                            this.f188520a.add(optString2);
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("param_excludes");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        String optString3 = optJSONArray2.optString(i3);
                        if (!TextUtils.isEmpty(optString3)) {
                            this.f188521b.add(optString3);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.c$a */
    public static class C84303a {

        /* renamed from: a */
        public String f188518a;

        /* renamed from: b */
        public C84305c f188519b;

        static {
            Covode.recordClassIndex(98227);
        }

        public C84303a(String str, JSONObject jSONObject) {
            this.f188518a = str;
            if (jSONObject != null) {
                this.f188519b = new C84305c(jSONObject);
            }
        }
    }

    public C84302c(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f188516a = str;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("filter")) != null) {
            this.f188517b = new C84304b(optJSONObject);
        }
    }
}
