package com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.a */
public final class C36940a {

    /* renamed from: a */
    public final List<IMUser> f86976a;

    /* renamed from: b */
    public final List<IMUser> f86977b;

    /* renamed from: c */
    public final List<IMUser> f86978c;

    /* renamed from: d */
    public final List<IMUser> f86979d;

    static {
        Covode.recordClassIndex(44282);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36940a)) {
            return false;
        }
        C36940a aVar = (C36940a) obj;
        return C89219l.m154714a(this.f86976a, aVar.f86976a) && C89219l.m154714a(this.f86977b, aVar.f86977b) && C89219l.m154714a(this.f86978c, aVar.f86978c) && C89219l.m154714a(this.f86979d, aVar.f86979d);
    }

    public final int hashCode() {
        List<IMUser> list = this.f86976a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<IMUser> list2 = this.f86977b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<IMUser> list3 = this.f86978c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<IMUser> list4 = this.f86979d;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "AllFriends(recentFriends=" + this.f86976a + ", mutualFriends=" + this.f86977b + ", followingFriends=" + this.f86978c + ", allFriendsList=" + this.f86979d + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    public C36940a(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<? extends IMUser> list4) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(list3, "");
        C89219l.m154721d(list4, "");
        this.f86976a = list;
        this.f86977b = list2;
        this.f86978c = list3;
        this.f86979d = list4;
    }
}
