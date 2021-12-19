package p4600h.p4603c;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: h.c.c */
public final class C89119c implements AbstractC89127f, Serializable {

    /* renamed from: a */
    private final AbstractC89127f f202833a;

    /* renamed from: b */
    private final AbstractC89127f.AbstractC89130b f202834b;

    /* renamed from: h.c.c$a */
    static final class C89120a implements Serializable {

        /* renamed from: a */
        public static final C89121a f202835a = new C89121a((byte) 0);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final AbstractC89127f[] f202836b;

        static {
            Covode.recordClassIndex(105204);
        }

        /* renamed from: h.c.c$a$a */
        public static final class C89121a {
            static {
                Covode.recordClassIndex(105205);
            }

            private C89121a() {
            }

            public /* synthetic */ C89121a(byte b) {
                this();
            }
        }

        private final Object readResolve() {
            AbstractC89127f[] fVarArr = this.f202836b;
            AbstractC89127f fVar = C89133g.INSTANCE;
            for (AbstractC89127f fVar2 : fVarArr) {
                fVar = fVar.plus(fVar2);
            }
            return fVar;
        }

        public C89120a(AbstractC89127f[] fVarArr) {
            C89219l.m154721d(fVarArr, "");
            this.f202836b = fVarArr;
        }
    }

    static {
        Covode.recordClassIndex(105203);
    }

    public final int hashCode() {
        return this.f202833a.hashCode() + this.f202834b.hashCode();
    }

    /* renamed from: a */
    private final int m154619a() {
        C89119c cVar = this;
        int i = 2;
        while (true) {
            AbstractC89127f fVar = cVar.f202833a;
            if (!(fVar instanceof C89119c)) {
                fVar = null;
            }
            cVar = (C89119c) fVar;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public final String toString() {
        return "[" + ((String) fold("", C89122b.f202837a)) + "]";
    }

    private final Object writeReplace() {
        int a = m154619a();
        AbstractC89127f[] fVarArr = new AbstractC89127f[a];
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = 0;
        fold(C89391z.f203057a, new C89123c(fVarArr, cVar));
        if (cVar.element == a) {
            return new C89120a(fVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    private final boolean m154620a(AbstractC89127f.AbstractC89130b bVar) {
        return C89219l.m154714a(get(bVar.getKey()), bVar);
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public final AbstractC89127f plus(AbstractC89127f fVar) {
        C89219l.m154721d(fVar, "");
        return AbstractC89127f.C89128a.m154621a(this, fVar);
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public final <E extends AbstractC89127f.AbstractC89130b> E get(AbstractC89127f.AbstractC89132c<E> cVar) {
        C89219l.m154721d(cVar, "");
        C89119c cVar2 = this;
        while (true) {
            E e = (E) cVar2.f202834b.get(cVar);
            if (e != null) {
                return e;
            }
            AbstractC89127f fVar = cVar2.f202833a;
            if (!(fVar instanceof C89119c)) {
                return (E) fVar.get(cVar);
            }
            cVar2 = (C89119c) fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C89119c) {
            C89119c cVar = (C89119c) obj;
            if (cVar.m154619a() == m154619a()) {
                C89119c cVar2 = this;
                while (true) {
                    if (!cVar.m154620a(cVar2.f202834b)) {
                        break;
                    }
                    AbstractC89127f fVar = cVar2.f202833a;
                    if (fVar instanceof C89119c) {
                        cVar2 = (C89119c) fVar;
                    } else {
                        Objects.requireNonNull(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        if (cVar.m154620a((AbstractC89127f.AbstractC89130b) fVar)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public final AbstractC89127f minusKey(AbstractC89127f.AbstractC89132c<?> cVar) {
        C89219l.m154721d(cVar, "");
        if (this.f202834b.get(cVar) != null) {
            return this.f202833a;
        }
        AbstractC89127f minusKey = this.f202833a.minusKey(cVar);
        if (minusKey == this.f202833a) {
            return this;
        }
        if (minusKey == C89133g.INSTANCE) {
            return this.f202834b;
        }
        return new C89119c(minusKey, this.f202834b);
    }

    public C89119c(AbstractC89127f fVar, AbstractC89127f.AbstractC89130b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f202833a = fVar;
        this.f202834b = bVar;
    }

    /* renamed from: h.c.c$c */
    static final class C89123c extends AbstractC89220m implements AbstractC89183m<C89391z, AbstractC89127f.AbstractC89130b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89127f[] f202838a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f202839b;

        static {
            Covode.recordClassIndex(105207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89123c(AbstractC89127f[] fVarArr, C89233z.C89236c cVar) {
            super(2);
            this.f202838a = fVarArr;
            this.f202839b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C89391z zVar, AbstractC89127f.AbstractC89130b bVar) {
            AbstractC89127f.AbstractC89130b bVar2 = bVar;
            C89219l.m154721d(zVar, "");
            C89219l.m154721d(bVar2, "");
            AbstractC89127f[] fVarArr = this.f202838a;
            C89233z.C89236c cVar = this.f202839b;
            int i = cVar.element;
            cVar.element = i + 1;
            fVarArr[i] = bVar2;
            return C89391z.f203057a;
        }
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public final <R> R fold(R r, AbstractC89183m<? super R, ? super AbstractC89127f.AbstractC89130b, ? extends R> mVar) {
        C89219l.m154721d(mVar, "");
        return (R) mVar.invoke((Object) this.f202833a.fold(r, mVar), this.f202834b);
    }

    /* renamed from: h.c.c$b */
    static final class C89122b extends AbstractC89220m implements AbstractC89183m<String, AbstractC89127f.AbstractC89130b, String> {

        /* renamed from: a */
        public static final C89122b f202837a = new C89122b();

        static {
            Covode.recordClassIndex(105206);
        }

        C89122b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ String invoke(String str, AbstractC89127f.AbstractC89130b bVar) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(bVar, "");
            if (str2.length() == 0) {
                return bVar.toString();
            }
            return str2 + ", " + bVar;
        }
    }
}
