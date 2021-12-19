package androidx.p053i;

import androidx.p053i.AbstractC1036i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.i.m */
public final class C1051m<T> extends AbstractC1036i<T> {

    /* renamed from: a */
    private final boolean f3687a;

    /* renamed from: b */
    private final Object f3688b;

    /* renamed from: n */
    private final AbstractC1012d<?, T> f3689n;

    static {
        Covode.recordClassIndex(1144);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: a */
    public final void mo3706a(int i) {
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: a */
    public final void mo3708a(AbstractC1036i<T> iVar, AbstractC1036i.AbstractC1041c cVar) {
    }

    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: d */
    public final boolean mo3745d() {
        return true;
    }

    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: f */
    public final boolean mo3747f() {
        return true;
    }

    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: b */
    public final AbstractC1012d<?, T> mo3710b() {
        return this.f3689n;
    }

    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: c */
    public final Object mo3713c() {
        return this.f3688b;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: a */
    public final boolean mo3709a() {
        return this.f3687a;
    }

    C1051m(AbstractC1036i<T> iVar) {
        super(new C1046k(iVar.f3639g), iVar.f3635c, iVar.f3636d, null, iVar.f3638f);
        this.f3689n = iVar.mo3710b();
        this.f3687a = iVar.mo3709a();
        this.f3640h = iVar.f3640h;
        this.f3688b = iVar.mo3713c();
    }
}
