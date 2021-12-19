package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17977a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17992i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C18003m;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService;
import com.p2082ss.android.ugc.C81908b;

public final class SplashSettingServiceImpl implements ISplashSettingService {
    static {
        Covode.recordClassIndex(20574);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    /* renamed from: d */
    public final boolean mo28726d() {
        return C18003m.f42865b;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    /* renamed from: e */
    public final boolean mo28727e() {
        return C17992i.m33506a();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    /* renamed from: f */
    public final boolean mo28728f() {
        return C17977a.m33497a();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    /* renamed from: a */
    public final boolean mo28723a() {
        return C16048b.m29633a().mo25421a(true, "cold_start_upload_topview_cid_enabled", false);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    /* renamed from: b */
    public final int mo28724b() {
        return C16048b.m29633a().mo25412a(true, "awesome_splash_ad_delay_millis", 0);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    /* renamed from: c */
    public final boolean mo28725c() {
        return C16048b.m29633a().mo25421a(true, "topview_feed_gap_optimize_enabled", false);
    }

    /* renamed from: g */
    public static ISplashSettingService m33419g() {
        MethodCollector.m26663i(3257);
        Object a = C81908b.m141854a(ISplashSettingService.class, false);
        if (a != null) {
            ISplashSettingService iSplashSettingService = (ISplashSettingService) a;
            MethodCollector.m26664o(3257);
            return iSplashSettingService;
        }
        if (C81908b.f183356e == null) {
            synchronized (ISplashSettingService.class) {
                try {
                    if (C81908b.f183356e == null) {
                        C81908b.f183356e = new SplashSettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3257);
                    throw th;
                }
            }
        }
        SplashSettingServiceImpl splashSettingServiceImpl = (SplashSettingServiceImpl) C81908b.f183356e;
        MethodCollector.m26664o(3257);
        return splashSettingServiceImpl;
    }
}
