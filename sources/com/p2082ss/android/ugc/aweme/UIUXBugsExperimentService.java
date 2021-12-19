package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.UIUXBugsExperimentService */
public final class UIUXBugsExperimentService implements IUIUXBugsExperimentService {
    static {
        Covode.recordClassIndex(37987);
    }

    @Override // com.p2082ss.android.ugc.aweme.IUIUXBugsExperimentService
    /* renamed from: a */
    public final boolean mo57250a() {
        if (C16048b.m29633a().mo25412a(true, "enable_uiux_enhancements", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static IUIUXBugsExperimentService m65442b() {
        MethodCollector.m26663i(10983);
        Object a = C81908b.m141854a(IUIUXBugsExperimentService.class, false);
        if (a != null) {
            IUIUXBugsExperimentService iUIUXBugsExperimentService = (IUIUXBugsExperimentService) a;
            MethodCollector.m26664o(10983);
            return iUIUXBugsExperimentService;
        }
        if (C81908b.f183413v == null) {
            synchronized (IUIUXBugsExperimentService.class) {
                try {
                    if (C81908b.f183413v == null) {
                        C81908b.f183413v = new UIUXBugsExperimentService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10983);
                    throw th;
                }
            }
        }
        UIUXBugsExperimentService uIUXBugsExperimentService = (UIUXBugsExperimentService) C81908b.f183413v;
        MethodCollector.m26664o(10983);
        return uIUXBugsExperimentService;
    }
}
