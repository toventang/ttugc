package p4600h.p4603c.p4604a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.C89133g;
import p4600h.p4603c.p4605b.p4606a.AbstractC89107a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89116i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.a.c */
public class C89100c {
    static {
        Covode.recordClassIndex(105184);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> AbstractC89124d<T> m154605a(AbstractC89124d<? super T> dVar) {
        AbstractC89110d dVar2;
        AbstractC89124d<T> dVar3;
        C89219l.m154721d(dVar, "");
        if (!(dVar instanceof AbstractC89110d)) {
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        AbstractC89110d dVar4 = dVar2;
        return (dVar4 == null || (dVar3 = (AbstractC89124d<T>) dVar4.intercepted()) == null) ? dVar : dVar3;
    }

    /* renamed from: h.c.a.c$a */
    public static final class C89101a extends AbstractC89116i {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f202807a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f202808b;

        /* renamed from: c */
        private int f202809c;

        static {
            Covode.recordClassIndex(105185);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i = this.f202809c;
            if (i == 0) {
                this.f202809c = 1;
                C89382r.m154942a(obj);
                AbstractC89172b bVar = this.f202808b;
                Objects.requireNonNull(bVar, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((AbstractC89172b) C89206ad.m154679b(bVar, 1)).invoke(this);
            } else if (i == 1) {
                this.f202809c = 2;
                C89382r.m154942a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89101a(AbstractC89124d dVar, AbstractC89124d dVar2, AbstractC89172b bVar) {
            super(dVar2);
            this.f202807a = dVar;
            this.f202808b = bVar;
        }
    }

    /* renamed from: h.c.a.c$b */
    public static final class C89102b extends AbstractC89110d {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f202810a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89127f f202811b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f202812c;

        /* renamed from: d */
        private int f202813d;

        static {
            Covode.recordClassIndex(105186);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i = this.f202813d;
            if (i == 0) {
                this.f202813d = 1;
                C89382r.m154942a(obj);
                AbstractC89172b bVar = this.f202812c;
                Objects.requireNonNull(bVar, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((AbstractC89172b) C89206ad.m154679b(bVar, 1)).invoke(this);
            } else if (i == 1) {
                this.f202813d = 2;
                C89382r.m154942a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89102b(AbstractC89124d dVar, AbstractC89127f fVar, AbstractC89124d dVar2, AbstractC89127f fVar2, AbstractC89172b bVar) {
            super(dVar2, fVar2);
            this.f202810a = dVar;
            this.f202811b = fVar;
            this.f202812c = bVar;
        }
    }

    /* renamed from: h.c.a.c$c */
    public static final class C89103c extends AbstractC89116i {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f202814a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f202815b;

        /* renamed from: c */
        final /* synthetic */ Object f202816c;

        /* renamed from: d */
        private int f202817d;

        static {
            Covode.recordClassIndex(105187);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i = this.f202817d;
            if (i == 0) {
                this.f202817d = 1;
                C89382r.m154942a(obj);
                AbstractC89183m mVar = this.f202815b;
                Objects.requireNonNull(mVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((AbstractC89183m) C89206ad.m154679b(mVar, 2)).invoke(this.f202816c, this);
            } else if (i == 1) {
                this.f202817d = 2;
                C89382r.m154942a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89103c(AbstractC89124d dVar, AbstractC89124d dVar2, AbstractC89183m mVar, Object obj) {
            super(dVar2);
            this.f202814a = dVar;
            this.f202815b = mVar;
            this.f202816c = obj;
        }
    }

    /* renamed from: h.c.a.c$d */
    public static final class C89104d extends AbstractC89110d {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f202818a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89127f f202819b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f202820c;

        /* renamed from: d */
        final /* synthetic */ Object f202821d;

        /* renamed from: e */
        private int f202822e;

        static {
            Covode.recordClassIndex(105188);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i = this.f202822e;
            if (i == 0) {
                this.f202822e = 1;
                C89382r.m154942a(obj);
                AbstractC89183m mVar = this.f202820c;
                Objects.requireNonNull(mVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((AbstractC89183m) C89206ad.m154679b(mVar, 2)).invoke(this.f202821d, this);
            } else if (i == 1) {
                this.f202822e = 2;
                C89382r.m154942a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89104d(AbstractC89124d dVar, AbstractC89127f fVar, AbstractC89124d dVar2, AbstractC89127f fVar2, AbstractC89183m mVar, Object obj) {
            super(dVar2, fVar2);
            this.f202818a = dVar;
            this.f202819b = fVar;
            this.f202820c = mVar;
            this.f202821d = obj;
        }
    }

    /* renamed from: a */
    public static final <T> AbstractC89124d<C89391z> m154606a(AbstractC89172b<? super AbstractC89124d<? super T>, ? extends Object> bVar, AbstractC89124d<? super T> dVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
        if (bVar instanceof AbstractC89107a) {
            return ((AbstractC89107a) bVar).create(dVar);
        }
        AbstractC89127f context = dVar.getContext();
        if (context == C89133g.INSTANCE) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new C89101a(dVar, dVar, bVar);
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new C89102b(dVar, context, dVar, context, bVar);
    }

    /* renamed from: a */
    public static final <R, T> AbstractC89124d<C89391z> m154607a(AbstractC89183m<? super R, ? super AbstractC89124d<? super T>, ? extends Object> mVar, R r, AbstractC89124d<? super T> dVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
        if (mVar instanceof AbstractC89107a) {
            return ((AbstractC89107a) mVar).create(r, dVar);
        }
        AbstractC89127f context = dVar.getContext();
        if (context == C89133g.INSTANCE) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new C89103c(dVar, dVar, mVar, r);
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new C89104d(dVar, context, dVar, context, mVar, r);
    }
}
