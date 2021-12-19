package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.l.n */
public class C89313n extends C89312m {

    /* renamed from: h.l.n$c */
    static final class C89316c extends AbstractC89220m implements AbstractC89172b<T, T> {

        /* renamed from: a */
        public static final C89316c f202968a = new C89316c();

        static {
            Covode.recordClassIndex(105400);
        }

        C89316c() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final T invoke(T t) {
            return t;
        }
    }

    static {
        Covode.recordClassIndex(105397);
    }

    /* renamed from: h.l.n$a */
    public static final class C89314a implements AbstractC89306h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f202966a;

        static {
            Covode.recordClassIndex(105398);
        }

        @Override // p4600h.p4621l.AbstractC89306h
        /* renamed from: a */
        public final Iterator<T> mo2926a() {
            return this.f202966a;
        }

        public C89314a(Iterator it) {
            this.f202966a = it;
        }
    }

    /* renamed from: h.l.n$d */
    static final class C89317d extends AbstractC89220m implements AbstractC89171a<T> {

        /* renamed from: a */
        final /* synthetic */ Object f202969a;

        static {
            Covode.recordClassIndex(105401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89317d(Object obj) {
            super(0);
            this.f202969a = obj;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final T invoke() {
            return (T) this.f202969a;
        }
    }

    /* renamed from: h.l.n$b */
    static final class C89315b extends AbstractC89220m implements AbstractC89172b<AbstractC89306h<? extends T>, Iterator<? extends T>> {

        /* renamed from: a */
        public static final C89315b f202967a = new C89315b();

        static {
            Covode.recordClassIndex(105399);
        }

        C89315b() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            AbstractC89306h hVar = (AbstractC89306h) obj;
            C89219l.m154721d(hVar, "");
            return hVar.mo2926a();
        }
    }

    /* renamed from: a */
    public static final <T> AbstractC89306h<T> m154795a(Iterator<? extends T> it) {
        C89219l.m154721d(it, "");
        return C89309k.m154797b(new C89314a(it));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.l.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> AbstractC89306h<T> m154797b(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        if (hVar instanceof C89295a) {
            return hVar;
        }
        return new C89295a(hVar);
    }

    /* renamed from: a */
    public static final <T> AbstractC89306h<T> m154793a(AbstractC89306h<? extends AbstractC89306h<? extends T>> hVar) {
        C89219l.m154721d(hVar, "");
        C89315b bVar = C89315b.f202967a;
        if (!(hVar instanceof C89329r)) {
            return new C89300e(hVar, C89316c.f202968a, bVar);
        }
        C89329r rVar = (C89329r) hVar;
        C89219l.m154721d(bVar, "");
        return new C89300e(rVar.f202983a, rVar.f202984b, bVar);
    }

    /* renamed from: a */
    public static final <T> AbstractC89306h<T> m154796a(T... tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length == 0) {
            return C89297c.f202938a;
        }
        return C89064i.m154514o(tArr);
    }

    /* renamed from: a */
    public static final <T> AbstractC89306h<T> m154794a(T t, AbstractC89172b<? super T, ? extends T> bVar) {
        C89219l.m154721d(bVar, "");
        if (t == null) {
            return C89297c.f202938a;
        }
        return new C89302f(new C89317d(t), bVar);
    }
}
