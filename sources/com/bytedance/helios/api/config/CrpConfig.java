package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

public final class CrpConfig {
    @AbstractC27891c(mo46611a = "event_timeout_mills")
    private final long eventTimeOutMills;
    @AbstractC27891c(mo46611a = "report_delayed_mills")
    private final long reportDelayedMills;

    static {
        Covode.recordClassIndex(17564);
    }

    public CrpConfig() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ CrpConfig copy$default(CrpConfig crpConfig, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = crpConfig.eventTimeOutMills;
        }
        if ((i & 2) != 0) {
            j2 = crpConfig.reportDelayedMills;
        }
        return crpConfig.copy(j, j2);
    }

    public final long component1() {
        return this.eventTimeOutMills;
    }

    public final long component2() {
        return this.reportDelayedMills;
    }

    public final CrpConfig copy(long j, long j2) {
        return new CrpConfig(j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrpConfig)) {
            return false;
        }
        CrpConfig crpConfig = (CrpConfig) obj;
        return this.eventTimeOutMills == crpConfig.eventTimeOutMills && this.reportDelayedMills == crpConfig.reportDelayedMills;
    }

    public final int hashCode() {
        long j = this.eventTimeOutMills;
        long j2 = this.reportDelayedMills;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "CrpConfig(eventTimeOutMills=" + this.eventTimeOutMills + ", reportDelayedMills=" + this.reportDelayedMills + ")";
    }

    public final long getEventTimeOutMills() {
        return this.eventTimeOutMills;
    }

    public final long getReportDelayedMills() {
        return this.reportDelayedMills;
    }

    public CrpConfig(long j, long j2) {
        this.eventTimeOutMills = j;
        this.reportDelayedMills = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrpConfig(long j, long j2, int i, C89214g gVar) {
        this((i & 1) != 0 ? 100 : j, (i & 2) != 0 ? 50 : j2);
    }
}
