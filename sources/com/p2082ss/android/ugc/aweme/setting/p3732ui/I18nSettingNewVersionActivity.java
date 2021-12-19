package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.facebook.common.p1832d.C24086f;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.AbstractC34889bn;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.C43107dn;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.p2082ss.android.ugc.aweme.creatortools.api.C40455c;
import com.p2082ss.android.ugc.aweme.experiment.p2914a.C46680a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.live.AbstractC58646i;
import com.p2082ss.android.ugc.aweme.live.AbstractC58647j;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.p2310al.C33490e;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a;
import com.p2082ss.android.ugc.aweme.p2756df.C41465a;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.p4173ug.p4183h.C79675a;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63754k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63768ag;
import com.p2082ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p2082ss.android.ugc.aweme.setting.C68020bf;
import com.p2082ss.android.ugc.aweme.setting.C68082h;
import com.p2082ss.android.ugc.aweme.setting.C68084i;
import com.p2082ss.android.ugc.aweme.setting.api.DoBStatusApi;
import com.p2082ss.android.ugc.aweme.setting.api.LiveReplayApi;
import com.p2082ss.android.ugc.aweme.setting.model.C68180j;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68067b;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68070e;
import com.p2082ss.android.ugc.aweme.setting.p3724l.C68125a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.C68601u;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68546a;
import com.p2082ss.android.ugc.aweme.setting.services.C68431e;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.unit.p3736a.C68616a;
import com.p2082ss.android.ugc.aweme.setting.unit.p3736a.C68628b;
import com.p2082ss.android.ugc.aweme.setting.utils.C68687b;
import com.p2082ss.android.ugc.aweme.setting.utils.C68689d;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80466fy;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.utils.C80542hp;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity */
public class I18nSettingNewVersionActivity extends AbstractActivityC68607v implements WeakHandler.IHandler, AbstractC52909a, AbstractC90253j {

    /* renamed from: a */
    public ValueAnimator f153287a;

    /* renamed from: am */
    private List<String> f153288am;

    /* renamed from: an */
    private String f153289an = "";

    /* renamed from: ao */
    private int f153290ao;

    /* renamed from: ap */
    private boolean f153291ap;

    /* renamed from: aq */
    private final C88411a f153292aq = new C88411a();

    /* renamed from: b */
    AbstractC88412b f153293b = null;

