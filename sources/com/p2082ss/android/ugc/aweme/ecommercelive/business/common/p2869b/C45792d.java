package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.b.d */
public final class C45792d {
    static {
        Covode.recordClassIndex(54310);
    }

    /* renamed from: a */
    public static final void m88398a(String str, String str2, String str3, String str4, String str5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("image_url", str3);
            jSONObject.put("message_id", str4);
            jSONObject.put("from", str5);
            C39162r.m79461a("rd_tiktokec_pin_image_show_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m88400a(String str, String str2, String str3, boolean z, long j) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("schema", str3);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_success", i);
            jSONObject.put("show_cost", j);
            C39162r.m79461a("rd_tiktokec_pin_card_lynx_load_result", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m88399a(String str, String str2, String str3, String str4, String str5, Long l) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("image_url", str3);
            jSONObject.put("message_id", str4);
            jSONObject.put("from", str5);
            jSONObject.put("show_cost", l);
            C39162r.m79461a("rd_tiktokec_pin_image_show", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m88401a(String str, String str2, boolean z, long j, int i, String str3) {
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_success", i2);
            jSONObject.put("anchor_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("cost", j);
            jSONObject.put("error_msg", str3);
            jSONObject.put("ec_code", String.valueOf(i));
            C39162r.m79461a("rd_tiktokec_get_introduce_products", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m88397a(String str, String str2, String str3, long j, long j2, long j3, long j4, long j5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("message_id", str3);
            jSONObject.put("total_duration", j);
            jSONObject.put("introduce_duration", j2);
            jSONObject.put("introduce_server_duration", j3);
            jSONObject.put("live_msg_duration", j4);
            jSONObject.put("client_show_pin_duration", j5);
            C39162r.m79461a("rd_tiktokec_pin_duration", jSONObject);
        } catch (Exception unused) {
        }
    }
}
