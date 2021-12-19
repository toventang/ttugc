package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89671m;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.C89673o;
import kotlinx.coroutines.internal.C89659v;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;

/* renamed from: kotlinx.coroutines.a.z */
public final class C89499z extends AbstractC89497x {

    /* renamed from: a */
    public final AbstractC89671m<C89391z> f203216a;

    /* renamed from: b */
    private final Object f203217b;

    static {
        Covode.recordClassIndex(105588);
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89497x
    /* renamed from: a */
    public final Object mo144071a() {
        return this.f203217b;
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89497x
    /* renamed from: c */
    public final void mo144074c() {
        this.f203216a.mo144214b(C89673o.f203425a);
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89497x
    /* renamed from: b */
    public final C89659v mo144073b() {
        Object a = this.f203216a.mo144209a(C89391z.f203057a);
        if (a == null) {
            return null;
        }
        if (!C89527ar.f203243a || a == C89673o.f203425a) {
            return C89673o.f203425a;
        }
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        return "SendElement@" + Integer.toHexString(System.identityHashCode(this)) + '(' + this.f203217b + ')';
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89497x
    /* renamed from: a */
    public final void mo144072a(C89479k<?> kVar) {
        this.f203216a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(kVar.mo144078d())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.m<? super h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89499z(Object obj, AbstractC89671m<? super C89391z> mVar) {
        this.f203217b = obj;
        this.f203216a = mVar;
    }
}
