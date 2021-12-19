package p4632k;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: k.b */
public final class C89412b {
    static {
        Covode.recordClassIndex(105496);
    }

    /* renamed from: a */
    public static final String m154995a(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        return new String(bArr, C89338d.f202990a);
    }

    /* renamed from: a */
    public static final byte[] m154997a(String str) {
        C89219l.m154719c(str, "");
        byte[] bytes = str.getBytes(C89338d.f202990a);
        C89219l.m154709a((Object) bytes, "");
        return bytes;
    }

    /* renamed from: a */
    public static final void m154996a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C89219l.m154719c(bArr, "");
        C89219l.m154719c(bArr2, "");
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }
}
