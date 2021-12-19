package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89078u;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89117j;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.AbstractC89308j;
import p4600h.p4621l.C89302f;
import p4600h.p4621l.C89309k;
import p4600h.p4622m.C89357m;

/* renamed from: h.m.l */
public final class C89350l implements Serializable {
    public static final C89351a Companion = new C89351a((byte) 0);

    /* renamed from: a */
    private Set<? extends EnumC89359n> f203016a;
    public final Pattern nativePattern;

    /* renamed from: h.m.l$b */
    static final class C89352b implements Serializable {

        /* renamed from: a */
        public static final C89353a f203017a = new C89353a((byte) 0);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final String f203018b;

        /* renamed from: c */
        private final int f203019c;

        static {
            Covode.recordClassIndex(105436);
        }

        /* renamed from: h.m.l$b$a */
        public static final class C89353a {
            static {
                Covode.recordClassIndex(105437);
            }

            private C89353a() {
            }

            public /* synthetic */ C89353a(byte b) {
                this();
            }
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f203018b, this.f203019c);
            C89219l.m154716b(compile, "");
            return new C89350l(compile);
        }

        public C89352b(String str, int i) {
            C89219l.m154721d(str, "");
            this.f203018b = str;
            this.f203019c = i;
        }
    }

    static {
        Covode.recordClassIndex(105434);
    }

    /* renamed from: h.m.l$a */
    public static final class C89351a {
        static {
            Covode.recordClassIndex(105435);
        }

        /* renamed from: a */
        public static int m154848a(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        private C89351a() {
        }

        public /* synthetic */ C89351a(byte b) {
            this();
        }
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h.m.l$c */
    public static final class C89354c extends AbstractC89220m implements AbstractC89171a<AbstractC89345j> {

        /* renamed from: a */
        final /* synthetic */ C89350l f203020a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f203021b;

        /* renamed from: c */
        final /* synthetic */ int f203022c;

        static {
            Covode.recordClassIndex(105438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89354c(C89350l lVar, CharSequence charSequence, int i) {
            super(0);
            this.f203020a = lVar;
            this.f203021b = charSequence;
            this.f203022c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89345j invoke() {
            return this.f203020a.find(this.f203021b, this.f203022c);
        }
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        C89219l.m154716b(pattern, "");
        return pattern;
    }

    public final String toString() {
        String pattern = this.nativePattern.toString();
        C89219l.m154716b(pattern, "");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        C89219l.m154716b(pattern, "");
        return new C89352b(pattern, this.nativePattern.flags());
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Set<? extends h.m.n>, java.util.Set<h.m.n> */
    public final Set<EnumC89359n> getOptions() {
        Set set = this.f203016a;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet allOf = EnumSet.allOf(EnumC89359n.class);
        C89357m.C89358a aVar = new C89357m.C89358a(flags);
        C89219l.m154721d(allOf, "");
        C89219l.m154721d(aVar, "");
        C89078u.m154533a(allOf, aVar, false);
        Set<EnumC89359n> unmodifiableSet = Collections.unmodifiableSet(allOf);
        C89219l.m154716b(unmodifiableSet, "");
        this.f203016a = unmodifiableSet;
        return unmodifiableSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h.m.l$d */
    public static final /* synthetic */ class C89355d extends C89217j implements AbstractC89172b<AbstractC89345j, AbstractC89345j> {

        /* renamed from: a */
        public static final C89355d f203023a = new C89355d();

        static {
            Covode.recordClassIndex(105439);
        }

        C89355d() {
            super(1, AbstractC89345j.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC89345j invoke(AbstractC89345j jVar) {
            AbstractC89345j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            return jVar2.mo143723e();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89350l(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r3)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4622m.C89350l.<init>(java.lang.String):void");
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        return this.nativePattern.matcher(charSequence).find();
    }

    public final boolean matches(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final AbstractC89345j matchEntire(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C89219l.m154716b(matcher, "");
        if (!matcher.matches()) {
            return null;
        }
        return new C89346k(matcher, charSequence);
    }

    public C89350l(Pattern pattern) {
        C89219l.m154721d(pattern, "");
        this.nativePattern = pattern;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h.m.l$e */
    public static final class C89356e extends AbstractC89117j implements AbstractC89183m<AbstractC89308j<? super String>, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f203024a;

        /* renamed from: b */
        int f203025b;

        /* renamed from: c */
        int f203026c;

        /* renamed from: d */
        final /* synthetic */ C89350l f203027d;

        /* renamed from: e */
        final /* synthetic */ CharSequence f203028e;

        /* renamed from: f */
        final /* synthetic */ int f203029f;

        /* renamed from: g */
        private /* synthetic */ Object f203030g;

        static {
            Covode.recordClassIndex(105440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89356e(C89350l lVar, CharSequence charSequence, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f203027d = lVar;
            this.f203028e = charSequence;
            this.f203029f = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C89356e eVar = new C89356e(this.f203027d, this.f203028e, this.f203029f, dVar);
            eVar.f203030g = obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89308j<? super String> jVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C89356e) create(jVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 168
            */
            throw new UnsupportedOperationException("Method not decompiled: p4600h.p4622m.C89350l.C89356e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89350l(java.lang.String r3, p4600h.p4622m.EnumC89359n r4) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r1)
            int r0 = r4.getValue()
            int r0 = p4600h.p4622m.C89350l.C89351a.m154848a(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r3, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4622m.C89350l.<init>(java.lang.String, h.m.n):void");
    }

    public final AbstractC89345j find(CharSequence charSequence, int i) {
        C89219l.m154721d(charSequence, "");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C89219l.m154716b(matcher, "");
        return C89357m.m154850a(matcher, i, charSequence);
    }

    public final String replace(CharSequence charSequence, String str) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(str, "");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        C89219l.m154716b(replaceAll, "");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(str, "");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        C89219l.m154716b(replaceFirst, "");
        return replaceFirst;
    }

    public final AbstractC89306h<String> splitToSequence(CharSequence charSequence, int i) {
        C89219l.m154721d(charSequence, "");
        C89361p.m154905a(i);
        return C89309k.m154791a(new C89356e(this, charSequence, i, null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89350l(java.lang.String r3, java.util.Set<? extends p4600h.p4622m.EnumC89359n> r4) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r1)
            int r0 = p4600h.p4622m.C89357m.m154849a(r4)
            int r0 = p4600h.p4622m.C89350l.C89351a.m154848a(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r3, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4622m.C89350l.<init>(java.lang.String, java.util.Set):void");
    }

    public final AbstractC89345j matchAt(CharSequence charSequence, int i) {
        C89219l.m154721d(charSequence, "");
        Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!region.lookingAt()) {
            return null;
        }
        C89219l.m154716b(region, "");
        return new C89346k(region, charSequence);
    }

    public final boolean matchesAt(CharSequence charSequence, int i) {
        C89219l.m154721d(charSequence, "");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    public final AbstractC89306h<AbstractC89345j> findAll(CharSequence charSequence, int i) {
        C89219l.m154721d(charSequence, "");
        if (i < 0 || i > charSequence.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
        }
        C89354c cVar = new C89354c(this, charSequence, i);
        C89355d dVar = C89355d.f203023a;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(dVar, "");
        return new C89302f(cVar, dVar);
    }

    public final String replace(CharSequence charSequence, AbstractC89172b<? super AbstractC89345j, ? extends CharSequence> bVar) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(bVar, "");
        int i = 0;
        AbstractC89345j find$default = find$default(this, charSequence, 0, 2, null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, Integer.valueOf(find$default.mo143719a().f202927a).intValue());
            sb.append((CharSequence) bVar.invoke(find$default));
            i = Integer.valueOf(find$default.mo143719a().f202928b).intValue() + 1;
            find$default = find$default.mo143723e();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    public final List<String> split(CharSequence charSequence, int i) {
        C89219l.m154721d(charSequence, "");
        C89361p.m154905a(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C89070n.m154516a(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = C89271h.m154772c(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if (i4 >= 0 && arrayList.size() == i4) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ AbstractC89345j find$default(C89350l lVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lVar.find(charSequence, i);
    }

    public static /* synthetic */ AbstractC89306h findAll$default(C89350l lVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lVar.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(C89350l lVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lVar.split(charSequence, i);
    }

    public static /* synthetic */ AbstractC89306h splitToSequence$default(C89350l lVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lVar.splitToSequence(charSequence, i);
    }
}
