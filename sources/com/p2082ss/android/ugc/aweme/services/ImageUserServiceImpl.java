package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.ImageUserService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.ImageUserServiceImpl */
public final class ImageUserServiceImpl implements ImageUserService {
    static {
        Covode.recordClassIndex(79650);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.ImageUserService
    public final String getCurrentUserId() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        return curUserId;
    }

    public static ImageUserService createImageUserServicebyMonsterPlugin(boolean z) {
        Object a = C81908b.m141854a(ImageUserService.class, z);
        if (a != null) {
            return (ImageUserService) a;
        }
        return new ImageUserServiceImpl();
    }
}
