package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55099j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ag */
public final class C55185ag {

    /* renamed from: a */
    public static final C55185ag f126243a = new C55185ag();

    private C55185ag() {
    }

    static {
        Covode.recordClassIndex(64930);
    }

    /* renamed from: a */
    public static void m100886a(String str) {
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(C17867d.m33078a(), "aweme://user/profile/").withParam("uid", str).withParam("sec_user_id", C55099j.m100777a(str)).withParam("extra_previous_page_position", "card_head").withParam("previous_page", "message").withParam("enter_from", "chat").withParam("extra_from_pre_page", "message").open();
        }
    }

    /* renamed from: a */
    public static void m100887a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            m100886a(str);
        } else {
            SmartRouter.buildRoute(C17867d.m33078a(), "aweme://user/profile/").withParam("uid", str).withParam("sec_user_id", str2).withParam("previous_page_position", "other_places").withParam("previous_page", "message").withParam("enter_from", "chat").open();
        }
    }

    /* renamed from: b */
    public static void m100888b(String str, String str2) {
        SmartRouter.buildRoute(C17867d.m33078a(), "aweme://user/profile/").withParam("uid", str).withParam("sec_user_id", C55099j.m100777a(str)).withParam("previous_page_position", "other_places").withParam("extra_from_pre_page", str2).withParam("enter_from", str2).open();
    }
}
