package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.p2082ss.ugc.effectplatform.p4452i.AbstractC86801a;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNMonitorService */
public final class KNMonitorService implements AbstractC86801a {
    private final IMonitorService iMonitorService;

    static {
        Covode.recordClassIndex(95728);
    }

    public KNMonitorService(IMonitorService iMonitorService2) {
        C89219l.m154719c(iMonitorService2, "");
        this.iMonitorService = iMonitorService2;
    }

    @Override // com.p2082ss.ugc.effectplatform.p4452i.AbstractC86801a
    public final void monitorStatusRate(String str, int i, Map<String, ? extends Object> map) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        this.iMonitorService.monitorStatusRate(str, i, jSONObject);
    }
}
