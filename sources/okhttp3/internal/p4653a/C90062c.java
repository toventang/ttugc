package okhttp3.internal.p4653a;

import com.bytedance.covode.number.Covode;
import java.util.Date;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.Request;
import okhttp3.internal.p4655c.C90091d;
import okhttp3.internal.p4655c.C90093e;

/* renamed from: okhttp3.internal.a.c */
public final class C90062c {

    /* renamed from: a */
    public final Request f204337a;

    /* renamed from: b */
    public final C90029ac f204338b;

    static {
        Covode.recordClassIndex(106234);
    }

    C90062c(Request request, C90029ac acVar) {
        this.f204337a = request;
        this.f204338b = acVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r3.mo144723c().f204183g == false) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m156327a(okhttp3.C90029ac r3, okhttp3.Request r4) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4653a.C90062c.m156327a(okhttp3.ac, okhttp3.Request):boolean");
    }

    /* renamed from: okhttp3.internal.a.c$a */
    public static class C90063a {

        /* renamed from: a */
        final long f204339a;

        /* renamed from: b */
        final Request f204340b;

        /* renamed from: c */
        final C90029ac f204341c;

        /* renamed from: d */
        Date f204342d;

        /* renamed from: e */
        String f204343e;

        /* renamed from: f */
        Date f204344f;

        /* renamed from: g */
        String f204345g;

        /* renamed from: h */
        Date f204346h;

        /* renamed from: i */
        long f204347i;

        /* renamed from: j */
        long f204348j;

        /* renamed from: k */
        String f204349k;

        /* renamed from: l */
        int f204350l = -1;

        static {
            Covode.recordClassIndex(106235);
        }

        public C90063a(long j, Request request, C90029ac acVar) {
            this.f204339a = j;
            this.f204340b = request;
            this.f204341c = acVar;
            if (acVar != null) {
                this.f204347i = acVar.f204115k;
                this.f204348j = acVar.f204116l;
                C90198s sVar = acVar.f204110f;
                int length = sVar.f204855a.length / 2;
                for (int i = 0; i < length; i++) {
                    String a = sVar.mo145027a(i);
                    String b = sVar.mo145031b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.f204342d = C90091d.m156439a(b);
                        this.f204343e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.f204346h = C90091d.m156439a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f204344f = C90091d.m156439a(b);
                        this.f204345g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.f204349k = b;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.f204350l = C90093e.m156440a(b, -1);
                    }
                }
            }
        }
    }
}
