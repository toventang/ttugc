package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class FrequencyConfig {
    @AbstractC27891c(mo46611a = "call_threshold")
    private final int callThreshold;
    @AbstractC27891c(mo46611a = StringSet.name)
    private final String name;
    @AbstractC27891c(mo46611a = "session_interval_time")
    private final long sessionIntervalTime;
    @AbstractC27891c(mo46611a = "timeline_limit")
    private final int timelineLimit;

    static {
        Covode.recordClassIndex(17566);
    }

    public FrequencyConfig() {
        this(0, 0, 0, null, 15, null);
    }

    public static /* synthetic */ FrequencyConfig copy$default(FrequencyConfig frequencyConfig, int i, long j, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = frequencyConfig.callThreshold;
        }
        if ((i3 & 2) != 0) {
            j = frequencyConfig.sessionIntervalTime;
        }
        if ((i3 & 4) != 0) {
            i2 = frequencyConfig.timelineLimit;
        }
        if ((i3 & 8) != 0) {
            str = frequencyConfig.name;
        }
        return frequencyConfig.copy(i, j, i2, str);
    }

    public final int component1() {
        return this.callThreshold;
    }

    public final long component2() {
        return this.sessionIntervalTime;
    }

    public final int component3() {
        return this.timelineLimit;
    }

    public final String component4() {
        return this.name;
    }

    public final FrequencyConfig copy(int i, long j, int i2, String str) {
        return new FrequencyConfig(i, j, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyConfig)) {
            return false;
        }
        FrequencyConfig frequencyConfig = (FrequencyConfig) obj;
        return this.callThreshold == frequencyConfig.callThreshold && this.sessionIntervalTime == frequencyConfig.sessionIntervalTime && this.timelineLimit == frequencyConfig.timelineLimit && C89219l.m154714a(this.name, frequencyConfig.name);
    }

    public final int hashCode() {
        long j = this.sessionIntervalTime;
        int i = ((((this.callThreshold * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.timelineLimit) * 31;
        String str = this.name;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FrequencyConfig(callThreshold=" + this.callThreshold + ", sessionIntervalTime=" + this.sessionIntervalTime + ", timelineLimit=" + this.timelineLimit + ", name=" + this.name + ")";
    }

    public final int getCallThreshold() {
        return this.callThreshold;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSessionIntervalTime() {
        return this.sessionIntervalTime;
    }

    public final int getTimelineLimit() {
        return this.timelineLimit;
    }

    public FrequencyConfig(int i, long j, int i2, String str) {
        this.callThreshold = i;
        this.sessionIntervalTime = j;
        this.timelineLimit = i2;
        this.name = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrequencyConfig(int i, long j, int i2, String str, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? Integer.MAX_VALUE : i, (i3 & 2) != 0 ? Long.MAX_VALUE : j, (i3 & 4) != 0 ? 200 : i2, (i3 & 8) != 0 ? null : str);
    }
}
