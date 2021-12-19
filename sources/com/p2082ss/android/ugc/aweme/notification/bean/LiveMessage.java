package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.LiveMessage */
public final class LiveMessage {
    @AbstractC27891c(mo46611a = "live_message")
    public final List<CombineLiveNotice> liveNotice;

    static {
        Covode.recordClassIndex(72608);
    }

    public LiveMessage() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notification.bean.LiveMessage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveMessage copy$default(LiveMessage liveMessage, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = liveMessage.liveNotice;
        }
        return liveMessage.copy(list);
    }

    public final LiveMessage copy(List<CombineLiveNotice> list) {
        return new LiveMessage(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveMessage) && C89219l.m154714a(this.liveNotice, ((LiveMessage) obj).liveNotice);
        }
        return true;
    }

    public final int hashCode() {
        List<CombineLiveNotice> list = this.liveNotice;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LiveMessage(liveNotice=" + this.liveNotice + ")";
    }

    public LiveMessage(List<CombineLiveNotice> list) {
        this.liveNotice = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveMessage(List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list);
    }
}
