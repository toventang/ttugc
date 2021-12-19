package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import p4600h.p4601a.AbstractC89033a;
import p4600h.p4601a.AbstractC89054d;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.C89309k;

/* access modifiers changed from: package-private */
/* renamed from: h.m.k */
public final class C89346k implements AbstractC89345j {

    /* renamed from: a */
    final Matcher f203009a;

    /* renamed from: b */
    private final AbstractC89343h f203010b = new C89348b(this);

    /* renamed from: c */
    private List<String> f203011c;

    /* renamed from: d */
    private final CharSequence f203012d;

    static {
        Covode.recordClassIndex(105430);
    }

    @Override // p4600h.p4622m.AbstractC89345j
    /* renamed from: c */
    public final AbstractC89343h mo143721c() {
        return this.f203010b;
    }

    /* renamed from: h.m.k$a */
    public static final class C89347a extends AbstractC89054d<String> {

        /* renamed from: b */
        final /* synthetic */ C89346k f203013b;

        static {
            Covode.recordClassIndex(105431);
        }

        @Override // p4600h.p4601a.AbstractC89033a
        /* renamed from: a */
        public final int mo143374a() {
            return this.f203013b.f203009a.groupCount() + 1;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89347a(C89346k kVar) {
            this.f203013b = kVar;
        }

        @Override // p4600h.p4601a.AbstractC89033a
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains(obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List, p4600h.p4601a.AbstractC89054d
        public final /* synthetic */ String get(int i) {
            String group = this.f203013b.f203009a.group(i);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // p4600h.p4601a.AbstractC89054d
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf(obj);
        }

        @Override // p4600h.p4601a.AbstractC89054d
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf(obj);
        }
    }

    /* renamed from: h.m.k$b */
    public static final class C89348b extends AbstractC89033a<C89342g> implements AbstractC89344i {

        /* renamed from: a */
        final /* synthetic */ C89346k f203014a;

        static {
            Covode.recordClassIndex(105432);
        }

        @Override // p4600h.p4601a.AbstractC89033a
        public final boolean isEmpty() {
            return false;
        }

        @Override // p4600h.p4601a.AbstractC89033a
        /* renamed from: a */
        public final int mo143374a() {
            return this.f203014a.f203009a.groupCount() + 1;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<C89342g> iterator() {
            return C89309k.m154810e(C89070n.m154598r(C89070n.m154518a((Collection<?>) this)), new C89349a(this)).mo2926a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89348b(C89346k kVar) {
            this.f203014a = kVar;
        }

        /* renamed from: h.m.k$b$a */
        static final class C89349a extends AbstractC89220m implements AbstractC89172b<Integer, C89342g> {

            /* renamed from: a */
            final /* synthetic */ C89348b f203015a;

            static {
                Covode.recordClassIndex(105433);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C89349a(C89348b bVar) {
                super(1);
                this.f203015a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89342g invoke(Integer num) {
                return this.f203015a.mo143718a(num.intValue());
            }
        }

        @Override // p4600h.p4601a.AbstractC89033a
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof C89342g)) {
                return super.contains(obj);
            }
            return false;
        }

        @Override // p4600h.p4622m.AbstractC89343h
        /* renamed from: a */
        public final C89342g mo143718a(int i) {
            Matcher matcher = this.f203014a.f203009a;
            C89269g a = C89271h.m154766a(matcher.start(i), matcher.end(i));
            if (Integer.valueOf(a.f202927a).intValue() < 0) {
                return null;
            }
            String group = this.f203014a.f203009a.group(i);
            C89219l.m154716b(group, "");
            return new C89342g(group, a);
        }
    }

    @Override // p4600h.p4622m.AbstractC89345j
    /* renamed from: a */
    public final C89269g mo143719a() {
        Matcher matcher = this.f203009a;
        return C89271h.m154766a(matcher.start(), matcher.end());
    }

    @Override // p4600h.p4622m.AbstractC89345j
    /* renamed from: b */
    public final String mo143720b() {
        String group = this.f203009a.group();
        C89219l.m154716b(group, "");
        return group;
    }

    @Override // p4600h.p4622m.AbstractC89345j
    /* renamed from: d */
    public final List<String> mo143722d() {
        if (this.f203011c == null) {
            this.f203011c = new C89347a(this);
        }
        List<String> list = this.f203011c;
        if (list == null) {
            C89219l.m154715b();
        }
        return list;
    }

    @Override // p4600h.p4622m.AbstractC89345j
    /* renamed from: e */
    public final AbstractC89345j mo143723e() {
        int i;
        int end = this.f203009a.end();
        if (this.f203009a.end() == this.f203009a.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f203012d.length()) {
            return null;
        }
        Matcher matcher = this.f203009a.pattern().matcher(this.f203012d);
        C89219l.m154716b(matcher, "");
        return C89357m.m154850a(matcher, i2, this.f203012d);
    }

    public C89346k(Matcher matcher, CharSequence charSequence) {
        C89219l.m154721d(matcher, "");
        C89219l.m154721d(charSequence, "");
        this.f203009a = matcher;
        this.f203012d = charSequence;
    }
}
