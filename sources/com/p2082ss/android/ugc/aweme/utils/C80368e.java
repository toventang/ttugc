package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.e */
public final class C80368e {

    /* renamed from: a */
    public static final C80368e f179894a = new C80368e();

    private C80368e() {
    }

    static {
        Covode.recordClassIndex(93636);
    }

    /* renamed from: a */
    public static String m139340a() {
        C40964c cVar = C40964c.C40968c.f95804a;
        C89219l.m154716b(cVar, "");
        if (cVar.mo70144a()) {
            return "background";
        }
        Activity c = C40964c.m82474c();
        if (c != null) {
            return c.toString();
        }
        return null;
    }

    /* renamed from: a */
    public static void m139341a(String str) {
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onOpenMic creationId: " + str + " currentPage " + m139340a());
        C39162r.m79460a("tool_mic_open", new C84425b().mo129406a("creation_id", str).mo129406a("page", m139340a()).f188764a);
    }

    /* renamed from: b */
    public static void m139343b(String str) {
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onOpenMicSuccess creationId: " + str + " currentPage " + m139340a());
        C39162r.m79460a("tool_mic_open_success", new C84425b().mo129406a("creation_id", str).mo129406a("page", m139340a()).f188764a);
    }

    /* renamed from: c */
    public static void m139344c(String str) {
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onReleaseMic creationId: " + str + " currentPage " + m139340a());
        C39162r.m79460a("tool_mic_release", new C84425b().mo129406a("creation_id", str).mo129406a("page", m139340a()).f188764a);
    }

    /* renamed from: a */
    public static void m139342a(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C84911q.m145928d("AVSecurityMobHelper onOpenMicFailed creationId: " + str + " errCode: " + i + " msg: " + str2 + " currentPage " + m139340a());
        C39162r.m79460a("tool_mic_open_fail", new C84425b().mo129406a("creation_id", str).mo129403a("error_code", i).mo129406a("msg", str2).mo129406a("page", m139340a()).f188764a);
    }
}
