package okhttp3.p4652a;

import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import okhttp3.AbstractC90202u;
import okhttp3.C90198s;
import okhttp3.internal.p4659g.C90160f;
import p4632k.C89420f;

/* renamed from: okhttp3.a.a */
public final class C90018a implements AbstractC90202u {

    /* renamed from: b */
    private static final Charset f204080b = Charset.forName("UTF-8");

    /* renamed from: a */
    public volatile EnumC90019a f204081a;

    /* renamed from: c */
    private final AbstractC90020b f204082c;

    /* renamed from: d */
    private volatile Set<String> f204083d;

    public C90018a() {
        this(AbstractC90020b.f204085b);
    }

    /* renamed from: okhttp3.a.a$b */
    public interface AbstractC90020b {

        /* renamed from: b */
        public static final AbstractC90020b f204085b = new AbstractC90020b() {
            /* class okhttp3.p4652a.C90018a.AbstractC90020b.C900211 */

            static {
                Covode.recordClassIndex(106193);
            }

            @Override // okhttp3.p4652a.C90018a.AbstractC90020b
            /* renamed from: a */
            public final void mo142341a(String str) {
                C90160f.f204720c.mo144946a(4, str, (Throwable) null);
            }
        };

        /* renamed from: a */
        void mo142341a(String str);

        static {
            Covode.recordClassIndex(106192);
        }
    }

    static {
        Covode.recordClassIndex(106190);
    }

    /* renamed from: okhttp3.a.a$a */
    public enum EnumC90019a {
        NONE,
        BASIC,
        HEADERS,
        BODY;

        static {
            Covode.recordClassIndex(106191);
        }
    }

    /* renamed from: a */
    public final C90018a mo144705a(EnumC90019a aVar) {
        Objects.requireNonNull(aVar, "level == null. Use Level.NONE instead.");
        this.f204081a = aVar;
        return this;
    }

    public C90018a(AbstractC90020b bVar) {
        this.f204083d = Collections.emptySet();
        this.f204081a = EnumC90019a.NONE;
        this.f204082c = bVar;
    }

    /* renamed from: a */
    private static boolean m156231a(C90198s sVar) {
        String a = sVar.mo145028a("Content-Encoding");
        if (a == null || a.equalsIgnoreCase("identity") || a.equalsIgnoreCase("gzip")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m156230a(C89420f fVar) {
        long j;
        try {
            C89420f fVar2 = new C89420f();
            if (fVar.f203091b < 64) {
                j = fVar.f203091b;
            } else {
                j = 64;
            }
            fVar.mo143803a(fVar2, 0, j);
            int i = 0;
            while (!fVar2.mo143815e()) {
                int t = fVar2.mo143851t();
                if (Character.isISOControl(t) && !Character.isWhitespace(t)) {
                    return false;
                }
                i++;
                if (i >= 16) {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Long] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0376  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // okhttp3.AbstractC90202u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C90029ac intercept(okhttp3.AbstractC90202u.AbstractC90203a r21) {
        /*
        // Method dump skipped, instructions count: 907
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p4652a.C90018a.intercept(okhttp3.u$a):okhttp3.ac");
    }

    /* renamed from: a */
    private void m156229a(C90198s sVar, int i) {
        String b;
        if (this.f204083d.contains(sVar.mo145027a(i))) {
            b = "██";
        } else {
            b = sVar.mo145031b(i);
        }
        this.f204082c.mo142341a(sVar.mo145027a(i) + ": " + b);
    }
}
