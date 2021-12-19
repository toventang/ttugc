package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.feed.api.l */
public final class C48338l implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private final int f112017a;
    @AbstractC27891c(mo46611a = "user_list")

    /* renamed from: b */
    private final List<C48337k> f112018b;
    @AbstractC27891c(mo46611a = "video_num")

    /* renamed from: c */
    private final int f112019c;
    @AbstractC27891c(mo46611a = "first_vid")

    /* renamed from: d */
    private final long f112020d;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: e */
    private final LogPbBean f112021e;

    static {
        Covode.recordClassIndex(57110);
    }

    public C48338l() {
        this(0, null, 0, 0, null, 31, null);
    }

    public final int getCode() {
        return this.f112017a;
    }

    public final long getFirstVid() {
        return this.f112020d;
    }

    public final List<C48337k> getFollowingInterestUsers() {
        return this.f112018b;
    }

    public final LogPbBean getLogPbBean() {
        return this.f112021e;
    }

    public final int getVideoNum() {
        return this.f112019c;
    }

    public C48338l(int i, List<C48337k> list, int i2, long j, LogPbBean logPbBean) {
        this.f112017a = i;
        this.f112018b = list;
        this.f112019c = i2;
        this.f112020d = j;
        this.f112021e = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C48338l(int i, List list, int i2, long j, LogPbBean logPbBean, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? new ArrayList() : list, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? 0 : j, (i3 & 16) != 0 ? null : logPbBean);
    }
}
