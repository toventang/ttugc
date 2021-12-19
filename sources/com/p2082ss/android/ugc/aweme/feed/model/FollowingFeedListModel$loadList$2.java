package com.p2082ss.android.ugc.aweme.feed.model;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel$loadList$2 */
public final class FollowingFeedListModel$loadList$2<T> implements AbstractC88433f {
    final /* synthetic */ FollowingFeedListModel this$0;

    static {
        Covode.recordClassIndex(58693);
    }

    FollowingFeedListModel$loadList$2(FollowingFeedListModel followingFeedListModel) {
        this.this$0 = followingFeedListModel;
    }

    public final void accept(Throwable th) {
        Message obtainMessage = this.this$0.mHandler.obtainMessage(0);
        C89219l.m154716b(obtainMessage, "");
        obtainMessage.obj = new RuntimeException(th);
        this.this$0.mHandler.sendMessage(obtainMessage);
    }
}
