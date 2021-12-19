package com.p2082ss.android.ugc.aweme.sec.captcha.p3709a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.C22704g;
import com.bytedance.sdk.bridge.p1693a.AbstractC22688b;
import com.bytedance.sdk.bridge.p1693a.AbstractC22689c;
import com.bytedance.sdk.bridge.p1693a.AbstractC22690d;
import com.bytedance.sdk.bridge.p1694b.AbstractC22699d;
import com.bytedance.sdk.bridge.p1694b.C22695b;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47808d;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sec.captcha.a.a */
public final class C67823a {
    static {
        Covode.recordClassIndex(79483);
    }

    @AbstractC22689c(mo36974a = "appInfo", mo36975b = "public", mo36976c = "SYNC")
    public final void appInfo(@AbstractC22688b AbstractC22699d dVar, @AbstractC22690d(mo36977a = "permissionGroup") String str) {
        C89219l.m154721d(dVar, "");
        JSONObject jSONObject = new JSONObject();
        for (T t : C47808d.m90825a(str).entrySet()) {
            jSONObject.put((String) t.getKey(), t.getValue());
        }
        C22704g.m42795a("BridgeResult", "createSuccessResult " + String.valueOf(jSONObject) + " " + "");
        C22695b bVar = new C22695b((byte) 0);
        bVar.f53612a = C22695b.EnumC22696a.SUCCESS.getValue();
        if (!TextUtils.isEmpty("")) {
            bVar.f53613b = "";
        }
        bVar.f53614c = jSONObject;
    }
}
