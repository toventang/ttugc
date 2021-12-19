package okhttp3.internal.p4655c;

import com.bytedance.covode.number.Covode;
import java.util.List;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90057i;
import okhttp3.AbstractC90191p;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;
import okhttp3.internal.p4654b.C90076c;
import okhttp3.internal.p4654b.C90082g;

/* renamed from: okhttp3.internal.c.g */
public final class C90095g implements AbstractC90202u.AbstractC90203a {

    /* renamed from: a */
    public final C90082g f204475a;

    /* renamed from: b */
    public final AbstractC90090c f204476b;

    /* renamed from: c */
    final C90076c f204477c;

    /* renamed from: d */
    public final Request f204478d;

    /* renamed from: e */
    final AbstractC90049e f204479e;

    /* renamed from: f */
    public final AbstractC90191p f204480f;

    /* renamed from: g */
    private final List<AbstractC90202u> f204481g;

    /* renamed from: h */
    private final int f204482h;

    /* renamed from: i */
    private final int f204483i;

    /* renamed from: j */
    private final int f204484j;

    /* renamed from: k */
    private final int f204485k;

    /* renamed from: l */
    private int f204486l;

    static {
        Covode.recordClassIndex(106267);
    }

    @Override // okhttp3.AbstractC90202u.AbstractC90203a
    /* renamed from: a */
    public final Request mo144856a() {
        return this.f204478d;
    }

    @Override // okhttp3.AbstractC90202u.AbstractC90203a
    /* renamed from: b */
    public final AbstractC90057i mo144859b() {
        return this.f204477c;
    }

    @Override // okhttp3.AbstractC90202u.AbstractC90203a
    /* renamed from: c */
    public final int mo144860c() {
        return this.f204483i;
    }

    @Override // okhttp3.AbstractC90202u.AbstractC90203a
    /* renamed from: d */
    public final int mo144861d() {
        return this.f204484j;
    }

    @Override // okhttp3.AbstractC90202u.AbstractC90203a
    /* renamed from: e */
    public final int mo144862e() {
        return this.f204485k;
    }

    @Override // okhttp3.AbstractC90202u.AbstractC90203a
    /* renamed from: a */
    public final C90029ac mo144857a(Request request) {
        return mo144858a(request, this.f204475a, this.f204476b, this.f204477c);
    }

    /* renamed from: a */
    public final C90029ac mo144858a(Request request, C90082g gVar, AbstractC90090c cVar, C90076c cVar2) {
        if (this.f204482h < this.f204481g.size()) {
            this.f204486l++;
            if (this.f204476b != null && !this.f204477c.mo144821a(request.url())) {
                throw new IllegalStateException("network interceptor " + this.f204481g.get(this.f204482h - 1) + " must retain the same host and port");
            } else if (this.f204476b == null || this.f204486l <= 1) {
                C90095g gVar2 = new C90095g(this.f204481g, gVar, cVar, cVar2, this.f204482h + 1, request, this.f204479e, this.f204480f, this.f204483i, this.f204484j, this.f204485k);
                AbstractC90202u uVar = this.f204481g.get(this.f204482h);
                C90029ac intercept = uVar.intercept(gVar2);
                if (cVar != null && this.f204482h + 1 < this.f204481g.size() && gVar2.f204486l != 1) {
                    throw new IllegalStateException("network interceptor " + uVar + " must call proceed() exactly once");
                } else if (intercept == null) {
                    throw new NullPointerException("interceptor " + uVar + " returned null");
                } else if (intercept.f204111g != null) {
                    return intercept;
                } else {
                    throw new IllegalStateException("interceptor " + uVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f204481g.get(this.f204482h - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public C90095g(List<AbstractC90202u> list, C90082g gVar, AbstractC90090c cVar, C90076c cVar2, int i, Request request, AbstractC90049e eVar, AbstractC90191p pVar, int i2, int i3, int i4) {
        this.f204481g = list;
        this.f204477c = cVar2;
        this.f204475a = gVar;
        this.f204476b = cVar;
        this.f204482h = i;
        this.f204478d = request;
        this.f204479e = eVar;
        this.f204480f = pVar;
        this.f204483i = i2;
        this.f204484j = i3;
        this.f204485k = i4;
    }
}
