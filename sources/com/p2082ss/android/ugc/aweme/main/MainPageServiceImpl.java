package com.p2082ss.android.ugc.aweme.main;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.main.MainPageServiceImpl */
public class MainPageServiceImpl implements IMainPageService {
    static {
        Covode.recordClassIndex(69341);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageService
    /* renamed from: a */
    public final Class<? extends Activity> mo96455a() {
        return MainActivity.class;
    }

    /* renamed from: b */
    public static IMainPageService m108428b() {
        MethodCollector.m26663i(7110);
        Object a = C81908b.m141854a(IMainPageService.class, false);
        if (a != null) {
            IMainPageService iMainPageService = (IMainPageService) a;
            MethodCollector.m26664o(7110);
            return iMainPageService;
        }
        if (C81908b.f183298cv == null) {
            synchronized (IMainPageService.class) {
                try {
                    if (C81908b.f183298cv == null) {
                        C81908b.f183298cv = new MainPageServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7110);
                    throw th;
                }
            }
        }
        MainPageServiceImpl mainPageServiceImpl = (MainPageServiceImpl) C81908b.f183298cv;
        MethodCollector.m26664o(7110);
        return mainPageServiceImpl;
    }
}
