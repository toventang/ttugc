package com.p2082ss.android.p2153j;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;

/* renamed from: com.ss.android.j.c */
public final class C29950c {

    /* renamed from: a */
    private static final char[] f71437a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.j.c$a */
    public static class C29951a {

        /* renamed from: a */
        public int f71438a;

        /* renamed from: b */
        public int f71439b;

        /* renamed from: c */
        public int f71440c;

        /* renamed from: d */
        public long f71441d;

        /* renamed from: e */
        public String f71442e;

        static {
            Covode.recordClassIndex(36364);
        }

        private C29951a() {
        }

        /* synthetic */ C29951a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(36363);
    }

    /* renamed from: a */
    private static String m60356a(long j) {
        return Long.toHexString((j << 4) + 31);
    }

    /* renamed from: b */
    private static long m60359b(String str) {
        try {
            return (Long.parseLong(str, 16) - 31) >> 4;
        } catch (Throwable unused) {
            throw new RuntimeException("ttmd5 decryptNum error, num = ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: a */
    private static C29951a m60355a(String str) {
        if (!str.startsWith("ttmd5:")) {
            return null;
        }
        String[] split = str.split(";");
        String[] split2 = split[0].split(":");
        C29951a aVar = new C29951a((byte) 0);
        aVar.f71438a = Integer.parseInt(split2[1]);
        if (aVar.f71438a > 1) {
            return aVar;
        }
        aVar.f71439b = Integer.parseInt(split2[2]);
        String[] split3 = split2[3].split("g");
        aVar.f71440c = (int) m60359b(split3[0]);
        aVar.f71441d = m60359b(split3[1]);
        aVar.f71442e = split[1];
        return aVar;
    }

    /* renamed from: a */
    public static int m60354a(String str, File file, AbstractC29949b bVar) {
        String str2;
        if (str == null || str.length() == 0) {
            return 2;
        }
        if (bVar != null) {
            try {
                if (bVar.mo52275a() <= 0) {
                    try {
                        bVar.mo52277b();
                    } catch (Throwable unused) {
                    }
                    return 5;
                }
            } catch (Throwable unused2) {
                return 99;
            }
        } else if (file == null || !file.exists()) {
            return 5;
        }
        int i = -1;
        long j = -1;
        try {
            C29951a a = m60355a(str);
            if (a != null) {
                if (a.f71438a > 1) {
                    return 3;
                }
                i = a.f71440c;
                j = a.f71441d;
            }
            C29951a aVar = null;
            if (bVar != null) {
                try {
                    str2 = m60357a(bVar, i, j);
                } catch (Throwable unused3) {
                    return 6;
                }
            } else {
                str2 = m60357a(new C29948a(file), i, j);
            }
            if (str2 == null || str2.length() == 0) {
                return 6;
            }
            if (a == null || (a.f71438a == 1 && a.f71439b == 1)) {
                if (str2.equals(str)) {
                    return 0;
                }
            } else if (a.f71442e != null) {
                try {
                    aVar = m60355a(str2);
                } catch (Throwable unused4) {
                }
                if (aVar == null || a.f71440c != aVar.f71440c || a.f71441d != aVar.f71441d || !a.f71442e.equals(aVar.f71442e)) {
                    return 1;
                }
                return 0;
            }
            return 1;
        } catch (Throwable unused5) {
            return 4;
        }
    }

    /* renamed from: a */
    private static String m60357a(AbstractC29949b bVar, int i, long j) {
        int i2 = i;
        long j2 = j;
        MessageDigest instance = MessageDigest.getInstance("MD5");
        if (instance == null) {
            return "";
        }
        try {
            long a = bVar.mo52275a();
            long j3 = 0;
            if (i2 <= 0 || j2 <= 0 || ((long) i2) * j2 > (8 * a) / 10) {
                j2 = a;
                i2 = 1;
            }
            byte[] bArr = new byte[8192];
            m60358a(bVar, instance, bArr, 0, j2);
            if (i2 > 2) {
                int i3 = i2 - 1;
                long j4 = (a - (((long) i2) * j2)) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    j3 += j2 + j4;
                    m60358a(bVar, instance, bArr, j3, j2);
                }
            }
            if (i2 > 1) {
                m60358a(bVar, instance, bArr, a - j2, j2);
            }
            byte[] digest = instance.digest();
            if (digest != null) {
                int length = digest.length;
                int i5 = length * 2;
                char[] cArr = new char[i5];
                int i6 = 0;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = digest[i7 + 0] & 255;
                    int i9 = i6 + 1;
                    char[] cArr2 = f71437a;
                    cArr[i6] = cArr2[i8 >> 4];
                    i6 = i9 + 1;
                    cArr[i9] = cArr2[i8 & 15];
                }
                String str = new String(cArr, 0, i5);
                if (i2 == 1 && j2 == a) {
                    try {
                        bVar.mo52277b();
                    } catch (Throwable unused) {
                    }
                    return str;
                }
                String str2 = ("ttmd5:1:1:" + m60356a((long) i2) + "g" + m60356a(j2)) + ";" + str;
                try {
                    bVar.mo52277b();
                } catch (Throwable unused2) {
                }
                return str2;
            }
            throw new NullPointerException("bytes is null");
        } catch (Throwable unused3) {
        }
        throw th;
    }

    /* renamed from: a */
    private static void m60358a(AbstractC29949b bVar, MessageDigest messageDigest, byte[] bArr, long j, long j2) {
        bVar.mo52276a(j);
        long j3 = 0;
        while (j3 < j2) {
            int a = bVar.mo52274a(bArr, (int) Math.min(j2 - j3, 8192L));
            if (a > 0) {
                messageDigest.update(bArr, 0, a);
                j3 += (long) a;
            } else {
                throw new IOException("updateSample unexpected readCount <= 0, readCount = " + a + ", readTotalCount = " + j3 + ", sampleSize = " + j2);
            }
        }
    }
}
