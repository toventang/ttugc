package com.bytedance.helios.sdk.p1095c;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.AbstractC15305c;
import com.bytedance.helios.api.p1088b.AbstractC15308f;
import com.bytedance.helios.api.p1088b.C15307e;
import com.bytedance.helios.api.p1088b.C15317m;
import com.bytedance.helios.api.p1088b.C15323q;
import com.bytedance.helios.api.p1088b.C15324r;
import com.bytedance.helios.api.p1088b.p1089a.C15303a;
import com.bytedance.helios.sdk.utils.C15484f;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.c.b */
public final class C15382b implements AbstractC15305c {

    /* renamed from: a */
    public static final C15383a f37518a = new C15383a((byte) 0);

    /* renamed from: b */
    private final String[] f37519b = {"EventName"};

    /* renamed from: c */
    private final String[] f37520c = {"MethodTimeCost"};

    static {
        Covode.recordClassIndex(17634);
    }

    /* renamed from: com.bytedance.helios.sdk.c.b$a */
    public static final class C15383a {
        static {
            Covode.recordClassIndex(17635);
        }

        private C15383a() {
        }

        public /* synthetic */ C15383a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.helios.api.p1088b.AbstractC15305c
    /* renamed from: a */
    public final void mo24824a(AbstractC15308f fVar) {
        C89219l.m154719c(fVar, "");
        if (fVar instanceof C15317m) {
            C15317m mVar = (C15317m) fVar;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(this.f37519b[0], "MethodTimeCost");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f37520c[0] + '_' + mVar.f37346a, mVar.f37347b);
            C12290b.m22066a("sky_eye_apm_log", jSONObject, jSONObject2, (JSONObject) null);
        } else if (fVar instanceof C15323q) {
            m28284a((C15323q) fVar);
        } else if (fVar instanceof C15324r) {
            C15324r rVar = (C15324r) fVar;
            JSONObject jSONObject3 = new JSONObject();
            String str = rVar.f37399a;
            if (str == null) {
                str = "null";
            }
            jSONObject3.put("code", str);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("message", rVar.f37400b);
            C12290b.m22066a("helios_upload_alog", jSONObject3, (JSONObject) null, jSONObject4);
            C15484f.m28491a("Helios-Apm-Monitor-Event", "helios_upload_alog\n" + jSONObject3 + '\n' + jSONObject4, (String) null, 12);
        } else if (fVar instanceof C15303a) {
            C15303a aVar = (C15303a) fVar;
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("appops_api_name", aVar.f37321a + '-' + aVar.f37322b);
            C12290b.m22066a("helios_appops_api_count", jSONObject5, (JSONObject) null, (JSONObject) null);
            C15484f.m28491a("Helios-Apm-Monitor-Event", "helios_appops_api_count\n".concat(String.valueOf(jSONObject5)), (String) null, 12);
        }
    }

    /* renamed from: a */
    private static void m28284a(C15323q qVar) {
        C89219l.m154719c(qVar, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("date", qVar.f37393a);
        jSONObject.put("app_ops_config", qVar.f37396d.f37389a);
        jSONObject.put("auto_start_config", qVar.f37396d.f37390b);
        C15307e eVar = qVar.f37396d.f37392d;
        jSONObject.put("default_monitor_normal", eVar.f37332a);
        jSONObject.put("default_monitor_error", eVar.f37333b);
        jSONObject.put("default_intercept_error", eVar.f37334c);
        for (Map.Entry<String, C15307e> entry : qVar.f37397e.entrySet()) {
            jSONObject.put(entry.getKey() + "_monitor_normal", entry.getValue().f37332a);
            jSONObject.put(entry.getKey() + "_monitor_error", entry.getValue().f37333b);
            jSONObject.put(entry.getKey() + "_intercept_error", entry.getValue().f37334c);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("device_id", qVar.f37394b);
        jSONObject2.put("hash_code", qVar.f37395c);
        for (Map.Entry<Integer, C15307e> entry2 : qVar.f37398f.entrySet()) {
            jSONObject.put(entry2.getKey().intValue() + "_monitor_normal", entry2.getValue().f37332a);
            jSONObject.put(entry2.getKey().intValue() + "_monitor_error", entry2.getValue().f37333b);
            jSONObject.put(entry2.getKey().intValue() + "_intercept_error", entry2.getValue().f37334c);
        }
        C12290b.m22066a("helios_sample_rate", jSONObject, (JSONObject) null, jSONObject2);
        C15484f.m28491a("Helios-Apm-Monitor-Event", "helios_sample_rate\n" + jSONObject + '\n' + jSONObject2, (String) null, 12);
    }
}
