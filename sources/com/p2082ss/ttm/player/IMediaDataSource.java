package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

/* renamed from: com.ss.ttm.player.IMediaDataSource */
public interface IMediaDataSource extends Closeable {
    static {
        Covode.recordClassIndex(101388);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long getSize();

    int readAt(long j, byte[] bArr, int i, int i2);
}
