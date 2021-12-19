package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.d */
public final class C61869d extends MusNotice {

    /* renamed from: a */
    public final int f140454a;

    /* renamed from: b */
    public final List<User> f140455b;

    static {
        Covode.recordClassIndex(72618);
    }

    public final String toString() {
        return "FollowRequestNotice(followRequestTotal=" + this.f140454a + ", followRequestList=" + this.f140455b + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), Integer.valueOf(this.f140454a), this.f140455b);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61869d)) {
            return false;
        }
        C61869d dVar = (C61869d) obj;
        if (this.type == dVar.type && this.f140454a == dVar.f140454a && Objects.equals(this.f140455b, dVar.f140455b)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public C61869d(int i, List<? extends User> list) {
        super(true);
        this.f140454a = i;
        this.f140455b = list;
        ((MusNotice) this).type = 13;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        ((MusNotice) this).hasRead = true;
    }
}
