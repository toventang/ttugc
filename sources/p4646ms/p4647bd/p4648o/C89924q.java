package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import p4646ms.p4647bd.p4648o.C89910n;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.q */
public final class C89924q implements C89910n.AbstractC89912b {
    static {
        Covode.recordClassIndex(106021);
    }

    C89924q() {
    }

    /* renamed from: a */
    public static String m156034a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }
}
