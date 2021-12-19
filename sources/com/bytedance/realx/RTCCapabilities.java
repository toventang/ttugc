package com.bytedance.realx;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;
import java.util.List;

public class RTCCapabilities {
    private List<String> supportedVideoCodecs;

    static {
        Covode.recordClassIndex(25631);
    }

    private static native String[] nativeGetSupportedVideoCodecs(long j);

    public List<String> getSupportedVideoCodecs() {
        return this.supportedVideoCodecs;
    }

    public RTCCapabilities(List<String> list) {
        this.supportedVideoCodecs = list;
    }

    public RTCCapabilities(long j) {
        MethodCollector.m26663i(448);
        this.supportedVideoCodecs = Arrays.asList(nativeGetSupportedVideoCodecs(j));
        MethodCollector.m26664o(448);
    }
}
