package com.p2082ss.android.ugc.aweme.profile.p3568b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: com.ss.android.ugc.aweme.profile.b.d */
public final class C63497d {

    /* renamed from: a */
    public static final C63497d f144114a = new C63497d();

    private C63497d() {
    }

    static {
        Covode.recordClassIndex(74805);
    }

    /* renamed from: a */
    public static String m115066a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUserID();
        }
        return null;
    }
}
