package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import p4600h.C89388w;

/* renamed from: kotlinx.coroutines.internal.k */
public final class C89645k {

    /* renamed from: a */
    public static final Object f203382a = new C89659v("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f203383b = new C89659v("LIST_EMPTY");

    static {
        Covode.recordClassIndex(105738);
    }

    /* renamed from: a */
    public static final C89646l m155583a(Object obj) {
        Object obj2;
        C89646l lVar;
        if (!(obj instanceof C89656s)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C89656s sVar = (C89656s) obj2;
        if (sVar != null && (lVar = sVar.f203405a) != null) {
            return lVar;
        }
        if (obj != null) {
            return (C89646l) obj;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
