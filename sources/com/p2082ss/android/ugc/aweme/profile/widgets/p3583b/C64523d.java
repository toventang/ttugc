package com.p2082ss.android.ugc.aweme.profile.widgets.p3583b;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.commerce.C37500k;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37840h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import com.p2082ss.android.ugc.aweme.music.AbstractC60708b;
import com.p2082ss.android.ugc.aweme.music.C60797g;
import com.p2082ss.android.ugc.aweme.music.assem.C60395c;
import com.p2082ss.android.ugc.aweme.profile.effect.C63713e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63372l;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63501g;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63990as;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64312w;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64315z;
import com.p2082ss.android.ugc.aweme.profile.service.C63867b;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.EnumC64592g;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.utils.C80541ho;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.d */
public final class C64523d extends AbstractC64513a implements AbstractC64533h {

    /* renamed from: z */
    public static final C64525b f146210z = new C64525b((byte) 0);

    /* renamed from: A */
    private boolean f146211A = true;

    /* renamed from: B */
    private boolean f146212B;

    /* renamed from: C */
    private final C12786i f146213C = new C12786i(bW_(), new C64524a(this, null));

    /* renamed from: D */
    private C37500k f146214D;

    /* renamed from: E */
    private AbstractC63985aq f146215E;

    /* renamed from: x */
    public AbstractC63985aq f146216x;

    /* renamed from: y */
    public AbstractC63985aq f146217y;

    static {
        Covode.recordClassIndex(75987);
    }

