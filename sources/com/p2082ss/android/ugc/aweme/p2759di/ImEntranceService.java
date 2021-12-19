package com.p2082ss.android.ugc.aweme.p2759di;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61595q;
import com.p2082ss.android.ugc.aweme.p3070im.C53599d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IIMEntranceService;
import com.p2082ss.android.ugc.aweme.p3070im.service.C56185a;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;

/* renamed from: com.ss.android.ugc.aweme.di.ImEntranceService */
public class ImEntranceService implements IIMEntranceService {
    static {
        Covode.recordClassIndex(49384);
    }

    /* renamed from: a */
    public static IIMEntranceService m83411a() {
        MethodCollector.m26663i(2520);
        Object a = C81908b.m141854a(IIMEntranceService.class, false);
        if (a != null) {
            IIMEntranceService iIMEntranceService = (IIMEntranceService) a;
            MethodCollector.m26664o(2520);
            return iIMEntranceService;
        }
        if (C81908b.f183168aX == null) {
            synchronized (IIMEntranceService.class) {
                try {
                    if (C81908b.f183168aX == null) {
                        C81908b.f183168aX = new ImEntranceService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2520);
                    throw th;
                }
            }
        }
        ImEntranceService imEntranceService = (ImEntranceService) C81908b.f183168aX;
        MethodCollector.m26664o(2520);
        return imEntranceService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IIMEntranceService
    public void init(IIMService iIMService) {
        Application a = C17879g.m33104a();
        if (iIMService != null) {
            C56185a aVar = new C56185a();
            aVar.f128184g = (int) C17867d.m33084e();
            aVar.f128183f = C17867d.f42595s;
            aVar.f128182e = "https://api.tiktokv.com/aweme/v1/";
            aVar.f128181d = "https://api.tiktokv.com/";
            aVar.f128180c = "https://imapi-16.tiktokv.com/";
            aVar.f128179b = C61595q.f139773a;
            aVar.f128185h = C17867d.m33081b();
            aVar.f128178a = false;
            iIMService.initialize(a, aVar, new C53599d());
        }
    }
}
