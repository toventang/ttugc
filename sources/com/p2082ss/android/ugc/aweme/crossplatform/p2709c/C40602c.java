package com.p2082ss.android.ugc.aweme.crossplatform.p2709c;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.c */
public final class C40602c {

    /* renamed from: a */
    public static final C40602c f95018a = new C40602c();

    private C40602c() {
    }

    static {
        Covode.recordClassIndex(48442);
    }

    /* renamed from: a */
    public static void m81954a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        String str;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("extra")) != null && (optJSONObject2 = optJSONObject.optJSONObject("client_category")) != null && C89219l.m154714a((Object) optJSONObject2.optString(StringSet.type), (Object) "lynx")) {
            try {
                JSONObject optJSONObject3 = optJSONObject.optJSONObject("client_metric");
                JSONObject optJSONObject4 = optJSONObject.optJSONObject("client_extra");
                if (optJSONObject4 != null) {
                    str = optJSONObject4.optString("event_name");
                } else {
                    str = null;
                }
                C33744d dVar = new C33744d();
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    C89219l.m154716b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (C89219l.m154714a((Object) next, (Object) "trigger")) {
                            dVar.mo59983a("trigger_v2", optJSONObject2.optString(next));
                        } else {
                            dVar.mo59983a(next, optJSONObject2.optString(next));
                        }
                    }
                }
                if (optJSONObject3 != null) {
                    Iterator<String> keys2 = optJSONObject3.keys();
                    C89219l.m154716b(keys2, "");
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (C89219l.m154714a((Object) next2, (Object) "trigger")) {
                            dVar.mo59981a("trigger_v2", optJSONObject3.optLong(next2));
                        } else {
                            dVar.mo59981a(next2, optJSONObject3.optLong(next2));
                        }
                    }
                }
                C39162r.m79460a(str, dVar.f79943a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
