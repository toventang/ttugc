package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VPAInfo */
public final class VPAInfo implements Serializable {
    @AbstractC27891c(mo46611a = "show_info_bar_type")
    private final int infoBarType;
    @AbstractC27891c(mo46611a = "show_opt_out_button")
    private final boolean showOptOut;

    static {
        Covode.recordClassIndex(58768);
    }

    public VPAInfo() {
        this(false, 0, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_VPAInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93186xc90effed(int i) {
        return i;
    }

    public static /* synthetic */ VPAInfo copy$default(VPAInfo vPAInfo, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = vPAInfo.showOptOut;
        }
        if ((i2 & 2) != 0) {
            i = vPAInfo.infoBarType;
        }
        return vPAInfo.copy(z, i);
    }

    public final boolean component1() {
        return this.showOptOut;
    }

    public final int component2() {
        return this.infoBarType;
    }

    public final VPAInfo copy(boolean z, int i) {
        return new VPAInfo(z, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VPAInfo)) {
            return false;
        }
        VPAInfo vPAInfo = (VPAInfo) obj;
        return this.showOptOut == vPAInfo.showOptOut && this.infoBarType == vPAInfo.infoBarType;
    }

    public final int hashCode() {
        boolean z = this.showOptOut;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (i * 31) + m93186xc90effed(this.infoBarType);
    }

    public final String toString() {
        return "VPAInfo(showOptOut=" + this.showOptOut + ", infoBarType=" + this.infoBarType + ")";
    }

    public final int getInfoBarType() {
        return this.infoBarType;
    }

    public final boolean getShowOptOut() {
        return this.showOptOut;
    }

    public VPAInfo(boolean z, int i) {
        this.showOptOut = z;
        this.infoBarType = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VPAInfo(boolean z, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
