package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeBubbleInfo */
public final class AwemeBubbleInfo implements Serializable {
    @AbstractC27891c(mo46611a = "biz")
    private final int biz;
    @AbstractC27891c(mo46611a = "log_extra")
    private final String logExtra;
    @AbstractC27891c(mo46611a = "scheme_url")
    private final String schemeUrl;
    @AbstractC27891c(mo46611a = "text")
    private final String text;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(58623);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_AwemeBubbleInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93160x5ddf3939(int i) {
        return i;
    }

    public static /* synthetic */ AwemeBubbleInfo copy$default(AwemeBubbleInfo awemeBubbleInfo, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = awemeBubbleInfo.biz;
        }
        if ((i3 & 2) != 0) {
            i2 = awemeBubbleInfo.type;
        }
        if ((i3 & 4) != 0) {
            str = awemeBubbleInfo.text;
        }
        if ((i3 & 8) != 0) {
            str2 = awemeBubbleInfo.schemeUrl;
        }
        if ((i3 & 16) != 0) {
            str3 = awemeBubbleInfo.logExtra;
        }
        return awemeBubbleInfo.copy(i, i2, str, str2, str3);
    }

    public final int component1() {
        return this.biz;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.schemeUrl;
    }

    public final String component5() {
        return this.logExtra;
    }

    public final AwemeBubbleInfo copy(int i, int i2, String str, String str2, String str3) {
        return new AwemeBubbleInfo(i, i2, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeBubbleInfo)) {
            return false;
        }
        AwemeBubbleInfo awemeBubbleInfo = (AwemeBubbleInfo) obj;
        return this.biz == awemeBubbleInfo.biz && this.type == awemeBubbleInfo.type && C89219l.m154714a(this.text, awemeBubbleInfo.text) && C89219l.m154714a(this.schemeUrl, awemeBubbleInfo.schemeUrl) && C89219l.m154714a(this.logExtra, awemeBubbleInfo.logExtra);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_AwemeBubbleInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m93160x5ddf3939(this.biz) * 31) + m93160x5ddf3939(this.type)) * 31;
        String str = this.text;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_AwemeBubbleInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.schemeUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.logExtra;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AwemeBubbleInfo(biz=" + this.biz + ", type=" + this.type + ", text=" + this.text + ", schemeUrl=" + this.schemeUrl + ", logExtra=" + this.logExtra + ")";
    }

    public final int getBiz() {
        return this.biz;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getSchemeUrl() {
        return this.schemeUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public AwemeBubbleInfo(int i, int i2, String str, String str2, String str3) {
        this.biz = i;
        this.type = i2;
        this.text = str;
        this.schemeUrl = str2;
        this.logExtra = str3;
    }
}
