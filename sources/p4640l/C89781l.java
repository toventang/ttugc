package p4640l;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90031ad;
import okhttp3.C90029ac;

/* renamed from: l.l */
public final class C89781l<T> {

    /* renamed from: a */
    public final C90029ac f203560a;

    /* renamed from: b */
    public final T f203561b;

    /* renamed from: c */
    public final AbstractC90031ad f203562c;

    static {
        Covode.recordClassIndex(105875);
    }

    public final String toString() {
        return this.f203560a.toString();
    }

    /* renamed from: a */
    public static <T> C89781l<T> m155849a(T t, C90029ac acVar) {
        C89787o.m155873a(acVar, "rawResponse == null");
        if (acVar.mo144720a()) {
            return new C89781l<>(acVar, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    C89781l(C90029ac acVar, T t, AbstractC90031ad adVar) {
        this.f203560a = acVar;
        this.f203561b = t;
        this.f203562c = adVar;
    }
}
