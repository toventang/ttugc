package com.p2082ss.android.ugc.aweme.p2397bm;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bm.b */
public final class C34888b {

    /* renamed from: a */
    public static final String f82334a = "VideoPlayer_Log";

    /* renamed from: b */
    public static final C34888b f82335b = new C34888b();

    /* renamed from: c */
    private static final String f82336c = "event";

    /* renamed from: d */
    private static final String f82337d = "data";

    private C34888b() {
    }

    static {
        Covode.recordClassIndex(41899);
    }

    /* renamed from: a */
    public static final void m71264a(String str) {
        C89219l.m154721d(str, "");
        if (C80695q.m139908a()) {
            C51423a.m95784a(3, f82334a, str);
        }
    }

    /* renamed from: a */
    public static String m71263a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f82336c, str);
        jSONObject2.put(f82337d, jSONObject);
        String jSONObject3 = jSONObject2.toString();
        C89219l.m154716b(jSONObject3, "");
        return jSONObject3;
    }

    /* renamed from: b */
    public static final void m71266b(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        if (C80695q.m139908a()) {
            String a = m71263a(str, jSONObject);
            if (!TextUtils.isEmpty(a)) {
                m71264a(a);
            }
        }
    }

    /* renamed from: a */
    public static final void m71265a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C80695q.m139908a()) {
            C51423a.m95784a(6, str, str2);
        }
    }
}
