package p4600h;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.u */
public final class C89386u<A, B, C> implements Serializable {

    /* renamed from: a */
    private final A f203053a;

    /* renamed from: b */
    private final B f203054b;

    /* renamed from: c */
    private final C f203055c;

    static {
        Covode.recordClassIndex(105470);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.u */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C89386u copy$default(C89386u uVar, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = uVar.f203053a;
        }
        if ((i & 2) != 0) {
            obj2 = uVar.f203054b;
        }
        if ((i & 4) != 0) {
            obj3 = uVar.f203055c;
        }
        return uVar.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.f203053a;
    }

    public final B component2() {
        return this.f203054b;
    }

    public final C component3() {
        return this.f203055c;
    }

    public final C89386u<A, B, C> copy(A a, B b, C c) {
        return new C89386u<>(a, b, c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89386u)) {
            return false;
        }
        C89386u uVar = (C89386u) obj;
        return C89219l.m154714a(this.f203053a, uVar.f203053a) && C89219l.m154714a(this.f203054b, uVar.f203054b) && C89219l.m154714a(this.f203055c, uVar.f203055c);
    }

    public final int hashCode() {
        A a = this.f203053a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f203054b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f203055c;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public final A getFirst() {
        return this.f203053a;
    }

    public final B getSecond() {
        return this.f203054b;
    }

    public final C getThird() {
        return this.f203055c;
    }

    public final String toString() {
        return "(" + ((Object) this.f203053a) + ", " + ((Object) this.f203054b) + ", " + ((Object) this.f203055c) + ')';
    }

    public C89386u(A a, B b, C c) {
        this.f203053a = a;
        this.f203054b = b;
        this.f203055c = c;
    }
}
