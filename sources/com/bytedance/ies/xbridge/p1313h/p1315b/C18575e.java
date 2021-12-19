package com.bytedance.ies.xbridge.p1313h.p1315b;

import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.p998a.C14765b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18566d;
import com.bytedance.ies.xbridge.p1313h.p1316c.C18583d;
import com.bytedance.ies.xbridge.p1349o.C18809c;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.h.b.e */
public final class C18575e extends AbstractC18566d {
    static {
        Covode.recordClassIndex(21269);
    }

    @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18566d
    /* renamed from: a */
    public final void mo29666a(C18583d dVar, AbstractC18566d.AbstractC18567a aVar, EnumC18483e eVar) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        String str = dVar.f44275a;
        if (str == null) {
            C89219l.m154710a("logType");
        }
        String str2 = dVar.f44276b;
        if (str2 == null) {
            C89219l.m154710a("service");
        }
        if (!C89219l.m154714a((Object) "service_monitor", (Object) str) || str2.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", dVar.f44277c);
            AbstractC18754n nVar = dVar.f44278d;
            if (nVar == null) {
                C89219l.m154710a("value");
            }
            jSONObject.put("value", C18809c.m34905a(nVar));
            try {
                if (str2.length() > 0) {
                    jSONObject.put("service", str2);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C14765b.m27094a(str, jSONObject);
            aVar.mo29667a(new C18745b(), "");
            return;
        }
        aVar.mo29668a("service is required while log_type=".concat(String.valueOf(str)));
    }
}
