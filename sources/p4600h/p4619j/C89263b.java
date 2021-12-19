package p4600h.p4619j;

import com.bytedance.covode.number.Covode;

/* renamed from: h.j.b */
final class C89263b implements AbstractC89264c<Float> {

    /* renamed from: a */
    private final float f202924a;

    /* renamed from: b */
    private final float f202925b;

    static {
        Covode.recordClassIndex(105347);
    }

    /* renamed from: a */
    private boolean m154749a() {
        if (this.f202924a > this.f202925b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (m154749a()) {
            return -1;
        }
        return (Float.valueOf(this.f202924a).hashCode() * 31) + Float.valueOf(this.f202925b).hashCode();
    }

    public final String toString() {
        return this.f202924a + ".." + this.f202925b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // p4600h.p4619j.AbstractC89264c, p4600h.p4619j.AbstractC89265d
    /* renamed from: a */
    public final /* synthetic */ boolean mo143673a(Float f) {
        float floatValue = f.floatValue();
        if (floatValue < this.f202924a || floatValue > this.f202925b) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C89263b)) {
            return false;
        }
        if (m154749a() && ((C89263b) obj).m154749a()) {
            return true;
        }
        C89263b bVar = (C89263b) obj;
        if (this.f202924a == bVar.f202924a && this.f202925b == bVar.f202925b) {
            return true;
        }
        return false;
    }

    public C89263b(float f, float f2) {
        this.f202924a = f;
        this.f202925b = f2;
    }
}
