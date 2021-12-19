package p4600h;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.p */
public final class C89378p<A, B> implements Serializable {

    /* renamed from: a */
    public final B f203042a;

    /* renamed from: b */
    private final A f203043b;

    static {
        Covode.recordClassIndex(105462);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.p */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C89378p copy$default(C89378p pVar, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = pVar.f203043b;
        }
        if ((i & 2) != 0) {
            obj2 = pVar.f203042a;
        }
        return pVar.copy(obj, obj2);
    }

    public final A component1() {
        return this.f203043b;
    }

    public final B component2() {
        return this.f203042a;
    }

    public final C89378p<A, B> copy(A a, B b) {
        return new C89378p<>(a, b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89378p)) {
            return false;
        }
        C89378p pVar = (C89378p) obj;
        return C89219l.m154714a(this.f203043b, pVar.f203043b) && C89219l.m154714a(this.f203042a, pVar.f203042a);
    }

    public final int hashCode() {
        A a = this.f203043b;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f203042a;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final A getFirst() {
        return this.f203043b;
    }

    public final B getSecond() {
        return this.f203042a;
    }

    public final String toString() {
        return "(" + ((Object) this.f203043b) + ", " + ((Object) this.f203042a) + ')';
    }

    public C89378p(A a, B b) {
        this.f203043b = a;
        this.f203042a = b;
    }
}
