package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$searchKeyWord$2 */
public final class AtFriendsViewModel$searchKeyWord$2<TTaskResult, TContinuationResult> implements AbstractC1729g {
    final /* synthetic */ AtFriendsViewModel this$0;

    static {
        Covode.recordClassIndex(60880);
    }

    AtFriendsViewModel$searchKeyWord$2(AtFriendsViewModel atFriendsViewModel) {
        this.this$0 = atFriendsViewModel;
    }

    @Override // p077b.AbstractC1729g
    public final C1731i<List<IMUser>> then(C1731i<List<IMUser>> iVar) {
        List<IMUser> d;
        C89219l.m154716b(iVar, "");
        if (!iVar.mo5544c() && !iVar.mo5539b() && (d = iVar.mo5545d()) != null) {
            this.this$0.latestSearchUsers.clear();
            this.this$0.latestSearchUsers.addAll(d);
        }
        return iVar;
    }
}
