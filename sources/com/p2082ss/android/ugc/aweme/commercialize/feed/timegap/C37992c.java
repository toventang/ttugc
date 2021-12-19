package com.p2082ss.android.ugc.aweme.commercialize.feed.timegap;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.timegap.c */
public final class C37992c implements Serializable {
    @AbstractC27891c(mo46611a = "adgap_delta_by_time")
    public String deltaGapTimeMap;
    @AbstractC27891c(mo46611a = "downstream_range_end")
    public int downstreamRange;
    @AbstractC27891c(mo46611a = "fast_browse_time_threshold")
    public int fastBrowseTimeThreshold;
    @AbstractC27891c(mo46611a = "enable_fast_browse")
    public boolean isEnableFastBrowseAdjust;
    @AbstractC27891c(mo46611a = "enable_client_adgap_adjust")
    public boolean isEnableGapAdjust;
    @AbstractC27891c(mo46611a = "enable_showtime_gap")
    public boolean isEnableShowTimeGap;
    @AbstractC27891c(mo46611a = "use_fast_browse_model")
    public boolean isUserFastBrowseModel;
    @AbstractC27891c(mo46611a = "min_gap")
    public int minGap;
    @AbstractC27891c(mo46611a = "single_vid_view_time")
    public int singleVidViewTime;
    @AbstractC27891c(mo46611a = "viewed_vid_num")
    public int viewVidNumForFastBrowse;

    static {
        Covode.recordClassIndex(45453);
    }

    public C37992c() {
        this(false, false, false, null, 0, false, 0, 0, 0, 0, 1023, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_feed_timegap_AdShowTimeGapResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77048x68e7c97(int i) {
        return i;
    }

    public static /* synthetic */ C37992c copy$default(C37992c cVar, boolean z, boolean z2, boolean z3, String str, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z = cVar.isEnableGapAdjust;
        }
        if ((i6 & 2) != 0) {
            z2 = cVar.isEnableShowTimeGap;
        }
        if ((i6 & 4) != 0) {
            z3 = cVar.isEnableFastBrowseAdjust;
        }
        if ((i6 & 8) != 0) {
            str = cVar.deltaGapTimeMap;
        }
        if ((i6 & 16) != 0) {
            i = cVar.downstreamRange;
        }
        if ((i6 & 32) != 0) {
            z4 = cVar.isUserFastBrowseModel;
        }
        if ((i6 & 64) != 0) {
            i2 = cVar.viewVidNumForFastBrowse;
        }
        if ((i6 & 128) != 0) {
            i3 = cVar.singleVidViewTime;
        }
        if ((i6 & 256) != 0) {
            i4 = cVar.fastBrowseTimeThreshold;
        }
        if ((i6 & 512) != 0) {
            i5 = cVar.minGap;
        }
        return cVar.copy(z, z2, z3, str, i, z4, i2, i3, i4, i5);
    }

    public final boolean component1() {
        return this.isEnableGapAdjust;
    }

    public final int component10() {
        return this.minGap;
    }

    public final boolean component2() {
        return this.isEnableShowTimeGap;
    }

    public final boolean component3() {
        return this.isEnableFastBrowseAdjust;
    }

    public final String component4() {
        return this.deltaGapTimeMap;
    }

    public final int component5() {
        return this.downstreamRange;
    }

    public final boolean component6() {
        return this.isUserFastBrowseModel;
    }

    public final int component7() {
        return this.viewVidNumForFastBrowse;
    }

    public final int component8() {
        return this.singleVidViewTime;
    }

    public final int component9() {
        return this.fastBrowseTimeThreshold;
    }

    public final C37992c copy(boolean z, boolean z2, boolean z3, String str, int i, boolean z4, int i2, int i3, int i4, int i5) {
        return new C37992c(z, z2, z3, str, i, z4, i2, i3, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37992c)) {
            return false;
        }
        C37992c cVar = (C37992c) obj;
        return this.isEnableGapAdjust == cVar.isEnableGapAdjust && this.isEnableShowTimeGap == cVar.isEnableShowTimeGap && this.isEnableFastBrowseAdjust == cVar.isEnableFastBrowseAdjust && C89219l.m154714a(this.deltaGapTimeMap, cVar.deltaGapTimeMap) && this.downstreamRange == cVar.downstreamRange && this.isUserFastBrowseModel == cVar.isUserFastBrowseModel && this.viewVidNumForFastBrowse == cVar.viewVidNumForFastBrowse && this.singleVidViewTime == cVar.singleVidViewTime && this.fastBrowseTimeThreshold == cVar.fastBrowseTimeThreshold && this.minGap == cVar.minGap;
    }

