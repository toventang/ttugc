package p4519d.p4520a.p4528c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.c.d */
public abstract class AbstractC88032d {

    /* renamed from: a */
    public final int f199929a = 64;

    /* renamed from: b */
    public final int f199930b = 16;

    /* renamed from: c */
    private final byte[] f199931c = new byte[64];

    /* renamed from: d */
    private int f199932d;

    /* renamed from: e */
    private long f199933e;

    static {
        Covode.recordClassIndex(104058);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo142604a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo142605a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract byte[] mo142606a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo142607b(byte[] bArr);

    /* renamed from: b */
    public final byte[] mo142608b() {
        byte[] bArr = new byte[this.f199930b];
        C89219l.m154719c(bArr, "");
        byte[] a = mo142606a(this.f199933e);
        int i = 0;
        while (i < a.length) {
            int i2 = this.f199929a;
            int i3 = this.f199932d;
            int i4 = i2 - i3;
            C88029b.m153081a(a, i, this.f199931c, i3, i4);
            mo142605a(this.f199931c);
            this.f199932d = 0;
            i += i4;
        }
        mo142607b(bArr);
        mo142604a();
        C89219l.m154719c(bArr, "");
        return bArr;
    }

    /* renamed from: a */
    public final AbstractC88032d mo142603a(byte[] bArr, int i) {
        C89219l.m154719c(bArr, "");
        int i2 = 0;
        int i3 = i;
        while (i3 > 0) {
            int min = Math.min(this.f199929a - this.f199932d, i3);
            C88029b.m153081a(bArr, i2, this.f199931c, this.f199932d, min);
            i3 -= min;
            i2 += min;
            int i4 = this.f199932d + min;
            this.f199932d = i4;
            int i5 = this.f199929a;
            if (i4 >= i5) {
                this.f199932d = i4 - i5;
                mo142605a(this.f199931c);
            }
        }
        this.f199933e += (long) i;
        return this;
    }
}
