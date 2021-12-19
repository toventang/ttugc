package com.bytedance.bdturing.p865e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.e.d */
public final class C13276d {

    /* renamed from: a */
    public static final C13276d f32461a = new C13276d();

    private C13276d() {
    }

    static {
        Covode.recordClassIndex(15238);
    }

    /* renamed from: a */
    public static void m23874a(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        JSONObject optJSONObject5 = C13274c.f32457a.optJSONObject("sms");
        if (!(optJSONObject5 == null || (optJSONObject4 = optJSONObject5.optJSONObject("host")) == null)) {
            optJSONObject4.put(str, str2);
        }
        JSONObject optJSONObject6 = C13274c.f32457a.optJSONObject("qa");
        if (!(optJSONObject6 == null || (optJSONObject3 = optJSONObject6.optJSONObject("host")) == null)) {
            optJSONObject3.put(str, str2);
        }
        JSONObject optJSONObject7 = C13274c.f32457a.optJSONObject("verify");
        if (!(optJSONObject7 == null || (optJSONObject2 = optJSONObject7.optJSONObject("host")) == null)) {
            optJSONObject2.put(str, str2);
        }
        JSONObject optJSONObject8 = C13274c.f32457a.optJSONObject("self_unpunish");
        if (optJSONObject8 != null && (optJSONObject = optJSONObject8.optJSONObject("host")) != null) {
            optJSONObject.put(str, str2);
        }
    }
}
