package com.p2082ss.android.ugc.aweme.p2359ay;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20738o;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.p2359ay.p2360a.C34361a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ay.n */
final /* synthetic */ class C34383n implements AbstractC20738o {

    /* renamed from: a */
    static final AbstractC20738o f81286a = new C34383n();

    static {
        Covode.recordClassIndex(41327);
    }

    private C34383n() {
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20738o
    /* renamed from: a */
    public final void mo34167a(boolean z, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        if (z || !(41 == (optInt2 = jSONObject.optInt("err_code")) || 40 == optInt2)) {
            C34378j.f81281a.mo60812a(z, jSONObject);
        }
        if (!ApmDelegate.C12507a.f30372a.mo20329a("image_monitor_v2")) {
            return;
        }
        if (z || !(41 == (optInt = jSONObject.optInt("err_code")) || 40 == optInt)) {
            C34361a aVar = null;
            boolean z2 = true;
            try {
                aVar = (C34361a) C16048b.m29633a().mo25415a(true, "image_crop_config_v3", C34361a.class);
            } catch (Throwable unused) {
            }
            if (aVar == null) {
                z2 = false;
            }
            try {
                jSONObject.put("url_convert", z2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C34611o.m70668a("image_monitor_v2", jSONObject);
        }
    }
}
