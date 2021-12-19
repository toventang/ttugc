package p077b;

import com.bytedance.covode.number.Covode;

/* renamed from: b.j */
public class C1743j<TResult> {

    /* renamed from: a */
    public final C1731i<TResult> f5610a = new C1731i<>();

    static {
        Covode.recordClassIndex(1912);
    }

    /* renamed from: a */
    public final void mo5553a() {
        if (!this.f5610a.mo5548g()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: a */
    public final boolean mo5554a(Exception exc) {
        return this.f5610a.mo5540b(exc);
    }

    /* renamed from: a */
    public final boolean mo5555a(TResult tresult) {
        return this.f5610a.mo5541b((Object) tresult);
    }

    /* renamed from: b */
    public final void mo5556b(Exception exc) {
        if (!mo5554a(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* renamed from: b */
    public final void mo5557b(TResult tresult) {
        if (!mo5555a((Object) tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
