package com.bytedance.assem.arch.p795b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.p022b.p023a.C0464a;
import com.C1764a;
import com.bytedance.assem.arch.core.EnumC12762l;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.p084a.p088b.C1862a;
import com.p084a.p088b.C1870c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.b.w */
public abstract class AbstractC12711w<RECEIVER extends AbstractC22876d> extends AbstractC12693u<RECEIVER> {

    /* renamed from: r */
    public static final AbstractC89244h f30925r = C89250i.m154774a(EnumC89331m.NONE, C12714c.f30933a);

    /* renamed from: s */
    public static final AbstractC89244h f30926s = C89250i.m154774a(EnumC89331m.NONE, C12713b.f30932a);

    /* renamed from: t */
    public static final C12712a f30927t = new C12712a((byte) 0);

    /* renamed from: o */
    public int f30928o;

    /* renamed from: p */
    public EnumC12762l f30929p = EnumC12762l.SYNC;

    /* renamed from: q */
    public View f30930q;

    /* renamed from: u */
    private final AbstractC89244h f30931u = C89250i.m154774a(EnumC89331m.NONE, C12715d.f30934a);

    /* renamed from: B */
    public final Handler mo20545B() {
        return (Handler) this.f30931u.getValue();
    }

    /* renamed from: D */
    public abstract int mo20547D();

    /* renamed from: E */
    public void mo20548E() {
    }

    /* renamed from: F */
    public void mo20549F() {
    }

    /* renamed from: com.bytedance.assem.arch.b.w$a */
    public static final class C12712a {
        static {
            Covode.recordClassIndex(14532);
        }

        /* renamed from: a */
        public static boolean m22905a() {
            return ((Boolean) AbstractC12711w.f30925r.getValue()).booleanValue();
        }

        /* renamed from: b */
        public static boolean m22906b() {
            return ((Boolean) AbstractC12711w.f30926s.getValue()).booleanValue();
        }

        private C12712a() {
        }

        public /* synthetic */ C12712a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$e */
    static final class RunnableC12716e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f30935a;

        static {
            Covode.recordClassIndex(14536);
        }

        RunnableC12716e(AbstractC89171a aVar) {
            this.f30935a = aVar;
        }

        public final void run() {
            this.f30935a.invoke();
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$b */
    static final class C12713b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C12713b f30932a = new C12713b();

        static {
            Covode.recordClassIndex(14533);
        }

        C12713b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m22907a());
        }

