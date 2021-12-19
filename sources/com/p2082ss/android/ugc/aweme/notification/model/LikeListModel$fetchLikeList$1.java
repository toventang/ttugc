package com.p2082ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56386j;
import com.p2082ss.android.ugc.aweme.notification.bean.C61870e;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.notification.model.LikeListModel$fetchLikeList$1 */
public final class LikeListModel$fetchLikeList$1<TTaskResult, TContinuationResult> implements AbstractC1729g {
    final /* synthetic */ LikeListModel this$0;

    static {
        Covode.recordClassIndex(72967);
    }

    LikeListModel$fetchLikeList$1(LikeListModel likeListModel) {
        this.this$0 = likeListModel;
    }

    @Override // p077b.AbstractC1729g
    public final void then(C1731i<C61870e> iVar) {
        C89219l.m154716b(iVar, "");
        C56386j.m102361a(iVar.mo5545d());
        if (!iVar.mo5544c()) {
            this.this$0.handleData(iVar.mo5545d());
            if (this.this$0.mNotifyListeners != null) {
                for (AbstractC39159o oVar : this.this$0.mNotifyListeners) {
                    oVar.mo57528c();
                }
            }
        } else if (this.this$0.mNotifyListeners != null) {
            for (AbstractC39159o oVar2 : this.this$0.mNotifyListeners) {
                oVar2.mo57526a_(iVar.mo5546e());
            }
        }
    }
}
