package com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.google.p1998c.p1999a.C27241i;
import com.p2082ss.android.ugc.aweme.AbstractC34938bu;
import com.p2082ss.android.ugc.aweme.IProfileBadgeService;
import com.p2082ss.android.ugc.aweme.IProfileNaviService;
import com.p2082ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.p2082ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63806g;
import com.p2082ss.android.ugc.aweme.profile.edit.C63529g;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63354d;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.MusAvatarWithBorderView;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64312w;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63821a;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.AbstractC64868e;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3592b.C64864a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.story.C76657c;
import com.p2082ss.android.ugc.aweme.story.avatar.C76549i;
import com.p2082ss.android.ugc.aweme.story.avatar.C76587p;
import com.p2082ss.android.ugc.aweme.story.avatar.ProfileStoryRingViewModel;
import com.p2082ss.android.ugc.aweme.story.live.C77354d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a */
public final class C64776a extends AbstractC12769a implements AbstractC63852p, AbstractC64818f, AbstractC90252i, AbstractC90253j {

    /* renamed from: r */
    public static final C64809v f146543r = new C64809v((byte) 0);

    /* renamed from: j */
    final C12814b f146544j;

    /* renamed from: k */
    MusAvatarWithBorderView f146545k;

    /* renamed from: l */
    View f146546l;

    /* renamed from: m */
    AnimationImageView f146547m;

    /* renamed from: n */
    public SmartImageView f146548n;

    /* renamed from: o */
    public C63821a f146549o;

    /* renamed from: p */
    public AbstractC63806g f146550p;

    /* renamed from: q */
    public boolean f146551q;

    /* renamed from: s */
    private final C12786i f146552s = new C12786i(bW_(), new C64808u(this, null));

    /* renamed from: t */
    private UrlModel f146553t;

    /* renamed from: u */
    private final IProfileBadgeService f146554u;

    /* renamed from: v */
    private final IProfileBadgeService.AbstractC31281c f146555v;

    /* renamed from: w */
    private final AbstractC89244h f146556w;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$ai */
    public static final class C64788ai implements C53484j.AbstractC53488a {

        /* renamed from: a */
        public static final C64788ai f146571a = new C64788ai();

        static {
            Covode.recordClassIndex(76255);
        }

        C64788ai() {
        }

        @Override // com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j.AbstractC53488a
        /* renamed from: a */
        public final void mo90080a(String str) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$l */
    public static final class C64799l extends AbstractC89220m implements AbstractC89172b<C76587p, C76587p> {
        public static final C64799l INSTANCE = new C64799l();

        static {
            Covode.recordClassIndex(76266);
        }

        public C64799l() {
            super(1);
        }

        public final C76587p invoke(C76587p pVar) {
            C89219l.m154719c(pVar, "");
            return pVar;
        }
    }