    /* renamed from: Q */
    private final C64870a m116444Q() {
        return (C64870a) this.f146213C.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: D */
    public final boolean mo104084D() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: G */
    public final boolean mo104087G() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(300, new RunnableC90250g(C64523d.class, "onRefreshProfileViewPagerDataEvent", C63501g.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(2, new RunnableC90250g(C64523d.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(301, new RunnableC90250g(C64523d.class, "onMyEnterpriseProfileEvent", C37840h.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.d$b */
    public static final class C64525b {
        static {
            Covode.recordClassIndex(75989);
        }

        private C64525b() {
        }

        public /* synthetic */ C64525b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.d$c */
    static final class C64526c implements AbstractC63985aq.AbstractC63987b {

        /* renamed from: a */
        final /* synthetic */ C64523d f146220a;

        static {
            Covode.recordClassIndex(75990);
        }

        C64526c(C64523d dVar) {
            this.f146220a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq.AbstractC63987b
        /* renamed from: a */
        public final void mo103569a() {
            this.f146220a.mo104085E();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: v */
    public final String mo104108v() {
        C64870a Q = m116444Q();
        if (Q != null) {
            return Q.f146659b;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: x */
    public final String mo104110x() {
        C64870a Q = m116444Q();
        if (Q != null) {
            return Q.f146661d;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: y */
    public final String mo104111y() {
        C64870a Q = m116444Q();
        if (Q != null) {
            return Q.f146662e;
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.d$a */
    public static final class C64524a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146218a;

        /* renamed from: b */
        final /* synthetic */ String f146219b;

        static {
            Covode.recordClassIndex(75988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64524a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146218a = aVar;
            this.f146219b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146218a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146219b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.C64523d.C64524a.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: w */
    public final User mo104109w() {
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            return iVar.f146329a;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64533h
    /* renamed from: P */
    public final void mo104115P() {
        List<AbstractC64118co> list;
        Fragment fragment;
        if (this.f146184k != null && (list = this.f146184k) != null && list.size() > 0) {
            C64117cn<AbstractC64118co> cnVar = this.f146187n;
            ArrayList<Aweme> arrayList = null;
            Fragment fragment2 = null;
            if (cnVar != null) {
                fragment = cnVar.mo103729b();
            } else {
                fragment = null;
            }
            if (fragment instanceof AbstractC63985aq) {
                C64117cn<AbstractC64118co> cnVar2 = this.f146187n;
                if (cnVar2 != null) {
                    fragment2 = cnVar2.mo103729b();
                }
                Objects.requireNonNull(fragment2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
                arrayList = ((AbstractC63985aq) fragment2).mo103556C();
            }
            C50540h.f116810b = arrayList;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        boolean z;
        super.mo20525j();
        AbstractC63985aq aqVar = this.f146216x;
        if (aqVar != null && !this.f146211A) {
            aqVar.mo103564s();
        }
        C64312w wVar = (C64312w) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64313x.class));
        if (wVar != null) {
            z = wVar.f145777e;
        } else {
            z = false;
        }
        String d = mo104102d(this.f146188o);
        if (z && C64315z.m116188a(d) && (!C89219l.m154714a((Object) mo104108v(), (Object) "qa_detail"))) {
            C64314y.m116186b(d);
            List<Integer> list = this.f146185l;
            if (list != null && list.contains(16)) {
                C64314y.m116184a("personal_homepage", mo104110x(), (Integer) 1, (Integer) null, "");
            }
        }
        this.f146211A = false;
        if (this.f146212B) {
            this.f146212B = false;
            List<AbstractC64118co> list2 = this.f146184k;
            if (list2 != null) {
                for (T t : list2) {
                    if (t instanceof AbstractC63990as) {
                        t.mo98052k();
                    }
                }
            }
        }
    }

    @AbstractC90264r
    public final void onRefreshProfileViewPagerDataEvent(C63501g gVar) {
        this.f146212B = true;
    }

    @AbstractC90264r
    public final void onMyEnterpriseProfileEvent(C37840h hVar) {
        C89219l.m154721d(hVar, "");
        if (hVar.f89338a == 1) {
            this.f146212B = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64533h
    /* renamed from: a */
    public final void mo104116a(String str) {
        AbstractC63985aq aqVar = this.f146217y;
        if (aqVar != null) {
            aqVar.mo103559a(str, true);
        }
        AbstractC63985aq aqVar2 = this.f146216x;
        if (aqVar2 != null) {
            aqVar2.mo103559a(str, true);
        }
        AbstractC63985aq aqVar3 = this.f146215E;
        if (aqVar3 != null) {
            aqVar3.mo103559a(str, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: c */
    public final void mo104101c(int i) {
        super.mo104101c(i);
        AbstractC63985aq aqVar = this.f146216x;
        if (aqVar != null) {
            List<AbstractC64118co> list = this.f146184k;
            if (list == null) {
                C89219l.m154715b();
            }
            if (C89219l.m154714a(aqVar, list.get(this.f146188o)) && !this.f146211A) {
                AbstractC63985aq aqVar2 = this.f146216x;
                if (aqVar2 == null) {
                    C89219l.m154715b();
                }
                aqVar2.mo103564s();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.d$d */
    static final class C64527d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64523d f146221a;

        static {
            Covode.recordClassIndex(75991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64527d(C64523d dVar) {
            super(1);
            this.f146221a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            EnumC64592g gVar;
            if (aVar != null) {
                this.f146221a.mo104083C();
                AbstractC81915c.m141874a(new C63372l());
            }
            C64615i iVar = (C64615i) C12801d.m23029f(this.f146221a, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null) {
                gVar = iVar.f146333e;
            } else {
                gVar = null;
            }
            if (gVar == EnumC64592g.CHANGE_TAB) {
                C64523d dVar = this.f146221a;
                dVar.mo104099b(dVar.mo104109w());
            }
            AbstractC63985aq aqVar = this.f146221a.f146217y;
            if (aqVar != null) {
                aqVar.mo103557a(this.f146221a.mo104109w());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.d$e */
    static final class C64528e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64523d f146222a;

        static {
            Covode.recordClassIndex(75992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64528e(C64523d dVar) {
            super(1);
            this.f146222a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            Fragment a;
            AbstractC0952i childFragmentManager;
            C12776a<? extends Boolean> aVar2 = aVar;
            if (!(aVar2 == null || (a = C12777b.m22999a((AbstractC1204m) this.f146222a)) == null || (childFragmentManager = a.getChildFragmentManager()) == null)) {
                for (Fragment fragment : childFragmentManager.mo3565f()) {
                    if ((fragment instanceof C60797g) && fragment != null) {
                        fragment.onHiddenChanged(aVar2.f31085a.booleanValue());
                    }
                    if ((fragment instanceof C60395c) && fragment != null) {
                        fragment.onHiddenChanged(aVar2.f31085a.booleanValue());
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.d$f */
    static final class C64529f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64523d f146223a;

        static {
            Covode.recordClassIndex(75993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64529f(C64523d dVar) {
            super(1);
            this.f146223a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.f146223a.mo104098a(booleanValue);
            C64523d dVar = this.f146223a;
            String d = dVar.mo104102d(dVar.f146188o);
            if (booleanValue && this.f146223a.f31000d.mo4011a() == AbstractC1196i.EnumC1199b.RESUMED && C64315z.m116188a(d) && (!C89219l.m154714a((Object) this.f146223a.mo104108v(), (Object) "qa_detail"))) {
                C64314y.m116186b(d);
                List<Integer> list = this.f146223a.f146185l;
                if (list != null && list.contains(16)) {
                    C64314y.m116184a("personal_homepage", this.f146223a.mo104110x(), (Integer) 1, (Integer) null, "");
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        mo104081A().setOffscreenPageLimit(3);
        if (mo104109w() != null) {
            mo104099b(mo104109w());
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64530e.f146224a, new C64527d(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64531f.f146225a, new C64528e(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64532g.f146226a, new C64529f(this));
    }

    @AbstractC90264r
    public final void onVideoEvent(C49672ag agVar) {
        String str;
        C89219l.m154721d(agVar, "");
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (a != null) {
            str = a.getTag();
        } else {
            str = null;
        }
        if (!(!C89219l.m154714a((Object) "USER", (Object) str))) {
            int i = agVar.f114315a;
            if (i != 2) {
                if (i == 13) {
                    IAwemeService b = AwemeService.m70060b();
                    Object obj = agVar.f114316b;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    Aweme b2 = b.mo60684b((String) obj);
                    C89219l.m154716b(b2, "");
                    if (b2.getUserDigg() == 1) {
                        C31575b.m65865g().updateCurFavoritingCount(1);
                    } else {
                        C31575b.m65865g().updateCurFavoritingCount(-1);
                    }
                } else if (i == 15) {
                    if (agVar.f114318d == 0) {
                        C31575b.m65865g().updateCurAwemeCount(1);
                    }
                } else {
                    return;
                }
            } else if (agVar.f114318d == 0) {
                C31575b.m65865g().updateCurAwemeCount(-1);
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            curUser.getAwemeCount();
            mo104092L();
            curUser.getFavoritingCount();
            mo104093M();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: e */
    public final void mo104103e(int i) {
        Fragment fragment;
        AbstractC0952i childFragmentManager;
        Fragment fragment2;
        AbstractC0952i childFragmentManager2;
        Fragment fragment3;
        String str;
        AbstractC0952i childFragmentManager3;
        boolean z = false;
        boolean z2 = true;
        String str2 = null;
        AbstractC60708b bVar = null;
        String str3 = null;
        String str4 = null;
        if (i == 0) {
            Fragment a = C12777b.m22999a((AbstractC1204m) this);
            if (a == null || (childFragmentManager = a.getChildFragmentManager()) == null) {
                fragment = null;
            } else {
                fragment = childFragmentManager.mo3551a(this.f146183j + 1);
            }
            AbstractC63985aq aqVar = (AbstractC63985aq) fragment;
            if (aqVar == null) {
                C63867b bVar2 = C63867b.f144793a;
                C89219l.m154716b(C33403c.C33406b.f79409a, "");
                int a2 = C33403c.m68502a();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                String curUserId = g.getCurUserId();
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                aqVar = bVar2.createAwemeListFragment(a2, 0, curUserId, g2.getCurSecUserId(), true, true, false);
            }
            this.f146217y = aqVar;
            mo104097a((AbstractC64118co) aqVar, (Integer) 0);
            if (aqVar == null) {
                C89219l.m154715b();
            }
            aqVar.mo103558a(mo104086F());
            int i2 = this.f146188o;
            List<Integer> list = this.f146185l;
            if (list == null || i2 != list.indexOf(0)) {
                z2 = false;
            }
            aqVar.mo103563d(z2);
            aqVar.mo103561c(C80541ho.m139617a(0));
            if (!(aqVar instanceof C64066c)) {
                aqVar = null;
            }
            C64066c cVar = (C64066c) aqVar;
            if (cVar != null) {
                C64870a Q = m116444Q();
                if (Q != null) {
                    str2 = Q.f146658a;
                }
                cVar.f145351o = str2;
            }
        } else if (i == 10) {
            Fragment a3 = C12777b.m22999a((AbstractC1204m) this);
            if (a3 == null || (childFragmentManager2 = a3.getChildFragmentManager()) == null) {
                fragment2 = null;
            } else {
                fragment2 = childFragmentManager2.mo3551a(this.f146183j + 3);
            }
            AbstractC63985aq aqVar2 = (AbstractC63985aq) fragment2;
            if (aqVar2 == null) {
                C63867b bVar3 = C63867b.f144793a;
                C89219l.m154716b(C33403c.C33406b.f79409a, "");
                int a4 = C33403c.m68502a();
                IAccountUserService g3 = C31575b.m65865g();
                C89219l.m154716b(g3, "");
                String curUserId2 = g3.getCurUserId();
                IAccountUserService g4 = C31575b.m65865g();
                C89219l.m154716b(g4, "");
                aqVar2 = bVar3.createAwemeListFragment(a4, 14, curUserId2, g4.getCurSecUserId(), true, true, false);
            }
            this.f146215E = aqVar2;
            mo104097a((AbstractC64118co) aqVar2, (Integer) 14);
            if (aqVar2 == null) {
                C89219l.m154715b();
            }
            aqVar2.mo103558a(mo104086F());
            int i3 = this.f146188o;
            List<Integer> list2 = this.f146185l;
            if (list2 != null && i3 == list2.indexOf(14)) {
                z = true;
            }
            aqVar2.mo103563d(z);
            aqVar2.mo103561c(C80541ho.m139617a(14));
            if (!(aqVar2 instanceof C64066c)) {
                aqVar2 = null;
            }
            C64066c cVar2 = (C64066c) aqVar2;
            if (cVar2 != null) {
                C64870a Q2 = m116444Q();
                if (Q2 != null) {
                    str4 = Q2.f146658a;
                }
                cVar2.f145351o = str4;
            }
        } else if (i == 12) {
            if (this.f146214D == null) {
                Bundle bundle = new Bundle();
                User w = mo104109w();
                if (w != null) {
                    bundle.putString("sec_user_id", w.getSecUid());
                    bundle.putString("author_id", w.getUid());
                    bundle.putBoolean("is_my_profile", true);
                    bundle.putInt("follow_status", w.getFollowStatus());
                }
                this.f146214D = C37500k.C37503c.m75626a(bundle);
            }
            mo104097a((AbstractC64118co) this.f146214D, (Integer) 16);
        } else if (i == 2) {
            Fragment a5 = C12777b.m22999a((AbstractC1204m) this);
            if (a5 == null || (childFragmentManager3 = a5.getChildFragmentManager()) == null) {
                fragment3 = null;
            } else {
                fragment3 = childFragmentManager3.mo3551a(this.f146183j + 2);
            }
            AbstractC63985aq aqVar3 = (AbstractC63985aq) fragment3;
            this.f146216x = aqVar3;
            if (aqVar3 == null) {
                C63867b bVar4 = C63867b.f144793a;
                C89219l.m154716b(C33403c.C33406b.f79409a, "");
                int a6 = C33403c.m68502a();
                IAccountUserService g5 = C31575b.m65865g();
                C89219l.m154716b(g5, "");
                String curUserId3 = g5.getCurUserId();
                IAccountUserService g6 = C31575b.m65865g();
                C89219l.m154716b(g6, "");
                this.f146216x = bVar4.createAwemeListFragment(a6, 1, curUserId3, g6.getCurSecUserId(), true, true, false);
            }
            AbstractC63985aq aqVar4 = this.f146216x;
            Objects.requireNonNull(aqVar4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.ProfileListFragment");
            mo104097a((AbstractC64118co) aqVar4, (Integer) 1);
            AbstractC63985aq aqVar5 = this.f146216x;
            if (aqVar5 == null) {
                C89219l.m154715b();
            }
            C64870a Q3 = m116444Q();
            if (Q3 != null) {
                str = Q3.f146659b;
            } else {
                str = null;
            }
            aqVar5.mo103562c_(str);
            AbstractC63985aq aqVar6 = this.f146216x;
            if (aqVar6 == null) {
                C89219l.m154715b();
            }
            aqVar6.mo103558a(mo104086F());
            AbstractC63985aq aqVar7 = this.f146216x;
            if (aqVar7 == null) {
                C89219l.m154715b();
            }
            int i4 = this.f146188o;
            List<Integer> list3 = this.f146185l;
            if (list3 != null && i4 == list3.indexOf(1)) {
                z = true;
            }
            aqVar7.mo103563d(z);
            AbstractC63985aq aqVar8 = this.f146216x;
            if (aqVar8 == null) {
                C89219l.m154715b();
            }
            aqVar8.mo103561c(C80541ho.m139617a(1));
            AbstractC63985aq aqVar9 = this.f146216x;
            if (!(aqVar9 instanceof C64066c)) {
                aqVar9 = null;
            }
            C64066c cVar3 = (C64066c) aqVar9;
            if (cVar3 != null) {
                C64870a Q4 = m116444Q();
                if (Q4 != null) {
                    str3 = Q4.f146658a;
                }
                cVar3.f145351o = str3;
            }
        } else if (i == 3) {
            C89219l.m154716b(C33403c.C33406b.f79409a, "");
            AbstractC64118co f = mo104104f(C33403c.m68502a());
            mo104097a(f, (Integer) 3);
            f.mo103561c(C80541ho.m139617a(3));
            f.aC_();
            if (f instanceof AbstractC60708b) {
                bVar = f;
            }
            AbstractC60708b bVar5 = bVar;
            if (bVar5 != null) {
                bVar5.mo98047a(new C64526c(this));
            }
        } else if (i == 4) {
            C63713e N = mo104094N();
            mo104097a((AbstractC64118co) N, (Integer) 6);
            N.mo103561c(C80541ho.m139617a(6));
            N.aC_();
        }
    }
}
