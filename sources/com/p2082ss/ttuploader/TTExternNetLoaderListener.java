package com.p2082ss.ttuploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttuploader.TTExternNetLoaderListener */
public interface TTExternNetLoaderListener {
    static {
        Covode.recordClassIndex(101470);
    }

    void onComplete(TTExternResponseInfo tTExternResponseInfo);

    void onFailed(String str, Throwable th);

    int readFileData(byte[] bArr, long j, int i);
}
