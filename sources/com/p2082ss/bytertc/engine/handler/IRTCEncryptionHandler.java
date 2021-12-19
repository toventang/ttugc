package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.handler.IRTCEncryptionHandler */
public interface IRTCEncryptionHandler {
    static {
        Covode.recordClassIndex(101019);
    }

    byte[] onDecryptData(byte[] bArr);

    byte[] onEncryptData(byte[] bArr);
}
