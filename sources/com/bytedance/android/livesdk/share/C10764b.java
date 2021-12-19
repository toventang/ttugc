package com.bytedance.android.livesdk.share;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.share.b */
final /* synthetic */ class C10764b implements AbstractC88433f {

    /* renamed from: a */
    private final LiveShareWidget f25925a;

    static {
        Covode.recordClassIndex(12364);
    }

    C10764b(LiveShareWidget liveShareWidget) {
        this.f25925a = liveShareWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        IMessageManager iMessageManager;
        LiveShareWidget liveShareWidget = this.f25925a;
        ShareReportResult shareReportResult = (ShareReportResult) ((C5832d) obj).data;
        if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && liveShareWidget.f25920b != null && (iMessageManager = (IMessageManager) liveShareWidget.dataChannel.mo28318b(C9068cg.class)) != null) {
            iMessageManager.insertMessage(C7302b.m15206a(liveShareWidget.f25920b.getId(), shareReportResult.getDisplayText(), liveShareWidget.f25921c), true);
        }
    }
}
