package p4519d.p4520a.p4528c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.c.f */
public final class C88034f extends AbstractC88032d {

    /* renamed from: c */
    public static final C88035a f199935c = new C88035a((byte) 0);

    /* renamed from: g */
    private static final int[] f199936g = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};

    /* renamed from: h */
    private static final int[] f199937h;

    /* renamed from: d */
    private final int[] f199938d = new int[4];

    /* renamed from: e */
    private final int[] f199939e = new int[4];

    /* renamed from: f */
    private final int[] f199940f = new int[16];

    /* renamed from: d.a.c.f$a */
    public static final class C88035a extends C88033e {
        static {
            Covode.recordClassIndex(104061);
        }

        private C88035a() {
            super(C880361.f199941a);
        }

        public /* synthetic */ C88035a(byte b) {
            this();
        }
    }

    public C88034f() {
        mo142604a();
    }

    /* access modifiers changed from: protected */
    @Override // p4519d.p4520a.p4528c.AbstractC88032d
    /* renamed from: a */
    public final void mo142604a() {
        int[] iArr = this.f199938d;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
    }

    static {
        Covode.recordClassIndex(104060);
        int i = 0;
        int[] iArr = new int[64];
        do {
            double d = (double) i;
            Double.isNaN(d);
            iArr[i] = (int) ((long) (Math.abs(Math.sin(d + 1.0d)) * 4.294967296E9d));
            i++;
        } while (i < 64);
        f199937h = iArr;
    }

    /* access modifiers changed from: protected */
    @Override // p4519d.p4520a.p4528c.AbstractC88032d
    /* renamed from: b */
    public final void mo142607b(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        int i = 0;
        do {
            bArr[i] = (byte) (this.f199938d[i / 4] >>> ((i % 4) * 8));
            i++;
        } while (i < 16);
    }

    /* access modifiers changed from: protected */
    @Override // p4519d.p4520a.p4528c.AbstractC88032d
    /* renamed from: a */
    public final byte[] mo142606a(long j) {
        long j2 = 8 * j;
        int i = (int) (((((j + 8) / ((long) this.f199929a)) + 1) * ((long) this.f199929a)) - j);
        byte[] bArr = new byte[i];
        int i2 = 0;
        bArr[0] = Byte.MIN_VALUE;
        do {
            bArr[(i - 8) + i2] = (byte) ((int) (j2 >>> (i2 * 8)));
            i2++;
        } while (i2 < 8);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    @Override // p4519d.p4520a.p4528c.AbstractC88032d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo142605a(byte[] r15) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: p4519d.p4520a.p4528c.C88034f.mo142605a(byte[]):void");
    }
}
