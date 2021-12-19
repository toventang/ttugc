package androidx.p043e.p044a;

import androidx.p043e.p044a.AbstractC0855b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.e.a.d */
public final class C0875d extends AbstractC0855b<C0875d> {

    /* renamed from: x */
    public C0876e f3167x;

    /* renamed from: y */
    private float f3168y;

    /* renamed from: z */
    private boolean f3169z;

    static {
        Covode.recordClassIndex(961);
    }

    @Override // androidx.p043e.p044a.AbstractC0855b
    /* renamed from: a */
    public final void mo3148a() {
        C0876e eVar = this.f3167x;
        if (eVar != null) {
            double d = (double) ((float) eVar.f3174e);
            if (d > ((double) this.f3158u)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d >= ((double) this.f3159v)) {
                C0876e eVar2 = this.f3167x;
                eVar2.f3172c = Math.abs((double) (this.f3160w * 0.75f));
                eVar2.f3173d = eVar2.f3172c * 62.5d;
                super.mo3148a();
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: a */
    public final C0875d mo3157a(C0876e eVar) {
        this.f3167x = eVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p043e.p044a.AbstractC0855b
    /* renamed from: b */
    public final boolean mo3151b(long j) {
        if (this.f3169z) {
            float f = this.f3168y;
            if (f != Float.MAX_VALUE) {
                this.f3167x.f3174e = (double) f;
                this.f3168y = Float.MAX_VALUE;
            }
            this.f3153p = (float) this.f3167x.f3174e;
            this.f3152o = 0.0f;
            this.f3169z = false;
            return true;
        }
        if (this.f3168y != Float.MAX_VALUE) {
            long j2 = j / 2;
            AbstractC0855b.C0870a a = this.f3167x.mo3158a((double) this.f3153p, (double) this.f3152o, j2);
            this.f3167x.f3174e = (double) this.f3168y;
            this.f3168y = Float.MAX_VALUE;
            AbstractC0855b.C0870a a2 = this.f3167x.mo3158a((double) a.f3164a, (double) a.f3165b, j2);
            this.f3153p = a2.f3164a;
            this.f3152o = a2.f3165b;
        } else {
            AbstractC0855b.C0870a a3 = this.f3167x.mo3158a((double) this.f3153p, (double) this.f3152o, j);
            this.f3153p = a3.f3164a;
            this.f3152o = a3.f3165b;
        }
        this.f3153p = Math.max(this.f3153p, this.f3159v);
        this.f3153p = Math.min(this.f3153p, this.f3158u);
        float f2 = this.f3153p;
        float f3 = this.f3152o;
        C0876e eVar = this.f3167x;
        if (((double) Math.abs(f3)) >= eVar.f3173d || ((double) Math.abs(f2 - ((float) eVar.f3174e))) >= eVar.f3172c) {
            return false;
        }
        this.f3153p = (float) this.f3167x.f3174e;
        this.f3152o = 0.0f;
        return true;
    }

    public <K> C0875d(K k, AbstractC0874c<K> cVar) {
        super(k, cVar);
        this.f3168y = Float.MAX_VALUE;
    }

    public <K> C0875d(K k, AbstractC0874c<K> cVar, byte b) {
        super(k, cVar);
        this.f3168y = Float.MAX_VALUE;
        this.f3167x = new C0876e((byte) 0);
    }
}
