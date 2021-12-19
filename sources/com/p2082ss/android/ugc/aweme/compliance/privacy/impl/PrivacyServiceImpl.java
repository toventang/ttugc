package com.p2082ss.android.ugc.aweme.compliance.privacy.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39252m;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl */
public final class PrivacyServiceImpl implements IPrivacyService {
    static {
        Covode.recordClassIndex(47423);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    /* renamed from: a */
    public final void mo68678a() {
        C39659b.m80539a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    /* renamed from: c */
    public final AbstractC58264w mo68681c() {
        return new LaunchTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    /* renamed from: b */
    public final boolean mo68680b() {
        if (C39699a.m80583a() || C39699a.m80587b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static IPrivacyService m80573d() {
        MethodCollector.m26663i(11149);
        Object a = C81908b.m141854a(IPrivacyService.class, false);
        if (a != null) {
            IPrivacyService iPrivacyService = (IPrivacyService) a;
            MethodCollector.m26664o(11149);
            return iPrivacyService;
        }
        if (C81908b.f183158aN == null) {
            synchronized (IPrivacyService.class) {
                try {
                    if (C81908b.f183158aN == null) {
                        C81908b.f183158aN = new PrivacyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11149);
                    throw th;
                }
            }
        }
        PrivacyServiceImpl privacyServiceImpl = (PrivacyServiceImpl) C81908b.f183158aN;
        MethodCollector.m26664o(11149);
        return privacyServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    /* renamed from: a */
    public final C39252m mo68676a(String str) {
        C89219l.m154721d(str, "");
        return C39659b.m80536a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    /* renamed from: b */
    public final void mo68679b(String str) {
        C89219l.m154721d(str, "");
        C39659b.m80541b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    /* renamed from: a */
    public final C39256o mo68677a(int i, String str) {
        C89219l.m154721d(str, "");
        return C39659b.m80537a(i, str);
    }
}
