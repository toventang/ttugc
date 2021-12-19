package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commercialize.adsetting.AdSettingsApi;
import com.p2082ss.android.ugc.aweme.commercialize.adsetting.C37595a;
import com.p2082ss.android.ugc.aweme.commercialize.adsetting.C37604c;
import com.p2082ss.android.ugc.aweme.commercialize.p2573l.C38031a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63495b;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity */
public final class AdSettingsActivity extends ActivityC17312a implements View.OnClickListener {

    /* renamed from: d */
    public static Aweme f153198d;

    /* renamed from: e */
    public static final C68437a f153199e = new C68437a((byte) 0);

    /* renamed from: a */
    String f153200a;

    /* renamed from: b */
    public String f153201b;

    /* renamed from: c */
    public AdSettingsApi f153202c;

    /* renamed from: f */
    private int f153203f = -1;

    /* renamed from: g */
    private long f153204g;

    /* renamed from: h */
    private long f153205h;

    /* renamed from: i */
    private final AbstractC89244h f153206i;

    /* renamed from: j */
    private final AbstractC89244h f153207j;

    /* renamed from: k */
    private SparseArray f153208k;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$q */
    public static final class C68457q implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153232a;

        static {
            Covode.recordClassIndex(80703);
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$q$a */
        static final class C68458a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            public static final C68458a f153233a = new C68458a();

            static {
                Covode.recordClassIndex(80704);
            }

            C68458a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ C89391z invoke() {
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$q$b */
        static final class C68459b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C68457q f153234a;

            static {
                Covode.recordClassIndex(80705);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C68459b(C68457q qVar) {
                super(0);
                this.f153234a = qVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f153234a.f153232a.mo108924d();
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68457q(AdSettingsActivity adSettingsActivity) {
            this.f153232a = adSettingsActivity;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            new C23144b(this.f153232a).mo37635a("Request Failed").mo37637b();
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
            int i;
            AbstractC28019l c;
            if (uVar != null && uVar.f52261a.mo35845a() && uVar.f52262b != null) {
                C28022o a = this.f153232a.mo108917a(uVar.f52262b);
                if (a == null || (c = a.mo46803c("status_code")) == null) {
                    i = -1;
                } else {
                    i = c.mo46694g();
                }
                if (i == 4016) {
                    AdSettingsActivity adSettingsActivity = this.f153232a;
                    String string = adSettingsActivity.getResources().getString(R.string.eyt);
                    C89219l.m154716b(string, "");
                    String string2 = this.f153232a.getResources().getString(R.string.b6k);
                    C89219l.m154716b(string2, "");
                    adSettingsActivity.mo108920a(string, string2, C68458a.f153233a, false, "");
                } else if (i == 4017) {
                    AdSettingsActivity adSettingsActivity2 = this.f153232a;
                    String string3 = adSettingsActivity2.getResources().getString(R.string.eyu);
                    C89219l.m154716b(string3, "");
                    String string4 = this.f153232a.getResources().getString(R.string.b4w);
                    C89219l.m154716b(string4, "");
                    C68459b bVar2 = new C68459b(this);
                    String string5 = this.f153232a.getResources().getString(R.string.eyv);
                    C89219l.m154716b(string5, "");
                    adSettingsActivity2.mo108920a(string3, string4, bVar2, true, string5);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(80682);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f153208k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f153208k == null) {
            this.f153208k = new SparseArray();
        }
        View view = (View) this.f153208k.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f153208k.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DialogC81438i mo108918a() {
        return (DialogC81438i) this.f153206i.getValue();
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$a */
    public static final class C68437a {
        static {
            Covode.recordClassIndex(80683);
        }

        private C68437a() {
        }

        public /* synthetic */ C68437a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$b */
    static final class C68441b extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153214a;

        static {
            Covode.recordClassIndex(80687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68441b(AdSettingsActivity adSettingsActivity) {
            super(0);
            this.f153214a = adSettingsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            return new DialogC81438i(this.f153214a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$k */
    static final class C68451k extends AbstractC89220m implements AbstractC89171a<C28024q> {

        /* renamed from: a */
        public static final C68451k f153224a = new C68451k();

        static {
            Covode.recordClassIndex(80697);
        }

        C68451k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C28024q invoke() {
            return new C28024q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$l */
    static final class C68452l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153225a;

        static {
            Covode.recordClassIndex(80698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68452l(AdSettingsActivity adSettingsActivity) {
            super(0);
            this.f153225a = adSettingsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f153225a.mo108924d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$z */
    public static final class C68468z implements C37595a.AbstractC37596a {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153245a;

        static {
            Covode.recordClassIndex(80714);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.adsetting.C37595a.AbstractC37596a
        /* renamed from: a */
        public final void mo65505a() {
            this.f153245a.mo108922b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68468z(AdSettingsActivity adSettingsActivity) {
            this.f153245a = adSettingsActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.adsetting.C37595a.AbstractC37596a
        /* renamed from: a */
        public final void mo65506a(long j, long j2) {
            AdSettingsActivity adSettingsActivity = this.f153245a;
            String str = adSettingsActivity.f153200a;
            if (str != null) {
                adSettingsActivity.f153202c.requestCodeExtend(str, j2).enqueue(new C68455o(adSettingsActivity));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        super.overridePendingTransition(0, R.anim.dx);
    }

    /* renamed from: c */
    public final void mo108923c() {
        String str = this.f153200a;
        if (str != null) {
            this.f153202c.requestAdSettings(str).enqueue(new C68453m(this));
        }
    }

    /* renamed from: d */
    public final void mo108924d() {
        String str = this.f153200a;
        if (str != null) {
            this.f153202c.requestCodeDelete(str, true).enqueue(new C68454n(this));
        }
    }

    public AdSettingsActivity() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(AdSettingsApi.class);
        C89219l.m154716b(create, "");
        this.f153202c = (AdSettingsApi) create;
        this.f153206i = C89250i.m154773a((AbstractC89171a) new C68441b(this));
        this.f153207j = C89250i.m154773a((AbstractC89171a) C68451k.f153224a);
    }

    /* renamed from: b */
    public final void mo108922b() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdFeSettings adFeSettings = iESSettingsProxy.getAdFeSettings();
            if (adFeSettings != null) {
                String legalPage = adFeSettings.getLegalPage();
                if (!TextUtils.isEmpty(legalPage)) {
                    C38767w.m78639a(this, legalPage, getString(R.string.fnv));
                }
            }
        } catch (C16041a e) {
            e.printStackTrace();
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

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$c */
    public static final class C68442c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153215a;

        static {
            Covode.recordClassIndex(80688);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68442c(AdSettingsActivity adSettingsActivity) {
            this.f153215a = adSettingsActivity;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(C0643b.m2378c(this.f153215a, R.color.c4));
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            String str;
            C89219l.m154721d(view, "");
            AdSettingsActivity adSettingsActivity = this.f153215a;
            StringBuilder sb = new StringBuilder();
            String a = SettingsManager.m29616a().mo25398a("branded_content_detail_url", "aweme://webview?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fh5%2Fvideo_appeal%3Fhide_nav_bar%3D1%26from%3Dapp");
            C89219l.m154716b(a, "");
            if (TextUtils.isEmpty(a)) {
                a = C38031a.f89863a;
            }
            StringBuilder append = sb.append(a).append("%26item_id%3D");
            Aweme aweme = AdSettingsActivity.f153198d;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            SmartRouter.buildRoute(adSettingsActivity, append.append(str).toString()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$d */
    public static final class C68443d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153216a;

        static {
            Covode.recordClassIndex(80689);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68443d(AdSettingsActivity adSettingsActivity) {
            this.f153216a = adSettingsActivity;
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f153216a.mo108922b();
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(C0643b.m2378c(this.f153216a, R.color.bx));
            textPaint.setFakeBoldText(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$i */
    public static final class C68449i implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153222a;

        static {
            Covode.recordClassIndex(80695);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68449i(AdSettingsActivity adSettingsActivity) {
            this.f153222a = adSettingsActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f153222a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$m */
    public static final class C68453m implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153226a;

        static {
            Covode.recordClassIndex(80699);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68453m(AdSettingsActivity adSettingsActivity) {
            this.f153226a = adSettingsActivity;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(th, "");
            this.f153226a.mo108918a().dismiss();
            this.f153226a.finish();
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
            C37604c cVar;
            Integer num;
            boolean z;
            int i;
            long j;
            int i2;
            C89219l.m154721d(bVar, "");
            this.f153226a.mo108918a().dismiss();
            if (uVar != null && uVar.f52261a.mo35845a() && uVar.f52262b != null) {
                String str = null;
                try {
                    GsonProvider c = GsonHolder.m138943c();
                    C89219l.m154716b(c, "");
                    cVar = (C37604c) c.mo123620b().mo46670a((String) uVar.f52262b, C37604c.class);
                    if (!(cVar == null || (num = cVar.f88892a) == null || num.intValue() != 0)) {
                        AdSettingsActivity adSettingsActivity = this.f153226a;
                        if (cVar != null) {
                            Boolean bool = cVar.f88894c;
                            int i3 = 0;
                            if (bool != null) {
                                z = bool.booleanValue();
                            } else {
                                z = false;
                            }
                            Integer num2 = cVar.f88896e;
                            boolean z2 = true;
                            if (num2 != null && num2.intValue() == 1) {
                                CommonItemView commonItemView = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                C89219l.m154716b(commonItemView, "");
                                commonItemView.setChecked(true);
                                String string = adSettingsActivity.getString(R.string.ghd);
                                C89219l.m154716b(string, "");
                                String string2 = adSettingsActivity.getString(R.string.ghe);
                                C89219l.m154716b(string2, "");
                                SpannableStringBuilder append = new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) string2);
                                C89219l.m154716b(append, "");
                                int a = C89361p.m154888a((CharSequence) append, string2, 0, false, 6);
                                append.setSpan(new C68442c(adSettingsActivity), a, string2.length() + a, 33);
                                CommonItemView commonItemView2 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                C89219l.m154716b(commonItemView2, "");
                                TextView tvwDesc = commonItemView2.getTvwDesc();
                                C89219l.m154716b(tvwDesc, "");
                                tvwDesc.setMovementMethod(LinkMovementMethod.getInstance());
                                CommonItemView commonItemView3 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                C89219l.m154716b(commonItemView3, "");
                                TextView tvwDesc2 = commonItemView3.getTvwDesc();
                                C89219l.m154716b(tvwDesc2, "");
                                CommonItemView commonItemView4 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                C89219l.m154716b(commonItemView4, "");
                                TextView tvwDesc3 = commonItemView4.getTvwDesc();
                                C89219l.m154716b(tvwDesc3, "");
                                tvwDesc2.setText(new SpannableStringBuilder(tvwDesc3.getText()).append((CharSequence) "\n").append((CharSequence) append));
                                ((CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp)).setOnClickListener(new View$OnClickListenerC68450j(adSettingsActivity));
                            } else {
                                Integer num3 = cVar.f88895d;
                                if (num3 != null) {
                                    i2 = num3.intValue();
                                } else {
                                    i2 = 2;
                                }
                                CommonItemView commonItemView5 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                C89219l.m154716b(commonItemView5, "");
                                if (i2 != 1) {
                                    z2 = false;
                                }
                                commonItemView5.setChecked(z2);
                            }
                            CommonItemView commonItemView6 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.fl);
                            C89219l.m154716b(commonItemView6, "");
                            commonItemView6.setChecked(z);
                            CheckBox checkBox = (CheckBox) adSettingsActivity._$_findCachedViewById(R.id.a2j);
                            C89219l.m154716b(checkBox, "");
                            checkBox.setChecked(z);
                            LinearLayout linearLayout = (LinearLayout) adSettingsActivity._$_findCachedViewById(R.id.c3i);
                            C89219l.m154716b(linearLayout, "");
                            if (!z) {
                                i3 = 8;
                            }
                            linearLayout.setVisibility(i3);
                            String str2 = cVar.f88897f;
                            Integer num4 = cVar.f88898g;
                            if (num4 != null) {
                                i = num4.intValue();
                            } else {
                                i = -1;
                            }
                            Long l = cVar.f88899h;
                            long j2 = 0;
                            if (l != null) {
                                j = l.longValue();
                            } else {
                                j = 0;
                            }
                            Long l2 = cVar.f88900i;
                            if (l2 != null) {
                                j2 = l2.longValue();
                            }
                            adSettingsActivity.mo108919a(str2, i, j, j2);
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    cVar = null;
                }
                this.f153226a.mo108918a().dismiss();
                this.f153226a.finish();
                if (cVar != null) {
                    str = cVar.f88893b;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "Request Failed";
                }
                new C23144b(this.f153226a).mo37635a(str).mo37637b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$n */
    public static final class C68454n implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153227a;

        static {
            Covode.recordClassIndex(80700);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68454n(AdSettingsActivity adSettingsActivity) {
            this.f153227a = adSettingsActivity;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            new C23144b(this.f153227a).mo37635a("Request Failed").mo37637b();
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
            C28022o a;
            if (uVar != null && uVar.f52261a.mo35845a() && uVar.f52262b != null && (a = this.f153227a.mo108917a(uVar.f52262b)) != null) {
                AbstractC28019l c = a.mo46803c("status_msg");
                if (c != null) {
                    c.mo46689c();
                }
                AbstractC28019l c2 = a.mo46803c("status_code");
                if (c2 != null && c2.mo46694g() == 0) {
                    new C23144b(this.f153227a).mo37635a(this.f153227a.getResources().getString(R.string.b5l)).mo37637b();
                    this.f153227a.mo108919a("", -1, 0, 0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$o */
    public static final class C68455o implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153228a;

        static {
            Covode.recordClassIndex(80701);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68455o(AdSettingsActivity adSettingsActivity) {
            this.f153228a = adSettingsActivity;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            new C23144b(this.f153228a).mo37635a("Request Failed").mo37637b();
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
            C28022o a;
            AbstractC28019l c;
            if (uVar != null && uVar.f52261a.mo35845a() && uVar.f52262b != null && (a = this.f153228a.mo108917a(uVar.f52262b)) != null && (c = a.mo46803c("status_code")) != null && c.mo46694g() == 0) {
                new C23144b(this.f153228a).mo37635a(this.f153228a.getResources().getString(R.string.eyz)).mo37637b();
                this.f153228a.mo108923c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$w */
    public static final class C68465w implements C37595a.AbstractC37596a {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153242a;

        static {
            Covode.recordClassIndex(80711);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.adsetting.C37595a.AbstractC37596a
        /* renamed from: a */
        public final void mo65505a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68465w(AdSettingsActivity adSettingsActivity) {
            this.f153242a = adSettingsActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.adsetting.C37595a.AbstractC37596a
        /* renamed from: a */
        public final void mo65506a(long j, long j2) {
            AdSettingsActivity adSettingsActivity = this.f153242a;
            String str = adSettingsActivity.f153200a;
            if (str != null) {
                adSettingsActivity.f153202c.requestCodeGenerate(str, j, j2).enqueue(new C68456p(adSettingsActivity, j, j2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$aa */
    static final class C68438aa extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153209a;

        /* renamed from: b */
        final /* synthetic */ String f153210b;

        /* renamed from: c */
        final /* synthetic */ boolean f153211c;

        static {
            Covode.recordClassIndex(80684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68438aa(AdSettingsActivity adSettingsActivity, String str, boolean z) {
            super(1);
            this.f153209a = adSettingsActivity;
            this.f153210b = str;
            this.f153211c = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.h6o, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.AdSettingsActivity.C68438aa.C684391 */

                /* renamed from: a */
                final /* synthetic */ C68438aa f153212a;

                static {
                    Covode.recordClassIndex(80685);
                }

                {
                    this.f153212a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    int i;
                    C89219l.m154721d(aVar, "");
                    AdSettingsApi adSettingsApi = this.f153212a.f153209a.f153202c;
                    String str = this.f153212a.f153210b;
                    if (this.f153212a.f153211c) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    adSettingsApi.requestDarkPostUpdate(str, i).enqueue(new AbstractC22030d<String>(this) {
                        /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.AdSettingsActivity.C68438aa.C684391.C684401 */

                        /* renamed from: a */
                        final /* synthetic */ C684391 f153213a;

                        static {
                            Covode.recordClassIndex(80686);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f153213a = r1;
                        }

                        @Override // com.bytedance.retrofit2.AbstractC22030d
                        /* renamed from: a */
                        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
                            new C23144b(this.f153213a.f153212a.f153209a).mo37635a("Request Failed").mo37637b();
                        }

                        @Override // com.bytedance.retrofit2.AbstractC22030d
                        /* renamed from: a */
                        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
                            C28022o a;
                            AbstractC28019l c;
                            if (uVar != null && uVar.f52261a.mo35845a() && uVar.f52262b != null && (a = this.f153213a.f153212a.f153209a.mo108917a(uVar.f52262b)) != null && (c = a.mo46803c("status_code")) != null && c.mo46694g() == 0) {
                                CommonItemView commonItemView = (CommonItemView) this.f153213a.f153212a.f153209a._$_findCachedViewById(R.id.dp);
                                C89219l.m154716b(commonItemView, "");
                                commonItemView.setChecked(!this.f153213a.f153212a.f153211c);
                                CommonItemView commonItemView2 = (CommonItemView) this.f153213a.f153212a.f153209a._$_findCachedViewById(R.id.dp);
                                C89219l.m154716b(commonItemView2, "");
                                AbstractC81915c.m141874a(new C63495b(commonItemView2.mo27138d()));
                            }
                        }
                    });
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.h6n, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$h */
    static final class C68448h implements DmtSettingSwitch.AbstractC17285a {

        /* renamed from: a */
        public static final C68448h f153221a = new C68448h();

        static {
            Covode.recordClassIndex(80694);
        }

        C68448h() {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch.AbstractC17285a
        /* renamed from: a */
        public final void mo27515a(boolean z) {
            C37437a commerceVideoAuthInfo;
            int i;
            Aweme aweme = AdSettingsActivity.f153198d;
            if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                commerceVideoAuthInfo.setDarkPostStatus(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$j */
    static final class View$OnClickListenerC68450j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153223a;

        static {
            Covode.recordClassIndex(80696);
        }

        View$OnClickListenerC68450j(AdSettingsActivity adSettingsActivity) {
            this.f153223a = adSettingsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new C23144b(this.f153223a).mo37635a(this.f153223a.getResources().getString(R.string.ghf)).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$r */
    static final class C68460r extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        public static final C68460r f153235a = new C68460r();

        static {
            Covode.recordClassIndex(80706);
        }

        C68460r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.b6k, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$s */
    static final class C68461s extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        public static final C68461s f153236a = new C68461s();

        static {
            Covode.recordClassIndex(80707);
        }

        C68461s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.b6k, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$t */
    static final class C68462t extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        public static final C68462t f153237a = new C68462t();

        static {
            Covode.recordClassIndex(80708);
        }

        C68462t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.b6k, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final C28022o mo108917a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            this.f153207j.getValue();
            AbstractC28019l a = C28024q.m56139a(str);
            C89219l.m154716b(a, "");
            return a.mo46789j();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo108921a(boolean z) {
        String str = this.f153200a;
        if (str != null) {
            this.f153202c.requestPromoteUpdate(str, !z).enqueue(new C68464v(this, z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$e */
    static final class C68444e implements DmtSettingSwitch.AbstractC17285a {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153217a;

        static {
            Covode.recordClassIndex(80690);
        }

        C68444e(AdSettingsActivity adSettingsActivity) {
            this.f153217a = adSettingsActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch.AbstractC17285a
        /* renamed from: a */
        public final void mo27515a(boolean z) {
            Aweme b;
            CheckBox checkBox = (CheckBox) this.f153217a._$_findCachedViewById(R.id.a2j);
            C89219l.m154716b(checkBox, "");
            checkBox.setEnabled(!z);
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.f153217a._$_findCachedViewById(R.id.c3i);
                C89219l.m154716b(linearLayout, "");
                linearLayout.setVisibility(0);
                String str = this.f153217a.f153201b;
                if (str == null || str.length() == 0) {
                    TuxTextView tuxTextView = (TuxTextView) this.f153217a._$_findCachedViewById(R.id.ewl);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setVisibility(0);
                    LinearLayout linearLayout2 = (LinearLayout) this.f153217a._$_findCachedViewById(R.id.c3j);
                    C89219l.m154716b(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                } else {
                    TuxTextView tuxTextView2 = (TuxTextView) this.f153217a._$_findCachedViewById(R.id.ewl);
                    C89219l.m154716b(tuxTextView2, "");
                    tuxTextView2.setVisibility(8);
                    LinearLayout linearLayout3 = (LinearLayout) this.f153217a._$_findCachedViewById(R.id.c3j);
                    C89219l.m154716b(linearLayout3, "");
                    linearLayout3.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout4 = (LinearLayout) this.f153217a._$_findCachedViewById(R.id.c3i);
                C89219l.m154716b(linearLayout4, "");
                linearLayout4.setVisibility(8);
                TuxTextView tuxTextView3 = (TuxTextView) this.f153217a._$_findCachedViewById(R.id.ewl);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setVisibility(8);
                LinearLayout linearLayout5 = (LinearLayout) this.f153217a._$_findCachedViewById(R.id.c3j);
                C89219l.m154716b(linearLayout5, "");
                linearLayout5.setVisibility(8);
            }
            String str2 = this.f153217a.f153200a;
            if (str2 != null && (b = AwemeService.m70060b().mo60684b(str2)) != null) {
                C37437a commerceVideoAuthInfo = b.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo == null) {
                    commerceVideoAuthInfo = new C37437a();
                    b.setCommerceVideoAuthInfo(commerceVideoAuthInfo);
                }
                commerceVideoAuthInfo.setAdvPromotable(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$f */
    static final class View$OnClickListenerC68445f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153218a;

        static {
            Covode.recordClassIndex(80691);
        }

        View$OnClickListenerC68445f(AdSettingsActivity adSettingsActivity) {
            this.f153218a = adSettingsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            CommonItemView commonItemView = (CommonItemView) this.f153218a._$_findCachedViewById(R.id.fl);
            C89219l.m154716b(commonItemView, "");
            boolean d = commonItemView.mo27138d();
            if (!d) {
                CheckBox checkBox = (CheckBox) this.f153218a._$_findCachedViewById(R.id.a2j);
                C89219l.m154716b(checkBox, "");
                if (checkBox.isChecked()) {
                    AdSettingsActivity adSettingsActivity = this.f153218a;
                    String string = adSettingsActivity.getResources().getString(R.string.eyp);
                    C89219l.m154716b(string, "");
                    String string2 = this.f153218a.getResources().getString(R.string.b6k);
                    C89219l.m154716b(string2, "");
                    C684461 r6 = new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.AdSettingsActivity.View$OnClickListenerC68445f.C684461 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC68445f f153219a;

                        static {
                            Covode.recordClassIndex(80692);
                        }

                        {
                            this.f153219a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            this.f153219a.f153218a.mo108921a(false);
                            return C89391z.f203057a;
                        }
                    };
                    String string3 = this.f153218a.getResources().getString(R.string.eyq);
                    C89219l.m154716b(string3, "");
                    adSettingsActivity.mo108920a(string, string2, r6, false, string3);
                }
            } else if (!TextUtils.isEmpty(this.f153218a.f153201b)) {
                new C23144b(this.f153218a).mo37640e(R.string.gwv).mo37637b();
            } else {
                this.f153218a.mo108921a(d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$g */
    static final class View$OnClickListenerC68447g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153220a;

        static {
            Covode.recordClassIndex(80693);
        }

        View$OnClickListenerC68447g(AdSettingsActivity adSettingsActivity) {
            this.f153220a = adSettingsActivity;
        }

        public final void onClick(View view) {
            Aweme aweme;
            C37437a commerceVideoAuthInfo;
            ClickAgent.onClick(view);
            CommonItemView commonItemView = (CommonItemView) this.f153220a._$_findCachedViewById(R.id.dp);
            C89219l.m154716b(commonItemView, "");
            boolean d = commonItemView.mo27138d();
            AdSettingsActivity adSettingsActivity = this.f153220a;
            String str = adSettingsActivity.f153200a;
            if (str != null) {
                Aweme aweme2 = AdSettingsActivity.f153198d;
                Integer num = null;
                if (!(aweme2 == null || (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) == null)) {
                    num = Integer.valueOf(commerceVideoAuthInfo.getMissionItemStatus());
                }
                int i = 1;
                if (num != null && ((num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 5 || num.intValue() == 6 || num.intValue() == 7 || num.intValue() == 8) && !d)) {
                    String str2 = adSettingsActivity.f153200a;
                    if (str2 != null) {
                        C23028c.m43435a((C23023b) new C23023b(adSettingsActivity).mo37479a(R.string.b3v).mo37483b(R.string.b3u), new C68438aa(adSettingsActivity, str2, d)).mo37405a().mo37396b().show();
                        return;
                    }
                    return;
                }
                Aweme aweme3 = AdSettingsActivity.f153198d;
                if (aweme3 == null || !aweme3.isTop() || (aweme = AdSettingsActivity.f153198d) == null || aweme.playlist_info == null) {
                    Aweme aweme4 = AdSettingsActivity.f153198d;
                    if (aweme4 == null || !aweme4.isTop()) {
                        Aweme aweme5 = AdSettingsActivity.f153198d;
                        if (aweme5 == null || aweme5.playlist_info == null) {
                            AdSettingsApi adSettingsApi = adSettingsActivity.f153202c;
                            if (d) {
                                i = 2;
                            }
                            adSettingsApi.requestDarkPostUpdate(str, i).enqueue(new C68463u(adSettingsActivity, d));
                            return;
                        }
                        C23028c.m43435a((C23023b) new C23023b(adSettingsActivity).mo37483b(R.string.b3t), C68462t.f153237a).mo37405a().mo37396b().show();
                        return;
                    }
                    C23028c.m43435a((C23023b) new C23023b(adSettingsActivity).mo37483b(R.string.b3r), C68461s.f153236a).mo37405a().mo37396b().show();
                    return;
                }
                C23028c.m43435a((C23023b) new C23023b(adSettingsActivity).mo37483b(R.string.b3s), C68460r.f153235a).mo37405a().mo37396b().show();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.eu_) {
                String str = this.f153201b;
                if (str != null) {
                    try {
                        C80228av.m139063a(str, str, this, PrivacyCert.Builder.Companion.with("bpea-216").usage("Users share their video code with advertisers to promote their video on  ads.").tag("clickToCopyVideoCode").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                    } catch (C13340a e) {
                        C51423a.m95790a((Throwable) e);
                    }
                    new C23144b(this).mo37635a(getResources().getString(R.string.au3)).mo37637b();
                }
            } else if (id == R.id.ewl) {
                C37595a a = C37595a.C37597b.m75858a(getResources().getString(R.string.fho), new C68465w(this), 0, 0);
                a.setCancelable(true);
                a.show(getSupportFragmentManager(), "authorization_dialog");
            } else if (id == R.id.euy) {
                if (this.f153203f == 2) {
                    String str2 = this.f153200a;
                    if (str2 != null) {
                        this.f153202c.requestCodeDelete(str2, false).enqueue(new C68457q(this));
                        return;
                    }
                    return;
                }
                String string = getResources().getString(R.string.b53);
                C89219l.m154716b(string, "");
                String string2 = getResources().getString(R.string.b4w);
                C89219l.m154716b(string2, "");
                C68452l lVar = new C68452l(this);
                String string3 = getResources().getString(R.string.b54);
                C89219l.m154716b(string3, "");
                mo108920a(string, string2, lVar, true, string3);
            } else if (id == R.id.evz) {
                C37595a a2 = C37595a.C37597b.m75858a(getResources().getString(R.string.fho), new C68468z(this), this.f153204g, this.f153205h);
                a2.setCancelable(true);
                a2.show(getSupportFragmentManager(), "extend_authorization_period_dialog");
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", true);
        super.onCreate(bundle);
        super.overridePendingTransition(R.anim.dq, 0);
        setContentView(R.layout.at);
        this.f153200a = m120867a(getIntent(), "id");
        mo108918a().show();
        ((TextTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C68449i(this));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(R.string.fns);
        C89219l.m154716b(string, "");
        String string2 = getString(R.string.fnr);
        C89219l.m154716b(string2, "");
        String a = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{string}, 1));
        C89219l.m154716b(a, "");
        int a2 = C89361p.m154888a((CharSequence) a, string, 0, false, 6);
        spannableStringBuilder.append((CharSequence) a);
        spannableStringBuilder.setSpan(new C68443d(this), a2, string.length() + a2, 33);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.fq);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.fq);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(spannableStringBuilder);
        ((CommonItemView) _$_findCachedViewById(R.id.fl)).setOnCheckedChangeListener(new C68444e(this));
        ((CommonItemView) _$_findCachedViewById(R.id.fl)).setOnClickListener(new View$OnClickListenerC68445f(this));
        ((CommonItemView) _$_findCachedViewById(R.id.dp)).setOnClickListener(new View$OnClickListenerC68447g(this));
        ((CommonItemView) _$_findCachedViewById(R.id.dp)).setOnCheckedChangeListener(C68448h.f153221a);
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.ewl);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.c3j);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(8);
        findViewById(R.id.ewl).setOnClickListener(this);
        findViewById(R.id.eu_).setOnClickListener(this);
        findViewById(R.id.euy).setOnClickListener(this);
        findViewById(R.id.evz).setOnClickListener(this);
        mo108923c();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$y */
    public static final class DialogInterface$OnClickListenerC68467y implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC68467y f153244a = new DialogInterface$OnClickListenerC68467y();

        static {
            Covode.recordClassIndex(80713);
        }

        DialogInterface$OnClickListenerC68467y() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$u */
    public static final class C68463u implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153238a;

        /* renamed from: b */
        final /* synthetic */ boolean f153239b;

        static {
            Covode.recordClassIndex(80709);
        }

        C68463u(AdSettingsActivity adSettingsActivity, boolean z) {
            this.f153238a = adSettingsActivity;
            this.f153239b = z;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            new C23144b(this.f153238a).mo37635a("Request Failed").mo37637b();
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
            String str;
            AbstractC28019l c;
            AbstractC28019l c2;
            if (uVar != null && uVar.f52261a.mo35845a() && uVar.f52262b != null) {
                C28022o a = this.f153238a.mo108917a(uVar.f52262b);
                if (a == null || (c2 = a.mo46803c("status_msg")) == null) {
                    str = null;
                } else {
                    str = c2.mo46689c();
                }
                if (!TextUtils.isEmpty(str)) {
                    new C23144b(this.f153238a).mo37635a(str).mo37637b();
                }
                if (a != null && (c = a.mo46803c("status_code")) != null && c.mo46694g() == 0) {
                    CommonItemView commonItemView = (CommonItemView) this.f153238a._$_findCachedViewById(R.id.dp);
                    C89219l.m154716b(commonItemView, "");
                    commonItemView.setChecked(!this.f153239b);
                    CommonItemView commonItemView2 = (CommonItemView) this.f153238a._$_findCachedViewById(R.id.dp);
                    C89219l.m154716b(commonItemView2, "");
                    AbstractC81915c.m141874a(new C63495b(commonItemView2.mo27138d()));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$v */
    public static final class C68464v implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153240a;

        /* renamed from: b */
        final /* synthetic */ boolean f153241b;

        static {
            Covode.recordClassIndex(80710);
        }

        C68464v(AdSettingsActivity adSettingsActivity, boolean z) {
            this.f153240a = adSettingsActivity;
            this.f153241b = z;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            new C23144b(this.f153240a).mo37635a("Request Failed").mo37637b();
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
            String str;
            int i;
            boolean z;
            AbstractC28019l c;
            AbstractC28019l c2;
            if (uVar != null && uVar.f52261a.mo35845a() && uVar.f52262b != null) {
                C28022o a = this.f153240a.mo108917a(uVar.f52262b);
                if (a == null || (c2 = a.mo46803c("status_msg")) == null) {
                    str = null;
                } else {
                    str = c2.mo46689c();
                }
                if (!TextUtils.isEmpty(str)) {
                    new C23144b(this.f153240a).mo37635a(str).mo37637b();
                }
                if (a == null || (c = a.mo46803c("status_code")) == null) {
                    i = -1;
                } else {
                    i = c.mo46694g();
                }
                CommonItemView commonItemView = (CommonItemView) this.f153240a._$_findCachedViewById(R.id.fl);
                C89219l.m154716b(commonItemView, "");
                if (i != 0) {
                    z = this.f153241b;
                } else if (!this.f153241b) {
                    z = true;
                } else {
                    z = false;
                }
                commonItemView.setChecked(z);
            }
        }
    }

    /* renamed from: a */
    private static String m120867a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$x */
    public static final class DialogInterface$OnClickListenerC68466x implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f153243a;

        static {
            Covode.recordClassIndex(80712);
        }

        DialogInterface$OnClickListenerC68466x(AbstractC89171a aVar) {
            this.f153243a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f153243a.invoke();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity$p */
    public static final class C68456p implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ AdSettingsActivity f153229a;

        /* renamed from: b */
        final /* synthetic */ long f153230b;

        /* renamed from: c */
        final /* synthetic */ long f153231c;

        static {
            Covode.recordClassIndex(80702);
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            new C23144b(this.f153229a).mo37635a("Request Failed").mo37637b();
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
            String str;
            AbstractC28019l c;
            AbstractC28019l c2;
            if (uVar != null && uVar.f52261a.mo35845a() && uVar.f52262b != null) {
                C28022o a = this.f153229a.mo108917a(uVar.f52262b);
                String str2 = null;
                if (a == null || (c2 = a.mo46803c("status_msg")) == null) {
                    str = null;
                } else {
                    str = c2.mo46689c();
                }
                if (!TextUtils.isEmpty(str)) {
                    new C23144b(this.f153229a).mo37635a(str).mo37637b();
                }
                if (!(a == null || (c = a.mo46803c("video_code")) == null)) {
                    str2 = c.mo46689c();
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f153229a.mo108919a(str2, 1, this.f153230b, this.f153231c);
                }
            }
        }

        C68456p(AdSettingsActivity adSettingsActivity, long j, long j2) {
            this.f153229a = adSettingsActivity;
            this.f153230b = j;
            this.f153231c = j2;
        }
    }

    /* renamed from: a */
    public final void mo108919a(String str, int i, long j, long j2) {
        boolean z;
        String string;
        this.f153201b = str;
        this.f153203f = i;
        this.f153204g = j;
        this.f153205h = j2;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 8;
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.ewl);
            C89219l.m154716b(tuxTextView, "");
            CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.fl);
            C89219l.m154716b(commonItemView, "");
            if (!commonItemView.mo27138d()) {
                i2 = 8;
            }
            tuxTextView.setVisibility(i2);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.c3j);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.ewl);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R.id.c3j);
        C89219l.m154716b(linearLayout2, "");
        CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.fl);
        C89219l.m154716b(commonItemView2, "");
        if (commonItemView2.mo27138d()) {
            i3 = 0;
        }
        linearLayout2.setVisibility(i3);
        if (i == 1) {
            string = getResources().getString(R.string.agu);
        } else if (i == 2) {
            string = getResources().getString(R.string.agv);
        } else if (i != 3) {
            string = "";
        } else {
            string = getResources().getString(R.string.agw);
        }
        C89219l.m154716b(string, "");
        String str2 = getResources().getString(R.string.agx) + ": " + string;
        SpannableString spannableString = new SpannableString(str2);
        int a = C89361p.m154888a((CharSequence) str2, string, 0, false, 6);
        if (a >= 0) {
            spannableString.setSpan(new StyleSpan(1), a, string.length() + a, 33);
        }
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.ets);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(spannableString);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault());
        Date date = new Date(j * 1000);
        Date date2 = new Date(j2 * 1000);
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.esh);
        C89219l.m154716b(tuxTextView4, "");
        tuxTextView4.setText(getResources().getString(R.string.wd) + ":\n" + simpleDateFormat.format(date) + " - " + simpleDateFormat.format(date2));
    }

    /* renamed from: a */
    public final void mo108920a(String str, String str2, AbstractC89171a<C89391z> aVar, boolean z, String str3) {
        C17197a.C17200a aVar2 = new C17197a.C17200a(this);
        if (!TextUtils.isEmpty(str3)) {
            aVar2.f41070a = str3;
        }
        aVar2.f41071b = str;
        aVar2.mo27192a(str2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC68466x(aVar), false);
        if (z) {
            aVar2.mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC68467y.f153244a, false);
        }
        aVar2.f41067M = false;
        aVar2.mo27193a().mo27185c();
    }
}
