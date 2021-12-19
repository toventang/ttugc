package com.bytedance.bdturing.p861a;

import android.content.SharedPreferences;
import com.bytedance.bdturing.C13241a;
import com.bytedance.bdturing.C13270e;
import com.bytedance.bdturing.C13285g;
import com.bytedance.bdturing.p865e.C13278f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.a.a */
public final class C13244a {

    /* renamed from: a */
    public static C13278f.AbstractC13279a f32361a = new C13278f.AbstractC13279a() {
        /* class com.bytedance.bdturing.p861a.C13244a.C132451 */

        static {
            Covode.recordClassIndex(15207);
        }

        @Override // com.bytedance.bdturing.p865e.C13278f.AbstractC13279a
        /* renamed from: a */
        public final void mo21399a(int i, String str, long j) {
            int i2 = 0;
            if (i == 200) {
                try {
                    SharedPreferences.Editor edit = C34822d.m71158a(C13241a.C13243a.f32360a.f32353a.f32388o, "bd_turning_settings_init", 0).edit();
                    edit.putBoolean("inited", true);
                    edit.commit();
                } catch (Exception unused) {
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                jSONObject.put("result", i2);
                jSONObject.put("key", "setting");
                C13270e.m23849a("turing_verify_sdk", jSONObject);
            }
            if (i != 200) {
                i2 = 1;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", j);
                jSONObject2.put("result", i2);
                jSONObject2.put("key", "setting");
                C13270e.m23849a("turing_verify_sdk", jSONObject2);
            } catch (JSONException e) {
                C13285g.m23900a(e);
            }
        }
    };

    static {
        Covode.recordClassIndex(15206);
    }
}
