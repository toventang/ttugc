package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33632h;
import com.p2082ss.android.ugc.aweme.app.api.C33633i;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42110p;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchSugResponse */
public class SearchSugResponse extends BaseResponse implements AbstractC33631g {
    public transient String keyword;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "words_query_record")
    public RecommendWordMob recommendWordMob;
    @AbstractC27891c(mo46611a = "rid")
    public String requestId = "";
    C14612a requestInfo;
    public transient String requestSource;
    public transient C42110p.C42114a requestTaskWrapper;
    @AbstractC27891c(mo46611a = "sug_list")
    public List<C67679e> sugList;

    static {
        Covode.recordClassIndex(50523);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public C33633i getRequestLog() {
        return AbstractC33632h.m68862a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public C14612a getRequestInfo() {
        return this.requestInfo;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public void setRequestInfo(C14612a aVar) {
        this.requestInfo = aVar;
    }
}
