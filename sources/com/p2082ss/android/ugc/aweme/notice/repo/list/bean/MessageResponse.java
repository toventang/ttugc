package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse */
public final class MessageResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "messages")
    private final MessageItem item;
    @AbstractC27891c(mo46611a = "log_pb")
    private final LogPbBean mLogPbBean;

    static {
        Covode.recordClassIndex(72340);
    }

    public MessageResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MessageResponse copy$default(MessageResponse messageResponse, MessageItem messageItem, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            messageItem = messageResponse.item;
        }
        if ((i & 2) != 0) {
            logPbBean = messageResponse.mLogPbBean;
        }
        return messageResponse.copy(messageItem, logPbBean);
    }

    public final MessageItem component1() {
        return this.item;
    }

    public final LogPbBean component2() {
        return this.mLogPbBean;
    }

    public final MessageResponse copy(MessageItem messageItem, LogPbBean logPbBean) {
        return new MessageResponse(messageItem, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageResponse)) {
            return false;
        }
        MessageResponse messageResponse = (MessageResponse) obj;
        return C89219l.m154714a(this.item, messageResponse.item) && C89219l.m154714a(this.mLogPbBean, messageResponse.mLogPbBean);
    }

    public final int hashCode() {
        MessageItem messageItem = this.item;
        int i = 0;
        int hashCode = (messageItem != null ? messageItem.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.mLogPbBean;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MessageResponse(item=" + this.item + ", mLogPbBean=" + this.mLogPbBean + ")";
    }

    public final MessageItem getItem() {
        return this.item;
    }

    public final LogPbBean getMLogPbBean() {
        return this.mLogPbBean;
    }

    public MessageResponse(MessageItem messageItem, LogPbBean logPbBean) {
        this.item = messageItem;
        this.mLogPbBean = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageResponse(MessageItem messageItem, LogPbBean logPbBean, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : messageItem, (i & 2) != 0 ? null : logPbBean);
    }
}
