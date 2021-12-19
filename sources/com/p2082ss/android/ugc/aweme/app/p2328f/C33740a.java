package com.p2082ss.android.ugc.aweme.app.p2328f;

import com.bytedance.covode.number.Covode;
import com.facebook.p1902j.p1903a.C24801b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.f.a */
public final class C33740a {
    static {
        Covode.recordClassIndex(40635);
    }

    /* renamed from: a */
    public static void m69069a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", C24801b.C24802a.f58850a.mo40614a().toString());
            jSONObject.put("netWorkSpeed", (int) C24801b.C24802a.f58850a.mo40616b());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorUrl", str4);
            C33830n.m69192a(str, str2, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m69068a(String str, String str2, String str3, int i, String str4, String str5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", C24801b.C24802a.f58850a.mo40614a().toString());
            jSONObject.put("netWorkSpeed", (int) C24801b.C24802a.f58850a.mo40616b());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorCode", String.valueOf(i));
            jSONObject.put("errorUrl", str4);
            jSONObject.put("from", str5);
            C33830n.m69192a(str, str2, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
