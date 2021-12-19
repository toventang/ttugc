package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p2082ss.android.ugc.aweme.profile.api.C63429c;

/* renamed from: com.ss.android.ugc.aweme.PreloadApiServiceImpl */
public class PreloadApiServiceImpl implements IPreloadApiService {
    static {
        Covode.recordClassIndex(37972);
    }

    /* renamed from: a */
    public static IPreloadApiService m65398a() {
        MethodCollector.m26663i(5924);
        Object a = C81908b.m141854a(IPreloadApiService.class, false);
        if (a != null) {
            IPreloadApiService iPreloadApiService = (IPreloadApiService) a;
            MethodCollector.m26664o(5924);
            return iPreloadApiService;
        }
        if (C81908b.f183409r == null) {
            synchronized (IPreloadApiService.class) {
                try {
                    if (C81908b.f183409r == null) {
                        C81908b.f183409r = new PreloadApiServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5924);
                    throw th;
                }
            }
        }
        PreloadApiServiceImpl preloadApiServiceImpl = (PreloadApiServiceImpl) C81908b.f183409r;
        MethodCollector.m26664o(5924);
        return preloadApiServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.IPreloadApiService
    /* renamed from: a */
    public final void mo57230a(Aweme aweme, String str) {
        C63429c.m115017a(C63429c.m115022b(null, aweme.getAuthorUid()), str);
    }

    @Override // com.p2082ss.android.ugc.aweme.IPreloadApiService
    /* renamed from: a */
    public final void mo57231a(String str, String str2, String str3) {
        AwemeApi.m115007a(true, str, str2, 0, 0, 20, str3, 0, 0, null, new C29935e());
    }
}
