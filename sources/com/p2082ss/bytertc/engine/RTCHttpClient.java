package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.RTCHttpClient */
public interface RTCHttpClient {

    /* renamed from: com.ss.bytertc.engine.RTCHttpClient$RtcHttpCallback */
    public interface RtcHttpCallback {
        static {
            Covode.recordClassIndex(100936);
        }

        void run(int i, String str);
    }

    static {
        Covode.recordClassIndex(100935);
    }

    void GetAsync(String str, RtcHttpCallback rtcHttpCallback, int i);

    void PostAsync(String str, String str2, RtcHttpCallback rtcHttpCallback, int i);
}
