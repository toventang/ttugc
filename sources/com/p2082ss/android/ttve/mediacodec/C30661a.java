package com.p2082ss.android.ttve.mediacodec;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.android.ttve.mediacodec.a */
public final class C30661a {

    /* renamed from: d */
    private static Map<String, Integer> f73328d;

    /* renamed from: a */
    public MediaCodecInfo f73329a;

    /* renamed from: b */
    public int f73330b;

    /* renamed from: c */
    public String f73331c;

    static {
        Covode.recordClassIndex(37214);
    }

    /* renamed from: a */
    public static C30661a m63019a(MediaCodecInfo mediaCodecInfo, String str) {
        if (mediaCodecInfo == null) {
            return null;
        }
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        Map<String, Integer> map = f73328d;
        if (map == null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            f73328d = treeMap;
            treeMap.put("OMX.qcom.video.decoder.avc", 100);
            f73328d.put("OMX.qcom.video.decoder.hevc", 100);
            f73328d.put("OMX.qcom.video.decoder.hevcswvdec", 20);
            f73328d.put("OMX.qcom.video.decoder.mpeg4", 100);
            f73328d.put("OMX.qcom.video.decoder.mpeg2", 100);
            f73328d.put("OMX.qcom.video.decoder.vp8", 100);
            f73328d.put("OMX.qcom.video.decoder.vp9", 100);
            f73328d.put("OMX.MTK.VIDEO.DECODER.HEVC", 100);
            f73328d.put("OMX.MTK.VIDEO.DECODER.AVC", 100);
            f73328d.put("OMX.MTK.VIDEO.DECODER.MPEG2", 100);
            f73328d.put("OMX.MTK.VIDEO.DECODER.MPEG4", 100);
            f73328d.put("OMX.MTK.VIDEO.DECODER.VP9", 100);
            f73328d.put("OMX.MTK.VIDEO.DECODER.VPX", 100);
            f73328d.put("OMX.Nvidia.h264.decode", 100);
            f73328d.put("OMX.Intel.hw_vd.h264", 100);
            f73328d.put("OMX.Intel.VideoDecoder.AVC", 99);
            f73328d.put("OMX.SEC.avc.dec", 100);
            f73328d.put("OMX.SEC.AVC.Decoder", 99);
            f73328d.put("OMX.SEC.avcdec", 98);
            f73328d.put("OMX.SEC.avc.sw.dec", 20);
            f73328d.put("OMX.SEC.hevc.sw.dec", 20);
            f73328d.put("OMX.SEC.mpeg4.dec", 100);
            f73328d.put("OMX.SEC.mpeg2.dec", 100);
            f73328d.put("OMX.SEC.vp8.dec", 100);
            f73328d.put("OMX.SEC.vp9.dec", 100);
            f73328d.put("OMX.Exynos.avc.dec", 100);
            f73328d.put("OMX.Exynos.AVC.Decoder", 99);
            f73328d.put("OMX.Exynos.MPEG4.Decoder", 100);
            f73328d.put("OMX.Exynos.MPEG2.Decoder", 100);
            f73328d.put("OMX.Exynos.VP8.Decoder", 100);
            f73328d.put("OMX.Exynos.VP9.Decoder", 100);
            f73328d.put("OMX.TI.DUCATI1.VIDEO.DECODER", 100);
            f73328d.put("OMX.rk.video_decoder.avc", 100);
            f73328d.put("OMX.amlogic.avc.decoder.awesome", 100);
            f73328d.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 100);
            f73328d.put("OMX.brcm.video.h264.hw.decoder", 40);
            f73328d.put("OMX.k3.video.decoder.avc", 40);
            f73328d.put("OMX.IMG.MSVDX.Decoder.AVC", 100);
            f73328d.put("OMX.hisi.video.decoder.avc", 100);
            f73328d.put("OMX.hisi.video.decoder.hevc", 100);
            f73328d.put("OMX.hisi.video.decoder.mpeg4", 100);
            f73328d.put("OMX.hisi.video.decoder.mpeg2", 100);
            f73328d.put("OMX.hisi.video.decoder.vp8", 100);
            f73328d.put("OMX.hisi.video.decoder.vp9", 100);
            f73328d.put("OMX.MARVELL.VIDEO.H264DECODER", 20);
            f73328d.put("OMX.sprd.soft.h264.decoder", 20);
            map = f73328d;
        }
        Integer num = map.get(name);
        int i = 60;
        if (num != null) {
            i = num.intValue();
        } else {
            try {
                if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                    i = 70;
                }
            } catch (Exception unused) {
            }
        }
        C30661a aVar = new C30661a();
        aVar.f73329a = mediaCodecInfo;
        aVar.f73331c = str;
        aVar.f73330b = i;
        return aVar;
    }
}
