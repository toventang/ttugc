package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

/* renamed from: f.a.e.j.h */
public final class C88906h {

    /* renamed from: a */
    public static final Throwable f201913a = new C88907a();

    /* renamed from: f.a.e.j.h$a */
    static final class C88907a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        static {
            Covode.recordClassIndex(104949);
        }

        public final Throwable fillInStackTrace() {
            return this;
        }

        C88907a() {
            super("No further exceptions");
        }
    }

    static {
        Covode.recordClassIndex(104948);
    }

    /* renamed from: b */
    public static <E extends Throwable> Exception m154106b(Throwable th) {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: a */
    public static RuntimeException m154104a(Throwable th) {
        if (th instanceof Error) {
            throw th;
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static String m154105a(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }
}
