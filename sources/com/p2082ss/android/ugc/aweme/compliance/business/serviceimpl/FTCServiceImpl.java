package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.FTCServiceImpl */
public final class FTCServiceImpl implements IFTCService {
    static {
        Covode.recordClassIndex(47226);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService
    /* renamed from: c */
    public final void mo68659c() {
        C39608b.f93371b.f93389a.storeString("traffic_control", "");
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService
    /* renamed from: a */
    public final void mo68657a() {
        Context a = C17867d.m33078a();
        FirebaseAnalytics.getInstance(a).mo46312a(false);
        AppsFlyerLib.getInstance().stopTracking(true, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService
    /* renamed from: b */
    public final void mo68658b() {
        Context a = C17867d.m33078a();
        FirebaseAnalytics.getInstance(a).mo46312a(true);
        AppsFlyerLib.getInstance().stopTracking(false, a);
        AppsFlyerLib.getInstance().startTracking(a);
    }

    /* renamed from: d */
    public static IFTCService m80259d() {
        MethodCollector.m26663i(9677);
        Object a = C81908b.m141854a(IFTCService.class, false);
        if (a != null) {
            IFTCService iFTCService = (IFTCService) a;
            MethodCollector.m26664o(9677);
            return iFTCService;
        }
        if (C81908b.f183148aD == null) {
            synchronized (IFTCService.class) {
                try {
                    if (C81908b.f183148aD == null) {
                        C81908b.f183148aD = new FTCServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9677);
                    throw th;
                }
            }
        }
        FTCServiceImpl fTCServiceImpl = (FTCServiceImpl) C81908b.f183148aD;
        MethodCollector.m26664o(9677);
        return fTCServiceImpl;
    }
}
