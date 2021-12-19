package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89037ac;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.l.p */
public class C89319p extends C89318o {
    static {
        Covode.recordClassIndex(105403);
    }

    /* renamed from: h.l.p$a */
    public static final class C89320a implements AbstractC89196a, Iterable<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89306h f202970a;

        static {
            Covode.recordClassIndex(105404);
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return this.f202970a.mo2926a();
        }

        public C89320a(AbstractC89306h hVar) {
            this.f202970a = hVar;
        }
    }

    /* renamed from: h.l.p$g */
    public static final class C89326g implements AbstractC89306h<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89306h f202976a;

        /* renamed from: b */
        final /* synthetic */ Comparator f202977b;

        static {
            Covode.recordClassIndex(105410);
        }

        @Override // p4600h.p4621l.AbstractC89306h
        /* renamed from: a */
        public final Iterator<T> mo2926a() {
            List h = C89309k.m154814h(this.f202976a);
            C89070n.m154530a(h, this.f202977b);
            return h.iterator();
        }

        C89326g(AbstractC89306h<? extends T> hVar, Comparator comparator) {
            this.f202976a = hVar;
            this.f202977b = comparator;
        }
    }

    /* renamed from: h.l.p$c */
    public static final class C89322c extends AbstractC89220m implements AbstractC89172b<C89037ac<? extends T>, T> {

        /* renamed from: a */
        public static final C89322c f202972a = new C89322c();

        static {
            Covode.recordClassIndex(105406);
        }

        C89322c() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89037ac acVar = (C89037ac) obj;
            C89219l.m154721d(acVar, "");
            return acVar.f202767b;
        }
    }

    /* renamed from: h.l.p$d */
    static final class C89323d extends AbstractC89220m implements AbstractC89172b<T, Boolean> {

        /* renamed from: a */
        public static final C89323d f202973a = new C89323d();

        static {
            Covode.recordClassIndex(105407);
        }

        C89323d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Object obj) {
            boolean z;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: h.l.p$e */
    static final /* synthetic */ class C89324e extends C89217j implements AbstractC89172b<Iterable<? extends R>, Iterator<? extends R>> {

        /* renamed from: a */
        public static final C89324e f202974a = new C89324e();

        static {
            Covode.recordClassIndex(105408);
        }

        C89324e() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            Iterable iterable = (Iterable) obj;
            C89219l.m154721d(iterable, "");
            return iterable.iterator();
        }
    }

    /* renamed from: h.l.p$f */
    static final /* synthetic */ class C89325f extends C89217j implements AbstractC89172b<AbstractC89306h<? extends R>, Iterator<? extends R>> {

        /* renamed from: a */
        public static final C89325f f202975a = new C89325f();

        static {
            Covode.recordClassIndex(105409);
        }

        C89325f() {
            super(1, AbstractC89306h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            AbstractC89306h hVar = (AbstractC89306h) obj;
            C89219l.m154721d(hVar, "");
            return hVar.mo2926a();
        }
    }

    /* renamed from: e */
    public static final <T> AbstractC89306h<T> m154809e(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        return C89309k.m154804b(hVar, C89323d.f202973a);
    }

    /* renamed from: g */
    public static final <T> List<T> m154813g(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        return C89070n.m154521b(C89309k.m154814h(hVar));
    }

    /* renamed from: i */
    public static final <T> boolean m154815i(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        return hVar.mo2926a().hasNext();
    }

    /* renamed from: k */
    public static final <T> Iterable<T> m154817k(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        return new C89320a(hVar);
    }

    /* renamed from: h.l.p$b */
    public static final class C89321b extends AbstractC89220m implements AbstractC89172b<C89037ac<? extends T>, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f202971a;

        static {
            Covode.recordClassIndex(105405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89321b(AbstractC89183m mVar) {
            super(1);
            this.f202971a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Object obj) {
            C89037ac acVar = (C89037ac) obj;
            C89219l.m154721d(acVar, "");
            return Boolean.valueOf(((Boolean) this.f202971a.invoke(Integer.valueOf(acVar.f202766a), acVar.f202767b)).booleanValue());
        }
    }

    /* renamed from: c */
    public static final <T> T m154806c(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<? extends T> a = hVar.mo2926a();
        if (a.hasNext()) {
            return (T) a.next();
        }
        return null;
    }

    /* renamed from: d */
    public static final <T> T m154808d(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<? extends T> a = hVar.mo2926a();
        if (!a.hasNext()) {
            return null;
        }
        return (T) a.next();
    }

    /* renamed from: h */
    public static final <T> List<T> m154814h(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        return (List) C89309k.m154803a((AbstractC89306h) hVar, (Collection) new ArrayList());
    }

    /* renamed from: j */
    public static final <T> int m154816j(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<? extends T> a = hVar.mo2926a();
        int i = 0;
        while (a.hasNext()) {
            a.next();
            i++;
            if (i < 0) {
                C89070n.m154523b();
            }
        }
        return i;
    }

    /* renamed from: f */
    public static final <T> HashSet<T> m154812f(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        return (HashSet) C89309k.m154803a((AbstractC89306h) hVar, (Collection) new HashSet());
    }

    /* renamed from: a */
    public static final <T> AbstractC89306h<T> m154799a(AbstractC89306h<? extends T> hVar, AbstractC89172b<? super T, Boolean> bVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        return new C89298d(hVar, true, bVar);
    }

    /* renamed from: b */
    public static final <T> AbstractC89306h<T> m154804b(AbstractC89306h<? extends T> hVar, AbstractC89172b<? super T, Boolean> bVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        return new C89298d(hVar, false, bVar);
    }

    /* renamed from: c */
    public static final <T, R> AbstractC89306h<R> m154805c(AbstractC89306h<? extends T> hVar, AbstractC89172b<? super T, ? extends Iterable<? extends R>> bVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        return new C89300e(hVar, bVar, C89324e.f202974a);
    }

    /* renamed from: d */
    public static final <T, R> AbstractC89306h<R> m154807d(AbstractC89306h<? extends T> hVar, AbstractC89172b<? super T, ? extends AbstractC89306h<? extends R>> bVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        return new C89300e(hVar, bVar, C89325f.f202975a);
    }

    /* renamed from: a */
    public static final <T> AbstractC89306h<T> m154800a(AbstractC89306h<? extends T> hVar, AbstractC89306h<? extends T> hVar2) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(hVar2, "");
        return C89309k.m154793a(C89309k.m154796a(hVar, hVar2));
    }

    /* renamed from: e */
    public static final <T, R> AbstractC89306h<R> m154810e(AbstractC89306h<? extends T> hVar, AbstractC89172b<? super T, ? extends R> bVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        return new C89329r(hVar, bVar);
    }

    /* renamed from: f */
    public static final <T, R> AbstractC89306h<R> m154811f(AbstractC89306h<? extends T> hVar, AbstractC89172b<? super T, ? extends R> bVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        return C89309k.m154809e(new C89329r(hVar, bVar));
    }

    /* renamed from: a */
    public static final <T> AbstractC89306h<T> m154801a(AbstractC89306h<? extends T> hVar, T t) {
        C89219l.m154721d(hVar, "");
        return C89309k.m154793a(C89309k.m154796a(hVar, C89309k.m154796a(t)));
    }

    /* renamed from: a */
    public static final <T> AbstractC89306h<T> m154802a(AbstractC89306h<? extends T> hVar, Comparator<? super T> comparator) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(comparator, "");
        return new C89326g(hVar, comparator);
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m154803a(AbstractC89306h<? extends T> hVar, C c) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(c, "");
        Iterator<? extends T> a = hVar.mo2926a();
        while (a.hasNext()) {
            c.add(a.next());
        }
        return c;
    }
}
