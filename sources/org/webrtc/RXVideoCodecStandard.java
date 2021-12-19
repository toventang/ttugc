package org.webrtc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public enum RXVideoCodecStandard {
    H264(0),
    ByteVC1(1),
    Unknown(2),
    VP8(8),
    VP9(9);
    
    private final int value;

    public final int toInt() {
        return this.value;
    }

    /* access modifiers changed from: package-private */
    public final String mimeType() {
        if (this.value != 1) {
            return "video/avc";
        }
        return "video/ByteVC1";
    }

    static {
        Covode.recordClassIndex(106690);
    }

    static RXVideoCodecStandard fromValue(int i) {
        if (i == 0) {
            return H264;
        }
        if (i != 1) {
            return H264;
        }
        return ByteVC1;
    }

    private RXVideoCodecStandard(int i) {
        this.value = i;
    }
}
