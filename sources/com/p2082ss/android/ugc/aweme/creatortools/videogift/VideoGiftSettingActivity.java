package com.p2082ss.android.ugc.aweme.creatortools.videogift;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80466fy;
import com.p2082ss.android.ugc.aweme.utils.C80586is;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity */
public final class VideoGiftSettingActivity extends ActivityC17312a {

    /* renamed from: a */
    private boolean f94762a;

    /* renamed from: b */
    private boolean f94763b;

    /* renamed from: c */
    private final C88411a f94764c = new C88411a();

    /* renamed from: d */
    private boolean f94765d;

    /* renamed from: e */
    private String f94766e = "";

    /* renamed from: f */
    private SparseArray f94767f;

    static {
        Covode.recordClassIndex(48312);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f94767f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f94767f == null) {
            this.f94767f = new SparseArray();
        }
        View view = (View) this.f94767f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f94767f.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        this.f94764c.dispose();
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

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity$a */
    static final class View$OnClickListenerC40501a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoGiftSettingActivity f94768a;

        static {
            Covode.recordClassIndex(48313);
        }

        View$OnClickListenerC40501a(VideoGiftSettingActivity videoGiftSettingActivity) {
            this.f94768a = videoGiftSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94768a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity$b */
    static final class View$OnClickListenerC40502b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoGiftSettingActivity f94769a;

        static {
            Covode.recordClassIndex(48314);
        }

        View$OnClickListenerC40502b(VideoGiftSettingActivity videoGiftSettingActivity) {
            this.f94769a = videoGiftSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f94769a, "aweme://webview").withParam(Uri.parse(C80466fy.m139470a("virtual-items"))).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity$c */
    static final class C40503c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C40503c f94770a = new C40503c();

        static {
            Covode.recordClassIndex(48315);
        }

        C40503c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C405041.f94771a);
            baseActivityViewModel2.config(C405052.f94772a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity$e */
    public static final class C40507e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoGiftSettingActivity f94774a;

        /* renamed from: b */
        final /* synthetic */ boolean f94775b;

        static {
            Covode.recordClassIndex(48319);
        }

        C40507e(VideoGiftSettingActivity videoGiftSettingActivity, boolean z) {
            this.f94774a = videoGiftSettingActivity;
            this.f94775b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            VideoGiftSettingActivity videoGiftSettingActivity = this.f94774a;
            CommonItemView commonItemView = (CommonItemView) videoGiftSettingActivity._$_findCachedViewById(R.id.bap);
            C89219l.m154716b(commonItemView, "");
            commonItemView.setChecked(this.f94775b);
            if (this.f94775b) {
                videoGiftSettingActivity.mo69582b(0);
            } else {
                videoGiftSettingActivity.mo69580a(0);
            }
            th.getMessage();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity$f */
    static final class View$OnClickListenerC40508f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoGiftSettingActivity f94776a;

        static {
            Covode.recordClassIndex(48320);
        }

        View$OnClickListenerC40508f(VideoGiftSettingActivity videoGiftSettingActivity) {
            this.f94776a = videoGiftSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
            boolean d = ((CommonItemView) view).mo27138d();
            if (d) {
                this.f94776a.mo69581a(d);
                return;
            }
            SmartRouter.buildRoute(this.f94776a, "aweme://video_gift_opt_in").withParam("bundle_video_gift_previous_page", "video_gift_opt_in").open();
            this.f94776a.finish();
        }
    }

    /* renamed from: a */
    public final void mo69580a(int i) {
        String str;
        String str2 = "gift_setting";
        if (!this.f94762a || this.f94763b) {
            str = str2;
        } else {
            this.f94763b = true;
            str = "video_gift_opt_in";
        }
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59980a("is_success", i);
        if (this.f94765d) {
            str2 = "notification";
        }
        C33744d a2 = a.mo59983a("previous_page", str2);
        C89219l.m154716b(a2, "");
        C39162r.m79460a("enable_video_gifting", a2.f79943a);
    }

    /* renamed from: b */
    public final void mo69582b(int i) {
        String str = "gift_setting";
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59980a("is_success", i);
        if (this.f94765d) {
            str = "notification";
        }
        C33744d a2 = a.mo59983a("previous_page", str);
        C89219l.m154716b(a2, "");
        C39162r.m79460a("disable_video_gifting", a2.f79943a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity$d */
    public static final class C40506d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoGiftSettingActivity f94773a;

        static {
            Covode.recordClassIndex(48318);
        }

        C40506d(VideoGiftSettingActivity videoGiftSettingActivity) {
            this.f94773a = videoGiftSettingActivity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C40515g gVar = (C40515g) obj;
            C89219l.m154721d(gVar, "");
            VideoGiftSettingActivity videoGiftSettingActivity = this.f94773a;
            Integer num = gVar.f94788a;
            if (num != null) {
                num.intValue();
                Integer num2 = gVar.f94788a;
                int value = EnumC40516h.ACCEPT.getValue();
                if (num2 != null && num2.intValue() == value) {
                    z = true;
                } else {
                    z = false;
                }
                C80586is.m139723a(z);
                Integer num3 = gVar.f94788a;
                int value2 = EnumC40516h.ACCEPT.getValue();
                if (num3 != null && num3.intValue() == value2) {
                    new C79459a(this.f94773a).mo123050a(R.string.h9t).mo123053a();
                    videoGiftSettingActivity.mo69580a(1);
                    return;
                }
                new C79459a(this.f94773a).mo123050a(R.string.h9s).mo123053a();
                videoGiftSettingActivity.mo69582b(1);
            }
        }
    }

    /* renamed from: a */
    public final void mo69581a(boolean z) {
        this.f94764c.mo142944a();
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.bap);
        C89219l.m154716b(commonItemView, "");
        commonItemView.setChecked(!z);
        this.f94764c.mo142945a(VideoGiftApi.C40489a.m81702a(!z).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C40506d(this), new C40507e(this, z)));
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        String str;
        String str2;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onCreate", true);
        activityConfiguration(C40503c.f94770a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.axc);
        Intent intent = getIntent();
        Boolean bool2 = null;
        if (intent != null) {
            bool = Boolean.valueOf(intent.getBooleanExtra("bundle_enter_from_gift_eligibility", false));
        } else {
            bool = null;
        }
        this.f94762a = bool.booleanValue();
        Intent intent2 = getIntent();
        if (intent2 == null || (str = m81704a(intent2, "bundle_video_gift_previous_page")) == null) {
            str = "";
        }
        this.f94766e = str;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            bool2 = Boolean.valueOf(intent3.getBooleanExtra("bundle_video_gift_enter_from_notification", false));
        }
        this.f94765d = bool2.booleanValue();
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
        C89219l.m154716b(buttonTitleBar, "");
        buttonTitleBar.getStartBtn().setOnClickListener(new View$OnClickListenerC40501a(this));
        ((ImageView) _$_findCachedViewById(R.id.ber)).setOnClickListener(new View$OnClickListenerC40502b(this));
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(C80586is.m139722a("vgc_visiting_first_time"), false);
        boolean z = Keva.getRepo("video_gift_settings_keva_repo").getBoolean(C80586is.m139722a("vgc_accept_gifting"), false);
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.bap);
        C89219l.m154716b(commonItemView, "");
        commonItemView.setChecked(z);
        ((CommonItemView) _$_findCachedViewById(R.id.bap)).setOnClickListener(new View$OnClickListenerC40508f(this));
        if (this.f94762a) {
            mo69581a(false);
        }
        C33744d a = new C33744d().mo59983a("enter_from", "gift_setting");
        if (this.f94765d) {
            str2 = "notification";
        } else {
            str2 = this.f94766e;
        }
        C33744d a2 = a.mo59983a("previous_page", str2);
        C89219l.m154716b(a2, "");
        C39162r.m79460a("enter_gift_setting_page", a2.f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m81704a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
