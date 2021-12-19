package com.p2082ss.ttuploader.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttuploader.net.TTUploadDNSParserListener */
public interface TTUploadDNSParserListener {
    static {
        Covode.recordClassIndex(101520);
    }

    void onCompletion(int i, String str, String str2, long j, String str3);
}
