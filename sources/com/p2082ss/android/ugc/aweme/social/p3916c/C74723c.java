package com.p2082ss.android.ugc.aweme.social.p3916c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.c.c */
public final class C74723c extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "user_list")

    /* renamed from: a */
    private List<? extends User> f167956a;
    @AbstractC27891c(mo46611a = "rid")

    /* renamed from: b */
    private String f167957b;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: c */
    private LogPbBean f167958c;

    static {
        Covode.recordClassIndex(87560);
    }

    public C74723c() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.social.c.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C74723c copy$default(C74723c cVar, List list, String str, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cVar.f167956a;
        }
        if ((i & 2) != 0) {
            str = cVar.f167957b;
        }
        if ((i & 4) != 0) {
            logPbBean = cVar.f167958c;
        }
        return cVar.copy(list, str, logPbBean);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> component1() {
        return this.f167956a;
    }

    public final String component2() {
        return this.f167957b;
    }

    public final LogPbBean component3() {
        return this.f167958c;
    }

    public final C74723c copy(List<? extends User> list, String str, LogPbBean logPbBean) {
        return new C74723c(list, str, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74723c)) {
            return false;
        }
        C74723c cVar = (C74723c) obj;
        return C89219l.m154714a(this.f167956a, cVar.f167956a) && C89219l.m154714a(this.f167957b, cVar.f167957b) && C89219l.m154714a(this.f167958c, cVar.f167958c);
    }

    public final int hashCode() {
        List<? extends User> list = this.f167956a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f167957b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.f167958c;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MAFListResp(userList=" + this.f167956a + ", rid=" + this.f167957b + ", logPb=" + this.f167958c + ")";
    }

    public final LogPbBean getLogPb() {
        return this.f167958c;
    }

    public final String getRid() {
        return this.f167957b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getUserList() {
        return this.f167956a;
    }

    public final List<User> getUserListWithRid() {
        Collection<User> collection = this.f167956a;
        if (collection == null) {
            return null;
        }
        for (User user : collection) {
            LogPbBean logPbBean = this.f167958c;
            user.setRequestId(logPbBean != null ? logPbBean.getImprId() : null);
        }
        return (List) collection;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.f167958c = logPbBean;
    }

    public final void setRid(String str) {
        this.f167957b = str;
    }

    public final void setUserList(List<? extends User> list) {
        this.f167956a = list;
    }

    public C74723c(List<? extends User> list, String str, LogPbBean logPbBean) {
        this.f167956a = list;
        this.f167957b = str;
        this.f167958c = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C74723c(List list, String str, LogPbBean logPbBean, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : logPbBean);
    }
}
