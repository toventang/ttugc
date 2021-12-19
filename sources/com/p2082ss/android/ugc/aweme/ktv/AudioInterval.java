package com.p2082ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.ktv.AudioInterval */
public final class AudioInterval implements Serializable {
    private long end;
    private long start;

    static {
        Covode.recordClassIndex(68026);
    }

    public static /* synthetic */ AudioInterval copy$default(AudioInterval audioInterval, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = audioInterval.start;
        }
        if ((i & 2) != 0) {
            j2 = audioInterval.end;
        }
        return audioInterval.copy(j, j2);
    }

    public final long component1() {
        return this.start;
    }

    public final long component2() {
        return this.end;
    }

    public final AudioInterval copy(long j, long j2) {
        return new AudioInterval(j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioInterval)) {
            return false;
        }
        AudioInterval audioInterval = (AudioInterval) obj;
        return this.start == audioInterval.start && this.end == audioInterval.end;
    }

    public final int hashCode() {
        long j = this.start;
        long j2 = this.end;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "AudioInterval(start=" + this.start + ", end=" + this.end + ")";
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getStart() {
        return this.start;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    public AudioInterval(long j, long j2) {
        this.start = j;
        this.end = j2;
    }
}
