package com.p2082ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeList */
public class ChallengeList extends BaseResponse {
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "is_match")
    public boolean isMatch;
    @AbstractC27891c(mo46611a = "challenge_list")
    public List<Challenge> items;
    @AbstractC27891c(mo46611a = "max_cursor")
    public long maxCursor;
    @AbstractC27891c(mo46611a = "min_cursor")
    public long minCursor;

    static {
        Covode.recordClassIndex(42738);
    }
}
