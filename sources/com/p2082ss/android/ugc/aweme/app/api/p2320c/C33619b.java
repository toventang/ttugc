package com.p2082ss.android.ugc.aweme.app.api.p2320c;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.app.api.c.b */
final /* synthetic */ class C33619b implements AbstractC88433f {

    /* renamed from: a */
    private final boolean f79806a;

    static {
        Covode.recordClassIndex(40512);
    }

    C33619b(boolean z) {
        this.f79806a = z;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        boolean z = this.f79806a;
        JSONObject jSONObject = new JSONObject();
        String str = "proto";
        if (z) {
            str = "json";
        }
        try {
            jSONObject.put("service", str);
            jSONObject.put(StringSet.type, str);
        } catch (Throwable th) {
            C51423a.m95790a(th);
        }
        C12290b.m22064a(C33618a.f79800a, jSONObject);
    }
}
