package p4640l;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90025ab;
import okhttp3.C90195q;
import okhttp3.C90198s;
import okhttp3.C90200t;
import okhttp3.C90204w;
import okhttp3.C90205x;
import okhttp3.Request;
import p4632k.AbstractC89425g;
import p4632k.C89420f;

/* renamed from: l.k */
final class C89779k {

    /* renamed from: d */
    private static final char[] f203547d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    String f203548a;

    /* renamed from: b */
    C90205x.C90206a f203549b;

    /* renamed from: c */
    public AbstractC90025ab f203550c;

    /* renamed from: e */
    private final String f203551e;

    /* renamed from: f */
    private final C90200t f203552f;

    /* renamed from: g */
    private C90200t.C90201a f203553g;

    /* renamed from: h */
    private final Request.C90016a f203554h;

    /* renamed from: i */
    private C90204w f203555i;

    /* renamed from: j */
    private final boolean f203556j;

    /* renamed from: k */
    private C90195q.C90196a f203557k;

    /* renamed from: l.k$a */
    static class C89780a extends AbstractC90025ab {

        /* renamed from: a */
        private final AbstractC90025ab f203558a;

        /* renamed from: b */
        private final C90204w f203559b;

        static {
            Covode.recordClassIndex(105874);
        }

        @Override // okhttp3.AbstractC90025ab
        public final C90204w contentType() {
            return this.f203559b;
        }

        @Override // okhttp3.AbstractC90025ab
        public final long contentLength() {
            return this.f203558a.contentLength();
        }

        @Override // okhttp3.AbstractC90025ab
        public final void writeTo(AbstractC89425g gVar) {
            this.f203558a.writeTo(gVar);
        }

        C89780a(AbstractC90025ab abVar, C90204w wVar) {
            this.f203558a = abVar;
            this.f203559b = wVar;
        }
    }

    static {
        Covode.recordClassIndex(105873);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Request mo144312a() {
        C90200t d;
        C90200t.C90201a aVar = this.f203553g;
        if (aVar != null) {
            d = aVar.mo145068b();
        } else {
            d = this.f203552f.mo145051d(this.f203548a);
            if (d == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f203552f + ", Relative: " + this.f203548a);
            }
        }
        C89780a aVar2 = this.f203550c;
        if (aVar2 == null) {
            C90195q.C90196a aVar3 = this.f203557k;
            if (aVar3 != null) {
                aVar2 = aVar3.mo145023a();
            } else {
                C90205x.C90206a aVar4 = this.f203549b;
                if (aVar4 != null) {
                    aVar2 = aVar4.mo145083a();
                } else if (this.f203556j) {
                    aVar2 = AbstractC90025ab.create((C90204w) null, new byte[0]);
                }
            }
        }
        C90204w wVar = this.f203555i;
        if (wVar != null) {
            if (aVar2 != null) {
                aVar2 = new C89780a(aVar2, wVar);
            } else {
                this.f203554h.mo144700b("Content-Type", wVar.toString());
            }
        }
        return this.f203554h.mo144697a(d).mo144693a(this.f203551e, aVar2).mo144698a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144315a(C90198s sVar, AbstractC90025ab abVar) {
        this.f203549b.mo145080a(sVar, abVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144313a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            C90204w b = C90204w.m156843b(str2);
            if (b != null) {
                this.f203555i = b;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)));
        }
        this.f203554h.mo144700b(str, str2);
    }

    /* renamed from: a */
    static String m155843a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C89420f fVar = new C89420f();
                fVar.mo143801a(str, 0, i);
                C89420f fVar2 = null;
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (fVar2 == null) {
                                fVar2 = new C89420f();
                            }
                            fVar2.mo143814e(codePointAt2);
                            while (!fVar2.mo143815e()) {
                                int h = fVar2.mo143824h() & 255;
                                fVar.mo68847a(37);
                                char[] cArr = f203547d;
                                fVar.mo68847a((int) cArr[(h >> 4) & 15]);
                                fVar.mo68847a((int) cArr[h & 15]);
                            }
                        } else {
                            fVar.mo143814e(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                }
                return fVar.mo143848r();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo144316b(String str, String str2, boolean z) {
        if (z) {
            this.f203557k.mo145024b(str, str2);
        } else {
            this.f203557k.mo145022a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144314a(String str, String str2, boolean z) {
        String str3 = this.f203548a;
        if (str3 != null) {
            C90200t.C90201a e = this.f203552f.mo145053e(str3);
            this.f203553g = e;
            if (e != null) {
                this.f203548a = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f203552f + ", Relative: " + this.f203548a);
            }
        }
        if (z) {
            this.f203553g.mo145067b(str, str2);
        } else {
            this.f203553g.mo145064a(str, str2);
        }
    }

    C89779k(String str, C90200t tVar, String str2, C90198s sVar, C90204w wVar, boolean z, boolean z2, boolean z3) {
        this.f203551e = str;
        this.f203552f = tVar;
        this.f203548a = str2;
        Request.C90016a aVar = new Request.C90016a();
        this.f203554h = aVar;
        this.f203555i = wVar;
        this.f203556j = z;
        if (sVar != null) {
            aVar.mo144696a(sVar);
        }
        if (z2) {
            this.f203557k = new C90195q.C90196a();
        } else if (z3) {
            C90205x.C90206a aVar2 = new C90205x.C90206a();
            this.f203549b = aVar2;
            aVar2.mo145081a(C90205x.f204885e);
        }
    }
}
