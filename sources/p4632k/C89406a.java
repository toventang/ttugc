package p4632k;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4632k.C89427i;

/* renamed from: k.a */
public final class C89406a {

    /* renamed from: a */
    static final byte[] f203068a = C89427i.C89428a.m155139a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$jvm();

    /* renamed from: b */
    public static final byte[] f203069b = C89427i.C89428a.m155139a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$jvm();

    static {
        Covode.recordClassIndex(105490);
    }

    /* renamed from: a */
    public static final String m154979a(byte[] bArr, byte[] bArr2) {
        C89219l.m154719c(bArr, "");
        C89219l.m154719c(bArr2, "");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            i = i4 + 1;
            byte b3 = bArr[i4];
            int i5 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i6 = i5 + 1;
            bArr3[i5] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i8 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[(b4 & 3) << 4];
            bArr3[i9] = 61;
            bArr3[i9 + 1] = 61;
        } else if (length2 == 2) {
            byte b5 = bArr[i];
            byte b6 = bArr[i + 1];
            int i10 = i2 + 1;
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i11] = bArr2[(b6 & 15) << 2];
            bArr3[i11 + 1] = 61;
        }
        return C89412b.m154995a(bArr3);
    }
}
