package com.p2082ss.android.ugc.aweme.kids.profile;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.kids.profile.api.IProfileService;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.ProfileServiceImpl */
public final class ProfileServiceImpl implements IProfileService {
    static {
        Covode.recordClassIndex(67726);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.profile.api.IProfileService
    /* renamed from: a */
    public final Fragment mo95061a() {
        return new C57760c();
    }

    /* renamed from: b */
    public static IProfileService m104468b() {
        MethodCollector.m26663i(12144);
        Object a = C81908b.m141854a(IProfileService.class, false);
        if (a != null) {
            IProfileService iProfileService = (IProfileService) a;
            MethodCollector.m26664o(12144);
            return iProfileService;
        }
        if (C81908b.f183217bT == null) {
            synchronized (IProfileService.class) {
                try {
                    if (C81908b.f183217bT == null) {
                        C81908b.f183217bT = new ProfileServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12144);
                    throw th;
                }
            }
        }
        ProfileServiceImpl profileServiceImpl = (ProfileServiceImpl) C81908b.f183217bT;
        MethodCollector.m26664o(12144);
        return profileServiceImpl;
    }
}
