package com.p2082ss.avframework.codec;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioEncoder;
import com.p2082ss.avframework.engine.AudioEncoderFactory;
import com.p2082ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.codec.DefaultAudioEncoderFactory */
public class DefaultAudioEncoderFactory extends AudioEncoderFactory {
    private static final String TAG = DefaultAudioEncoderFactory.class.getName();

    private native AudioEncoder nativeDefaultCreateAudioEncoder(String str, boolean z);

    private native String nativeDefaultGetSupportedFormats();

    static {
        Covode.recordClassIndex(99899);
    }

    @Override // com.p2082ss.avframework.engine.AudioEncoderFactory
    public String GetSupportedFormats() {
        MethodCollector.m26663i(4252);
        String GetSupportedFormats = AACHWAudioEncoder.GetSupportedFormats();
        String nativeDefaultGetSupportedFormats = nativeDefaultGetSupportedFormats();
        if (nativeDefaultGetSupportedFormats != null && !nativeDefaultGetSupportedFormats.isEmpty()) {
            GetSupportedFormats = GetSupportedFormats + ":" + nativeDefaultGetSupportedFormats;
        }
        MethodCollector.m26664o(4252);
        return GetSupportedFormats;
    }

    @Override // com.p2082ss.avframework.engine.AudioEncoderFactory
    public AudioEncoder CreateAudioEncoder(String str, boolean z) {
        String str2;
        AACHWAudioEncoder aACHWAudioEncoder;
        MethodCollector.m26663i(4135);
        String[] split = str.split(":");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str3 = split[i];
            if (str3.contains("audio_type")) {
                String[] split2 = str3.split("=");
                if (split2.length > 1) {
                    str2 = split2[1];
                }
            } else {
                i++;
            }
        }
        str2 = "";
        if (str2.equalsIgnoreCase("audio/mp4a-latm")) {
            AACHWAudioEncoder aACHWAudioEncoder2 = new AACHWAudioEncoder();
            boolean z2 = aACHWAudioEncoder2.setupCodecName();
            aACHWAudioEncoder = aACHWAudioEncoder2;
            if (!z2) {
                AVLog.ioe(TAG, str2 + " is not supported on this device.");
                aACHWAudioEncoder2.release();
            }
            MethodCollector.m26664o(4135);
            return aACHWAudioEncoder;
        }
        aACHWAudioEncoder = nativeDefaultCreateAudioEncoder(str, z);
        MethodCollector.m26664o(4135);
        return aACHWAudioEncoder;
    }
}
