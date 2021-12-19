package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.IMetadataObserver */
public interface IMetadataObserver {
    static {
        Covode.recordClassIndex(100887);
    }

    void onMetadataReceived(byte[] bArr, String str, long j);

    byte[] onReadyToSendMetadata(long j);
}
