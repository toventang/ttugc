package com.bytedance.android.livesdkapi.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

public final class LatestLiveData {
    private final long latestDuration;
    private final long latestLeaveTime;
    private final long latestRoomId;

    static {
        Covode.recordClassIndex(13534);
    }

    public LatestLiveData() {
        this(0, 0, 0, 7, null);
    }

    /* renamed from: com_bytedance_android_livesdkapi_model_LatestLiveData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m20837x4dc7bcdc(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ LatestLiveData copy$default(LatestLiveData latestLiveData, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = latestLiveData.latestRoomId;
        }
        if ((i & 2) != 0) {
            j2 = latestLiveData.latestLeaveTime;
        }
        if ((i & 4) != 0) {
            j3 = latestLiveData.latestDuration;
        }
        return latestLiveData.copy(j, j2, j3);
    }

    public final long component1() {
        return this.latestRoomId;
    }

    public final long component2() {
        return this.latestLeaveTime;
    }

    public final long component3() {
        return this.latestDuration;
    }

    public final LatestLiveData copy(long j, long j2, long j3) {
        return new LatestLiveData(j, j2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatestLiveData)) {
            return false;
        }
        LatestLiveData latestLiveData = (LatestLiveData) obj;
        return this.latestRoomId == latestLiveData.latestRoomId && this.latestLeaveTime == latestLiveData.latestLeaveTime && this.latestDuration == latestLiveData.latestDuration;
    }

    public final int hashCode() {
        return (((m20837x4dc7bcdc(this.latestRoomId) * 31) + m20837x4dc7bcdc(this.latestLeaveTime)) * 31) + m20837x4dc7bcdc(this.latestDuration);
    }

    public final String toString() {
        return "LatestLiveData(latestRoomId=" + this.latestRoomId + ", latestLeaveTime=" + this.latestLeaveTime + ", latestDuration=" + this.latestDuration + ")";
    }

    public final long getLatestDuration() {
        return this.latestDuration;
    }

    public final long getLatestLeaveTime() {
        return this.latestLeaveTime;
    }

    public final long getLatestRoomId() {
        return this.latestRoomId;
    }

    public LatestLiveData(long j, long j2, long j3) {
        this.latestRoomId = j;
        this.latestLeaveTime = j2;
        this.latestDuration = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LatestLiveData(long j, long j2, long j3, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? 0 : j2, (i & 4) != 0 ? 0 : j3);
    }
}
