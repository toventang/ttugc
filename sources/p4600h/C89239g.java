package p4600h;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.g */
public final class C89239g implements Comparable<C89239g> {

    /* renamed from: d */
    public static final C89239g f202903d = new C89239g();

    /* renamed from: e */
    public static final C89240a f202904e = new C89240a((byte) 0);

    /* renamed from: a */
    public final int f202905a = 1;

    /* renamed from: b */
    public final int f202906b = 5;

    /* renamed from: c */
    public final int f202907c = 30;

    /* renamed from: f */
    private final int f202908f = 66846;

    /* renamed from: h.g$a */
    public static final class C89240a {
        static {
            Covode.recordClassIndex(105324);
        }

        private C89240a() {
        }

        public /* synthetic */ C89240a(byte b) {
            this();
        }
    }

    public final int hashCode() {
        return this.f202908f;
    }

    static {
        Covode.recordClassIndex(105323);
    }

    public final String toString() {
        return new StringBuilder().append(this.f202905a).append('.').append(this.f202906b).append('.').append(this.f202907c).toString();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C89239g gVar) {
        C89239g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        return this.f202908f - gVar2.f202908f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89239g)) {
            obj = null;
        }
        C89239g gVar = (C89239g) obj;
        if (gVar != null && this.f202908f == gVar.f202908f) {
            return true;
        }
        return false;
    }
}
