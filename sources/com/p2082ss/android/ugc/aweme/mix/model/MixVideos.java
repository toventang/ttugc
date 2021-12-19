package com.p2082ss.android.ugc.aweme.mix.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mix.model.MixVideos */
public class MixVideos implements Serializable {
    @AbstractC27891c(mo46611a = "has_more")
    public int hasMore;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "max_cursor")
    public long maxCursor;
    @AbstractC27891c(mo46611a = "min_cursor")
    public long minCursor;
    @AbstractC27891c(mo46611a = "status_code")
    public int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    public String statusMsg;
    @AbstractC27891c(mo46611a = "videos")
    public List<Aweme> videos;

    static {
        Covode.recordClassIndex(70270);
    }
}
