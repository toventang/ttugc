package com.p2082ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.n */
public final class C37681n implements AbstractC38207a {
    static {
        Covode.recordClassIndex(45114);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a
    /* renamed from: b */
    public final String mo65696b() {
        return AVExternalServiceImpl.m113114a().publishService().getShootWay();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a
    /* renamed from: c */
    public final boolean mo65697c() {
        return AVExternalServiceImpl.m113114a().publishService().usedBusiSticker();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a
    /* renamed from: e */
    public final boolean mo65699e() {
        return AVExternalServiceImpl.m113114a().publishService().isInShoutout();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a
    /* renamed from: f */
    public final User mo65700f() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUser();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a
    /* renamed from: a */
    public final boolean mo65695a() {
        AVChallenge curChallenge = AVExternalServiceImpl.m113114a().publishService().getCurChallenge();
        if (curChallenge == null || !curChallenge.isCommerce) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a
    /* renamed from: d */
    public final boolean mo65698d() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        return e.isChildrenMode();
    }
}
