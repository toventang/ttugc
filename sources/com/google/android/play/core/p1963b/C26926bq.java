package com.google.android.play.core.p1963b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.b.bq */
public final class C26926bq {
    static {
        Covode.recordClassIndex(32401);
    }

    /* renamed from: a */
    private static int m53476a(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    /* renamed from: a */
    private static long m53477a(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* renamed from: a */
    private static Pair<ByteBuffer, Long> m53478a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> a = m53479a(randomAccessFile, 0);
        return a != null ? a : m53479a(randomAccessFile, 65535);
    }

    /* renamed from: a */
    private static Pair<ByteBuffer, Long> m53479a(RandomAccessFile randomAccessFile, int i) {
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, -22 + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m53483a(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i2 = capacity2 - 22;
            int min = Math.min(i2, 65535);
            int i3 = 0;
            while (true) {
                if (i3 >= min) {
                    break;
                }
                int i4 = i2 - i3;
                if (allocate.getInt(i4) != 101010256 || ((char) allocate.getShort(i4 + 20)) != i3) {
                    i3++;
                } else if (i4 != -1) {
                    allocate.position(i4);
                    ByteBuffer slice = allocate.slice();
                    slice.order(ByteOrder.LITTLE_ENDIAN);
                    return Pair.create(slice, Long.valueOf(capacity + ((long) i4)));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m53480a(String str, String str2) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m53481a(String str, String str2, String str3) {
        int length = str.length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 2 + length2 + String.valueOf(str3).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m53482a(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* renamed from: a */
    private static void m53483a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0162 A[Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.cert.X509Certificate[] m53485a(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) {
        /*
        // Method dump skipped, instructions count: 758
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1963b.C26926bq.m53485a(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    /* renamed from: a */
    private static byte[][] m53486a(int[] iArr, AbstractC26904av[] avVarArr) {
        long j;
        int i;
        int length;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (avVarArr[i2].mo44590a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            int i3 = (int) j3;
            byte[][] bArr = new byte[iArr.length][];
            int i4 = 0;
            while (true) {
                length = iArr.length;
                if (i4 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((m53492c(iArr[i4]) * i3) + 5)];
                bArr2[0] = 90;
                m53482a(i3, bArr2);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String b = m53489b(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(b);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(b.concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i6 < i; i = 3) {
                AbstractC26904av avVar = avVarArr[i6];
                long a = avVar.mo44590a();
                long j4 = 0;
                while (a > j2) {
                    int min = (int) Math.min(a, j);
                    m53482a(min, bArr3);
                    for (int i9 = 0; i9 < length; i9++) {
                        messageDigestArr[i9].update(bArr3);
                    }
                    avVar = avVar;
                    try {
                        avVar.mo44591a(messageDigestArr, j4, min);
                        for (int i10 = 0; i10 < iArr.length; i10++) {
                            int i11 = iArr[i10];
                            byte[] bArr4 = bArr[i10];
                            int c = m53492c(i11);
                            MessageDigest messageDigest = messageDigestArr[i10];
                            int digest = messageDigest.digest(bArr4, (i7 * c) + 5, c);
                            if (digest != c) {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        long j5 = (long) min;
                        j4 += j5;
                        a -= j5;
                        i7++;
                        j2 = 0;
                        j = 1048576;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i7);
                        sb2.append(" of section #");
                        sb2.append(i8);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                i8++;
                i6++;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr5 = new byte[iArr.length][];
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                byte[] bArr6 = bArr[i12];
                String b2 = m53489b(i13);
                try {
                    bArr5[i12] = MessageDigest.getInstance(b2).digest(bArr6);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(b2.concat(" digest not supported"), e3);
                }
            }
            return bArr5;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    /* renamed from: b */
    private static String m53489b(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private static ByteBuffer m53490b(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m53491b(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: b */
    private static ByteBuffer m53491b(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static int m53492c(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private static byte[] m53493c(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static X509Certificate[][] m53487a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> a = m53478a(randomAccessFile);
            if (a != null) {
                ByteBuffer byteBuffer = (ByteBuffer) a.first;
                long longValue = ((Long) a.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new C26923bn("ZIP64 APK not supported");
                    }
                }
                m53483a(byteBuffer);
                long a2 = m53477a(byteBuffer, byteBuffer.position() + 16);
                if (a2 < longValue) {
                    m53483a(byteBuffer);
                    if (m53477a(byteBuffer, byteBuffer.position() + 12) + a2 != longValue) {
                        throw new C26923bn("ZIP Central Directory is not immediately followed by End of Central Directory");
                    } else if (a2 >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(a2 - ((long) allocate.capacity()));
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        int i = 8;
                        if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                            int i2 = 0;
                            long j2 = allocate.getLong(0);
                            if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                                StringBuilder sb = new StringBuilder(57);
                                sb.append("APK Signing Block size out of range: ");
                                sb.append(j2);
                                throw new C26923bn(sb.toString());
                            }
                            int i3 = (int) (8 + j2);
                            long j3 = a2 - ((long) i3);
                            if (j3 >= 0) {
                                ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                                randomAccessFile.seek(j3);
                                randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                long j4 = allocate2.getLong(0);
                                if (j4 == j2) {
                                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                    long longValue2 = ((Long) create.second).longValue();
                                    if (byteBuffer2.order() == ByteOrder.LITTLE_ENDIAN) {
                                        int capacity = byteBuffer2.capacity() - 24;
                                        if (capacity >= 8) {
                                            int capacity2 = byteBuffer2.capacity();
                                            if (capacity <= byteBuffer2.capacity()) {
                                                int limit = byteBuffer2.limit();
                                                int position = byteBuffer2.position();
                                                try {
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(capacity);
                                                    byteBuffer2.position(8);
                                                    ByteBuffer slice = byteBuffer2.slice();
                                                    slice.order(byteBuffer2.order());
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(limit);
                                                    byteBuffer2.position(position);
                                                    while (slice.hasRemaining()) {
                                                        i2++;
                                                        if (slice.remaining() >= i) {
                                                            long j5 = slice.getLong();
                                                            if (j5 < 4 || j5 > 2147483647L) {
                                                                StringBuilder sb2 = new StringBuilder(76);
                                                                sb2.append("APK Signing Block entry #");
                                                                sb2.append(i2);
                                                                sb2.append(" size out of range: ");
                                                                sb2.append(j5);
                                                                throw new C26923bn(sb2.toString());
                                                            }
                                                            int i4 = (int) j5;
                                                            int position2 = slice.position() + i4;
                                                            if (i4 > slice.remaining()) {
                                                                int remaining = slice.remaining();
                                                                StringBuilder sb3 = new StringBuilder(91);
                                                                sb3.append("APK Signing Block entry #");
                                                                sb3.append(i2);
                                                                sb3.append(" size out of range: ");
                                                                sb3.append(i4);
                                                                sb3.append(", available: ");
                                                                sb3.append(remaining);
                                                                throw new C26923bn(sb3.toString());
                                                            } else if (slice.getInt() == 1896449818) {
                                                                X509Certificate[][] a3 = m53488a(randomAccessFile.getChannel(), new C26922bm(m53491b(slice, i4 - 4), longValue2, a2, longValue, byteBuffer));
                                                                randomAccessFile.close();
                                                                return a3;
                                                            } else {
                                                                slice.position(position2);
                                                                i = 8;
                                                            }
                                                        } else {
                                                            StringBuilder sb4 = new StringBuilder(70);
                                                            sb4.append("Insufficient data to read size of APK Signing Block entry #");
                                                            sb4.append(i2);
                                                            throw new C26923bn(sb4.toString());
                                                        }
                                                    }
                                                    throw new C26923bn("No APK Signature Scheme v2 block in APK Signing Block");
                                                } catch (Throwable th) {
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(limit);
                                                    byteBuffer2.position(position);
                                                    throw th;
                                                }
                                            } else {
                                                StringBuilder sb5 = new StringBuilder(41);
                                                sb5.append("end > capacity: ");
                                                sb5.append(capacity);
                                                sb5.append(" > ");
                                                sb5.append(capacity2);
                                                throw new IllegalArgumentException(sb5.toString());
                                            }
                                        } else {
                                            StringBuilder sb6 = new StringBuilder(38);
                                            sb6.append("end < start: ");
                                            sb6.append(capacity);
                                            sb6.append(" < ");
                                            sb6.append(8);
                                            throw new IllegalArgumentException(sb6.toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                    }
                                } else {
                                    StringBuilder sb7 = new StringBuilder(103);
                                    sb7.append("APK Signing Block sizes in header and footer do not match: ");
                                    sb7.append(j4);
                                    sb7.append(" vs ");
                                    sb7.append(j2);
                                    throw new C26923bn(sb7.toString());
                                }
                            } else {
                                StringBuilder sb8 = new StringBuilder(59);
                                sb8.append("APK Signing Block offset out of range: ");
                                sb8.append(j3);
                                throw new C26923bn(sb8.toString());
                            }
                        } else {
                            throw new C26923bn("No APK Signing Block before ZIP Central Directory");
                        }
                    } else {
                        StringBuilder sb9 = new StringBuilder(87);
                        sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb9.append(a2);
                        throw new C26923bn(sb9.toString());
                    }
                } else {
                    StringBuilder sb10 = new StringBuilder(122);
                    sb10.append("ZIP Central Directory offset out of range: ");
                    sb10.append(a2);
                    sb10.append(". ZIP End of Central Directory offset: ");
                    sb10.append(longValue);
                    throw new C26923bn(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new C26923bn(sb11.toString());
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static X509Certificate[][] m53488a(FileChannel fileChannel, C26922bm bmVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer b = m53490b(bmVar.f63808a);
                int i = 0;
                while (b.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m53485a(m53490b(b), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m53484a(hashMap, fileChannel, bmVar.f63809b, bmVar.f63810c, bmVar.f63811d, bmVar.f63812e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* renamed from: a */
    private static void m53484a(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (!map.isEmpty()) {
            C26921bl blVar = new C26921bl(fileChannel, 0, j);
            C26921bl blVar2 = new C26921bl(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            m53483a(duplicate);
            int position = duplicate.position() + 16;
            if (j < 0 || j > 4294967295L) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("uint32 value of out range: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            }
            duplicate.putInt(duplicate.position() + position, (int) j);
            C26962v vVar = new C26962v(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            for (Integer num : map.keySet()) {
                iArr[i] = num.intValue();
                i++;
            }
            try {
                byte[][] a = m53486a(iArr, new AbstractC26904av[]{blVar, blVar2, vVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual(map.get(Integer.valueOf(i3)), a[i2])) {
                        throw new SecurityException(m53489b(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }
}
