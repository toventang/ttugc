package com.p2082ss.android.ugc.aweme.ftc.countdown;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState */
public final class FTCCountdownState implements AbstractC20368af {
    private final long maxDuration;
    private final String musicPath;
    private final long sdkRecordTime;
    private final long startTime;
    private final UrlModel taps;
    private final long totalTime;
    private final C70625d waveInfo;

    static {
        Covode.recordClassIndex(61848);
    }

    /* renamed from: com_ss_android_ugc_aweme_ftc_countdown_FTCCountdownState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m97351x9252423e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ FTCCountdownState copy$default(FTCCountdownState fTCCountdownState, String str, UrlModel urlModel, long j, long j2, long j3, long j4, C70625d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fTCCountdownState.musicPath;
        }
        if ((i & 2) != 0) {
            urlModel = fTCCountdownState.taps;
        }
        if ((i & 4) != 0) {
            j = fTCCountdownState.sdkRecordTime;
        }
        if ((i & 8) != 0) {
            j2 = fTCCountdownState.startTime;
        }
        if ((i & 16) != 0) {
            j3 = fTCCountdownState.totalTime;
        }
        if ((i & 32) != 0) {
            j4 = fTCCountdownState.maxDuration;
        }
        if ((i & 64) != 0) {
            dVar = fTCCountdownState.waveInfo;
        }
        return fTCCountdownState.copy(str, urlModel, j, j2, j3, j4, dVar);
    }

    public final String component1() {
        return this.musicPath;
    }

    public final UrlModel component2() {
        return this.taps;
    }

    public final long component3() {
        return this.sdkRecordTime;
    }

    public final long component4() {
        return this.startTime;
    }

    public final long component5() {
        return this.totalTime;
    }

    public final long component6() {
        return this.maxDuration;
    }

    public final C70625d component7() {
        return this.waveInfo;
    }

    public final FTCCountdownState copy(String str, UrlModel urlModel, long j, long j2, long j3, long j4, C70625d dVar) {
        return new FTCCountdownState(str, urlModel, j, j2, j3, j4, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCCountdownState)) {
            return false;
        }
        FTCCountdownState fTCCountdownState = (FTCCountdownState) obj;
        return C89219l.m154714a(this.musicPath, fTCCountdownState.musicPath) && C89219l.m154714a(this.taps, fTCCountdownState.taps) && this.sdkRecordTime == fTCCountdownState.sdkRecordTime && this.startTime == fTCCountdownState.startTime && this.totalTime == fTCCountdownState.totalTime && this.maxDuration == fTCCountdownState.maxDuration && C89219l.m154714a(this.waveInfo, fTCCountdownState.waveInfo);
    }

    public final int hashCode() {
        String str = this.musicPath;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.taps;
        int hashCode2 = (((((((((hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31) + m97351x9252423e(this.sdkRecordTime)) * 31) + m97351x9252423e(this.startTime)) * 31) + m97351x9252423e(this.totalTime)) * 31) + m97351x9252423e(this.maxDuration)) * 31;
        C70625d dVar = this.waveInfo;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "FTCCountdownState(musicPath=" + this.musicPath + ", taps=" + this.taps + ", sdkRecordTime=" + this.sdkRecordTime + ", startTime=" + this.startTime + ", totalTime=" + this.totalTime + ", maxDuration=" + this.maxDuration + ", waveInfo=" + this.waveInfo + ")";
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final long getSdkRecordTime() {
        return this.sdkRecordTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final UrlModel getTaps() {
        return this.taps;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public final C70625d getWaveInfo() {
        return this.waveInfo;
    }

    public FTCCountdownState(String str, UrlModel urlModel, long j, long j2, long j3, long j4, C70625d dVar) {
        this.musicPath = str;
        this.taps = urlModel;
        this.sdkRecordTime = j;
        this.startTime = j2;
        this.totalTime = j3;
        this.maxDuration = j4;
        this.waveInfo = dVar;
    }
}
