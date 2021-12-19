package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.p027a.C0515e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.a.p */
public final class C0533p {

    /* renamed from: a */
    int f2116a;

    /* renamed from: b */
    int f2117b;

    /* renamed from: c */
    int f2118c;

    /* renamed from: d */
    int f2119d;

    /* renamed from: e */
    ArrayList<C0534a> f2120e = new ArrayList<>();

    static {
        Covode.recordClassIndex(600);
    }

    /* renamed from: androidx.constraintlayout.a.a.p$a */
    static class C0534a {

        /* renamed from: a */
        C0515e f2121a;

        /* renamed from: b */
        C0515e f2122b;

        /* renamed from: c */
        int f2123c;

        /* renamed from: d */
        C0515e.EnumC0518b f2124d;

        /* renamed from: e */
        int f2125e;

        static {
            Covode.recordClassIndex(601);
        }

        public C0534a(C0515e eVar) {
            this.f2121a = eVar;
            this.f2122b = eVar.f1968d;
            this.f2123c = eVar.mo2282b();
            this.f2124d = eVar.f1971g;
            this.f2125e = eVar.f1973i;
        }
    }

    public C0533p(C0520f fVar) {
        this.f2116a = fVar.f1992M;
        this.f2117b = fVar.f1993N;
        this.f2118c = fVar.mo2310k();
        this.f2119d = fVar.mo2311l();
        ArrayList<C0515e> t = fVar.mo2319t();
        int size = t.size();
        for (int i = 0; i < size; i++) {
            this.f2120e.add(new C0534a(t.get(i)));
        }
    }
}
