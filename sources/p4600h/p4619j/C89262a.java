package p4600h.p4619j;

import com.bytedance.covode.number.Covode;

/* renamed from: h.j.a */
final class C89262a implements AbstractC89264c<Double> {

    /* renamed from: a */
    private final double f202922a;

    /* renamed from: b */
    private final double f202923b;

    static {
        Covode.recordClassIndex(105346);
    }

    /* renamed from: a */
    private boolean m154747a() {
        if (this.f202922a > this.f202923b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (m154747a()) {
            return -1;
        }
        return (Double.valueOf(this.f202922a).hashCode() * 31) + Double.valueOf(this.f202923b).hashCode();
    }

    public final String toString() {
        return this.f202922a + ".." + this.f202923b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // p4600h.p4619j.AbstractC89264c, p4600h.p4619j.AbstractC89265d
    /* renamed from: a */
    public final /* synthetic */ boolean mo143673a(Double d) {
        double doubleValue = d.doubleValue();
        if (doubleValue < this.f202922a || doubleValue > this.f202923b) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C89262a)) {
            return false;
        }
        if (m154747a() && ((C89262a) obj).m154747a()) {
            return true;
        }
        C89262a aVar = (C89262a) obj;
        if (this.f202922a == aVar.f202922a && this.f202923b == aVar.f202923b) {
            return true;
        }
        return false;
    }

    public C89262a(double d, double d2) {
        this.f202922a = d;
        this.f202923b = d2;
    }
}
