package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3285a.C56645a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.a */
public final class C56635a {

    /* renamed from: a */
    public static final C56635a f129088a = new C56635a();

    private C56635a() {
    }

    static {
        Covode.recordClassIndex(66480);
    }

    /* renamed from: a */
    public static void m102627a(C56645a aVar) {
        C89219l.m154721d(aVar, "");
        C39162r.m79460a("livesdk_tiktokec_product_icon_show", m102629c(aVar).f79943a);
    }

    /* renamed from: b */
    public static void m102628b(C56645a aVar) {
        C89219l.m154721d(aVar, "");
        C39162r.m79460a("livesdk_tiktokec_product_icon_click", m102629c(aVar).f79943a);
    }

    /* renamed from: c */
    private static C33744d m102629c(C56645a aVar) {
        String a;
        if (C89219l.m154714a((Object) aVar.mo93531a("room_id"), (Object) "0")) {
            a = "";
        } else {
            a = aVar.mo93531a("room_id");
        }
        C33744d a2 = new C33744d().mo59983a("anchor_id", aVar.mo93531a("anchor_id")).mo59983a("EVENT_ORIGIN_FEATURE", "TEMAI").mo59983a("room_id", a).mo59983a("live_status", aVar.mo93531a("live_status"));
        String a3 = aVar.mo93531a("page_type");
        if (a3 == null) {
            a3 = "";
        }
        C33744d a4 = a2.mo59983a("page_type", a3);
        String a5 = aVar.mo93531a("anchor_show_type");
        if (a5 == null) {
            a5 = "";
        }
        C33744d a6 = a4.mo59983a("anchor_show_type", a5);
        C89219l.m154716b(a6, "");
        return a6;
    }
}
