package p4600h.p4619j;

import com.bytedance.covode.number.Covode;

/* renamed from: h.j.g */
public final class C89269g extends C89266e implements AbstractC89265d<Integer> {

    /* renamed from: e */
    public static final C89269g f202934e = new C89269g(1, 0);

    /* renamed from: f */
    public static final C89270a f202935f = new C89270a((byte) 0);

    /* renamed from: h.j.g$a */
    public static final class C89270a {
        static {
            Covode.recordClassIndex(105354);
        }

        private C89270a() {
        }

        public /* synthetic */ C89270a(byte b) {
            this();
        }
    }

    @Override // p4600h.p4619j.C89266e
    /* renamed from: a */
    public final boolean mo143680a() {
        if (this.f202927a > this.f202928b) {
            return true;
        }
        return false;
    }

    @Override // p4600h.p4619j.C89266e
    public final int hashCode() {
        if (mo143680a()) {
            return -1;
        }
        return (this.f202927a * 31) + this.f202928b;
    }

    static {
        Covode.recordClassIndex(105353);
    }

    @Override // p4600h.p4619j.C89266e
    public final String toString() {
        return this.f202927a + ".." + this.f202928b;
    }

    /* renamed from: a */
    public final boolean mo143686a(int i) {
        if (this.f202927a > i || i > this.f202928b) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // p4600h.p4619j.AbstractC89265d
    /* renamed from: a */
    public final /* synthetic */ boolean mo143673a(Integer num) {
        return mo143686a(num.intValue());
    }

    @Override // p4600h.p4619j.C89266e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C89269g)) {
            return false;
        }
        if (mo143680a() && ((C89266e) obj).mo143680a()) {
            return true;
        }
        C89266e eVar = (C89266e) obj;
        if (this.f202927a == eVar.f202927a && this.f202928b == eVar.f202928b) {
            return true;
        }
        return false;
    }

    public C89269g(int i, int i2) {
        super(i, i2, 1);
    }
}
