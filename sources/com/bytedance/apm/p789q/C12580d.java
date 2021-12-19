package com.bytedance.apm.p789q;

import android.text.TextUtils;
import com.bytedance.apm.net.C12557a;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22710c;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.q.d */
public final class C12580d {
    static {
        Covode.recordClassIndex(14397);
    }

    /* renamed from: a */
    public static C22710c m22657a(String str, List<File> list, Map<String, String> map) {
        try {
            C12557a aVar = new C12557a(str, "UTF-8");
            if (list != null && !list.isEmpty()) {
                for (File file : list) {
                    if (file.exists()) {
                        aVar.mo20381a(file.getName(), file, new HashMap());
                    }
                }
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVar.mo20382a(entry.getKey(), entry.getValue());
                }
            }
            String a = aVar.mo20380a();
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(a);
                return new C22710c(jSONObject.optInt("error_code", 0), jSONObject.optString("message", "").getBytes());
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
