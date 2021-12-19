package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDMediaDataReader */
public interface BDMediaDataReader {
    static {
        Covode.recordClassIndex(100786);
    }

    int close(int i);

    long getValue(int i, int i2);

    int open(int i);

    int read(int i, long j, byte[] bArr, int i2);
}
