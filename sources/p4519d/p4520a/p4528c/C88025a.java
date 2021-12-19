package p4519d.p4520a.p4528c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.c.a */
public final class C88025a {

    /* renamed from: d */
    public static final int[] f199902d = new int[256];

    /* renamed from: e */
    public static final int[] f199903e = new int[256];

    /* renamed from: f */
    public static final int[] f199904f = new int[256];

    /* renamed from: g */
    public static final int[] f199905g = new int[256];

    /* renamed from: h */
    public static final int[] f199906h = new int[256];

    /* renamed from: i */
    public static final C88026a f199907i = new C88026a((byte) 0);

    /* renamed from: m */
    private static final int[] f199908m = new int[256];

    /* renamed from: n */
    private static final int[] f199909n = new int[256];

    /* renamed from: o */
    private static final int[] f199910o = new int[256];

    /* renamed from: p */
    private static final int[] f199911p = new int[256];

    /* renamed from: q */
    private static final int[] f199912q = new int[256];

    /* renamed from: r */
    private static final int[] f199913r = {0, 1, 2, 4, 8, 16, 32, 64, 128, 27, 54};

    /* renamed from: a */
    public final int f199914a;

    /* renamed from: b */
    public final int[] f199915b;

    /* renamed from: c */
    public final int[] f199916c;

    /* renamed from: j */
    private final int f199917j;

    /* renamed from: k */
    private final int f199918k;

    /* renamed from: l */
    private final int[] f199919l;

    /* renamed from: d.a.c.a$a */
    public static final class C88026a {
        static {
            Covode.recordClassIndex(104052);
        }

        private C88026a() {
        }

        public /* synthetic */ C88026a(byte b) {
            this();
        }

        /* renamed from: a */
        public static int[] m153080a(byte[] bArr) {
            int length = bArr.length / 4;
            int[] iArr = new int[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                int i5 = i3 + 1;
                int i6 = bArr[i3] & 255;
                int i7 = i5 + 1;
                int i8 = bArr[i5] & 255;
                i = i7 + 1;
                iArr[i2] = (i4 << 24) | (i6 << 16) | (i8 << 8) | ((bArr[i7] & 255) << 0);
            }
            return iArr;
        }
    }

    static {
        Covode.recordClassIndex(104051);
        int[] iArr = new int[256];
        int i = 0;
        loop0:
        while (true) {
            int i2 = i << 1;
            while (true) {
                iArr[i] = i2;
                i++;
                if (i >= 256) {
                    break loop0;
                } else if (i >= 128) {
                    i2 = (i << 1) ^ 283;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = ((((i4 << 1) ^ i4) ^ (i4 << 2)) ^ (i4 << 3)) ^ (i4 << 4);
            int i7 = ((i6 & 255) ^ (i6 >>> 8)) ^ 99;
            f199908m[i5] = i7;
            f199902d[i7] = i5;
            int i8 = iArr[i5];
            int i9 = iArr[i8];
            int i10 = iArr[i9];
            int i11 = (iArr[i7] * 257) ^ (i7 * 16843008);
            f199909n[i5] = (i11 << 24) | (i11 >>> 8);
            f199910o[i5] = (i11 << 16) | (i11 >>> 16);
            f199911p[i5] = (i11 << 8) | (i11 >>> 24);
            f199912q[i5] = i11 << 0;
            int i12 = (((i9 * 65537) ^ (16843009 * i10)) ^ (i8 * 257)) ^ (16843008 * i5);
            f199903e[i7] = (i12 << 24) | (i12 >>> 8);
            f199904f[i7] = (i12 << 16) | (i12 >>> 16);
            f199905g[i7] = (i12 << 8) | (i12 >>> 24);
            f199906h[i7] = i12 << 0;
            if (i5 == 0) {
                i4 = 1;
                i5 = 1;
            } else {
                i5 = iArr[iArr[iArr[i10 ^ i8]]] ^ i8;
                i4 ^= iArr[iArr[i4]];
            }
            i3++;
        } while (i3 < 256);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C88025a(byte[] bArr) {
        this(C88026a.m153080a(bArr));
        C89219l.m154719c(bArr, "");
    }

    private C88025a(int[] iArr) {
        int i;
        int i2;
        C89219l.m154719c(iArr, "");
        this.f199916c = iArr;
        int length = iArr.length;
        this.f199917j = length;
        int i3 = length + 6;
        this.f199914a = i3;
        int i4 = (i3 + 1) * 4;
        this.f199918k = i4;
        int[] iArr2 = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f199917j;
            if (i5 < i6) {
                i2 = this.f199916c[i5];
            } else {
                int i7 = iArr2[i5 - 1];
                if (i5 % i6 == 0) {
                    int i8 = (i7 >>> 24) | (i7 << 8);
                    int[] iArr3 = f199908m;
                    i7 = (iArr3[i8 & 255] | (((iArr3[(i8 >>> 24) & 255] << 24) | (iArr3[(i8 >>> 16) & 255] << 16)) | (iArr3[(i8 >>> 8) & 255] << 8))) ^ (f199913r[(i5 / i6) | 0] << 24);
                } else if (i6 > 6 && i5 % i6 == 4) {
                    int[] iArr4 = f199908m;
                    i7 = iArr4[i7 & 255] | (iArr4[(i7 >>> 24) & 255] << 24) | (iArr4[(i7 >>> 16) & 255] << 16) | (iArr4[(i7 >>> 8) & 255] << 8);
                }
                i2 = iArr2[i5 - i6] ^ i7;
            }
            iArr2[i5] = i2;
        }
        this.f199919l = iArr2;
        int i9 = this.f199918k;
        int[] iArr5 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.f199918k - i10;
            if (i10 % 4 != 0) {
                i = this.f199919l[i11];
            } else {
                i = this.f199919l[i11 - 4];
            }
            if (i10 >= 4 && i11 > 4) {
                int[] iArr6 = f199903e;
                int[] iArr7 = f199908m;
                i = f199906h[iArr7[i & 255]] ^ ((iArr6[iArr7[(i >>> 24) & 255]] ^ f199904f[iArr7[(i >>> 16) & 255]]) ^ f199905g[iArr7[(i >>> 8) & 255]]);
            }
            iArr5[i10] = i;
        }
        this.f199915b = iArr5;
    }
}
