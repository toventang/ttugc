package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.C89673o;
import kotlinx.coroutines.internal.C89659v;

/* renamed from: kotlinx.coroutines.a.k */
public final class C89479k<E> extends AbstractC89497x implements AbstractC89495v<E> {

    /* renamed from: a */
    public final Throwable f203199a;

    static {
        Covode.recordClassIndex(105568);
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89497x
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo144071a() {
        return this;
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89497x
    /* renamed from: c */
    public final void mo144074c() {
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89495v
    public final void cU_() {
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89495v
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo144080f() {
        return this;
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89497x
    /* renamed from: b */
    public final C89659v mo144073b() {
        return C89673o.f203425a;
    }

    /* renamed from: d */
    public final Throwable mo144078d() {
        Throwable th = this.f203199a;
        if (th == null) {
            return new C89481m("Channel was closed");
        }
        return th;
    }

    /* renamed from: e */
    public final Throwable mo144079e() {
        Throwable th = this.f203199a;
        if (th == null) {
            return new C89480l("Channel was closed");
        }
        return th;
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        return "Closed@" + Integer.toHexString(System.identityHashCode(this)) + '[' + this.f203199a + ']';
    }

    public C89479k(Throwable th) {
        this.f203199a = th;
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89495v
    /* renamed from: b */
    public final C89659v mo144049b(E e) {
        return C89673o.f203425a;
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89497x
    /* renamed from: a */
    public final void mo144072a(C89479k<?> kVar) {
        if (C89527ar.f203243a) {
            throw new AssertionError();
        }
    }
}
