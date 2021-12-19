package com.p2082ss.android.ugc.aweme.legacy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42454f;
import com.p2082ss.android.ugc.aweme.discover.mob.C42464l;
import com.p2082ss.android.ugc.aweme.discover.mob.C42470r;
import com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.p2082ss.android.ugc.aweme.search.C67446h;

/* renamed from: com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl */
public class SearchResultStatisticsImpl implements ISearchResultStatistics {

    /* renamed from: a */
    private final ISearchResultStatistics f132329a = C67446h.f151111a.mo106213c();

    static {
        Covode.recordClassIndex(68140);
    }

    /* renamed from: a */
    public static ISearchResultStatistics m104992a() {
        MethodCollector.m26663i(6584);
        Object a = C81908b.m141854a(ISearchResultStatistics.class, false);
        if (a != null) {
            ISearchResultStatistics iSearchResultStatistics = (ISearchResultStatistics) a;
            MethodCollector.m26664o(6584);
            return iSearchResultStatistics;
        }
        if (C81908b.f183282cf == null) {
            synchronized (ISearchResultStatistics.class) {
                try {
                    if (C81908b.f183282cf == null) {
                        C81908b.f183282cf = new SearchResultStatisticsImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6584);
                    throw th;
                }
            }
        }
        SearchResultStatisticsImpl searchResultStatisticsImpl = (SearchResultStatisticsImpl) C81908b.f183282cf;
        MethodCollector.m26664o(6584);
        return searchResultStatisticsImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    /* renamed from: a */
    public final void mo71655a(C42454f fVar) {
        this.f132329a.mo71655a(fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    /* renamed from: a */
    public final void mo71656a(C42464l lVar) {
        this.f132329a.mo71656a(lVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    /* renamed from: a */
    public final void mo71657a(C42470r rVar) {
        this.f132329a.mo71657a(rVar);
    }
}
