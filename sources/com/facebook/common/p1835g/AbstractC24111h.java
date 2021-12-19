package com.facebook.common.p1835g;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.common.g.h */
public interface AbstractC24111h extends Closeable {
    static {
        Covode.recordClassIndex(28239);
    }

    /* renamed from: a */
    byte mo39672a(int i);

    /* renamed from: a */
    int mo39673a();

    /* renamed from: a */
    int mo39674a(int i, byte[] bArr, int i2, int i3);

    /* renamed from: b */
    long mo39675b();

    /* renamed from: c */
    ByteBuffer mo39676c();

    /* renamed from: d */
    boolean mo39677d();

    /* renamed from: com.facebook.common.g.h$a */
    public static class C24112a extends RuntimeException {
        static {
            Covode.recordClassIndex(28240);
        }

        public C24112a() {
            super("Invalid bytebuf. Already closed");
        }
    }
}
