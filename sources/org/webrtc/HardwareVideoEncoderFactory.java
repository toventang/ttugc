package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;

public class HardwareVideoEncoderFactory {
    private EglBase14.Context sharedContext;

    static {
        Covode.recordClassIndex(106650);
    }

    /* renamed from: org_webrtc_HardwareVideoEncoderFactory_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m157038xeb03009f(String str, String str2) {
        return 0;
    }

    /* renamed from: org_webrtc_HardwareVideoEncoderFactory_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m157039xeb03009f(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: org_webrtc_HardwareVideoEncoderFactory_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m157040xeb0300b1(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.HardwareVideoEncoderFactory$1 */
    public static /* synthetic */ class C902941 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RXVideoCodecStandard;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 106651(0x1a09b, float:1.4945E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.webrtc.RXVideoCodecStandard[] r0 = org.webrtc.RXVideoCodecStandard.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.webrtc.HardwareVideoEncoderFactory.C902941.$SwitchMap$org$webrtc$RXVideoCodecStandard = r2
                org.webrtc.RXVideoCodecStandard r0 = org.webrtc.RXVideoCodecStandard.H264     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.webrtc.HardwareVideoEncoderFactory.C902941.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.webrtc.RXVideoCodecStandard r0 = org.webrtc.RXVideoCodecStandard.ByteVC1     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = org.webrtc.HardwareVideoEncoderFactory.C902941.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x002e }
                org.webrtc.RXVideoCodecStandard r0 = org.webrtc.RXVideoCodecStandard.VP8     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = org.webrtc.HardwareVideoEncoderFactory.C902941.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x0039 }
                org.webrtc.RXVideoCodecStandard r0 = org.webrtc.RXVideoCodecStandard.VP9     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.C902941.<clinit>():void");
        }
    }

    public static RXVideoCodecDesc[] getSupportedCodecs() {
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        RXVideoCodecStandard[] rXVideoCodecStandardArr = {RXVideoCodecStandard.H264};
        int i2 = 0;
        do {
            RXVideoCodecStandard rXVideoCodecStandard = rXVideoCodecStandardArr[0];
            MediaCodecInfo findCodecForType = findCodecForType(rXVideoCodecStandard);
            if (findCodecForType != null) {
                if (rXVideoCodecStandard == RXVideoCodecStandard.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
                }
                arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
            }
            i2++;
        } while (i2 <= 0);
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    private static boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT > 23) {
            return true;
        }
        return false;
    }

    public void setHardwareContext(EglBase.Context context) {
        if (context instanceof EglBase14.Context) {
            this.sharedContext = (EglBase14.Context) context;
        }
    }

    private static MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        MediaCodecInfo mediaCodecInfo;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                try {
                    mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
                } catch (IllegalArgumentException e) {
                    m157039xeb03009f("HwVideoEncoderFactory", "Cannot retrieve encoder codec info", e);
                    mediaCodecInfo = null;
                }
                if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, rXVideoCodecStandard)) {
                    return mediaCodecInfo;
                }
            }
            return null;
        } catch (Exception e2) {
            m157039xeb03009f("HwVideoEncoderFactory", "Cannot getCodecCount", e2);
            return null;
        }
    }

    private static int getKeyFrameIntervalSec(RXVideoCodecStandard rXVideoCodecStandard) {
        int i = C902941.$SwitchMap$org$webrtc$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1 || i == 2) {
            return 20;
        }
        if (i == 3 || i == 4) {
            return 100;
        }
        throw new IllegalArgumentException("Unsupported VideoCodecType ".concat(String.valueOf(rXVideoCodecStandard)));
    }

    private static boolean isHardwareSupportedInCurrentSdkByteVC1(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            int i = Build.VERSION.SDK_INT;
            return true;
        } else if (!name.startsWith("OMX.Exynos.") || Build.VERSION.SDK_INT < 21) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            int i = Build.VERSION.SDK_INT;
            return true;
        } else if (name.startsWith("OMX.Exynos.")) {
            if (Build.VERSION.SDK_INT >= 21) {
                return true;
            }
            return false;
        } else if (Build.VERSION.SDK_INT >= 21) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTrustedCodec(RXVideoCodecDesc rXVideoCodecDesc) {
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        if (standard != RXVideoCodecStandard.H264) {
            return false;
        }
        MediaCodecInfo findCodecForType = findCodecForType(standard);
        if (findCodecForType != null && findCodecForType.getName() != null) {
            return findCodecForType.getName().startsWith("OMX.qcom.");
        }
        m157038xeb03009f("HwVideoEncoderFactory", "get null or wrong codec");
        return false;
    }

    public VideoEncoder createEncoder(RXVideoCodecDesc rXVideoCodecDesc) {
        int i = Build.VERSION.SDK_INT;
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        MediaCodecInfo findCodecForType = findCodecForType(standard);
        if (findCodecForType == null) {
            return null;
        }
        String name = findCodecForType.getName();
        String mimeType = standard.mimeType();
        Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        if (selectColorFormat == null) {
            m157038xeb03009f("HwVideoEncoderFactory", "surfaceColorFormat is null object.");
            return null;
        }
        Integer selectColorFormat2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        if (selectColorFormat2 == null) {
            m157038xeb03009f("HwVideoEncoderFactory", "yuvColorFormat is null object.");
            return null;
        }
        if (this.sharedContext == null) {
            m157040xeb0300b1("HwVideoEncoderFactory", "No shared EglBase.Context.  Encoders will not use texture mode.");
        }
        return new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, rXVideoCodecDesc, selectColorFormat, selectColorFormat2, getKeyFrameIntervalSec(standard), getForcedKeyFrameIntervalMs(standard, name), this.sharedContext);
    }

    private static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        int i = C902941.$SwitchMap$org$webrtc$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        if (i != 2) {
            return false;
        }
        return isHardwareSupportedInCurrentSdkByteVC1(mediaCodecInfo);
    }

    private static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) == null) {
                return false;
            }
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo, rXVideoCodecStandard);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static int getForcedKeyFrameIntervalMs(RXVideoCodecStandard rXVideoCodecStandard, String str) {
        if (rXVideoCodecStandard != RXVideoCodecStandard.VP8 || !str.startsWith("OMX.qcom.")) {
            return 0;
        }
        if (!(Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22)) {
            if (Build.VERSION.SDK_INT == 23) {
                return 20000;
            }
            if (Build.VERSION.SDK_INT > 23) {
                return 15000;
            }
            return 0;
        }
        return 15000;
    }
}
