package com.bytedance.android.livesdk.utils.p653a;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import java.net.InetAddress;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.utils.a.f */
public final class C11205f {

    /* renamed from: a */
    public long f26847a;

    /* renamed from: b */
    public long f26848b;

    /* renamed from: c */
    public long f26849c;

    static {
        Covode.recordClassIndex(12833);
    }

    C11205f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.utils.a.f$a */
    public static class C11206a extends Exception {
        static {
            Covode.recordClassIndex(12834);
        }

        C11206a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    private static long m19859a(byte[] bArr, int i) {
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
    private static long m19861b(byte[] bArr, int i) {
        long a = m19859a(bArr, i);
        long a2 = m19859a(bArr, i + 4);
        if (a == 0 && a2 == 0) {
            return 0;
        }
        return ((a - 2208988800L) * 1000) + ((a2 * 1000) / 4294967296L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo17972a(String str, int i) {
        try {
            return m19860a(InetAddress.getByName(str), i);
        } catch (Exception e) {
            C3854a.m9453a(6, "SntpClient", e.toString());
            C3854a.m9453a(3, "SntpClient", "request time failed: ".concat(String.valueOf(e)));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0162, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017b, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19860a(java.net.InetAddress r22, int r23) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.p653a.C11205f.m19860a(java.net.InetAddress, int):boolean");
    }
}
