package com.p2082ss.bytertc.engine;

import android.util.Pair;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.VideoStreamDescription */
public class VideoStreamDescription {
    public EncoderPreference encodePreference = EncoderPreference.MaintainFramerate;
    public int frameRate;
    public int maxKbps;
    public ScaleMode scaleMode = ScaleMode.SCALE_MODE_AUTO;
    public Pair<Integer, Integer> videoSize;

    static {
        Covode.recordClassIndex(100945);
    }

    /* renamed from: com.ss.bytertc.engine.VideoStreamDescription$CodecMode */
    public enum CodecMode {
        CODEC_MODE_AUTO(0),
        CODEC_MODE_HARDWARE(1),
        CODEC_MODE_SOFTWARE(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100946);
        }

        public static CodecMode convertFromInt(int i) {
            return values()[i];
        }

        private CodecMode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.VideoStreamDescription$EncoderPreference */
    public enum EncoderPreference {
        Disabled(0),
        MaintainFramerate(1),
        MaintainQuality(2),
        Balance(3);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100947);
        }

        public static EncoderPreference convertFromInt(int i) {
            return values()[i];
        }

        private EncoderPreference(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.VideoStreamDescription$ScaleMode */
    public enum ScaleMode {
        SCALE_MODE_AUTO(0),
        SCALE_MODE_STRETCH(1),
        SCALE_MODE_FIT_WITH_CROPPING(2),
        SCALE_MODE_FIT_WITH_FILLING(3);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100948);
        }

        public static ScaleMode convertFromInt(int i) {
            return values()[i];
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.VideoStreamDescription$VideoCodecType */
    public enum VideoCodecType {
        CODEC_TYPE_AUTO(0),
        CODEC_TYPE_H264(1),
        CODEC_TYPE_BYTEVC1(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100949);
        }

        public static VideoCodecType convertFromInt(int i) {
            return values()[i];
        }

        private VideoCodecType(int i) {
            this.value = i;
        }
    }

    public VideoStreamDescription() {
    }

    public boolean isValid() {
        Pair<Integer, Integer> pair = this.videoSize;
        if (pair == null || ((Integer) pair.first).intValue() <= 0 || ((Integer) this.videoSize.second).intValue() <= 0 || this.frameRate <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "VideoStreamDescription{videoSize=" + this.videoSize + ", frameRate=" + this.frameRate + ", maxKbps=" + this.maxKbps + ", scaleMode=" + this.scaleMode + ", encodePreference=" + this.encodePreference + '}';
    }

    private static VideoStreamDescription create(int i, int i2, int i3, int i4, int i5) {
        return new VideoStreamDescription(i, i2, i3, i4, i5);
    }

    public VideoStreamDescription(int i, int i2, int i3, int i4, int i5) {
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.scaleMode = ScaleMode.convertFromInt(i5);
    }

    public VideoStreamDescription(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.scaleMode = ScaleMode.convertFromInt(i5);
        this.encodePreference = EncoderPreference.convertFromInt(i8);
    }
}
