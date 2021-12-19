package com.bytedance.android.livesdk.p425aa.p427b;

import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p425aa.p428c.C6533k;
import com.bytedance.android.livesdk.p425aa.p428c.C6537o;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.aa.b.i */
public final class C6518i implements AbstractC6508b<C6537o> {
    static {
        Covode.recordClassIndex(7254);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.p425aa.p427b.AbstractC6508b
    /* renamed from: a */
    public final /* synthetic */ void mo12666a(Map map, C6537o oVar) {
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        C6537o oVar2 = oVar;
        if (oVar2 != null) {
            C9904t tVar = oVar2.f16328c;
            Prop prop = oVar2.f16329d;
            if (C6533k.f16322b == oVar2.f16330e) {
                str = "guest_";
            } else {
                str = "";
            }
            if (tVar != null && tVar.mo16601a()) {
                str2 = "animation_gift";
            } else if (oVar2.f16332g == 1) {
                str2 = "single_gift";
            } else if (oVar2.f16333h > 1) {
                str2 = "bunching_gift";
            } else {
                str2 = "running_gift";
            }
            if (!map.containsKey("request_page")) {
                map.put("request_page", "normal");
            }
            if (oVar2.f16327b > 0) {
                str3 = "prop_type";
            } else {
                str3 = "gift_type";
            }
            if (oVar2.f16327b > 0) {
                str4 = "prop_id";
            } else {
                str4 = "gift_id";
            }
            map.put(str3, str + str2);
            if (oVar2.f16327b > 0) {
                j = oVar2.f16327b;
            } else {
                j = oVar2.f16326a;
            }
            map.put(str4, String.valueOf(j));
            if (oVar2.f16327b <= 0) {
                map.put("gift_cnt", String.valueOf(oVar2.f16332g));
            } else {
                map.put("prop_cnt", String.valueOf(oVar2.f16332g));
            }
            map.put("group_cnt", String.valueOf(oVar2.f16333h));
            map.put("combo_cnt", String.valueOf(oVar2.f16331f));
            if (C6533k.f16322b == oVar2.f16330e) {
                map.put("guest_id", String.valueOf(oVar2.f16335j));
            }
            if (oVar2.f16327b <= 0 && tVar != null) {
                map.put("money", String.valueOf(oVar2.f16332g * tVar.f24001f));
            } else if (!(oVar2.f16327b <= 0 || prop == null || tVar == null)) {
                map.put("income", String.valueOf(oVar2.f16332g * tVar.f24001f));
                map.put("money", String.valueOf(oVar2.f16332g * tVar.f24001f));
            }
            try {
                JSONObject jSONObject = new JSONObject();
                if (oVar2.f16327b <= 0) {
                    jSONObject.put(String.valueOf(oVar2.f16326a), String.valueOf(oVar2.f16332g));
                    map.put("gift_info", jSONObject.toString());
                    return;
                }
                jSONObject.put(String.valueOf(oVar2.f16327b), String.valueOf(oVar2.f16332g));
                map.put("prop_info", jSONObject.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
