package p4519d.p4520a.p4532e;

import com.bytedance.covode.number.Covode;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4522b.C87993b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.e.b */
public final class C88060b {

    /* renamed from: a */
    public static final C88060b f199973a = new C88060b();

    /* renamed from: b */
    private static C87991a<AbstractC88059a> f199974b = new C87991a<>(new C88061c());

    private C88060b() {
    }

    static {
        Covode.recordClassIndex(104086);
    }

    /* renamed from: a */
    private static String m153133a(String str) {
        return "EPKN.-".concat(String.valueOf(str));
    }

    /* renamed from: a */
    public static void m153134a(AbstractC88059a aVar) {
        C89219l.m154719c(aVar, "");
        C87993b.m153065a(f199974b, aVar);
    }

    /* renamed from: a */
    public static void m153135a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        if (f199974b.f199870a.getEnabled()) {
            f199974b.f199870a.logDebug(m153133a(str), str2);
        }
    }

    /* renamed from: a */
    public static void m153136a(String str, String str2, Throwable th) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        if (th != null) {
            f199974b.f199870a.logError(m153133a(str), str2, th);
        } else {
            f199974b.f199870a.logError(m153133a(str), str2);
        }
    }
}
