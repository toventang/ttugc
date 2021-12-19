package com.p2082ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.nle.VideoVolumeProperty */
public final class VideoVolumeProperty {
    private final String curve;
    private final double volume;

    static {
        Covode.recordClassIndex(37722);
    }

    public VideoVolumeProperty() {
        this(0.0d, null, 3, null);
    }

    public static /* synthetic */ VideoVolumeProperty copy$default(VideoVolumeProperty videoVolumeProperty, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = videoVolumeProperty.volume;
        }
        if ((i & 2) != 0) {
            str = videoVolumeProperty.curve;
        }
        return videoVolumeProperty.copy(d, str);
    }

    public final double component1() {
        return this.volume;
    }

    public final String component2() {
        return this.curve;
    }

    public final VideoVolumeProperty copy(double d, String str) {
        C89219l.m154721d(str, "");
        return new VideoVolumeProperty(d, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVolumeProperty)) {
            return false;
        }
        VideoVolumeProperty videoVolumeProperty = (VideoVolumeProperty) obj;
        return Double.compare(this.volume, videoVolumeProperty.volume) == 0 && C89219l.m154714a(this.curve, videoVolumeProperty.curve);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.volume);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        String str = this.curve;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "VideoVolumeProperty(volume=" + this.volume + ", curve=" + this.curve + ")";
    }

    public final String getCurve() {
        return this.curve;
    }

    public final double getVolume() {
        return this.volume;
    }

    public VideoVolumeProperty(double d, String str) {
        C89219l.m154721d(str, "");
        this.volume = d;
        this.curve = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoVolumeProperty(NLESegmentAudio nLESegmentAudio, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this((double) nLESegmentAudio.getVolume(), null, 2, null);
        C89219l.m154721d(nLESegmentAudio, "");
        C89219l.m154721d(nLETrackSlot, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoVolumeProperty(double d, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? 1.0d : d, (i & 2) != 0 ? "" : str);
    }
}
