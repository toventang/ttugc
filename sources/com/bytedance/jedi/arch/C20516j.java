package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.internal.C20485c;
import com.bytedance.jedi.arch.internal.ExecutorC20490e;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.j */
public final class C20516j {

    /* renamed from: a */
    static boolean f48589a;

    /* renamed from: b */
    static boolean f48590b;

    /* renamed from: c */
    static AbstractC89183m<? super JediViewModel<AbstractC20368af>, ? super AbstractC20368af, ? extends AbstractC20369ag<AbstractC20368af>> f48591c = C20519c.f48598a;

    /* renamed from: d */
    public static final AbstractC89171a<Executor> f48592d = C20518b.f48597a;

    /* renamed from: e */
    static AbstractC89171a<? extends AbstractC88398aa> f48593e = C20520d.f48599a;

    /* renamed from: f */
    public static AbstractC89171a<? extends Executor> f48594f = C20517a.f48596a;

    /* renamed from: g */
    public static final C20516j f48595g = new C20516j();

    private C20516j() {
    }

    /* renamed from: com.bytedance.jedi.arch.j$b */
    static final class C20518b extends AbstractC89220m implements AbstractC89171a<ExecutorC20490e> {

        /* renamed from: a */
        public static final C20518b f48597a = new C20518b();

        static {
            Covode.recordClassIndex(24041);
        }

        C20518b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorC20490e invoke() {
            return new ExecutorC20490e();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.j$a */
    static final class C20517a extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C20517a f48596a = new C20517a();

        static {
            Covode.recordClassIndex(24040);
        }

        C20517a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            Object value = ExecutorC20490e.f48488b.getValue();
            C89219l.m154709a(value, "");
            return value;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.j$d */
    static final class C20520d extends AbstractC89220m implements AbstractC89171a<AbstractC88398aa> {

        /* renamed from: a */
        public static final C20520d f48599a = new C20520d();

        static {
            Covode.recordClassIndex(24043);
        }

        C20520d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC88398aa invoke() {
            AbstractC88398aa a = C88946a.m154209a(C20516j.f48592d.invoke());
            C89219l.m154709a((Object) a, "");
            return a;
        }
    }

    static {
        Covode.recordClassIndex(24039);
    }

    /* renamed from: com.bytedance.jedi.arch.j$c */
    static final class C20519c extends AbstractC89220m implements AbstractC89183m<JediViewModel<AbstractC20368af>, AbstractC20368af, C20485c<AbstractC20368af>> {

        /* renamed from: a */
        public static final C20519c f48598a = new C20519c();

        static {
            Covode.recordClassIndex(24042);
        }

        C20519c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C20485c<AbstractC20368af> invoke(JediViewModel<AbstractC20368af> jediViewModel, AbstractC20368af afVar) {
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(afVar, "");
            return new C20485c(afVar, (AbstractC88398aa) C20516j.f48593e.invoke());
        }
    }
}
