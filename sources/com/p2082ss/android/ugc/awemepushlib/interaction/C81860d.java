package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1590c.AbstractC21773d;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.awemepushlib.p4251f.C81834c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.d */
final class C81860d implements AbstractC21773d {
    static {
        Covode.recordClassIndex(95274);
    }

    C81860d() {
    }

    @Override // com.bytedance.push.p1590c.AbstractC21773d
    /* renamed from: a */
    public final void mo35419a(String str, JSONObject jSONObject) {
        C39162r.m79461a(str, jSONObject);
    }

    /* renamed from: a */
    private static void m141754a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C12290b.m22064a(str, jSONObject);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21773d
    /* renamed from: a */
    public final void mo35418a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        String str5 = "";
        C29823c.m60082a(context, str, str2, str3, j, j2, jSONObject);
        m141754a("log_red_badge", "show", new C81834c().mo125503a("count", String.valueOf(j)).mo125504a());
        if (TextUtils.equals(str2, "red_badge") && j > 0) {
            C39162r.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("show").setValue(String.valueOf(j)));
            C36145b.m73641b().mo63263a(context, "red_point_count", j);
        }
        try {
            if (TextUtils.equals(str2, "red_badge")) {
                C81834c a = new C81834c().mo125503a("label", str3).mo125503a("category", str).mo125502a("value", Long.valueOf(j)).mo125502a("ext_value", Long.valueOf(j2));
                if (jSONObject == null) {
                    str4 = str5;
                } else {
                    str4 = jSONObject.toString();
                }
                C34611o.m70668a(str2, a.mo125503a("ext_json", str4).mo125504a());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C39161q.m79450a(context, str, str2, str3, j, j2, jSONObject);
        m141754a("log_red_badge", "show", new C81834c().mo125503a("count", String.valueOf(j)).mo125504a());
        if (TextUtils.equals(str2, "red_badge") && j > 0) {
            C39162r.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("show").setValue(String.valueOf(j)));
            C36145b.m73641b().mo63263a(context, "red_point_count", j);
        }
        try {
            if (TextUtils.equals(str2, "red_badge")) {
                C81834c a2 = new C81834c().mo125503a("label", str3).mo125503a("category", str).mo125502a("value", Long.valueOf(j)).mo125502a("ext_value", Long.valueOf(j2));
                if (jSONObject != null) {
                    str5 = jSONObject.toString();
                }
                C34611o.m70668a(str2, a2.mo125503a("ext_json", str5).mo125504a());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
