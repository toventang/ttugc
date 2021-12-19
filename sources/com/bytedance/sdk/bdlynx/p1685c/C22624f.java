package com.bytedance.sdk.bdlynx.p1685c;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.sdk.bdlynx.c.f */
public final class C22624f {

    /* renamed from: a */
    public static final C22624f f53438a = new C22624f();

    /* renamed from: b */
    private static final byte[] f53439b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};

    private C22624f() {
    }

    static {
        Covode.recordClassIndex(26440);
    }

    /* renamed from: a */
    public static String m42681a() {
        Random random;
        if (Build.VERSION.SDK_INT >= 21) {
            random = ThreadLocalRandom.current();
            C89219l.m154709a((Object) random, "");
        } else {
            random = new Random(System.nanoTime());
        }
        long nextLong = random.nextLong();
        long nextLong2 = random.nextLong();
        byte[] bArr = new byte[32];
        m42682a(nextLong, bArr, 20, 12);
        m42682a(nextLong >>> 48, bArr, 16, 4);
        m42682a(nextLong2, bArr, 12, 4);
        m42682a(nextLong2 >>> 16, bArr, 8, 4);
        m42682a(nextLong2 >>> 32, bArr, 0, 8);
        return new String(bArr, C89338d.f202990a);
    }

    /* renamed from: a */
    private static void m42682a(long j, byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        do {
            i3--;
            bArr[i3] = f53439b[((int) j) & 15];
            j >>>= 4;
        } while (i3 > i);
    }
}
