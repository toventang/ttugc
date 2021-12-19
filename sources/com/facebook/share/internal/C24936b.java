package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.b */
public final class C24936b {

    /* renamed from: a */
    static final Map<Class<?>, AbstractC24940a> f59204a;

    /* renamed from: com.facebook.share.internal.b$a */
    public interface AbstractC24940a {
        static {
            Covode.recordClassIndex(30244);
        }

        /* renamed from: a */
        void mo40815a(JSONObject jSONObject, String str, Object obj);
    }

    static {
        Covode.recordClassIndex(30240);
        HashMap hashMap = new HashMap();
        f59204a = hashMap;
        hashMap.put(String.class, new AbstractC24940a() {
            /* class com.facebook.share.internal.C24936b.C249371 */

            static {
                Covode.recordClassIndex(30241);
            }

            @Override // com.facebook.share.internal.C24936b.AbstractC24940a
            /* renamed from: a */
            public final void mo40815a(JSONObject jSONObject, String str, Object obj) {
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(String[].class, new AbstractC24940a() {
            /* class com.facebook.share.internal.C24936b.C249382 */

            static {
                Covode.recordClassIndex(30242);
            }

            @Override // com.facebook.share.internal.C24936b.AbstractC24940a
            /* renamed from: a */
            public final void mo40815a(JSONObject jSONObject, String str, Object obj) {
                JSONArray jSONArray = new JSONArray();
                for (String str2 : (String[]) obj) {
                    jSONArray.put(str2);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        hashMap.put(JSONArray.class, new AbstractC24940a() {
            /* class com.facebook.share.internal.C24936b.C249393 */

            static {
                Covode.recordClassIndex(30243);
            }

            @Override // com.facebook.share.internal.C24936b.AbstractC24940a
            /* renamed from: a */
            public final void mo40815a(JSONObject jSONObject, String str, Object obj) {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }
}
