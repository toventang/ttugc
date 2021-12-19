package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.C37491d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64958g;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65077d;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68067b;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68069d;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68070e;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68071f;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.k */
public final class C65017k extends AbstractC64959h<EnumC65077d> implements AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static final C65018a f146862i = new C65018a((byte) 0);

    /* renamed from: h */
    public Keva f146863h;

    /* renamed from: j */
    private Runnable f146864j;

    static {
        Covode.recordClassIndex(76485);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(205, new RunnableC90250g(C65017k.class, "onSwitchToCreatorAccount", C68071f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(206, new RunnableC90250g(C65017k.class, "onSwitchToBusinessAccount", C68070e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(207, new RunnableC90250g(C65017k.class, "onSwitchToPersonalAccount", C68067b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(208, new RunnableC90250g(C65017k.class, "onShowBASuggestBubbleEvent", C68069d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.k$a */
    public static final class C65018a {
        static {
            Covode.recordClassIndex(76486);
        }

        private C65018a() {
        }

        public /* synthetic */ C65018a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ AbstractC65076c mo104273v() {
        return EnumC65077d.SuggestBA;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h
    /* renamed from: w */
    public final List<EnumC65077d> mo104287w() {
        return C89070n.m154516a(EnumC65077d.FindFriends);
    }

    /* renamed from: A */
    public static User m116765A() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return g.getCurUser();
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        View u = mo104272u();
        if (u != null) {
            u.removeCallbacks(this.f146864j);
        }
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.k$d */
    static final class RunnableC65021d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C65017k f146867a;

        /* renamed from: b */
        final /* synthetic */ User f146868b;

        static {
            Covode.recordClassIndex(76489);
        }

        RunnableC65021d(C65017k kVar, User user) {
            this.f146867a = kVar;
            this.f146868b = user;
        }

        public final void run() {
            C37491d bizAccountInfo;
            C65017k kVar = this.f146867a;
            User user = this.f146868b;
            if (!kVar.f146863h.getBoolean("has_shown_tips", false) && user != null && (bizAccountInfo = user.getBizAccountInfo()) != null && bizAccountInfo.getSuggestedAccountsEntranceTipType() == 1) {
                kVar.mo104270a(true);
                C39162r.m79460a("ttelite_BA_add_business_red_dot_show", new C33744d().mo59983a("user_category", user.getCategory()).f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.k$e */
    static final class RunnableC65022e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f146869a;

        /* renamed from: b */
        final /* synthetic */ C65017k f146870b;

        /* renamed from: c */
        final /* synthetic */ User f146871c;

        static {
            Covode.recordClassIndex(76490);
        }

        RunnableC65022e(View view, C65017k kVar, User user) {
            this.f146869a = view;
            this.f146870b = kVar;
            this.f146871c = user;
        }

        public final void run() {
            Context az_ = this.f146870b.az_();
            if (az_ != null) {
                ((C23329a) new C23329a(az_).mo38041b(this.f146869a).mo38034a(EnumC23352h.BOTTOM)).mo38023e(R.string.ghp).mo38030a(5000L).mo38042b(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C65017k.RunnableC65022e.C650231 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC65022e f146872a;

                    static {
                        Covode.recordClassIndex(76491);
                    }

                    {
                        this.f146872a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        String str;
                        C33744d dVar = new C33744d();
                        User user = this.f146872a.f146871c;
                        if (user != null) {
                            str = user.getCategory();
                        } else {
                            str = null;
                        }
                        C39162r.m79460a("ttelite_BA_add_business_bubble_show", dVar.mo59983a("user_category", str).f79943a);
                        return C89391z.f203057a;
                    }
                }).mo38012d().mo38001a();
            }
        }
    }

    public C65017k() {
        String str;
        StringBuilder sb = new StringBuilder("BA_SUGGESTED_ACCOUNT");
        User curUser = C31575b.m65865g().getCurUser();
        if (curUser != null) {
            str = curUser.getUid();
        } else {
            str = null;
        }
        this.f146863h = Keva.getRepo(sb.append(str).toString());
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        EventBus.m156966a(EventBus.m156962a(), this);
        if (!mo104271t() || !C80580in.m139695h(m116765A())) {
            mo104290z();
        } else {
            mo104289y();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.k$c */
    static final class C65020c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65017k f146866a;

        static {
            Covode.recordClassIndex(76488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65020c(C65017k kVar) {
            super(0);
            this.f146866a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            C37491d bizAccountInfo;
            this.f146866a.mo104270a(false);
            this.f146866a.f146863h.storeBoolean("has_shown_tips", true);
            Context az_ = this.f146866a.az_();
            User A = C65017k.m116765A();
            String str2 = null;
            if (A == null || (bizAccountInfo = A.getBizAccountInfo()) == null) {
                str = null;
            } else {
                str = bizAccountInfo.getSuggestedAccountsLynxSchema();
            }
            SmartRouter.buildRoute(az_, str).open();
            C33744d dVar = new C33744d();
            User A2 = C65017k.m116765A();
            if (A2 != null) {
                str2 = A2.getCategory();
            }
            C39162r.m79460a("ttelite_BA_add_business_icon_click", dVar.mo59983a("user_category", str2).f79943a);
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchToCreatorAccount(C68071f fVar) {
        C89219l.m154721d(fVar, "");
        mo104290z();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchToPersonalAccount(C68067b bVar) {
        C89219l.m154721d(bVar, "");
        mo104290z();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.k$b */
    static final class C65019b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C65019b f146865a = new C65019b();

        static {
            Covode.recordClassIndex(76487);
        }

        C65019b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_briefcase_plus;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: a */
    public final /* synthetic */ void mo104269a(C23187b bVar) {
        C23187b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        bVar2.mo37739a(C23005c.m43393a(C65019b.f146865a)).mo37741a((AbstractC89171a<C89391z>) new C65020c(this));
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchToBusinessAccount(C68070e eVar) {
        C89219l.m154721d(eVar, "");
        User curUser = C31575b.m65865g().getCurUser();
        if (C80580in.m139695h(curUser)) {
            mo104289y();
        }
        View u = mo104272u();
        if (u != null) {
            u.post(new RunnableC65021d(this, curUser));
        }
    }

    @AbstractC90264r
    public final void onShowBASuggestBubbleEvent(C68069d dVar) {
        C37491d bizAccountInfo;
        C89219l.m154721d(dVar, "");
        User curUser = C31575b.m65865g().getCurUser();
        AbstractC64958g gVar = ((AbstractC64941c) this).f146763g;
        if (gVar == null) {
            C89219l.m154710a("service");
        }
        if (gVar.mo104284c(mo104273v()) && !this.f146863h.getBoolean("has_shown_tips", false) && curUser != null && (bizAccountInfo = curUser.getBizAccountInfo()) != null && bizAccountInfo.getSuggestedAccountsEntranceTipType() == 2) {
            mo104270a(false);
            View u = mo104272u();
            if (u != null) {
                RunnableC65022e eVar = new RunnableC65022e(u, this, curUser);
                this.f146864j = eVar;
                u.postDelayed(eVar, 300);
            }
            this.f146863h.storeBoolean("has_shown_tips", true);
        }
    }
}
