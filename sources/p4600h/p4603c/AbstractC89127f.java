package p4600h.p4603c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.f */
public interface AbstractC89127f {

    /* renamed from: h.c.f$c */
    public interface AbstractC89132c<E extends AbstractC89130b> {
        static {
            Covode.recordClassIndex(105216);
        }
    }

    static {
        Covode.recordClassIndex(105211);
    }

    <R> R fold(R r, AbstractC89183m<? super R, ? super AbstractC89130b, ? extends R> mVar);

    <E extends AbstractC89130b> E get(AbstractC89132c<E> cVar);

    AbstractC89127f minusKey(AbstractC89132c<?> cVar);

    AbstractC89127f plus(AbstractC89127f fVar);

    /* renamed from: h.c.f$b */
    public interface AbstractC89130b extends AbstractC89127f {
        static {
            Covode.recordClassIndex(105214);
        }

        @Override // p4600h.p4603c.AbstractC89127f
        <E extends AbstractC89130b> E get(AbstractC89132c<E> cVar);

        AbstractC89132c<?> getKey();

        /* renamed from: h.c.f$b$a */
        public static final class C89131a {
            static {
                Covode.recordClassIndex(105215);
            }

            /* renamed from: a */
            public static AbstractC89127f m154623a(AbstractC89130b bVar, AbstractC89127f fVar) {
                C89219l.m154721d(fVar, "");
                return C89128a.m154621a(bVar, fVar);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.c.f$b */
            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public static <E extends AbstractC89130b> E m154622a(AbstractC89130b bVar, AbstractC89132c<E> cVar) {
                C89219l.m154721d(cVar, "");
                if (C89219l.m154714a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            /* renamed from: b */
            public static AbstractC89127f m154625b(AbstractC89130b bVar, AbstractC89132c<?> cVar) {
                C89219l.m154721d(cVar, "");
                if (C89219l.m154714a(bVar.getKey(), cVar)) {
                    return C89133g.INSTANCE;
                }
                return bVar;
            }

            /* renamed from: a */
            public static <R> R m154624a(AbstractC89130b bVar, R r, AbstractC89183m<? super R, ? super AbstractC89130b, ? extends R> mVar) {
                C89219l.m154721d(mVar, "");
                return (R) mVar.invoke(r, bVar);
            }
        }
    }

    /* renamed from: h.c.f$a */
    public static final class C89128a {
        static {
            Covode.recordClassIndex(105212);
        }

        /* renamed from: a */
        public static AbstractC89127f m154621a(AbstractC89127f fVar, AbstractC89127f fVar2) {
            C89219l.m154721d(fVar2, "");
            if (fVar2 == C89133g.INSTANCE) {
                return fVar;
            }
            return (AbstractC89127f) fVar2.fold(fVar, C89129a.f202842a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h.c.f$a$a */
        public static final class C89129a extends AbstractC89220m implements AbstractC89183m<AbstractC89127f, AbstractC89130b, AbstractC89127f> {

            /* renamed from: a */
            public static final C89129a f202842a = new C89129a();

            static {
                Covode.recordClassIndex(105213);
            }

            C89129a() {
                super(2);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ AbstractC89127f invoke(AbstractC89127f fVar, AbstractC89130b bVar) {
                AbstractC89127f fVar2 = fVar;
                AbstractC89130b bVar2 = bVar;
                C89219l.m154721d(fVar2, "");
                C89219l.m154721d(bVar2, "");
                AbstractC89127f minusKey = fVar2.minusKey(bVar2.getKey());
                if (minusKey == C89133g.INSTANCE) {
                    return bVar2;
                }
                AbstractC89125e eVar = (AbstractC89125e) minusKey.get(AbstractC89125e.f202840b);
                if (eVar == null) {
                    return new C89119c(minusKey, bVar2);
                }
                AbstractC89127f minusKey2 = minusKey.minusKey(AbstractC89125e.f202840b);
                if (minusKey2 == C89133g.INSTANCE) {
                    return new C89119c(bVar2, eVar);
                }
                return new C89119c(new C89119c(minusKey2, bVar2), eVar);
            }
        }
    }
}
