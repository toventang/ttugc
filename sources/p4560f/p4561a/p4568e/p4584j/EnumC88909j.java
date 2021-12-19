package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.j.j */
public enum EnumC88909j {
    COMPLETE;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }

    public static Object complete() {
        return COMPLETE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.j.j$b */
    public static final class C88911b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: a */
        final Throwable f201916a;

        static {
            Covode.recordClassIndex(104953);
        }

        public final int hashCode() {
            return this.f201916a.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f201916a + "]";
        }

        C88911b(Throwable th) {
            this.f201916a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C88911b) {
                return C88466b.m153698a(this.f201916a, ((C88911b) obj).f201916a);
            }
            return false;
        }
    }

    /* renamed from: f.a.e.j.j$a */
    static final class C88910a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: a */
        final AbstractC88412b f201915a;

        static {
            Covode.recordClassIndex(104952);
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.f201915a + "]";
        }

        C88910a(AbstractC88412b bVar) {
            this.f201915a = bVar;
        }
    }

    /* renamed from: f.a.e.j.j$c */
    static final class C88912c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: a */
        final AbstractC90215d f201917a;

        static {
            Covode.recordClassIndex(104954);
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.f201917a + "]";
        }

        C88912c(AbstractC90215d dVar) {
            this.f201917a = dVar;
        }
    }

    static {
        Covode.recordClassIndex(104951);
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof C88910a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof C88911b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof C88912c;
    }

    public static Object disposable(AbstractC88412b bVar) {
        return new C88910a(bVar);
    }

    public static Object error(Throwable th) {
        return new C88911b(th);
    }

    public static AbstractC88412b getDisposable(Object obj) {
        return ((C88910a) obj).f201915a;
    }

    public static Throwable getError(Object obj) {
        return ((C88911b) obj).f201916a;
    }

    public static AbstractC90215d getSubscription(Object obj) {
        return ((C88912c) obj).f201917a;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static Object subscription(AbstractC90215d dVar) {
        return new C88912c(dVar);
    }

    public static <T> boolean accept(Object obj, AbstractC88986z<? super T> zVar) {
        if (obj == COMPLETE) {
            zVar.onComplete();
            return true;
        } else if (obj instanceof C88911b) {
            zVar.onError(((C88911b) obj).f201916a);
            return true;
        } else {
            zVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean accept(Object obj, AbstractC90214c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C88911b) {
            cVar.onError(((C88911b) obj).f201916a);
            return true;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, AbstractC88986z<? super T> zVar) {
        if (obj == COMPLETE) {
            zVar.onComplete();
            return true;
        } else if (obj instanceof C88911b) {
            zVar.onError(((C88911b) obj).f201916a);
            return true;
        } else if (obj instanceof C88910a) {
            zVar.onSubscribe(((C88910a) obj).f201915a);
            return false;
        } else {
            zVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, AbstractC90214c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C88911b) {
            cVar.onError(((C88911b) obj).f201916a);
            return true;
        } else if (obj instanceof C88912c) {
            cVar.onSubscribe(((C88912c) obj).f201917a);
            return false;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }
}
