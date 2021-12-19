package com.p2082ss.android.ugc.aweme.notification.p3535vm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.a */
public final class C62380a {

    /* renamed from: a */
    public RecommendList f141557a;

    /* renamed from: b */
    public List<? extends Friend> f141558b;

    static {
        Covode.recordClassIndex(73170);
    }

    public C62380a() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62380a)) {
            return false;
        }
        C62380a aVar = (C62380a) obj;
        return C89219l.m154714a(this.f141557a, aVar.f141557a) && C89219l.m154714a(this.f141558b, aVar.f141558b);
    }

    public final int hashCode() {
        RecommendList recommendList = this.f141557a;
        int i = 0;
        int hashCode = (recommendList != null ? recommendList.hashCode() : 0) * 31;
        List<? extends Friend> list = this.f141558b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        Integer num;
        Integer num2;
        List<User> userList;
        List<User> inviterList;
        StringBuilder sb = new StringBuilder("BottomCombineResponse{recommends:{");
        RecommendList recommendList = this.f141557a;
        Integer num3 = null;
        if (recommendList == null || (inviterList = recommendList.getInviterList()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(inviterList.size());
        }
        StringBuilder append = sb.append(num).append(", ");
        RecommendList recommendList2 = this.f141557a;
        if (recommendList2 == null || (userList = recommendList2.getUserList()) == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(userList.size());
        }
        StringBuilder append2 = append.append(num2).append("},contacts:");
        List<? extends Friend> list = this.f141558b;
        if (list != null) {
            num3 = Integer.valueOf(list.size());
        }
        return append2.append(num3).append("}").toString();
    }

    public C62380a(RecommendList recommendList, List<? extends Friend> list) {
        this.f141557a = recommendList;
        this.f141558b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62380a(RecommendList recommendList, List list, int i) {
        this((i & 1) != 0 ? null : recommendList, (i & 2) != 0 ? null : list);
    }
}
