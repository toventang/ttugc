package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b;

import android.app.Activity;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.notificationlive.C62513a;
import com.p2082ss.android.ugc.aweme.notificationlive.C62522i;
import com.p2082ss.android.ugc.aweme.notificationlive.C62561q;
import com.p2082ss.android.ugc.aweme.notificationlive.C62562r;
import com.p2082ss.android.ugc.aweme.notificationlive.C62577t;
import com.p2082ss.android.ugc.aweme.notificationlive.C62590u;
import com.p2082ss.android.ugc.aweme.notificationlive.C62683w;
import com.p2082ss.android.ugc.aweme.notificationlive.C62686x;
import com.p2082ss.android.ugc.aweme.notificationlive.C62687y;
import com.p2082ss.android.ugc.aweme.notificationlive.NotificationLiveViewModelV2;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65024b;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b */
public final class C65028b extends AbstractC64959h<EnumC65024b> implements AbstractC12846h, AbstractC68351c, AbstractC90252i, AbstractC90253j {

    /* renamed from: h */
    final C12786i f146876h = new C12786i(bW_(), new C65037i(this, null));

    /* renamed from: i */
    public final C39088c<AbstractC39085b<C68348f>, AbstractC68351c> f146877i = C68432f.f153189a.providePushSettingFetchPresenter();

    /* renamed from: j */
    private final C12814b f146878j;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$b */
    public static final class C65030b extends AbstractC89220m implements AbstractC89172b<C62687y, C62687y> {
        public static final C65030b INSTANCE = new C65030b();

        static {
            Covode.recordClassIndex(76498);
        }

        public C65030b() {
            super(1);
        }

        public final C62687y invoke(C62687y yVar) {
            C89219l.m154719c(yVar, "");
            return yVar;
        }
    }

    static {
        Covode.recordClassIndex(76496);
    }

