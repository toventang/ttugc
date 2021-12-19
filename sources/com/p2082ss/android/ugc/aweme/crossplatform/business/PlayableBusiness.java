package com.p2082ss.android.ugc.aweme.crossplatform.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness */
public class PlayableBusiness extends BusinessService.Business {

    /* renamed from: a */
    public boolean f94965a;

    /* renamed from: b */
    private C18288a f94966b;

    static {
        Covode.recordClassIndex(48415);
    }

    public PlayableBusiness(C40589e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public final void mo69734a(C18288a aVar) {
        this.f94966b = aVar;
        mo69735a(false, true);
    }

    /* renamed from: a */
    public final void mo69735a(boolean z, boolean z2) {
        if (this.f94935k.f95069b.f95088B == 1 && this.f94966b != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_mute", z);
                jSONObject.put("endcard_show", z2);
                this.f94966b.mo29252b("endcard_control_event", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
