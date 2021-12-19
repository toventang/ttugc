package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.al */
public class C2309al extends FilterInputStream {

    /* renamed from: ı */
    private static final short f7002 = ((short) ((int) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d))));

    /* renamed from: Ɩ */
    private int f7003;

    /* renamed from: ǃ */
    private int f7004 = 8;

    /* renamed from: ɨ */
    private int f7005;

    /* renamed from: ɩ */
    private byte[] f7006 = new byte[8];

    /* renamed from: ɪ */
    private int f7007;

    /* renamed from: ɹ */
    private int f7008 = 8;

    /* renamed from: Ι */
    private byte[] f7009 = new byte[8];

    /* renamed from: ι */
    private byte[] f7010 = new byte[8];

    /* renamed from: І */
    private int f7011;

    /* renamed from: і */
    private int f7012 = Integer.MAX_VALUE;

    /* renamed from: Ӏ */
    private int f7013;

    /* renamed from: ӏ */
    private int f7014;

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        m7089();
        return this.f7008 - this.f7004;
    }

    static {
        Covode.recordClassIndex(2561);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        m7089();
        int i = this.f7004;
        if (i >= this.f7008) {
            return -1;
        }
        byte[] bArr = this.f7009;
        this.f7004 = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: Ι */
    private int m7089() {
        MethodCollector.m26663i(3512);
        if (this.f7012 == Integer.MAX_VALUE) {
            this.f7012 = ((FilterInputStream) this).in.read();
        }
        int i = 8;
        if (this.f7004 == 8) {
            byte[] bArr = this.f7009;
            int i2 = this.f7012;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.f7009, i3, 8 - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < 8);
                if (i3 >= 8) {
                    m7090();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.f7012 = read2;
                    this.f7004 = 0;
                    if (read2 < 0) {
                        i = 8 - (this.f7009[7] & 255);
                    }
                    this.f7008 = i;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("unexpected block size");
                    MethodCollector.m26664o(3512);
                    throw illegalStateException;
                }
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("unexpected block size");
                MethodCollector.m26664o(3512);
                throw illegalStateException2;
            }
        }
        int i4 = this.f7008;
        MethodCollector.m26664o(3512);
        return i4;
    }

    /* renamed from: ι */
    private void m7090() {
        if (this.f7011 == 3) {
            byte[] bArr = this.f7009;
            System.arraycopy(bArr, 0, this.f7006, 0, bArr.length);
        }
        byte[] bArr2 = this.f7009;
        int i = ((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.f7003;
            if (i3 >= i4) {
                break;
            }
            short s = f7002;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.f7005)) ^ ((i >>> 5) + this.f7014);
            i -= (((i2 << 4) + this.f7013) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.f7007);
            i3++;
        }
        byte[] bArr3 = this.f7009;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f7011 == 3) {
            int i5 = 0;
            do {
                byte[] bArr4 = this.f7009;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.f7010[i5]);
                i5++;
            } while (i5 < 8);
            byte[] bArr5 = this.f7006;
            System.arraycopy(bArr5, 0, this.f7010, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        MethodCollector.m26663i(3498);
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        MethodCollector.m26664o(3498);
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m7089();
            int i5 = this.f7004;
            if (i5 < this.f7008) {
                byte[] bArr2 = this.f7009;
                this.f7004 = i5 + 1;
                bArr[i4] = bArr2[i5];
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    public C2309al(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) {
        super(inputStream);
        MethodCollector.m26663i(3483);
        this.f7003 = Math.min(Math.max(i2, 5), 16);
        this.f7011 = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.f7010, 0, 8);
        }
        long j = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i == 0) {
            this.f7013 = (int) j;
            long j2 = j >> 3;
            short s = f7002;
            this.f7007 = (int) ((((long) s) * j2) >> 32);
            this.f7005 = (int) (j >> 32);
            this.f7014 = (int) (j2 + ((long) s));
            MethodCollector.m26664o(3483);
            return;
        }
        int i4 = (int) j;
        this.f7013 = i4;
        this.f7007 = i4 * i;
        this.f7005 = i4 ^ i;
        this.f7014 = (int) (j >> 32);
        MethodCollector.m26664o(3483);
    }
}
