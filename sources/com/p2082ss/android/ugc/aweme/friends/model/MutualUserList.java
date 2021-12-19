package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.MutualUserList */
public final class MutualUserList extends BaseResponse {
    @AbstractC27891c(mo46611a = "next_cursor")
    public final int cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public final boolean hasMore;
    @AbstractC27891c(mo46611a = "log_pb")
    public final LogPbBean logPb;
    @AbstractC27891c(mo46611a = "total")
    public final int total;
    @AbstractC27891c(mo46611a = "user_list")
    public final List<User> userList;

    static {
        Covode.recordClassIndex(60908);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public MutualUserList(int i, int i2, boolean z, List<? extends User> list, LogPbBean logPbBean) {
        C89219l.m154721d(logPbBean, "");
        this.cursor = i;
        this.total = i2;
        this.hasMore = z;
        this.userList = list;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutualUserList(int i, int i2, boolean z, List list, LogPbBean logPbBean, int i3, C89214g gVar) {
        this(i, (i3 & 2) != 0 ? 0 : i2, z, list, logPbBean);
    }
}