        /* renamed from: a */
        private static boolean m22907a() {
            try {
                System.out.println(C89204ab.m154669a(C1862a.class));
                return true;
            } catch (ClassNotFoundException e) {
                AbstractC12789k kVar = C12787j.f31108b;
                if (kVar == null) {
                    return false;
                }
                kVar.mo20639a("Could not find AndInflater", e);
                return false;
            }
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$c */
    static final class C12714c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C12714c f30933a = new C12714c();

        static {
            Covode.recordClassIndex(14534);
        }

        C12714c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m22908a());
        }

        /* renamed from: a */
        private static boolean m22908a() {
            try {
                System.out.println(C89204ab.m154669a(C0464a.class));
                return true;
            } catch (ClassNotFoundException e) {
                AbstractC12789k kVar = C12787j.f31108b;
                if (kVar == null) {
                    return false;
                }
                kVar.mo20639a("Could not find AsyncLayoutInflater", e);
                return false;
            }
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$d */
    static final class C12715d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C12715d f30934a = new C12715d();

        static {
            Covode.recordClassIndex(14535);
        }

        C12715d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$h */
    static final class C12720h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12711w f30943a;

        static {
            Covode.recordClassIndex(14540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12720h(AbstractC12711w wVar) {
            super(0);
            this.f30943a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC12711w wVar = this.f30943a;
            wVar.mo20514b(wVar.mo20528t());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.w$n */
    public static final class RunnableC12731n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC12711w f30954a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f30955b;

        static {
            Covode.recordClassIndex(14551);
        }

        RunnableC12731n(AbstractC12711w wVar, AbstractC89171a aVar) {
            this.f30954a = wVar;
            this.f30955b = aVar;
        }

        public final void run() {
            C12690t.m22849a(this.f30954a, new AbstractC89171a<C89391z>(this) {
                /* class com.bytedance.assem.arch.p795b.AbstractC12711w.RunnableC12731n.C127321 */

                /* renamed from: a */
                final /* synthetic */ RunnableC12731n f30956a;

                static {
                    Covode.recordClassIndex(14552);
                }

                {
                    this.f30956a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ C89391z invoke() {
                    this.f30956a.f30955b.invoke();
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: C */
    public final View mo20546C() {
        View view = this.f30930q;
        if (view == null) {
            C89219l.m154710a("contentView");
        }
        return view;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    public final void bU_() {
        m22888b(new C12727l(this));
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        m22888b(new C12725k(this));
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: l */
    public final void mo20537l() {
        m22888b(new C12723j(this));
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: n */
    public final void mo20526n() {
        m22888b(new C12729m(this));
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        m22888b(new C12721i(this));
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: A */
    public void mo20506A() {
        if (this.f30930q != null) {
            View view = this.f30930q;
            if (view == null) {
                C89219l.m154710a("contentView");
            }
            view.setVisibility(8);
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$g */
    static final class RunnableC12718g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC12711w f30938a;

        /* renamed from: b */
        final /* synthetic */ int f30939b;

        /* renamed from: c */
        final /* synthetic */ View f30940c;

        static {
            Covode.recordClassIndex(14538);
        }

        RunnableC12718g(AbstractC12711w wVar, int i, View view) {
            this.f30938a = wVar;
            this.f30939b = i;
            this.f30940c = view;
        }

        public final void run() {
            Context az_ = this.f30938a.az_();
            if (az_ != null) {
                final View a = C1870c.m6045a((Activity) az_, this.f30939b);
                this.f30938a.mo20507a(this.f30940c);
                AbstractC12711w wVar = this.f30938a;
                C89219l.m154709a((Object) a, "");
                wVar.mo20551d(a);
                this.f30938a.mo20514b(a);
                this.f30938a.mo20545B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12711w.RunnableC12718g.RunnableC127191 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC12718g f30941a;

                    static {
                        Covode.recordClassIndex(14539);
                    }

                    {
                        this.f30941a = r1;
                    }

                    public final void run() {
                        MethodCollector.m26663i(4168);
                        ((ViewGroup) this.f30941a.f30940c).addView(a);
                        MethodCollector.m26664o(4168);
                    }
                });
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$i */
    static final class C12721i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12711w f30944a;

        static {
            Covode.recordClassIndex(14541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12721i(AbstractC12711w wVar) {
            super(0);
            this.f30944a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f30944a.mo20549F();
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12711w.super.mo20527p();
            } else {
                this.f30944a.mo20545B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12711w.C12721i.RunnableC127221 */

                    /* renamed from: a */
                    final /* synthetic */ C12721i f30945a;

                    static {
                        Covode.recordClassIndex(14542);
                    }

                    {
                        this.f30945a = r1;
                    }

                    public final void run() {
                        C12721i.super.mo20527p();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$j */
    static final class C12723j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12711w f30946a;

        static {
            Covode.recordClassIndex(14543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12723j(AbstractC12711w wVar) {
            super(0);
            this.f30946a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f30946a.mo20548E();
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12711w.super.mo20537l();
            } else {
                this.f30946a.mo20545B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12711w.C12723j.RunnableC127241 */

                    /* renamed from: a */
                    final /* synthetic */ C12723j f30947a;

                    static {
                        Covode.recordClassIndex(14544);
                    }

                    {
                        this.f30947a = r1;
                    }

                    public final void run() {
                        C12723j.super.mo20537l();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$k */
    static final class C12725k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12711w f30948a;

        static {
            Covode.recordClassIndex(14545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12725k(AbstractC12711w wVar) {
            super(0);
            this.f30948a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12711w.super.mo20525j();
            } else {
                this.f30948a.mo20545B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12711w.C12725k.RunnableC127261 */

                    /* renamed from: a */
                    final /* synthetic */ C12725k f30949a;

                    static {
                        Covode.recordClassIndex(14546);
                    }

                    {
                        this.f30949a = r1;
                    }

                    public final void run() {
                        C12725k.super.mo20525j();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$l */
    static final class C12727l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12711w f30950a;

        static {
            Covode.recordClassIndex(14547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12727l(AbstractC12711w wVar) {
            super(0);
            this.f30950a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12711w.super.bU_();
            } else {
                this.f30950a.mo20545B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12711w.C12727l.RunnableC127281 */

                    /* renamed from: a */
                    final /* synthetic */ C12727l f30951a;

                    static {
                        Covode.recordClassIndex(14548);
                    }

                    {
                        this.f30951a = r1;
                    }

                    public final void run() {
                        C12727l.super.bU_();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.w$m */
    static final class C12729m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12711w f30952a;

        static {
            Covode.recordClassIndex(14549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12729m(AbstractC12711w wVar) {
            super(0);
            this.f30952a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC12711w.super.mo20526n();
            } else {
                this.f30952a.mo20545B().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.p795b.AbstractC12711w.C12729m.RunnableC127301 */

                    /* renamed from: a */
                    final /* synthetic */ C12729m f30953a;

                    static {
                        Covode.recordClassIndex(14550);
                    }

                    {
                        this.f30953a = r1;
                    }

                    public final void run() {
                        C12729m.super.mo20526n();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(14531);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: w */
    public final void mo20531w() {
        View view;
        if (this.f30896i && this.f30930q != null) {
            C12720h hVar = new C12720h(this);
            if (C12787j.f31109c) {
                C12787j.m23009a().execute(new RunnableC12716e(hVar));
            } else {
                mo20514b(mo20528t());
            }
        } else if (this.f30928o != 0) {
            int D = mo20547D();
            if (D != 0) {
                View view2 = bD_().f30981c;
                if (view2 != null) {
                    view = view2.findViewById(this.f30928o);
                } else {
                    view = null;
                }
                if (view == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                } else if (view instanceof ViewGroup) {
                    int i = C12733x.f30957a[this.f30929p.ordinal()];
                    if (i == 1) {
                        Context az_ = az_();
                        if (az_ != null) {
                            new C0464a(az_).mo2025a(D, (ViewGroup) view, new C12717f(this, view));
                            return;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else if (i == 2) {
                        Context az_2 = az_();
                        if (az_2 != null) {
                            View a = C1862a.m6031a(az_2, D);
                            if (a != null) {
                                ((ViewGroup) view).addView(a);
                                mo20507a(view);
                                this.f30930q = a;
                                mo20514b(a);
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else if (i == 3) {
                        C12787j.m23009a().execute(new RunnableC12718g(this, D, view));
                    } else if (i == 4) {
                        Context az_3 = az_();
                        if (az_3 != null) {
                            ViewGroup viewGroup = (ViewGroup) view;
                            View a2 = C1764a.m5927a(LayoutInflater.from(az_3), D, viewGroup, false);
                            if (a2 != null) {
                                viewGroup.addView(a2);
                                mo20507a(view);
                                this.f30930q = a2;
                                mo20514b(a2);
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("container must be a ViewGroup.".toString());
                }
            } else {
                throw new IllegalStateException("layoutId must be assigned.".toString());
            }
        } else {
            throw new IllegalStateException("slotLayoutId must be assigned.".toString());
        }
    }

    /* renamed from: d */
    public final void mo20551d(View view) {
        C89219l.m154719c(view, "");
        this.f30930q = view;
    }

    /* renamed from: b */
    private final void m22888b(AbstractC89171a<C89391z> aVar) {
        if (this.f30929p == EnumC12762l.ASYNC_X2C) {
            C12787j.m23009a().execute(new RunnableC12731n(this, aVar));
        } else {
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public final void mo20550a(EnumC12762l lVar) {
        EnumC12762l lVar2;
        C89219l.m154719c(lVar, "");
        if (lVar == EnumC12762l.ASYNC && C12712a.m22905a()) {
            lVar2 = EnumC12762l.ASYNC;
        } else if (lVar == EnumC12762l.X2C && C12712a.m22906b()) {
            lVar2 = EnumC12762l.X2C;
        } else if (lVar != EnumC12762l.ASYNC_X2C || !C12712a.m22906b()) {
            lVar2 = EnumC12762l.SYNC;
        } else {
            lVar2 = EnumC12762l.ASYNC_X2C;
        }
        this.f30929p = lVar2;
    }

    /* renamed from: com.bytedance.assem.arch.b.w$f */
    static final class C12717f implements C0464a.AbstractC0469d {

        /* renamed from: a */
        final /* synthetic */ AbstractC12711w f30936a;

        /* renamed from: b */
        final /* synthetic */ View f30937b;

        static {
            Covode.recordClassIndex(14537);
        }

        C12717f(AbstractC12711w wVar, View view) {
            this.f30936a = wVar;
            this.f30937b = view;
        }

        @Override // androidx.p022b.p023a.C0464a.AbstractC0469d
        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
            MethodCollector.m26663i(3029);
            C89219l.m154719c(view, "");
            if (this.f30936a.f31000d.mo4011a() == AbstractC1196i.EnumC1199b.DESTROYED) {
                MethodCollector.m26664o(3029);
                return;
            }
            ((ViewGroup) this.f30937b).addView(view);
            this.f30936a.mo20507a(this.f30937b);
            this.f30936a.mo20551d(view);
            this.f30936a.mo20514b(view);
            MethodCollector.m26664o(3029);
        }
    }
}
