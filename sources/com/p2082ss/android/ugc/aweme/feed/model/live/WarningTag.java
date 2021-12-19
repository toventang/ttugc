package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.WarningTag */
public final class WarningTag implements Serializable {
    @AbstractC27891c(mo46611a = "duration")
    private long duration;
    @AbstractC27891c(mo46611a = "tag_source")
    private int tagSource;
    @AbstractC27891c(mo46611a = "text")
    private Text text;

    static {
        Covode.recordClassIndex(58819);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_live_WarningTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93192x403ea989(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_live_WarningTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93193x403ea989(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ WarningTag copy$default(WarningTag warningTag, Text text2, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            text2 = warningTag.text;
        }
        if ((i2 & 2) != 0) {
            j = warningTag.duration;
        }
        if ((i2 & 4) != 0) {
            i = warningTag.tagSource;
        }
        return warningTag.copy(text2, j, i);
    }

    public final Text component1() {
        return this.text;
    }

    public final long component2() {
        return this.duration;
    }

    public final int component3() {
        return this.tagSource;
    }

    public final WarningTag copy(Text text2, long j, int i) {
        C89219l.m154721d(text2, "");
        return new WarningTag(text2, j, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningTag)) {
            return false;
        }
        WarningTag warningTag = (WarningTag) obj;
        return C89219l.m154714a(this.text, warningTag.text) && this.duration == warningTag.duration && this.tagSource == warningTag.tagSource;
    }

    public final int hashCode() {
        Text text2 = this.text;
        return ((((text2 != null ? text2.hashCode() : 0) * 31) + m93193x403ea989(this.duration)) * 31) + m93192x403ea989(this.tagSource);
    }

    public final String toString() {
        return "WarningTag(text=" + this.text + ", duration=" + this.duration + ", tagSource=" + this.tagSource + ")";
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getTagSource() {
        return this.tagSource;
    }

    public final Text getText() {
        return this.text;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setTagSource(int i) {
        this.tagSource = i;
    }

    public final void setText(Text text2) {
        C89219l.m154721d(text2, "");
        this.text = text2;
    }

    public WarningTag(Text text2, long j, int i) {
        C89219l.m154721d(text2, "");
        this.text = text2;
        this.duration = j;
        this.tagSource = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WarningTag(Text text2, long j, int i, int i2, C89214g gVar) {
        this(text2, (i2 & 2) != 0 ? -1 : j, (i2 & 4) != 0 ? 0 : i);
    }
}
