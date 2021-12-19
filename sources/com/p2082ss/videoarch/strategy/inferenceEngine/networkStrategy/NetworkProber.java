package com.p2082ss.videoarch.strategy.inferenceEngine.networkStrategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.videoarch.strategy.NativeObject;

/* renamed from: com.ss.videoarch.strategy.inferenceEngine.networkStrategy.NetworkProber */
public class NetworkProber extends NativeObject {

    /* renamed from: f */
    private static volatile NetworkProber f197574f;

    /* renamed from: a */
    public int f197575a = -1;

    /* renamed from: b */
    private final String f197576b = "probe_udp";

    /* renamed from: c */
    private final String f197577c = "probe_quic";

    /* renamed from: d */
    private final String f197578d = "udp";

    /* renamed from: e */
    private final String f197579e = "tcp";

    static {
        Covode.recordClassIndex(103032);
    }

    public native int nativeNetworkReachableProbe(String str, String str2, int i);

    /* renamed from: a */
    public static NetworkProber m151266a() {
        MethodCollector.m26663i(9858);
        if (f197574f == null) {
            synchronized (NetworkProber.class) {
                try {
                    if (f197574f == null) {
                        f197574f = new NetworkProber();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9858);
                    throw th;
                }
            }
        }
        NetworkProber networkProber = f197574f;
        MethodCollector.m26664o(9858);
        return networkProber;
    }
}
