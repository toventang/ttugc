package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.FeedFirstTag */
public final class FeedFirstTag implements Serializable {
    @AbstractC27891c(mo46611a = "content")
    private String content;
    @AbstractC27891c(mo46611a = "icon")
    private UrlModel icon;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private long f114482id;
    @AbstractC27891c(mo46611a = "style")
    private int style;

    static {
        Covode.recordClassIndex(58791);
    }

    public FeedFirstTag() {
        this(0, 0, null, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93187x7e051af3(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93188x7e051af3(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ FeedFirstTag copy$default(FeedFirstTag feedFirstTag, long j, int i, String str, UrlModel urlModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = feedFirstTag.f114482id;
        }
        if ((i2 & 2) != 0) {
            i = feedFirstTag.style;
        }
        if ((i2 & 4) != 0) {
            str = feedFirstTag.content;
        }
        if ((i2 & 8) != 0) {
            urlModel = feedFirstTag.icon;
        }
        return feedFirstTag.copy(j, i, str, urlModel);
    }

    public final long component1() {
        return this.f114482id;
    }

    public final int component2() {
        return this.style;
    }

    public final String component3() {
        return this.content;
    }

    public final UrlModel component4() {
        return this.icon;
    }

    public final FeedFirstTag copy(long j, int i, String str, UrlModel urlModel) {
        C89219l.m154721d(str, "");
        return new FeedFirstTag(j, i, str, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedFirstTag)) {
            return false;
        }
        FeedFirstTag feedFirstTag = (FeedFirstTag) obj;
        return this.f114482id == feedFirstTag.f114482id && this.style == feedFirstTag.style && C89219l.m154714a(this.content, feedFirstTag.content) && C89219l.m154714a(this.icon, feedFirstTag.icon);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m93188x7e051af3(this.f114482id) * 31) + m93187x7e051af3(this.style)) * 31;
        String str = this.content;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        UrlModel urlModel = this.icon;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FeedFirstTag(id=" + this.f114482id + ", style=" + this.style + ", content=" + this.content + ", icon=" + this.icon + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.f114482id;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(long j) {
        this.f114482id = j;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final void setContent(String str) {
        C89219l.m154721d(str, "");
        this.content = str;
    }

    public FeedFirstTag(long j, int i, String str, UrlModel urlModel) {
        C89219l.m154721d(str, "");
        this.f114482id = j;
        this.style = i;
        this.content = str;
        this.icon = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedFirstTag(long j, int i, String str, UrlModel urlModel, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? -1 : j, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? null : urlModel);
    }
}
