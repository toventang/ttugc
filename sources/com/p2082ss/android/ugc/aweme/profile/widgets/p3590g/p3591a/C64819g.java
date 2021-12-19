package com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
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
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.AbstractC34938bu;
import com.p2082ss.android.ugc.aweme.IProfileBadgeService;
import com.p2082ss.android.ugc.aweme.IProfileNaviService;
import com.p2082ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.p2082ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46934fk;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.profile.edit.C63529g;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.MusAvatarWithBorderView;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.service.C63866a;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.EnumC64592g;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64716c;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3592b.C64864a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b;
import com.p2082ss.android.ugc.aweme.story.C76657c;
import com.p2082ss.android.ugc.aweme.story.avatar.C76549i;
import com.p2082ss.android.ugc.aweme.story.avatar.C76587p;
import com.p2082ss.android.ugc.aweme.story.avatar.ProfileStoryRingViewModel;
import com.p2082ss.android.ugc.aweme.story.live.C77354d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
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
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g */
public final class C64819g extends AbstractC12769a implements AbstractC64862l, AbstractC90252i, AbstractC90253j {

    /* renamed from: o */
    public static final C64854w f146595o = new C64854w((byte) 0);

    /* renamed from: j */
    final C12786i f146596j = new C12786i(bW_(), new C64853v(this, null));

    /* renamed from: k */
    MusAvatarWithBorderView f146597k;

    /* renamed from: l */
    public SmartImageView f146598l;

    /* renamed from: m */
    public LiveCircleView f146599m;

    /* renamed from: n */
    public TextView f146600n;

    /* renamed from: p */
    private final C12786i f146601p = new C12786i(bW_(), new C64852u(this, null));

    /* renamed from: q */
    private final C12814b f146602q;

    /* renamed from: r */
    private AnimationImageView f146603r;

    /* renamed from: s */
    private C50196d f146604s;

    /* renamed from: t */
    private UrlModel f146605t;

    /* renamed from: u */
    private final IProfileBadgeService f146606u;

    /* renamed from: v */
    private final IProfileBadgeService.AbstractC31281c f146607v;

    /* renamed from: w */
    private final AbstractC89244h f146608w;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$l */
    public static final class C64843l extends AbstractC89220m implements AbstractC89172b<C76587p, C76587p> {
        public static final C64843l INSTANCE = new C64843l();

        static {
            Covode.recordClassIndex(76310);
        }

        public C64843l() {
            super(1);
        }

        public final C76587p invoke(C76587p pVar) {
            C89219l.m154719c(pVar, "");
            return pVar;
        }
    }

