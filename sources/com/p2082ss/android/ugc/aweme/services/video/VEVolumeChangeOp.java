package com.p2082ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp */
public class VEVolumeChangeOp {
    public final int mEnd;
    public final int mStart;
    public final int mType;
    public final int mVoiceType;
    public final float mVolume;

    static {
        Covode.recordClassIndex(80029);
    }

    public String toString() {
        return "VEVolumeChangeOp{mType=" + this.mType + ", mVolume=" + this.mVolume + '}';
    }

    public static VEVolumeChangeOp ofMusic(float f) {
        return new VEVolumeChangeOp(1, f);
    }

    public static VEVolumeChangeOp ofVoice(float f) {
        return new VEVolumeChangeOp(0, f);
    }

    private VEVolumeChangeOp(int i, float f) {
        this.mType = i;
        this.mVolume = f;
        this.mStart = -1;
        this.mEnd = -1;
    }

    public static VEVolumeChangeOp ofVoice(float f, int i, int i2, int i3) {
        return new VEVolumeChangeOp(0, f, i, i2, i3);
    }

    private VEVolumeChangeOp(int i, float f, int i2, int i3, int i4) {
        this.mType = i;
        this.mVolume = f;
        this.mStart = i2;
        this.mEnd = i3;
        this.mVoiceType = i4;
    }
}
