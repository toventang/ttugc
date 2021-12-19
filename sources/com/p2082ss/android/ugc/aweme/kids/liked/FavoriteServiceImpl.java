package com.p2082ss.android.ugc.aweme.kids.liked;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.kids.liked.api.IFavoriteService;
import com.p2082ss.android.ugc.aweme.kids.liked.p3361a.C57722a;

/* renamed from: com.ss.android.ugc.aweme.kids.liked.FavoriteServiceImpl */
public final class FavoriteServiceImpl implements IFavoriteService {
    static {
        Covode.recordClassIndex(67697);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.liked.api.IFavoriteService
    /* renamed from: a */
    public final Fragment mo95042a() {
        return new C57722a();
    }

    /* renamed from: b */
    public static IFavoriteService m104432b() {
        MethodCollector.m26663i(8652);
        Object a = C81908b.m141854a(IFavoriteService.class, false);
        if (a != null) {
            IFavoriteService iFavoriteService = (IFavoriteService) a;
            MethodCollector.m26664o(8652);
            return iFavoriteService;
        }
        if (C81908b.f183216bS == null) {
            synchronized (IFavoriteService.class) {
                try {
                    if (C81908b.f183216bS == null) {
                        C81908b.f183216bS = new FavoriteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8652);
                    throw th;
                }
            }
        }
        FavoriteServiceImpl favoriteServiceImpl = (FavoriteServiceImpl) C81908b.f183216bS;
        MethodCollector.m26664o(8652);
        return favoriteServiceImpl;
    }
}
