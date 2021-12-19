package com.p2082ss.android.ugc.aweme.discover.p2767c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.c.f */
public interface AbstractC41905f {
    static {
        Covode.recordClassIndex(49831);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.c.f$a */
    public static final class C41906a {
        static {
            Covode.recordClassIndex(49832);
        }

        /* renamed from: a */
        public static SearchApiResult m83950a(SearchApiResult searchApiResult) {
            String imprId;
            String str = "";
            C89219l.m154721d(searchApiResult, str);
            if (TextUtils.isEmpty(searchApiResult.getRequestId())) {
                LogPbBean logPbBean = searchApiResult.logPb;
                if (!(logPbBean == null || (imprId = logPbBean.getImprId()) == null)) {
                    str = imprId;
                }
                searchApiResult.setRequestId(str);
            }
            C48027ac.C48028a.f111257a.mo80056a(searchApiResult.getRequestId(), searchApiResult.logPb);
            QueryCorrectInfo queryCorrectInfo = searchApiResult.queryCorrectInfo;
            if (queryCorrectInfo != null) {
                queryCorrectInfo.setRequestId(searchApiResult.getRequestId());
            }
            return searchApiResult;
        }
    }
}
