package okhttp3;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import okhttp3.C90198s;
import okhttp3.internal.C90084c;
import p4632k.AbstractC89425g;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: okhttp3.x */
public final class C90205x extends AbstractC90025ab {

    /* renamed from: a */
    public static final C90204w f204881a = C90204w.m156842a("multipart/mixed");

    /* renamed from: b */
    public static final C90204w f204882b = C90204w.m156842a("multipart/alternative");

    /* renamed from: c */
    public static final C90204w f204883c = C90204w.m156842a("multipart/digest");

    /* renamed from: d */
    public static final C90204w f204884d = C90204w.m156842a("multipart/parallel");

    /* renamed from: e */
    public static final C90204w f204885e = C90204w.m156842a("multipart/form-data");

    /* renamed from: h */
    private static final byte[] f204886h = {58, 32};

    /* renamed from: i */
    private static final byte[] f204887i = {C86745e.f195623b, 10};

    /* renamed from: j */
    private static final byte[] f204888j = {45, 45};

    /* renamed from: f */
    public final C90204w f204889f;

    /* renamed from: g */
    public final List<C90207b> f204890g;

    /* renamed from: k */
    private final C89427i f204891k;

    /* renamed from: l */
    private final C90204w f204892l;

    /* renamed from: m */
    private long f204893m = -1;

    @Override // okhttp3.AbstractC90025ab
    public final C90204w contentType() {
        return this.f204892l;
    }

    /* renamed from: okhttp3.x$a */
    public static final class C90206a {

        /* renamed from: a */
        private final C89427i f204894a;

        /* renamed from: b */
        private C90204w f204895b;

        /* renamed from: c */
        private final List<C90207b> f204896c;

        static {
            Covode.recordClassIndex(106380);
        }

        public C90206a() {
            this(UUID.randomUUID().toString());
        }

        /* renamed from: a */
        public final C90205x mo145083a() {
            if (!this.f204896c.isEmpty()) {
                return new C90205x(this.f204894a, this.f204895b, this.f204896c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        private C90206a(String str) {
            this.f204895b = C90205x.f204881a;
            this.f204896c = new ArrayList();
            this.f204894a = C89427i.encodeUtf8(str);
        }

        /* renamed from: a */
        public final C90206a mo145081a(C90204w wVar) {
            Objects.requireNonNull(wVar, "type == null");
            if (wVar.f204877a.equals("multipart")) {
                this.f204895b = wVar;
                return this;
            }
            throw new IllegalArgumentException("multipart != ".concat(String.valueOf(wVar)));
        }

        /* renamed from: a */
        public final C90206a mo145082a(C90207b bVar) {
            Objects.requireNonNull(bVar, "part == null");
            this.f204896c.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C90206a mo145078a(String str, String str2) {
            return mo145082a(C90207b.m156853a(str, str2));
        }

        /* renamed from: a */
        public final C90206a mo145080a(C90198s sVar, AbstractC90025ab abVar) {
            return mo145082a(C90207b.m156855a(sVar, abVar));
        }

        /* renamed from: a */
        public final C90206a mo145079a(String str, String str2, AbstractC90025ab abVar) {
            return mo145082a(C90207b.m156854a(str, str2, abVar));
        }
    }

    @Override // okhttp3.AbstractC90025ab
    public final long contentLength() {
        long j = this.f204893m;
        if (j != -1) {
            return j;
        }
        long a = m156845a((AbstractC89425g) null, true);
        this.f204893m = a;
        return a;
    }

    static {
        Covode.recordClassIndex(106379);
    }

    @Override // okhttp3.AbstractC90025ab
    public final void writeTo(AbstractC89425g gVar) {
        m156845a(gVar, false);
    }

    /* renamed from: okhttp3.x$b */
    public static final class C90207b {

        /* renamed from: a */
        public final C90198s f204897a;

        /* renamed from: b */
        public final AbstractC90025ab f204898b;

        static {
            Covode.recordClassIndex(106381);
        }

        private C90207b(C90198s sVar, AbstractC90025ab abVar) {
            this.f204897a = sVar;
            this.f204898b = abVar;
        }

        /* renamed from: a */
        public static C90207b m156853a(String str, String str2) {
            return m156854a(str, null, AbstractC90025ab.create((C90204w) null, str2));
        }

        /* renamed from: a */
        public static C90207b m156855a(C90198s sVar, AbstractC90025ab abVar) {
            Objects.requireNonNull(abVar, "body == null");
            if (sVar != null) {
                if (sVar.mo145028a("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                } else if (sVar.mo145028a("Content-Length") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
            }
            return new C90207b(sVar, abVar);
        }

        /* renamed from: a */
        public static C90207b m156854a(String str, String str2, AbstractC90025ab abVar) {
            Objects.requireNonNull(str, "name == null");
            StringBuilder sb = new StringBuilder("form-data; name=");
            C90205x.m156846a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                C90205x.m156846a(sb, str2);
            }
            return m156855a(new C90198s.C90199a().mo145042b("Content-Disposition", sb.toString()).mo145040a(), abVar);
        }
    }

    /* renamed from: a */
    static StringBuilder m156846a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: k.f */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: k.f */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: k.f */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private long m156845a(AbstractC89425g gVar, boolean z) {
        C89420f fVar;
        if (z) {
            gVar = new C89420f();
            fVar = gVar;
        } else {
            fVar = 0;
        }
        int size = this.f204890g.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C90207b bVar = this.f204890g.get(i);
            C90198s sVar = bVar.f204897a;
            AbstractC90025ab abVar = bVar.f204898b;
            gVar.mo68851a(f204888j);
            gVar.mo68850a(this.f204891k);
            gVar.mo68851a(f204887i);
            if (sVar != null) {
                int length = sVar.f204855a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    gVar.mo68849a(sVar.mo145027a(i2)).mo68851a(f204886h).mo68849a(sVar.mo145031b(i2)).mo68851a(f204887i);
                }
            }
            C90204w contentType = abVar.contentType();
            if (contentType != null) {
                gVar.mo68849a("Content-Type: ").mo68849a(contentType.toString()).mo68851a(f204887i);
            }
            long contentLength = abVar.contentLength();
            if (contentLength != -1) {
                gVar.mo68849a("Content-Length: ").mo68855b(contentLength).mo68851a(f204887i);
            } else if (z) {
                fVar.mo143854v();
                return -1;
            }
            byte[] bArr = f204887i;
            gVar.mo68851a(bArr);
            if (z) {
                j += contentLength;
            } else {
                abVar.writeTo(gVar);
            }
            gVar.mo68851a(bArr);
        }
        byte[] bArr2 = f204888j;
        gVar.mo68851a(bArr2);
        gVar.mo68850a(this.f204891k);
        gVar.mo68851a(bArr2);
        gVar.mo68851a(f204887i);
        if (!z) {
            return j;
        }
        long j2 = j + fVar.f203091b;
        fVar.mo143854v();
        return j2;
    }

    C90205x(C89427i iVar, C90204w wVar, List<C90207b> list) {
        this.f204891k = iVar;
        this.f204889f = wVar;
        this.f204892l = C90204w.m156842a(wVar + "; boundary=" + iVar.utf8());
        this.f204890g = C90084c.m156410a(list);
    }
}
