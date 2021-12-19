package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo */
public final class NativeAuthorInfo implements Serializable {
    @AbstractC27891c(mo46611a = "auto_pull_up")
    private int autoPullStyle;
    @AbstractC27891c(mo46611a = "bottom_banner")
    private BottomBanner bottomBanner;

    static {
        Covode.recordClassIndex(58730);
    }

    public NativeAuthorInfo() {
        this(null, 0, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_NativeAuthorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93183xcaa7cc48(int i) {
        return i;
    }

    public static /* synthetic */ NativeAuthorInfo copy$default(NativeAuthorInfo nativeAuthorInfo, BottomBanner bottomBanner2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bottomBanner2 = nativeAuthorInfo.bottomBanner;
        }
        if ((i2 & 2) != 0) {
            i = nativeAuthorInfo.autoPullStyle;
        }
        return nativeAuthorInfo.copy(bottomBanner2, i);
    }

    public final BottomBanner component1() {
        return this.bottomBanner;
    }

    public final int component2() {
        return this.autoPullStyle;
    }

    public final NativeAuthorInfo copy(BottomBanner bottomBanner2, int i) {
        return new NativeAuthorInfo(bottomBanner2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAuthorInfo)) {
            return false;
        }
        NativeAuthorInfo nativeAuthorInfo = (NativeAuthorInfo) obj;
        return C89219l.m154714a(this.bottomBanner, nativeAuthorInfo.bottomBanner) && this.autoPullStyle == nativeAuthorInfo.autoPullStyle;
    }

    public final int hashCode() {
        BottomBanner bottomBanner2 = this.bottomBanner;
        return ((bottomBanner2 != null ? bottomBanner2.hashCode() : 0) * 31) + m93183xcaa7cc48(this.autoPullStyle);
    }

    public final String toString() {
        return "NativeAuthorInfo(bottomBanner=" + this.bottomBanner + ", autoPullStyle=" + this.autoPullStyle + ")";
    }

    public final int getAutoPullStyle() {
        return this.autoPullStyle;
    }

    public final BottomBanner getBottomBanner() {
        return this.bottomBanner;
    }

    public final void setAutoPullStyle(int i) {
        this.autoPullStyle = i;
    }

    public final void setBottomBanner(BottomBanner bottomBanner2) {
        this.bottomBanner = bottomBanner2;
    }

    public NativeAuthorInfo(BottomBanner bottomBanner2, int i) {
        this.bottomBanner = bottomBanner2;
        this.autoPullStyle = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NativeAuthorInfo(BottomBanner bottomBanner2, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : bottomBanner2, (i2 & 2) != 0 ? 0 : i);
    }
}
