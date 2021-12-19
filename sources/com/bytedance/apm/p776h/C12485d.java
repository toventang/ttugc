package com.bytedance.apm.p776h;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.h.d */
public final class C12485d {

    /* renamed from: a */
    private static AbstractC12484c f30322a;

    /* renamed from: b */
    private static AbstractC12484c f30323b;

    static {
        Covode.recordClassIndex(14295);
        C124861 r0 = new AbstractC12484c() {
            /* class com.bytedance.apm.p776h.C12485d.C124861 */

            static {
                Covode.recordClassIndex(14296);
            }
        };
        f30322a = r0;
        f30323b = r0;
    }

    /* renamed from: a */
    public static void m22449a(Object... objArr) {
        if (f30323b != null) {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < 2; i += 2) {
                try {
                    jSONObject.put(String.valueOf(objArr[0]), String.valueOf(objArr[1]));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            String[] strArr = new String[1];
            jSONObject.toString();
        }
    }
}
