package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.an */
public class C2311an extends FilterInputStream {

    /* renamed from: ı */
    private byte[] f7016;

    /* renamed from: Ɩ */
    private int f7017 = Integer.MAX_VALUE;

    /* renamed from: ǃ */
    private C2308ak f7018;

    /* renamed from: ɩ */
    private final int f7019;

    /* renamed from: ɹ */
    private int f7020;

    /* renamed from: Ι */
    private byte[] f7021;

    /* renamed from: ι */
    private byte[] f7022;

    /* renamed from: І */
    private int[] f7023;

    /* renamed from: і */
    private int f7024;

    /* renamed from: Ӏ */
    private int f7025;

    static {
        Covode.recordClassIndex(2563);
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        m7092();
        return this.f7025 - this.f7024;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        m7092();
        int i = this.f7024;
        if (i >= this.f7025) {
            return -1;
        }
        byte[] bArr = this.f7016;
        this.f7024 = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: Ι */
    private int m7092() {
        MethodCollector.m26663i(3822);
        if (this.f7017 == Integer.MAX_VALUE) {
            this.f7017 = ((FilterInputStream) this).in.read();
        }
        int i = 8;
        if (this.f7024 == 8) {
            byte[] bArr = this.f7016;
            int i2 = this.f7017;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.f7016, i3, 8 - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < 8);
                if (i3 >= 8) {
                    m7091();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.f7017 = read2;
                    this.f7024 = 0;
                    if (read2 < 0) {
                        i = 8 - (this.f7016[7] & 255);
                    }
                    this.f7025 = i;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("unexpected block size");
                    MethodCollector.m26664o(3822);
                    throw illegalStateException;
                }
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("unexpected block size");
                MethodCollector.m26664o(3822);
                throw illegalStateException2;
            }
        }
        int i4 = this.f7025;
        MethodCollector.m26664o(3822);
        return i4;
    }

    /* renamed from: ı */
    private void m7091() {
        if (this.f7020 == 2) {
            byte[] bArr = this.f7016;
            System.arraycopy(bArr, 0, this.f7022, 0, bArr.length);
        }
        byte[] bArr2 = this.f7016;
        C2307aj.m7086(((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255), (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.f7019, this.f7018.f6999, this.f7018.f7000, this.f7023);
        int[] iArr = this.f7023;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.f7016;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f7020 == 2) {
            int i3 = 0;
            do {
                byte[] bArr4 = this.f7016;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.f7021[i3]);
                i3++;
            } while (i3 < 8);
            byte[] bArr5 = this.f7022;
            System.arraycopy(bArr5, 0, this.f7021, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        MethodCollector.m26663i(3808);
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        MethodCollector.m26664o(3808);
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m7092();
            int i5 = this.f7024;
            if (i5 < this.f7025) {
                byte[] bArr2 = this.f7016;
                this.f7024 = i5 + 1;
                bArr[i4] = bArr2[i5];
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    public C2311an(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) {
        super(inputStream);
        MethodCollector.m26663i(3802);
        int min = Math.min(Math.max(i, 3), 16);
        this.f7019 = min;
        this.f7016 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f7021 = bArr2;
        this.f7022 = new byte[8];
        this.f7023 = new int[2];
        this.f7024 = 8;
        this.f7025 = 8;
        this.f7020 = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.f7018 = new C2308ak(iArr, min, true, z);
        MethodCollector.m26664o(3802);
    }
}
