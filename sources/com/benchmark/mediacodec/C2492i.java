package com.benchmark.mediacodec;

import com.bytedance.covode.number.Covode;

/* renamed from: com.benchmark.mediacodec.i */
public class C2492i {

    /* renamed from: a */
    public int f7532a;

    /* renamed from: b */
    public byte[] f7533b;

    /* renamed from: c */
    public int[] f7534c;

    /* renamed from: d */
    public long f7535d;

    /* renamed from: e */
    public long f7536e;

    /* renamed from: f */
    public boolean f7537f;

    /* renamed from: g */
    public boolean f7538g;

    static {
        Covode.recordClassIndex(2848);
    }

    /* renamed from: a */
    public final boolean mo6901a() {
        int i = this.f7532a;
        if (i == 17) {
            int[] iArr = this.f7534c;
            if (iArr == null || iArr.length != 3) {
                return false;
            }
            return true;
        } else if (i == 16 || i == 14 || i == 15) {
            int[] iArr2 = this.f7534c;
            if (iArr2 == null || iArr2.length <= 0) {
                return false;
            }
            return true;
        } else if (this.f7533b != null) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Format: " + this.f7532a + "; PTS: " + this.f7535d + "; DTS: " + this.f7536e + "; isEOF: " + this.f7538g + "; isKeyFrame: " + this.f7537f;
    }
}
