package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.api.k */
public final class C48337k implements Serializable {

    /* renamed from: a */
    private transient SlimRoom f112013a;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: b */
    private final User f112014b;
    @AbstractC27891c(mo46611a = "is_show_blue_point")

    /* renamed from: c */
    private boolean f112015c;

    /* renamed from: d */
    private LogPbBean f112016d;

    static {
        Covode.recordClassIndex(57109);
    }

    public final LogPbBean getLogPbBean() {
        return this.f112016d;
    }

    public final boolean getShowBluePoint() {
        return this.f112015c;
    }

    public final SlimRoom getSlimRoom() {
        return this.f112013a;
    }

    public final User getUser() {
        return this.f112014b;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.f112016d = logPbBean;
    }

    public final void setShowBluePoint(boolean z) {
        this.f112015c = z;
    }

    public final void setSlimRoom(SlimRoom slimRoom) {
        this.f112013a = slimRoom;
    }

    public C48337k(User user, boolean z, LogPbBean logPbBean) {
        C89219l.m154721d(user, "");
        this.f112014b = user;
        this.f112015c = z;
        this.f112016d = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C48337k(User user, boolean z, LogPbBean logPbBean, int i, C89214g gVar) {
        this(user, z, (i & 4) != 0 ? null : logPbBean);
    }
}
