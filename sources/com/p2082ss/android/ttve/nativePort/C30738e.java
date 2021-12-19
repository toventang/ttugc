package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85315al;

/* renamed from: com.ss.android.ttve.nativePort.e */
public class C30738e {

    /* renamed from: a */
    public byte[] f73596a;

    /* renamed from: b */
    public int f73597b;

    static {
        Covode.recordClassIndex(37346);
    }

    /* renamed from: b */
    public final Long mo55460b() {
        if (this.f73597b + 8 <= this.f73596a.length) {
            return Long.valueOf(String.valueOf(mo55459a()));
        }
        C85315al.m146642d("TEParcel", "out of border");
        return null;
    }

    /* renamed from: a */
    public final int mo55459a() {
        int i = this.f73597b;
        int i2 = i + 4;
        byte[] bArr = this.f73596a;
        if (i2 > bArr.length) {
            C85315al.m146642d("TEParcel", "out of border");
            return -1;
        }
        int i3 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & Byte.MAX_VALUE) << 24);
        if ((bArr[i + 3] >> 7) != 0) {
            i3 -= Integer.MIN_VALUE;
        }
        this.f73597b = i + 4;
        return i3;
    }

    public C30738e(byte[] bArr) {
        this.f73596a = bArr;
    }
}
