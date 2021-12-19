package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ag */
public final class C7080ag {
    static {
        Covode.recordClassIndex(7826);
    }

    /* renamed from: a */
    public static SharedPreferences.Editor m15035a(C18338g gVar) {
        return C34822d.m71158a(gVar.f43859a, "js_kv_methods_20191113", 0).edit();
    }

    /* renamed from: b */
    public static SharedPreferences m15036b(C18338g gVar) {
        return C34822d.m71158a(gVar.f43859a, "js_kv_methods_20191113", 0);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ag$b */
    public static class C7082b extends AbstractC18337f<JSONObject, JSONObject> {
        static {
            Covode.recordClassIndex(7828);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
        public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, C18338g gVar) {
            boolean commit;
            JSONObject jSONObject2 = jSONObject;
            boolean equals = TextUtils.equals(jSONObject2.optString(StringSet.type, ""), "all");
            JSONObject jSONObject3 = new JSONObject();
            if (equals) {
                commit = C7080ag.m15035a(gVar).clear().commit();
            } else {
                commit = C7080ag.m15035a(gVar).remove(jSONObject2.optString("key")).commit();
            }
            int i = commit ? 1 : 0;
            int i2 = commit ? 1 : 0;
            int i3 = commit ? 1 : 0;
            jSONObject3.put("code", i);
            return jSONObject3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ag$c */
    public static class C7083c extends AbstractC18337f<JSONObject, JSONObject> {
        static {
            Covode.recordClassIndex(7829);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
        public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, C18338g gVar) {
            JSONObject jSONObject2 = jSONObject;
            boolean commit = C7080ag.m15035a(gVar).putString(jSONObject2.optString("key"), jSONObject2.optString("value")).commit();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", commit ? 1 : 0);
            return jSONObject3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ag$a */
    public static class C7081a extends AbstractC18337f<JSONObject, JSONObject> {
        static {
            Covode.recordClassIndex(7827);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
        public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, C18338g gVar) {
            JSONObject jSONObject2 = jSONObject;
            JSONObject jSONObject3 = new JSONObject();
            if (TextUtils.equals(jSONObject2.optString(StringSet.type, ""), "all")) {
                Map<String, ?> all = C7080ag.m15036b(gVar).getAll();
                JSONObject jSONObject4 = new JSONObject();
                if (all != null && !all.isEmpty()) {
                    for (String str : all.keySet()) {
                        if (str != null) {
                            jSONObject4.put(str.toString(), C7080ag.m15036b(gVar).getString(str.toString(), ""));
                        }
                    }
                }
                jSONObject3.put("value", jSONObject4);
            } else {
                jSONObject3.put("value", C7080ag.m15036b(gVar).getString(jSONObject2.optString("key"), ""));
            }
            jSONObject3.put("code", 1);
            return jSONObject3;
        }
    }
}
