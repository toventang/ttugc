package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem */
public final class MessageItem {
    @AbstractC27891c(mo46611a = "notice")
    private final NoticeItems notices;

    static {
        Covode.recordClassIndex(72339);
    }

    public static /* synthetic */ MessageItem copy$default(MessageItem messageItem, NoticeItems noticeItems, int i, Object obj) {
        if ((i & 1) != 0) {
            noticeItems = messageItem.notices;
        }
        return messageItem.copy(noticeItems);
    }

    public final NoticeItems component1() {
        return this.notices;
    }

    public final MessageItem copy(NoticeItems noticeItems) {
        return new MessageItem(noticeItems);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MessageItem) && C89219l.m154714a(this.notices, ((MessageItem) obj).notices);
        }
        return true;
    }

    public final int hashCode() {
        NoticeItems noticeItems = this.notices;
        if (noticeItems != null) {
            return noticeItems.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MessageItem(notices=" + this.notices + ")";
    }

    public final NoticeItems getNotices() {
        return this.notices;
    }

    public MessageItem(NoticeItems noticeItems) {
        this.notices = noticeItems;
    }
}
