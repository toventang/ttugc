package com.bytedance.sdk.p1625a.p1657l.p1661d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.l.d.b */
public final class C22493b {
    static {
        Covode.recordClassIndex(26309);
    }

    /* renamed from: a */
    public static C22492a m42436a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            C22492a aVar = new C22492a();
            if (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    if (next.hashCode() == 1481071862) {
                        if (next.equals("country_code")) {
                            aVar.f53160a = Integer.valueOf(jSONObject.optInt(next));
                        }
                    }
                }
            }
            return aVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
