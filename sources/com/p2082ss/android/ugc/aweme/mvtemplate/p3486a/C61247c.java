package com.p2082ss.android.ugc.aweme.mvtemplate.p3486a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.a.c */
public final class C61247c extends BaseResponse implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "aweme_list")

    /* renamed from: a */
    public ArrayList<Aweme> f139071a;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public long f139072b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public Boolean f139073c;
    @AbstractC27891c(mo46611a = "rid")

    /* renamed from: d */
    public String f139074d;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: e */
    public LogPbBean f139075e;

    static {
        Covode.recordClassIndex(71860);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final String getRequestId() {
        return this.f139074d;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final void setRequestId(String str) {
        this.f139074d = str;
    }
}
