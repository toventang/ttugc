package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.C23048e;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.notificationlive.C62688z;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.p3070im.C53602f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63765ad;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64716c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65024b;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64553r;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b;
import com.p2082ss.android.ugc.aweme.profile.widgets.redpoint.C65165a;
import com.p2082ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
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

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f */
public final class C65052f extends AbstractC64959h<EnumC65024b> implements AbstractC12846h, WeakHandler.IHandler, AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public static final C65062j f146903j = new C65062j((byte) 0);

    /* renamed from: h */
    WeakHandler f146904h;

    /* renamed from: i */
    final C12786i f146905i = new C12786i(bW_(), new C65061i(this, null));

    /* renamed from: k */
    private final C12814b f146906k;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$b */
    public static final class C65054b extends AbstractC89220m implements AbstractC89172b<C65165a, C65165a> {
        public static final C65054b INSTANCE = new C65054b();

        static {
            Covode.recordClassIndex(76522);
        }

        public C65054b() {
            super(1);
        }

        public final C65165a invoke(C65165a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(76520);
    }

    /* renamed from: B */
    public final UserProfileBlockVM mo104314B() {
        return (UserProfileBlockVM) this.f146906k.getValue();
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
        hashMap.put(146, new RunnableC90250g(C65052f.class, "onUnBlockUser", C62688z.class, ThreadMode.MAIN, 0, false));
        hashMap.put(26, new RunnableC90250g(C65052f.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(58, new RunnableC90250g(C65052f.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$d */
    public static final class C65056d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146908a;

        static {
            Covode.recordClassIndex(76524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65056d(AbstractC12748a aVar) {
            super(0);
            this.f146908a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f146908a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$j */
    public static final class C65062j {
        static {
            Covode.recordClassIndex(76530);
        }

        private C65062j() {
        }

        public /* synthetic */ C65062j(byte b) {
            this();
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
        return EnumC65024b.More;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$c */
    public static final class C65055c extends AbstractC89220m implements AbstractC89171a<C12874b<C65165a>> {
        public static final C65055c INSTANCE = new C65055c();

        static {
            Covode.recordClassIndex(76523);
        }

        public C65055c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C65165a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$e */
    public static final class C65057e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146909a;

        static {
            Covode.recordClassIndex(76525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65057e(AbstractC12748a aVar) {
            super(0);
            this.f146909a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f146909a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$f */
    public static final class C65058f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146910a;

        static {
            Covode.recordClassIndex(76526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65058f(AbstractC12748a aVar) {
            super(0);
            this.f146910a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f146910a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$g */
    public static final class C65059g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146911a;

        static {
            Covode.recordClassIndex(76527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65059g(AbstractC12748a aVar) {
            super(0);
            this.f146911a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f146911a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$h */
    public static final class C65060h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146912a;

        static {
            Covode.recordClassIndex(76528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65060h(AbstractC12748a aVar) {
            super(0);
            this.f146912a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f146912a.bD_().f30985g;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$a */
    public static final class C65053a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f146907a;

        static {
            Covode.recordClassIndex(76521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65053a(AbstractC89277c cVar) {
            super(0);
            this.f146907a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f146907a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$i */
    public static final class C65061i extends AbstractC89220m implements AbstractC89171a<C64871b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146913a;

        /* renamed from: b */
        final /* synthetic */ String f146914b;

        static {
            Covode.recordClassIndex(76529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65061i(AbstractC12748a aVar, String str) {
            super(0);
            this.f146913a = aVar;
            this.f146914b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146913a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b.class
                java.lang.String r0 = r3.f146914b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65052f.C65061i.invoke():java.lang.Object");
        }
    }

    /* renamed from: A */
    public final User mo104313A() {
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            return iVar.f146329a;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        EventBus.m156966a(EventBus.m156962a(), this);
        mo104289y();
        this.f146904h = new WeakHandler(this);
        AbstractC12818f.C12819a.m23063a(this, mo104314B(), C65070g.f146922a, (C12854k) null, new C65066n(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo104314B(), C65071h.f146923a, (C12854k) null, new C65067o(this), 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$m */
    static final class C65065m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65052f f146917a;

        static {
            Covode.recordClassIndex(76533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65065m(C65052f fVar) {
            super(0);
            this.f146917a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            List<Aweme> list;
            C65052f fVar = this.f146917a;
            if (fVar.mo104313A() != null && !C58001a.m104815a(fVar.mo104272u(), 1200)) {
                C39162r.m79460a("click_more_action", new C33744d().mo59983a("others_homepage", "others_homepage").f79943a);
                AbstractC64553r rVar = (AbstractC64553r) C12801d.m23028e(fVar, C89204ab.m154669a(AbstractC64553r.class));
                if (rVar != null) {
                    list = rVar.mo104126W();
                } else {
                    list = null;
                }
                WeakHandler weakHandler = fVar.f146904h;
                ActivityC0945e b = C12777b.m23004b(fVar);
                User A = fVar.mo104313A();
                if (!(A == null || A.getShareInfo() == null)) {
                    C68863ah.f154027a.mo109408a(weakHandler, b, A, list);
                }
            }
            return C89391z.f203057a;
        }
    }

    public C65052f() {
        AbstractC89277c a = C89204ab.m154669a(UserProfileBlockVM.class);
        this.f146906k = new C12814b(a, new C65053a(a), C65055c.INSTANCE, new C65056d(this), new C65057e(this), new C65058f(this), C65054b.INSTANCE, new C65059g(this), new C65060h(this));
    }

    /* renamed from: C */
    private final void m116791C() {
        String str;
        String str2;
        String str3;
        if (mo104313A() != null) {
            C33744d a = new C33744d().mo59983a("others_homepage", "others_homepage");
            User A = mo104313A();
            String str4 = null;
            if (A != null) {
                str = A.getUid();
            } else {
                str = null;
            }
            C39162r.m79460a("click_block", a.mo59983a("to_user_id", str).f79943a);
            User A2 = mo104313A();
            if (A2 == null || A2.isBlock()) {
                UserProfileBlockVM B = mo104314B();
                User A3 = mo104313A();
                if (A3 != null) {
                    str2 = A3.getUid();
                } else {
                    str2 = null;
                }
                User A4 = mo104313A();
                if (A4 != null) {
                    str3 = A4.getSecUid();
                } else {
                    str3 = null;
                }
                B.mo104342a(str2, str3, 0);
                User A5 = mo104313A();
                if (A5 != null) {
                    str4 = A5.getUid();
                }
                C53602f.m98839a("others_homepage", str4);
                C63765ad.m115314a("unblock");
                return;
            }
            DialogInterface$OnClickListenerC65063k kVar = new DialogInterface$OnClickListenerC65063k(this);
            Context az_ = az_();
            if (az_ != null) {
                ((C23048e) new C23048e(az_).mo37483b(R.string.a6a)).mo37443a(R.string.as0, kVar).mo37444a(kVar).mo37442a().mo37396b().show();
            }
            User A6 = mo104313A();
            if (A6 != null) {
                str4 = A6.getUid();
            }
            C53602f.m98840a("others_homepage", str4, "");
            C63765ad.m115314a("block");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        if (r1 != null) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m116792D() {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65052f.m116792D():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$o */
    static final class C65067o extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, Exception, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65052f f146919a;

        static {
            Covode.recordClassIndex(76535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65067o(C65052f fVar) {
            super(2);
            this.f146919a = fVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$o$a */
        static final class C65068a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ Context f146920a;

            static {
                Covode.recordClassIndex(76536);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65068a(Context context) {
                super(1);
                this.f146920a = context;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23025b bVar) {
                C23025b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37416a(R.string.ep1, (AbstractC89172b<? super C23024a, C89391z>) null);
                bVar2.mo37418b(R.string.ep2, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65052f.C65067o.C65068a.C650691 */

                    /* renamed from: a */
                    final /* synthetic */ C65068a f146921a;

                    static {
                        Covode.recordClassIndex(76537);
                    }

                    {
                        this.f146921a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        C89219l.m154721d(aVar, "");
                        SmartRouter.buildRoute(this.f146921a.f146920a, "//setting/blocklist").open();
                        return C89391z.f203057a;
                    }
                });
                bVar2.f54513b = true;
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, Exception exc) {
            Exception exc2 = exc;
            C89219l.m154721d(dVar, "");
            if (exc2 != null) {
                if (exc2 instanceof ExecutionException) {
                    exc2 = exc2.getCause();
                }
                if (exc2 instanceof C34485a) {
                    C34485a aVar = (C34485a) exc2;
                    int errorCode = aVar.getErrorCode();
                    if (!(errorCode == 3070 || errorCode == 3071 || errorCode == 3072)) {
                        if (errorCode != 3002038) {
                            this.f146919a.mo104315a(aVar.getErrorMsg());
                        } else {
                            Context az_ = this.f146919a.az_();
                            if (az_ != null) {
                                C23028c.m43435a((C23023b) new C23023b(az_).mo37483b(R.string.ep3), new C65068a(az_)).mo37405a().mo37396b().show();
                            }
                        }
                    }
                } else {
                    this.f146919a.mo104315a(C3966y.m9657a((int) R.string.dck));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$l */
    static final class C65064l extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C65064l f146916a = new C65064l();

        static {
            Covode.recordClassIndex(76532);
        }

        C65064l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_ellipsis_vertical;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r
    public final void onEvent(C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        C89219l.m154721d(jVar, "");
        if (TextUtils.equals("user", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(az_(), mo104272u(), jVar);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        try {
            if (TextUtils.equals("userBlockSuccess", jVar.f111077b.getString("eventName"))) {
                BlockStruct blockStruct = new BlockStruct();
                blockStruct.blockStatus = 1;
                UserProfileBlockVM B = mo104314B();
                C89219l.m154721d(blockStruct, "");
                B.mo20662a(new UserProfileBlockVM.C65164c(blockStruct));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onUnBlockUser(C62688z zVar) {
        String str;
        String str2;
        String str3;
        C89219l.m154721d(zVar, "");
        String str4 = zVar.f142122a;
        User A = mo104313A();
        String str5 = null;
        if (A != null) {
            str = A.getUid();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str4, (Object) str)) {
            String str6 = zVar.f142123b;
            User A2 = mo104313A();
            if (A2 != null) {
                str2 = A2.getSecUid();
            } else {
                str2 = null;
            }
            if (C89219l.m154714a((Object) str6, (Object) str2)) {
                UserProfileBlockVM B = mo104314B();
                User A3 = mo104313A();
                if (A3 != null) {
                    str3 = A3.getUid();
                } else {
                    str3 = null;
                }
                User A4 = mo104313A();
                if (A4 != null) {
                    str5 = A4.getSecUid();
                }
                B.mo104342a(str3, str5, 0);
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        AbstractC64716c cVar;
        String str;
        String str2;
        String str3;
        Boolean bool;
        if (message != null) {
            if (message.what == 50) {
                if (mo104313A() != null) {
                    C33744d a = new C33744d().mo59983a("others_homepage", "others_homepage");
                    User A = mo104313A();
                    String str4 = null;
                    if (A != null) {
                        str = A.getUid();
                    } else {
                        str = null;
                    }
                    C39162r.m79460a("report_user", a.mo59983a("to_user_id", str).f79943a);
                    try {
                        C28022o oVar = new C28022o();
                        oVar.mo46801a("unique_id", C80580in.m139684b(mo104313A()));
                        User A2 = mo104313A();
                        if (A2 != null) {
                            bool = Boolean.valueOf(A2.isBlock());
                        } else {
                            bool = null;
                        }
                        oVar.mo46798a("is_blocked", bool);
                        str2 = C80342dg.m139300a().mo46674b(oVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                        str2 = "";
                    }
                    Uri.Builder builder = new Uri.Builder();
                    User A3 = mo104313A();
                    if (A3 != null) {
                        str3 = A3.getUid();
                    } else {
                        str3 = null;
                    }
                    Uri.Builder appendQueryParameter = builder.appendQueryParameter("owner_id", str3);
                    User A4 = mo104313A();
                    if (A4 != null) {
                        str4 = A4.getUid();
                    }
                    C39223a.m79587a().mo68688a(C12777b.m23004b(this), appendQueryParameter.appendQueryParameter("object_id", str4).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str2));
                }
            } else if (message.what == 53) {
                m116792D();
            } else if (message.what == 54 || message.what == 55) {
                m116791C();
            } else if (message.what == 56 && (cVar = (AbstractC64716c) C12801d.m23025c(this, C89204ab.m154669a(AbstractC64716c.class))) != null) {
                cVar.mo104176a();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: a */
    public final /* synthetic */ void mo104269a(C23187b bVar) {
        C23187b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        bVar2.mo37739a(C23005c.m43393a(C65064l.f146916a)).mo37741a((AbstractC89171a<C89391z>) new C65065m(this));
    }

    /* renamed from: a */
    public final void mo104315a(String str) {
        Activity a = C34729o.m70950a(az_());
        if (a != null) {
            new C23144b(a).mo37635a(str).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$n */
    static final class C65066n extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, BlockStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65052f f146918a;

        static {
            Covode.recordClassIndex(76534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65066n(C65052f fVar) {
            super(2);
            this.f146918a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, BlockStruct blockStruct) {
            AbstractC64206ab abVar;
            BlockStruct blockStruct2 = blockStruct;
            C89219l.m154721d(dVar, "");
            if (!(blockStruct2 == null || (abVar = (AbstractC64206ab) C12801d.m23025c(this.f146918a, C89204ab.m154669a(AbstractC64206ab.class))) == null)) {
                abVar.mo103782a(blockStruct2.blockStatus);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$k */
    public static final class DialogInterface$OnClickListenerC65063k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65052f f146915a;

        static {
            Covode.recordClassIndex(76531);
        }

        DialogInterface$OnClickListenerC65063k(C65052f fVar) {
            this.f146915a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6 = null;
            if (i == -2) {
                User A = this.f146915a.mo104313A();
                if (A != null) {
                    str6 = A.getUid();
                }
                C53602f.m98840a("cancel", str6, "others_homepage");
                C63765ad.m115317b("cancel");
                dialogInterface.dismiss();
            } else if (i == -1) {
                dialogInterface.dismiss();
                UserProfileBlockVM B = this.f146915a.mo104314B();
                User A2 = this.f146915a.mo104313A();
                if (A2 != null) {
                    str = A2.getUid();
                } else {
                    str = null;
                }
                User A3 = this.f146915a.mo104313A();
                if (A3 != null) {
                    str2 = A3.getSecUid();
                } else {
                    str2 = null;
                }
                B.mo104342a(str, str2, 1);
                User A4 = this.f146915a.mo104313A();
                if (A4 != null) {
                    str3 = A4.getUid();
                } else {
                    str3 = null;
                }
                C53602f.m98840a("success", str3, "others_homepage");
                C63765ad.m115317b("confirm");
                C64871b bVar = (C64871b) this.f146915a.f146905i.getValue();
                if (bVar != null) {
                    str4 = bVar.f146666d;
                } else {
                    str4 = null;
                }
                if (TextUtils.equals(str4, "chat")) {
                    User A5 = this.f146915a.mo104313A();
                    if (A5 != null) {
                        str5 = A5.getUid();
                    } else {
                        str5 = null;
                    }
                    C53602f.m98840a("chat", str5, "");
                }
                User A6 = this.f146915a.mo104313A();
                if (A6 == null || A6.getFollowStatus() != 0) {
                    User A7 = this.f146915a.mo104313A();
                    if (A7 != null) {
                        A7.setFollowStatus(0);
                    }
                    AbstractC64616j jVar = (AbstractC64616j) C12801d.m23025c(this.f146915a, C89204ab.m154669a(AbstractC64616j.class));
                    if (jVar != null) {
                        AbstractC64616j.C64617a.m116532a(jVar, this.f146915a.mo104313A(), null, false, 6);
                    }
                }
            } else {
                User A8 = this.f146915a.mo104313A();
                if (A8 != null) {
                    str6 = A8.getUid();
                }
                C53602f.m98840a("cancel", str6, "others_homepage");
                dialogInterface.dismiss();
            }
        }
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
