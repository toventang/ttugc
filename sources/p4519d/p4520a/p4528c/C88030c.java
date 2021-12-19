package p4519d.p4520a.p4528c;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4519d.p4520a.p4528c.p4529a.C88028b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.c.c */
public final class C88030c {

    /* renamed from: b */
    public static final C88031a f199927b = new C88031a((byte) 0);

    /* renamed from: a */
    public final byte[] f199928a;

    static {
        Covode.recordClassIndex(104056);
    }

    /* renamed from: d.a.c.c$a */
    public static final class C88031a {
        static {
            Covode.recordClassIndex(104057);
        }

        private C88031a() {
        }

        public /* synthetic */ C88031a(byte b) {
            this();
        }
    }

    public final int hashCode() {
        byte[] bArr = this.f199928a;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    public final String toString() {
        return "Hash(bytes=" + Arrays.toString(this.f199928a) + ")";
    }

    public final boolean equals(Object obj) {
        byte[] bArr = this.f199928a;
        if (!(obj instanceof C88030c) || !C89219l.m154714a(bArr, ((C88030c) obj).f199928a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final String m153082a(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        String str = C88028b.f199923a;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append(str.charAt((i >>> 4) & 15));
            sb.append(str.charAt((i >>> 0) & 15));
        }
        String sb2 = sb.toString();
        C89219l.m154709a((Object) sb2, "");
        return sb2;
    }
}
