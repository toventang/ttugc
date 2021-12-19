package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse */
public final class LiveNoticeMessageResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")
    public final LiveMessage liveMessage;

    static {
        Covode.recordClassIndex(72609);
    }

    public LiveNoticeMessageResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ LiveNoticeMessageResponse copy$default(LiveNoticeMessageResponse liveNoticeMessageResponse, LiveMessage liveMessage2, int i, Object obj) {
        if ((i & 1) != 0) {
            liveMessage2 = liveNoticeMessageResponse.liveMessage;
        }
        return liveNoticeMessageResponse.copy(liveMessage2);
    }

    public final LiveNoticeMessageResponse copy(LiveMessage liveMessage2) {
        return new LiveNoticeMessageResponse(liveMessage2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveNoticeMessageResponse) && C89219l.m154714a(this.liveMessage, ((LiveNoticeMessageResponse) obj).liveMessage);
        }
        return true;
    }

    public final int hashCode() {
        LiveMessage liveMessage2 = this.liveMessage;
        if (liveMessage2 != null) {
            return liveMessage2.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "LiveNoticeMessageResponse(liveMessage=" + this.liveMessage + ")";
    }

    public LiveNoticeMessageResponse(LiveMessage liveMessage2) {
        this.liveMessage = liveMessage2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveNoticeMessageResponse(LiveMessage liveMessage2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : liveMessage2);
    }
}
