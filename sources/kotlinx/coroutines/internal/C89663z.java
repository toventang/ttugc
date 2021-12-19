package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89600cv;
import p4600h.C89388w;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.internal.z */
public final class C89663z {

    /* renamed from: a */
    private static final C89659v f203411a = new C89659v("ZERO");

    /* renamed from: b */
    private static final AbstractC89183m<Object, AbstractC89127f.AbstractC89130b, Object> f203412b = C89664a.f203416a;

    /* renamed from: c */
    private static final AbstractC89183m<AbstractC89600cv<?>, AbstractC89127f.AbstractC89130b, AbstractC89600cv<?>> f203413c = C89665b.f203417a;

    /* renamed from: d */
    private static final AbstractC89183m<C89628ac, AbstractC89127f.AbstractC89130b, C89628ac> f203414d = C89667d.f203419a;

    /* renamed from: e */
    private static final AbstractC89183m<C89628ac, AbstractC89127f.AbstractC89130b, C89628ac> f203415e = C89666c.f203418a;

    static {
        Covode.recordClassIndex(105756);
    }

    /* renamed from: a */
    public static final Object m155641a(AbstractC89127f fVar) {
        Object fold = fVar.fold(0, f203412b);
        if (fold == null) {
            C89219l.m154707a();
        }
        return fold;
    }

    /* renamed from: kotlinx.coroutines.internal.z$b */
    static final class C89665b extends AbstractC89220m implements AbstractC89183m<AbstractC89600cv<?>, AbstractC89127f.AbstractC89130b, AbstractC89600cv<?>> {

        /* renamed from: a */
        public static final C89665b f203417a = new C89665b();

        static {
            Covode.recordClassIndex(105758);
        }

        C89665b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* bridge */ /* synthetic */ AbstractC89600cv<?> invoke(AbstractC89600cv<?> cvVar, AbstractC89127f.AbstractC89130b bVar) {
            AbstractC89127f.AbstractC89130b bVar2 = bVar;
            if (cvVar != null) {
                return cvVar;
            }
            if (!(bVar2 instanceof AbstractC89600cv)) {
                return null;
            }
            return bVar2;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.z$a */
    static final class C89664a extends AbstractC89220m implements AbstractC89183m<Object, AbstractC89127f.AbstractC89130b, Object> {

        /* renamed from: a */
        public static final C89664a f203416a = new C89664a();

        static {
            Covode.recordClassIndex(105757);
        }

        C89664a() {
            super(2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Object invoke(Object obj, AbstractC89127f.AbstractC89130b bVar) {
            int i;
            if (!(bVar instanceof AbstractC89600cv)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i = num.intValue();
                if (i == 0) {
                    return bVar;
                }
            } else {
                i = 1;
            }
            return Integer.valueOf(i + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.z$c */
    static final class C89666c extends AbstractC89220m implements AbstractC89183m<C89628ac, AbstractC89127f.AbstractC89130b, C89628ac> {

        /* renamed from: a */
        public static final C89666c f203418a = new C89666c();

        static {
            Covode.recordClassIndex(105759);
        }

        C89666c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89628ac invoke(C89628ac acVar, AbstractC89127f.AbstractC89130b bVar) {
            C89628ac acVar2 = acVar;
            AbstractC89127f.AbstractC89130b bVar2 = bVar;
            if (bVar2 instanceof AbstractC89600cv) {
                Object[] objArr = acVar2.f203362a;
                int i = acVar2.f203363b;
                acVar2.f203363b = i + 1;
                ((AbstractC89600cv) bVar2).mo144088a(objArr[i]);
            }
            return acVar2;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.z$d */
    static final class C89667d extends AbstractC89220m implements AbstractC89183m<C89628ac, AbstractC89127f.AbstractC89130b, C89628ac> {

        /* renamed from: a */
        public static final C89667d f203419a = new C89667d();

        static {
            Covode.recordClassIndex(105760);
        }

        C89667d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89628ac invoke(C89628ac acVar, AbstractC89127f.AbstractC89130b bVar) {
            C89628ac acVar2 = acVar;
            AbstractC89127f.AbstractC89130b bVar2 = bVar;
            if (bVar2 instanceof AbstractC89600cv) {
                Object a = ((AbstractC89600cv) bVar2).mo144087a(acVar2.f203364c);
                Object[] objArr = acVar2.f203362a;
                int i = acVar2.f203363b;
                acVar2.f203363b = i + 1;
                objArr[i] = a;
            }
            return acVar2;
        }
    }

    /* renamed from: a */
    public static final Object m155642a(AbstractC89127f fVar, Object obj) {
        if (obj == null) {
            obj = m155641a(fVar);
        }
        if (obj == 0) {
            return f203411a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new C89628ac(fVar, ((Number) obj).intValue()), f203414d);
        }
        if (obj != null) {
            return ((AbstractC89600cv) obj).mo144087a(fVar);
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: b */
    public static final void m155643b(AbstractC89127f fVar, Object obj) {
        if (obj != f203411a) {
            if (obj instanceof C89628ac) {
                ((C89628ac) obj).f203363b = 0;
                fVar.fold(obj, f203415e);
                return;
            }
            Object fold = fVar.fold(null, f203413c);
            if (fold != null) {
                ((AbstractC89600cv) fold).mo144088a(obj);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }
}