    static {
        Covode.recordClassIndex(76286);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(9, new RunnableC90250g(C64819g.class, "onLiveStatusEvent", C2954a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final AbstractC34938bu mo104236v() {
        return (AbstractC34938bu) this.f146608w.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$h */
    public static final class C64839h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146632a;

        static {
            Covode.recordClassIndex(76306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64839h(AbstractC12748a aVar) {
            super(0);
            this.f146632a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f146632a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$w */
    public static final class C64854w {
        static {
            Covode.recordClassIndex(76321);
        }

        private C64854w() {
        }

        public /* synthetic */ C64854w(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$x */
    public static final class C64855x implements AbstractC38694bo {
        static {
            Covode.recordClassIndex(76322);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo
        /* renamed from: a */
        public final void mo67267a() {
        }

        C64855x() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$z */
    public static final class C64857z extends C24202c<AbstractC24457f> {
        static {
            Covode.recordClassIndex(76324);
        }

        C64857z() {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(th, "");
            super.onFailure(str, th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$d */
    public static final class C64835d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C64835d INSTANCE = new C64835d();

        static {
            Covode.recordClassIndex(76302);
        }

        public C64835d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$g */
    public static final class C64838g extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C64838g INSTANCE = new C64838g();

        static {
            Covode.recordClassIndex(76305);
        }

        public C64838g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$i */
    public static final class C64840i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146633a;

        static {
            Covode.recordClassIndex(76307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64840i(AbstractC12748a aVar) {
            super(0);
            this.f146633a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f146633a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$j */
    public static final class C64841j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146634a;

        static {
            Covode.recordClassIndex(76308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64841j(AbstractC12748a aVar) {
            super(0);
            this.f146634a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f146634a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$n */
    public static final class C64845n extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C64845n INSTANCE = new C64845n();

        static {
            Covode.recordClassIndex(76312);
        }

        public C64845n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$q */
    public static final class C64848q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C64848q INSTANCE = new C64848q();

        static {
            Covode.recordClassIndex(76315);
        }

        public C64848q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$t */
    public static final class C64851t extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C64851t INSTANCE = new C64851t();

        static {
            Covode.recordClassIndex(76318);
        }

        public C64851t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$ac */
    static final class View$OnClickListenerC64823ac implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64819g f146613a;

        /* renamed from: b */
        final /* synthetic */ View f146614b;

        static {
            Covode.recordClassIndex(76290);
        }

        View$OnClickListenerC64823ac(C64819g gVar, View view) {
            this.f146613a = gVar;
            this.f146614b = view;
        }

        /* renamed from: a */
        private static boolean m116655a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            User user;
            User user2;
            Aweme aweme;
            ClickAgent.onClick(view);
            this.f146613a.az_();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m116655a();
            }
            if (!C58029j.f132256h) {
                new C23144b(this.f146614b).mo37640e(R.string.dcq).mo37637b();
            } else if (!C58001a.m104815a(this.f146614b, 1200)) {
                C64819g gVar = this.f146613a;
                C64615i iVar = (C64615i) C12801d.m23029f(gVar, C89204ab.m154669a(AbstractC64616j.class));
                Object obj = null;
                if (iVar != null) {
                    user = iVar.f146329a;
                } else {
                    user = null;
                }
                ActivityC0945e b = C12777b.m23004b(gVar);
                if (!(!gVar.f31048h || user == null || b == null)) {
                    if (!user.isLive() || C80580in.m139685b(user, false)) {
                        C39162r.m79460a("click_profile_icon", new C33744d().mo59983a("author_id", user.getUid()).mo59983a("enter_from", "others_homepage").mo59983a("enter_method", "click_head").f79943a);
                        MusAvatarWithBorderView musAvatarWithBorderView = gVar.f146597k;
                        if (musAvatarWithBorderView == null) {
                            C89219l.m154715b();
                        }
                        new C63529g(b, musAvatarWithBorderView, null, user).mo102190a();
                    } else {
                        C64207ac acVar = (C64207ac) C12801d.m23029f(gVar, C89204ab.m154669a(AbstractC64206ab.class));
                        if (acVar != null) {
                            aweme = acVar.f145632g;
                        } else {
                            aweme = null;
                        }
                        if (!C37699a.m76314s(aweme)) {
                            C63873h.f144797a.watchFromProfile(gVar.az_(), user, false, new C64821aa(gVar, user));
                        } else if (C37699a.m76318w(aweme)) {
                            C63866a.f144791a.openTopViewLive(gVar.az_(), aweme, 50, new C64855x());
                        } else if (C37699a.m76314s(aweme)) {
                            C63866a.f144791a.feedLiveProfileAvatarOpen(gVar.az_(), aweme, 50);
                        }
                    }
                }
                SmartImageView smartImageView = this.f146613a.f146598l;
                if (smartImageView != null && smartImageView.getVisibility() == 0) {
                    C64615i iVar2 = (C64615i) C12801d.m23029f(this.f146613a, C89204ab.m154669a(AbstractC64616j.class));
                    if (iVar2 != null) {
                        user2 = iVar2.f146329a;
                    } else {
                        user2 = null;
                    }
                    C33744d a = new C33744d().mo59983a("enter_from", "others_homepage");
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

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$k */
    public static final class C64842k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146635a;

        static {
            Covode.recordClassIndex(76309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64842k(AbstractC12748a aVar) {
            super(0);
            this.f146635a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f146635a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$m */
    public static final class C64844m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146636a;

        static {
            Covode.recordClassIndex(76311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64844m(AbstractC12748a aVar) {
            super(0);
            this.f146636a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f146636a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$a */
    public static final class C64820a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f146609a;

        static {
            Covode.recordClassIndex(76287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64820a(AbstractC89277c cVar) {
            super(0);
            this.f146609a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f146609a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$b */
    public static final class C64833b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146628a;

        static {
            Covode.recordClassIndex(76300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64833b(AbstractC12748a aVar) {
            super(0);
            this.f146628a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146628a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$c */
    public static final class C64834c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146629a;

        static {
            Covode.recordClassIndex(76301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64834c(AbstractC12748a aVar) {
            super(0);
            this.f146629a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146629a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$o */
    public static final class C64846o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146637a;

        static {
            Covode.recordClassIndex(76313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64846o(AbstractC12748a aVar) {
            super(0);
            this.f146637a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146637a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$p */
    public static final class C64847p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146638a;

        static {
            Covode.recordClassIndex(76314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64847p(AbstractC12748a aVar) {
            super(0);
            this.f146638a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146638a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$r */
    public static final class C64849r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146639a;

        static {
            Covode.recordClassIndex(76316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64849r(AbstractC12748a aVar) {
            super(0);
            this.f146639a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146639a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$s */
    public static final class C64850s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146640a;

        static {
            Covode.recordClassIndex(76317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64850s(AbstractC12748a aVar) {
            super(0);
            this.f146640a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146640a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$u */
    public static final class C64852u extends AbstractC89220m implements AbstractC89171a<C64871b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146641a;

        /* renamed from: b */
        final /* synthetic */ String f146642b;

        static {
            Covode.recordClassIndex(76319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64852u(AbstractC12748a aVar, String str) {
            super(0);
            this.f146641a = aVar;
            this.f146642b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146641a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b.class
                java.lang.String r0 = r3.f146642b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.C64819g.C64852u.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$v */
    public static final class C64853v extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146643a;

        /* renamed from: b */
        final /* synthetic */ String f146644b;

        static {
            Covode.recordClassIndex(76320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64853v(AbstractC12748a aVar, String str) {
            super(0);
            this.f146643a = aVar;
            this.f146644b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146643a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146644b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.C64819g.C64853v.invoke():java.lang.Object");
        }
    }

    /* renamed from: x */
    private final String m116640x() {
        try {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            C89219l.m154716b(d, "");
            return d.mo13037r().mo12968a(az_());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: y */
    private static boolean m116641y() {
        try {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            C89219l.m154716b(d, "");
            return d.mo13038s().mo13045a();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        this.f146606u.mo57238a(this.f146607v);
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        this.f146606u.mo57240b(this.f146607v);
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$ai */
    static final class C64831ai extends AbstractC89220m implements AbstractC89171a<AbstractC34938bu> {

        /* renamed from: a */
        final /* synthetic */ C64819g f146624a;

        static {
            Covode.recordClassIndex(76298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64831ai(C64819g gVar) {
            super(0);
            this.f146624a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC34938bu invoke() {
            IProfileNaviService a;
            String str;
            ActivityC0945e b = C12777b.m23004b(this.f146624a);
            if (b == null || (a = ProfileNaviServiceImpl.m65406a()) == null) {
                return null;
            }
            C64870a aVar = (C64870a) this.f146624a.f146596j.getValue();
            if (aVar == null || !aVar.f146660c) {
                str = "others_homepage";
            } else {
                str = "personal_homepage";
            }
            return a.mo57243a(b, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$e */
    public static final class C64836e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146630a;

        static {
            Covode.recordClassIndex(76303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64836e(AbstractC12748a aVar) {
            super(0);
            this.f146630a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146630a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$f */
    public static final class C64837f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146631a;

        static {
            Covode.recordClassIndex(76304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64837f(AbstractC12748a aVar) {
            super(0);
            this.f146631a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146631a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: w */
    public final void mo104237w() {
        MusAvatarWithBorderView musAvatarWithBorderView = this.f146597k;
        if (musAvatarWithBorderView != null && musAvatarWithBorderView.getController() != null) {
            MusAvatarWithBorderView musAvatarWithBorderView2 = this.f146597k;
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
            C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
            if (acVar == null || !acVar.f145635j) {
                if (i.isRunning()) {
                    i.stop();
                }
            } else if (!i.isRunning()) {
                i.start();
            }
        }
    }

    public C64819g() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ProfileStoryRingViewModel.class);
        C64820a aVar = new C64820a(a);
        C64843l lVar = C64843l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C64845n.INSTANCE, new C64846o(this), new C64847p(this), C64848q.INSTANCE, lVar, new C64849r(this), new C64850s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C64851t.INSTANCE, new C64833b(this), new C64834c(this), C64835d.INSTANCE, lVar, new C64836e(this), new C64837f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C64838g.INSTANCE, new C64839h(this), new C64840i(this), new C64841j(this), lVar, new C64842k(this), new C64844m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f146602q = bVar;
        this.f146606u = ProfileBadgeServiceImpl.m67562b();
        this.f146607v = new C64822ab(this);
        this.f146608w = C89250i.m154773a((AbstractC89171a) new C64831ai(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$ab */
    public static final class C64822ab implements IProfileBadgeService.AbstractC31281c {

        /* renamed from: a */
        final /* synthetic */ C64819g f146612a;

        static {
            Covode.recordClassIndex(76289);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64822ab(C64819g gVar) {
            this.f146612a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31281c
        /* renamed from: a */
        public final void mo56081a(ProfileBadgeStruct profileBadgeStruct) {
            this.f146612a.mo104232a(profileBadgeStruct);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$y */
    public static final class C64856y extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C64819g f146645a;

        static {
            Covode.recordClassIndex(76323);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64856y(C64819g gVar) {
            this.f146645a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            C89219l.m154721d(str, "");
            this.f146645a.mo104237w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$ag */
    static final class C64829ag extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64819g f146622a;

        static {
            Covode.recordClassIndex(76296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64829ag(C64819g gVar) {
            super(1);
            this.f146622a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            if (aVar != null) {
                this.f146622a.mo104232a((ProfileBadgeStruct) null);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$aa */
    public static final class C64821aa implements AbstractC63854r {

        /* renamed from: a */
        final /* synthetic */ C64819g f146610a;

        /* renamed from: b */
        final /* synthetic */ User f146611b;

        static {
            Covode.recordClassIndex(76288);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
        /* renamed from: c */
        public final void mo71321c(FollowStatus followStatus) {
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
        /* renamed from: d_ */
        public final void mo71322d_(Exception exc) {
            C89219l.m154721d(exc, "");
            AbstractC64716c cVar = (AbstractC64716c) C12801d.m23025c(this.f146610a, C89204ab.m154669a(AbstractC64716c.class));
            if (cVar != null) {
                cVar.mo104179a(exc);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
        /* renamed from: b */
        public final void mo71320b(FollowStatus followStatus) {
            C89219l.m154721d(followStatus, "");
            AbstractC64716c cVar = (AbstractC64716c) C12801d.m23025c(this.f146610a, C89204ab.m154669a(AbstractC64716c.class));
            if (cVar != null) {
                cVar.mo104177a(followStatus);
            }
            this.f146611b.setFollowStatus(followStatus.followStatus);
            C63873h.f144797a.watchFromProfile(this.f146610a.az_(), this.f146611b, false, null);
        }

        C64821aa(C64819g gVar, User user) {
            this.f146610a = gVar;
            this.f146611b = user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$ad */
    static final class C64824ad extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64819g f146615a;

        static {
            Covode.recordClassIndex(76291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64824ad(C64819g gVar) {
            super(1);
            this.f146615a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            MusAvatarWithBorderView musAvatarWithBorderView;
            C12776a<? extends C89391z> aVar2 = aVar;
            if (!(aVar2 == null || aVar2.f31085a == null)) {
                C64819g gVar = this.f146615a;
                if (gVar.bC_() && (musAvatarWithBorderView = gVar.f146597k) != null) {
                    musAvatarWithBorderView.setImageURI("");
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$ae */
    static final class C64825ae extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64819g f146616a;

        /* renamed from: b */
        final /* synthetic */ View f146617b;

        static {
            Covode.recordClassIndex(76292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64825ae(C64819g gVar, View view) {
            super(1);
            this.f146616a = gVar;
            this.f146617b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20581a(this.f146616a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) C648261.f146618a);
            assembler2.mo20582b(this.f146616a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.C64819g.C64825ae.C648272 */

                /* renamed from: a */
                final /* synthetic */ C64825ae f146619a;

                static {
                    Covode.recordClassIndex(76294);
                }

                {
                    this.f146619a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C76549i.class));
                    qVar2.f31050b = new C76549i();
                    qVar2.f31053e = this.f146619a.f146617b;
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final boolean m116639b(UrlModel urlModel) {
        String str;
        String uri;
        String uri2;
        if (C46934fk.f109381e && this.f146605t != null) {
            String str2 = null;
            if (urlModel == null || (uri2 = urlModel.getUri()) == null) {
                str = null;
            } else {
                str = C89361p.m154918c(uri2, '/', "");
            }
            UrlModel urlModel2 = this.f146605t;
            if (!(urlModel2 == null || (uri = urlModel2.getUri()) == null)) {
                str2 = C89361p.m154918c(uri, '/', "");
            }
            if (!C89219l.m154714a((Object) str, (Object) str2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$ah */
    static final class C64830ah extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64819g f146623a;

        static {
            Covode.recordClassIndex(76297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64830ah(C64819g gVar) {
            super(1);
            this.f146623a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            User user;
            AbstractC34938bu v;
            AbstractC34938bu v2;
            C12776a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                this.f146623a.mo104237w();
                if (aVar2.f31085a.booleanValue()) {
                    C64615i iVar = (C64615i) C12801d.m23029f(this.f146623a, C89204ab.m154669a(AbstractC64616j.class));
                    if (iVar != null) {
                        user = iVar.f146329a;
                    } else {
                        user = null;
                    }
                    this.f146623a.mo104231a(C80630u.m139797a(user));
                    C64819g gVar = this.f146623a;
                    if (C64864a.f146651a && (((v = gVar.mo104236v()) == null || !v.mo61823b()) && (v2 = this.f146623a.mo104236v()) != null)) {
                        v2.mo61822a();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$aj */
    static final class C64832aj<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C64819g f146625a;

        /* renamed from: b */
        final /* synthetic */ User f146626b;

        /* renamed from: c */
        final /* synthetic */ String f146627c;

        static {
            Covode.recordClassIndex(76299);
        }

        C64832aj(C64819g gVar, User user, String str) {
            this.f146625a = gVar;
            this.f146626b = user;
            this.f146627c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            User user;
            long j;
            Map map = (Map) obj;
            if (map != null && (user = this.f146626b) != null) {
                long j2 = user.roomId;
                long j3 = 0;
                try {
                    String str = this.f146627c;
                    if (str != null) {
                        j = Long.parseLong(str);
                    } else {
                        j = -1;
                    }
                    Long l = (Long) map.get(Long.valueOf(j));
                    if (l != null) {
                        j3 = l.longValue();
                    }
                } catch (Throwable unused) {
                }
                this.f146626b.roomId = j3;
                if (j2 != j3) {
                    AbstractC64616j jVar = (AbstractC64616j) C12801d.m23025c(this.f146625a, C89204ab.m154669a(AbstractC64616j.class));
                    if (jVar != null) {
                        AbstractC64616j.C64617a.m116532a(jVar, this.f146626b, null, false, 6);
                    }
                    this.f146625a.mo104234a(this.f146626b.isLive());
                }
                C2954a aVar = new C2954a();
                String uid = this.f146626b.getUid();
                C89219l.m154716b(uid, "");
                aVar.f8697b = Long.parseLong(uid);
                aVar.f8696a = this.f146626b.roomId;
                aVar.f8698c = !this.f146626b.isLive();
                AbstractC81915c.m141874a(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo104231a(UrlModel urlModel) {
        User user;
        List<String> urlList;
        if (!C62845i.m113257a()) {
            C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null) {
                user = iVar.f146329a;
            } else {
                user = null;
            }
            if (bC_() && urlModel != null && user != null) {
                UrlModel avatarVideoUri = user.getAvatarVideoUri();
                if (avatarVideoUri == null || (urlList = avatarVideoUri.getUrlList()) == null || !(!urlList.isEmpty())) {
                    if (m116639b(urlModel)) {
                        this.f146605t = urlModel;
                        C34577e.m70592a(this.f146597k, urlModel);
                    }
                } else if (m116639b(avatarVideoUri)) {
                    C34577e.m70597a((RemoteImageView) this.f146597k, avatarVideoUri, (AbstractC24203d<AbstractC24457f>) new C64856y(this), false);
                    this.f146605t = avatarVideoUri;
                }
            }
        } else if (bC_() && urlModel != null && m116639b(urlModel)) {
            this.f146605t = urlModel;
            C34577e.m70596a(this.f146597k, urlModel, new C64857z());
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onLiveStatusEvent(C2954a aVar) {
        User user;
        long j;
        C89219l.m154721d(aVar, "");
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null && (user = iVar.f146329a) != null) {
            try {
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                j = Long.parseLong(uid);
            } catch (Throwable unused) {
                j = 0;
            }
            if (j == aVar.f8697b && aVar.f8698c) {
                user.roomId = 0;
                AbstractC64616j jVar = (AbstractC64616j) C12801d.m23025c(this, C89204ab.m154669a(AbstractC64616j.class));
                if (jVar != null) {
                    AbstractC64616j.C64617a.m116532a(jVar, user, EnumC64592g.NORMAL, false, 4);
                }
                mo104234a(user.isLive());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$af */
    static final class C64828af extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64819g f146620a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f146621b;

        static {
            Covode.recordClassIndex(76295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64828af(C64819g gVar, C89233z.C89234a aVar) {
            super(1);
            this.f146620a = gVar;
            this.f146621b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            ProfileBadgeStruct profileBadge;
            Long l;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                this.f146620a.mo104231a(C80630u.m139797a(t));
                if (!t.isBlock) {
                    this.f146620a.mo104234a(t.isLive());
                    this.f146620a.mo104232a(t.getProfileBadge());
                    if (t.getProfileBadge() != null && (profileBadge = t.getProfileBadge()) != null && profileBadge.getShouldShow() && this.f146621b.element) {
                        this.f146621b.element = false;
                        C33744d a = new C33744d().mo59983a("enter_from", "others_homepage");
                        ProfileBadgeStruct profileBadge2 = t.getProfileBadge();
                        if (profileBadge2 != null) {
                            l = Long.valueOf(profileBadge2.getId());
                        } else {
                            l = "";
                        }
                        C39162r.m79460a("profile_badge_show", a.mo59982a("badge_id", l).mo59983a("group_id", "").mo59983a("author_id", "").f79943a);
                    }
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
    public final void mo104232a(com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r4) {
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
            com.bytedance.lighten.loader.SmartImageView r1 = r3.f146598l
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
            com.bytedance.lighten.loader.SmartImageView r0 = r3.f146598l
            r1.f49092E = r0
            java.lang.String r0 = "ProfileWidgetProfileFragment"
            com.bytedance.lighten.a.v r0 = r1.mo34179a(r0)
            r0.mo34186c()
            com.bytedance.lighten.loader.SmartImageView r0 = r3.f146598l
            if (r0 == 0) goto L_0x0051
            r0.setVisibility(r2)
        L_0x0051:
            return
        L_0x0052:
            r0 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.C64819g.mo104232a(com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct):void");
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        MusAvatarWithBorderView musAvatarWithBorderView = (MusAvatarWithBorderView) view.findViewById(R.id.be7);
        this.f146597k = musAvatarWithBorderView;
        if (musAvatarWithBorderView != null) {
            ((CircleImageView) musAvatarWithBorderView).f81868f = true;
        }
        MusAvatarWithBorderView musAvatarWithBorderView2 = this.f146597k;
        if (musAvatarWithBorderView2 != null) {
            musAvatarWithBorderView2.setBorderColor(R.color.j);
        }
        MusAvatarWithBorderView musAvatarWithBorderView3 = this.f146597k;
        if (musAvatarWithBorderView3 != null) {
            musAvatarWithBorderView3.setOnClickListener(new View$OnClickListenerC64823ac(this, view));
        }
        this.f146598l = (SmartImageView) view.findViewById(R.id.d9u);
        this.f146603r = (AnimationImageView) view.findViewById(R.id.hv);
        this.f146599m = (LiveCircleView) view.findViewById(R.id.br7);
        this.f146600n = (TextView) view.findViewById(R.id.esz);
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = true;
        C12780d.m23007a(this, new C64825ae(this, view));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64858h.f146646a, new C64828af(this, aVar));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64859i.f146647a, new C64829ag(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64860j.f146648a, new C64830ah(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64861k.f146649a, new C64824ad(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.AbstractC64862l
    /* renamed from: a */
    public final void mo104233a(String str) {
        User user;
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null && (user = iVar.f146329a) != null) {
            if (!TextUtils.isEmpty(user.roomData)) {
                try {
                    SlimRoom.C11692a linkMic = ((SlimRoom) C33039i.m67674a(user.roomData, SlimRoom.class)).getLinkMic();
                    C89219l.m154716b(linkMic, "");
                    if (linkMic.f27946c > 0) {
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95828b().mo96084a(user, new C64832aj(this, user, str), "tiktok_profile_head");
        }
    }

    /* renamed from: a */
    public final void mo104234a(boolean z) {
        User user;
        LiveCircleView liveCircleView;
        TextView textView;
        LiveCircleView liveCircleView2;
        TextView textView2;
        String str;
        LiveCircleView liveCircleView3;
        TextView textView3;
        String str2;
        if (this.f146603r != null) {
            C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null) {
                user = iVar.f146329a;
            } else {
                user = null;
            }
            boolean b = C80580in.m139685b(user, false);
            if (!z || !C76657c.m134240a() || b) {
                MusAvatarWithBorderView musAvatarWithBorderView = this.f146597k;
                if (musAvatarWithBorderView != null) {
                    musAvatarWithBorderView.setBorderColor(R.color.l);
                }
                MusAvatarWithBorderView musAvatarWithBorderView2 = this.f146597k;
                if (musAvatarWithBorderView2 != null) {
                    musAvatarWithBorderView2.setBorderWidth(1);
                }
                MusAvatarWithBorderView musAvatarWithBorderView3 = this.f146597k;
                if (musAvatarWithBorderView3 != null) {
                    musAvatarWithBorderView3.mo103511d();
                }
                TextView textView4 = this.f146600n;
                if (!(textView4 == null || textView4.getVisibility() != 0 || (textView = this.f146600n) == null)) {
                    textView.setVisibility(8);
                }
                LiveCircleView liveCircleView4 = this.f146599m;
                if (!(liveCircleView4 == null || liveCircleView4.getVisibility() != 0 || (liveCircleView = this.f146599m) == null)) {
                    liveCircleView.setVisibility(8);
                }
                C50196d dVar = this.f146604s;
                if (dVar != null) {
                    dVar.mo85363d();
                }
                AnimationImageView animationImageView = this.f146603r;
                if (animationImageView != null) {
                    animationImageView.mo5836d();
                }
                AnimationImageView animationImageView2 = this.f146603r;
                if (animationImageView2 != null) {
                    animationImageView2.setVisibility(8);
                }
            } else {
                C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
                if (!(acVar == null || !acVar.f145635j || user == null)) {
                    az_();
                    String requestId = user.getRequestId();
                    C64207ac acVar2 = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
                    if (acVar2 != null) {
                        str2 = acVar2.f145626a;
                    } else {
                        str2 = null;
                    }
                    C77354d.m135263a(false, 0, requestId, str2, user.roomId);
                }
                if (!m116641y() || this.f146599m == null || this.f146600n == null) {
                    MusAvatarWithBorderView musAvatarWithBorderView4 = this.f146597k;
                    if (musAvatarWithBorderView4 != null) {
                        musAvatarWithBorderView4.setBorderColor(R.color.bh);
                    }
                    MusAvatarWithBorderView musAvatarWithBorderView5 = this.f146597k;
                    if (musAvatarWithBorderView5 != null) {
                        musAvatarWithBorderView5.setBorderWidth(2);
                    }
                    MusAvatarWithBorderView musAvatarWithBorderView6 = this.f146597k;
                    if (musAvatarWithBorderView6 != null) {
                        musAvatarWithBorderView6.mo103511d();
                    }
                    AnimationImageView animationImageView3 = this.f146603r;
                    if (animationImageView3 != null) {
                        animationImageView3.setVisibility(0);
                    }
                    AnimationImageView animationImageView4 = this.f146603r;
                    if (animationImageView4 != null) {
                        animationImageView4.setAnimation("tag_profile_live.json");
                    }
                    AnimationImageView animationImageView5 = this.f146603r;
                    if (animationImageView5 != null) {
                        animationImageView5.mo5826a();
                    }
                    TextView textView5 = this.f146600n;
                    if (!(textView5 == null || textView5.getVisibility() != 0 || (textView2 = this.f146600n) == null)) {
                        textView2.setVisibility(8);
                    }
                    LiveCircleView liveCircleView5 = this.f146599m;
                    if (!(liveCircleView5 == null || liveCircleView5.getVisibility() != 0 || (liveCircleView2 = this.f146599m) == null)) {
                        liveCircleView2.setVisibility(8);
                    }
                    C50196d dVar2 = this.f146604s;
                    if (dVar2 != null) {
                        dVar2.mo85363d();
                    }
                } else {
                    MusAvatarWithBorderView musAvatarWithBorderView7 = this.f146597k;
                    if (musAvatarWithBorderView7 != null) {
                        musAvatarWithBorderView7.setBorderWidth(0);
                    }
                    MusAvatarWithBorderView musAvatarWithBorderView8 = this.f146597k;
                    if (musAvatarWithBorderView8 != null) {
                        musAvatarWithBorderView8.mo103511d();
                    }
                    AnimationImageView animationImageView6 = this.f146603r;
                    if (animationImageView6 != null) {
                        animationImageView6.mo5836d();
                    }
                    AnimationImageView animationImageView7 = this.f146603r;
                    if (animationImageView7 != null) {
                        animationImageView7.setVisibility(8);
                    }
                    TextView textView6 = this.f146600n;
                    if (textView6 != null) {
                        textView6.setText(m116640x());
                    }
                    TextView textView7 = this.f146600n;
                    if (!(textView7 == null || textView7.getVisibility() != 8 || (textView3 = this.f146600n) == null)) {
                        textView3.setVisibility(0);
                    }
                    LiveCircleView liveCircleView6 = this.f146599m;
                    if (!(liveCircleView6 == null || liveCircleView6.getVisibility() != 8 || (liveCircleView3 = this.f146599m) == null)) {
                        liveCircleView3.setVisibility(0);
                    }
                    if (this.f146604s == null) {
                        MusAvatarWithBorderView musAvatarWithBorderView9 = this.f146597k;
                        C50196d dVar3 = new C50196d(musAvatarWithBorderView9, musAvatarWithBorderView9, this.f146599m);
                        this.f146604s = dVar3;
                        dVar3.mo85359a(null, getClass());
                    }
                    C50196d dVar4 = this.f146604s;
                    if (dVar4 == null) {
                        C89219l.m154715b();
                    }
                    dVar4.mo85362c();
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("enter_from_merge", "others_homepage");
                        if (C89219l.m154714a((Object) "LIVE", (Object) m116640x())) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        hashMap.put("is_english", str);
                        ILiveOuterService s = LiveOuterService.m107269s();
                        C89219l.m154716b(s, "");
                        AbstractC58593c d = s.mo95830d();
                        C89219l.m154716b(d, "");
                        d.mo13037r().mo12969a("livesdk_live_show_language", hashMap);
                    } catch (Exception unused) {
                    }
                }
                ILiveOuterService s2 = LiveOuterService.m107269s();
                C89219l.m154716b(s2, "");
                s2.mo95839m().mo34111a("ttlive_user_profile_avatar_entrance", 0, new HashMap());
            }
            ((ProfileStoryRingViewModel) this.f146602q.getValue()).mo120227a("live");
        }
    }
}
