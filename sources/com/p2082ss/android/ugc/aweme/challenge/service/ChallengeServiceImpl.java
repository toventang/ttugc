package com.p2082ss.android.ugc.aweme.challenge.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.challenge.service.C35543a;
import com.p2082ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.p2082ss.android.ugc.aweme.music.model.Music;

/* renamed from: com.ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl */
public class ChallengeServiceImpl implements IChallengeService {

    /* renamed from: a */
    private final IChallengeService f83821a = C35543a.C35544a.f83822a;

    static {
        Covode.recordClassIndex(42761);
    }

    /* renamed from: a */
    public static IChallengeService m72642a() {
        MethodCollector.m26663i(2662);
        Object a = C81908b.m141854a(IChallengeService.class, false);
        if (a != null) {
            IChallengeService iChallengeService = (IChallengeService) a;
            MethodCollector.m26664o(2662);
            return iChallengeService;
        }
        if (C81908b.f183171aa == null) {
            synchronized (IChallengeService.class) {
                try {
                    if (C81908b.f183171aa == null) {
                        C81908b.f183171aa = new ChallengeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2662);
                    throw th;
                }
            }
        }
        ChallengeServiceImpl challengeServiceImpl = (ChallengeServiceImpl) C81908b.f183171aa;
        MethodCollector.m26664o(2662);
        return challengeServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.IChallengeService
    /* renamed from: a */
    public final void mo62526a(String str, String str2, String str3, Music music, IChallengeService.AbstractC35542a aVar) {
        this.f83821a.mo62526a(str, str2, str3, music, aVar);
    }
}
