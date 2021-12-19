package com.p2082ss.android.ugc.aweme.account.experiment.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.INonPersonalizationService;
import com.p2082ss.android.ugc.aweme.account.experiment.C31658m;
import com.p2082ss.android.ugc.aweme.account.experiment.SEANonPersonalizedExperiencePopupSettings;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.service.NonPersonalizationService */
public final class NonPersonalizationService implements INonPersonalizationService {
    static {
        Covode.recordClassIndex(38398);
    }

    /* renamed from: c */
    public static INonPersonalizationService m65980c() {
        MethodCollector.m26663i(11358);
        Object a = C81908b.m141854a(INonPersonalizationService.class, false);
        if (a != null) {
            INonPersonalizationService iNonPersonalizationService = (INonPersonalizationService) a;
            MethodCollector.m26664o(11358);
            return iNonPersonalizationService;
        }
        if (C81908b.f183120C == null) {
            synchronized (INonPersonalizationService.class) {
                try {
                    if (C81908b.f183120C == null) {
                        C81908b.f183120C = new NonPersonalizationService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11358);
                    throw th;
                }
            }
        }
        NonPersonalizationService nonPersonalizationService = (NonPersonalizationService) C81908b.f183120C;
        MethodCollector.m26664o(11358);
        return nonPersonalizationService;
    }

    @Override // com.p2082ss.android.ugc.aweme.INonPersonalizationService
    /* renamed from: a */
    public final boolean mo57227a() {
        if (!C31658m.m65970c()) {
            return false;
        }
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        if (e.isLogin() || C31658m.m65969b() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.INonPersonalizationService
    /* renamed from: b */
    public final boolean mo57228b() {
        SEANonPersonalizedExperiencePopupSettings.C31636a popupSettings;
        if (!C31658m.m65970c()) {
            return false;
        }
        if ((C31658m.m65969b() == 1 || C31658m.m65969b() == 2) && (popupSettings = SEANonPersonalizedExperiencePopupSettings.getPopupSettings()) != null && System.currentTimeMillis() - C31658m.m65968a() > ((long) popupSettings.f75675a) * 86400000) {
            return true;
        }
        return false;
    }
}
