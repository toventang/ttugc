package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.b */
public final class C75061b {

    /* renamed from: a */
    public static final C75061b f168711a = new C75061b();

    /* renamed from: b */
    private static boolean f168712b;

    /* renamed from: c */
    private static boolean f168713c;

    /* renamed from: d */
    private static boolean f168714d;

    private C75061b() {
    }

    static {
        Covode.recordClassIndex(87933);
    }

    /* renamed from: a */
    public static void m131822a(int i, String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("taskId", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C12290b.m22066a("campaign_task_finish_monitor", jSONObject, (JSONObject) null, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m131821a(int i, int i2) {
        if (i == 4) {
            if (!f168712b) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", 4);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C12290b.m22066a("pendant_self_show_monitor", jSONObject, (JSONObject) null, (JSONObject) null);
                C39162r.m79460a("pendant_feed_page_show", new C33744d().mo59980a("pendant_version", i2).f79943a);
                f168712b = true;
            }
        } else if (i == 6) {
            if (!f168713c) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("status", 6);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                C12290b.m22066a("pendant_self_show_monitor", jSONObject2, (JSONObject) null, (JSONObject) null);
                C39162r.m79460a("pendant_self_show", new C33744d().mo59980a("pendant_version", i2).f79943a);
                f168713c = true;
            }
        } else if (i == 5 && !f168714d) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("status", 5);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            C12290b.m22066a("pendant_self_show_monitor", jSONObject3, (JSONObject) null, (JSONObject) null);
            C39162r.m79460a("overall_switch_show", new C33744d().mo59980a("pendant_version", i2).f79943a);
            f168714d = true;
        }
    }
}
