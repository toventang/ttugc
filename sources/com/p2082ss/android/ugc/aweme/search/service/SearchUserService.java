package com.p2082ss.android.ugc.aweme.search.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.discover.api.SearchSugApi;
import com.p2082ss.android.ugc.aweme.discover.helper.C41988ah;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.search.p3684b.C67348a;
import java.util.List;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.service.SearchUserService */
public final class SearchUserService implements ISearchUserService {
    static {
        Covode.recordClassIndex(79372);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.service.ISearchUserService
    /* renamed from: a */
    public final boolean mo106817a() {
        return C67348a.m119400a();
    }

    /* renamed from: b */
    public static ISearchUserService m119898b() {
        MethodCollector.m26663i(8027);
        Object a = C81908b.m141854a(ISearchUserService.class, false);
        if (a != null) {
            ISearchUserService iSearchUserService = (ISearchUserService) a;
            MethodCollector.m26664o(8027);
            return iSearchUserService;
        }
        if (C81908b.f183336dg == null) {
            synchronized (ISearchUserService.class) {
                try {
                    if (C81908b.f183336dg == null) {
                        C81908b.f183336dg = new SearchUserService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8027);
                    throw th;
                }
            }
        }
        SearchUserService searchUserService = (SearchUserService) C81908b.f183336dg;
        MethodCollector.m26664o(8027);
        return searchUserService;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.service.ISearchUserService
    /* renamed from: a */
    public final C1731i<C67683h> mo106814a(C67681g gVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(gVar, "");
        List<String> list = gVar.f151687f;
        if (list != null) {
            Integer.valueOf(list.size());
        }
        return SearchSugApi.m83829a().fetchUserSugAsync(gVar.f151682a, gVar.f151683b, gVar.f151684c, gVar.f151685d, gVar.f151686e, SearchSugApi.m83830a(gVar.f151687f));
    }

    @Override // com.p2082ss.android.ugc.aweme.search.service.ISearchUserService
    /* renamed from: b */
    public final C67683h mo106818b(C67681g gVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(gVar, "");
        List<String> list = gVar.f151687f;
        if (list != null) {
            Integer.valueOf(list.size());
        }
        T t = SearchSugApi.m83829a().fetchUserSug(gVar.f151682a, gVar.f151683b, gVar.f151684c, gVar.f151685d, gVar.f151686e, SearchSugApi.m83830a(gVar.f151687f)).execute().f52262b;
        C89219l.m154716b(t, "");
        return t;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.service.ISearchUserService
    /* renamed from: a */
    public final String mo106815a(Context context, Integer num) {
        return C41988ah.m84049a(context, num);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.service.ISearchUserService
    /* renamed from: a */
    public final String mo106816a(Context context, String str) {
        return C41988ah.m84050a(context, str);
    }
}
