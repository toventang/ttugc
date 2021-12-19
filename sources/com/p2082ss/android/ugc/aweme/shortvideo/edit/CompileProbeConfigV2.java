package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV2 */
public final class CompileProbeConfigV2 {
    private final String bitrateRange;
    private final int bitrateStrategy;
    private final long endPointMs;
    private final int probeType;
    private final long startPointMs;

    static {
        Covode.recordClassIndex(83242);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m124984xaaa8463f(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m124985xaaa8463f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ CompileProbeConfigV2 copy$default(CompileProbeConfigV2 compileProbeConfigV2, long j, long j2, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = compileProbeConfigV2.startPointMs;
        }
        if ((i3 & 2) != 0) {
            j2 = compileProbeConfigV2.endPointMs;
        }
        if ((i3 & 4) != 0) {
            i = compileProbeConfigV2.probeType;
        }
        if ((i3 & 8) != 0) {
            i2 = compileProbeConfigV2.bitrateStrategy;
        }
        if ((i3 & 16) != 0) {
            str = compileProbeConfigV2.bitrateRange;
        }
        return compileProbeConfigV2.copy(j, j2, i, i2, str);
    }

    public final long component1() {
        return this.startPointMs;
    }

    public final long component2() {
        return this.endPointMs;
    }

    public final int component3() {
        return this.probeType;
    }

    public final int component4() {
        return this.bitrateStrategy;
    }

    public final String component5() {
        return this.bitrateRange;
    }

    public final CompileProbeConfigV2 copy(long j, long j2, int i, int i2, String str) {
        C89219l.m154721d(str, "");
        return new CompileProbeConfigV2(j, j2, i, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileProbeConfigV2)) {
            return false;
        }
        CompileProbeConfigV2 compileProbeConfigV2 = (CompileProbeConfigV2) obj;
        return this.startPointMs == compileProbeConfigV2.startPointMs && this.endPointMs == compileProbeConfigV2.endPointMs && this.probeType == compileProbeConfigV2.probeType && this.bitrateStrategy == compileProbeConfigV2.bitrateStrategy && C89219l.m154714a(this.bitrateRange, compileProbeConfigV2.bitrateRange);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((m124985xaaa8463f(this.startPointMs) * 31) + m124985xaaa8463f(this.endPointMs)) * 31) + m124984xaaa8463f(this.probeType)) * 31) + m124984xaaa8463f(this.bitrateStrategy)) * 31;
        String str = this.bitrateRange;
        return com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CompileProbeConfigV2(startPointMs=" + this.startPointMs + ", endPointMs=" + this.endPointMs + ", probeType=" + this.probeType + ", bitrateStrategy=" + this.bitrateStrategy + ", bitrateRange=" + this.bitrateRange + ")";
    }

    public final String getBitrateRange() {
        return this.bitrateRange;
    }

    public final int getBitrateStrategy() {
        return this.bitrateStrategy;
    }

    public final long getEndPointMs() {
        return this.endPointMs;
    }

    public final int getProbeType() {
        return this.probeType;
    }

    public final long getStartPointMs() {
        return this.startPointMs;
    }

    public CompileProbeConfigV2(long j, long j2, int i, int i2, String str) {
        C89219l.m154721d(str, "");
        this.startPointMs = j;
        this.endPointMs = j2;
        this.probeType = i;
        this.bitrateStrategy = i2;
        this.bitrateRange = str;
    }
}
