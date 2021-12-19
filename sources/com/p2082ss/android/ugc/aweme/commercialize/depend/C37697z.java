package com.p2082ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.tcm.api.p4073a.AbstractC77727a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.z */
public final class C37697z implements AbstractC77727a {
    static {
        Covode.recordClassIndex(45130);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4073a.AbstractC77727a
    /* renamed from: b */
    public final User mo65702b() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUser();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4073a.AbstractC77727a
    /* renamed from: a */
    public final boolean mo65701a() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        return e.isChildrenMode();
    }
}
