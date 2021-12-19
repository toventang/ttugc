package okhttp3.internal.p4654b;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90208y;
import okhttp3.Request;
import okhttp3.internal.p4655c.C90095g;

/* renamed from: okhttp3.internal.b.a */
public final class C90074a implements AbstractC90202u {

    /* renamed from: a */
    public final C90208y f204396a;

    static {
        Covode.recordClassIndex(106246);
    }

    public C90074a(C90208y yVar) {
        this.f204396a = yVar;
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        C90095g gVar = (C90095g) aVar;
        Request request = gVar.f204478d;
        C90082g gVar2 = gVar.f204475a;
        return gVar.mo144858a(request, gVar2, gVar2.mo144837a(this.f204396a, aVar, !request.method().equals("GET")), gVar2.mo144841b());
    }
}
