package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.commerce.C37491d;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.AbstractC38089a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.EnumC38092d;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38584d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3735c.View$OnClickListenerC68572a;
import com.p2082ss.android.ugc.aweme.setting.utils.C68687b;
import com.p2082ss.android.ugc.aweme.setting.utils.C68688c;
import com.p2082ss.android.ugc.aweme.setting.utils.C68692g;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity */
public final class BusinessAccountActivity extends ActivityC17312a {

    /* renamed from: b */
    public static final C68469a f153246b = new C68469a((byte) 0);

    /* renamed from: a */
    public TuxAlertBadge f153247a;

    /* renamed from: c */
    private SparseArray f153248c;

    static {
        Covode.recordClassIndex(80715);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f153248c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f153248c == null) {
            this.f153248c = new SparseArray();
        }
        View view = (View) this.f153248c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f153248c.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$a */
    public static final class C68469a {
        static {
            Covode.recordClassIndex(80716);
        }

        private C68469a() {
        }

        public /* synthetic */ C68469a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onResume", true);
        super.onResume();
        m120901a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onResume", false);
    }

    /* renamed from: a */
    private final void m120901a() {
        TuxAlertBadge tuxAlertBadge = this.f153247a;
        if (tuxAlertBadge != null) {
            tuxAlertBadge.setCount(TcmServiceImpl.m135859j().mo121262e());
        }
        TuxAlertBadge tuxAlertBadge2 = this.f153247a;
        if (tuxAlertBadge2 != null) {
            tuxAlertBadge2.setVariant(1);
        }
        TuxAlertBadge tuxAlertBadge3 = this.f153247a;
        if (tuxAlertBadge3 != null) {
            tuxAlertBadge3.setMaxCount(2);
        }
        TuxAlertBadge tuxAlertBadge4 = this.f153247a;
        if (tuxAlertBadge4 == null || tuxAlertBadge4.getCount() != 0) {
            TuxAlertBadge tuxAlertBadge5 = this.f153247a;
            if (tuxAlertBadge5 != null) {
                tuxAlertBadge5.setVisibility(0);
                return;
            }
            return;
        }
        TuxAlertBadge tuxAlertBadge6 = this.f153247a;
        if (tuxAlertBadge6 != null) {
            tuxAlertBadge6.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
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

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$f */
    static final class RunnableC68474f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153257a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f153258b;

        /* renamed from: c */
        final /* synthetic */ String f153259c;

        static {
            Covode.recordClassIndex(80721);
        }

        RunnableC68474f(BusinessAccountActivity businessAccountActivity, C89233z.C89238e eVar, String str) {
            this.f153257a = businessAccountActivity;
            this.f153258b = eVar;
            this.f153259c = str;
        }

        public final void run() {
            String str;
            if (this.f153257a._$_findCachedViewById(R.id.vx) != null) {
                try {
                    C89233z.C89238e eVar = this.f153258b;
                    C23329a aVar = new C23329a(this.f153257a);
                    TuxTextCell tuxTextCell = (TuxTextCell) this.f153257a._$_findCachedViewById(R.id.vx);
                    C89219l.m154716b(tuxTextCell, "");
                    eVar.element = (T) ((C23329a) ((C23329a) ((C23329a) ((C23329a) ((C23329a) ((C23329a) aVar.mo38041b(tuxTextCell)).mo38030a(5000L)).mo38036a(false)).mo38028a(this.f153257a.getResources().getColor(R.color.dm))).mo38023e(R.string.a3h).mo38034a(EnumC23352h.TOP)).mo38037a(true, (View.OnClickListener) new View.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.BusinessAccountActivity.RunnableC68474f.View$OnClickListenerC684751 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC68474f f153260a;

                        static {
                            Covode.recordClassIndex(80722);
                        }

                        {
                            this.f153260a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            Bundle bundle = new Bundle();
                            bundle.putString("videoCounts", String.valueOf(TcmServiceImpl.m135859j().mo121262e()));
                            bundle.putString("enter_from", "bs");
                            SmartRouter.buildRoute(this.f153260a.f153257a, C38584d.m78289a(this.f153260a.f153259c, bundle)).open();
                        }
                    })).mo38012d();
                    T t = this.f153258b.element;
                    if (t != null) {
                        t.mo38001a();
                    }
                    C47809e eVar2 = C47809e.C47810a.f110762a;
                    StringBuilder sb = new StringBuilder("ba_branded_content_tip_showed");
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    if (curUser != null) {
                        str = curUser.getUid();
                    } else {
                        str = null;
                    }
                    eVar2.mo79875b(sb.append(str).toString(), (Boolean) true);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$m */
    public static final class C68483m implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153273a;

        static {
            Covode.recordClassIndex(80730);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68483m(BusinessAccountActivity businessAccountActivity) {
            this.f153273a = businessAccountActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f153273a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$p */
    public static final class C68488p implements View$OnClickListenerC68572a.AbstractC68575b {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153278a;

        static {
            Covode.recordClassIndex(80735);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68488p(BusinessAccountActivity businessAccountActivity) {
            this.f153278a = businessAccountActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.p3732ui.p3735c.View$OnClickListenerC68572a.AbstractC68575b
        /* renamed from: a */
        public final void mo108946a(int i) {
            if (i == 0) {
                this.f153278a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$b */
    public static final class C68470b implements AbstractC27645k<PromoteEntryCheck> {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153249a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f153250b;

        /* renamed from: c */
        final /* synthetic */ int f153251c;

        /* renamed from: d */
        final /* synthetic */ int f153252d;

        static {
            Covode.recordClassIndex(80717);
        }

        /* renamed from: a */
        private static Context m120902a(BusinessAccountActivity businessAccountActivity) {
            Context applicationContext = businessAccountActivity.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C89219l.m154721d(th, "");
            new C79459a(m120902a(this.f153249a)).mo123050a(R.string.dck).mo123053a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
            if (r8 != null) goto L_0x0079;
         */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onSuccess(com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck r8) {
            /*
            // Method dump skipped, instructions count: 241
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.p3732ui.BusinessAccountActivity.C68470b.onSuccess(java.lang.Object):void");
        }

        C68470b(BusinessAccountActivity businessAccountActivity, C89233z.C89238e eVar, int i, int i2) {
            this.f153249a = businessAccountActivity;
            this.f153250b = eVar;
            this.f153251c = i;
            this.f153252d = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$j */
    static final class View$OnClickListenerC68479j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153266a;

        static {
            Covode.recordClassIndex(80726);
        }

        View$OnClickListenerC68479j(BusinessAccountActivity businessAccountActivity) {
            this.f153266a = businessAccountActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$j$a */
        static final class C68480a extends AbstractC89220m implements AbstractC89172b<Bundle, C89391z> {

            /* renamed from: a */
            public static final C68480a f153267a = new C68480a();

            static {
                Covode.recordClassIndex(80727);
            }

            C68480a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                C89219l.m154721d(bundle2, "");
                bundle2.putString("enter_from", "Business settings");
                return C89391z.f203057a;
            }
        }

        public final void onClick(View view) {
            AbstractC38089a a;
            ClickAgent.onClick(view);
            ICommercializeLiveService a2 = CommercializeLiveServiceImpl.m77282a();
            if (!(a2 == null || (a = a2.mo66423a(EnumC38092d.Settings, C68480a.f153267a)) == null)) {
                a.mo66354a(this.f153266a);
            }
            C39162r.m79460a("ttba_enter_link_management_click_uv", new C33744d().mo59983a("enter_from", "Business settings").f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$c */
    static final class View$OnClickListenerC68471c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153253a;

        static {
            Covode.recordClassIndex(80718);
        }

        View$OnClickListenerC68471c(BusinessAccountActivity businessAccountActivity) {
            this.f153253a = businessAccountActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin != null) {
                createIIMServicebyMonsterPlugin.openBaMessageSettingActivity(this.f153253a, "business_setting_page");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$e */
    static final class C68473e extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C68473e f153256a = new C68473e();

        static {
            Covode.recordClassIndex(80720);
        }

        C68473e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_film_star;
            aVar2.f54435e = Integer.valueOf((int) R.attr.a1);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$i */
    static final class View$OnClickListenerC68478i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153265a;

        static {
            Covode.recordClassIndex(80725);
        }

        View$OnClickListenerC68478i(BusinessAccountActivity businessAccountActivity) {
            this.f153265a = businessAccountActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            Context applicationContext = this.f153265a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            StringBuilder sb = new StringBuilder("aweme://webview/?url=https://www.tiktok.com/ba_h5/creativeHub/home?enter-from=business&hide_nav_bar=1&locale=");
            Locale a = C53457c.m98651a(C17867d.m33078a());
            if (a != null) {
                str = a.getLanguage();
            } else {
                str = null;
            }
            SmartRouter.buildRoute(applicationContext, sb.append(str).toString()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$k */
    static final class View$OnClickListenerC68481k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153268a;

        /* renamed from: b */
        final /* synthetic */ int f153269b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f153270c;

        static {
            Covode.recordClassIndex(80728);
        }

        View$OnClickListenerC68481k(BusinessAccountActivity businessAccountActivity, int i, C89233z.C89236c cVar) {
            this.f153268a = businessAccountActivity;
            this.f153269b = i;
            this.f153270c = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                BusinessAccountActivity businessAccountActivity = this.f153268a;
                int i = this.f153269b;
                int i2 = this.f153270c.element;
                C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = "business_suite";
                C27646l.m55298a(PromoteEntryCheckApi.C67995a.m120304a().getPromoteEntryCheck("", eVar.element), new C68470b(businessAccountActivity, eVar, i, i2), ExecutorC34605m.f81660a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$l */
    static final class View$OnClickListenerC68482l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153271a;

        /* renamed from: b */
        final /* synthetic */ String f153272b;

        static {
            Covode.recordClassIndex(80729);
        }

        View$OnClickListenerC68482l(BusinessAccountActivity businessAccountActivity, String str) {
            this.f153271a = businessAccountActivity;
            this.f153272b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context applicationContext = this.f153271a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            SmartRouter.buildRoute(applicationContext, this.f153272b).open();
            C39162r.onEventV3("ttelite_BA_business_suite_suggested_account_entry_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$o */
    static final class C68485o extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153275a;

        static {
            Covode.recordClassIndex(80732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68485o(BusinessAccountActivity businessAccountActivity) {
            super(1);
            this.f153275a = businessAccountActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C684861.f153276a);
            if (this.f153275a.getIntent().getBooleanExtra("showTransition", false)) {
                baseActivityViewModel2.config(C684872.f153277a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$d */
    static final class View$OnClickListenerC68472d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153254a;

        /* renamed from: b */
        final /* synthetic */ String f153255b;

        static {
            Covode.recordClassIndex(80719);
        }

        View$OnClickListenerC68472d(BusinessAccountActivity businessAccountActivity, String str) {
            this.f153254a = businessAccountActivity;
            this.f153255b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            try {
                String str = this.f153255b;
                C80228av.m139063a(str, str, this.f153254a, PrivacyCert.Builder.Companion.with("bpea-226").usage("On  the business suite page , users can copy the official web link and use it on the web side.").tag("copyOfficialWebLinkOnBusinessSuitePage").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                C39162r.m79460a("ttelite_business_suite_weblink_copied", new C33744d().mo59983a("enter_from", "Business suite").f79943a);
            } catch (C13340a e) {
                C51423a.m95788a("", e);
            }
            new C23144b(this.f153254a).mo37640e(R.string.ghl).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$g */
    static final class View$OnClickListenerC68476g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153261a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f153262b;

        /* renamed from: c */
        final /* synthetic */ String f153263c;

        static {
            Covode.recordClassIndex(80723);
        }

        View$OnClickListenerC68476g(BusinessAccountActivity businessAccountActivity, C89233z.C89238e eVar, String str) {
            this.f153261a = businessAccountActivity;
            this.f153262b = eVar;
            this.f153263c = str;
        }

        public final void onClick(View view) {
            T t;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                T t2 = this.f153262b.element;
                if (!(t2 == null || !t2.isShowing() || (t = this.f153262b.element) == null)) {
                    t.dismiss();
                }
                Bundle bundle = new Bundle();
                bundle.putString("videoCounts", String.valueOf(TcmServiceImpl.m135859j().mo121262e()));
                bundle.putString("enter_from", "bs");
                SmartRouter.buildRoute(this.f153261a, C38584d.m78289a(this.f153263c, bundle)).open();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$h */
    static final class View$OnClickListenerC68477h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153264a;

        static {
            Covode.recordClassIndex(80724);
        }

        View$OnClickListenerC68477h(BusinessAccountActivity businessAccountActivity) {
            this.f153264a = businessAccountActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String a = SettingsManager.m29616a().mo25398a("ttba_registration_schema", "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=landing-page%2Ftemplate.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_ba_lynx_v2%2Flanding-page");
            C89219l.m154716b(a, "");
            if (TextUtils.isEmpty(a)) {
                a = C68688c.f153691a;
            }
            Context applicationContext = this.f153264a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            SmartRouter.buildRoute(applicationContext, a).open();
            C33744d dVar = new C33744d();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            C39162r.m79460a("TTBA_Registration_Click_entrance", dVar.mo59983a("UID", curUser.getUid()).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity$n */
    static final class View$OnClickListenerC68484n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessAccountActivity f153274a;

        static {
            Covode.recordClassIndex(80731);
        }

        View$OnClickListenerC68484n(BusinessAccountActivity businessAccountActivity) {
            this.f153274a = businessAccountActivity;
        }

        public final void onClick(View view) {
            int i;
            int dimensionPixelSize;
            ClickAgent.onClick(view);
            BusinessAccountActivity businessAccountActivity = this.f153274a;
            int identifier = businessAccountActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0 || (dimensionPixelSize = businessAccountActivity.getResources().getDimensionPixelSize(identifier)) <= 0) {
                i = 44;
            } else {
                i = C13628n.m24522c(this.f153274a, (float) dimensionPixelSize);
            }
            C68687b.m121121a(this.f153274a, "https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=".concat(String.valueOf(i)), new HashMap());
            C39162r.m79462a("click_insight", C89387v.m154943a("business", "enter_from"));
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C37491d bizAccountInfo;
        C37491d bizAccountInfo2;
        C37491d bizAccountInfo3;
        String str;
        AbstractC23293c.AbstractC23296b bVar;
        C37491d bizAccountInfo4;
        C37491d bizAccountInfo5;
        C37491d bizAccountInfo6;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onCreate", true);
        activityConfiguration(new C68485o(this));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.ax6);
        ((TextTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C68483m(this));
        ((CommonItemView) _$_findCachedViewById(R.id.in)).setOnClickListener(new View$OnClickListenerC68484n(this));
        if (C68692g.m121126a()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            int accountType = curUser.getAccountType();
            C89233z.C89236c cVar = new C89233z.C89236c();
            cVar.element = 0;
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            if (g2.getCurUser().getCommerceUserInfo() != null) {
                IAccountUserService g3 = C31575b.m65865g();
                C89219l.m154716b(g3, "");
                cVar.element = g3.getCurUser().getCommerceUserInfo().getPromotePayType();
            }
            CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.d_l);
            C89219l.m154716b(commonItemView, "");
            commonItemView.setVisibility(0);
            C39162r.m79460a("Promote_profile_entrance_show", new C33744d().mo59980a("user_account_type", accountType).mo59980a("promote_version", cVar.element).f79943a);
            C68692g.m121125a(this);
            ((CommonItemView) _$_findCachedViewById(R.id.d_l)).setOnClickListener(new View$OnClickListenerC68481k(this, accountType, cVar));
        }
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        User curUser2 = e.getCurUser();
        C89219l.m154716b(curUser2, "");
        C37491d bizAccountInfo7 = curUser2.getBizAccountInfo();
        if (bizAccountInfo7 != null && bizAccountInfo7.enableAutoMsg()) {
            CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.cjk);
            C89219l.m154716b(commonItemView2, "");
            commonItemView2.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.cjk)).setOnClickListener(new View$OnClickListenerC68471c(this));
        }
        IAccountUserService g4 = C31575b.m65865g();
        C89219l.m154716b(g4, "");
        User curUser3 = g4.getCurUser();
        if (!(curUser3 == null || (bizAccountInfo6 = curUser3.getBizAccountInfo()) == null || !bizAccountInfo6.enableCreativeHub())) {
            CommonItemView commonItemView3 = (CommonItemView) _$_findCachedViewById(R.id.ag8);
            C89219l.m154716b(commonItemView3, "");
            commonItemView3.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.ag8)).setOnClickListener(new View$OnClickListenerC68478i(this));
        }
        IAccountUserService g5 = C31575b.m65865g();
        C89219l.m154716b(g5, "");
        User curUser4 = g5.getCurUser();
        if (!(curUser4 == null || (bizAccountInfo5 = curUser4.getBizAccountInfo()) == null || !bizAccountInfo5.enableLiveLinks())) {
            CommonItemView commonItemView4 = (CommonItemView) _$_findCachedViewById(R.id.cb6);
            C89219l.m154716b(commonItemView4, "");
            commonItemView4.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.cb6)).setOnClickListener(new View$OnClickListenerC68479j(this));
        }
        IAccountUserService g6 = C31575b.m65865g();
        C89219l.m154716b(g6, "");
        User curUser5 = g6.getCurUser();
        if (!(curUser5 == null || (bizAccountInfo4 = curUser5.getBizAccountInfo()) == null || !bizAccountInfo4.enableBusinessRegistration())) {
            CommonItemView commonItemView5 = (CommonItemView) _$_findCachedViewById(R.id.zy);
            C89219l.m154716b(commonItemView5, "");
            commonItemView5.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.zy)).setOnClickListener(new View$OnClickListenerC68477h(this));
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("bundle_show_account_dialog_when_start", false)) {
            IAccountUserService g7 = C31575b.m65865g();
            C89219l.m154716b(g7, "");
            User curUser6 = g7.getCurUser();
            C89219l.m154716b(curUser6, "");
            int accountType2 = curUser6.getAccountType();
            C68488p pVar = new C68488p(this);
            C89219l.m154721d(this, "");
            View$OnClickListenerC68572a aVar = new View$OnClickListenerC68572a(this);
            C23226a aVar2 = new C23226a.C23227a().mo37816a(aVar).f55057a;
            aVar.f153426i = pVar;
            C89219l.m154721d(aVar2, "");
            aVar.f153424g = aVar2;
            aVar.setAccountType(accountType2);
            new Handler().postDelayed(new View$OnClickListenerC68572a.C68573a.RunnableC68574a(this, aVar2), 400);
        }
        String str2 = null;
        this.f153247a = new TuxAlertBadge(this, null, 0, 6);
        String d = TcmServiceImpl.m135859j().mo121261d();
        if (d == null) {
            d = "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=branded-content%2Ftemplate.js&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_ba_lynx_v2%2Fbranded-content%3Fpage_module%3Doverview&page_module=overview";
        }
        IAccountUserService g8 = C31575b.m65865g();
        C89219l.m154716b(g8, "");
        User curUser7 = g8.getCurUser();
        if (!(curUser7 == null || (bizAccountInfo3 = curUser7.getBizAccountInfo()) == null || !bizAccountInfo3.enableBrandedContent() || d.length() == 0)) {
            TuxTextCell tuxTextCell = (TuxTextCell) _$_findCachedViewById(R.id.vx);
            C89219l.m154716b(tuxTextCell, "");
            tuxTextCell.setVisibility(0);
            m120901a();
            ((TuxTextCell) _$_findCachedViewById(R.id.vx)).setIcon(C23005c.m43393a(C68473e.f153256a));
            TuxTextCell tuxTextCell2 = (TuxTextCell) _$_findCachedViewById(R.id.vx);
            AbstractC23293c.C23302f fVar = new AbstractC23293c.C23302f(this);
            TuxAlertBadge tuxAlertBadge = this.f153247a;
            if (tuxAlertBadge != null) {
                fVar.mo37963a(tuxAlertBadge, false);
            }
            tuxTextCell2.setAccessory(fVar);
            C47809e eVar = C47809e.C47810a.f110762a;
            StringBuilder sb = new StringBuilder("ba_branded_content_tip_showed");
            IAccountUserService g9 = C31575b.m65865g();
            C89219l.m154716b(g9, "");
            User curUser8 = g9.getCurUser();
            if (curUser8 != null) {
                str = curUser8.getUid();
            } else {
                str = null;
            }
            boolean z = !eVar.mo79871a(sb.append(str).toString(), (Boolean) false).booleanValue();
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = null;
            if (z) {
                C34727m.m70945a(new RunnableC68474f(this, eVar2, d), 200);
            }
            TuxTextCell tuxTextCell3 = (TuxTextCell) _$_findCachedViewById(R.id.vx);
            if (tuxTextCell3 != null) {
                bVar = tuxTextCell3.getAccessory();
            } else {
                bVar = null;
            }
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
            ((AbstractC23293c.C23302f) bVar).mo37962a(new View$OnClickListenerC68476g(this, eVar2, d));
        }
        Context baseContext = getBaseContext();
        C89219l.m154716b(baseContext, "");
        SpannableString spannableString = new SpannableString(baseContext.getResources().getString(R.string.ghk, "www.tiktok.com/business-suite"));
        int a = C89361p.m154888a((CharSequence) spannableString, "www.tiktok.com/business-suite", 0, false, 6);
        spannableString.setSpan(new StyleSpan(1), a, a + 29, 33);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.u_);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(spannableString);
        ((TuxTextView) _$_findCachedViewById(R.id.u_)).setOnClickListener(new View$OnClickListenerC68472d(this, "www.tiktok.com/business-suite"));
        IAccountUserService g10 = C31575b.m65865g();
        C89219l.m154716b(g10, "");
        User curUser9 = g10.getCurUser();
        if (!(curUser9 == null || (bizAccountInfo2 = curUser9.getBizAccountInfo()) == null)) {
            str2 = bizAccountInfo2.getSuggestedAccountsLynxSchema();
        }
        IAccountUserService g11 = C31575b.m65865g();
        C89219l.m154716b(g11, "");
        User curUser10 = g11.getCurUser();
        if (!(curUser10 == null || (bizAccountInfo = curUser10.getBizAccountInfo()) == null || !bizAccountInfo.enableSuggestedAccounts())) {
            CommonItemView commonItemView6 = (CommonItemView) _$_findCachedViewById(R.id.e15);
            C89219l.m154716b(commonItemView6, "");
            commonItemView6.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.e15)).setOnClickListener(new View$OnClickListenerC68482l(this, str2));
        }
        String a2 = m120900a(getIntent(), "enterFrom");
        if (a2 == null) {
            a2 = "";
        }
        C89219l.m154716b(a2, "");
        C89219l.m154721d(a2, "");
        C39162r.m79460a("event_enter_business_setting", new C33744d().mo59983a("enter_from", a2).f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m120900a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
