package com.p2082ss.android.ugc.aweme.creatortools.videogift;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IPrivacyDisclaimerUtil;
import com.p2082ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi;
import com.p2082ss.android.ugc.aweme.utils.C80466fy;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity */
public final class VideoGiftEligibilityActivity extends ActivityC17312a {

    /* renamed from: a */
    public boolean f94744a;

    /* renamed from: b */
    public String f94745b = "";

    /* renamed from: c */
    private final C88411a f94746c = new C88411a();

    /* renamed from: d */
    private SparseArray f94747d;

    static {
        Covode.recordClassIndex(48300);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f94747d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f94747d == null) {
            this.f94747d = new SparseArray();
        }
        View view = (View) this.f94747d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f94747d.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        this.f94746c.dispose();
        super.onDestroy();
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

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity$b */
    static final class C40491b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoGiftEligibilityActivity f94749a;

        static {
            Covode.recordClassIndex(48302);
        }

        C40491b(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f94749a = videoGiftEligibilityActivity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            th.getMessage();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity$c */
    static final class View$OnClickListenerC40492c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoGiftEligibilityActivity f94750a;

        static {
            Covode.recordClassIndex(48303);
        }

        View$OnClickListenerC40492c(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f94750a = videoGiftEligibilityActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94750a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity$e */
    static final class View$OnClickListenerC40494e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoGiftEligibilityActivity f94752a;

        /* renamed from: b */
        final /* synthetic */ IPrivacyDisclaimerUtil f94753b;

        static {
            Covode.recordClassIndex(48305);
        }

        View$OnClickListenerC40494e(VideoGiftEligibilityActivity videoGiftEligibilityActivity, IPrivacyDisclaimerUtil iPrivacyDisclaimerUtil) {
            this.f94752a = videoGiftEligibilityActivity;
            this.f94753b = iPrivacyDisclaimerUtil;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94753b.mo57234b(this.f94752a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity$f */
    static final class View$OnClickListenerC40495f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoGiftEligibilityActivity f94754a;

        /* renamed from: b */
        final /* synthetic */ IPrivacyDisclaimerUtil f94755b;

        static {
            Covode.recordClassIndex(48306);
        }

        View$OnClickListenerC40495f(VideoGiftEligibilityActivity videoGiftEligibilityActivity, IPrivacyDisclaimerUtil iPrivacyDisclaimerUtil) {
            this.f94754a = videoGiftEligibilityActivity;
            this.f94755b = iPrivacyDisclaimerUtil;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94755b.mo57232a(this.f94754a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity$g */
    static final class View$OnClickListenerC40496g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoGiftEligibilityActivity f94756a;

        /* renamed from: b */
        final /* synthetic */ IPrivacyDisclaimerUtil f94757b;

        static {
            Covode.recordClassIndex(48307);
        }

        View$OnClickListenerC40496g(VideoGiftEligibilityActivity videoGiftEligibilityActivity, IPrivacyDisclaimerUtil iPrivacyDisclaimerUtil) {
            this.f94756a = videoGiftEligibilityActivity;
            this.f94757b = iPrivacyDisclaimerUtil;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94757b.mo57235c(this.f94756a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity$d */
    static final class View$OnClickListenerC40493d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoGiftEligibilityActivity f94751a;

        static {
            Covode.recordClassIndex(48304);
        }

        View$OnClickListenerC40493d(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f94751a = videoGiftEligibilityActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f94751a, "aweme://webview").withParam(Uri.parse(C80466fy.m139470a("virtual-items"))).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity$i */
    static final class C40498i extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C40498i f94759a = new C40498i();

        static {
            Covode.recordClassIndex(48309);
        }

        C40498i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C404991.f94760a);
            baseActivityViewModel2.config(C405002.f94761a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity$h */
    static final class View$OnClickListenerC40497h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoGiftEligibilityActivity f94758a;

        static {
            Covode.recordClassIndex(48308);
        }

        View$OnClickListenerC40497h(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f94758a = videoGiftEligibilityActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f94758a, "aweme://account_settings_gifts_setting").withParam("bundle_enter_from_gift_eligibility", true).withParam("bundle_video_gift_enter_from_notification", this.f94758a.f94744a).withParam("bundle_video_gift_previous_page", this.f94758a.f94745b).open();
            this.f94758a.finish();
            if (this.f94758a.f94744a) {
                str = "notification";
            } else {
                str = "gift_setting";
            }
            C33744d a = new C33744d().mo59983a("enter_from", str);
            C89219l.m154716b(a, "");
            C39162r.m79460a("toggle_video_gift_on", a.f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity$a */
    static final class C40490a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoGiftEligibilityActivity f94748a;

        static {
            Covode.recordClassIndex(48301);
        }

        C40490a(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f94748a = videoGiftEligibilityActivity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<String> list;
            String str;
            MethodCollector.m26663i(3503);
            C40513e eVar = (C40513e) obj;
            C89219l.m154721d(eVar, "");
            VideoGiftEligibilityActivity videoGiftEligibilityActivity = this.f94748a;
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) videoGiftEligibilityActivity._$_findCachedViewById(R.id.b_x);
            C89219l.m154716b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) videoGiftEligibilityActivity._$_findCachedViewById(R.id.atb);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(0);
            C40510b bVar = eVar.f94784a;
            if (!(bVar == null || (list = bVar.f94779b) == null || (str = (String) C89070n.m154583g((List) list)) == null)) {
                C20766v a = C20761r.m39061a(str);
                a.f49092E = (SmartImageView) videoGiftEligibilityActivity._$_findCachedViewById(R.id.d_p);
                a.f49125v = EnumC20767w.CENTER_INSIDE;
                a.mo34186c();
            }
            boolean z = true;
            List<C40512d> list2 = eVar.f94785b;
            if (list2 != null) {
                for (T t : list2) {
                    View a2 = C1764a.m5927a(LayoutInflater.from(videoGiftEligibilityActivity), R.layout.ay1, (ViewGroup) videoGiftEligibilityActivity._$_findCachedViewById(R.id.ci1), false);
                    Integer num = t.f94783c;
                    int value = EnumC40514f.STATUS_PASS.getValue();
                    if (num == null || num.intValue() != value) {
                        ((ImageView) videoGiftEligibilityActivity._$_findCachedViewById(R.id.dj0)).setImageResource(0);
                        z = false;
                    }
                    C89219l.m154716b(a2, "");
                    TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.dj1);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setText(t.f94781a);
                    ((LinearLayout) videoGiftEligibilityActivity._$_findCachedViewById(R.id.ci1)).addView(a2);
                }
                if (!z) {
                    TuxButton tuxButton = (TuxButton) videoGiftEligibilityActivity._$_findCachedViewById(R.id.eqr);
                    C89219l.m154716b(tuxButton, "");
                    tuxButton.setEnabled(false);
                }
            }
            MethodCollector.m26664o(3503);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        String str;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onCreate", true);
        activityConfiguration(C40498i.f94759a);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            bool = Boolean.valueOf(intent.getBooleanExtra("bundle_video_gift_enter_from_notification", false));
        } else {
            bool = null;
        }
        this.f94744a = bool.booleanValue();
        Intent intent2 = getIntent();
        if (intent2 == null || (str = m81703a(intent2, "bundle_video_gift_previous_page")) == null) {
            str = "";
        }
        this.f94745b = str;
        supportRequestWindowFeature(10);
        setContentView(R.layout.axd);
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
        C89219l.m154716b(buttonTitleBar, "");
        buttonTitleBar.getStartBtn().setOnClickListener(new View$OnClickListenerC40492c(this));
        ((ImageView) _$_findCachedViewById(R.id.ber)).setOnClickListener(new View$OnClickListenerC40493d(this));
        IPrivacyDisclaimerUtil a = PrivacyDisclaimerUtilService.m65401a();
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.d6m);
        C89219l.m154716b(tuxTextView, "");
        a.mo57233a(this, tuxTextView, new View$OnClickListenerC40494e(this, a), new View$OnClickListenerC40495f(this, a), new View$OnClickListenerC40496g(this, a));
        ((TuxButton) _$_findCachedViewById(R.id.eqr)).setOnClickListener(new View$OnClickListenerC40497h(this));
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) _$_findCachedViewById(R.id.b_x);
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.atb);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(8);
        this.f94746c.mo142944a();
        this.f94746c.mo142945a(VideoGiftApi.C40489a.m81701a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C40490a(this), new C40491b(this)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m81703a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
