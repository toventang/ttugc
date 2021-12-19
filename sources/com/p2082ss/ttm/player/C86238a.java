package com.p2082ss.ttm.player;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.ttm.player.a */
public final class C86238a {

    /* renamed from: d */
    private static Map<String, Integer> f192639d;

    /* renamed from: a */
    public MediaCodecInfo f192640a;

    /* renamed from: b */
    public int f192641b;

    /* renamed from: c */
    public String f192642c;

    static {
        Covode.recordClassIndex(101415);
    }

    /* renamed from: a */
    public static C86238a m148294a(MediaCodecInfo mediaCodecInfo, String str) {
        if (mediaCodecInfo == null) {
            return null;
        }
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        Map<String, Integer> map = f192639d;
        if (map == null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            f192639d = treeMap;
            treeMap.put("OMX.qcom.video.decoder.avc", 100);
            f192639d.put("OMX.qcom.video.decoder.hevc", 100);
            f192639d.put("OMX.qcom.video.decoder.hevcswvdec", 20);
            f192639d.put("OMX.MTK.VIDEO.DECODER.HEVC", 100);
            f192639d.put("OMX.MTK.VIDEO.DECODER.AVC", 100);
            f192639d.put("OMX.Nvidia.h264.decode", 100);
            f192639d.put("OMX.Intel.hw_vd.h264", 100);
            f192639d.put("OMX.Intel.VideoDecoder.AVC", 99);
            f192639d.put("OMX.SEC.avc.dec", 100);
            f192639d.put("OMX.SEC.AVC.Decoder", 99);
            f192639d.put("OMX.SEC.avcdec", 98);
            f192639d.put("OMX.SEC.avc.sw.dec", 20);
            f192639d.put("OMX.SEC.hevc.sw.dec", 20);
            f192639d.put("OMX.Exynos.avc.dec", 100);
            f192639d.put("OMX.Exynos.AVC.Decoder", 99);
            f192639d.put("OMX.TI.DUCATI1.VIDEO.DECODER", 100);
            f192639d.put("OMX.rk.video_decoder.avc", 100);
            f192639d.put("OMX.amlogic.avc.decoder.awesome", 100);
            f192639d.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 100);
            f192639d.put("OMX.brcm.video.h264.hw.decoder", 40);
            f192639d.put("OMX.k3.video.decoder.avc", 40);
            f192639d.put("OMX.IMG.MSVDX.Decoder.AVC", 100);
            f192639d.put("OMX.hisi.video.decoder.avc", 100);
            f192639d.put("OMX.hisi.video.decoder.hevc", 100);
            f192639d.put("OMX.MARVELL.VIDEO.H264DECODER", 20);
            f192639d.put("OMX.sprd.soft.h264.decoder", 20);
            map = f192639d;
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
        C86238a aVar = new C86238a();
        aVar.f192640a = mediaCodecInfo;
        aVar.f192642c = str;
        aVar.f192641b = i;
        return aVar;
    }
}
