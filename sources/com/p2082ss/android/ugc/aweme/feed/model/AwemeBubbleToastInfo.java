package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeBubbleToastInfo */
public final class AwemeBubbleToastInfo {
    @AbstractC27891c(mo46611a = "toast_count")
    public final int toastCount;
    @AbstractC27891c(mo46611a = "toast_type")
    public final String toastType;

    static {
        Covode.recordClassIndex(58624);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_AwemeBubbleToastInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93161x5cf9ba7a(int i) {
        return i;
    }

    public static /* synthetic */ AwemeBubbleToastInfo copy$default(AwemeBubbleToastInfo awemeBubbleToastInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = awemeBubbleToastInfo.toastType;
        }
        if ((i2 & 2) != 0) {
            i = awemeBubbleToastInfo.toastCount;
        }
        return awemeBubbleToastInfo.copy(str, i);
    }

    public final AwemeBubbleToastInfo copy(String str, int i) {
        C89219l.m154721d(str, "");
        return new AwemeBubbleToastInfo(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeBubbleToastInfo)) {
            return false;
        }
        AwemeBubbleToastInfo awemeBubbleToastInfo = (AwemeBubbleToastInfo) obj;
        return C89219l.m154714a(this.toastType, awemeBubbleToastInfo.toastType) && this.toastCount == awemeBubbleToastInfo.toastCount;
    }

    public final int hashCode() {
        String str = this.toastType;
        return ((str != null ? str.hashCode() : 0) * 31) + m93161x5cf9ba7a(this.toastCount);
    }

    public final String toString() {
        return "AwemeBubbleToastInfo(toastType=" + this.toastType + ", toastCount=" + this.toastCount + ")";
    }

    public AwemeBubbleToastInfo(String str, int i) {
        C89219l.m154721d(str, "");
        this.toastType = str;
        this.toastCount = i;
    }
}
