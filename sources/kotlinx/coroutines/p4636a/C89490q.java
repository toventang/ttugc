package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;

/* renamed from: kotlinx.coroutines.a.q */
public final class C89490q<E> extends AbstractC89459a<E> {
    static {
        Covode.recordClassIndex(105579);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: a */
    public final boolean mo144041a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: b */
    public final boolean mo144044b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: e */
    public final boolean mo144064e() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: f */
    public final boolean mo144065f() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: a */
    public final Object mo144059a(E e) {
        AbstractC89495v<?> b;
        do {
            Object a = super.mo144059a((Object) e);
            if (a == C89466b.f203174a) {
                return C89466b.f203174a;
            }
            if (a == C89466b.f203175b) {
                b = mo144062b(e);
                if (b == null) {
                    return C89466b.f203174a;
                }
            } else if (a instanceof C89479k) {
                return a;
            } else {
                throw new IllegalStateException("Invalid offerInternal result ".concat(String.valueOf(a)).toString());
            }
        } while (!(b instanceof C89479k));
        return b;
    }
}
