package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33632h;
import com.p2082ss.android.ugc.aweme.app.api.C33633i;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchApiResult */
public class SearchApiResult extends BaseResponse implements AbstractC33623d, AbstractC33631g {
    @AbstractC27891c(mo46611a = "header")
    public C42345d dynamicHeader;
    @AbstractC27891c(mo46611a = "mask_layer")
    public C42345d dynamicMask;
    @AbstractC27891c(mo46611a = "global_doodle_config")
    public GlobalDoodleConfig globalDoodleConfig;
    @AbstractC27891c(mo46611a = "guide_search_words")
    public List<GuideSearchWord> guideSearchWordList;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "query_correct_info")
    public QueryCorrectInfo queryCorrectInfo;
    String requestId = "";
    C14612a requestInfo;
    @AbstractC27891c(mo46611a = "search_nil_info")
    public SearchNilInfo searchNilInfo;
    @AbstractC27891c(mo46611a = "search_nil_text")
    public SearchNilText searchNilText;
    @AbstractC27891c(mo46611a = "suicide_prevent")
    public SearchPreventSuicide suicidePrevent;

    static {
        Covode.recordClassIndex(50475);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public C33633i getRequestLog() {
        return AbstractC33632h.m68862a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.requestId;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public C14612a getRequestInfo() {
        return this.requestInfo;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public void setRequestInfo(C14612a aVar) {
        this.requestInfo = aVar;
    }
}
