package okhttp3.internal.p4653a;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.internal.AbstractC90058a;

/* renamed from: okhttp3.internal.a.a */
public final class C90059a implements AbstractC90202u {

    /* renamed from: a */
    final AbstractC90072f f204331a;

    static {
        Covode.recordClassIndex(106231);
    }

    public C90059a(AbstractC90072f fVar) {
        this.f204331a = fVar;
    }

    /* renamed from: a */
    private static C90029ac m156321a(C90029ac acVar) {
        if (acVar == null || acVar.f204111g == null) {
            return acVar;
        }
        C90029ac.C90030a b = acVar.mo144722b();
        b.f204124g = null;
        return b.mo144729a();
    }

    /* renamed from: b */
    private static boolean m156324b(String str) {
        if ("Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m156323a(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v34, types: [okhttp3.Request, okhttp3.ac] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // okhttp3.AbstractC90202u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C90029ac intercept(okhttp3.AbstractC90202u.AbstractC90203a r22) {
        /*
        // Method dump skipped, instructions count: 831
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4653a.C90059a.intercept(okhttp3.u$a):okhttp3.ac");
    }

    /* renamed from: a */
    private static C90198s m156322a(C90198s sVar, C90198s sVar2) {
        C90198s.C90199a aVar = new C90198s.C90199a();
        int length = sVar.f204855a.length / 2;
        for (int i = 0; i < length; i++) {
            String a = sVar.mo145027a(i);
            String b = sVar.mo145031b(i);
            if ((!"Warning".equalsIgnoreCase(a) || !b.startsWith("1")) && (m156324b(a) || !m156323a(a) || sVar2.mo145028a(a) == null)) {
                AbstractC90058a.f204330a.mo144790a(aVar, a, b);
            }
        }
        int length2 = sVar2.f204855a.length / 2;
        for (int i2 = 0; i2 < length2; i2++) {
            String a2 = sVar2.mo145027a(i2);
            if (!m156324b(a2) && m156323a(a2)) {
                AbstractC90058a.f204330a.mo144790a(aVar, a2, sVar2.mo145031b(i2));
            }
        }
        return aVar.mo145040a();
    }
}
