package com.p2082ss.android.ugc.aweme.compliance.business.report;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.widget.RadiusLayout;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity */
public final class ReportWebPageDialogActivity extends ActivityC17312a implements AbstractC34471f {

    /* renamed from: c */
    public static final C39510a f93196c = new C39510a((byte) 0);

    /* renamed from: a */
    public Animation f93197a;

    /* renamed from: b */
    public int f93198b;

    /* renamed from: d */
    private AbstractC34467b f93199d;

    /* renamed from: e */
    private C40618a f93200e;

    /* renamed from: f */
    private AbstractC39518a f93201f;

    /* renamed from: g */
    private int f93202g;

    /* renamed from: h */
    private long f93203h;

    /* renamed from: i */
    private SparseArray f93204i;

    static {
        Covode.recordClassIndex(47202);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f93204i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f93204i == null) {
            this.f93204i = new SparseArray();
        }
        View view = (View) this.f93204i.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f93204i.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity$a */
    public static final class C39510a {
        static {
            Covode.recordClassIndex(47203);
        }

        private C39510a() {
        }

        public /* synthetic */ C39510a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m80185a(Activity activity, Intent intent) {
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }

        /* renamed from: a */
        public static void m80186a(Activity activity, Bundle bundle, String str, String str2) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
            bundle.putBoolean("show_load_dialog", false);
            bundle.putBoolean("webview_progress_bar", true);
            if (str == null) {
                str = "";
            }
            bundle.putString("object_id", str);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("enter_from", str2);
            Intent intent = new Intent(activity, ReportWebPageDialogActivity.class);
            intent.putExtras(bundle);
            m80185a(activity, intent);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        AbstractC39518a aVar = this.f93201f;
        if (aVar == null) {
            C89219l.m154710a("webPageContainer");
        }
        AbstractC40735a f = aVar.mo67258f();
        if (f == null || !f.mo69922a()) {
            finish();
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

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        MethodCollector.m26663i(9169);
        if (this.f93198b <= 2) {
            Animation animation = this.f93197a;
            if (animation != null) {
                animation.cancel();
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.ai);
            this.f93197a = loadAnimation;
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC39511b(this));
                ((RadiusLayout) _$_findCachedViewById(R.id.agi)).startAnimation(this.f93197a);
                this.f93198b = 3;
                MethodCollector.m26664o(9169);
                return;
            }
            this.f93198b = 4;
            if (!isFinishing()) {
                super.finish();
                overridePendingTransition(0, 0);
            }
        }
        MethodCollector.m26664o(9169);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        long currentTimeMillis = System.currentTimeMillis();
        C39162r.m79460a("tns_report_webview", new C33744d().mo59981a("enter_time", this.f93203h).mo59981a("exit_time", currentTimeMillis).mo59981a("duration", currentTimeMillis - this.f93203h).mo59983a("enter_from", m80182a(getIntent(), "enter_from")).mo59983a("object_id", m80182a(getIntent(), "object_id")).f79943a);
        super.onDestroy();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity$b  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC39511b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ReportWebPageDialogActivity f93205a;

