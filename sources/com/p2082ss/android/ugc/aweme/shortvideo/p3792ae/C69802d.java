package com.p2082ss.android.ugc.aweme.shortvideo.p3792ae;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.p2082ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69803e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ae.d */
public final class C69802d implements AbstractC27235f<SearchSugChallengeList, AVSearchChallengeList> {
    static {
        Covode.recordClassIndex(82208);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AVSearchChallengeList mo45319a(SearchSugChallengeList searchSugChallengeList) {
        return m123331a(searchSugChallengeList);
    }

    /* renamed from: a */
    public static AVSearchChallengeList m123331a(SearchSugChallengeList searchSugChallengeList) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (searchSugChallengeList == null) {
            return null;
        }
        AVSearchChallengeList aVSearchChallengeList = new AVSearchChallengeList();
        aVSearchChallengeList.items = C69803e.C69804a.m123334a(searchSugChallengeList.items);
        aVSearchChallengeList.keyword = searchSugChallengeList.keyword;
        LogPbBean logPbBean = new LogPbBean();
        LogPbBean logPbBean2 = searchSugChallengeList.logPb;
        if (logPbBean2 != null) {
            str = logPbBean2.getImprId();
        } else {
            str = null;
        }
        logPbBean.setImprId(str);
        aVSearchChallengeList.logPb = logPbBean;
        aVSearchChallengeList.isMatch = searchSugChallengeList.isMatch;
        RecommendWordMob recommendWordMob = new RecommendWordMob();
        com.p2082ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob2 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob2 != null) {
            str2 = recommendWordMob2.getInfo();
        } else {
            str2 = null;
        }
        recommendWordMob.setInfo(str2);
        com.p2082ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob3 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob3 != null) {
            str3 = recommendWordMob3.getWordsSource();
        } else {
            str3 = null;
        }
        recommendWordMob.setWordsSource(str3);
        com.p2082ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob4 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob4 != null) {
            str4 = recommendWordMob4.getQueryId();
        }
        recommendWordMob.setQueryId(str4);
        aVSearchChallengeList.recommendWordMob = recommendWordMob;
        return aVSearchChallengeList;
    }
}
