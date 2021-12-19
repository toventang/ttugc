package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.p */
public final class C61594p {

    /* renamed from: a */
    public static volatile String f139771a = "";

    /* renamed from: b */
    public static final C61594p f139772b = new C61594p();

    private C61594p() {
    }

    static {
        Covode.recordClassIndex(72272);
    }

    /* renamed from: a */
    public static void m111543a(String str) {
        C89219l.m154721d(str, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message", str);
            try {
                jSONObject2.put("enter_from", (String) C89361p.m154921c((CharSequence) C89361p.m154921c(str, new String[]{"em="}).get(1), new String[]{"&"}).get(0));
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
            }
            C12290b.m22066a("aweme_long_connection_status", jSONObject, (JSONObject) null, jSONObject2);
        } catch (Exception e2) {
            C51423a.m95786a(e2);
        }
    }

    /* renamed from: a */
    public static void m111544a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        f139771a = str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("error_type", str2);
        jSONObject.put("status", 1);
        JSONObject jSONObject2 = new JSONObject();
        if (str3 != null) {
            jSONObject2.put("message", str3);
        }
        C12290b.m22066a("aweme_long_connection_status", jSONObject, (JSONObject) null, jSONObject2);
    }
}
