package com.p2082ss.android.ugc.aweme.launcher;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.launcher.LauncherServiceImpl */
public class LauncherServiceImpl implements ILauncherService {
    static {
        Covode.recordClassIndex(68120);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.ILauncherService
    /* renamed from: a */
    public final String mo95571a() {
        return "disabled";
    }

    /* renamed from: b */
    public static ILauncherService m104924b() {
        MethodCollector.m26663i(3675);
        Object a = C81908b.m141854a(ILauncherService.class, false);
        if (a != null) {
            ILauncherService iLauncherService = (ILauncherService) a;
            MethodCollector.m26664o(3675);
            return iLauncherService;
        }
        if (C81908b.f183222bY == null) {
            synchronized (ILauncherService.class) {
                try {
                    if (C81908b.f183222bY == null) {
                        C81908b.f183222bY = new LauncherServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3675);
                    throw th;
                }
            }
        }
        LauncherServiceImpl launcherServiceImpl = (LauncherServiceImpl) C81908b.f183222bY;
        MethodCollector.m26664o(3675);
        return launcherServiceImpl;
    }
}
