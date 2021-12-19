package com.google.android.gms.internal.measurement;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.jm */
final class C26074jm extends AbstractC26073jl {
    static {
        Covode.recordClassIndex(31489);
    }

    C26074jm() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a1, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC26073jl
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo42805a(byte[] r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C26074jm.mo42805a(byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26073jl
    /* renamed from: b */
    public final String mo42806b(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte a = C26065jh.m50945a(bArr, (long) i);
                if (a < 0) {
                    break;
                }
                i++;
                C26070ji.m51015a(a, cArr, i4);
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte a2 = C26065jh.m50945a(bArr, (long) i);
                if (a2 >= 0) {
                    int i6 = i4 + 1;
                    C26070ji.m51015a(a2, cArr, i4);
                    while (i5 < i3) {
                        byte a3 = C26065jh.m50945a(bArr, (long) i5);
                        if (a3 < 0) {
                            break;
                        }
                        i5++;
                        C26070ji.m51015a(a3, cArr, i6);
                        i6++;
                    }
                    i = i5;
                    i4 = i6;
                } else if (C26070ji.m51016a(a2)) {
                    if (i5 < i3) {
                        i = i5 + 1;
                        C26070ji.m51014a(a2, C26065jh.m50945a(bArr, (long) i5), cArr, i4);
                        i4++;
                    } else {
                        throw C25994gr.m50614h();
                    }
                } else if (C26070ji.m51017b(a2)) {
                    if (i5 < i3 - 1) {
                        int i7 = i5 + 1;
                        i = i7 + 1;
                        C26070ji.m51013a(a2, C26065jh.m50945a(bArr, (long) i5), C26065jh.m50945a(bArr, (long) i7), cArr, i4);
                        i4++;
                    } else {
                        throw C25994gr.m50614h();
                    }
                } else if (i5 < i3 - 2) {
                    int i8 = i5 + 1;
                    byte a4 = C26065jh.m50945a(bArr, (long) i5);
                    int i9 = i8 + 1;
                    i = i9 + 1;
                    C26070ji.m51012a(a2, a4, C26065jh.m50945a(bArr, (long) i8), C26065jh.m50945a(bArr, (long) i9), cArr, i4);
                    i4 = i4 + 1 + 1;
                } else {
                    throw C25994gr.m50614h();
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(C1764a.m5928a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: a */
    private static int m51034a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return C26071jj.m51019a(i);
        }
        if (i2 == 1) {
            return C26071jj.m51020a(i, C26065jh.m50945a(bArr, j));
        }
        if (i2 == 2) {
            return C26071jj.m51021a(i, C26065jh.m50945a(bArr, j), C26065jh.m50945a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[LOOP:1: B:13:0x0035->B:19:0x0049, LOOP_START, PHI: r2 r7 r13 r19 
      PHI: (r2v2 char) = (r2v1 char), (r2v22 char) binds: [B:10:0x0031, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v2 long) = (r7v1 long), (r7v16 long) binds: [B:10:0x0031, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v2 int) = (r13v1 int), (r13v7 int) binds: [B:10:0x0031, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v1 long) = (r19v0 long), (r19v2 long) binds: [B:10:0x0031, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.AbstractC26073jl
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo42804a(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C26074jm.mo42804a(java.lang.CharSequence, byte[], int, int):int");
    }
}