    public final int hashCode() {
        boolean z = this.isEnableGapAdjust;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.isEnableShowTimeGap;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.isEnableFastBrowseAdjust;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        String str = this.deltaGapTimeMap;
        int hashCode = (((i13 + (str != null ? str.hashCode() : 0)) * 31) + m77048x68e7c97(this.downstreamRange)) * 31;
        if (!this.isUserFastBrowseModel) {
            i = 0;
        }
        return ((((((((hashCode + i) * 31) + m77048x68e7c97(this.viewVidNumForFastBrowse)) * 31) + m77048x68e7c97(this.singleVidViewTime)) * 31) + m77048x68e7c97(this.fastBrowseTimeThreshold)) * 31) + m77048x68e7c97(this.minGap);
    }

    public final String toString() {
        return "AdShowTimeGapResponse(isEnableGapAdjust=" + this.isEnableGapAdjust + ", isEnableShowTimeGap=" + this.isEnableShowTimeGap + ", isEnableFastBrowseAdjust=" + this.isEnableFastBrowseAdjust + ", deltaGapTimeMap=" + this.deltaGapTimeMap + ", downstreamRange=" + this.downstreamRange + ", isUserFastBrowseModel=" + this.isUserFastBrowseModel + ", viewVidNumForFastBrowse=" + this.viewVidNumForFastBrowse + ", singleVidViewTime=" + this.singleVidViewTime + ", fastBrowseTimeThreshold=" + this.fastBrowseTimeThreshold + ", minGap=" + this.minGap + ")";
    }

    public final String getDeltaGapTimeMap() {
        return this.deltaGapTimeMap;
    }

    public final int getDownstreamRange() {
        return this.downstreamRange;
    }

    public final int getFastBrowseTimeThreshold() {
        return this.fastBrowseTimeThreshold;
    }

    public final int getMinGap() {
        return this.minGap;
    }

    public final int getSingleVidViewTime() {
        return this.singleVidViewTime;
    }

    public final int getViewVidNumForFastBrowse() {
        return this.viewVidNumForFastBrowse;
    }

    public final boolean isEnableFastBrowseAdjust() {
        return this.isEnableFastBrowseAdjust;
    }

    public final boolean isEnableGapAdjust() {
        return this.isEnableGapAdjust;
    }

    public final boolean isEnableShowTimeGap() {
        return this.isEnableShowTimeGap;
    }

    public final boolean isUserFastBrowseModel() {
        return this.isUserFastBrowseModel;
    }

    public C37992c(boolean z, boolean z2, boolean z3, String str, int i, boolean z4, int i2, int i3, int i4, int i5) {
        this.isEnableGapAdjust = z;
        this.isEnableShowTimeGap = z2;
        this.isEnableFastBrowseAdjust = z3;
        this.deltaGapTimeMap = str;
        this.downstreamRange = i;
        this.isUserFastBrowseModel = z4;
        this.viewVidNumForFastBrowse = i2;
        this.singleVidViewTime = i3;
        this.fastBrowseTimeThreshold = i4;
        this.minGap = i5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37992c(boolean z, boolean z2, boolean z3, String str, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, C89214g gVar) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? false : z2, (i6 & 4) != 0 ? false : z3, (i6 & 8) != 0 ? null : str, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? false : z4, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) == 0 ? i5 : 0);
    }
}
