package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class WeeklyRankRegionInfo {
    @AbstractC27891c(mo46611a = "current_type")
    private final int currentType;
    @AbstractC27891c(mo46611a = "region_status")
    private final int regionStatus;
    @AbstractC27891c(mo46611a = "room_region")
    private final String roomRegion;
    @AbstractC27891c(mo46611a = "viewer_region")
    private final String viewerRegion;

    static {
        Covode.recordClassIndex(11937);
    }

    public WeeklyRankRegionInfo() {
        this(0, 0, null, null, 15, null);
    }

    /* renamed from: com_bytedance_android_livesdk_rank_impl_api_model_WeeklyRankRegionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m18864xf195a21(int i) {
        return i;
    }

    public static /* synthetic */ WeeklyRankRegionInfo copy$default(WeeklyRankRegionInfo weeklyRankRegionInfo, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = weeklyRankRegionInfo.regionStatus;
        }
        if ((i3 & 2) != 0) {
            i2 = weeklyRankRegionInfo.currentType;
        }
        if ((i3 & 4) != 0) {
            str = weeklyRankRegionInfo.roomRegion;
        }
        if ((i3 & 8) != 0) {
            str2 = weeklyRankRegionInfo.viewerRegion;
        }
        return weeklyRankRegionInfo.copy(i, i2, str, str2);
    }

    public final int component1() {
        return this.regionStatus;
    }

    public final int component2() {
        return this.currentType;
    }

    public final String component3() {
        return this.roomRegion;
    }

    public final String component4() {
        return this.viewerRegion;
    }

    public final WeeklyRankRegionInfo copy(int i, int i2, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new WeeklyRankRegionInfo(i, i2, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeeklyRankRegionInfo)) {
            return false;
        }
        WeeklyRankRegionInfo weeklyRankRegionInfo = (WeeklyRankRegionInfo) obj;
        return this.regionStatus == weeklyRankRegionInfo.regionStatus && this.currentType == weeklyRankRegionInfo.currentType && C89219l.m154714a(this.roomRegion, weeklyRankRegionInfo.roomRegion) && C89219l.m154714a(this.viewerRegion, weeklyRankRegionInfo.viewerRegion);
    }

    public final int hashCode() {
        int com_bytedance_android_livesdk_rank_impl_api_model_WeeklyRankRegionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m18864xf195a21(this.regionStatus) * 31) + m18864xf195a21(this.currentType)) * 31;
        String str = this.roomRegion;
        int i = 0;
        int hashCode = (com_bytedance_android_livesdk_rank_impl_api_model_WeeklyRankRegionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.viewerRegion;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "WeeklyRankRegionInfo(regionStatus=" + this.regionStatus + ", currentType=" + this.currentType + ", roomRegion=" + this.roomRegion + ", viewerRegion=" + this.viewerRegion + ")";
    }

    public final int getCurrentType() {
        return this.currentType;
    }

    public final int getRegionStatus() {
        return this.regionStatus;
    }

    public final String getRoomRegion() {
        return this.roomRegion;
    }

    public final String getViewerRegion() {
        return this.viewerRegion;
    }

    public WeeklyRankRegionInfo(int i, int i2, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.regionStatus = i;
        this.currentType = i2;
        this.roomRegion = str;
        this.viewerRegion = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WeeklyRankRegionInfo(int i, int i2, String str, String str2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? EnumC10366c.UNKNOWN_STATUS.getValue() : i, (i3 & 2) != 0 ? EnumC10367d.UNKNOWN.getValue() : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2);
    }
}
