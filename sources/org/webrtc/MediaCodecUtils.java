package org.webrtc;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public class MediaCodecUtils {
    static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
    static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391876};
    static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC."};
    static final int[] TEXTURE_COLOR_FORMATS = getTextureColorFormats();

    private MediaCodecUtils() {
    }

    private static int[] getTextureColorFormats() {
        int i = Build.VERSION.SDK_INT;
        return new int[]{2130708361};
    }

    /* renamed from: org.webrtc.MediaCodecUtils$1 */
    static /* synthetic */ class C902961 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RXVideoCodecStandard;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 106665(0x1a0a9, float:1.4947E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.webrtc.RXVideoCodecStandard[] r0 = org.webrtc.RXVideoCodecStandard.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.webrtc.MediaCodecUtils.C902961.$SwitchMap$org$webrtc$RXVideoCodecStandard = r2
                org.webrtc.RXVideoCodecStandard r0 = org.webrtc.RXVideoCodecStandard.VP8     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.webrtc.MediaCodecUtils.C902961.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.webrtc.RXVideoCodecStandard r0 = org.webrtc.RXVideoCodecStandard.VP9     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = org.webrtc.MediaCodecUtils.C902961.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x002e }
                org.webrtc.RXVideoCodecStandard r0 = org.webrtc.RXVideoCodecStandard.H264     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecUtils.C902961.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(106664);
    }

    static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (rXVideoCodecStandard.mimeType().equals(str)) {
                return true;
            }
        }
        return false;
    }

    static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            int[] iArr2 = codecCapabilities.colorFormats;
            for (int i2 : iArr2) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }

    static Map<String, String> getCodecProperties(RXVideoCodecStandard rXVideoCodecStandard, boolean z) {
        int i = C902961.$SwitchMap$org$webrtc$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1 || i == 2) {
            return new HashMap();
        }
        if (i == 3) {
            return new HashMap();
        }
        throw new IllegalArgumentException("Unsupported codec: ".concat(String.valueOf(rXVideoCodecStandard)));
    }
}
