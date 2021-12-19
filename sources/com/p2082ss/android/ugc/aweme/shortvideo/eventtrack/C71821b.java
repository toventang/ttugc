package com.p2082ss.android.ugc.aweme.shortvideo.eventtrack;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eventtrack.b */
public final class C71821b {

    /* renamed from: a */
    public static final C71821b f160968a = new C71821b();

    private C71821b() {
    }

    static {
        Covode.recordClassIndex(84367);
    }

    /* renamed from: a */
    public static void m126812a(String str, String str2) {
        C89219l.m154721d(str2, "");
        C84425b bVar = new C84425b();
        if (str == null) {
            str = "";
        }
        C39162r.m79460a("show_transl_auth_intro", bVar.mo129406a("shoot_way", str).mo129406a("creation_id", str2).f188764a);
    }

    /* renamed from: b */
    public static void m126813b(String str, String str2) {
        C89219l.m154721d(str2, "");
        C84425b bVar = new C84425b();
        if (str == null) {
            str = "";
        }
        C39162r.m79460a("accept_transl_auth", bVar.mo129406a("shoot_way", str).mo129406a("creation_id", str2).f188764a);
    }

    /* renamed from: c */
    public static void m126814c(String str, String str2) {
        C89219l.m154721d(str2, "");
        C84425b bVar = new C84425b();
        if (str == null) {
            str = "";
        }
        C39162r.m79460a("decline_transl_auth", bVar.mo129406a("shoot_way", str).mo129406a("creation_id", str2).f188764a);
    }
}
