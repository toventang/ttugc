package com.p2082ss.mediakit.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.net.AVMDLDNSParserListener */
public interface AVMDLDNSParserListener {
    static {
        Covode.recordClassIndex(101225);
    }

    void onCompletion(int i, String str, String str2, long j, String str3, int i2);
}
