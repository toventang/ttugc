package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDExternalFileReader */
public interface BDExternalFileReader {
    static {
        Covode.recordClassIndex(100775);
    }

    void cancel();

    long getCrc32ByOffset(long j, int i);

    long getValue(int i);

    int readSlice(int i, byte[] bArr, int i2);

    int readSliceByOffset(long j, byte[] bArr, int i, int i2);
}