    static {
        Covode.recordClassIndex(80738);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: f */
    public final int mo108972f() {
        return R.layout.axi;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(50, new RunnableC90250g(I18nSettingNewVersionActivity.class, "onEvent", C68067b.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(51, new RunnableC90250g(I18nSettingNewVersionActivity.class, "onEvent", C34572c.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(52, new RunnableC90250g(I18nSettingNewVersionActivity.class, "onSwitchBusinessAccountSuccessEvent", C68070e.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(53, new RunnableC90250g(I18nSettingNewVersionActivity.class, "onEvent", C33490e.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: c */
    public final void mo108969c() {
        super.mo108969c();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: u */
    public final void mo108991u() {
        C68020bf.m120317a(this);
    }

    /* renamed from: aa */
    private boolean m120919aa() {
        if (this.f153290ao == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: C */
    public final void mo108957C() {
        C68863ah.f154027a.mo109417b(this);
    }

    /* renamed from: U */
    private static boolean m120910U() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ab */
    private boolean m120920ab() {
        int i = this.f153290ao;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m120907B() {
        if (!C63768ag.m115321a() || C31575b.m65865g().getCurUser().getAccountType() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    private static boolean m120911V() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean U = m120910U();
        C58029j.f132256h = U;
        return U;
    }

    /* renamed from: Y */
    private void m120914Y() {
        if (!m120907B() || !C63754k.f144519b) {
            this.f153490M.mo70127a(false);
            return;
        }
        this.f153490M.mo70127a(true);
        this.f153488K.mo70127a(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: e */
    public final void mo108971e() {
        C39162r.m79460a("enter_kid_platform", new C33744d().f79943a);
        C39223a.m79602p().mo68653b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: i */
    public final C33103x mo108975i() {
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78671e = R.attr.m;
        xVar.f78672f = R.attr.m;
        xVar.f78674h = true;
        return xVar;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        this.f153292aq.mo142944a();
        C31575b.m65859a();
        C31575b.f75524a.mo57066b(this);
        SettingsManagerProxy.inst().removeSettingsWatcher(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: s */
    public final void mo108989s() {
        SmartRouter.buildRoute(this, "//live/container").withParam("fragment_type", "subscribe_info_list").open();
        C39162r.onEventV3("live_subscription_entry_clicked");
    }

    /* renamed from: S */
    private void m120908S() {
        if (!C31575b.m65865g().isLogin() || C39223a.m79602p().mo68649a() == IFamilyPairingService.EnumC39276a.CHILD) {
            this.f153528m.mo70127a(false);
        } else {
            this.f153528m.mo70127a(true);
        }
        if (!C31575b.m65865g().isLogin()) {
            this.f153529n.mo70127a(false);
        } else {
            this.f153529n.mo70127a(true);
        }
    }

    /* renamed from: X */
    private void m120913X() {
        if (this.f153489L == null) {
            return;
        }
        if (C80542hp.C80543a.m139625h() || (m120919aa() && C80542hp.C80543a.m139626i())) {
            this.f153489L.mo109135b(true);
        } else {
            this.f153489L.mo109135b(false);
        }
    }

    /* renamed from: Z */
    private void m120915Z() {
        if (!C31575b.m65865g().isLogin()) {
            return;
        }
        if (C80542hp.C80543a.m139626i()) {
            C63419ae.f143971a.mo101956a(new WeakHandler(this));
        } else if (C80542hp.C80543a.m139627j()) {
            C80542hp.C80543a.m139628k();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: A */
    public final void mo108956A() {
        if (!m120911V()) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
        } else {
            UgCommonServiceImpl.m138290j().mo123100b().mo123139a(this, true, "");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: D */
    public final void mo108958D() {
        C684924 r2 = new C68601u.AbstractC68603b() {
            /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.I18nSettingNewVersionActivity.C684924 */

            static {
                Covode.recordClassIndex(80742);
            }

            @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.C68601u.AbstractC68603b
            /* renamed from: b */
            public final void mo109006b() {
                I18nSettingNewVersionActivity.this.mo108967a(new C63511a("settings_page", "log_out_switch_account"));
            }

            @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.C68601u.AbstractC68603b
            /* renamed from: a */
            public final void mo109005a() {
                C31575b.m65859a();
                AbstractC34889bn k = C31575b.f75524a.mo57075k();
                if (!k.isOneKeyLoginExprimentEnable() || k.getSaveLoginStatus() || !k.isCurrentMethodAvaliable()) {
                    I18nSettingNewVersionActivity.this.mo108960F();
                    return;
                }
                I18nSettingNewVersionActivity i18nSettingNewVersionActivity = I18nSettingNewVersionActivity.this;
                C39162r.m79460a("remember_login_info_notify", new C33744d().mo59983a("user_id", C31575b.m65865g().getCurUserId()).mo59983a("enter_from", "logout").f79943a);
                C17197a.C17200a aVar = new C17197a.C17200a(i18nSettingNewVersionActivity);
                SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(i18nSettingNewVersionActivity);
                C20766v a = C20761r.m39060a(C34735v.m70965a(C31575b.m65865g().getCurUser().getAvatarThumb()));
                a.f49092E = smartAvatarImageView;
                a.mo34186c();
                aVar.mo27191a(smartAvatarImageView, 48, 48);
                aVar.f41067M = false;
                aVar.mo27189a(R.string.bt).mo27194b(R.string.bq).mo27195b(R.string.br, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC68599s(i18nSettingNewVersionActivity), false).mo27190a(R.string.bs, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC68600t(i18nSettingNewVersionActivity), false);
                aVar.mo27193a().mo27185c();
            }
        };
        C89219l.m154721d(r2, "");
        C68601u uVar = new C68601u();
        uVar.f153473a = r2;
        new C23226a.C23227a().mo37817a(uVar).mo37812a(1).f55057a.show(getSupportFragmentManager(), "logout_dialog_with_switch_account");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: I */
    public final void mo108963I() {
        C39162r.m79460a("enter_notification_setting", new C33744d().mo59983a("previous_page", "settings_page").mo59983a("enter_method", "click_button").f79943a);
        C39162r.onEvent(MobClick.obtain().setEventName("notification_setting").setLabelName("settings_page"));
        SmartRouter.buildRoute(this, "aweme://push_setting_manager").open();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: J */
    public final void mo108964J() {
        AbstractC58646i k = LiveOuterService.m107269s().mo95837k();
        if (k != null) {
            Bundle bundle = new Bundle();
            LiveOuterService.m107269s().mo95832f().mo120926a((String) k.mo95878a("live_replay_page_url", ""), bundle, this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: d */
    public final void mo108970d() {
        C39162r.m79460a("click_settings_ads", new C33744d().mo59983a("refer", "settings").mo59983a("user_id", C80580in.m139683b().getUid()).f79943a);
        Intent intent = new Intent(this, SettingAdsActivity.class);
        C84349a.m145093a(intent, this);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: g */
    public final void mo108973g() {
        boolean z;
        if (!m120920ab() || !C80542hp.C80543a.m139626i()) {
            z = false;
        } else {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        C89219l.m154721d("privacy_and_setting_page", "");
        Intent intent = new Intent(this, BusinessAccountActivity.class);
        intent.putExtra("enterFrom", "privacy_and_setting_page");
        if (valueOf != null) {
            valueOf.booleanValue();
            intent.putExtra("bundle_show_account_dialog_when_start", valueOf.booleanValue());
        }
        C84349a.m145093a(intent, this);
        startActivity(intent);
        C39162r.onEventV3("ttelite_setting_business_entry_clicked");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: j */
    public final void mo108976j() {
        super.mo108976j();
        DialogC17223o oVar = new DialogC17223o(this);
        oVar.show();
        DoBStatusApi.C67990a.m120303a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C68597q(this, oVar), new C68598r(this, oVar));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: k */
    public final void mo108977k() {
        C39162r.m79460a("enter_content_preference", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("previous_page", "settings_page").mo59983a("enter_method", "click_button").f79943a);
        SmartRouter.buildRoute(this, "aweme://contentpreference").open();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: m */
    public final void mo108979m() {
        super.mo108979m();
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_type", "analytics");
        C68687b.m121121a(this, "https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=" + C80534hh.m139611c(), hashMap);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        this.f153291ap = true;
        ValueAnimator valueAnimator = this.f153287a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f153287a.cancel();
        }
        this.f153293b = AbstractC88979t.m154296a(AbstractC88979t.m154310b(C39223a.m79604r()), C17873f.m33097e(), C68595o.f153464a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C68596p(this));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: y */
    public final void mo108995y() {
        C89219l.m154721d(this, "");
        if (!C68020bf.m120318a()) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
        } else {
            SmartRouter.buildRoute(this, "aweme://webview").withParam(Uri.parse("https://www.tiktok.com/legal/copyright-policy")).withParam("title", getString(R.string.au_)).open();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: z */
    public final void mo108996z() {
        C59206ab.m108755a("enter_privacy_setting").mo96746b("enter_from", "settings_page").mo96746b("enter_method", "click_button").mo96792f();
        SmartRouter.buildRoute(this, "//privacy/setting").open();
        C39162r.onEvent(MobClick.obtain().setEventName("privacy").setLabelName("settings"));
    }

    /* renamed from: T */
    private void m120909T() {
        if (!C31575b.m65865g().isLogin() || !C63754k.f144519b) {
            this.f153489L.mo70127a(false);
            return;
        }
        this.f153489L.mo109133a(getResources().getString(R.string.b24));
        this.f153489L.mo70127a(true);
        this.f153488K.mo70127a(false);
        this.f153289an = UUID.randomUUID().toString();
        if (C63768ag.m115321a() && C31575b.m65865g().getCurUser().getAccountType() == 2) {
            C39162r.m79460a("show_creator_account_cell", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("process_id", this.f153289an).f79943a);
        }
    }

    /* renamed from: W */
    private void m120912W() {
        User curUser = C31575b.m65865g().getCurUser();
        if (!SharePrefCache.inst().getCanCreateInsights().mo59941c().booleanValue() || curUser == null || !curUser.getIsCreater()) {
            this.f153488K.mo70127a(false);
        } else {
            this.f153488K.mo70127a(true);
        }
        if (C34597d.m70641h().mo61055a("show_insights_red", false)) {
            this.f153488K.mo109135b(true);
        } else {
            this.f153488K.mo109135b(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo108959E() {
        C17197a.C17200a aVar = new C17197a.C17200a(this);
        aVar.mo27189a(R.string.as7).mo27195b(R.string.a8y, DialogInterface$OnClickListenerC68585e.f153454a, false).mo27190a(R.string.cy1, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC68586f(this), false);
        if (C31575b.m65860b().isEnableMultiAccountLogin()) {
            aVar.f41071b = C80580in.m139684b(C31575b.m65865g().getCurUser());
        }
        Dialog c = aVar.mo27193a().mo27185c();
        if (c != null) {
            View findViewById = c.findViewById(16908299);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setGravity(8388611);
            }
        }
    }

    /* renamed from: F */
    public final void mo108960F() {
        if (!m120911V()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        C39162r.m79460a("log_out", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("user_id", C31575b.m65865g().getCurUserId()).mo59980a("f_mode", 0).f79943a);
        C31575b.m65859a();
        C31575b.f75524a.mo57064a(this);
        runOnUiThread(new RunnableC68562bn(this));
        C31575b.m65860b().logout("user_logout", "user_logout");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: G */
    public final void mo108961G() {
        super.mo108961G();
        if (C46680a.m90086a()) {
            C68616a aVar = this.f153539x;
            aVar.mo70126a(new C68616a.C68621e(aVar));
            this.f153539x.mo109133a(getString(R.string.c0a));
            return;
        }
        AbstractC88979t.m154294a(new C68587g(this)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C68588h(this), new C68589i(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: H */
    public final void mo108962H() {
        boolean a = C46680a.m90086a();
        C51423a.m95784a(3, "clear-cache", "enableSettingDiskManager: ".concat(String.valueOf(a)));
        if (a) {
            SmartRouter.buildRoute(this, "//setting/diskmanager").open();
            return;
        }
        C59206ab.m108755a("click_clean_cache_button").mo96746b("enter_from", "settings_page").mo96792f();
        C1731i.m5640b(new CallableC68590j(this), C1731i.f5562a).mo5534a(new C68591k(this), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: b */
    public final AbstractC40931a[] mo108968b() {
        if (C79675a.m138490a()) {
            return new AbstractC40931a[]{this.f153523h, this.f153482E, this.f153525j, this.f153485H, this.f153494Q, this.f153480C, this.f153486I, this.f153481D, this.f153496S};
        }
        return new AbstractC40931a[]{this.f153523h, this.f153482E, this.f153525j, this.f153485H, this.f153526k, this.f153494Q, this.f153480C, this.f153486I, this.f153481D, this.f153496S};
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: h */
    public final void mo108974h() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "settings_page");
        hashMap.put("scene_id", "1003");
        C39162r.m79460a("enter_wallet_page", hashMap);
        C39162r.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
        C39162r.m79460a("wallet_click", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
        C41465a.m83381a(this, "page_index");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: l */
    public final void mo108978l() {
        boolean z = true;
        SmartRoute withParam = SmartRouter.buildRoute(this, "aweme://creatortools").withParam("bundle_process_id", this.f153289an).withParam("HAS_PRELOAD", true).withParam("PRO_ENTER_FROM", "creator_tools");
        if (!m120920ab() || !C80542hp.C80543a.m139626i()) {
            z = false;
        }
        withParam.withParam("bundle_show_account_dialog_when_start", z).open();
        C39162r.m79460a("enter_creator_account", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("process_id", this.f153289an).f79943a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: p */
    public final void mo108986p() {
        C68125a.m120415a().storeBoolean("referral_code_badge", true);
        this.f153493P.mo109135b(false);
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<String> referralEntrance = inst.getReferralEntrance();
        C89219l.m154716b(referralEntrance, "");
        String c = referralEntrance.mo59941c();
        C89219l.m154716b(c, "");
        SmartRouter.buildRoute(this, "aweme://webview").withParam("use_webview_title", true).withParam(Uri.parse(c)).open();
        C39162r.m79460a("click_referral_invite_friends", C24086f.m45603of("enter_from", "settings_page"));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: q */
    public final void mo108987q() {
        C89219l.m154721d(this, "");
        if (!C68020bf.m120318a()) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        C29844g gVar = new C29844g("https://support.tiktok.com");
        gVar.mo52130a("lang", LocalServiceImpl.m108272a().mo96421a(this));
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", gVar.mo52126a()).withParam("title", getString(R.string.bvd)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: t */
    public final void mo108990t() {
        C89219l.m154721d(this, "");
        if (!C68020bf.m120318a()) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        C39162r.m79460a("click_safety_center", new C33744d().f79943a);
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", "https://www.tiktok.com/" + LocalServiceImpl.m108272a().mo96421a(this) + "/safety/").withParam("title", getString(R.string.fd0)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: v */
    public final void mo108992v() {
        if (!m120911V()) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        C39162r.m79460a("enter_imprint", new C33744d().mo59983a("previous_page", "settings_page").mo59983a("enter_method", "click_button").f79943a);
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", C39223a.m79590d().mo68619d()).withParam("title", getString(R.string.fjp)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: w */
    public final void mo108993w() {
        C89219l.m154721d(this, "");
        if (!C68020bf.m120318a()) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        C29844g gVar = new C29844g("https://www.tiktok.com/community-guidelines");
        gVar.mo52130a("lang", LocalServiceImpl.m108272a().mo96421a(this));
        gVar.mo52130a("enter_from", "settings");
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", gVar.mo52126a()).withParam("title", getString(R.string.arm)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: x */
    public final void mo108994x() {
        if (!m120911V()) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        String e = C39223a.m79590d().mo68620e();
        if (TextUtils.isEmpty(e)) {
            e = C80466fy.m139470a("privacy-policy");
        }
        SmartRouter.buildRoute(this, "aweme://webview").withParam(Uri.parse(e)).withParam("hide_status_bar", true).withParam("title", getString(R.string.eru)).open();
        C39162r.m79460a("enter_privacy_policy_entrance", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: n */
    public final void mo108980n() {
        if (!CrossLanguageUserExperiment.m103003c().mo93973b()) {
            C59206ab.m108755a("enter_general_setting").mo96746b("previous_page", "settings_page").mo96746b("enter_method", "click_button").mo96792f();
            C39162r.m79460a("display_settings", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
            SmartRouter.buildRoute(this, "aweme://display/setting").open();
        } else if (getIntent() == null || ((!"translate_tts".equals(m120917a(getIntent(), "enter_from")) && !"translate_subtitle".equals(m120917a(getIntent(), "enter_from"))) || this.f153530o == null)) {
            SmartRouter.buildRoute(this, "aweme://display/caption/setting").withParam("enter_method", "setting_page").open();
        } else {
            ValueAnimator valueAnimator = this.f153287a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f153287a.cancel();
            }
            C39162r.m79460a("enter_language_setting", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("enter_method", m120917a(getIntent(), "enter_from")).f79943a);
            SmartRouter.buildRoute(this, "aweme://display/caption/setting").withParam("enter_method", m120917a(getIntent(), "enter_from")).open();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: o */
    public final void mo108981o() {
        if (!m120911V()) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        C39162r.m79460a("enter_feedback_page", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
        C39162r.m79460a("FAQ", new C33744d().mo59983a("enter_from", "settings").f79943a);
        C39162r.m79460a("click_feedback_entrance", new C33744d().mo59983a("enter_from", "settings").f79943a);
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://webview");
        try {
            C36125t.m73598a(C36125t.m73591a(), C52912c.f121688a.f121689b.getFeedbackConf().getNormalEntry());
        } catch (Exception unused) {
            C29844g gVar = new C29844g("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/");
            gVar.mo52130a("locale", C53457c.m98651a(this).getLanguage());
            if (C17867d.m33090k()) {
                gVar.mo52128a("is_lite", 1);
            }
            gVar.mo52130a("enter_from", "settings");
            buildRoute.withParam(Uri.parse(gVar.toString())).withParam("hide_nav_bar", true).open();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: r */
    public final void mo108988r() {
        List<String> list;
        C89219l.m154721d(this, "");
        if (!C68020bf.m120318a()) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        String h = SettingServiceImpl.m120782v().mo108872h();
        Objects.requireNonNull(h, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = h.toLowerCase();
        C89219l.m154716b(lowerCase, "");
        String g = C58071d.m104913g();
        String str = null;
        if (g != null) {
            Objects.requireNonNull(g, "null cannot be cast to non-null type java.lang.String");
            str = g.toLowerCase();
            C89219l.m154716b(str, "");
        }
        String str2 = "en-us";
        if (!TextUtils.isEmpty(lowerCase) && !TextUtils.isEmpty(str)) {
            String str3 = lowerCase + '-' + str;
            C68082h a = C68084i.m120386a();
            if (!(a == null || (list = a.f152478a) == null || !C89070n.m154556a((Iterable) list, (Object) str3))) {
                str2 = str3;
            }
        }
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", new C29844g("https://www.tiktok.com/creators/creator-portal/" + str2 + '/').mo52126a()).withParam("title", getString(R.string.b3d)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: a */
    public final void mo108966a() {
        super.mo108966a();
        String a = C1764a.m5928a(getString(R.string.fnn), new Object[]{C17867d.m33088i(), Long.valueOf(C17867d.m33087h())});
        C68628b bVar = this.f153506ab;
        String str = a + "";
        C89219l.m154721d(str, "");
        bVar.mo70126a(new C68628b.C68632d(bVar, str));
        if (LiveHostOuterService.m107232p() == null || TextUtils.equals(C17867d.f42595s, "amazon")) {
            this.f153482E.mo70127a(false);
        } else {
            this.f153482E.mo70127a(true);
        }
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<String> referralEntrance = inst.getReferralEntrance();
        C89219l.m154716b(referralEntrance, "");
        if (!TextUtils.isEmpty(referralEntrance.mo59941c())) {
            this.f153493P.mo70127a(true);
            if (!C68125a.m120415a().getBoolean("referral_code_badge", false)) {
                this.f153493P.mo109135b(true);
            }
        }
        this.f153491N.mo70127a(false);
        this.f153492O.mo70127a(true);
        if (C31575b.m65860b().isEnableMultiAccountLogin()) {
            this.f153486I.mo70127a(true);
        }
        m120908S();
        this.f153519d.setBackgroundColor(C0643b.m2378c(this.f153519d.getContext(), R.color.l));
        this.f153520e.setBackgroundColor(C0643b.m2378c(this.f153519d.getContext(), R.color.l));
        this.f153523h.mo70127a(false);
        this.f153540y.mo70127a(false);
        mo109093K();
        if (getIntent() == null) {
            return;
        }
        if ("translate_tts".equals(m120917a(getIntent(), "enter_from")) || "translate_subtitle".equals(m120917a(getIntent(), "enter_from"))) {
            final ValueAnimator ofInt = ValueAnimator.ofInt(0, 300);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new C68584d(this));
            ofInt.addListener(new Animator.AnimatorListener() {
                /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.I18nSettingNewVersionActivity.C684891 */

                static {
                    Covode.recordClassIndex(80739);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    I18nSettingNewVersionActivity.this.f153287a = ofInt;
                }

                public final void onAnimationCancel(Animator animator) {
                    I18nSettingNewVersionActivity.this.f153530o.mo109132a(C17177c.m31711c(I18nSettingNewVersionActivity.this));
                }

                public final void onAnimationEnd(Animator animator) {
                    I18nSettingNewVersionActivity.this.f153530o.mo109132a(C17177c.m31711c(I18nSettingNewVersionActivity.this));
                }
            });
            ofInt.setStartDelay(800);
            final ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 300);
            ofInt2.setDuration(300L);
            ofInt2.addUpdateListener(new C68593m(this));
            ofInt2.addListener(new Animator.AnimatorListener() {
                /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.I18nSettingNewVersionActivity.C684902 */

                static {
                    Covode.recordClassIndex(80740);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    ofInt.start();
                }

                public final void onAnimationCancel(Animator animator) {
                    I18nSettingNewVersionActivity.this.f153530o.mo109132a(C17177c.m31711c(I18nSettingNewVersionActivity.this));
                }

                public final void onAnimationStart(Animator animator) {
                    I18nSettingNewVersionActivity.this.f153530o.mo109132a(new ColorDrawable(C0643b.m2378c(I18nSettingNewVersionActivity.this, R.color.p2)));
                    I18nSettingNewVersionActivity.this.f153287a = ofInt2;
                }
            });
            ofInt2.setStartDelay(500);
            ofInt2.start();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onResume", true);
        super.onResume();
        if (!C31575b.m65865g().isLogin()) {
            if (PrivacyServiceImpl.m80573d().mo68680b()) {
                this.f153527l.mo70127a(true);
            } else {
                this.f153527l.mo70127a(false);
            }
        } else if (!((C68546a) this.f153527l.f95762k).f153370g) {
            this.f153527l.mo70127a(true);
        }
        m120908S();
        m120912W();
        m120909T();
        if (C31575b.m65865g().isLogin()) {
            this.f153505aa.mo70127a(true);
        } else {
            this.f153505aa.mo70127a(false);
        }
        m120914Y();
        m120913X();
        if (this.f153288am == null) {
            this.f153288am = C68431e.f153187a.mo108854b();
        }
        if (this.f153288am != null) {
            C68689d.m121122a(this.f153522g, this.f153288am);
        }
        List<String> b = C39223a.m79590d().mo68617b();
        if (!C13603b.m24435a((Collection) b)) {
            C43047dm dmVar = this.f153522g;
            C89219l.m154721d(dmVar, "");
            C89219l.m154721d(b, "");
            List<AbstractC40931a<?>> a = dmVar.mo73245a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                AbstractC40931a<?> aVar = a.get(i);
                Object c = aVar.mo70132l().mo61502c();
                if ((c instanceof String) && !TextUtils.isEmpty((CharSequence) c) && b.contains(c)) {
                    aVar.mo70127a(false);
                }
            }
        }
        if (CrossLanguageUserExperiment.m103003c().mo93973b()) {
            this.f153530o.mo109133a(getResources().getString(R.string.ctn));
        } else {
            this.f153530o.mo109133a(getResources().getString(R.string.fo4));
            this.f153530o.mo109134b(C53438a.m98624b(this));
        }
        if (this.f153291ap && m120919aa()) {
            m120915Z();
        }
        C43107dn.m86004a();
        this.f153291ap = false;
        this.f153293b = AbstractC88979t.m154310b(C39223a.m79604r()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C68594n(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onResume", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a
    /* renamed from: a */
    public final void mo61665a(IESSettingsProxy iESSettingsProxy) {
        m120909T();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onSwitchBusinessAccountSuccessEvent(C68070e eVar) {
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v
    /* renamed from: a */
    public final void mo108967a(C63511a aVar) {
        C63419ae.f143971a.mo101957a(getSupportFragmentManager(), aVar, "choose_account_dialog");
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C34572c cVar) {
        m120912W();
        m120909T();
        m120914Y();
        m120913X();
    }

    /* renamed from: a */
    public static File m120916a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C33490e eVar) {
        SmartRouter.buildRoute(this, "aweme://main?tab=1").withParam("tab", 1).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME").addFlags(67108864).open();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo108965a(C1731i iVar) {
        if (!iVar.mo5535a()) {
            return null;
        }
        this.f153539x.mo109134b("0.0MB");
        new C79459a(this).mo123050a(R.string.ag6).mo123053a();
        return null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        UserResponse userResponse;
        User user;
        Object obj = message.obj;
        if ((obj instanceof UserResponse) && (user = (userResponse = (UserResponse) obj).getUser()) != null && userResponse.status_code == 0) {
            int proAccountUpdateNotificationStatus = user.getProAccountUpdateNotificationStatus();
            this.f153290ao = proAccountUpdateNotificationStatus;
            if (proAccountUpdateNotificationStatus < 0 || proAccountUpdateNotificationStatus > 2) {
                this.f153290ao = 0;
            }
            m120913X();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C68067b bVar) {
        m120912W();
        m120909T();
        m120914Y();
        m120913X();
        C43107dn.m86004a();
    }

    /* renamed from: a */
    public static boolean m120918a(File file) {
        MethodCollector.m26663i(2542);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(2542);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(2542);
        return delete;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onCreate", true);
        C58221f.m105144a(EnumC58148ab.SETTING);
        activityConfiguration(C68571c.f153422a);
        super.onCreate(bundle);
        this.f153531p.mo109131a(0);
        this.f153532q.mo109131a(0);
        if (!C17867d.m33090k() && ((Integer) LiveOuterService.m107269s().mo95837k().mo95878a("mt_anchor_center_type", 0)).intValue() == 0) {
            String str = Api.f79771d;
            C89219l.m154716b(str, "");
            C27646l.m55298a(((LiveReplayApi) C18097a.m33696a().mo28816a(str).mo28858a(LiveReplayApi.class)).getLiveReplayEntrance(), new AbstractC27645k<C68180j>() {
                /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.I18nSettingNewVersionActivity.C684913 */

                static {
                    Covode.recordClassIndex(80741);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                    String str;
                    AbstractC58647j m = LiveOuterService.m107269s().mo95839m();
                    if (m != null) {
                        HashMap hashMap = new HashMap();
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = "";
                        }
                        hashMap.put("error_msg", str);
                        hashMap.put("error_code", -1);
                        m.mo34111a("ttlive_live_replay_setting_entrance_show_all", 1, hashMap);
                        m.mo34111a("ttlive_live_replay_setting_entrance_show_error", 1, hashMap);
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(C68180j jVar) {
                    int i;
                    C68180j jVar2 = jVar;
                    if (jVar2 != null) {
                        if (jVar2.f152658a != 1 || C17867d.m33090k()) {
                            I18nSettingNewVersionActivity.this.f153531p.mo70127a(false);
                        } else {
                            I18nSettingNewVersionActivity.this.f153531p.mo70127a(true);
                        }
                    }
                    AbstractC58647j m = LiveOuterService.m107269s().mo95839m();
                    if (m != null) {
                        HashMap hashMap = new HashMap();
                        if (jVar2 != null) {
                            i = new StringBuilder().append(jVar2.f152658a).toString();
                        } else {
                            i = -1;
                        }
                        hashMap.put("live_replay_show", i);
                        m.mo34111a("ttlive_live_replay_setting_entrance_show_all", 0, hashMap);
                    }
                }
            }, ExecutorC34605m.f81660a);
        }
        User b = C80580in.m139683b();
        if (!(b == null || b.getCommerceUserInfo() == null)) {
            if (b.getCommerceUserInfo().isHasAdExperienceEntry() || b.getCommerceUserInfo().isHasAdFeedbackEntry()) {
                this.f153532q.mo70127a(true);
                if (!TextUtils.isEmpty(b.getCommerceUserInfo().getAdExperienceText())) {
                    this.f153532q.mo109133a(b.getCommerceUserInfo().getAdExperienceText());
                }
            } else {
                this.f153532q.mo70127a(false);
            }
        }
        SettingsManagerProxy.inst().registerSettingsWatcher(this, false);
        m120915Z();
        C40455c.f94676a = null;
        C40455c.m81691a(true, this.f153292aq, null);
        C39162r.m79460a("proaccount_enter_for_experiment", new C33744d().mo59983a("verify_proaccount_server_exp", String.valueOf(C16048b.m29633a().mo25421a(true, "verify_proaccount_server_exp", false))).mo59983a("verify_proaccount_precise_exp", String.valueOf(C16048b.m29633a().mo25421a(true, "verify_proaccount_precise_exp", false))).mo59983a("verify_proaccount_precise_did_exp", String.valueOf(C16048b.m29633a().mo25421a(true, "verify_proaccount_precise_did_exp", false))).f79943a);
        if (C39223a.m79604r().mo68637a((AbstractC39273a) null) && !isFinishing()) {
            C39223a.m79604r().mo68636a(this, "deeplink");
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m120917a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity$a */
    static class C68493a {

        /* renamed from: a */
        ITpcConsentService f153301a;

        /* renamed from: b */
        boolean f153302b;

        /* renamed from: c */
        WeakReference<Activity> f153303c;

        static {
            Covode.recordClassIndex(80743);
        }

        public C68493a(ITpcConsentService iTpcConsentService, Activity activity) {
            this.f153301a = iTpcConsentService;
            this.f153302b = iTpcConsentService.mo68637a((AbstractC39273a) null);
            this.f153303c = new WeakReference<>(activity);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 19 && i2 == -1) {
            UgCommonServiceImpl.m138290j().mo123100b().mo123140a("app_update_click");
        }
    }
}
