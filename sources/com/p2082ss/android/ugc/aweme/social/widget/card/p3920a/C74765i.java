package com.p2082ss.android.ugc.aweme.social.widget.card.p3920a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.AbstractC74890a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.i */
public final class C74765i {

    /* renamed from: a */
    public final int f168052a;

    /* renamed from: b */
    public final C74762g f168053b;

    /* renamed from: c */
    public final C74764h f168054c;

    /* renamed from: d */
    public final Map<String, String> f168055d;

    /* renamed from: e */
    public final AbstractC74788j f168056e;

    /* renamed from: f */
    public final boolean f168057f;

    /* renamed from: g */
    public final AbstractC89172b<AbstractC74890a, C89391z> f168058g;

    static {
        Covode.recordClassIndex(87610);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74765i)) {
            return false;
        }
        C74765i iVar = (C74765i) obj;
        return this.f168052a == iVar.f168052a && C89219l.m154714a(this.f168053b, iVar.f168053b) && C89219l.m154714a(this.f168054c, iVar.f168054c) && C89219l.m154714a(this.f168055d, iVar.f168055d) && C89219l.m154714a(this.f168056e, iVar.f168056e) && this.f168057f == iVar.f168057f && C89219l.m154714a(this.f168058g, iVar.f168058g);
    }

    public final int hashCode() {
        int i = this.f168052a * 31;
        C74762g gVar = this.f168053b;
        int i2 = 0;
        int hashCode = (i + (gVar != null ? gVar.hashCode() : 0)) * 31;
        C74764h hVar = this.f168054c;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Map<String, String> map = this.f168055d;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        AbstractC74788j jVar = this.f168056e;
        int hashCode4 = (hashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        boolean z = this.f168057f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        AbstractC89172b<AbstractC74890a, C89391z> bVar = this.f168058g;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "SocialCardGroupConfig(scene=" + this.f168052a + ", permissionConfig=" + this.f168053b + ", recUserGroupCard=" + this.f168054c + ", eventExt=" + this.f168055d + ", stateListener=" + this.f168056e + ", withTitle=" + this.f168057f + ", titleConfig=" + this.f168058g + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.i$a */
    public static final class C74766a {

        /* renamed from: a */
        public int f168059a;

        /* renamed from: b */
        public boolean f168060b;

        /* renamed from: c */
        public AbstractC89172b<? super AbstractC74890a, C89391z> f168061c;

        /* renamed from: d */
        private C74764h f168062d;

        /* renamed from: e */
        private C74762g f168063e;

        /* renamed from: f */
        private Map<String, String> f168064f = new LinkedHashMap();

        /* renamed from: g */
        private AbstractC74788j f168065g;

        static {
            Covode.recordClassIndex(87611);
        }

        /* renamed from: a */
        public final C74765i mo117829a() {
            return new C74765i(this.f168059a, this.f168063e, this.f168062d, this.f168064f, this.f168065g, this.f168060b, this.f168061c);
        }

        /* renamed from: a */
        public final C74766a mo117824a(C74762g gVar) {
            C89219l.m154721d(gVar, "");
            this.f168063e = gVar;
            return this;
        }

        /* renamed from: a */
        public final C74766a mo117825a(C74764h hVar) {
            C89219l.m154721d(hVar, "");
            this.f168062d = hVar;
            return this;
        }

        /* renamed from: b */
        public final C74766a mo117830b(String str) {
            C89219l.m154721d(str, "");
            this.f168064f.put("position", str);
            return this;
        }

        /* renamed from: c */
        public final C74766a mo117831c(String str) {
            C89219l.m154721d(str, "");
            this.f168064f.put("previous_page", str);
            return this;
        }

        /* renamed from: a */
        public final C74766a mo117826a(AbstractC74788j jVar) {
            C89219l.m154721d(jVar, "");
            this.f168065g = jVar;
            return this;
        }

        /* renamed from: a */
        public final C74766a mo117827a(String str) {
            C89219l.m154721d(str, "");
            this.f168064f.put("enter_from", str);
            return this;
        }

        /* renamed from: a */
        public final C74766a mo117828a(Map<String, String> map) {
            C89219l.m154721d(map, "");
            this.f168064f.putAll(map);
            return this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.social.widget.card.view.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C74765i(int i, C74762g gVar, C74764h hVar, Map<String, String> map, AbstractC74788j jVar, boolean z, AbstractC89172b<? super AbstractC74890a, C89391z> bVar) {
        C89219l.m154721d(map, "");
        this.f168052a = i;
        this.f168053b = gVar;
        this.f168054c = hVar;
        this.f168055d = map;
        this.f168056e = jVar;
        this.f168057f = z;
        this.f168058g = bVar;
    }
}
