package androidx.p053i;

import androidx.p053i.AbstractC1036i;
import androidx.p053i.C1034h;
import androidx.p053i.C1046k;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: androidx.i.c */
public final class C1008c<K, V> extends AbstractC1036i<V> implements C1046k.AbstractC1047a {

    /* renamed from: a */
    public final AbstractC1007b<K, V> f3569a;

    /* renamed from: b */
    public C1034h.AbstractC1035a<V> f3570b = new C1034h.AbstractC1035a<V>() {
        /* class androidx.p053i.C1008c.C10091 */

        static {
            Covode.recordClassIndex(1102);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
            if (r12.f3629c.size() == 0) goto L_0x0081;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0166  */
        @Override // androidx.p053i.C1034h.AbstractC1035a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3714a(int r11, androidx.p053i.C1034h<V> r12) {
            /*
            // Method dump skipped, instructions count: 382
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.p053i.C1008c.C10091.mo3714a(int, androidx.i.h):void");
        }
    };

    /* renamed from: n */
    private boolean f3571n = false;

    /* renamed from: o */
    private boolean f3572o = false;

    /* renamed from: p */
    private int f3573p = 0;

    /* renamed from: q */
    private int f3574q = 0;

    static {
        Covode.recordClassIndex(1101);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: a */
    public final boolean mo3709a() {
        return true;
    }

    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: b */
    public final AbstractC1012d<?, V> mo3710b() {
        return this.f3569a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.i.b<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: c */
    public final Object mo3713c() {
        return this.f3569a.mo3702a((V) this.f3641i);
    }

    /* renamed from: h */
    private void m3465h() {
        if (!this.f3571n) {
            this.f3571n = true;
            final int i = this.f3639g.f3671b + this.f3639g.f3674e;
            final Object c = this.f3639g.mo3763c();
            this.f3636d.execute(new Runnable() {
                /* class androidx.p053i.C1008c.RunnableC10102 */

                static {
                    Covode.recordClassIndex(1103);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.i.b<K, V> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    if (!C1008c.this.mo3747f()) {
                        if (C1008c.this.f3569a.f3582a.get()) {
                            C1008c.this.mo3748g();
                        } else {
                            C1008c.this.f3569a.mo3705b(c, C1008c.this.f3638f.f3659a, C1008c.this.f3635c, C1008c.this.f3570b);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: i */
    private void m3466i() {
        if (!this.f3572o) {
            this.f3572o = true;
            final int i = ((this.f3639g.f3671b + this.f3639g.f3675f) - 1) + this.f3639g.f3674e;
            final Object d = this.f3639g.mo3764d();
            this.f3636d.execute(new Runnable() {
                /* class androidx.p053i.C1008c.RunnableC10113 */

                static {
                    Covode.recordClassIndex(1104);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.i.b<K, V> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    if (!C1008c.this.mo3747f()) {
                        if (C1008c.this.f3569a.f3582a.get()) {
                            C1008c.this.mo3748g();
                        } else {
                            C1008c.this.f3569a.mo3703a(d, C1008c.this.f3638f.f3659a, C1008c.this.f3635c, C1008c.this.f3570b);
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.p053i.C1046k.AbstractC1047a
    /* renamed from: b */
    public final void mo3711b(int i) {
        mo3739a(0, i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: a */
    public final void mo3706a(int i) {
        int i2 = this.f3638f.f3660b - (i - this.f3639g.f3671b);
        int i3 = (i + this.f3638f.f3660b) - (this.f3639g.f3671b + this.f3639g.f3675f);
        int max = Math.max(i2, this.f3573p);
        this.f3573p = max;
        if (max > 0) {
            m3465h();
        }
        int max2 = Math.max(i3, this.f3574q);
        this.f3574q = max2;
        if (max2 > 0) {
            m3466i();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1036i
    /* renamed from: a */
    public final void mo3708a(AbstractC1036i<V> iVar, AbstractC1036i.AbstractC1041c cVar) {
        C1046k<T> kVar = iVar.f3639g;
        int i = this.f3639g.f3678i - kVar.f3678i;
        int i2 = this.f3639g.f3677h - kVar.f3677h;
        int i3 = kVar.f3673d;
        int i4 = kVar.f3671b;
        if (kVar.isEmpty() || i < 0 || i2 < 0 || this.f3639g.f3673d != Math.max(i3 - i, 0) || this.f3639g.f3671b != Math.max(i4 - i2, 0) || this.f3639g.f3675f != kVar.f3675f + i + i2) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i != 0) {
            int min = Math.min(i3, i);
            int i5 = i - min;
            int i6 = kVar.f3671b + kVar.f3675f;
            if (min != 0) {
                cVar.mo3699b(i6, min);
            }
            if (i5 != 0) {
                cVar.mo3698a(i6 + min, i5);
            }
        }
        if (i2 != 0) {
            int min2 = Math.min(i4, i2);
            int i7 = i2 - min2;
            if (min2 != 0) {
                cVar.mo3699b(i4, min2);
            }
            if (i7 != 0) {
                cVar.mo3698a(0, i7);
            }
        }
    }

    @Override // androidx.p053i.C1046k.AbstractC1047a
    /* renamed from: b */
    public final void mo3712b(int i, int i2, int i3) {
        int i4 = (this.f3574q - i2) - i3;
        this.f3574q = i4;
        this.f3572o = false;
        if (i4 > 0) {
            m3466i();
        }
        mo3744b(i, i2);
        mo3739a(i + i2, i3);
    }

    @Override // androidx.p053i.C1046k.AbstractC1047a
    /* renamed from: a */
    public final void mo3707a(int i, int i2, int i3) {
        int i4 = (this.f3573p - i2) - i3;
        this.f3573p = i4;
        this.f3571n = false;
        if (i4 > 0) {
            m3465h();
        }
        mo3744b(i, i2);
        mo3739a(0, i3);
        this.f3640h += i3;
        this.f3644l += i3;
        this.f3645m += i3;
    }

    C1008c(AbstractC1007b<K, V> bVar, Executor executor, Executor executor2, AbstractC1036i.AbstractC1039a<V> aVar, AbstractC1036i.C1042d dVar, K k, int i) {
        super(new C1046k(), executor, executor2, aVar, dVar);
        this.f3569a = bVar;
        this.f3640h = -1;
        if (bVar.f3582a.get()) {
            mo3748g();
        } else {
            bVar.mo3704a(k, this.f3638f.f3662d, this.f3638f.f3661c, this.f3635c, this.f3570b);
        }
    }
}
