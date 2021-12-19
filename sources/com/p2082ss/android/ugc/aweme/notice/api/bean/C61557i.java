package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.i */
public final class C61557i implements AbstractC81914b {

    /* renamed from: a */
    public final int f139726a;

    /* renamed from: b */
    public final int f139727b;

    /* renamed from: c */
    public final List<User> f139728c;

    static {
        Covode.recordClassIndex(72232);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61557i)) {
            return false;
        }
        C61557i iVar = (C61557i) obj;
        return this.f139726a == iVar.f139726a && this.f139727b == iVar.f139727b && C89219l.m154714a(this.f139728c, iVar.f139728c);
    }

    public final int hashCode() {
        int i = ((this.f139726a * 31) + this.f139727b) * 31;
        List<User> list = this.f139728c;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NoticeFollowingTabInfo(group=" + this.f139726a + ", level=" + this.f139727b + ", followeeInfo=" + this.f139728c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public C61557i(int i, int i2, List<? extends User> list) {
        this.f139726a = i;
        this.f139727b = i2;
        this.f139728c = list;
    }
}
