package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.C33794i;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.p2082ss.android.ugc.aweme.ecommerce.service.AbstractC45377b;
import com.p2082ss.android.ugc.aweme.experiment.p2914a.C46680a;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49509b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.login.DialogC58952a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkService;
import com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a;
import com.p2082ss.android.ugc.aweme.p2727db.C40934c;
import com.p2082ss.android.ugc.aweme.p2727db.C40937d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.p4173ug.p4183h.C79675a;
import com.p2082ss.android.ugc.aweme.p4173ug.p4183h.C79677c;
import com.p2082ss.android.ugc.aweme.p4173ug.p4183h.C79678d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.setting.C68124l;
import com.p2082ss.android.ugc.aweme.setting.p3719g.C68081a;
import com.p2082ss.android.ugc.aweme.setting.p3726n.C68192a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.cell.CommonItemViewCell;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.cell.SettingFooterCell;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.cell.SettingUnLoginCell;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68546a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68547b;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68548c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68345c;
import com.p2082ss.android.ugc.aweme.setting.unit.p3736a.C68616a;
import com.p2082ss.android.ugc.aweme.setting.unit.p3736a.C68628b;
import com.p2082ss.android.ugc.aweme.setting.unit.p3736a.C68634c;
import com.p2082ss.android.ugc.aweme.setting.utils.C68698m;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.v */
public abstract class AbstractActivityC68607v extends ActivityC17312a implements IAccountService.AbstractC31272b, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    C68616a f153478A;

    /* renamed from: B */
    C68616a f153479B;

    /* renamed from: C */
    C40934c f153480C;

    /* renamed from: D */
    C68616a f153481D;

    /* renamed from: E */
    C68616a f153482E;

    /* renamed from: F */
    AbstractC45377b f153483F;

    /* renamed from: G */
    C68616a f153484G;

    /* renamed from: H */
    C68616a f153485H;

    /* renamed from: I */
    C68616a f153486I;

    /* renamed from: J */
    C68616a f153487J;

    /* renamed from: K */
    C68616a f153488K;

    /* renamed from: L */
    C68616a f153489L;

    /* renamed from: M */
    C68616a f153490M;

    /* renamed from: N */
    C68616a f153491N;

    /* renamed from: O */
    C68616a f153492O;

    /* renamed from: P */
    C68616a f153493P;

    /* renamed from: Q */
    C68616a f153494Q;

    /* renamed from: R */
    C68616a f153495R;

    /* renamed from: S */
    C68616a f153496S;

    /* renamed from: T */
    C68616a f153497T;

    /* renamed from: U */
    C68616a f153498U;

    /* renamed from: V */
    C68616a f153499V;

    /* renamed from: W */
    C68616a f153500W;

    /* renamed from: X */
    C68616a f153501X;

    /* renamed from: Y */
    C68616a f153502Y;

    /* renamed from: Z */
    C68616a f153503Z;

    /* renamed from: a */
    private int f153504a;

    /* renamed from: aa */
    C68616a f153505aa;

    /* renamed from: ab */
    C68628b f153506ab;

    /* renamed from: ac */
    C40937d f153507ac;

    /* renamed from: ad */
    C40937d f153508ad;

    /* renamed from: ae */
    C40937d f153509ae;

    /* renamed from: af */
    C40937d f153510af;

    /* renamed from: ag */
    C40937d f153511ag;

    /* renamed from: ah */
    C40937d f153512ah;

    /* renamed from: ai */
    List<Aweme> f153513ai;

    /* renamed from: aj */
    protected List<CommonItemView> f153514aj = new ArrayList();

    /* renamed from: ak */
    DialogC58952a f153515ak;

    /* renamed from: al */
    protected HashSet<AbstractC40931a<AbstractC34793a>> f153516al;

    /* renamed from: b */
    private long f153517b;

    /* renamed from: c */
    View f153518c;

    /* renamed from: d */
    ViewGroup f153519d;

    /* renamed from: e */
    TextTitleBar f153520e;

    /* renamed from: f */
    PowerList f153521f;

    /* renamed from: g */
    C43047dm f153522g;

    /* renamed from: h */
    C68616a f153523h;

    /* renamed from: i */
    C68616a f153524i;

    /* renamed from: j */
    C68616a f153525j;

    /* renamed from: k */
    C68616a f153526k;

    /* renamed from: l */
    C68616a f153527l;

    /* renamed from: m */
    C68616a f153528m;

    /* renamed from: n */
    C68616a f153529n;

    /* renamed from: o */
    C68616a f153530o;

    /* renamed from: p */
    C68616a f153531p;

    /* renamed from: q */
    C68616a f153532q;

    /* renamed from: r */
    C68616a f153533r;

    /* renamed from: s */
    C68616a f153534s;

    /* renamed from: t */
    C68616a f153535t;

    /* renamed from: u */
    C68616a f153536u;

    /* renamed from: v */
    C68616a f153537v;

    /* renamed from: w */
    C68616a f153538w;

    /* renamed from: x */
    C68616a f153539x;

    /* renamed from: y */
    C68616a f153540y;

    /* renamed from: z */
    public C68634c f153541z;

    static {
        Covode.recordClassIndex(80863);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo108956A();

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo108957C() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract void mo108958D();

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract void mo108962H();

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo108963I();

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract void mo108964J();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo108967a(C63511a aVar);

    /* renamed from: b */
    public abstract AbstractC40931a[] mo108968b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo108970d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo108971e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo108972f() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo109096O();

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new RunnableC90250g(AbstractActivityC68607v.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo108974h();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo108977k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo109097P();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo108981o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo108986p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo108987q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo108988r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo108989s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo108990t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo108991u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo108992v() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo108993w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract void mo108994x();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo108995y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo108996z();

    /* renamed from: E */
    private static boolean mo108959E() {
        return C39223a.m79590d().mo68618c();
    }

    /* renamed from: F */
    private static boolean mo108960F() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo109095N() {
        mo108967a(new C63511a("settings_page", "switch_account"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final /* synthetic */ void mo109098Q() {
        C34597d.m70641h().mo61058b("show_insights_red", false);
        mo108979m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C33103x mo109099R() {
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = false;
        xVar.f78674h = false;
        xVar.f78673g = R.color.ur;
        return xVar;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        super.onDestroy();
        C50540h.m94753a(this.f153513ai);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        super.onStart();
        IBenchmarkService c = BenchmarkServiceImpl.m71140c();
        if (c != null) {
            c.mo61662a(1);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        super.onStop();
        IBenchmarkService c = BenchmarkServiceImpl.m71140c();
        if (c != null) {
            c.mo61661a();
        }
    }

    /* renamed from: B */
    private static boolean m120998B() {
        C68345c cVar = C68081a.f152476a;
        if (cVar == null) {
            return false;
        }
        if ((!cVar.f152933a || TextUtils.isEmpty(cVar.f152934b)) && !TextUtils.equals(C17867d.f42595s, "beta")) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public static boolean m121001L() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean F = mo108960F();
        C58029j.f132256h = F;
        return F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo108969c() {
        this.f153478A.mo109133a("Debug Test");
        this.f153478A.mo70127a(false);
        this.f153513ai = C50540h.f116810b;
        mo108961G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo108976j() {
        C39162r.m79460a("enter_account_safety", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo108980n() {
        C39162r.m79460a("display_settings", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo108961G() {
        if (C46680a.m90086a()) {
            AbstractC88979t.m154294a(C68561bm.f153413a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new AbstractC88986z<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v.C686092 */

                static {
                    Covode.recordClassIndex(80865);
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onComplete() {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onError(Throwable th) {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onSubscribe(AbstractC88412b bVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88986z
                public final /* synthetic */ void onNext(Boolean bool) {
                    if (bool.booleanValue()) {
                        AbstractActivityC68607v.this.f153539x.mo109135b(true);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo109093K() {
        if (!C31575b.m65865g().isLogin()) {
            if (this.f153516al == null) {
                this.f153516al = new HashSet<>();
            }
            if (C79675a.m138490a()) {
                this.f153526k.mo70127a(true);
            }
            C68698m.m121135a(this, this.f153516al);
        }
    }

    /* renamed from: M */
    public final void mo109094M() {
        int i;
        boolean c = C39223a.m79601o().mo68706c();
        boolean a = C39223a.m79601o().mo68703a();
        if (!c) {
            if (!a) {
                mo108958D();
                return;
            }
        } else if (!a) {
            i = R.string.a9d;
            new C79459a(this).mo123050a(i).mo123053a();
        }
        i = R.string.a9c;
        new C79459a(this).mo123050a(i).mo123053a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo108979m() {
        C29819a.m60077a("click_insight", (JSONObject) null);
        C39162r.m79460a("click_insight", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
        C39162r.m79460a("enter_insight_detail", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108966a() {
        C40934c cVar = this.f153480C;
        cVar.mo70126a(new C40934c.C40935a(cVar));
        this.f153520e.setTitle(R.string.aiu);
        this.f153520e.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v.C686081 */

            static {
                Covode.recordClassIndex(80864);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                AbstractActivityC68607v.this.exit(view);
            }
        });
        if (C58901f.m108236c()) {
            this.f153479B.mo70127a(false);
        } else {
            this.f153479B.mo70127a(true);
            C22999a aVar = new C22999a();
            aVar.f54431a = R.raw.icon_live_wallpaper;
            int a = C34728n.m70946a(20.0d);
            aVar.f54433c = a;
            aVar.f54432b = a;
            aVar.f54435e = Integer.valueOf((int) R.attr.bj);
            C23001b a2 = aVar.mo37368a(this);
            C68616a aVar2 = this.f153479B;
            aVar2.mo70126a(new C68616a.C68620d(aVar2));
            C68616a aVar3 = this.f153479B;
            C89219l.m154721d(a2, "");
            aVar3.mo70126a(new C68616a.C68619c(aVar3, a2));
        }
        this.f153481D.mo70127a(false);
        if (C31575b.m65860b().isEnableMultiAccountLogin() && C31575b.m65865g().isLogin()) {
            C68616a aVar4 = this.f153481D;
            String avatarUrl = AccountService.m65215a().mo57069e().getAvatarUrl();
            CommonItemView.EnumC17185a aVar5 = CommonItemView.EnumC17185a.CIRCULAR;
            C89219l.m154721d(avatarUrl, "");
            C89219l.m154721d(aVar5, "");
            aVar4.mo70126a(new C68616a.C68622f(aVar4, avatarUrl, aVar5));
            this.f153481D.mo70127a(true);
        }
        AbstractC45377b orderCenterEntry = ECommerceService.createIECommerceServicebyMonsterPlugin(false).getOrderCenterEntry();
        this.f153483F = orderCenterEntry;
        orderCenterEntry.mo75653a(getLifecycle(), new C68560bl(this));
        this.f153512ah.mo70127a(false);
        if (C31575b.m65865g().isLogin()) {
            this.f153512ah.mo70127a(true);
            this.f153512ah.mo70134a(getResources().getString(R.string.fmq));
        }
        C68628b bVar = this.f153506ab;
        bVar.mo70126a(new C68628b.C68629a(bVar, C0643b.m2378c(this, R.color.l)));
        this.f153495R.mo70127a(false);
        if (C68124l.m120413c()) {
            ZeroRatingServiceImpl.m141669f().mo59646c().mo59655b();
            this.f153499V.mo70127a(true);
        }
        if (Build.VERSION.SDK_INT >= 21 && "googleplay".equals(C17867d.f42595s) && (C52912c.f121688a.f121689b.getInappUpdateSwitchStrategy().intValue() == 3 || C52912c.f121688a.f121689b.getInappUpdateSwitchStrategy().intValue() == 2)) {
            this.f153500W.mo70127a(true);
        }
        if (m120998B()) {
            this.f153502Y.mo70127a(true);
        }
        if (mo108959E()) {
            this.f153501X.mo70127a(true);
        }
        C79677c a3 = C79678d.m138492a();
        if (a3 != null && !TextUtils.isEmpty(a3.f178786a)) {
            this.f153503Z.mo70127a(true);
            this.f153503Z.mo109133a(a3.f178786a);
        }
        this.f153496S.mo70127a(true);
        this.f153498U.mo70127a(false);
        if (C49509b.m92743a()) {
            this.f153497T.mo70127a(true);
            C68616a aVar6 = this.f153497T;
            aVar6.mo70126a(new C68616a.C68618b(aVar6));
        }
    }

    public void exit(View view) {
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo109101b(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108992v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo109102c(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108995y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo109103d(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108994x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo109104e(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108991u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo109106f(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108993w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo109107g(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108989s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo109108h(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108988r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo109110j(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108987q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo109111k(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108981o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo109112l(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108956A();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo109114n(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108971e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo109115o(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108970d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo109119p(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108964J();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo109120q(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108977k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo109121r(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108980n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo109122s(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108963I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void mo109123t(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108986p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo109124u(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108957C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo109125v(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108974h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ void mo109126w(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108996z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ void mo109127x(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108976j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo109109i(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            mo108990t();
        }
    }

    @AbstractC90264r
    public void onEvent(C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (TextUtils.equals("user", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(this, this.f153519d, jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo109113m(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            if (((C68546a) this.f153539x.f95762k).f153371h) {
                this.f153539x.mo109135b(false);
                C68192a.m120443a().storeLong("last_show_disk_manager_dot_time", System.currentTimeMillis());
                if (!C68192a.m120444a(false)) {
                    C68192a.m120443a().storeBoolean("has_show_disk_manager_dot", true);
                }
            }
            mo108962H();
        }
    }

    public void onUserInfoClick(View view) {
        String str = ((C68547b) this.f153506ab.f95762k).f153392i;
        try {
            C80228av.m139063a("user_info", str, this, PrivacyCert.Builder.with("bpea-213").usage("User can share suggesting of feedback to TikTok in app. Click on the app information on the settings page, and copy the app related information to the clipboard. ").tag("click_to_copy_app_info").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        } catch (C13340a e) {
            C51423a.m95788a("", e);
        }
        new C79459a(this).mo123050a(R.string.agh).mo123053a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo109100a(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            C39162r.m79460a("uc_user_logout_click", new C33744d().mo59983a("params_for_special", "uc_login").mo59983a("uid", C31575b.m65865g().getCurUserId()).f79943a);
            if (!AVExternalServiceImpl.m113114a().publishService().isPublishable()) {
                new C79459a(this).mo123050a(R.string.eye).mo123053a();
            } else if (!m121001L()) {
                new C79459a(this).mo123050a(R.string.dcq).mo123053a();
            } else if (!isActive()) {
            } else {
                if (!C39223a.m79601o().mo68707d()) {
                    mo108958D();
                } else if (C39223a.m79602p().mo68649a() == IFamilyPairingService.EnumC39276a.CHILD || C39223a.m79602p().mo68649a() == IFamilyPairingService.EnumC39276a.UNLINK_LOCKED) {
                    C39223a.m79601o().mo68702a(new AbstractC39286a() {
                        /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v.C686103 */

                        static {
                            Covode.recordClassIndex(80866);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a
                        /* renamed from: a */
                        public final void mo68715a() {
                            AbstractActivityC68607v.this.mo109094M();
                        }

                        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a
                        /* renamed from: a */
                        public final void mo68716a(Exception exc) {
                            AbstractActivityC68607v.this.mo109094M();
                        }
                    });
                } else {
                    C39162r.m79460a("time_lock_block_show", new C33744d().mo59983a("enter_from", "logout").f79943a);
                    C39223a.m79601o().mo68704a(new AbstractC34709b<Boolean>() {
                        /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v.C686114 */

                        static {
                            Covode.recordClassIndex(80867);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
                        /* renamed from: a */
                        public final /* synthetic */ void mo61385a() {
                            AbstractActivityC68607v.this.mo108958D();
                        }
                    }, "logout");
                }
            }
        }
    }

    public void onVersionClick(View view) {
        AbstractC58593c cVar;
        String str;
        if (System.currentTimeMillis() - this.f153517b < 500) {
            this.f153504a++;
        } else {
            this.f153504a = 0;
        }
        if (this.f153504a >= 4) {
            C68628b bVar = this.f153506ab;
            bVar.mo70126a(new C68628b.C68631c(bVar));
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.m113114a().configService().avsettingsConfig();
            if (LiveOuterService.m107269s() != null) {
                cVar = LiveOuterService.m107269s().mo95830d();
            } else {
                cVar = null;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder append = sb.append("UserId: " + C31575b.m65865g().getCurUserId()).append("\n").append("DeviceId: ".concat(String.valueOf(serverDeviceId))).append("\n").append("UpdateVersionCode: " + C17867d.m33083d()).append("\n").append("Channel: " + C17867d.f42595s).append("\n").append("GitSHA: " + C17867d.f42592p).append("\n").append("VESDK: " + avsettingsConfig.getVESDKVersion()).append("\n").append("EffectSdk: " + avsettingsConfig.getEffectVersion()).append("\n");
            StringBuilder sb2 = new StringBuilder("LiveCore: ");
            if (cVar != null) {
                str = cVar.mo13036q();
            } else {
                str = "";
            }
            append.append(sb2.append(str).toString()).append("\n").append(C33794i.m69145a());
            C68628b bVar2 = this.f153506ab;
            String sb3 = sb.toString();
            C89219l.m154721d(sb3, "");
            bVar2.mo70126a(new C68628b.C68630b(bVar2, sb3));
            this.f153504a = 0;
        }
        this.f153517b = System.currentTimeMillis();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        View$OnClickListenerC68534ap apVar;
        View$OnClickListenerC68551bc bcVar;
        View$OnClickListenerC68555bg bgVar;
        activityConfiguration(new C68612w(this));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(mo108972f());
        this.f153521f = (PowerList) findViewById(R.id.bgc);
        this.f153541z = new C68634c(new C68548c(getString(R.string.fnp), (byte) 0));
        this.f153525j = new C68616a(new C68546a(2131233720, getString(R.string.d0k), new View$OnClickListenerC68613x(this), "account_and_safety", (byte) 0));
        this.f153527l = new C68616a(new C68546a(2131233750, getString(R.string.c4), new View$OnClickListenerC68527ai(this), "privacy_manager", (byte) 0));
        this.f153496S = new C68616a(new C68546a(2131233752, getString(R.string.fox), new View$OnClickListenerC68538at(this), "security_center", (byte) 0));
        this.f153498U = new C68616a(new C68546a(2131233747, getString(R.string.ex6), View$OnClickListenerC68553be.f153405a, null));
        this.f153488K = new C68616a(new C68546a(2131233738, getString(R.string.fkz), new View$OnClickListenerC68563bo(this), null));
        this.f153489L = new C68616a(new C68546a(2131233761, getString(R.string.gaw), new View$OnClickListenerC68566br(this), null));
        this.f153490M = new C68616a(new C68546a(2131233723, getString(R.string.a7b), new View$OnClickListenerC68567bs(this), null));
        this.f153484G = new C68616a(new C68546a(2131233760, getString(R.string.fu5), new View$OnClickListenerC68568bt(this), "order_center"));
        this.f153482E = new C68616a(new C68546a(2131233767, getString(R.string.had), new View$OnClickListenerC68569bu(this), "my_wallet", (byte) 0));
        this.f153486I = new C68616a(new C68546a(2131233748, getString(R.string.fl3), new View$OnClickListenerC68614y(this), null));
        this.f153485H = new C68616a(new C68546a(2131233754, getString(R.string.fmr), new View$OnClickListenerC68615z(this), "share_profile", (byte) 0));
        this.f153523h = new C68616a(new C68546a(getString(R.string.bjn), new View$OnClickListenerC68519aa(this)));
        this.f153493P = new C68616a(new C68546a(2131233731, " ", new View$OnClickListenerC68520ab(this), null));
        this.f153526k = new C68616a(new C68546a(2131233746, getString(R.string.fl4), new View$OnClickListenerC68521ac(this), "notification_manager", (byte) 0));
        this.f153530o = new C68616a(new C68546a(2131233733, getString(R.string.fo4), new View$OnClickListenerC68522ad(this), "common_protocol", (byte) 0));
        this.f153524i = new C68616a(new C68546a(2131233726, getString(R.string.fka), new View$OnClickListenerC68523ae(this), "content_preference", (byte) 0));
        this.f153497T = new C68616a(new C68546a(R.raw.icon_headphone, getString(R.string.vn), new View$OnClickListenerC68524af(this), "background_audio"));
        this.f153531p = new C68616a(new C68546a(2131233743, getString(R.string.edv), new View$OnClickListenerC68525ag(this), "notification_manager"));
        this.f153532q = new C68616a(new C68546a(R.drawable.bge, getString(R.string.d01), new View$OnClickListenerC68526ah(this), "setting_ads"));
        this.f153528m = new C68616a(new C68546a(2131233732, getString(R.string.ge8), new View$OnClickListenerC68528aj(this), "digital_wellbeing", (byte) 0));
        this.f153529n = new C68616a(new C68546a(2131233735, getString(R.string.bc), new View$OnClickListenerC68529ak(this), "family_pairing"));
        this.f153494Q = new C68616a(new C68546a(2131233719, getString(R.string.mn), new View$OnClickListenerC68530al(this), "accessibility", (byte) 0));
        this.f153495R = new C68616a(new C68546a(2131233700, getString(R.string.a2d), new View$OnClickListenerC68531am(this), "powermode", (byte) 0));
        this.f153491N = new C68616a(new C68546a(2131233758, "", null, null, (byte) 0));
        this.f153503Z = new C68616a(new C68546a(2131233717, " ", new View$OnClickListenerC68532an(this), "join_amplify"));
        this.f153539x = new C68616a(new C68546a(2131233724, getString(R.string.ag8), new View$OnClickListenerC68533ao(this), "clear_cache", (byte) 0));
        String string = getString(R.string.b41);
        if (C68124l.m120413c()) {
            apVar = new View$OnClickListenerC68534ap(this);
        } else {
            apVar = null;
        }
        this.f153499V = new C68616a(new C68546a(2131233730, string, apVar, null));
        this.f153479B = new C68616a(new C68546a(2131233742, getString(R.string.haf), new View$OnClickListenerC68535aq(this), null));
        this.f153500W = new C68616a(new C68546a(2131233755, getString(R.string.aco), new View$OnClickListenerC68536ar(this), null));
        this.f153534s = new C68616a(new C68546a(2131233749, getString(R.string.d9e), new View$OnClickListenerC68537as(this), "feedback_and_help", (byte) 0));
        this.f153533r = new C68616a(new C68546a(R.drawable.bgt, getString(R.string.bvd), new View$OnClickListenerC68539au(this), "helper_center", (byte) 0));
        this.f153492O = new C68616a(new C68546a(2131233751, getString(R.string.fd0), new View$OnClickListenerC68540av(this), "safety_center", (byte) 0));
        this.f153540y = new C68616a(new C68546a(R.drawable.bgl, getString(R.string.b3d), new View$OnClickListenerC68541aw(this), "creators_portal", (byte) 0));
        this.f153505aa = new C68616a(new C68546a(2131233766, getString(R.string.ell), new View$OnClickListenerC68542ax(this), "live_subscription", (byte) 0));
        this.f153487J = new C68616a(new C68546a(2131233725, getString(R.string.arm), new View$OnClickListenerC68543ay(this), "community_guidelines", (byte) 0));
        this.f153535t = new C68616a(new C68546a(2131233756, getString(R.string.exw), new View$OnClickListenerC68544az(this), "terms_of_use", (byte) 0));
        this.f153537v = new C68616a(new C68546a(2131233757, getString(R.string.eru), new View$OnClickListenerC68549ba(this), "privacy_policy", (byte) 0));
        this.f153538w = new C68616a(new C68546a(2131233727, getString(R.string.au_), new View$OnClickListenerC68550bb(this), "copyright_policy", (byte) 0));
        String string2 = getString(R.string.cp8);
        if (m120998B()) {
            bcVar = new View$OnClickListenerC68551bc(this);
        } else {
            bcVar = null;
        }
        this.f153502Y = new C68616a(new C68546a(2131233740, string2, bcVar, "join_testers"));
        this.f153478A = new C68616a(new C68546a(2131233750, getString(R.string.b4n), new View$OnClickListenerC68552bd(this), null));
        this.f153536u = new C68616a(new C68546a(2131233718, getString(R.string.ma), new View$OnClickListenerC68554bf(this), null));
        String string3 = getString(R.string.fjp);
        if (mo108959E()) {
            bgVar = new View$OnClickListenerC68555bg(this);
        } else {
            bgVar = null;
        }
        this.f153501X = new C68616a(new C68546a(2131233764, string3, bgVar, null));
        this.f153481D = new C68616a(new C68546a(R.drawable.bfr, getString(R.string.apc), new View$OnClickListenerC68556bh(this), "switch_account"));
        C22999a aVar = new C22999a();
        aVar.f54431a = R.raw.icon_arrow_to_left;
        this.f153480C = new C40934c(new C34796d(getString(R.string.czh), aVar, new View$OnClickListenerC68557bi(this), "logout"));
        this.f153506ab = new C68628b(new C68547b("settings_footer_container", getResources().getColor(R.color.l), new View$OnClickListenerC68558bj(this), new View$OnClickListenerC68559bk(this), (byte) 0));
        this.f153507ac = new C40937d(new C34797e(getString(R.string.fmo), (byte) 0));
        this.f153508ad = new C40937d(new C34797e(getString(R.string.ate)));
        this.f153509ae = new C40937d(new C34797e(getString(R.string.a85)));
        this.f153510af = new C40937d(new C34797e(getString(R.string.g8o)));
        this.f153511ag = new C40937d(new C34797e(getString(R.string.fmn)));
        this.f153512ah = new C40937d(new C34797e(getString(R.string.fmq), true, false));
        C43047dm dmVar = new C43047dm(this.f153521f);
        this.f153522g = dmVar;
        dmVar.f100359a.mo28083a(CommonItemViewCell.class);
        this.f153522g.f100359a.mo28083a(SettingFooterCell.class);
        this.f153522g.f100359a.mo28083a(SettingUnLoginCell.class);
        this.f153522g.mo73247a(this.f153507ac);
        this.f153522g.mo73247a(this.f153541z);
        this.f153522g.mo73247a(this.f153525j);
        this.f153522g.mo73247a(this.f153527l);
        this.f153522g.mo73247a(this.f153496S);
        this.f153522g.mo73247a(this.f153498U);
        this.f153522g.mo73247a(this.f153488K);
        this.f153522g.mo73247a(this.f153489L);
        this.f153522g.mo73247a(this.f153490M);
        this.f153522g.mo73247a(this.f153484G);
        this.f153522g.mo73247a(this.f153482E);
        this.f153522g.mo73247a(this.f153486I);
        this.f153522g.mo73247a(this.f153485H);
        this.f153522g.mo73247a(this.f153523h);
        this.f153522g.mo73247a(this.f153493P);
        this.f153522g.mo73247a(this.f153508ad);
        this.f153522g.mo73247a(this.f153526k);
        this.f153522g.mo73247a(this.f153505aa);
        this.f153522g.mo73247a(this.f153530o);
        this.f153522g.mo73247a(this.f153524i);
        this.f153522g.mo73247a(this.f153497T);
        this.f153522g.mo73247a(this.f153531p);
        this.f153522g.mo73247a(this.f153532q);
        this.f153522g.mo73247a(this.f153528m);
        this.f153522g.mo73247a(this.f153529n);
        this.f153522g.mo73247a(this.f153494Q);
        this.f153522g.mo73247a(this.f153495R);
        this.f153522g.mo73247a(this.f153491N);
        this.f153522g.mo73247a(this.f153503Z);
        this.f153522g.mo73247a(this.f153509ae);
        this.f153522g.mo73247a(this.f153539x);
        this.f153522g.mo73247a(this.f153499V);
        this.f153522g.mo73247a(this.f153479B);
        this.f153522g.mo73247a(this.f153500W);
        this.f153522g.mo73247a(this.f153510af);
        this.f153522g.mo73247a(this.f153534s);
        this.f153522g.mo73247a(this.f153533r);
        this.f153522g.mo73247a(this.f153492O);
        this.f153522g.mo73247a(this.f153540y);
        this.f153522g.mo73247a(this.f153511ag);
        this.f153522g.mo73247a(this.f153487J);
        this.f153522g.mo73247a(this.f153535t);
        this.f153522g.mo73247a(this.f153537v);
        this.f153522g.mo73247a(this.f153538w);
        this.f153522g.mo73247a(this.f153502Y);
        this.f153522g.mo73247a(this.f153478A);
        this.f153522g.mo73247a(this.f153536u);
        this.f153522g.mo73247a(this.f153501X);
        this.f153522g.mo73247a(this.f153512ah);
        this.f153522g.mo73247a(this.f153481D);
        this.f153522g.mo73247a(this.f153480C);
        this.f153522g.mo73247a(this.f153506ab);
        this.f153518c = findViewById(R.id.e7_);
        this.f153519d = (ViewGroup) findViewById(R.id.dnb);
        this.f153520e = (TextTitleBar) findViewById(R.id.eiz);
        mo108966a();
        mo108969c();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public void onAccountResult(int i, boolean z, int i2, User user) {
        DialogC58952a aVar;
        if (!isFinishing() && (aVar = this.f153515ak) != null && aVar.isShowing()) {
            this.f153515ak.dismiss();
        }
    }
}
