package androidx.constraintlayout.p026a.p027a;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.a.a.o */
public class C0532o {

    /* renamed from: h */
    HashSet<C0532o> f2114h = new HashSet<>(2);

    /* renamed from: i */
    public int f2115i = 0;

    static {
        Covode.recordClassIndex(599);
    }

    /* renamed from: a */
    public void mo2337a() {
    }

    /* renamed from: e */
    public final boolean mo2351e() {
        if (this.f2115i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo2342b() {
        this.f2115i = 0;
        this.f2114h.clear();
    }

    /* renamed from: c */
    public final void mo2349c() {
        this.f2115i = 0;
        Iterator<C0532o> it = this.f2114h.iterator();
        while (it.hasNext()) {
            it.next().mo2349c();
        }
    }

    /* renamed from: d */
    public final void mo2350d() {
        this.f2115i = 1;
        Iterator<C0532o> it = this.f2114h.iterator();
        while (it.hasNext()) {
            it.next().mo2337a();
        }
    }

    /* renamed from: a */
    public final void mo2348a(C0532o oVar) {
        this.f2114h.add(oVar);
    }
}
