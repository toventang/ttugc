package com.p2082ss.android.ugc.aweme.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bridge.a */
public final class C34927a {

    /* renamed from: a */
    public static final C34927a f82397a = new C34927a();

    private C34927a() {
    }

    static {
        Covode.recordClassIndex(41946);
    }

    /* renamed from: a */
    public static void m71314a(AbstractC16183k.AbstractC16185b bVar, JSONObject jSONObject) {
        C89219l.m154721d(bVar, "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        jSONObject2.put("data", jSONObject);
        bVar.mo25704a(jSONObject2);
    }

    /* renamed from: a */
    public static void m71313a(AbstractC16183k.AbstractC16185b bVar, Throwable th) {
        String str;
        String message;
        C89219l.m154721d(bVar, "");
        String str2 = "something went wrong";
        if (th == null || (str = th.getMessage()) == null) {
            str = str2;
        }
        JSONObject jSONObject = new JSONObject();
        if (!(th == null || (message = th.getMessage()) == null)) {
            str2 = message;
        }
        jSONObject.put("message", str2);
        bVar.mo25703a(-1, str, jSONObject);
    }
}
