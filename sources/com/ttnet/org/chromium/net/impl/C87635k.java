package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ttnet.org.chromium.net.impl.k */
public final class C87635k {
    static {
        Covode.recordClassIndex(103617);
    }

    /* renamed from: a */
    static void m152363a(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    /* renamed from: b */
    static void m152364b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }
}
