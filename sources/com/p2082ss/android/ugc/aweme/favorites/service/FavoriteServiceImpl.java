package com.p2082ss.android.ugc.aweme.favorites.service;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.favorites.api.C47196f;
import com.p2082ss.android.ugc.aweme.favorites.api.VideoCollectionApi;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47697g;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47804f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89386u;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl */
public final class FavoriteServiceImpl implements IFavoriteService {
    static {
        Covode.recordClassIndex(56107);
    }

    /* renamed from: a */
    public static IFavoriteService m90551a() {
        MethodCollector.m26663i(7980);
        Object a = C81908b.m141854a(IFavoriteService.class, false);
        if (a != null) {
            IFavoriteService iFavoriteService = (IFavoriteService) a;
            MethodCollector.m26664o(7980);
            return iFavoriteService;
        }
        if (C81908b.f183233bj == null) {
            synchronized (IFavoriteService.class) {
                try {
                    if (C81908b.f183233bj == null) {
                        C81908b.f183233bj = new FavoriteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7980);
                    throw th;
                }
            }
        }
        FavoriteServiceImpl favoriteServiceImpl = (FavoriteServiceImpl) C81908b.f183233bj;
        MethodCollector.m26664o(7980);
        return favoriteServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.service.IFavoriteService
    /* renamed from: a */
    public final void mo79762a(String str) {
        C89219l.m154721d(str, "");
        C47804f.m90817a("COLLECTION_CONTENT", new C47196f(3, null, null, null, null, null, null, null, 254));
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.service.IFavoriteService
    /* renamed from: a */
    public final C89386u<List<Aweme>, Boolean, Long> mo79760a(String str, long j) {
        int i;
        Object obj;
        boolean z;
        Long l;
        Boolean bool;
        C89219l.m154721d(str, "");
        VideoCollectionApi a = VideoCollectionApi.C47188a.m90370a();
        long j2 = 0;
        if (j == 0) {
            i = 1;
        } else {
            i = 2;
        }
        T t = a.syncCollectionContent(str, j, 30, i).execute().f52262b;
        if (t == null || (obj = t.f109839a) == null) {
            obj = C89086z.INSTANCE;
        }
        if (t == null || (bool = t.f109841c) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!(t == null || (l = t.f109840b) == null)) {
            j2 = l.longValue();
        }
        return new C89386u<>(obj, valueOf, Long.valueOf(j2));
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.service.IFavoriteService
    /* renamed from: a */
    public final void mo79761a(ActivityC0945e eVar, String str, String str2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Window window = eVar.getWindow();
        C89219l.m154716b(window, "");
        View decorView = window.getDecorView();
        C89219l.m154716b(decorView, "");
        Window window2 = eVar.getWindow();
        C89219l.m154716b(window2, "");
        View findViewById = window2.getDecorView().findViewById(R.id.fgn);
        if (findViewById != null) {
            Rect rect = new Rect();
            decorView.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            findViewById.getGlobalVisibleRect(rect2);
            C47697g gVar = new C47697g(eVar, str, str2);
            int i = rect.bottom - rect2.bottom;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            gVar.showAtLocation(decorView, 80, 0, i + C89241a.m154730a(TypedValue.applyDimension(1, 60.0f, system.getDisplayMetrics())));
        }
    }
}
