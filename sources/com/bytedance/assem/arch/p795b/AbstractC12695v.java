package com.bytedance.assem.arch.p795b;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.core.EnumC12762l;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.b.v */
public abstract class AbstractC12695v<RECEIVER extends AbstractC22876d> extends AbstractC12693u<RECEIVER> {

    /* renamed from: o */
    public int f30905o;

    /* renamed from: p */
    public int f30906p;

    /* renamed from: q */
    public EnumC12762l f30907q = EnumC12762l.SYNC;

    /* renamed from: r */
    private final AbstractC89244h f30908r = C89250i.m154774a(EnumC89331m.NONE, C12696a.f30909a);

    static {
        Covode.recordClassIndex(14515);
    }

    /* renamed from: B */
    public final Handler mo20535B() {
        return (Handler) this.f30908r.getValue();
    }

    /* renamed from: com.bytedance.assem.arch.b.v$b */
    static final class RunnableC12697b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f30910a;

        static {
            Covode.recordClassIndex(14517);
        }

        RunnableC12697b(AbstractC89171a aVar) {
            this.f30910a = aVar;
        }

        public final void run() {
            this.f30910a.invoke();
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.v$a */
    static final class C12696a extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C12696a f30909a = new C12696a();

        static {
            Covode.recordClassIndex(14516);
        }

        C12696a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.v$c */
    static final class C12698c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12695v f30911a;

        static {
            Covode.recordClassIndex(14518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12698c(AbstractC12695v vVar) {
            super(0);
            this.f30911a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC12695v vVar = this.f30911a;
            vVar.mo20514b(vVar.mo20528t());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.v$i */
    public static final class RunnableC12709i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC12695v f30922a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f30923b;

        static {
            Covode.recordClassIndex(14529);
        }

        RunnableC12709i(AbstractC12695v vVar, AbstractC89171a aVar) {
            this.f30922a = vVar;
            this.f30923b = aVar;
        }

        public final void run() {
            C12690t.m22849a(this.f30922a, new AbstractC89171a<C89391z>(this) {
                /* class com.bytedance.assem.arch.p795b.AbstractC12695v.RunnableC12709i.C127101 */

                /* renamed from: a */
                final /* synthetic */ RunnableC12709i f30924a;

                static {
                    Covode.recordClassIndex(14530);
                }

                {
                    this.f30924a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ C89391z invoke() {
                    this.f30924a.f30923b.invoke();
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: A */
    public final void mo20506A() {
        if (mo20532x()) {
            mo20528t().setVisibility(8);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    public final void bU_() {
        m22875b(new C12705g(this));
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        m22875b(new C12703f(this));
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: l */
    public final void mo20537l() {
        m22875b(new C12701e(this));
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: n */
    public final void mo20526n() {
        m22875b(new C12707h(this));
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        m22875b(new C12699d(this));
    }

    /* renamed from: com.bytedance.assem.arch.b.v$d */
    static final class C12699d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12695v f30912a;

        static {
            Covode.recordClassIndex(14519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12699d(AbstractC12695v vVar) {
            super(0);
            this.f30912a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12695v.super.mo20527p();
            } else {
                this.f30912a.mo20535B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12695v.C12699d.RunnableC127001 */

                    /* renamed from: a */
                    final /* synthetic */ C12699d f30913a;

                    static {
                        Covode.recordClassIndex(14520);
                    }

                    {
                        this.f30913a = r1;
                    }

                    public final void run() {
                        C12699d.super.mo20527p();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.v$e */
    static final class C12701e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12695v f30914a;

        static {
            Covode.recordClassIndex(14521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12701e(AbstractC12695v vVar) {
            super(0);
            this.f30914a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12695v.super.mo20537l();
            } else {
                this.f30914a.mo20535B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12695v.C12701e.RunnableC127021 */

                    /* renamed from: a */
                    final /* synthetic */ C12701e f30915a;

                    static {
                        Covode.recordClassIndex(14522);
                    }

                    {
                        this.f30915a = r1;
                    }

                    public final void run() {
                        C12701e.super.mo20537l();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.v$f */
    static final class C12703f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12695v f30916a;

        static {
            Covode.recordClassIndex(14523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12703f(AbstractC12695v vVar) {
            super(0);
            this.f30916a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12695v.super.mo20525j();
            } else {
                this.f30916a.mo20535B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12695v.C12703f.RunnableC127041 */

                    /* renamed from: a */
                    final /* synthetic */ C12703f f30917a;

                    static {
                        Covode.recordClassIndex(14524);
                    }

                    {
                        this.f30917a = r1;
                    }

                    public final void run() {
                        C12703f.super.mo20525j();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.v$g */
    static final class C12705g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12695v f30918a;

        static {
            Covode.recordClassIndex(14525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12705g(AbstractC12695v vVar) {
            super(0);
            this.f30918a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12695v.super.bU_();
            } else {
                this.f30918a.mo20535B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12695v.C12705g.RunnableC127061 */

                    /* renamed from: a */
                    final /* synthetic */ C12705g f30919a;

                    static {
                        Covode.recordClassIndex(14526);
                    }

                    {
                        this.f30919a = r1;
                    }

                    public final void run() {
                        C12705g.super.bU_();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.v$h */
    static final class C12707h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12695v f30920a;

        static {
            Covode.recordClassIndex(14527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12707h(AbstractC12695v vVar) {
            super(0);
            this.f30920a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12695v.super.mo20526n();
            } else {
                this.f30920a.mo20535B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12695v.C12707h.RunnableC127081 */

                    /* renamed from: a */
                    final /* synthetic */ C12707h f30921a;

                    static {
                        Covode.recordClassIndex(14528);
                    }

                    {
                        this.f30921a = r1;
                    }

                    public final void run() {
                        C12707h.super.mo20526n();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: w */
    public final void mo20531w() {
        View view;
        if (mo20532x()) {
            C12698c cVar = new C12698c(this);
            if (C12787j.f31109c) {
                C12787j.m23009a().execute(new RunnableC12697b(cVar));
            } else {
                mo20514b(mo20528t());
            }
        } else if (this.f30905o != 0 && (view = bD_().f30981c) != null) {
            View findViewById = view.findViewById(this.f30905o);
            if (findViewById == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (findViewById instanceof ViewStub) {
                int i = this.f30906p;
                if (i != 0) {
                    ((ViewStub) findViewById).setLayoutResource(i);
                }
                View inflate = ((ViewStub) findViewById).inflate();
                C89219l.m154709a((Object) inflate, "");
                mo20507a(inflate);
                mo20514b(mo20528t());
            } else {
                mo20507a(findViewById);
                mo20514b(findViewById);
            }
        }
    }

    /* renamed from: b */
    private final void m22875b(AbstractC89171a<C89391z> aVar) {
        if (C12787j.f31109c) {
            C12787j.m23009a().execute(new RunnableC12709i(this, aVar));
        } else {
            aVar.invoke();
        }
    }
}
