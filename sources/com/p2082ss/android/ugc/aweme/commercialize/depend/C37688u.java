package com.p2082ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.u */
public final class C37688u implements IMonitorDepend {
    static {
        Covode.recordClassIndex(45121);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C33830n.m70668a(str, jSONObject);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        C89219l.m154721d(th, "");
        C13468b.m24212a(th, str, map);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C12290b.m22060a(str, i, jSONObject);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(str, "");
        C33830n.m70666a(str, i, jSONObject, jSONObject2);
    }
}
