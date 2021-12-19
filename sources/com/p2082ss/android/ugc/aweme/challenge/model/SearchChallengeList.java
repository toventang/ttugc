package com.p2082ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.SearchChallengeList */
public class SearchChallengeList extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "keyword_disabled")
    public boolean isDisabled;
    @AbstractC27891c(mo46611a = "is_match")
    public boolean isMatch;
    @AbstractC27891c(mo46611a = "challenge_list")
    public List<SearchChallenge> items;
    public String keyword;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;

    static {
        Covode.recordClassIndex(42747);
    }
}
