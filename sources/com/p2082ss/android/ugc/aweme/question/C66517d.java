package com.p2082ss.android.ugc.aweme.question;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.question.d */
public final class C66517d implements Serializable {
    @AbstractC27891c(mo46611a = "inviter_list")

    /* renamed from: a */
    private final List<User> f149563a;
    @AbstractC27891c(mo46611a = "total_inviter_count")

    /* renamed from: b */
    private final Integer f149564b;

    static {
        Covode.recordClassIndex(78060);
    }

    public C66517d() {
        this(null, null, 3, null);
    }

    public final List<User> getInviterList() {
        return this.f149563a;
    }

    public final Integer getTotalInviterCount() {
        return this.f149564b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public C66517d(List<? extends User> list, Integer num) {
        this.f149563a = list;
        this.f149564b = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C66517d(List list, Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
