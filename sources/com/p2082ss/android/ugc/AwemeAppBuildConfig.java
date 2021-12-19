package com.p2082ss.android.ugc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;

/* renamed from: com.ss.android.ugc.AwemeAppBuildConfig */
public class AwemeAppBuildConfig implements AppBuildConfig {
    static {
        Covode.recordClassIndex(37612);
    }

    @Override // com.bytedance.ies.ugc.appcontext.AppBuildConfig
    /* renamed from: a */
    public final String mo28435a() {
        return "22.4.5";
    }

    @Override // com.bytedance.ies.ugc.appcontext.AppBuildConfig
    /* renamed from: b */
    public final String mo28436b() {
        return "disabled";
    }

    @Override // com.bytedance.ies.ugc.appcontext.AppBuildConfig
    /* renamed from: c */
    public final String mo28437c() {
        return "alpha";
    }

    /* renamed from: d */
    public static AppBuildConfig m63699d() {
        MethodCollector.m26663i(2749);
        Object a = C81908b.m141854a(AppBuildConfig.class, false);
        if (a != null) {
            AppBuildConfig appBuildConfig = (AppBuildConfig) a;
            MethodCollector.m26664o(2749);
            return appBuildConfig;
        }
        if (C81908b.f183401j == null) {
            synchronized (AppBuildConfig.class) {
                try {
                    if (C81908b.f183401j == null) {
                        C81908b.f183401j = new AwemeAppBuildConfig();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2749);
                    throw th;
                }
            }
        }
        AwemeAppBuildConfig awemeAppBuildConfig = (AwemeAppBuildConfig) C81908b.f183401j;
        MethodCollector.m26664o(2749);
        return awemeAppBuildConfig;
    }
}
