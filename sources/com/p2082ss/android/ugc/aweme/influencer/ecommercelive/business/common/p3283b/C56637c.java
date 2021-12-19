package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.c */
public final class C56637c {
    static {
        Covode.recordClassIndex(66482);
    }

    /* renamed from: a */
    public static final void m102634a(String str, boolean z, long j, String str2, EnumC56640f fVar, int i, String str3) {
        int i2;
        C89219l.m154721d(fVar, "");
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_success", i2);
            jSONObject.put("live_role", fVar.getRoleStr());
            if (str == null) {
                str = "not valid";
            }
            jSONObject.put("anchor_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("cost", j);
            jSONObject.put("error_msg", str3);
            jSONObject.put("ec_code", String.valueOf(i));
            C39162r.m79461a("rd_tiktokec_get_products_count", jSONObject);
        } catch (Exception unused) {
        }
    }
}
