package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89659v;

/* renamed from: kotlinx.coroutines.cf */
public final class C89584cf {

    /* renamed from: a */
    public static final C89659v f203313a = new C89659v("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C89659v f203314b = new C89659v("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    public static final C89659v f203315c = new C89659v("COMPLETING_RETRY");

    /* renamed from: d */
    public static final C89659v f203316d = new C89659v("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    public static final C89659v f203317e = new C89659v("SEALED");

    /* renamed from: f */
    public static final C89551bk f203318f = new C89551bk(false);

    /* renamed from: g */
    public static final C89551bk f203319g = new C89551bk(true);

    static {
        Covode.recordClassIndex(105675);
    }

    /* renamed from: a */
    public static final Object m155518a(Object obj) {
        if (obj instanceof AbstractC89563bu) {
            return new C89564bv((AbstractC89563bu) obj);
        }
        return obj;
    }

    /* renamed from: b */
    public static final Object m155519b(Object obj) {
        Object obj2;
        AbstractC89563bu buVar;
        if (!(obj instanceof C89564bv)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C89564bv bvVar = (C89564bv) obj2;
        return (bvVar == null || (buVar = bvVar.f203282a) == null) ? obj : buVar;
    }
}
