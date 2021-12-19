package p4560f.p4561a.p4566c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: f.a.c.a */
public final class C88417a extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: a */
    private final List<Throwable> f200686a;

    /* renamed from: b */
    private final String f200687b;

    /* renamed from: c */
    private Throwable f200688c;

    static {
        Covode.recordClassIndex(104459);
    }

    /* renamed from: f.a.c.a$a */
    static final class C88418a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        static {
            Covode.recordClassIndex(104460);
        }

        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        C88418a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.c.a$b */
    public static abstract class AbstractC88419b {
        static {
            Covode.recordClassIndex(104461);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo142960a(Object obj);

        AbstractC88419b() {
        }
    }

    public final List<Throwable> getExceptions() {
        return this.f200686a;
    }

    public final String getMessage() {
        return this.f200687b;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final int size() {
        return this.f200686a.size();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x001b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x001b */
    public final synchronized Throwable getCause() {
        Throwable th;
        MethodCollector.m26663i(2634);
        if (this.f200688c == null) {
            Throwable aVar = new C88418a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f200686a.iterator();
            Throwable th2 = aVar;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th3 : m153663a(next)) {
                        if (hashSet.contains(th3)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th3);
                        }
                    }
                    try {
                        th2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    th2 = m153666b(th2);
                }
            }
            this.f200688c = aVar;
        }
        th = this.f200688c;
        MethodCollector.m26664o(2634);
        return th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.c.a$c */
    public static final class C88420c extends AbstractC88419b {

        /* renamed from: a */
        private final PrintStream f200689a;

        static {
            Covode.recordClassIndex(104462);
        }

        C88420c(PrintStream printStream) {
            this.f200689a = printStream;
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4566c.C88417a.AbstractC88419b
        /* renamed from: a */
        public final void mo142960a(Object obj) {
            this.f200689a.println(obj);
        }
    }

    /* renamed from: f.a.c.a$d */
    static final class C88421d extends AbstractC88419b {

        /* renamed from: a */
        private final PrintWriter f200690a;

        static {
            Covode.recordClassIndex(104463);
        }

        C88421d(PrintWriter printWriter) {
            this.f200690a = printWriter;
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4566c.C88417a.AbstractC88419b
        /* renamed from: a */
        public final void mo142960a(Object obj) {
            this.f200690a.println(obj);
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m153664a(new C88420c(printStream));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88417a(java.lang.Throwable... r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0011
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "exceptions was null"
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
        L_0x000d:
            r2.<init>(r0)
            return
        L_0x0011:
            java.util.List r0 = java.util.Arrays.asList(r3)
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4566c.C88417a.<init>(java.lang.Throwable[]):void");
    }

    /* renamed from: a */
    private static List<Throwable> m153663a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Throwable m153666b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m153664a(new C88421d(printWriter));
    }

    public C88417a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof C88417a) {
                    linkedHashSet.addAll(((C88417a) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f200686a = unmodifiableList;
            this.f200687b = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    /* renamed from: a */
    private void m153664a(AbstractC88419b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this).append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ").append(stackTraceElement).append('\n');
        }
        int i = 1;
        for (Throwable th : this.f200686a) {
            sb.append("  ComposedException ").append(i).append(" :\n");
            m153665a(sb, th, "\t");
            i++;
        }
        bVar.mo142960a(sb.toString());
    }

    /* renamed from: a */
    private static void m153665a(StringBuilder sb, Throwable th, String str) {
        while (true) {
            sb.append(str).append(th).append('\n');
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\t\tat ").append(stackTraceElement).append('\n');
            }
            if (th.getCause() != null) {
                sb.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }
}
