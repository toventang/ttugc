package com.p2082ss.android.ugc.aweme.p2359ay;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ay.j */
public final class C34378j {

    /* renamed from: a */
    public static final C34378j f81281a = new C34378j();

    /* renamed from: b */
    private static C34377i f81282b = new C34377i();

    private C34378j() {
    }

    static {
        Covode.recordClassIndex(41322);
    }

    /* renamed from: a */
    public final synchronized void mo60812a(boolean z, JSONObject jSONObject) {
        MethodCollector.m26663i(3233);
        C89219l.m154721d(jSONObject, "");
        String optString = jSONObject.optString("uri");
        if (optString == null || optString.length() == 0) {
            MethodCollector.m26664o(3233);
            return;
        }
        boolean a = C89361p.m154908a((CharSequence) optString, (CharSequence) "~tplv-tiktok-shrink", false);
        jSONObject.optInt("file_size");
        jSONObject.optInt("duration");
        if (z) {
            f81282b.f81273a++;
            f81282b.f81275c += jSONObject.optInt("file_size") / 1024;
            f81282b.f81277e += jSONObject.optInt("duration");
            if (a) {
                f81282b.f81274b++;
                f81282b.f81276d += jSONObject.optInt("file_size") / 1024;
                f81282b.f81278f += jSONObject.optInt("duration");
                MethodCollector.m26664o(3233);
                return;
            }
        } else {
            f81282b.f81279g++;
            if (a) {
                f81282b.f81280h++;
            }
        }
        MethodCollector.m26664o(3233);
    }
}
