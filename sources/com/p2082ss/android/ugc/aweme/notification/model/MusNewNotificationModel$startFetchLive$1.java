package com.p2082ss.android.ugc.aweme.notification.model;

import android.os.SystemClock;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$startFetchLive$1 */
public final class MusNewNotificationModel$startFetchLive$1<TTaskResult, TContinuationResult> implements AbstractC1729g {
    final /* synthetic */ long $currentTime;
    final /* synthetic */ MusNewNotificationModel this$0;

    static {
        Covode.recordClassIndex(72972);
    }

    MusNewNotificationModel$startFetchLive$1(MusNewNotificationModel musNewNotificationModel, long j) {
        this.this$0 = musNewNotificationModel;
        this.$currentTime = j;
    }

    @Override // p077b.AbstractC1729g
    public final void then(C1731i<LiveNoticeMessageResponse> iVar) {
        C1213t<LiveNoticeMessageResponse> tVar = this.this$0.updateLiveData;
        C89219l.m154716b(iVar, "");
        tVar.postValue(iVar.mo5545d());
        C62259e.m112614a(iVar.mo5545d(), SystemClock.elapsedRealtime() - this.$currentTime);
    }
}
