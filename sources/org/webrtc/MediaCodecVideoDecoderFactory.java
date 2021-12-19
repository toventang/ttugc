package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.webrtc.EglBase;

class MediaCodecVideoDecoderFactory {
    private EglBase.Context sharedContext;

    static {
        Covode.recordClassIndex(106666);
    }

    public RXVideoCodecDesc[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        RXVideoCodecStandard rXVideoCodecStandard = RXVideoCodecStandard.H264;
        MediaCodecInfo findCodecForType = findCodecForType(rXVideoCodecStandard);
        if (findCodecForType != null) {
            if (isH264HighProfileSupported(findCodecForType, rXVideoCodecStandard)) {
                arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
            }
            arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
        }
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    public void setHardwareContext(EglBase.Context context) {
        this.sharedContext = context;
    }

    public MediaCodecVideoDecoderFactory(EglBase.Context context) {
        this.sharedContext = context;
    }

    private MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        MediaCodecInfo mediaCodecInfo;
        int i = Build.VERSION.SDK_INT;
        for (int i2 = 0; i2 < MediaCodecList.getCodecCount(); i2++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i2);
            } catch (IllegalArgumentException e) {
                Logging.m157043e("MediaCodecVideoDecoderFactory", "Cannot retrieve decoder codec info", e);
                mediaCodecInfo = null;
            }
            if (!(mediaCodecInfo == null || mediaCodecInfo.isEncoder() || !isSupportedCodec(mediaCodecInfo, rXVideoCodecStandard))) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    public VideoDecoder createDecoder(RXVideoCodecDesc rXVideoCodecDesc) {
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        MediaCodecInfo findCodecForType = findCodecForType(standard);
        if (findCodecForType == null) {
            return null;
        }
        return new AndroidVideoDecoder(new MediaCodecWrapperFactoryImpl(), findCodecForType.getName(), standard, MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(standard.mimeType())).intValue(), this.sharedContext);
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        mediaCodecInfo.getName();
        if (MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard) && MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) != null) {
            return true;
        }
        return false;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        String name = mediaCodecInfo.getName();
        if (Build.VERSION.SDK_INT >= 21 && name.startsWith("OMX.qcom.")) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 23 && name.startsWith("OMX.Exynos.")) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType());
        for (int i = 0; i < capabilitiesForType.profileLevels.length; i++) {
            if (8 == capabilitiesForType.profileLevels[i].profile) {
                return true;
            }
        }
        return false;
    }
}
