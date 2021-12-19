package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchChallengeList */
public class SearchChallengeList extends SearchApiResult {
    @AbstractC27891c(mo46611a = "challenge_list")
    public List<SearchChallenge> challengeList;
    @AbstractC27891c(mo46611a = "cursor", mo46612b = {"min_cursor"})
    public int cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "is_match")
    public boolean isMatch;

    static {
        Covode.recordClassIndex(50477);
    }
}
