package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.r */
public interface AbstractC24502r {
    static {
        Covode.recordClassIndex(28646);
    }

    void close();

    void copy(int i, AbstractC24502r rVar, int i2, int i3);

    ByteBuffer getByteBuffer();

    long getNativePtr();

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte read(int i);

    int read(int i, byte[] bArr, int i2, int i3);

    int write(int i, byte[] bArr, int i2, int i3);
}
