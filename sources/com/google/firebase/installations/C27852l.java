package com.google.firebase.installations;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: com.google.firebase.installations.l */
public final class C27852l {

    /* renamed from: a */
    private static final byte f65425a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f65426b = Byte.parseByte("00001111", 2);

    static {
        Covode.recordClassIndex(33441);
    }

    /* renamed from: a */
    public static String m55752a() {
        byte[] a = m55754a(UUID.randomUUID(), new byte[17]);
        a[16] = a[0];
        a[0] = (byte) ((f65426b & a[0]) | f65425a);
        return m55753a(a);
    }

    /* renamed from: a */
    private static String m55753a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: a */
    private static byte[] m55754a(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }
}
