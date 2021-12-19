package com.p2082ss.android.ugc.aweme.profile.widgets.relations;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.following.p3003ui.FollowRelationTabActivity;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.PrivacySetting;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b */
public final class C65171b extends AbstractC12769a implements AbstractC65189d, AbstractC90252i, AbstractC90253j {

    /* renamed from: m */
    public static final C65181j f147070m = new C65181j((byte) 0);

    /* renamed from: j */
    TextView f147071j;

    /* renamed from: k */
    TextView f147072k;

    /* renamed from: l */
    public TextView f147073l;

    /* renamed from: n */
    private final C12786i f147074n = new C12786i(bW_(), new C65180i(this, null));

    /* renamed from: o */
    private final C12814b f147075o;

    /* renamed from: p */
    private View f147076p;

    /* renamed from: q */
    private TextView f147077q;

    /* renamed from: r */
    private ViewGroup f147078r;

    /* renamed from: s */
    private ViewGroup f147079s;

    /* renamed from: t */
    private ViewGroup f147080t;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$b */
    public static final class C65173b extends AbstractC89220m implements AbstractC89172b<C65170a, C65170a> {
        public static final C65173b INSTANCE = new C65173b();

        static {
            Covode.recordClassIndex(76644);
        }

        public C65173b() {
            super(1);
        }

