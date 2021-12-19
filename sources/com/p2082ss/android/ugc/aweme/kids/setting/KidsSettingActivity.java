package com.p2082ss.android.ugc.aweme.kids.setting;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.kids.homepage.compliance.KidsComplianceServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3381d.C57953a;
import com.p2082ss.android.ugc.aweme.kids.setting.p3367a.C57802a;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity */
public final class KidsSettingActivity extends ActivityC17312a {

    /* renamed from: a */
    public int f131827a;

    /* renamed from: b */
    public long f131828b;

    /* renamed from: c */
    private HashMap f131829c;

    static {
        Covode.recordClassIndex(67792);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131829c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131829c == null) {
            this.f131829c = new HashMap();
        }
        View view = (View) this.f131829c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131829c.put(Integer.valueOf(i), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity$b */
    static final class C57798b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ KidsSettingActivity f131831a;

        static {
            Covode.recordClassIndex(67794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57798b(KidsSettingActivity kidsSettingActivity) {
            super(0);
            this.f131831a = kidsSettingActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f131831a.finish();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.f205073do, R.anim.dx);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        String str;
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onResume", true);
        super.onResume();
        AbstractC58069b a = C57953a.C57955b.f132121a.mo95295a();
        if (a != null) {
            str = a.mo90021e();
        } else {
            str = null;
        }
        ((CommonItemView) _$_findCachedViewById(R.id.abm)).setRightText(str);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onResume", false);
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

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity$c */
    static final class C57799c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57799c f131832a = new C57799c();

        static {
            Covode.recordClassIndex(67795);
        }

        C57799c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C578001.f131833a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m104508a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            List<String> a = KidsComplianceServiceImpl.m104360c().mo94885a();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if ((tag instanceof String) && !TextUtils.isEmpty((CharSequence) tag) && a.contains(tag)) {
                        childAt.setVisibility(8);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity$a */
    static final class View$OnClickListenerC57797a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ KidsSettingActivity f131830a;

        static {
            Covode.recordClassIndex(67793);
        }

        View$OnClickListenerC57797a(KidsSettingActivity kidsSettingActivity) {
            this.f131830a = kidsSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (System.currentTimeMillis() - this.f131830a.f131828b < 500) {
                this.f131830a.f131827a++;
            } else {
                this.f131830a.f131827a = 0;
            }
            if (this.f131830a.f131827a >= 4) {
                TuxTextView tuxTextView = (TuxTextView) this.f131830a._$_findCachedViewById(R.id.f_t);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                String serverDeviceId = AppLog.getServerDeviceId();
                if (serverDeviceId == null) {
                    serverDeviceId = "";
                }
                IAVSettingsService avsettingsConfig = AVExternalServiceImpl.m113114a().configService().avsettingsConfig();
                String c = KidsCommonServiceImpl.m104422g().mo94336c();
                StringBuilder sb = new StringBuilder();
                sb.append("UserId: " + C57802a.m104517a()).append("\n").append("DeviceId: ".concat(String.valueOf(serverDeviceId))).append("\n").append("UpdateVerionCode: " + C17867d.m33083d()).append("\n").append("GitSHA: " + C17867d.f42592p).append("\n").append("VESDK: " + avsettingsConfig.getVESDKVersion()).append("\n").append("EffectSdk: " + avsettingsConfig.getEffectVersion()).append("\n").append(c);
                TuxTextView tuxTextView2 = (TuxTextView) this.f131830a._$_findCachedViewById(R.id.f_t);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setText(sb.toString());
                this.f131830a.f131827a = 0;
            }
            this.f131830a.f131828b = System.currentTimeMillis();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onCreate", true);
        activityConfiguration(C57799c.f131832a);
        super.onCreate(bundle);
        setContentView(R.layout.abs);
        C23194g gVar = new C23194g();
        String string = getString(R.string.aiu);
        C89219l.m154716b(string, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).mo37725a(gVar.mo37753a(string));
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).mo37724a((AbstractC23189c) new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C57798b(this)));
        int i = Build.VERSION.SDK_INT;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.e7_);
        C89219l.m154716b(_$_findCachedViewById, "");
        _$_findCachedViewById.getLayoutParams().height = C18247a.m33946a(this);
        String string2 = getString(R.string.fl2);
        C89219l.m154716b(string2, "");
        String a = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{C17867d.m33088i(), String.valueOf(C17867d.m33087h())}, 2));
        C89219l.m154716b(a, "");
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.fbi);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(a + "");
        ((TuxTextView) _$_findCachedViewById(R.id.fbi)).setOnClickListener(new View$OnClickListenerC57797a(this));
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.dnk);
        C89219l.m154716b(relativeLayout, "");
        ((RelativeLayout) _$_findCachedViewById(R.id.dnk)).setBackgroundColor(C0643b.m2378c(relativeLayout.getContext(), R.color.l));
        View findViewById = ((RelativeLayout) _$_findCachedViewById(R.id.dnk)).findViewById(R.id.cei);
        C89219l.m154716b(findViewById, "");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        ((CommonItemView) _$_findCachedViewById(R.id.cwr)).setLeftText("Debug Test");
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.cwr);
        C89219l.m154716b(commonItemView, "");
        int i2 = 8;
        commonItemView.setVisibility(8);
        CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.ch0);
        C89219l.m154716b(commonItemView2, "");
        if (C57802a.m104518b()) {
            i2 = 0;
        }
        commonItemView2.setVisibility(i2);
        m104508a(viewGroup);
        C57984p.m104793a(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onCreate", false);
    }
}
