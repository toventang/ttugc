package p078c.p079a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p078c.p082c.AbstractC1760b;
import p078c.p082c.C1759a;

/* renamed from: c.a.b */
final class C1751b implements AbstractC1760b.AbstractC1761a {

    /* renamed from: a */
    private final List<AbstractC1760b> f5618a;

    /* renamed from: b */
    private final int f5619b;

    /* renamed from: c */
    private final C1759a f5620c;

    /* renamed from: d */
    private int f5621d;

    static {
        Covode.recordClassIndex(1921);
    }

    @Override // p078c.p082c.AbstractC1760b.AbstractC1761a
    /* renamed from: a */
    public final C1759a mo5564a() {
        return this.f5620c;
    }

    @Override // p078c.p082c.AbstractC1760b.AbstractC1761a
    /* renamed from: a */
    public final C1759a mo5565a(C1759a aVar) {
        if (this.f5619b >= this.f5618a.size()) {
            if (aVar.f5655a == null && aVar.f5657c != null) {
                if (aVar.f5656b == null || aVar.f5656b.isEmpty()) {
                    aVar.f5655a = aVar.f5657c;
                } else {
                    String str = aVar.f5656b;
                    String str2 = aVar.f5657c;
                    if (!str2.isEmpty() && !str2.equals("/")) {
                        str = str2.charAt(0) == '/' ? str.equals("/") ? str2 : str + str2 : str.equals("/") ? str + str2 : str + '/' + str2;
                    }
                    aVar.f5655a = str;
                }
            }
            return aVar;
        }
        int i = this.f5621d + 1;
        this.f5621d = i;
        if (i <= 1) {
            C1751b bVar = new C1751b(this.f5618a, this.f5619b + 1, aVar);
            AbstractC1760b bVar2 = this.f5618a.get(this.f5619b);
            C1759a a = bVar2.mo5573a(bVar);
            if (a == null) {
                throw new NullPointerException("resolver " + bVar2 + " returned null");
            } else if (a.f5655a != null) {
                return a;
            } else {
                throw new IllegalStateException("resolver " + bVar2 + " returned a file with no body");
            }
        } else {
            throw new IllegalStateException("FileResolver " + this.f5618a.get(this.f5619b - 1) + " must call handle() exactly once");
        }
    }

    public C1751b(List<AbstractC1760b> list, int i, C1759a aVar) {
        this.f5618a = list;
        this.f5619b = i;
        this.f5620c = aVar;
    }
}
