package com.p2082ss.ttvideoengine.p4430s;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;

/* renamed from: com.ss.ttvideoengine.s.g */
public final class C86638g {

    /* renamed from: a */
    public long f195266a;

    /* renamed from: b */
    public long f195267b;

    /* renamed from: c */
    public long f195268c;

    static {
        Covode.recordClassIndex(101866);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.s.g$a */
    public static class C86639a extends Exception {
        static {
            Covode.recordClassIndex(101867);
        }

        public C86639a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public final boolean mo137912a(String str) {
        try {
            return m150073a(InetAddress.getByName(str));
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0157, code lost:
        if (0 == 0) goto L_0x015f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m150073a(java.net.InetAddress r22) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4430s.C86638g.m150073a(java.net.InetAddress):boolean");
    }

    /* renamed from: a */
    private static long m150072a(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int i2 = b & 128;
        byte b5 = b;
        if (i2 == 128) {
            b5 = (b & Byte.MAX_VALUE) + 128;
        }
        int i3 = b2 & 128;
        byte b6 = b2;
        if (i3 == 128) {
            b6 = (b2 & Byte.MAX_VALUE) + 128;
        }
        int i4 = b3 & 128;
        byte b7 = b3;
        if (i4 == 128) {
            b7 = (b3 & Byte.MAX_VALUE) + 128;
        }
        int i5 = b4 & 128;
        byte b8 = b4;
        if (i5 == 128) {
            b8 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return ((b5 == 1 ? 1 : 0) << 24) + ((b6 == 1 ? 1 : 0) << 16) + ((b7 == 1 ? 1 : 0) << 8) + (b8 == 1 ? 1 : 0);
    }

    /* renamed from: b */
    private static long m150074b(byte[] bArr, int i) {
        long a = m150072a(bArr, i);
        long a2 = m150072a(bArr, i + 4);
        if (a == 0 && a2 == 0) {
            return 0;
        }
        return ((a - 2208988800L) * 1000) + ((a2 * 1000) / 4294967296L);
    }
}
