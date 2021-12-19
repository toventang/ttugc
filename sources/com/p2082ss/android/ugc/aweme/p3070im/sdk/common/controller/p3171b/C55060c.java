package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.b.c */
public final class C55060c {

    /* renamed from: a */
    public static final C55060c f126011a = new C55060c();

    private C55060c() {
    }

    static {
        Covode.recordClassIndex(64788);
    }

    /* renamed from: a */
    public static void m100700a(C19638h hVar, String str) {
        String str2;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(str, "");
        C33744d a = new C33744d().mo59983a("conversation_id", hVar.getConversationId());
        if (hVar.isGroupChat()) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        C33744d a2 = a.mo59983a("chat_type", str2);
        if ((!hVar.isGroupChat()) && a2 != null) {
            a2.mo59981a("to_user_id", AbstractC17427b.C17428a.m32311c(hVar.getConversationId()));
        }
        C39162r.m79460a("message_read_status", a2.mo59983a("read_status", str).f79943a);
    }
}
