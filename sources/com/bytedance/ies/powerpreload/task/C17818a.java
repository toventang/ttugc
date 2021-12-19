package com.bytedance.ies.powerpreload.task;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17807d;
import com.bytedance.ies.powerpreload.p1242a.C17778a;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17786a;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17787b;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17790e;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17791f;
import com.bytedance.ies.powerpreload.p1243b.C17792g;
import com.bytedance.ies.powerpreload.p1243b.C17793h;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.task.a */
public final class C17818a extends AbstractRunnableC17828f<AbstractC17787b> {

    /* renamed from: a */
    public C17792g<Object> f42516a = new C17792g<>(new C17793h());

    /* renamed from: b */
    private final AbstractC89244h f42517b = C89250i.m154773a((AbstractC89171a) C17822d.f42528a);

    static {
        Covode.recordClassIndex(20383);
    }

    @Override // com.bytedance.ies.powerpreload.task.AbstractRunnableC17828f
    /* renamed from: b */
    public final void mo28286b() {
        super.mo28286b();
        this.f42516a = null;
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.a$d */
    static final class C17822d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C17822d f42528a = new C17822d();

        static {
            Covode.recordClassIndex(20387);
        }

        C17822d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.a$a */
    static final class RunnableC17819a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17818a f42518a;

        /* renamed from: b */
        final /* synthetic */ AbstractC17791f f42519b;

        static {
            Covode.recordClassIndex(20384);
        }

        RunnableC17819a(C17818a aVar, AbstractC17791f fVar) {
            this.f42518a = aVar;
            this.f42519b = fVar;
        }

        public final void run() {
            try {
                if (this.f42518a.f42540h == null) {
                    new Bundle();
                }
                if (this.f42518a.f42516a == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } catch (Exception e) {
                C17778a.m32984a(e);
            }
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.a$b */
    static final class RunnableC17820b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17818a f42520a;

        /* renamed from: b */
        final /* synthetic */ AbstractC17790e f42521b;

        static {
            Covode.recordClassIndex(20385);
        }

        RunnableC17820b(C17818a aVar, AbstractC17790e eVar) {
            this.f42520a = aVar;
            this.f42521b = eVar;
        }

        public final void run() {
            try {
                if (this.f42520a.f42540h == null) {
                    new Bundle();
                }
                if (this.f42520a.f42516a == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } catch (Exception e) {
                C17778a.m32984a(e);
            }
        }
    }

    @Override // com.bytedance.ies.powerpreload.task.AbstractRunnableC17828f
    /* renamed from: a */
    public final Object mo28272a() {
        T t = this.f42538f;
        if (t instanceof AbstractC17791f) {
            ((Handler) this.f42517b.getValue()).post(new RunnableC17819a(this, (AbstractC17791f) this.f42538f));
        } else if (t instanceof AbstractC17790e) {
            C17778a.m32983a().f42454d.invoke().execute(new RunnableC17820b(this, (AbstractC17790e) this.f42538f));
        } else if (t instanceof AbstractC17786a) {
            try {
                AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C17821c(this, (AbstractC17786a) this.f42538f, null), 2);
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.a$c */
    static final class C17821c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f42522a;

        /* renamed from: b */
        Object f42523b;

        /* renamed from: c */
        int f42524c;

        /* renamed from: d */
        final /* synthetic */ C17818a f42525d;

        /* renamed from: e */
        final /* synthetic */ AbstractC17786a f42526e;

        /* renamed from: f */
        private AbstractC89516am f42527f;

        static {
            Covode.recordClassIndex(20386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17821c(C17818a aVar, AbstractC17786a aVar2, AbstractC89124d dVar) {
            super(2, dVar);
            this.f42525d = aVar;
            this.f42526e = aVar2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154719c(dVar, "");
            C17821c cVar = new C17821c(this.f42525d, this.f42526e, dVar);
            cVar.f42527f = (AbstractC89516am) obj;
            return cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17821c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            C17792g<Object> gVar;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f42524c;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89516am amVar = this.f42527f;
                gVar = this.f42525d.f42516a;
                if (gVar != null) {
                    AbstractC17786a aVar2 = this.f42526e;
                    if (this.f42525d.f42540h == null) {
                        new Bundle();
                    }
                    this.f42522a = amVar;
                    this.f42523b = gVar;
                    this.f42524c = 1;
                    obj = aVar2.mo28261a();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C89391z.f203057a;
            } else if (i == 1) {
                gVar = (C17792g) this.f42523b;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj != null) {
                gVar.f42468a.f42469a.postValue(obj);
                return C89391z.f203057a;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17818a(AbstractC17787b bVar, C17807d dVar, Bundle bundle) {
        super(bVar, dVar, bundle);
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(dVar, "");
    }
}
