package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.NoticeChallengePropertyUtilImpl */
public final class NoticeChallengePropertyUtilImpl implements NoticeChallengePropertyUtil {
    static {
        Covode.recordClassIndex(46142);
    }

    /* renamed from: a */
    public static NoticeChallengePropertyUtil m78332a() {
        MethodCollector.m26663i(3820);
        Object a = C81908b.m141854a(NoticeChallengePropertyUtil.class, false);
        if (a != null) {
            NoticeChallengePropertyUtil noticeChallengePropertyUtil = (NoticeChallengePropertyUtil) a;
            MethodCollector.m26664o(3820);
            return noticeChallengePropertyUtil;
        }
        if (C81908b.f183191au == null) {
            synchronized (NoticeChallengePropertyUtil.class) {
                try {
                    if (C81908b.f183191au == null) {
                        C81908b.f183191au = new NoticeChallengePropertyUtilImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3820);
                    throw th;
                }
            }
        }
        NoticeChallengePropertyUtilImpl noticeChallengePropertyUtilImpl = (NoticeChallengePropertyUtilImpl) C81908b.f183191au;
        MethodCollector.m26664o(3820);
        return noticeChallengePropertyUtilImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil
    /* renamed from: a */
    public final void mo67185a(Challenge challenge) {
        CommerceChallengeServiceImpl.m75741e().mo65383a(challenge);
    }
}
