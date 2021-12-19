package p4600h;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.q */
public final class C89379q<T> implements Serializable {
    public static final C89380a Companion = new C89380a((byte) 0);

    /* renamed from: a */
    private final Object f203044a;

    static {
        Covode.recordClassIndex(105463);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ C89379q m157067boximpl(Object obj) {
        return new C89379q(obj);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static Object m157068constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m157069equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof C89379q) && C89219l.m154714a(obj, ((C89379q) obj2).m157076unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m157070equalsimpl0(Object obj, Object obj2) {
        return C89219l.m154714a(obj, obj2);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m157072hashCodeimpl(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m157076unboximpl() {
        return this.f203044a;
    }

    /* renamed from: h.q$a */
    public static final class C89380a {
        static {
            Covode.recordClassIndex(105464);
        }

        private C89380a() {
        }

        public /* synthetic */ C89380a(byte b) {
            this();
        }
    }

    /* renamed from: h.q$b */
    public static final class C89381b implements Serializable {
        public final Throwable exception;

        static {
            Covode.recordClassIndex(105465);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.exception + ')';
        }

        public C89381b(Throwable th) {
            C89219l.m154721d(th, "");
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C89381b) || !C89219l.m154714a(this.exception, ((C89381b) obj).exception)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        return m157072hashCodeimpl(this.f203044a);
    }

    public final String toString() {
        return m157075toStringimpl(this.f203044a);
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m157073isFailureimpl(Object obj) {
        return obj instanceof C89381b;
    }

    private /* synthetic */ C89379q(Object obj) {
        this.f203044a = obj;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m157074isSuccessimpl(Object obj) {
        if (!(obj instanceof C89381b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return m157069equalsimpl(this.f203044a, obj);
    }

    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m157071exceptionOrNullimpl(Object obj) {
        if (obj instanceof C89381b) {
            return ((C89381b) obj).exception;
        }
        return null;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m157075toStringimpl(Object obj) {
        if (obj instanceof C89381b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
