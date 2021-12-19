package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfig */
public final class CompileProbeConfig {
    private final long endPointMs;
    private final long startPointMs;

    static {
        Covode.recordClassIndex(83241);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m124983x8c191663(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ CompileProbeConfig copy$default(CompileProbeConfig compileProbeConfig, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = compileProbeConfig.startPointMs;
        }
        if ((i & 2) != 0) {
            j2 = compileProbeConfig.endPointMs;
        }
        return compileProbeConfig.copy(j, j2);
    }

    public final long component1() {
        return this.startPointMs;
    }

    public final long component2() {
        return this.endPointMs;
    }

    public final CompileProbeConfig copy(long j, long j2) {
        return new CompileProbeConfig(j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileProbeConfig)) {
            return false;
        }
        CompileProbeConfig compileProbeConfig = (CompileProbeConfig) obj;
        return this.startPointMs == compileProbeConfig.startPointMs && this.endPointMs == compileProbeConfig.endPointMs;
    }

    public final int hashCode() {
        return (m124983x8c191663(this.startPointMs) * 31) + m124983x8c191663(this.endPointMs);
    }

    public final String toString() {
        return "CompileProbeConfig(startPointMs=" + this.startPointMs + ", endPointMs=" + this.endPointMs + ")";
    }

    public final long getEndPointMs() {
        return this.endPointMs;
    }

    public final long getStartPointMs() {
        return this.startPointMs;
    }

    public CompileProbeConfig(long j, long j2) {
        this.startPointMs = j;
        this.endPointMs = j2;
    }
}
