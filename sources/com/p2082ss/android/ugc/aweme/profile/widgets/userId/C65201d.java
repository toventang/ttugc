package com.p2082ss.android.ugc.aweme.profile.widgets.userId;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
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
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.C46993gt;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63771aj;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64312w;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d */
public final class C65201d extends AbstractC12769a {

    /* renamed from: n */
    public static final C65211j f147116n = new C65211j((byte) 0);

    /* renamed from: j */
    public TextView f147117j;

    /* renamed from: k */
    public AbstractC17256a f147118k;

    /* renamed from: l */
    public boolean f147119l;

    /* renamed from: m */
    boolean f147120m;

    /* renamed from: o */
    private final C12786i f147121o = new C12786i(bW_(), new C65210i(this, null));

    /* renamed from: p */
    private final C12814b f147122p;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$b */
    public static final class C65203b extends AbstractC89220m implements AbstractC89172b<C65197a, C65197a> {
        public static final C65203b INSTANCE = new C65203b();

        static {
            Covode.recordClassIndex(76676);
        }

        public C65203b() {
            super(1);
        }

        public final C65197a invoke(C65197a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(76674);
    }

    /* renamed from: w */
    public final MyProfileUserIdVM mo104376w() {
        return (MyProfileUserIdVM) this.f147122p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$d */
    public static final class C65205d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147124a;

        static {
            Covode.recordClassIndex(76678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65205d(AbstractC12748a aVar) {
            super(0);
            this.f147124a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f147124a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$j */
    public static final class C65211j {
        static {
            Covode.recordClassIndex(76684);
        }

        private C65211j() {
        }

        public /* synthetic */ C65211j(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$c */
    public static final class C65204c extends AbstractC89220m implements AbstractC89171a<C12874b<C65197a>> {
        public static final C65204c INSTANCE = new C65204c();

        static {
            Covode.recordClassIndex(76677);
        }

        public C65204c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C65197a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$e */
    public static final class C65206e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147125a;

        static {
            Covode.recordClassIndex(76679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65206e(AbstractC12748a aVar) {
            super(0);
            this.f147125a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f147125a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$f */
    public static final class C65207f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147126a;

        static {
            Covode.recordClassIndex(76680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65207f(AbstractC12748a aVar) {
            super(0);
            this.f147126a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f147126a.mo20598q();
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: l */
    public final void mo20537l() {
        super.mo20537l();
        this.f147119l = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$g */
    public static final class C65208g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147127a;

        static {
            Covode.recordClassIndex(76681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65208g(AbstractC12748a aVar) {
            super(0);
            this.f147127a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f147127a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$h */
    public static final class C65209h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147128a;

        static {
            Covode.recordClassIndex(76682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65209h(AbstractC12748a aVar) {
            super(0);
            this.f147128a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f147128a.bD_().f30985g;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo104375v() {
        C64870a aVar = (C64870a) this.f147121o.getValue();
        if (aVar != null) {
            return aVar.f146660c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$a */
    public static final class C65202a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f147123a;

        static {
            Covode.recordClassIndex(76675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65202a(AbstractC89277c cVar) {
            super(0);
            this.f147123a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f147123a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$i */
    public static final class C65210i extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147129a;

        /* renamed from: b */
        final /* synthetic */ String f147130b;

        static {
            Covode.recordClassIndex(76683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65210i(AbstractC12748a aVar, String str) {
            super(0);
            this.f147129a = aVar;
            this.f147130b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f147129a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f147130b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.userId.C65201d.C65210i.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        super.mo20525j();
        this.f147119l = true;
        this.f147120m = C39223a.m79589c().mo68606a(4);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$k */
    static final class RunnableC65212k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C65201d f147131a;

        /* renamed from: b */
        final /* synthetic */ User f147132b;

        static {
            Covode.recordClassIndex(76685);
        }

        RunnableC65212k(C65201d dVar, User user) {
            this.f147131a = dVar;
            this.f147132b = user;
        }

        public final void run() {
            int i;
            C65201d dVar = this.f147131a;
            User user = this.f147132b;
            if (!C80580in.m139687c() && dVar.f147117j != null && !dVar.f147120m) {
                ActivityC0945e b = C12777b.m23004b(dVar);
                if (user != null && !TextUtils.isEmpty(user.getUid())) {
                    if (b == null || !b.isFinishing()) {
                        String uid = user.getUid();
                        C89219l.m154716b(uid, "");
                        C89219l.m154721d(uid, "");
                        long a = C46993gt.f109502a.mo61049a("last_time_show_change_username_bubble_".concat(String.valueOf(uid)));
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C16048b.m29633a().mo25412a(true, "username_modify_tip_interval", 1) == 1) {
                            i = 168;
                        } else if (C16048b.m29633a().mo25412a(true, "username_modify_tip_interval", 1) == 2) {
                            i = 72;
                        } else {
                            i = 24;
                        }
                        C65201d.m22977a(dVar.mo104376w(), new C65216o(dVar, currentTimeMillis, a, i, user));
                    }
                }
            }
        }
    }

    public C65201d() {
        AbstractC89277c a = C89204ab.m154669a(MyProfileUserIdVM.class);
        this.f147122p = new C12814b(a, new C65202a(a), C65204c.INSTANCE, new C65205d(this), new C65206e(this), new C65207f(this), C65203b.INSTANCE, new C65208g(this), new C65209h(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$n */
    static final class C65215n extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65201d f147135a;

        static {
            Covode.recordClassIndex(76688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65215n(C65201d dVar) {
            super(1);
            this.f147135a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            AbstractC17256a aVar = this.f147135a.f147118k;
            if (aVar != null) {
                aVar.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104372a(User user) {
        if (this.f147117j != null && user != null) {
            C80581io.m139703a(az_(), new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), null), this.f147117j);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        if (!(view instanceof TextView)) {
            view = null;
        }
        TextView textView = (TextView) view;
        this.f147117j = textView;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.f147117j;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC65213l(this));
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C65219e.f147144a, new C65214m(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C65220f.f147145a, new C65215n(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104373a(String str) {
        Context az_ = az_();
        if (az_ != null) {
            try {
                C80228av.m139063a("user_id", str, az_, PrivacyCert.Builder.Companion.with("bpea-108").usage("TikTok user can share user name or profile link to others. When username is clicked in user profile page, username is copied. In profile editing page, user's profile link can also be copied.").tag("clickToCopyUsername").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                while (az_ != null) {
                    if (az_ instanceof Activity) {
                        Activity activity = (Activity) az_;
                        if (activity != null) {
                            new C23144b(activity).mo37640e(R.string.agh).mo37637b();
                            return;
                        }
                        return;
                    } else if (az_ instanceof ContextWrapper) {
                        az_ = ((ContextWrapper) az_).getBaseContext();
                    } else {
                        return;
                    }
                }
            } catch (SecurityException e) {
                C51423a.m95788a("", e);
            } catch (C13340a e2) {
                C51423a.m95788a("", e2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$l */
    static final class View$OnClickListenerC65213l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65201d f147133a;

        static {
            Covode.recordClassIndex(76686);
        }

        View$OnClickListenerC65213l(C65201d dVar) {
            this.f147133a = dVar;
        }

        public final void onClick(View view) {
            User user;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                C65201d dVar = this.f147133a;
                C64615i iVar = (C64615i) C12801d.m23029f(dVar, C89204ab.m154669a(AbstractC64616j.class));
                if (iVar != null) {
                    user = iVar.f146329a;
                } else {
                    user = null;
                }
                if (!dVar.mo104375v()) {
                    String b = C80580in.m139684b(user);
                    C89219l.m154716b(b, "");
                    dVar.mo104373a(b);
                } else if (dVar.f147120m || (C46993gt.m90271a() && (user == null || !user.nicknameUpdateReminder()))) {
                    String b2 = C80580in.m139684b(user);
                    C89219l.m154716b(b2, "");
                    dVar.mo104373a(b2);
                } else {
                    C39162r.m79460a("enter_profile_username", new C33744d().mo59983a("enter_method", "click_edit_username").f79943a);
                    Bundle bundle = new C80222ap().mo123646a("need_focus_id_input", 1).f179700a;
                    if (dVar.az_() == null) {
                        return;
                    }
                    if (C80580in.m139687c()) {
                        C79459a aVar = new C79459a(dVar.az_());
                        Context az_ = dVar.az_();
                        if (az_ == null) {
                            C89219l.m154715b();
                        }
                        aVar.mo123052a(az_.getString(R.string.acx)).mo123053a();
                        return;
                    }
                    SmartRoute buildRoute = SmartRouter.buildRoute(dVar.az_(), "aweme://profile_edit");
                    C89219l.m154716b(buildRoute, "");
                    if (bundle != null) {
                        buildRoute.withParam(bundle);
                    }
                    buildRoute.open();
                    SharePrefCache inst = SharePrefCache.inst();
                    C89219l.m154716b(inst, "");
                    C33594aj<Boolean> isProfileBubbleShown = inst.getIsProfileBubbleShown();
                    C89219l.m154716b(isProfileBubbleShown, "");
                    isProfileBubbleShown.mo59940b(false);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo104374b(User user) {
        String uniqueId;
        CharSequence charSequence;
        if (az_() != null && user != null) {
            if (TextUtils.isEmpty(user.getUniqueId())) {
                uniqueId = user.getShortId();
            } else {
                uniqueId = user.getUniqueId();
            }
            String concat = "@".concat(String.valueOf(uniqueId));
            TextView textView = this.f147117j;
            if (textView != null) {
                textView.setText(concat);
            }
            mo104372a(user);
            if (this.f147120m || (C46993gt.m90271a() && (user.isSecret() || !user.nicknameUpdateReminder()))) {
                TextView textView2 = this.f147117j;
                if (textView2 != null) {
                    Context az_ = az_();
                    if (az_ == null) {
                        C89219l.m154715b();
                    }
                    textView2.setTextColor(C0643b.m2378c(az_, R.color.us));
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TextView textView3 = this.f147117j;
            if (textView3 != null) {
                charSequence = textView3.getText();
            } else {
                charSequence = null;
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((CharSequence) " T");
            spannableStringBuilder.setSpan(new C63771aj(az_(), 2131233386), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
            TextView textView4 = this.f147117j;
            if (textView4 != null) {
                textView4.setText(spannableStringBuilder);
            }
            TextView textView5 = this.f147117j;
            if (textView5 != null) {
                Context az_2 = az_();
                if (az_2 == null) {
                    C89219l.m154715b();
                }
                textView5.setTextColor(C0643b.m2378c(az_2, R.color.ut));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$m */
    static final class C65214m extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65201d f147134a;

        static {
            Covode.recordClassIndex(76687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65214m(C65201d dVar) {
            super(1);
            this.f147134a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            String uniqueId;
            CharSequence charSequence;
            C12776a<? extends User> aVar2 = aVar;
            if (aVar2 != null) {
                t = aVar2.f31085a;
            } else {
                t = null;
            }
            C65201d dVar = this.f147134a;
            if (t != null) {
                if (t.isAdVirtual()) {
                    uniqueId = t.getNickname();
                } else if (TextUtils.isEmpty(t.getUniqueId())) {
                    uniqueId = t.getShortId();
                } else {
                    uniqueId = t.getUniqueId();
                }
                if (dVar.mo104375v()) {
                    if (!(uniqueId == null || uniqueId.length() == 0)) {
                        TextView textView = dVar.f147117j;
                        if (textView != null) {
                            textView.setText("@".concat(String.valueOf(uniqueId)));
                        }
                        dVar.mo104372a((User) t);
                        if (!(dVar.az_() == null || dVar.f147117j == null)) {
                            if (dVar.f147120m || (C46993gt.m90271a() && (t.isSecret() || !t.nicknameUpdateReminder()))) {
                                TextView textView2 = dVar.f147117j;
                                if (textView2 != null) {
                                    Context az_ = dVar.az_();
                                    if (az_ == null) {
                                        C89219l.m154715b();
                                    }
                                    Resources resources = az_.getResources();
                                    if (resources == null) {
                                        C89219l.m154715b();
                                    }
                                    textView2.setTextColor(resources.getColor(R.color.us));
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                TextView textView3 = dVar.f147117j;
                                if (textView3 != null) {
                                    charSequence = textView3.getText();
                                } else {
                                    charSequence = null;
                                }
                                spannableStringBuilder.append(charSequence);
                                spannableStringBuilder.append((CharSequence) " T");
                                spannableStringBuilder.setSpan(new C63771aj(dVar.az_(), 2131233385), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
                                TextView textView4 = dVar.f147117j;
                                if (textView4 != null) {
                                    textView4.setText(spannableStringBuilder);
                                }
                                TextView textView5 = dVar.f147117j;
                                if (textView5 != null) {
                                    Context az_2 = dVar.az_();
                                    if (az_2 == null) {
                                        C89219l.m154715b();
                                    }
                                    Resources resources2 = az_2.getResources();
                                    if (resources2 == null) {
                                        C89219l.m154715b();
                                    }
                                    textView5.setTextColor(resources2.getColor(R.color.ut));
                                }
                            }
                        }
                        if (!dVar.f147120m && (!C46993gt.m90271a() || t.nicknameUpdateReminder())) {
                            if (t.nicknameUpdateReminder()) {
                                new Handler().post(new RunnableC65212k(dVar, t));
                            } else {
                                dVar.mo104374b((User) t);
                                C64312w wVar = (C64312w) C12801d.m23029f(dVar, C89204ab.m154669a(AbstractC64313x.class));
                                if (wVar != null && wVar.f145777e && dVar.f147119l) {
                                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).tryShowIllegalUsernameDialog("profile", null, null);
                                }
                            }
                        }
                    }
                } else if (!(uniqueId == null || uniqueId.length() == 0)) {
                    TextView textView6 = dVar.f147117j;
                    if (textView6 != null) {
                        textView6.setText("@".concat(String.valueOf(uniqueId)));
                    }
                    C80581io.m139704a(dVar.az_(), t.getCustomVerify(), t.getEnterpriseVerifyReason(), dVar.f147117j);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$o */
    static final class C65216o extends AbstractC89220m implements AbstractC89172b<C65197a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65201d f147136a;

        /* renamed from: b */
        final /* synthetic */ long f147137b;

        /* renamed from: c */
        final /* synthetic */ long f147138c;

        /* renamed from: d */
        final /* synthetic */ int f147139d;

        /* renamed from: e */
        final /* synthetic */ int f147140e = 1;

        /* renamed from: f */
        final /* synthetic */ User f147141f;

        static {
            Covode.recordClassIndex(76689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65216o(C65201d dVar, long j, long j2, int i, User user) {
            super(1);
            this.f147136a = dVar;
            this.f147137b = j;
            this.f147138c = j2;
            this.f147139d = i;
            this.f147141f = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C65197a aVar) {
            int i;
            C65197a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (this.f147136a.az_() != null) {
                if (this.f147137b - this.f147138c > ((long) (this.f147139d * 3600000))) {
                    C64312w wVar = (C64312w) C12801d.m23029f(this.f147136a, C89204ab.m154669a(AbstractC64313x.class));
                    if (wVar == null || !wVar.f145777e || !this.f147136a.f147119l) {
                        AbstractC17256a aVar3 = this.f147136a.f147118k;
                        if (aVar3 != null) {
                            aVar3.dismiss();
                        }
                    } else {
                        if (this.f147140e == 1) {
                            i = R.string.aag;
                        } else {
                            i = R.string.aan;
                        }
                        TextView textView = this.f147136a.f147117j;
                        if (textView == null) {
                            C89219l.m154715b();
                        }
                        float x = textView.getX();
                        TextView textView2 = this.f147136a.f147117j;
                        if (textView2 == null) {
                            C89219l.m154715b();
                        }
                        float width = x + ((float) textView2.getWidth());
                        TextView textView3 = this.f147136a.f147117j;
                        if (textView3 == null) {
                            C89219l.m154715b();
                        }
                        float height = width - ((float) (textView3.getHeight() / 2));
                        TextView textView4 = this.f147136a.f147117j;
                        if (textView4 == null) {
                            C89219l.m154715b();
                        }
                        float x2 = textView4.getX();
                        TextView textView5 = this.f147136a.f147117j;
                        if (textView5 == null) {
                            C89219l.m154715b();
                        }
                        float width2 = height - ((x2 + ((float) textView5.getWidth())) / 2.0f);
                        if (this.f147136a.f147118k == null || !aVar2.f147111a) {
                            C65201d dVar = this.f147136a;
                            Context az_ = this.f147136a.az_();
                            if (az_ == null) {
                                C89219l.m154715b();
                            }
                            C17257b bVar = new C17257b(az_);
                            TextView textView6 = this.f147136a.f147117j;
                            if (textView6 == null) {
                                C89219l.m154715b();
                            }
                            C17257b b = bVar.mo27354a(textView6).mo27358b(80);
                            b.f41226a.f41241j = (int) width2;
                            dVar.f147118k = b.mo27351a(i).mo27350a();
                            AbstractC17256a aVar4 = this.f147136a.f147118k;
                            if (aVar4 != null) {
                                aVar4.mo27342a(new C17257b.AbstractC17259b(this) {
                                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.userId.C65201d.C65216o.C652171 */

                                    /* renamed from: a */
                                    final /* synthetic */ C65216o f147142a;

                                    static {
                                        Covode.recordClassIndex(76690);
                                    }

                                    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.C17257b.AbstractC17259b
                                    /* renamed from: a */
                                    public final void mo27360a() {
                                        int i;
                                        boolean z;
                                        TextView textView = this.f147142a.f147136a.f147117j;
                                        if (textView == null) {
                                            C89219l.m154715b();
                                        }
                                        String obj = textView.getText().toString();
                                        int length = obj.length() - 1;
                                        int i2 = 0;
                                        boolean z2 = false;
                                        while (i2 <= length) {
                                            if (!z2) {
                                                i = i2;
                                            } else {
                                                i = length;
                                            }
                                            if (C89219l.m154703a(obj.charAt(i), 32) <= 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z2) {
                                                if (!z) {
                                                    break;
                                                }
                                                length--;
                                            } else if (!z) {
                                                z2 = true;
                                            } else {
                                                i2++;
                                            }
                                        }
                                        String obj2 = obj.subSequence(i2, length + 1).toString();
                                        if (!TextUtils.isEmpty(obj2) && C89361p.m154876c(obj2, " T", false)) {
                                            C89361p.m154888a((CharSequence) obj2, " T", 0, false, 6);
                                            this.f147142a.f147136a.mo104374b(this.f147142a.f147141f);
                                        }
                                        this.f147142a.f147136a.mo104376w().mo104364a(false);
                                    }

                                    /* JADX WARN: Incorrect args count in method signature: ()V */
                                    {
                                        this.f147142a = r1;
                                    }
                                });
                            }
                            AbstractC17256a aVar5 = this.f147136a.f147118k;
                            if (aVar5 != null) {
                                aVar5.mo27343a(new C17257b.AbstractC17260c(this) {
                                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.userId.C65201d.C65216o.C652182 */

                                    /* renamed from: a */
                                    final /* synthetic */ C65216o f147143a;

                                    static {
                                        Covode.recordClassIndex(76691);
                                    }

                                    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.C17257b.AbstractC17260c
                                    /* renamed from: a */
                                    public final void mo27361a() {
                                        this.f147143a.f147136a.mo104376w().mo104364a(true);
                                    }

                                    /* JADX WARN: Incorrect args count in method signature: ()V */
                                    {
                                        this.f147143a = r1;
                                    }
                                });
                            }
                        }
                        AbstractC17256a aVar6 = this.f147136a.f147118k;
                        if (aVar6 != null) {
                            aVar6.mo27341a();
                        }
                        String uid = this.f147141f.getUid();
                        C89219l.m154716b(uid, "");
                        long j = this.f147137b;
                        C89219l.m154721d(uid, "");
                        C46993gt.f109502a.mo61053a("last_time_show_change_username_bubble_".concat(String.valueOf(uid)), j);
                    }
                } else if (this.f147136a.f147118k == null || !aVar2.f147111a) {
                    this.f147136a.mo104374b(this.f147141f);
                }
            }
            return C89391z.f203057a;
        }
    }
}
