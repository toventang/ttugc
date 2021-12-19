package okhttp3;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.C90084c;
import p4632k.AbstractC89425g;
import p4632k.C89420f;

/* renamed from: okhttp3.q */
public final class C90195q extends AbstractC90025ab {

    /* renamed from: a */
    private static final C90204w f204845a = C90204w.m156842a("application/x-www-form-urlencoded");

    /* renamed from: b */
    private final List<String> f204846b;

    /* renamed from: c */
    private final List<String> f204847c;

    @Override // okhttp3.AbstractC90025ab
    public final C90204w contentType() {
        return f204845a;
    }

    /* renamed from: okhttp3.q$a */
    public static final class C90196a {

        /* renamed from: a */
        private final List<String> f204848a;

        /* renamed from: b */
        private final List<String> f204849b;

        /* renamed from: c */
        private final Charset f204850c;

        static {
            Covode.recordClassIndex(106369);
        }

        public C90196a() {
            this((byte) 0);
        }

        /* renamed from: a */
        public final C90195q mo145023a() {
            return new C90195q(this.f204848a, this.f204849b);
        }

        private C90196a(byte b) {
            this.f204848a = new ArrayList();
            this.f204849b = new ArrayList();
            this.f204850c = null;
        }

        /* renamed from: a */
        public final C90196a mo145022a(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.f204848a.add(C90200t.m156793a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.f204850c));
            this.f204849b.add(C90200t.m156793a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.f204850c));
            return this;
        }

        /* renamed from: b */
        public final C90196a mo145024b(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.f204848a.add(C90200t.m156793a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.f204850c));
            this.f204849b.add(C90200t.m156793a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.f204850c));
            return this;
        }
    }

    /* renamed from: a */
    public final int mo145019a() {
        return this.f204846b.size();
    }

    @Override // okhttp3.AbstractC90025ab
    public final long contentLength() {
        return m156761a(null, true);
    }

    static {
        Covode.recordClassIndex(106368);
    }

    @Override // okhttp3.AbstractC90025ab
    public final void writeTo(AbstractC89425g gVar) {
        m156761a(gVar, false);
    }

    /* renamed from: a */
    public final String mo145020a(int i) {
        return this.f204846b.get(i);
    }

    /* renamed from: b */
    public final String mo145021b(int i) {
        return this.f204847c.get(i);
    }

    C90195q(List<String> list, List<String> list2) {
        this.f204846b = C90084c.m156410a(list);
        this.f204847c = C90084c.m156410a(list2);
    }

    /* renamed from: a */
    private long m156761a(AbstractC89425g gVar, boolean z) {
        C89420f a;
        if (z) {
            a = new C89420f();
        } else {
            a = gVar.mo68846a();
        }
        int size = this.f204846b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                a.mo68847a(38);
            }
            a.mo68849a(this.f204846b.get(i));
            a.mo68847a(61);
            a.mo68849a(this.f204847c.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = a.f203091b;
        a.mo143854v();
        return j;
    }
}
