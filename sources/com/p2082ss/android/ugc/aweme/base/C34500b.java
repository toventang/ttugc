package com.p2082ss.android.ugc.aweme.base;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.b */
public final class C34500b {

    /* renamed from: a */
    public static final C34500b f81484a = new C34500b();

    private C34500b() {
    }

    static {
        Covode.recordClassIndex(41458);
    }

    /* renamed from: a */
    public static Integer m70485a(Aweme aweme) {
        String str;
        int i;
        User author;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
        if (C89219l.m154714a((Object) str, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            return null;
        }
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            i = -1;
        } else {
            i = author.getFollowStatus();
        }
        return Integer.valueOf(i);
    }
}
