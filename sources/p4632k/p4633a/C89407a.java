package p4632k.p4633a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;
import p4632k.C89412b;
import p4632k.C89427i;

/* renamed from: k.a.a */
public final class C89407a {

    /* renamed from: a */
    public static final char[] f203070a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final C89427i f203071b = C89427i.C89428a.m155140a(new byte[0]);

    static {
        Covode.recordClassIndex(105491);
    }

    /* renamed from: a */
    public static final C89427i m154981a(String str) {
        C89219l.m154719c(str, "");
        C89427i iVar = new C89427i(C89412b.m154997a(str));
        iVar.setUtf8$jvm(str);
        return iVar;
    }

    /* renamed from: a */
    public static final int m154980a(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static final C89427i m154983a(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C89219l.m154709a((Object) copyOf, "");
        return new C89427i(copyOf);
    }

    /* renamed from: a */
    public static final C89427i m154982a(C89427i iVar, int i, int i2) {
        C89219l.m154719c(iVar, "");
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        } else if (i2 <= iVar.getData$jvm().length) {
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            } else if (i == 0 && i2 == iVar.getData$jvm().length) {
                return iVar;
            } else {
                byte[] bArr = new byte[i3];
                C89412b.m154996a(iVar.getData$jvm(), i, bArr, 0, i3);
                return new C89427i(bArr);
            }
        } else {
            throw new IllegalArgumentException(("endIndex > length(" + iVar.getData$jvm().length + ')').toString());
        }
    }
}
