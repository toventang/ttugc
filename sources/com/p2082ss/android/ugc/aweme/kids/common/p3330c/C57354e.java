package com.p2082ss.android.ugc.aweme.kids.common.p3330c;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.c.e */
public final class C57354e {

    /* renamed from: a */
    public static final C57354e f130732a = new C57354e();

    private C57354e() {
    }

    static {
        Covode.recordClassIndex(67265);
    }

    /* renamed from: a */
    public static final void m103958a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C57355f.m103962a(str, jSONObject);
    }

    /* renamed from: a */
    public static final void m103957a(String str, int i, int i2, long j) {
        C89219l.m154721d(str, "");
        C57355f.m103962a("kids_api_monitor", new C33743c().mo59974a(StringSet.type, Integer.valueOf(i)).mo59976a("service", str).mo59974a("status", Integer.valueOf(i2)).mo59975a("duration", Long.valueOf(System.currentTimeMillis() - j)).mo59977a());
    }
}
