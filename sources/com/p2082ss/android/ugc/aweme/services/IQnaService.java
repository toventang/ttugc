package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.IQnaService */
public interface IQnaService {
    static {
        Covode.recordClassIndex(79636);
    }

    boolean enablePublicQna();

    void setQuestionAwemeListCacheCache(long j, int i, int i2, List<? extends Aweme> list);
}
