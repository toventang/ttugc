package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.a.aa */
public final class C89463aa<T> {

    /* renamed from: b */
    public static final C89465b f203171b = new C89465b((byte) 0);

    /* renamed from: a */
    public final Object f203172a;

    static {
        Covode.recordClassIndex(105552);
    }

    /* renamed from: a */
    public static final /* synthetic */ C89463aa m155320a(Object obj) {
        return new C89463aa(obj);
    }

    /* renamed from: kotlinx.coroutines.a.aa$b */
    public static final class C89465b {
        static {
            Covode.recordClassIndex(105554);
        }

        private C89465b() {
        }

        public /* synthetic */ C89465b(byte b) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.a.aa$a */
    public static final class C89464a {

        /* renamed from: a */
        public final Throwable f203173a;

        static {
            Covode.recordClassIndex(105553);
        }

        public final int hashCode() {
            Throwable th = this.f203173a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Closed(" + this.f203173a + ')';
        }

        public C89464a(Throwable th) {
            this.f203173a = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C89464a) || !C89219l.m154714a(this.f203173a, ((C89464a) obj).f203173a)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f203172a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f203172a;
        if (obj instanceof C89464a) {
            return obj.toString();
        }
        return "Value(" + obj + ')';
    }

    private /* synthetic */ C89463aa(Object obj) {
        this.f203172a = obj;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f203172a;
        if (!(obj instanceof C89463aa) || !C89219l.m154714a(obj2, ((C89463aa) obj).f203172a)) {
            return false;
        }
        return true;
    }
}
