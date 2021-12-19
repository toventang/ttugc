package com.p2082ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IDuetDownloadService;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.DuetDownloadService */
public final class DuetDownloadService implements IDuetDownloadService {
    static {
        Covode.recordClassIndex(82116);
    }

    /* renamed from: a */
    public static IDuetDownloadService m123152a() {
        MethodCollector.m26663i(8070);
        Object a = C81908b.m141854a(IDuetDownloadService.class, false);
        if (a != null) {
            IDuetDownloadService iDuetDownloadService = (IDuetDownloadService) a;
            MethodCollector.m26664o(8070);
            return iDuetDownloadService;
        }
        if (C81908b.f183327dX == null) {
            synchronized (IDuetDownloadService.class) {
                try {
                    if (C81908b.f183327dX == null) {
                        C81908b.f183327dX = new DuetDownloadService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8070);
                    throw th;
                }
            }
        }
        DuetDownloadService duetDownloadService = (DuetDownloadService) C81908b.f183327dX;
        MethodCollector.m26664o(8070);
        return duetDownloadService;
    }

    @Override // com.p2082ss.android.ugc.aweme.IDuetDownloadService
    /* renamed from: a */
    public final void mo57215a(String str, Activity activity, String str2, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(map, "");
        C71924b bVar = new C71924b();
        bVar.f161169b = map;
        bVar.mo113571a(str, activity, str2);
    }
}