        static {
            Covode.recordClassIndex(47204);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        animationAnimation$AnimationListenerC39511b(ReportWebPageDialogActivity reportWebPageDialogActivity) {
            this.f93205a = reportWebPageDialogActivity;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f93205a.f93197a = null;
            this.f93205a.f93198b = 4;
            if (!this.f93205a.isFinishing()) {
                ReportWebPageDialogActivity.super.finish();
                this.f93205a.overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity$g  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC39517g implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ReportWebPageDialogActivity f93211a;

        static {
            Covode.recordClassIndex(47210);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        animationAnimation$AnimationListenerC39517g(ReportWebPageDialogActivity reportWebPageDialogActivity) {
            this.f93211a = reportWebPageDialogActivity;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f93211a.f93197a = null;
            this.f93211a.f93198b = 2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f
    public final void setActivityResultListener(AbstractC34467b bVar) {
        C89219l.m154721d(bVar, "");
        this.f93199d = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity$c */
    static final class View$OnClickListenerC39512c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReportWebPageDialogActivity f93206a;

        static {
            Covode.recordClassIndex(47205);
        }

        View$OnClickListenerC39512c(ReportWebPageDialogActivity reportWebPageDialogActivity) {
            this.f93206a = reportWebPageDialogActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f93206a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity$f */
    static final class C39515f extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C39515f f93209a = new C39515f();

        static {
            Covode.recordClassIndex(47208);
        }

        C39515f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C395161.f93210a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo68945a(int i) {
        int i2 = this.f93202g;
        if (i2 == 0) {
            return;
        }
        if (i > i2) {
            RadiusLayout radiusLayout = (RadiusLayout) _$_findCachedViewById(R.id.agi);
            C89219l.m154716b(radiusLayout, "");
            radiusLayout.getLayoutParams().height = this.f93202g;
            return;
        }
        RadiusLayout radiusLayout2 = (RadiusLayout) _$_findCachedViewById(R.id.agi);
        C89219l.m154716b(radiusLayout2, "");
        radiusLayout2.getLayoutParams().height = -1;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        MethodCollector.m26663i(9021);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && this.f93198b <= 0) {
            Animation animation = this.f93197a;
            if (animation != null) {
                animation.cancel();
            }
            RadiusLayout radiusLayout = (RadiusLayout) _$_findCachedViewById(R.id.agi);
            C89219l.m154716b(radiusLayout, "");
            radiusLayout.setTranslationY(0.0f);
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.ag);
            this.f93197a = loadAnimation;
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC39517g(this));
                ((RadiusLayout) _$_findCachedViewById(R.id.agi)).startAnimation(this.f93197a);
                this.f93198b = 1;
                MethodCollector.m26664o(9021);
                return;
            }
            this.f93198b = 2;
        }
        MethodCollector.m26664o(9021);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onCreate", true);
        activityConfiguration(C39515f.f93209a);
        super.onCreate(bundle);
        this.f93203h = System.currentTimeMillis();
        setContentView(R.layout.u4);
        overridePendingTransition(0, 0);
        C40618a a = C40618a.C40619a.m81985a(getIntent());
        C89219l.m154716b(a, "");
        this.f93200e = a;
        this.f93202g = getIntent().getIntExtra("half_screen_height", 0);
        mo68945a(C34723i.m70924a(this));
        RadiusLayout radiusLayout = (RadiusLayout) _$_findCachedViewById(R.id.agi);
        C89219l.m154716b(radiusLayout, "");
        radiusLayout.setTranslationY((float) C34723i.m70924a(this));
        _$_findCachedViewById(R.id.am8).setOnClickListener(new View$OnClickListenerC39512c(this));
        C40618a aVar = this.f93200e;
        if (aVar == null) {
            C89219l.m154710a("crossPlatformParams");
        }
        C39513d dVar = new C39513d(this, this, aVar);
        this.f93201f = dVar;
        dVar.mo68953a();
        C0792v.m2748a(_$_findCachedViewById(R.id.dnh), new C39514e(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m80182a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity$e */
    static final class C39514e implements AbstractC0788r {

        /* renamed from: a */
        final /* synthetic */ ReportWebPageDialogActivity f93208a;

        static {
            Covode.recordClassIndex(47207);
        }

        C39514e(ReportWebPageDialogActivity reportWebPageDialogActivity) {
            this.f93208a = reportWebPageDialogActivity;
        }

        @Override // androidx.core.p037h.AbstractC0788r
        /* renamed from: a */
        public final C0753ad mo553a(View view, C0753ad adVar) {
            C89219l.m154716b(view, "");
            if (view.getHeight() == 0) {
                ReportWebPageDialogActivity reportWebPageDialogActivity = this.f93208a;
                reportWebPageDialogActivity.mo68945a(C34723i.m70924a(reportWebPageDialogActivity));
                if (adVar == null) {
                    return null;
                }
            } else {
                ReportWebPageDialogActivity reportWebPageDialogActivity2 = this.f93208a;
                int height = view.getHeight();
                C89219l.m154716b(adVar, "");
                reportWebPageDialogActivity2.mo68945a((height - adVar.mo2869d()) - adVar.mo2867b());
            }
            C0792v.m2737a(view, adVar.mo2866a(0, adVar.mo2867b(), 0, adVar.mo2869d()));
            return adVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity$d */
    public static final class C39513d extends AbstractC39518a {

        /* renamed from: b */
        final /* synthetic */ ReportWebPageDialogActivity f93207b;

        static {
            Covode.recordClassIndex(47206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39513d(ReportWebPageDialogActivity reportWebPageDialogActivity, Activity activity, C40618a aVar) {
            super(activity, aVar, (byte) 0);
            this.f93207b = reportWebPageDialogActivity;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC34467b bVar = this.f93199d;
        if (bVar != null) {
            bVar.mo60905a(i, i2, intent);
        }
    }
}
