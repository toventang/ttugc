package com.p2082ss.android.ugc.aweme.feed.interest.p2950a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.journey.C56846af;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.a.a */
public final class C49702a implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public Integer f114378a = 0;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public String f114379b = "";
    @AbstractC27891c(mo46611a = "interest_list")

    /* renamed from: c */
    public C56846af f114380c;
    @AbstractC27891c(mo46611a = "aweme")

    /* renamed from: d */
    public Aweme f114381d;
    @AbstractC27891c(mo46611a = "is_active_device")

    /* renamed from: e */
    public Integer f114382e = 0;
    @AbstractC27891c(mo46611a = "rid")

    /* renamed from: f */
    public String f114383f = "";
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: g */
    public LogPbBean f114384g;

    static {
        Covode.recordClassIndex(58550);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final String getRequestId() {
        return this.f114383f;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final void setRequestId(String str) {
        this.f114383f = str;
    }
}
