package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public class ImportantFileWriterAndroid {
    static {
        Covode.recordClassIndex(103345);
    }

    private static native boolean nativeWriteFileAtomically(String str, byte[] bArr);
}
