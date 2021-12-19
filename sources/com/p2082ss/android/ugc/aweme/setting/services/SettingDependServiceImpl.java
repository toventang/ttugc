package com.p2082ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.services.SettingDependServiceImpl */
public final class SettingDependServiceImpl implements ISettingDependService {
    static {
        Covode.recordClassIndex(80668);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingDependService
    /* renamed from: a */
    public final List<String> mo108853a() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingDependService
    /* renamed from: b */
    public final List<String> mo108854b() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingDependService
    /* renamed from: c */
    public final String mo108855c() {
        return C16048b.m29633a().mo25417a(true, "login_device_manager_url", "");
    }

    /* renamed from: d */
    public static ISettingDependService m120778d() {
        MethodCollector.m26663i(4704);
        Object a = C81908b.m141854a(ISettingDependService.class, false);
        if (a != null) {
            ISettingDependService iSettingDependService = (ISettingDependService) a;
            MethodCollector.m26664o(4704);
            return iSettingDependService;
        }
        if (C81908b.f183317dN == null) {
            synchronized (ISettingDependService.class) {
                try {
                    if (C81908b.f183317dN == null) {
                        C81908b.f183317dN = new SettingDependServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4704);
                    throw th;
                }
            }
        }
        SettingDependServiceImpl settingDependServiceImpl = (SettingDependServiceImpl) C81908b.f183317dN;
        MethodCollector.m26664o(4704);
        return settingDependServiceImpl;
    }
}
