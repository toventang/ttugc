package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.e */
public final class C40472e {

    /* renamed from: a */
    public static final C40469b f94713a = null;

    /* renamed from: b */
    public static final C40472e f94714b = new C40472e();

    private C40472e() {
    }

    static {
        Covode.recordClassIndex(48279);
    }

    /* renamed from: a */
    public static final C40469b m81698a() {
        try {
            return (C40469b) SettingsManager.m29616a().mo25397a("creator_plus_settings", C40469b.class, f94713a);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static String m81699a(String str) {
        String str2;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        if (curUser == null) {
            return str;
        }
        String uniqueId = curUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            str2 = curUser.getShortId();
        } else {
            str2 = curUser.getUniqueId();
        }
        return str + "_" + str2;
    }
}
