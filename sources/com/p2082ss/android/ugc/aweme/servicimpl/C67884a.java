package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IAVMobService;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.a */
public final class C67884a implements IAVMobService {
    static {
        Covode.recordClassIndex(80053);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVMobService
    public final void onEventV3(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C80322d.m139251a(str, map);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVMobService
    public final void onEventV3(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C80322d.m139252a(str, jSONObject);
    }
}
