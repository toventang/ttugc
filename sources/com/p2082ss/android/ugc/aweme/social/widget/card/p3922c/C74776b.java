package com.p2082ss.android.ugc.aweme.social.widget.card.p3922c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74783e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.c.b */
public final class C74776b {

    /* renamed from: a */
    public static final C74776b f168075a = new C74776b();

    private C74776b() {
    }

    static {
        Covode.recordClassIndex(87621);
    }

    /* renamed from: a */
    public static void m131283a(EnumC74761f fVar, Map<String, String> map) {
        C89219l.m154721d(fVar, "");
        m131282a(fVar, "authorize_card_show", map);
    }

    /* renamed from: b */
    public static void m131284b(EnumC74761f fVar, Map<String, String> map) {
        C89219l.m154721d(fVar, "");
        Map b = C89041ag.m154427b(C89387v.m154943a("platform", C74783e.m131303e(fVar)));
        if (map != null) {
            b.putAll(map);
        }
        C39162r.m79460a("authorize_card_close", b);
    }

    /* renamed from: a */
    public static void m131282a(EnumC74761f fVar, String str, Map<String, String> map) {
        Map b = C89041ag.m154427b(C89387v.m154943a("is_auth", C74775a.m131281a(false)), C89387v.m154943a("platform", C74783e.m131303e(fVar)), C89387v.m154943a("did_status", C74783e.m131302d(fVar)), C89387v.m154943a("uid_status", C74783e.m131301c(fVar)));
        if (map != null) {
            b.putAll(map);
        }
        C39162r.m79460a(str, b);
    }
}
