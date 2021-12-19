package com.bytedance.apm.p754a.p755a;

import com.bytedance.apm.net.C12557a;
import com.bytedance.apm.p789q.C12597q;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.a.a */
public final class C12262a {

    /* renamed from: a */
    public static String f29541a = "https://i.isnssdk.com/monitor/collect/c/logcollect";

    /* renamed from: com.bytedance.apm.a.a.a$a */
    public interface AbstractC12263a {
        static {
            Covode.recordClassIndex(13999);
        }

        /* renamed from: a */
        void mo19755a(boolean z, int i, Exception exc, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(13998);
    }

    /* renamed from: a */
    public static boolean m22039a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject, AbstractC12263a aVar) {
        try {
            C12557a aVar2 = new C12557a(f29541a, "UTF-8");
            aVar2.mo20382a("aid", str);
            aVar2.mo20382a("verify_info", C12597q.m22719a());
            aVar2.mo20382a("device_id", str2);
            aVar2.mo20382a("os", "Android");
            aVar2.mo20382a("process_name", str3);
            for (String str5 : list) {
                File file = new File(str5);
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", str4);
                    hashMap.put("env", "params.txt");
                    aVar2.mo20381a(file.getName(), file, hashMap);
                }
            }
            aVar2.mo20383a(jSONObject);
            try {
                JSONObject jSONObject2 = new JSONObject(aVar2.mo20380a());
                if (jSONObject2.optInt("errno", -1) == 200) {
                    aVar.mo19755a(true, -1, null, jSONObject2);
                    return true;
                }
                aVar.mo19755a(false, 6, null, null);
                return false;
            } catch (JSONException e) {
                aVar.mo19755a(false, 7, e, null);
            }
        } catch (IOException e2) {
            aVar.mo19755a(false, 8, e2, null);
            return false;
        }
    }
}
