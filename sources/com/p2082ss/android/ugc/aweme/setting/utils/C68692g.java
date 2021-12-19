package com.p2082ss.android.ugc.aweme.setting.utils;

import android.content.Context;
import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p159e.C2773a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.setting.utils.g */
public final class C68692g {
    static {
        Covode.recordClassIndex(80953);
    }

    /* renamed from: a */
    public static boolean m121126a() {
        User curUser = C31575b.m65865g().getCurUser();
        if (curUser == null || curUser.getCommerceUserInfo() == null) {
            return false;
        }
        return curUser.getCommerceUserInfo().hasPromote;
    }

    /* renamed from: a */
    public static void m121125a(Context context) {
        C2773a.C2774a aVar = new C2773a.C2774a(C17879g.m33104a());
        aVar.f8345l = C68693h.f153697a;
        aVar.f8350q = new C68694i(context);
        aVar.f8335b = "https://fp22-normal-useast1a.tiktokv.com";
        C2732a.f8145a.mo7360a(aVar.mo7355a());
    }
}
