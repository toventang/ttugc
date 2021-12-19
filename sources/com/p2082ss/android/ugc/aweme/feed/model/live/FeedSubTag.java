package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.FeedSubTag */
public final class FeedSubTag implements Serializable {
    @AbstractC27891c(mo46611a = "content")
    private String content;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private long f114483id;
    @AbstractC27891c(mo46611a = "style")
    private int style;

    static {
        Covode.recordClassIndex(58793);
    }

    public FeedSubTag() {
        this(0, 0, null, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93189xb952f5a3(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93190xb952f5a3(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ FeedSubTag copy$default(FeedSubTag feedSubTag, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = feedSubTag.f114483id;
        }
        if ((i2 & 2) != 0) {
            i = feedSubTag.style;
        }
        if ((i2 & 4) != 0) {
            str = feedSubTag.content;
        }
        return feedSubTag.copy(j, i, str);
    }

    public final long component1() {
        return this.f114483id;
    }

    public final int component2() {
        return this.style;
    }

    public final String component3() {
        return this.content;
    }

    public final FeedSubTag copy(long j, int i, String str) {
        C89219l.m154721d(str, "");
        return new FeedSubTag(j, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSubTag)) {
            return false;
        }
        FeedSubTag feedSubTag = (FeedSubTag) obj;
        return this.f114483id == feedSubTag.f114483id && this.style == feedSubTag.style && C89219l.m154714a(this.content, feedSubTag.content);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m93190xb952f5a3(this.f114483id) * 31) + m93189xb952f5a3(this.style)) * 31;
        String str = this.content;
        return com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeedSubTag(id=" + this.f114483id + ", style=" + this.style + ", content=" + this.content + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.f114483id;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setId(long j) {
        this.f114483id = j;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final void setContent(String str) {
        C89219l.m154721d(str, "");
        this.content = str;
    }

    public FeedSubTag(long j, int i, String str) {
        C89219l.m154721d(str, "");
        this.f114483id = j;
        this.style = i;
        this.content = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedSubTag(long j, int i, String str, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? -1 : j, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str);
    }
}