    static {
        Covode.recordClassIndex(76243);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(164, new RunnableC90250g(C64776a.class, "onClickGuideCardEvent", C63354d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final AbstractC34938bu mo104224w() {
        return (AbstractC34938bu) this.f146556w.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$h */
    public static final class C64795h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146576a;

        static {
            Covode.recordClassIndex(76262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64795h(AbstractC12748a aVar) {
            super(0);
            this.f146576a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f146576a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$v */
    public static final class C64809v {
        static {
            Covode.recordClassIndex(76276);
        }

        private C64809v() {
        }

        public /* synthetic */ C64809v(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$d */
    public static final class C64791d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C64791d INSTANCE = new C64791d();

        static {
            Covode.recordClassIndex(76258);
        }

        public C64791d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$g */
    public static final class C64794g extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C64794g INSTANCE = new C64794g();

        static {
            Covode.recordClassIndex(76261);
        }

        public C64794g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$i */
    public static final class C64796i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146577a;

        static {
            Covode.recordClassIndex(76263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64796i(AbstractC12748a aVar) {
            super(0);
            this.f146577a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f146577a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$j */
    public static final class C64797j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146578a;

        static {
            Covode.recordClassIndex(76264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64797j(AbstractC12748a aVar) {
            super(0);
            this.f146578a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f146578a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$n */
    public static final class C64801n extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C64801n INSTANCE = new C64801n();

        static {
            Covode.recordClassIndex(76268);
        }

        public C64801n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$q */
    public static final class C64804q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C64804q INSTANCE = new C64804q();

        static {
            Covode.recordClassIndex(76271);
        }

        public C64804q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$t */
    public static final class C64807t extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C64807t INSTANCE = new C64807t();

        static {
            Covode.recordClassIndex(76274);
        }

        public C64807t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$aa */
    static final class View$OnClickListenerC64778aa implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64776a f146558a;

        /* renamed from: b */
        final /* synthetic */ View f146559b;

        static {
            Covode.recordClassIndex(76245);
        }

        View$OnClickListenerC64778aa(C64776a aVar, View view) {
            this.f146558a = aVar;
            this.f146559b = view;
        }

        /* renamed from: a */
        private static boolean m116636a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            User user;
            User user2;
            ClickAgent.onClick(view);
            if (C12777b.m23004b(this.f146558a) != null) {
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m116636a();
                }
                if (!C58029j.f132256h) {
                    new C23144b(this.f146559b).mo37640e(R.string.dcq).mo37637b();
                } else if (!C58001a.m104815a(this.f146559b, 1200)) {
                    C64776a aVar = this.f146558a;
                    C64615i iVar = (C64615i) C12801d.m23029f(aVar, C89204ab.m154669a(AbstractC64616j.class));
                    Object obj = null;
                    if (iVar != null) {
                        user = iVar.f146329a;
                    } else {
                        user = null;
                    }
                    String str = "personal_homepage";
                    if (aVar.f31048h && user != null) {
                        ActivityC0945e b = C12777b.m23004b(aVar);
                        if (!user.isLive()) {
                            View view2 = aVar.f146546l;
                            if (view2 == null || view2.getVisibility() != 0) {
                                C39162r.m79460a("click_profile_icon", new C33744d().mo59983a("author_id", user.getUid()).mo59983a("enter_from", str).mo59983a("enter_method", "click_head").f79943a);
                                if (C80580in.m139687c() || C39223a.m79601o().mo68703a()) {
                                    C63873h.f144797a.startHeaderDetailActivity((Activity) b, (View) aVar.f146545k, user, true);
                                } else {
                                    if (b == null) {
                                        C89219l.m154715b();
                                    }
                                    MusAvatarWithBorderView musAvatarWithBorderView = aVar.f146545k;
                                    if (musAvatarWithBorderView == null) {
                                        C89219l.m154715b();
                                    }
                                    aVar.f146550p = new C63529g(b, musAvatarWithBorderView, aVar.mo104226y().f144680b, user);
                                    AbstractC63806g gVar = aVar.f146550p;
                                    if (gVar == null) {
                                        C89219l.m154715b();
                                    }
                                    gVar.mo102190a();
                                }
                            } else {
                                aVar.mo104226y().mo103276a(b, aVar.f146545k, user);
                            }
                        }
                    }
                    SmartImageView smartImageView = this.f146558a.f146548n;
                    if (smartImageView != null && smartImageView.getVisibility() == 0) {
                        C64615i iVar2 = (C64615i) C12801d.m23029f(this.f146558a, C89204ab.m154669a(AbstractC64616j.class));
                        if (iVar2 != null) {
                            user2 = iVar2.f146329a;
                        } else {
                            user2 = null;
                        }
                        C33744d dVar = new C33744d();
                        if (!this.f146558a.mo104223v()) {
                            str = "others_homepage";
                        }
                        C33744d a = dVar.mo59983a("enter_from", str);
                        if (user2 == null || user2.getProfileBadge() == null) {
                            obj = "";
                        } else {
                            ProfileBadgeStruct profileBadge = user2.getProfileBadge();
                            if (profileBadge != null) {
                                obj = Long.valueOf(profileBadge.getId());
                            }
                        }
                        C39162r.m79460a("profile_badge_click", a.mo59982a("badge_id", obj).f79943a);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$k */
    public static final class C64798k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146579a;

        static {
            Covode.recordClassIndex(76265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64798k(AbstractC12748a aVar) {
            super(0);
            this.f146579a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f146579a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$m */
    public static final class C64800m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146580a;

        static {
            Covode.recordClassIndex(76267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64800m(AbstractC12748a aVar) {
            super(0);
            this.f146580a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f146580a.bD_().f30985g;
        }
    }

    /* renamed from: v */
    public final boolean mo104223v() {
        C64870a aVar = (C64870a) this.f146552s.getValue();
        if (aVar != null) {
            return aVar.f146660c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$a */
    public static final class C64777a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f146557a;

        static {
            Covode.recordClassIndex(76244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64777a(AbstractC89277c cVar) {
            super(0);
            this.f146557a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f146557a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$b */
    public static final class C64789b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146572a;

        static {
            Covode.recordClassIndex(76256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64789b(AbstractC12748a aVar) {
            super(0);
            this.f146572a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146572a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$c */
    public static final class C64790c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146573a;

        static {
            Covode.recordClassIndex(76257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64790c(AbstractC12748a aVar) {
            super(0);
            this.f146573a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146573a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$o */
    public static final class C64802o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146581a;

        static {
            Covode.recordClassIndex(76269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64802o(AbstractC12748a aVar) {
            super(0);
            this.f146581a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146581a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$p */
    public static final class C64803p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146582a;

        static {
            Covode.recordClassIndex(76270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64803p(AbstractC12748a aVar) {
            super(0);
            this.f146582a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146582a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$r */
    public static final class C64805r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146583a;

        static {
            Covode.recordClassIndex(76272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64805r(AbstractC12748a aVar) {
            super(0);
            this.f146583a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146583a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$s */
    public static final class C64806s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146584a;

        static {
            Covode.recordClassIndex(76273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64806s(AbstractC12748a aVar) {
            super(0);
            this.f146584a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146584a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$u */
    public static final class C64808u extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146585a;

        /* renamed from: b */
        final /* synthetic */ String f146586b;

        static {
            Covode.recordClassIndex(76275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64808u(AbstractC12748a aVar, String str) {
            super(0);
            this.f146585a = aVar;
            this.f146586b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146585a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146586b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.C64776a.C64808u.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        this.f146554u.mo57238a(this.f146555v);
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        this.f146554u.mo57240b(this.f146555v);
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$ag */
    static final class C64786ag extends AbstractC89220m implements AbstractC89171a<AbstractC34938bu> {

        /* renamed from: a */
        final /* synthetic */ C64776a f146568a;

        static {
            Covode.recordClassIndex(76253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64786ag(C64776a aVar) {
            super(0);
            this.f146568a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC34938bu invoke() {
            IProfileNaviService a;
            String str;
            ActivityC0945e b = C12777b.m23004b(this.f146568a);
            if (b == null || (a = ProfileNaviServiceImpl.m65406a()) == null) {
                return null;
            }
            if (this.f146568a.mo104223v()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            return a.mo57243a(b, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$e */
    public static final class C64792e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146574a;

        static {
            Covode.recordClassIndex(76259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64792e(AbstractC12748a aVar) {
            super(0);
            this.f146574a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146574a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$f */
    public static final class C64793f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146575a;

        static {
            Covode.recordClassIndex(76260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64793f(AbstractC12748a aVar) {
            super(0);
            this.f146575a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146575a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final C63821a mo104226y() {
        ActivityC0945e b = C12777b.m23004b(this);
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (this.f146549o == null) {
            C63821a aVar = new C63821a();
            this.f146549o = aVar;
            aVar.f144681c = this;
            C63821a aVar2 = this.f146549o;
            if (aVar2 != null) {
                aVar2.mo102165b(b, a);
            }
        }
        C63821a aVar3 = this.f146549o;
        if (aVar3 == null) {
            C89219l.m154715b();
        }
        return aVar3;
    }

    /* renamed from: x */
    public final void mo104225x() {
        MusAvatarWithBorderView musAvatarWithBorderView = this.f146545k;
        if (musAvatarWithBorderView != null && musAvatarWithBorderView.getController() != null) {
            MusAvatarWithBorderView musAvatarWithBorderView2 = this.f146545k;
            if (musAvatarWithBorderView2 == null) {
                C89219l.m154715b();
            }
            AbstractC24255a controller = musAvatarWithBorderView2.getController();
            if (controller == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(controller, "");
            Animatable i = controller.mo39821i();
            if (i == null) {
                return;
            }
            if (C63529g.C63531b.m115126a()) {
                i.stop();
                return;
            }
            C64312w wVar = (C64312w) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64313x.class));
            if (wVar == null || !wVar.f145777e) {
                if (i.isRunning()) {
                    i.stop();
                }
            } else if (!i.isRunning()) {
                i.start();
            }
        }
    }

    /* renamed from: z */
    public final void mo104227z() {
        User user;
        UrlModel avatarVideoUri;
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
            C63787p pVar = null;
            if (iVar != null) {
                user = iVar.f146329a;
            } else {
                user = null;
            }
            MusAvatarWithBorderView musAvatarWithBorderView = this.f146545k;
            if (musAvatarWithBorderView == null) {
                C89219l.m154715b();
            }
            C63821a aVar = this.f146549o;
            if (aVar != null) {
                pVar = aVar.f144680b;
            }
            C63529g gVar = new C63529g(b, musAvatarWithBorderView, pVar, user);
            if (user == null || (avatarVideoUri = user.getAvatarVideoUri()) == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
                gVar.f144184c.mo102147a();
            } else {
                new C53484j().mo90076a(b, C64788ai.f146571a);
            }
        }
    }

    public C64776a() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ProfileStoryRingViewModel.class);
        C64777a aVar = new C64777a(a);
        C64799l lVar = C64799l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C64801n.INSTANCE, new C64802o(this), new C64803p(this), C64804q.INSTANCE, lVar, new C64805r(this), new C64806s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C64807t.INSTANCE, new C64789b(this), new C64790c(this), C64791d.INSTANCE, lVar, new C64792e(this), new C64793f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C64794g.INSTANCE, new C64795h(this), new C64796i(this), new C64797j(this), lVar, new C64798k(this), new C64800m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f146544j = bVar;
        this.f146554u = ProfileBadgeServiceImpl.m67562b();
        this.f146555v = new C64813z(this);
        this.f146556w = C89250i.m154773a((AbstractC89171a) new C64786ag(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$w */
    public static final class C64810w extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C64776a f146587a;

        static {
            Covode.recordClassIndex(76277);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64810w(C64776a aVar) {
            this.f146587a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            C89219l.m154721d(str, "");
            this.f146587a.mo104225x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$x */
    public static final class C64811x extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C64776a f146588a;

        static {
            Covode.recordClassIndex(76278);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64811x(C64776a aVar) {
            this.f146588a = aVar;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(th, "");
            super.onFailure(str, th);
            this.f146588a.f146551q = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            C89219l.m154721d(str, "");
            this.f146588a.mo104225x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$y */
    public static final class C64812y extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C64776a f146589a;

        static {
            Covode.recordClassIndex(76279);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64812y(C64776a aVar) {
            this.f146589a = aVar;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(th, "");
            super.onFailure(str, th);
            this.f146589a.f146551q = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$z */
    public static final class C64813z implements IProfileBadgeService.AbstractC31281c {

        /* renamed from: a */
        final /* synthetic */ C64776a f146590a;

        static {
            Covode.recordClassIndex(76280);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64813z(C64776a aVar) {
            this.f146590a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31281c
        /* renamed from: a */
        public final void mo56081a(ProfileBadgeStruct profileBadgeStruct) {
            this.f146590a.mo104221a(profileBadgeStruct);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90040b(String str) {
        C63821a aVar = this.f146549o;
        if (aVar != null) {
            aVar.mo103275a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$ac */
    static final class C64780ac extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64776a f146561a;

        /* renamed from: b */
        final /* synthetic */ View f146562b;

        static {
            Covode.recordClassIndex(76247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64780ac(C64776a aVar, View view) {
            super(1);
            this.f146561a = aVar;
            this.f146562b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20581a(this.f146561a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) C647811.f146563a);
            assembler2.mo20582b(this.f146561a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.C64776a.C64780ac.C647822 */

                /* renamed from: a */
                final /* synthetic */ C64780ac f146564a;

                static {
                    Covode.recordClassIndex(76249);
                }

                {
                    this.f146564a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f146564a.f146562b;
                    qVar2.mo20632a(C89204ab.m154669a(C76549i.class));
                    qVar2.f31050b = new C76549i();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$ad */
    static final class C64783ad extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64776a f146565a;

        static {
            Covode.recordClassIndex(76250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64783ad(C64776a aVar) {
            super(1);
            this.f146565a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            AbstractC34938bu w;
            AbstractC34938bu w2;
            boolean booleanValue = bool.booleanValue();
            this.f146565a.mo104225x();
            if (booleanValue) {
                C64776a aVar = this.f146565a;
                if (C64864a.f146651a && (((w = aVar.mo104224w()) == null || !w.mo61823b()) && (w2 = this.f146565a.mo104224w()) != null)) {
                    w2.mo61822a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$ae */
    static final class C64784ae extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89378p<? extends Exception, ? extends Integer>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64776a f146566a;

        static {
            Covode.recordClassIndex(76251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64784ae(C64776a aVar) {
            super(1);
            this.f146566a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89378p<? extends Exception, ? extends Integer>> aVar) {
            C12776a<? extends C89378p<? extends Exception, ? extends Integer>> aVar2 = aVar;
            if (aVar2 != null) {
                T t = aVar2.f31085a;
                Exception exc = (Exception) t.component1();
                ((Number) t.component2()).intValue();
                C63821a aVar3 = this.f146566a.f146549o;
                if (aVar3 != null) {
                    aVar3.mo103277d();
                }
                C33615a.m68848a(this.f146566a.az_(), (Throwable) exc, (int) R.string.ewo);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90038b(AvatarUri avatarUri) {
        if (az_() != null) {
            C63821a aVar = this.f146549o;
            if (aVar != null) {
                aVar.mo103277d();
            }
            if (avatarUri == null) {
                new C79459a(az_()).mo123050a(R.string.nd).mo123053a();
                return;
            }
            AbstractC64868e eVar = (AbstractC64868e) C12801d.m23025c(this, C89204ab.m154669a(AbstractC64868e.class));
            if (eVar != null) {
                eVar.mo104215b(avatarUri.uri);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$ab */
    static final class C64779ab extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89386u<? extends Integer, ? extends Integer, ? extends Intent>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64776a f146560a;

        static {
            Covode.recordClassIndex(76246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64779ab(C64776a aVar) {
            super(1);
            this.f146560a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89386u<? extends Integer, ? extends Integer, ? extends Intent>> aVar) {
            C63821a aVar2;
            C12776a<? extends C89386u<? extends Integer, ? extends Integer, ? extends Intent>> aVar3 = aVar;
            if (aVar3 != null) {
                T t = aVar3.f31085a;
                int intValue = ((Number) t.component1()).intValue();
                int intValue2 = ((Number) t.component2()).intValue();
                Intent intent = (Intent) t.component3();
                if (intValue == 10002 && intent != null) {
                    Serializable serializableExtra = intent.getSerializableExtra("path");
                    if (!(serializableExtra instanceof UrlModel)) {
                        serializableExtra = null;
                    }
                    UrlModel urlModel = (UrlModel) serializableExtra;
                    if (urlModel != null) {
                        this.f146560a.mo104220a(urlModel);
                        AbstractC63806g gVar = this.f146560a.f146550p;
                        if (gVar != null) {
                            gVar.mo102191a(urlModel);
                        }
                    }
                } else if (!(this.f146560a.f146549o == null || (aVar2 = this.f146560a.f146549o) == null)) {
                    aVar2.mo102163a(intValue, intValue2, intent);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r0 == null) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104221a(com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r4) {
        /*
            r3 = this;
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L_0x0010
            java.lang.String r0 = r4.getUrl()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0022
        L_0x0010:
            boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80580in.m139687c()
            if (r0 != 0) goto L_0x0018
            if (r1 == 0) goto L_0x002e
        L_0x0018:
            com.bytedance.lighten.loader.SmartImageView r1 = r3.f146548n
            if (r1 == 0) goto L_0x0021
            r0 = 8
            r1.setVisibility(r0)
        L_0x0021:
            return
        L_0x0022:
            r4.getShouldShow()
            boolean r0 = r4.getShouldShow()
            if (r0 != 0) goto L_0x002c
            goto L_0x0010
        L_0x002c:
            r1 = 0
            goto L_0x0010
        L_0x002e:
            if (r4 == 0) goto L_0x0052
            java.lang.String r0 = r4.getUrl()
            if (r0 != 0) goto L_0x0039
        L_0x0036:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0039:
            com.bytedance.lighten.a.v r1 = com.bytedance.lighten.p1477a.C20761r.m39061a(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r3.f146548n
            r1.f49092E = r0
            java.lang.String r0 = "ProfileWidgetProfileFragment"
            com.bytedance.lighten.a.v r0 = r1.mo34179a(r0)
            r0.mo34186c()
            com.bytedance.lighten.loader.SmartImageView r0 = r3.f146548n
            if (r0 == 0) goto L_0x0051
            r0.setVisibility(r2)
        L_0x0051:
            return
        L_0x0052:
            r0 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.C64776a.mo104221a(com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90039b(Exception exc) {
        C63821a aVar = this.f146549o;
        if (aVar != null) {
            aVar.mo103277d();
        }
        if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 20022) {
            C39161q.m79447a(az_(), "profile_image_setting", "review_failure");
        }
        C33615a.m68848a(az_(), (Throwable) exc, (int) R.string.nd);
    }

    @AbstractC90264r
    public final void onClickGuideCardEvent(C63354d dVar) {
        C63787p pVar;
        File a;
        if (dVar != null && dVar.f143850a == 1 && az_() != null) {
            mo104226y();
            String[] strArr = new String[2];
            Context az_ = az_();
            if (az_ == null) {
                C89219l.m154715b();
            }
            strArr[0] = az_.getString(R.string.ab1);
            Context az_2 = az_();
            if (az_2 == null) {
                C89219l.m154715b();
            }
            strArr[1] = az_2.getString(R.string.ab2);
            if (C63786o.m115349a()) {
                mo104227z();
                return;
            }
            C63821a aVar = this.f146549o;
            String str = null;
            if (!(aVar == null || (pVar = aVar.f144680b) == null || (a = pVar.mo102345a("head")) == null)) {
                str = a.getPath();
            }
            new DialogC18267b.C18268a(az_()).mo29155a(strArr, new DialogInterface$OnClickListenerC64787ah(this, str)).mo29157b().show();
        }
    }

    /* renamed from: a */
    public final void mo104220a(UrlModel urlModel) {
        List<String> urlList;
        boolean z;
        List<String> urlList2;
        User user = null;
        if (C62845i.m113257a()) {
            if (this.f31048h) {
                C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
                if (iVar != null) {
                    user = iVar.f146329a;
                }
                C64312w wVar = (C64312w) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64313x.class));
                if (wVar != null) {
                    z = wVar.f145777e;
                } else {
                    z = false;
                }
                if (urlModel != null && user != null && !this.f146551q && z) {
                    UrlModel avatarVideoUri = user.getAvatarVideoUri();
                    if (avatarVideoUri == null || (urlList2 = avatarVideoUri.getUrlList()) == null || urlList2.isEmpty()) {
                        this.f146553t = urlModel;
                        C34577e.m70596a(this.f146545k, urlModel, new C64812y(this));
                    } else if (!mo104223v() || !C27241i.m54222a(this.f146553t, avatarVideoUri)) {
                        C34577e.m70597a((RemoteImageView) this.f146545k, avatarVideoUri, (AbstractC24203d<AbstractC24457f>) new C64811x(this), false);
                        this.f146553t = avatarVideoUri;
                    }
                    this.f146551q = true;
                }
            }
        } else if (this.f31048h) {
            C64615i iVar2 = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar2 != null) {
                user = iVar2.f146329a;
            }
            if (!(urlModel == null || user == null)) {
                UrlModel avatarVideoUri2 = user.getAvatarVideoUri();
                if (avatarVideoUri2 == null || (urlList = avatarVideoUri2.getUrlList()) == null || urlList.isEmpty()) {
                    this.f146553t = urlModel;
                    C34577e.m70592a(this.f146545k, urlModel);
                } else if (!mo104223v() || !C27241i.m54222a(this.f146553t, avatarVideoUri2)) {
                    C34577e.m70597a((RemoteImageView) this.f146545k, avatarVideoUri2, (AbstractC24203d<AbstractC24457f>) new C64810w(this), false);
                    this.f146553t = avatarVideoUri2;
                }
            }
        }
        View view = this.f146546l;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        this.f146546l = view.findViewById(R.id.ctr);
        MusAvatarWithBorderView musAvatarWithBorderView = (MusAvatarWithBorderView) view.findViewById(R.id.be7);
        this.f146545k = musAvatarWithBorderView;
        if (musAvatarWithBorderView != null) {
            ((CircleImageView) musAvatarWithBorderView).f81868f = true;
        }
        MusAvatarWithBorderView musAvatarWithBorderView2 = this.f146545k;
        if (musAvatarWithBorderView2 != null) {
            musAvatarWithBorderView2.setBorderColor(R.color.j);
        }
        MusAvatarWithBorderView musAvatarWithBorderView3 = this.f146545k;
        if (musAvatarWithBorderView3 != null) {
            musAvatarWithBorderView3.setOnClickListener(new View$OnClickListenerC64778aa(this, view));
        }
        this.f146547m = (AnimationImageView) view.findViewById(R.id.hv);
        this.f146548n = (SmartImageView) view.findViewById(R.id.d9u);
        C12780d.m23007a(this, new C64780ac(this, view));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64814b.f146591a, new C64783ad(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64868e.class), C64815c.f146592a, new C64784ae(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64816d.f146593a, new C64785af(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64817e.f146594a, new C64779ab(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$af */
    static final class C64785af extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64776a f146567a;

        static {
            Covode.recordClassIndex(76252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64785af(C64776a aVar) {
            super(1);
            this.f146567a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            ProfileBadgeStruct profileBadge;
            Long l;
            User user;
            String str;
            long j;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                C64776a aVar3 = this.f146567a;
                boolean isLive = t.isLive();
                if (aVar3.f146547m != null) {
                    C64615i iVar = (C64615i) C12801d.m23029f(aVar3, C89204ab.m154669a(AbstractC64616j.class));
                    String str2 = null;
                    if (iVar != null) {
                        user = iVar.f146329a;
                    } else {
                        user = null;
                    }
                    if (!isLive || !C76657c.m134240a()) {
                        MusAvatarWithBorderView musAvatarWithBorderView = aVar3.f146545k;
                        if (musAvatarWithBorderView != null) {
                            musAvatarWithBorderView.setBorderColor(R.color.l);
                        }
                        AnimationImageView animationImageView = aVar3.f146547m;
                        if (animationImageView != null) {
                            animationImageView.mo5836d();
                        }
                        AnimationImageView animationImageView2 = aVar3.f146547m;
                        if (animationImageView2 != null) {
                            animationImageView2.setVisibility(8);
                        }
                    } else {
                        aVar3.az_();
                        if (user != null) {
                            str = user.getRequestId();
                            str2 = user.getUid();
                        } else {
                            str = null;
                        }
                        if (user != null) {
                            j = user.roomId;
                        } else {
                            j = -1;
                        }
                        C77354d.m135263a(true, 0, str, str2, j);
                        MusAvatarWithBorderView musAvatarWithBorderView2 = aVar3.f146545k;
                        if (musAvatarWithBorderView2 != null) {
                            musAvatarWithBorderView2.setBorderColor(R.color.bh);
                        }
                        MusAvatarWithBorderView musAvatarWithBorderView3 = aVar3.f146545k;
                        if (musAvatarWithBorderView3 != null) {
                            musAvatarWithBorderView3.setBorderWidth(2);
                        }
                        AnimationImageView animationImageView3 = aVar3.f146547m;
                        if (animationImageView3 != null) {
                            animationImageView3.setVisibility(0);
                        }
                        AnimationImageView animationImageView4 = aVar3.f146547m;
                        if (animationImageView4 != null) {
                            animationImageView4.setAnimation("tag_profile_live.json");
                        }
                        AnimationImageView animationImageView5 = aVar3.f146547m;
                        if (animationImageView5 != null) {
                            animationImageView5.mo5826a();
                        }
                    }
                    ((ProfileStoryRingViewModel) aVar3.f146544j.getValue()).mo120227a("live");
                }
                this.f146567a.mo104221a(t.getProfileBadge());
                if (!(t.getProfileBadge() == null || (profileBadge = t.getProfileBadge()) == null || !profileBadge.getShouldShow())) {
                    C33744d a = new C33744d().mo59983a("enter_from", "personal_homepage");
                    ProfileBadgeStruct profileBadge2 = t.getProfileBadge();
                    if (profileBadge2 != null) {
                        l = Long.valueOf(profileBadge2.getId());
                    } else {
                        l = "";
                    }
                    C39162r.m79460a("profile_badge_show", a.mo59982a("badge_id", l).mo59983a("group_id", "").mo59983a("author_id", "").f79943a);
                }
                this.f146567a.f146551q = false;
                this.f146567a.mo104220a(C80630u.m139797a(t));
                if (this.f146567a.f146550p != null) {
                    AbstractC63806g gVar = this.f146567a.f146550p;
                    if (gVar == null) {
                        C89219l.m154715b();
                    }
                    gVar.mo102192a((User) t);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$ah */
    static final class DialogInterface$OnClickListenerC64787ah implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64776a f146569a;

        /* renamed from: b */
        final /* synthetic */ String f146570b;

        static {
            Covode.recordClassIndex(76254);
        }

        DialogInterface$OnClickListenerC64787ah(C64776a aVar, String str) {
            this.f146569a = aVar;
            this.f146570b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C63787p pVar;
            if (TextUtils.isEmpty(this.f146570b)) {
                new C79459a(this.f146569a.az_()).mo123050a(R.string.feu).mo123053a();
                C51423a.m95790a((Throwable) new Exception("SD card is not available"));
            } else if (i == 0) {
                C63821a aVar = this.f146569a.f146549o;
                if (aVar != null && (pVar = aVar.f144680b) != null) {
                    pVar.mo102355e(0);
                }
            } else if (i == 1) {
                this.f146569a.mo104227z();
            }
        }
    }
}
