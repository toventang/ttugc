package p000;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: b */
public final class C1720b {

    /* renamed from: a */
    public static final C1720b f5539a = new C1720b();

    private C1720b() {
    }

    static {
        Covode.recordClassIndex(1889);
    }

    /* renamed from: a */
    public static String m5623a(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        C89219l.m154716b(bigDecimal, "");
        if ('0' != bigDecimal.charAt(bigDecimal.length() - 1)) {
            return bigDecimal + str;
        }
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(bigDecimal, "null cannot be cast to non-null type java.lang.String");
        String substring = bigDecimal.substring(0, bigDecimal.length() - 2);
        C89219l.m154716b(substring, "");
        return sb.append(substring).append(str).toString();
    }
}
