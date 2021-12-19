package com.p2024he.lynx.loader;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.he.lynx.loader.Resolver */
public interface Resolver {
    static {
        Covode.recordClassIndex(33791);
    }

    void reject(IOException iOException);

    void resolve(File file);

    void resolve(ByteBuffer byteBuffer);

    void resolve(byte[] bArr, int i, int i2);
}
