package com.p2082ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.model.h */
public final class C67683h {
    @AbstractC27891c(mo46611a = "sug_list")

    /* renamed from: a */
    public List<? extends C67679e> f151688a;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: b */
    public LogPbBean f151689b;
    @AbstractC27891c(mo46611a = "rid")

    /* renamed from: c */
    public String f151690c;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: d */
    public Integer f151691d;

    static {
        Covode.recordClassIndex(79328);
    }

    /* renamed from: a */
    public final boolean mo106753a() {
        Integer num = this.f151691d;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }
}
