package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAppWidgetService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl */
public final class AppWidgetServiceImpl implements IAppWidgetService {
    static {
        Covode.recordClassIndex(93418);
    }

    /* renamed from: a */
    public static IAppWidgetService m138932a() {
        MethodCollector.m26663i(1879);
        Object a = C81908b.m141854a(IAppWidgetService.class, false);
        if (a != null) {
            IAppWidgetService iAppWidgetService = (IAppWidgetService) a;
            MethodCollector.m26664o(1879);
            return iAppWidgetService;
        }
        if (C81908b.f183391eu == null) {
            synchronized (IAppWidgetService.class) {
                try {
                    if (C81908b.f183391eu == null) {
                        C81908b.f183391eu = new AppWidgetServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1879);
                    throw th;
                }
            }
        }
        AppWidgetServiceImpl appWidgetServiceImpl = (AppWidgetServiceImpl) C81908b.f183391eu;
        MethodCollector.m26664o(1879);
        return appWidgetServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAppWidgetService
    /* renamed from: a */
    public final void mo57207a(Context context) {
        C89219l.m154721d(context, "");
        C80608p.m139760a(context);
    }
}