        public final C65170a invoke(C65170a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(76642);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(36, new RunnableC90250g(C65171b.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: w */
    public final ProfileRelationVM mo104355w() {
        return (ProfileRelationVM) this.f147075o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$d */
    public static final class C65175d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147082a;

        static {
            Covode.recordClassIndex(76646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65175d(AbstractC12748a aVar) {
            super(0);
            this.f147082a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f147082a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$j */
    public static final class C65181j {
        static {
            Covode.recordClassIndex(76652);
        }

        private C65181j() {
        }

        public /* synthetic */ C65181j(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$c */
    public static final class C65174c extends AbstractC89220m implements AbstractC89171a<C12874b<C65170a>> {
        public static final C65174c INSTANCE = new C65174c();

        static {
            Covode.recordClassIndex(76645);
        }

        public C65174c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C65170a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$e */
    public static final class C65176e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147083a;

        static {
            Covode.recordClassIndex(76647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65176e(AbstractC12748a aVar) {
            super(0);
            this.f147083a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f147083a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$f */
    public static final class C65177f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147084a;

        static {
            Covode.recordClassIndex(76648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65177f(AbstractC12748a aVar) {
            super(0);
            this.f147084a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f147084a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$g */
    public static final class C65178g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147085a;

        static {
            Covode.recordClassIndex(76649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65178g(AbstractC12748a aVar) {
            super(0);
            this.f147085a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f147085a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$h */
    public static final class C65179h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147086a;

        static {
            Covode.recordClassIndex(76650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65179h(AbstractC12748a aVar) {
            super(0);
            this.f147086a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f147086a.bD_().f30985g;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        EventBus.m156962a().mo145395b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo104354v() {
        C64870a aVar = (C64870a) this.f147074n.getValue();
        if (aVar != null) {
            return aVar.f146660c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$a */
    public static final class C65172a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f147081a;

        static {
            Covode.recordClassIndex(76643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65172a(AbstractC89277c cVar) {
            super(0);
            this.f147081a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f147081a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$i */
    public static final class C65180i extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147087a;

        /* renamed from: b */
        final /* synthetic */ String f147088b;

        static {
            Covode.recordClassIndex(76651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65180i(AbstractC12748a aVar, String str) {
            super(0);
            this.f147087a = aVar;
            this.f147088b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f147087a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f147088b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.relations.C65171b.C65180i.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.relations.AbstractC65189d
    /* renamed from: x */
    public final void mo104356x() {
        TextView textView = this.f147071j;
        if (textView != null) {
            textView.setText("-");
        }
        TextView textView2 = this.f147077q;
        if (textView2 != null) {
            textView2.setText("-");
        }
        TextView textView3 = this.f147073l;
        if (textView3 != null) {
            textView3.setText("-");
        }
    }

    public C65171b() {
        AbstractC89277c a = C89204ab.m154669a(ProfileRelationVM.class);
        this.f147075o = new C12814b(a, new C65172a(a), C65174c.INSTANCE, new C65175d(this), new C65176e(this), new C65177f(this), C65173b.INSTANCE, new C65178g(this), new C65179h(this));
    }

    /* renamed from: a */
    public final void mo104351a(int i) {
        long a = mo104350a((long) i);
        if (a < 0) {
            a = 0;
        }
        TextView textView = this.f147077q;
        if (textView != null) {
            textView.setText(C53437b.m98615a(a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo104350a(long j) {
        User user;
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            user = iVar.f146329a;
        } else {
            user = null;
        }
        if (!C80580in.m139694g(user) || !C80580in.m139687c()) {
            return j;
        }
        return 0;
    }

    @AbstractC90264r
    public final void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        C89219l.m154721d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        if (mo104354v()) {
            String str = followStatus.userId;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (TextUtils.equals(str, g.getCurUserId()) || !followStatus.isFollowSucess) {
                return;
            }
            if (followStatus.followStatus == 0) {
                C31575b.m65865g().updateCurFollowingCount(-1);
            } else {
                C31575b.m65865g().updateCurFollowingCount(1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$k */
    static final class C65182k extends AbstractC89220m implements AbstractC89172b<C65170a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65171b f147089a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f147090b;

        /* renamed from: c */
        final /* synthetic */ String f147091c;

        static {
            Covode.recordClassIndex(76653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65182k(C65171b bVar, ActivityC0945e eVar, String str) {
            super(1);
            this.f147089a = bVar;
            this.f147090b = eVar;
            this.f147091c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C65170a aVar) {
            User user;
            C65170a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (this.f147090b != null) {
                C64615i iVar = (C64615i) C12801d.m23029f(this.f147089a, C89204ab.m154669a(AbstractC64616j.class));
                if (iVar != null) {
                    user = iVar.f146329a;
                } else {
                    user = null;
                }
                if (C80580in.m139698k(user) || !C80580in.m139685b(user, C80580in.m139694g(user)) || aVar2.f147067a <= 0) {
                    C39162r.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName(this.f147091c));
                    C39162r.m79460a("click_fans_count", new C33744d().mo59983a("enter_from", this.f147091c).f79943a);
                    if (user != null) {
                        FollowRelationTabActivity.C51138c.m95552a(this.f147090b, user, "follower_relation");
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$n */
    static final class View$OnClickListenerC65185n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65171b f147096a;

        static {
            Covode.recordClassIndex(76656);
        }

        View$OnClickListenerC65185n(C65171b bVar) {
            this.f147096a = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C65171b bVar = this.f147096a;
            C89219l.m154716b(view, "");
            if (!C58001a.m104815a(view, 1200)) {
                if (bVar.mo104354v()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                ActivityC0945e b = C12777b.m23004b(bVar);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!g.isLogin()) {
                    C58957c.m108318a(b, "personal_homepage", "follower_list");
                } else {
                    C65171b.m22977a(bVar.mo104355w(), new C65182k(bVar, b, str));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$o */
    static final class View$OnClickListenerC65186o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65171b f147097a;

        static {
            Covode.recordClassIndex(76657);
        }

        View$OnClickListenerC65186o(C65171b bVar) {
            this.f147097a = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C65171b bVar = this.f147097a;
            C89219l.m154716b(view, "");
            if (!C58001a.m104815a(view, 1200)) {
                if (bVar.mo104354v()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                ActivityC0945e b = C12777b.m23004b(bVar);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!g.isLogin()) {
                    C58957c.m108318a(b, "personal_homepage", "following_list");
                } else {
                    C65171b.m22977a(bVar.mo104355w(), new C65183l(bVar, b, str));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.relations.AbstractC65189d
    /* renamed from: a */
    public final void mo104352a(FollowStatus followStatus) {
        User user;
        C89219l.m154721d(followStatus, "");
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null && (user = iVar.f146329a) != null && TextUtils.equals(followStatus.userId, user.getUid()) && followStatus.followStatus != user.getFollowStatus()) {
            user.setFollowStatus(followStatus.followStatus);
            if (followStatus.followStatus == 0) {
                if (!C80580in.m139685b(user, false)) {
                    int followerCount = user.getFollowerCount() - 1;
                    user.setFollowerCount(followerCount);
                    mo104351a(followerCount);
                }
            } else if (followStatus.followStatus == 1 && !C80580in.m139685b(user, false)) {
                int followerCount2 = user.getFollowerCount() + 1;
                user.setFollowerCount(followerCount2);
                mo104351a(followerCount2);
            }
            AbstractC64616j.C64617a.m116532a((AbstractC64616j) C12801d.m23018a(this, C89204ab.m154669a(AbstractC64616j.class)), user, null, false, 6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$l */
    static final class C65183l extends AbstractC89220m implements AbstractC89172b<C65170a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65171b f147092a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f147093b;

        /* renamed from: c */
        final /* synthetic */ String f147094c;

        static {
            Covode.recordClassIndex(76654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65183l(C65171b bVar, ActivityC0945e eVar, String str) {
            super(1);
            this.f147092a = bVar;
            this.f147093b = eVar;
            this.f147094c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C65170a aVar) {
            User user;
            PrivacySetting privacySetting;
            C65170a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C64615i iVar = (C64615i) C12801d.m23029f(this.f147092a, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null) {
                user = iVar.f146329a;
            } else {
                user = null;
            }
            if (C80580in.m139698k(user) || !C80580in.m139685b(user, C80580in.m139694g(user)) || aVar2.f147068b <= 0) {
                if (user == null || (privacySetting = user.getPrivacySetting()) == null || privacySetting.getFollowingVisibility() != 2) {
                    C39162r.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName(this.f147094c));
                    C39162r.m79460a("click_follow_count", new C33744d().mo59983a("enter_from", this.f147094c).f79943a);
                    ActivityC0945e eVar = this.f147093b;
                    if (eVar != null) {
                        FollowRelationTabActivity.C51138c.m95552a(eVar, user, "following_relation");
                    }
                } else {
                    ActivityC0945e eVar2 = this.f147093b;
                    if (eVar2 != null) {
                        new C23144b(eVar2).mo37640e(R.string.evd).mo37634a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).mo37637b();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$m */
    static final class View$OnClickListenerC65184m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65171b f147095a;

        static {
            Covode.recordClassIndex(76655);
        }

        View$OnClickListenerC65184m(C65171b bVar) {
            this.f147095a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            if (r2 == null) goto L_0x005e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r14) {
            /*
            // Method dump skipped, instructions count: 168
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.relations.C65171b.View$OnClickListenerC65184m.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$p */
    static final class C65187p extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65171b f147098a;

        static {
            Covode.recordClassIndex(76658);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65187p(C65171b bVar) {
            super(1);
            this.f147098a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.assem.arch.extensions.C12776a<? extends com.p2082ss.android.ugc.aweme.profile.model.User> r11) {
            /*
            // Method dump skipped, instructions count: 163
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.relations.C65171b.C65187p.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        View view2;
        C89219l.m154721d(view, "");
        this.f147071j = (TextView) view.findViewById(R.id.b7e);
        this.f147077q = (TextView) view.findViewById(R.id.b76);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.aot);
        this.f147078r = viewGroup;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View$OnClickListenerC65184m(this));
        }
        this.f147072k = (TextView) view.findViewById(R.id.akh);
        this.f147073l = (TextView) view.findViewById(R.id.akg);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.b79);
        this.f147079s = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new View$OnClickListenerC65185n(this));
        }
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.b7h);
        this.f147080t = viewGroup3;
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new View$OnClickListenerC65186o(this));
        }
        mo104356x();
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C65188c.f147099a, new C65187p(this));
        this.f147076p = view.findViewById(R.id.dhk);
        if (C80580in.m139687c() && (view2 = this.f147076p) != null) {
            view2.setVisibility(8);
        }
    }
}
