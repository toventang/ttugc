package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BottomBanner */
public final class BottomBanner implements Serializable {
    @AbstractC27891c(mo46611a = "recommend_text")
    private String recommendText;
    @AbstractC27891c(mo46611a = "show_button_color_seconds")
    private int showButtonColorSeconds;
    @AbstractC27891c(mo46611a = "version")
    private int version;

    static {
        Covode.recordClassIndex(58657);
    }

    public BottomBanner() {
        this(0, 0, null, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_BottomBanner_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93168xe382bc2f(int i) {
        return i;
    }

    public static /* synthetic */ BottomBanner copy$default(BottomBanner bottomBanner, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bottomBanner.showButtonColorSeconds;
        }
        if ((i3 & 2) != 0) {
            i2 = bottomBanner.version;
        }
        if ((i3 & 4) != 0) {
            str = bottomBanner.recommendText;
        }
        return bottomBanner.copy(i, i2, str);
    }

    public final int component1() {
        return this.showButtonColorSeconds;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.recommendText;
    }

    public final BottomBanner copy(int i, int i2, String str) {
        C89219l.m154721d(str, "");
        return new BottomBanner(i, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBanner)) {
            return false;
        }
        BottomBanner bottomBanner = (BottomBanner) obj;
        return this.showButtonColorSeconds == bottomBanner.showButtonColorSeconds && this.version == bottomBanner.version && C89219l.m154714a(this.recommendText, bottomBanner.recommendText);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_BottomBanner_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m93168xe382bc2f(this.showButtonColorSeconds) * 31) + m93168xe382bc2f(this.version)) * 31;
        String str = this.recommendText;
        return com_ss_android_ugc_aweme_feed_model_BottomBanner_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BottomBanner(showButtonColorSeconds=" + this.showButtonColorSeconds + ", version=" + this.version + ", recommendText=" + this.recommendText + ")";
    }

    public final String getRecommendText() {
        return this.recommendText;
    }

    public final int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setShowButtonColorSeconds(int i) {
        this.showButtonColorSeconds = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setRecommendText(String str) {
        C89219l.m154721d(str, "");
        this.recommendText = str;
    }

    public BottomBanner(int i, int i2, String str) {
        C89219l.m154721d(str, "");
        this.showButtonColorSeconds = i;
        this.version = i2;
        this.recommendText = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomBanner(int i, int i2, String str, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 2 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
