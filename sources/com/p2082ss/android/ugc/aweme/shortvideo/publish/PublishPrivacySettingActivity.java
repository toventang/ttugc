package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.AVPreferences;
import com.p2082ss.android.ugc.aweme.setting.C68034bs;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity */
public final class PublishPrivacySettingActivity extends ActivityC33402b {

    /* renamed from: d */
    public String f162637d = "";

    /* renamed from: e */
    private boolean f162638e;

    /* renamed from: f */
    private boolean f162639f;

    /* renamed from: g */
    private boolean f162640g;

    /* renamed from: h */
    private HashMap<String, String> f162641h;

    /* renamed from: i */
    private boolean f162642i = true;

    /* renamed from: j */
    private HashMap f162643j;

    static {
        Covode.recordClassIndex(85236);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f162643j == null) {
            this.f162643j = new HashMap();
        }
        View view = (View) this.f162643j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f162643j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d */
    public final void mo59480d() {
        C23073a.C23074a.m43508a(this).mo37494a(R.color.l).mo37503d(R.color.l).mo37495a(true).f54627a.mo33415d();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
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

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        CommonItemView commonItemView = (CommonItemView) mo59481d_(R.id.a_b);
        C89219l.m154716b(commonItemView, "");
        bundle.putBoolean("comment_item_checked", commonItemView.mo27138d());
        CommonItemView commonItemView2 = (CommonItemView) mo59481d_(R.id.apx);
        C89219l.m154716b(commonItemView2, "");
        bundle.putBoolean("react_duet_item_checked", commonItemView2.mo27138d());
        CommonItemView commonItemView3 = (CommonItemView) mo59481d_(R.id.ic);
        C89219l.m154716b(commonItemView3, "");
        bundle.putBoolean("download_item_checked", commonItemView3.mo27138d());
        intent.putExtras(bundle);
        setResult(-1, intent);
        super.onBackPressed();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity$c */
    public static final class C72556c implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ PublishPrivacySettingActivity f162646a;

        static {
            Covode.recordClassIndex(85239);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72556c(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f162646a = publishPrivacySettingActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f162646a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity$a */
    static final class View$OnClickListenerC72554a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PublishPrivacySettingActivity f162644a;

        static {
            Covode.recordClassIndex(85237);
        }

        View$OnClickListenerC72554a(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f162644a = publishPrivacySettingActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!C72681t.f162944a) {
                CommonItemView commonItemView = (CommonItemView) this.f162644a.mo59481d_(R.id.ic);
                C89219l.m154716b(commonItemView, "");
                if (!commonItemView.mo27138d()) {
                    new C79459a(this.f162644a).mo123050a(R.string.bbo).mo123053a();
                    return;
                }
            }
            CommonItemView commonItemView2 = (CommonItemView) this.f162644a.mo59481d_(R.id.ic);
            C89219l.m154716b(commonItemView2, "");
            CommonItemView commonItemView3 = (CommonItemView) this.f162644a.mo59481d_(R.id.ic);
            C89219l.m154716b(commonItemView3, "");
            commonItemView2.setChecked(!commonItemView3.mo27138d());
            C84425b a = new C84425b().mo129406a("creation_id", this.f162644a.f162637d).mo129406a("enter_from", "video_post_page");
            CommonItemView commonItemView4 = (CommonItemView) this.f162644a.mo59481d_(R.id.ic);
            C89219l.m154716b(commonItemView4, "");
            if (commonItemView4.mo27138d()) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("click_download_control", a.mo129406a("to_status", str).f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity$b */
    static final class View$OnClickListenerC72555b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PublishPrivacySettingActivity f162645a;

        static {
            Covode.recordClassIndex(85238);
        }

        View$OnClickListenerC72555b(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f162645a = publishPrivacySettingActivity;
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickAgent.onClick(view);
            C63244g.m114602a().mo73277e().setReactDuetSettingChanged(true);
            AVPreferences e = C63244g.m114602a().mo73277e();
            CommonItemView commonItemView = (CommonItemView) this.f162645a.mo59481d_(R.id.apx);
            C89219l.m154716b(commonItemView, "");
            if (commonItemView.mo27138d()) {
                i = C68034bs.f152394e;
            } else {
                i = C68034bs.f152395f;
            }
            e.setReactDuetSettingCurrent(i);
            CommonItemView commonItemView2 = (CommonItemView) this.f162645a.mo59481d_(R.id.apx);
            C89219l.m154716b(commonItemView2, "");
            CommonItemView commonItemView3 = (CommonItemView) this.f162645a.mo59481d_(R.id.apx);
            C89219l.m154716b(commonItemView3, "");
            commonItemView2.setChecked(true ^ commonItemView3.mo27138d());
            C84425b a = new C84425b().mo129406a("creation_id", this.f162645a.f162637d).mo129406a("enter_from", "video_post_page");
            CommonItemView commonItemView4 = (CommonItemView) this.f162645a.mo59481d_(R.id.apx);
            C89219l.m154716b(commonItemView4, "");
            if (commonItemView4.mo27138d()) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("click_react_duet_control", a.mo129406a("to_status", str).f188764a);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bx);
        this.f162638e = getIntent().getBooleanExtra("comment_item_checked", false);
        this.f162639f = getIntent().getBooleanExtra("react_duet_item_checked", false);
        this.f162640g = getIntent().getBooleanExtra("download_item_checked", true);
        this.f162642i = getIntent().getBooleanExtra("can_react_duet", true);
        String a = m128026a(getIntent(), "creation_id");
        if (a == null) {
            a = "";
        }
        this.f162637d = a;
        Serializable serializableExtra = getIntent().getSerializableExtra("mob_data");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
        this.f162641h = (HashMap) serializableExtra;
        C63238c.f143591r.mo93933a((CommonItemView) mo59481d_(R.id.a_b), this.f162638e, this.f162641h);
        if (this.f162642i) {
            CommonItemView commonItemView = (CommonItemView) mo59481d_(R.id.apx);
            C89219l.m154716b(commonItemView, "");
            commonItemView.setVisibility(0);
            CommonItemView commonItemView2 = (CommonItemView) mo59481d_(R.id.apx);
            C89219l.m154716b(commonItemView2, "");
            commonItemView2.setChecked(this.f162639f);
            ((CommonItemView) mo59481d_(R.id.apx)).setOnClickListener(new View$OnClickListenerC72555b(this));
        } else {
            CommonItemView commonItemView3 = (CommonItemView) mo59481d_(R.id.apx);
            C89219l.m154716b(commonItemView3, "");
            commonItemView3.setVisibility(8);
        }
        if (C72681t.m128157a()) {
            CommonItemView commonItemView4 = (CommonItemView) mo59481d_(R.id.ic);
            C89219l.m154716b(commonItemView4, "");
            commonItemView4.setVisibility(0);
            CommonItemView commonItemView5 = (CommonItemView) mo59481d_(R.id.ic);
            C89219l.m154716b(commonItemView5, "");
            commonItemView5.setChecked(this.f162640g);
            ((CommonItemView) mo59481d_(R.id.ic)).setOnClickListener(new View$OnClickListenerC72554a(this));
        } else {
            CommonItemView commonItemView6 = (CommonItemView) mo59481d_(R.id.ic);
            C89219l.m154716b(commonItemView6, "");
            commonItemView6.setVisibility(8);
        }
        ((AbstractC17250a) mo59481d_(R.id.eiz)).setTitle(R.string.es3);
        ((ButtonTitleBar) mo59481d_(R.id.eiz)).setOnTitleBarClickListener(new C72556c(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m128026a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
