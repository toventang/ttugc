package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.google.p1998c.p2006h.p2007a.C27659u;
import com.google.p1998c.p2006h.p2007a.C27671y;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89699w;
import kotlinx.coroutines.C89536ay;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.C89702y;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.s */
public final class C55227s {
    static {
        Covode.recordClassIndex(64974);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.s$a */
    public static final class C55228a implements AbstractC27645k<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89699w f126312a;

        static {
            Covode.recordClassIndex(64975);
        }

        C55228a(AbstractC89699w wVar) {
            this.f126312a = wVar;
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onSuccess(T t) {
            this.f126312a.mo144262a((Object) t);
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C89219l.m154721d(th, "");
            this.f126312a.mo144263a(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.s$c */
    public static final class C55230c extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractFutureC27655q f126317a;

        static {
            Covode.recordClassIndex(64977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55230c(AbstractFutureC27655q qVar) {
            super(1);
            this.f126317a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            this.f126317a.cancel(false);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.s$b */
    public static final class C55229b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126313a;

        /* renamed from: b */
        final /* synthetic */ AbstractFutureC27655q f126314b;

        /* renamed from: c */
        final /* synthetic */ long f126315c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89699w f126316d;

        static {
            Covode.recordClassIndex(64976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55229b(AbstractFutureC27655q qVar, long j, AbstractC89699w wVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126314b = qVar;
            this.f126315c = j;
            this.f126316d = wVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55229b(this.f126314b, this.f126315c, this.f126316d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55229b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f126313a;
            if (i == 0) {
                C89382r.m154942a(obj);
                long j = this.f126315c;
                this.f126313a = 1;
                if (C89536ay.m155464a(j, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.f126316d.mo144007k()) {
                this.f126314b.cancel(true);
                this.f126316d.mo144263a((Throwable) new TimeoutException());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final <T> AbstractC89531av<T> m100993a(AbstractFutureC27655q<T> qVar) {
        C89219l.m154721d(qVar, "");
        if (qVar.isDone()) {
            try {
                return C89702y.m155737a(C27671y.m55319a(qVar));
            } catch (ExecutionException e) {
                AbstractC89699w a = C89702y.m155736a();
                Throwable cause = e.getCause();
                if (cause == null) {
                    cause = e;
                }
                a.mo144263a(cause);
                return a;
            }
        } else {
            AbstractC89699w a2 = C89702y.m155736a();
            C27646l.m55298a(qVar, new C55228a(a2), C27659u.EnumC27662a.INSTANCE);
            AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C55229b(qVar, 3000, a2, null), 2);
            a2.mo143982a((AbstractC89172b<? super Throwable, C89391z>) new C55230c(qVar));
            return a2;
        }
    }
}
