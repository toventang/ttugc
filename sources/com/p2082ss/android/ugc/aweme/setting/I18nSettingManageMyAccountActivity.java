package com.p2082ss.android.ugc.aweme.setting;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.android.ecommerce.p165k.C2841l;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1712a.C23018b;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1716e.C23056g;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.AbstractC40763cv;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.creatortools.api.CanQuitBusinessAccountApi;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import com.p2082ss.android.ugc.aweme.p2727db.C40934c;
import com.p2082ss.android.ugc.aweme.p2727db.C40937d;
import com.p2082ss.android.ugc.aweme.p2727db.C40941f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63768ag;
import com.p2082ss.android.ugc.aweme.setting.api.C68000c;
import com.p2082ss.android.ugc.aweme.setting.api.IChangePhoneHelperApi;
import com.p2082ss.android.ugc.aweme.setting.api.IUnbindValidateApi;
import com.p2082ss.android.ugc.aweme.setting.model.C68178h;
import com.p2082ss.android.ugc.aweme.setting.p3714b.C68013a;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68070e;
import com.p2082ss.android.ugc.aweme.setting.p3722j.AbstractC68113a;
import com.p2082ss.android.ugc.aweme.setting.p3722j.C68114b;
import com.p2082ss.android.ugc.aweme.setting.verification.C68706b;
import com.p2082ss.android.ugc.aweme.setting.verification.C68707c;
import com.p2082ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.p2082ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80542hp;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.SoftReference;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity */
public class I18nSettingManageMyAccountActivity extends ActivityC17312a implements WeakHandler.IHandler, AbstractC90252i, AbstractC90253j {

    /* renamed from: p */
    private static final boolean f152248p = false;

    /* renamed from: a */
    protected User f152249a;

    /* renamed from: b */
    protected boolean f152250b;

    /* renamed from: c */
    protected boolean f152251c;

    /* renamed from: d */
    C68178h f152252d = new C68178h();

    /* renamed from: e */
    TextView f152253e;

    /* renamed from: f */
    C40941f f152254f;

    /* renamed from: g */
    C40941f f152255g;

    /* renamed from: h */
    C40941f f152256h;

    /* renamed from: i */
    C40941f f152257i;

    /* renamed from: j */
    C40941f f152258j;

    /* renamed from: k */
    C40941f f152259k;

    /* renamed from: l */
    C40934c f152260l;

    /* renamed from: m */
    C40941f f152261m;

    /* renamed from: n */
    TuxIconView f152262n;

    /* renamed from: o */
    TuxTextView f152263o;

    /* renamed from: q */
    private C68707c f152264q;

    /* renamed from: r */
    private WeakHandler f152265r;

    /* renamed from: s */
    private final C88411a f152266s = new C88411a();

