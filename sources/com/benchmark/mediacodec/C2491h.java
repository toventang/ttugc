package com.benchmark.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.bytedance.covode.number.Covode;

/* renamed from: com.benchmark.mediacodec.h */
public final class C2491h {
    static {
        Covode.recordClassIndex(2847);
    }

    /* renamed from: a */
    static MediaCodecInfo m7353a(String str) {
        String[] supportedTypes;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