    /* renamed from: A */
    public final NotificationLiveViewModelV2 mo104308A() {
        return (NotificationLiveViewModelV2) this.f146878j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68832a(Exception exc) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(64, new RunnableC90250g(C65028b.class, "onEvent", C62522i.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$d */
    public static final class C65032d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146880a;

        static {
            Covode.recordClassIndex(76500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65032d(AbstractC12748a aVar) {
            super(0);
            this.f146880a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f146880a;
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ AbstractC65076c mo104273v() {
        return EnumC65024b.Bell;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$c */
    public static final class C65031c extends AbstractC89220m implements AbstractC89171a<C12874b<C62687y>> {
        public static final C65031c INSTANCE = new C65031c();

        static {
            Covode.recordClassIndex(76499);
        }

        public C65031c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C62687y> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$e */
    public static final class C65033e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146881a;

        static {
            Covode.recordClassIndex(76501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65033e(AbstractC12748a aVar) {
            super(0);
            this.f146881a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f146881a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$f */
    public static final class C65034f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146882a;

        static {
            Covode.recordClassIndex(76502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65034f(AbstractC12748a aVar) {
            super(0);
            this.f146882a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f146882a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$g */
    public static final class C65035g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146883a;

        static {
            Covode.recordClassIndex(76503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65035g(AbstractC12748a aVar) {
            super(0);
            this.f146883a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f146883a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$h */
    public static final class C65036h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146884a;

        static {
            Covode.recordClassIndex(76504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65036h(AbstractC12748a aVar) {
            super(0);
            this.f146884a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f146884a.bD_().f30985g;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        this.f146877i.ck_();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$a */
    public static final class C65029a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f146879a;

        static {
            Covode.recordClassIndex(76497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65029a(AbstractC89277c cVar) {
            super(0);
            this.f146879a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f146879a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$i */
    public static final class C65037i extends AbstractC89220m implements AbstractC89171a<C64871b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146885a;

        /* renamed from: b */
        final /* synthetic */ String f146886b;

        static {
            Covode.recordClassIndex(76505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65037i(AbstractC12748a aVar, String str) {
            super(0);
            this.f146885a = aVar;
            this.f146886b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146885a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b.class
                java.lang.String r0 = r3.f146886b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65028b.C65037i.invoke():java.lang.Object");
        }
    }

    /* renamed from: B */
    public final Aweme mo104309B() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145632g;
        }
        return null;
    }

    /* renamed from: C */
    public final User mo104310C() {
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            return iVar.f146329a;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        NotificationLiveViewModelV2 A;
        super.mo20518f();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            EventBus.m156966a(EventBus.m156962a(), this);
            mo104289y();
            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C65049c.f146900a, new C65044o(this));
            mo20510a(A, C65050d.f146901a, C65051e.f146902a, C12856l.m23102a(mo104308A().f31149c), null, new C65047p(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$n */
    static final class C65042n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65028b f146891a;

        static {
            Covode.recordClassIndex(76510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65042n(C65028b bVar) {
            super(0);
            this.f146891a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            String str2;
            C88960c<C62513a> a = C62577t.m112999a();
            if (a != null) {
                User C = this.f146891a.mo104310C();
                Activity a2 = C34729o.m70950a(this.f146891a.az_());
                C64871b bVar = (C64871b) this.f146891a.f146876h.getValue();
                AwemeRawAd awemeRawAd = null;
                if (bVar != null) {
                    str = bVar.f146665c;
                } else {
                    str = null;
                }
                C64207ac acVar = (C64207ac) C12801d.m23029f(this.f146891a, C89204ab.m154669a(AbstractC64206ab.class));
                if (acVar != null) {
                    str2 = acVar.f145631f;
                } else {
                    str2 = null;
                }
                C650431 r9 = new C62577t.AbstractC62578a(this) {
                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65028b.C65042n.C650431 */

                    /* renamed from: a */
                    final /* synthetic */ C65042n f146892a;

                    static {
                        Covode.recordClassIndex(76511);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f146892a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.notificationlive.C62577t.AbstractC62578a
                    /* renamed from: a */
                    public final void mo100527a(User user) {
                        AbstractC64616j.C64617a.m116532a((AbstractC64616j) C12801d.m23018a(this.f146892a.f146891a, C89204ab.m154669a(AbstractC64616j.class)), user, null, false, 6);
                    }
                };
                Aweme B = this.f146891a.mo104309B();
                if (B != null) {
                    awemeRawAd = B.getAwemeRawAd();
                }
                a.onNext(new C62513a(C, a2, "others_homepage", str, str2, r9, "bell_notification", awemeRawAd));
            }
            return C89391z.f203057a;
        }
    }

    public C65028b() {
        AbstractC89277c a = C89204ab.m154669a(NotificationLiveViewModelV2.class);
        this.f146878j = new C12814b(a, new C65029a(a), C65031c.INSTANCE, new C65032d(this), new C65033e(this), new C65034f(this), C65030b.INSTANCE, new C65035g(this), new C65036h(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$o */
    static final class C65044o extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65028b f146893a;

        static {
            Covode.recordClassIndex(76512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65044o(C65028b bVar) {
            super(1);
            this.f146893a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$o$a */
        static final class C65045a extends AbstractC89220m implements AbstractC89172b<C23187b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C65044o f146894a;

            static {
                Covode.recordClassIndex(76513);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65045a(C65044o oVar) {
                super(1);
                this.f146894a = oVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23187b bVar) {
                C23187b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37739a(C65028b.m116774a(2));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$o$b */
        static final class C65046b extends AbstractC89220m implements AbstractC89172b<C23187b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ User f146895a;

            /* renamed from: b */
            final /* synthetic */ C65044o f146896b;

            static {
                Covode.recordClassIndex(76514);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65046b(User user, C65044o oVar) {
                super(1);
                this.f146895a = user;
                this.f146896b = oVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23187b bVar) {
                C23187b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37739a(C65028b.m116774a(this.f146895a.getLivePushNotificationStatus()));
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                C64615i iVar = (C64615i) C12801d.m23029f(this.f146893a, C89204ab.m154669a(AbstractC64616j.class));
                boolean z = true;
                if (iVar == null || !iVar.f146331c) {
                    NotificationLiveViewModelV2 A = this.f146893a.mo104308A();
                    String secUid = t.getSecUid();
                    if (!(secUid == null || secUid.length() == 0)) {
                        z = false;
                    }
                    if (!z) {
                        AbstractC88412b d = C62590u.m113011a(secUid).mo143289d(new NotificationLiveViewModelV2.C62511a(A));
                        C89219l.m154716b(d, "");
                        A.mo20659a(d);
                    }
                    this.f146893a.f146877i.mo67839a_(this.f146893a);
                    this.f146893a.f146877i.mo57616a(new Object[0]);
                    if (t.getFollowStatus() != 0 || t.getLivePushNotificationStatus() == 2 || !C80538hl.m139614a(t.getSecUid())) {
                        this.f146893a.mo104286a(new C65046b(t, this));
                    } else {
                        this.f146893a.mo104286a(new C65045a(this));
                        t.setLivePushNotificationStatus(2);
                        AbstractC64616j.C64617a.m116532a((AbstractC64616j) C12801d.m23018a(this.f146893a, C89204ab.m154669a(AbstractC64616j.class)), t, null, false, 6);
                        C62683w wVar = new C62683w(new C62683w.C62684a(), (byte) 0);
                        C62561q qVar = C62686x.f142117a;
                        String secUid2 = t.getSecUid();
                        C89219l.m154716b(secUid2, "");
                        qVar.mo33457a(secUid2, wVar);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$p */
    static final class C65047p extends AbstractC89220m implements AbstractC89187q<AbstractC22876d, C62562r, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65028b f146897a;

        static {
            Covode.recordClassIndex(76515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65047p(C65028b bVar) {
            super(3);
            this.f146897a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$p$a */
        static final class C65048a extends AbstractC89220m implements AbstractC89172b<C23187b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C65047p f146898a;

            /* renamed from: b */
            final /* synthetic */ int f146899b;

            static {
                Covode.recordClassIndex(76516);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65048a(C65047p pVar, int i) {
                super(1);
                this.f146898a = pVar;
                this.f146899b = i;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23187b bVar) {
                C23187b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37739a(C65028b.m116774a(this.f146899b));
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C62562r rVar, Integer num) {
            User user;
            int intValue = num.intValue();
            C89219l.m154721d(dVar, "");
            if (rVar != null) {
                this.f146897a.mo104286a(new C65048a(this, intValue));
                C64615i iVar = (C64615i) C12801d.m23029f(this.f146897a, C89204ab.m154669a(AbstractC64616j.class));
                if (iVar != null) {
                    user = iVar.f146329a;
                    if (user != null) {
                        user.setLivePushNotificationStatus(intValue);
                    }
                } else {
                    user = null;
                }
                AbstractC64616j.C64617a.m116532a((AbstractC64616j) C12801d.m23018a(this.f146897a, C89204ab.m154669a(AbstractC64616j.class)), user, null, false, 6);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$j */
    public static final class C65038j extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C65038j f146887a = new C65038j();

        static {
            Covode.recordClassIndex(76506);
        }

        C65038j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_bell;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$k */
    public static final class C65039k extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C65039k f146888a = new C65039k();

        static {
            Covode.recordClassIndex(76507);
        }

        C65039k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_bell_activation;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$l */
    public static final class C65040l extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C65040l f146889a = new C65040l();

        static {
            Covode.recordClassIndex(76508);
        }

        C65040l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_bell_slash;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$m */
    public static final class C65041m extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C65041m f146890a = new C65041m();

        static {
            Covode.recordClassIndex(76509);
        }

        C65041m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_bell;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static C22999a m116774a(int i) {
        if (i == 1) {
            return C23005c.m43393a(C65039k.f146888a);
        }
        if (i == 2) {
            return C23005c.m43393a(C65038j.f146887a);
        }
        if (i != 3) {
            return C23005c.m43393a(C65041m.f146890a);
        }
        return C23005c.m43393a(C65040l.f146889a);
    }

    @AbstractC90264r
    public final void onEvent(C62522i iVar) {
        String str;
        User user;
        CommerceUserInfo commerceUserInfo;
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(iVar, "");
        String str2 = iVar.f141804a;
        Aweme B = mo104309B();
        if (B == null || (awemeRawAd = B.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd.getCreativeIdStr();
        }
        if (!(!C89219l.m154714a((Object) str2, (Object) str))) {
            C64615i iVar2 = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar2 != null) {
                user = iVar2.f146329a;
                if (!(user == null || (commerceUserInfo = user.getCommerceUserInfo()) == null)) {
                    commerceUserInfo.setNotificationConfig(iVar.f141805b ? 1 : 0);
                }
            } else {
                user = null;
            }
            AbstractC64616j.C64617a.m116532a((AbstractC64616j) C12801d.m23018a(this, C89204ab.m154669a(AbstractC64616j.class)), user, null, false, 6);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: a */
    public final /* synthetic */ void mo104269a(C23187b bVar) {
        C23187b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        bVar2.mo37739a(m116774a(2)).mo37741a((AbstractC89171a<C89391z>) new C65042n(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68831a(C68348f fVar) {
        boolean z = true;
        if (fVar == null || fVar.f152988j != 1) {
            z = false;
        }
        C62577t.m113004a(z);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