    /* renamed from: t */
    private C43047dm f152267t;

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(52, new RunnableC90250g(I18nSettingManageMyAccountActivity.class, "onSwitchBusinessAccountSuccessEvent", C68070e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo108557a(final boolean z) {
        final DialogC17223o oVar = new DialogC17223o(this);
        oVar.show();
        IUnbindValidateApi iUnbindValidateApi = IUnbindValidateApi.C67992a.f152330a;
        String a = AbstractC22384h.m42212a(C29736b.f70924e + "/passport/email/unbind_validate/");
        C89219l.m154716b(a, "");
        iUnbindValidateApi.unbindEmailValidate(a).mo5534a(new AbstractC1729g<C68000c, Object>() {
            /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.C679658 */

            static {
                Covode.recordClassIndex(80137);
            }

            @Override // p077b.AbstractC1729g
            public final Object then(C1731i<C68000c> iVar) {
                oVar.dismiss();
                if (!C80214ai.m139043a(iVar) || iVar.mo5545d().f152349b == null) {
                    I18nSettingManageMyAccountActivity.this.mo108560c();
                    I18nSettingManageMyAccountActivity.m120255a("unlink", false, z, -1);
                    return null;
                }
                C68000c.C68001a aVar = iVar.mo5545d().f152349b;
                int i = aVar.f152350a;
                I18nSettingManageMyAccountActivity.m120255a("unlink", false, z, i);
                if (i == 0) {
                    I18nSettingManageMyAccountActivity.this.f152251c = true;
                    C31575b.m65863e().unbindEmail(I18nSettingManageMyAccountActivity.this, z, aVar.f152351b, "manage_my_account");
                    return null;
                }
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                i18nSettingManageMyAccountActivity.mo108559b(i18nSettingManageMyAccountActivity.mo108553a(false, aVar.f152350a));
                return null;
            }
        }, C1731i.f5564c, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo108556a(DialogInterface dialogInterface, int i, int i2) {
        if (i == 14 && i2 == 1) {
            C31575b.m65865g().queryUser();
            C39223a.m79605s().mo68678a();
            m120256b(true);
            new C79459a(this).mo123052a(getResources().getString(R.string.g9c)).mo123053a();
            if (C16083j.m29874a().mo25538c()) {
                SettingManagerServiceImpl.m121205b().mo108578a(1);
            } else {
                SettingManagerServiceImpl.m121205b().mo108579a(this);
            }
            SettingManagerServiceImpl.m121205b().mo108577a();
            C39162r.m79460a("switch_to_personal_account_success", new HashMap());
        } else {
            mo108558b();
        }
        dialogInterface.dismiss();
    }

    static {
        Covode.recordClassIndex(80128);
    }

    /* renamed from: m */
    private void m120258m() {
        this.f152249a = C31575b.m65865g().getCurUser();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo108558b() {
        new C79459a(this).mo123050a(R.string.dcr).mo123053a();
    }

    /* renamed from: n */
    private void m120259n() {
        User user = this.f152249a;
        if (user != null && user.getBindPhone() != null) {
            this.f152254f.mo70136a(m120257c(this.f152249a.getBindPhone()));
        }
    }

    /* renamed from: c */
    public final void mo108560c() {
        new C23144b(this).mo37640e(R.string.c3i).mo37637b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ C89391z mo108561d() {
        this.f152251c = true;
        m120255a("change", false, false, -1);
        C31575b.m65863e().changeUnverifiedEmail(this, "manage_my_account", new Bundle());
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ C89391z mo108562e() {
        this.f152251c = true;
        m120255a("verify", false, false, -1);
        C31575b.m65863e().verifyEmail(this, "manage_my_account", new Bundle(), null);
        return C89391z.f203057a;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        this.f152264q.f153712a.mo142944a();
        EventBus.m156962a().mo145395b(this);
        this.f152265r = null;
        this.f152266s.dispose();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ C89391z mo108564f() {
        C39162r.m79460a("enter_email_setting", new C33744d().mo59983a("status", "verified").f79943a);
        this.f152251c = true;
        m120255a("change", false, true, -1);
        C31575b.m65863e().changeEmail(this, "manage_my_account", new Bundle(), null);
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ C89391z mo108565g() {
        m120255a("change", true, false, -1);
        C679571 r1 = new AbstractC68113a() {
            /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.C679571 */

            static {
                Covode.recordClassIndex(80129);
            }

            @Override // com.p2082ss.android.ugc.aweme.setting.p3722j.AbstractC68113a
            /* renamed from: a */
            public final void mo108572a(boolean z, boolean z2) {
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C23208a.C23214e().mo37788a(i18nSettingManageMyAccountActivity.getString(R.string.doe)).mo37786a(new View.OnClickListener() {
                    /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.View$OnClickListenerC679603 */

                    static {
                        Covode.recordClassIndex(80132);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        I18nSettingManageMyAccountActivity.this.f152251c = true;
                        C31575b.m65863e().modifyMobile(I18nSettingManageMyAccountActivity.this, "manage_my_account", null, null);
                    }
                }));
                if (z) {
                    arrayList.add(new C23208a.C23214e().mo37788a(i18nSettingManageMyAccountActivity.getString(R.string.dod)).mo37786a(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.View$OnClickListenerC679614 */

                        static {
                            Covode.recordClassIndex(80133);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            I18nSettingManageMyAccountActivity.this.f152251c = true;
                            C31575b.m65863e().modifyMobileVerifyByEmail(I18nSettingManageMyAccountActivity.this, "manage_my_account", null, null);
                        }
                    }));
                }
                if (z2) {
                    arrayList.add(new C23208a.C23214e().mo37788a(i18nSettingManageMyAccountActivity.getString(R.string.dof)).mo37786a(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.View$OnClickListenerC679625 */

                        static {
                            Covode.recordClassIndex(80134);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            I18nSettingManageMyAccountActivity.this.f152251c = true;
                            C31575b.m65863e().modifyMobileVerifyByPassword(I18nSettingManageMyAccountActivity.this, "manage_my_account", null, null);
                        }
                    }));
                }
                C23208a.C23211b bVar = new C23208a.C23211b();
                bVar.f55001a.f54988i = Integer.valueOf((int) R.string.dog);
                bVar.mo37799b(arrayList).mo37800b().show(i18nSettingManageMyAccountActivity.getSupportFragmentManager(), (String) null);
            }
        };
        C89219l.m154721d(r1, "");
        C68114b.f152519a = new SoftReference<>(r1);
        C89219l.m154721d("change_mobile_without_old_mobile", "");
        C89219l.m154721d("change_mobile_without_old_mobile", "");
        IChangePhoneHelperApi.C67991a.f152327a.safeEnv("change_mobile_without_old_mobile", "change_mobile_without_old_mobile").mo5532a(C68114b.C68117c.f152523a);
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ C89391z mo108566h() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f152252d.getAppealUrl()));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            C84349a.m145093a(intent, this);
            startActivity(intent);
            return null;
        } catch (ActivityNotFoundException unused) {
            SmartRouter.buildRoute(this, "//webview").withParam(Uri.parse(this.f152252d.getAppealUrl())).open();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo108568j() {
        C39162r.onEventV3("manage_account_password_click");
        this.f152251c = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("have_set_password", this.f152250b);
        C31575b.m65864f().changePassword(this, "manage_my_account", "password_click", bundle, null);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", true);
        super.onResume();
        C31575b.m65865g().getSetPasswordStatus(new AbstractC40763cv() {
            /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.C679669 */

            static {
                Covode.recordClassIndex(80138);
            }

            @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
            /* renamed from: a */
            public final void mo57507a(String str) {
            }

            @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
            /* renamed from: a */
            public final void mo57508a(boolean z) {
                I18nSettingManageMyAccountActivity.this.f152250b = z;
                SharePrefCache.inst().getUserHasPassword().mo59940b(Boolean.valueOf(I18nSettingManageMyAccountActivity.this.f152250b));
            }
        });
        if (this.f152251c) {
            this.f152251c = false;
            m120258m();
            m120254a(this.f152249a);
            m120259n();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
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

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo108567i() {
        m120258m();
        int i = 0;
        C39162r.m79460a("ttelite_click_backto_PA_button", new C33744d().mo59980a("status", 0).f79943a);
        if (C63768ag.m115321a()) {
            MixFeedService.m109435k().mo97322a(true);
            if (this.f152249a.getAccountType() == 3) {
                C88411a aVar = this.f152266s;
                String str = C29736b.f70924e;
                C89219l.m154716b(str, "");
                aVar.mo142945a(((CanQuitBusinessAccountApi) C18097a.m33696a().mo28816a(str).mo28858a(CanQuitBusinessAccountApi.class)).check().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C67973ae(this), new C67974af(this)));
                return;
            } else if (this.f152249a.getAccountType() == 2) {
                if (!C80542hp.C80543a.m139621d() || !C80542hp.C80543a.m139618a()) {
                    i = R.string.exl;
                } else {
                    i = R.string.a7t;
                }
            } else if (!C80542hp.C80543a.m139621d() || !C80542hp.C80543a.m139618a()) {
                i = R.string.b6j;
            } else {
                i = R.string.gax;
            }
        }
        mo108555a(i, R.string.g94);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo108570l() {
        boolean isPhoneBinded = C31575b.m65865g().getCurUser().isPhoneBinded();
        C39162r.m79460a("manage_account_phone_click", new C33744d().mo59980a("phone_binding_status", isPhoneBinded ? 1 : 0).f79943a);
        if (isPhoneBinded) {
            C39162r.m79460a("show_unlink_phone_email_popup", new C33744d().mo59983a("enter_from", "manage_my_account").mo59983a("unlink_type", "phone").f79943a);
            final C23025b bVar = new C23025b(this);
            bVar.f54513b = true;
            bVar.mo37417a(getString(R.string.h2f), new C67976ah(this));
            bVar.mo37417a(getString(R.string.h2j), new C67977ai(this));
            final DialogC17223o oVar = new DialogC17223o(this);
            oVar.show();
            C68707c cVar = this.f152264q;
            User user = this.f152249a;
            C679582 r1 = new C68706b() {
                /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.C679582 */

                static {
                    Covode.recordClassIndex(80130);
                }

                @Override // com.p2082ss.android.ugc.aweme.setting.verification.C68706b
                /* renamed from: a */
                public final void mo108573a() {
                    oVar.dismiss();
                }

                @Override // com.p2082ss.android.ugc.aweme.setting.verification.C68706b
                /* renamed from: a */
                public final void mo69127a(VerificationResponse verificationResponse) {
                    StringBuilder sb = new StringBuilder(I18nSettingManageMyAccountActivity.this.getString(R.string.h2g));
                    C23023b a = new C23023b(I18nSettingManageMyAccountActivity.this).mo37411b(I18nSettingManageMyAccountActivity.this.getString(R.string.h2i, new Object[]{"\n" + I18nSettingManageMyAccountActivity.this.f152249a.getBindPhone()})).mo37413d(sb.toString()).mo37407a(bVar).mo37409a(new C23056g(I18nSettingManageMyAccountActivity.this, R.raw.icon_phone));
                    a.f54502a = true;
                    C23023b bVar = (C23023b) a.mo37481a(new AbstractC89172b<C23013a, C89391z>() {
                        /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.C679582.C679591 */

                        static {
                            Covode.recordClassIndex(80131);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C23013a aVar) {
                            return m120281a(aVar);
                        }

                        /* renamed from: a */
                        private static C89391z m120281a(C23013a aVar) {
                            Object obj = aVar.f54577j;
                            if (!(obj instanceof String) || !TextUtils.equals("button_close", (String) obj)) {
                                return null;
                            }
                            I18nSettingManageMyAccountActivity.m120255a("x-out", true, false, -1);
                            return null;
                        }
                    }).mo37482a(false);
                    if (verificationResponse.shouldShowChangeMobileDialog()) {
                        TuxTextView tuxTextView = new TuxTextView(I18nSettingManageMyAccountActivity.this);
                        tuxTextView.setText(I18nSettingManageMyAccountActivity.this.getString(R.string.h2h));
                        tuxTextView.setTuxFont(41);
                        tuxTextView.setTextColorRes(R.attr.bi);
                        tuxTextView.setGravity(17);
                        bVar.mo37406a(new C23018b(tuxTextView));
                    }
                    bVar.mo37405a().mo37396b().show();
                }
            };
            C89219l.m154721d(user, "");
            C89219l.m154721d(r1, "");
            cVar.mo109186a(C68707c.C68708a.m121146c(), user, r1);
            return;
        }
        this.f152251c = true;
        C31575b.m65863e().bindMobile(this, "manage_my_account", null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo108569k() {
        int i;
        int i2;
        User user = this.f152249a;
        if (C52912c.f121688a.f121689b.getEnableEmailVerification().intValue() == 1) {
            String email = user.getEmail();
            if (!TextUtils.isEmpty(email)) {
                boolean isEmailVerified = user.isEmailVerified();
                C39162r.m79460a("show_unlink_phone_email_popup", new C33744d().mo59983a("enter_from", "manage_my_account").mo59983a("unlink_type", "email").mo59980a("is_email_verified", isEmailVerified ? 1 : 0).f79943a);
                C23025b bVar = new C23025b(this);
                bVar.f54513b = true;
                if (isEmailVerified) {
                    bVar.mo37416a(R.string.h1x, new C67978aj(this));
                    bVar.mo37416a(R.string.h20, new C67979ak(this));
                    i = R.string.h1z;
                } else {
                    bVar.mo37416a(R.string.h1w, new C67980al(this));
                    bVar.mo37418b(R.string.h1r, new C67982an(this));
                    bVar.mo37418b(R.string.h1v, new C67983ao(this));
                    i = R.string.h1u;
                }
                String string = getString(i, new Object[]{"\n".concat(String.valueOf(email))});
                if (isEmailVerified) {
                    i2 = R.string.h1y;
                } else {
                    i2 = R.string.h1s;
                }
                C23023b a = new C23023b(this).mo37411b(string).mo37413d(getString(i2)).mo37407a(bVar).mo37409a(new C23056g(this, R.raw.icon_envelope));
                a.f54502a = true;
                C23023b bVar2 = (C23023b) a.mo37482a(false).mo37481a(new AbstractC89172b<C23013a, C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.C679647 */

                    static {
                        Covode.recordClassIndex(80136);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23013a aVar) {
                        return m120282a(aVar);
                    }

                    /* renamed from: a */
                    private static C89391z m120282a(C23013a aVar) {
                        Object obj = aVar.f54577j;
                        if (!(obj instanceof String) || !TextUtils.equals("button_close", (String) obj)) {
                            return null;
                        }
                        I18nSettingManageMyAccountActivity.m120255a("x-out", false, false, -1);
                        return null;
                    }
                });
                if (!isEmailVerified) {
                    TuxTextView tuxTextView = new TuxTextView(this);
                    tuxTextView.setText(getString(R.string.h1t));
                    tuxTextView.setTuxFont(41);
                    tuxTextView.setTextColorRes(R.attr.bi);
                    tuxTextView.setGravity(17);
                    bVar2.mo37406a(new C23018b(tuxTextView));
                }
                bVar2.mo37405a().mo37396b().show();
                return;
            }
            this.f152251c = true;
            C31575b.m65863e().bindEmail(this, "manage_my_account", "click_email", new Bundle(), null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo108554a() {
        C39162r.m79460a("click_manage_account_birthday_edit", new C33744d().mo59983a("enter_from", "age_edit_page").mo59982a("user_age_status", this.f152252d.getType()).f79943a);
    }

    public void exit(View view) {
        finish();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onSwitchBusinessAccountSuccessEvent(C68070e eVar) {
        finish();
    }

    /* renamed from: c */
    private static C17191a m120257c(String str) {
        return new C17191a.C17192a().mo27179b(str).f40973a;
    }

    /* renamed from: b */
    public final void mo108559b(String str) {
        if (!TextUtils.isEmpty(str)) {
            new C23144b(this).mo37635a(str).mo37637b();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 112 && (message.obj instanceof User)) {
            C31575b.m65865g().updateCurUser((User) message.obj);
            m120258m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo108552a(String str) {
        try {
            return DateFormat.getDateInstance(1, new Locale(((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a(), C58071d.m104907a())).format(new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).parse(str));
        } catch (ParseException unused) {
            return getString(R.string.ol);
        }
    }

    /* renamed from: a */
    private void m120254a(User user) {
        if (C52912c.f121688a.f121689b.getEnableEmailVerification().intValue() != 1) {
            this.f152260l.mo70127a(false);
            return;
        }
        this.f152260l.mo70127a(true);
        if (f152248p) {
            user.getEmail();
            user.isEmailVerified();
        }
        String email = user.getEmail();
        if (TextUtils.isEmpty(email)) {
            this.f152263o.setText(email);
            C68013a.m120312a(this.f152260l, this.f152263o, null);
        } else if (user.isEmailVerified()) {
            this.f152263o.setText(email);
            C68013a.m120312a(this.f152260l, this.f152263o, null);
        } else {
            C68013a.m120312a(this.f152260l, this.f152262n, getString(R.string.h2o, new Object[]{user.getEmail()}));
        }
    }

    /* renamed from: b */
    private void m120256b(boolean z) {
        m120258m();
        if (this.f152249a != null) {
            this.f152258j.mo70135a(8);
            this.f152259k.mo70135a(8);
            if (this.f152249a.getAccountType() == 0 || z) {
                this.f152259k.mo70135a(0);
            } else if (this.f152249a.getAccountType() == 3) {
                this.f152258j.mo70135a(0);
            } else if (this.f152249a.getAccountType() == 2) {
                this.f152258j.mo70135a(0);
                this.f152259k.mo70135a(0);
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        int i;
        String a;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78671e = R.attr.m;
        xVar.f78672f = R.attr.m;
        xVar.f78674h = true;
        activityConfiguration(new C67969aa(xVar));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.axj);
        this.f152253e = (TextView) findViewById(R.id.title);
        if (getIntent().getSerializableExtra("dob_status") != null) {
            this.f152252d = (C68178h) getIntent().getSerializableExtra("dob_status");
        }
        this.f152265r = new WeakHandler(getMainLooper(), this);
        EventBus.m156966a(EventBus.m156962a(), this);
        C31575b.m65865g().queryUser(this.f152265r);
        this.f152267t = new C43047dm((PowerList) findViewById(R.id.d54));
        m120258m();
        View findViewById = findViewById(R.id.pi);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC67970ab(this));
        }
        this.f152253e.setText(R.string.d0k);
        C22999a aVar = new C22999a();
        aVar.f54431a = R.raw.icon_exclamation_mark_circle_fill;
        aVar.f54435e = Integer.valueOf((int) R.attr.av);
        int a2 = (int) C2841l.m8120a(this, 16.0f);
        aVar.f54432b = a2;
        aVar.f54433c = a2;
        TuxIconView tuxIconView = new TuxIconView(this);
        this.f152262n = tuxIconView;
        tuxIconView.setTuxIcon(aVar);
        this.f152262n.setIconWidth(a2);
        this.f152262n.setIconHeight(a2);
        TuxTextView tuxTextView = new TuxTextView(this);
        this.f152263o = tuxTextView;
        tuxTextView.setTuxFont(41);
        this.f152263o.setTextColor(C0643b.m2378c(this, R.color.c5));
        this.f152267t.mo73247a(new C40937d(new C34797e(getString(R.string.d0m), false, true)));
        C40941f a3 = C68013a.m120311a(getString(R.string.flu), new View$OnClickListenerC67981am(this));
        this.f152254f = a3;
        this.f152267t.mo73247a(a3);
        String string = getString(R.string.d6j);
        View$OnClickListenerC68007av avVar = new View$OnClickListenerC68007av(this);
        C89219l.m154721d(string, "");
        C89219l.m154721d(avVar, "");
        C40934c cVar = new C40934c(new C34796d(string, null, avVar, null, false, null, null, false, null, false, null, false, null, 131066));
        this.f152260l = cVar;
        this.f152267t.mo73247a(cVar);
        C40941f a4 = C68013a.m120311a(getString(R.string.qh), new View$OnClickListenerC68008aw(this));
        this.f152261m = a4;
        this.f152267t.mo73247a(a4);
        C40941f a5 = C68013a.m120311a(getString(R.string.d9d), new View$OnClickListenerC68009ax(this));
        this.f152255g = a5;
        this.f152267t.mo73247a(a5);
        this.f152267t.mo73247a(new C40937d(new C34797e(getString(R.string.d0l), true, true)));
        C40941f a6 = C68013a.m120311a(getString(R.string.fbd), new View$OnClickListenerC68010ay(this));
        this.f152256h = a6;
        this.f152267t.mo73247a(a6);
        C40941f a7 = C68013a.m120311a(getString(R.string.gfc), new View$OnClickListenerC68011az(this));
        this.f152258j = a7;
        this.f152267t.mo73247a(a7);
        C40941f a8 = C68013a.m120311a(getString(R.string.g97), new View$OnClickListenerC68015ba(this));
        this.f152259k = a8;
        this.f152267t.mo73247a(a8);
        C40941f a9 = C68013a.m120311a(getString(R.string.b50), new View$OnClickListenerC68016bb(this));
        this.f152257i = a9;
        this.f152267t.mo73247a(a9);
        m120259n();
        m120254a(this.f152249a);
        m120256b(false);
        C40941f fVar = this.f152256h;
        if (C68707c.C68708a.m121144a()) {
            i = 0;
        } else {
            i = 8;
        }
        fVar.mo70135a(i);
        this.f152264q = new C68707c();
        if (this.f152252d.getType().intValue() == 0) {
            this.f152261m.mo70135a(8);
        } else {
            this.f152261m.mo70135a(0);
            C40941f fVar2 = this.f152261m;
            if (this.f152252d.getType().intValue() == 1) {
                a = getString(R.string.ol);
            } else {
                a = mo108552a(this.f152252d.getDefaultDoB());
            }
            fVar2.mo70136a(a);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final String mo108553a(boolean z, int i) {
        if (i != 2031) {
            if (i != 2050) {
                return getString(R.string.c3i);
            }
            if (z) {
                return getString(R.string.h24);
            }
            return getString(R.string.h1g);
        } else if (z) {
            return getString(R.string.h23);
        } else {
            return getString(R.string.h1e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo108555a(int i, int i2) {
        C17197a.C17200a aVar = new C17197a.C17200a(this);
        aVar.f41059E = true;
        aVar.mo27189a(R.string.ghx).mo27194b(i).mo27192a(getResources().getString(i2), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC67975ag(this), false).mo27197c(getResources().getString(R.string.a8y), null, false).mo27193a().mo27185c();
    }

    /* renamed from: a */
    public static void m120255a(String str, boolean z, boolean z2, int i) {
        String str2;
        int i2;
        C33744d a = new C33744d().mo59983a("enter_from", "manage_my_account").mo59983a("exit_method", str);
        if (z) {
            str2 = "phone";
        } else {
            str2 = "email";
        }
        C33744d a2 = a.mo59983a("unlink_type", str2);
        if (!z) {
            a2.mo59980a("is_email_verified", z2 ? 1 : 0);
        }
        if (TextUtils.equals("unlink", str)) {
            if (i == 0) {
                i2 = 1;
            } else if (i == 2031) {
                i2 = 2;
            } else if (i != 2050) {
                i2 = 100;
            } else {
                i2 = 3;
            }
            a2.mo59980a("unlink_eligible_status", i2);
        }
        C39162r.m79460a("exit_unlink_phone_email_popup", a2.f79943a);
    }
}
