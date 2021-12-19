package com.p2082ss.bduploader.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.net.BDUploadDNSParserListener */
public interface BDUploadDNSParserListener {
    static {
        Covode.recordClassIndex(100822);
    }

    void onCompletion(int i, String str, String str2, long j, String str3);
}
