package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a;

import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c.C64082d;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64962i;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f */
public final class C64993f extends AbstractC64962i {

    /* renamed from: h */
    public static final C64994a f146831h = new C64994a((byte) 0);

    /* renamed from: i */
    private final AbstractC89244h f146832i = C89250i.m154773a((AbstractC89171a) C64996c.f146835a);

    /* renamed from: j */
    private final AbstractC89244h f146833j = C89250i.m154773a((AbstractC89171a) new C64995b(this));

    static {
        Covode.recordClassIndex(76461);
    }

    /* renamed from: x */
    private final C63511a m116756x() {
        return (C63511a) this.f146832i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$a */
    public static final class C64994a {
        static {
            Covode.recordClassIndex(76462);
        }

        private C64994a() {
        }

        public /* synthetic */ C64994a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$e */
    static final class C64999e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64993f f146839a;

        static {
            Covode.recordClassIndex(76467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64999e(C64993f fVar) {
            super(1);
            this.f146839a = fVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$e$a */
        static final class RunnableC65000a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ User f146840a;

            /* renamed from: b */
            final /* synthetic */ C64999e f146841b;

            static {
                Covode.recordClassIndex(76468);
            }

            RunnableC65000a(User user, C64999e eVar) {
                this.f146840a = user;
                this.f146841b = eVar;
            }

            public final void run() {
                this.f146841b.f146839a.mo104297c(this.f146840a);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            View u;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || (u = this.f146839a.mo104272u()) == null)) {
                u.post(new RunnableC65000a(t, this));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$b */
    static final class C64995b extends AbstractC89220m implements AbstractC89171a<AbstractC0952i> {

        /* renamed from: a */
        final /* synthetic */ C64993f f146834a;

        static {
            Covode.recordClassIndex(76463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64995b(C64993f fVar) {
            super(0);
            this.f146834a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC0952i invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146834a);
            if (a != null) {
                return a.getFragmentManager();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$c */
    static final class C64996c extends AbstractC89220m implements AbstractC89171a<C63511a> {

        /* renamed from: a */
        public static final C64996c f146835a = new C64996c();

        static {
            Covode.recordClassIndex(76464);
        }

        C64996c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63511a invoke() {
            return new C63511a("personal_homepage", "unfold_triangle");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$g */
    public static final class RunnableC65003g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C64993f f146845a;

        /* renamed from: b */
        final /* synthetic */ int f146846b;

        static {
            Covode.recordClassIndex(76471);
        }

        RunnableC65003g(C64993f fVar, int i) {
            this.f146845a = fVar;
            this.f146846b = i;
        }

        public final void run() {
            if (this.f146846b > 0) {
                this.f146845a.mo104270a(true);
            } else {
                this.f146845a.mo104270a(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64962i, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C65006g.f146850a, new C64997d(this));
        User b = C80580in.m139683b();
        if (b != null) {
            mo104297c(b);
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C65007h.f146851a, new C64999e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final synchronized void mo104298w() {
        MethodCollector.m26663i(9326);
        String str = "profile_choose_account_dialog " + m116756x().f144137a;
        AbstractC0952i iVar = (AbstractC0952i) this.f146833j.getValue();
        if (iVar != null) {
            Fragment a = iVar.mo3551a(str);
            if (a == null || !a.isAdded()) {
                C64082d.C64083a.m115995a(iVar, m116756x(), str);
                MethodCollector.m26664o(9326);
                return;
            }
            MethodCollector.m26664o(9326);
            return;
        }
        MethodCollector.m26664o(9326);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: a */
    public final /* synthetic */ void mo104269a(C23194g gVar) {
        C23194g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        gVar2.mo37753a("");
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$d */
    static final class C64997d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64993f f146836a;

        static {
            Covode.recordClassIndex(76465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64997d(C64993f fVar) {
            super(1);
            this.f146836a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            final T t;
            C12776a<? extends User> aVar2 = aVar;
            if (aVar2 != null) {
                t = aVar2.f31085a;
            } else {
                t = null;
            }
            this.f146836a.mo104291a(new AbstractC89172b<C23194g, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64993f.C64997d.C649981 */

                /* renamed from: a */
                final /* synthetic */ C64997d f146837a;

                static {
                    Covode.recordClassIndex(76466);
                }

                {
                    this.f146837a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23194g gVar) {
                    C23194g gVar2 = gVar;
                    C89219l.m154721d(gVar2, "");
                    gVar2.mo37751a(C64993f.m116720a(t)).mo37754b(C64993f.m116721b(t));
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$f */
    public static final class C65001f extends AbstractC89220m implements AbstractC89172b<C23194g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64993f f146842a;

        /* renamed from: b */
        final /* synthetic */ User f146843b;

        static {
            Covode.recordClassIndex(76469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65001f(C64993f fVar, User user) {
            super(1);
            this.f146842a = fVar;
            this.f146843b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23194g gVar) {
            C23194g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            gVar2.f54945c = R.raw.icon_chevron_down_fill;
            gVar2.mo37751a(C64993f.m116720a(this.f146843b)).mo37754b(C64993f.m116721b(this.f146843b)).mo37750a((AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64993f.C65001f.C650021 */

                /* renamed from: a */
                final /* synthetic */ C65001f f146844a;

                static {
                    Covode.recordClassIndex(76470);
                }

                {
                    this.f146844a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C64993f fVar = this.f146844a.f146842a;
                    AbstractC34892bo b = C31575b.m65860b();
                    C89219l.m154716b(b, "");
                    if (b.isEnableMultiAccountLogin()) {
                        fVar.mo104298w();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$h */
    public static final class C65004h extends AbstractC89220m implements AbstractC89172b<C23194g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64993f f146847a;

        /* renamed from: b */
        final /* synthetic */ User f146848b;

        static {
            Covode.recordClassIndex(76472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65004h(C64993f fVar, User user) {
            super(1);
            this.f146847a = fVar;
            this.f146848b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23194g gVar) {
            C23194g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            gVar2.f54945c = 0;
            C23194g b = gVar2.mo37751a(C64993f.m116720a(this.f146848b)).mo37754b(C64993f.m116721b(this.f146848b));
            b.f54945c = 0;
            b.mo37750a((AbstractC89171a<C89391z>) C650051.f146849a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final void mo104297c(User user) {
        int a;
        AbstractC34892bo b = C31575b.m65860b();
        C89219l.m154716b(b, "");
        if (b.isEnableMultiAccountLogin()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            List<String> allUidList = C31575b.m65865g().allUidList();
            C89219l.m154716b(allUidList, "");
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) allUidList, 10));
            for (T t : allUidList) {
                if (C89219l.m154714a((Object) curUserId, (Object) t)) {
                    a = 0;
                } else {
                    C89219l.m154716b(t, "");
                    a = C61542b.m111457a(t);
                }
                arrayList.add(Integer.valueOf(a));
            }
            int s = C89070n.m154599s(arrayList);
            mo104291a(new C65001f(this, user));
            View u = mo104272u();
            if (u != null) {
                u.post(new RunnableC65003g(this, s));
                return;
            }
            return;
        }
        mo104291a(new C65004h(this, user));
        mo104270a(false);
    }
}
