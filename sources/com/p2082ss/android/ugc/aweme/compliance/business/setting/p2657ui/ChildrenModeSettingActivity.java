package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.AbstractC34889bn;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.business.setting.p2656a.C39534c;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.DialogC58952a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkService;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.external.ICacheService;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.setting.C68124l;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80256bn;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity */
public class ChildrenModeSettingActivity extends ActivityC17312a implements View.OnClickListener, IAccountService.AbstractC31272b, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    ViewGroup f93246a;

    /* renamed from: b */
    TextTitleBar f93247b;

    /* renamed from: c */
    CommonItemView f93248c;

    /* renamed from: d */
    CommonItemView f93249d;

    /* renamed from: e */
    CommonItemView f93250e;

    /* renamed from: f */
    CommonItemView f93251f;

    /* renamed from: g */
    CommonItemView f93252g;

    /* renamed from: h */
    CommonItemView f93253h;

    /* renamed from: i */
    CommonItemView f93254i;

    /* renamed from: j */
    CommonItemView f93255j;

    /* renamed from: k */
    CommonItemView f93256k;

    /* renamed from: l */
    TextView f93257l;

    /* renamed from: m */
    TextView f93258m;

    /* renamed from: n */
    CommonItemView f93259n;

    /* renamed from: o */
    CommonItemView f93260o;

    /* renamed from: p */
    CommonItemView f93261p;

    /* renamed from: q */
    CommonItemView f93262q;

    /* renamed from: r */
    CommonItemView f93263r;

    /* renamed from: s */
    CommonItemView f93264s;

    /* renamed from: t */
    DialogC58952a f93265t;

    /* renamed from: u */
    protected C17197a f93266u;

    /* renamed from: v */
    private int f93267v;

    /* renamed from: w */
    private long f93268w;

    static {
        Covode.recordClassIndex(47244);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new RunnableC90250g(ChildrenModeSettingActivity.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    private static boolean m80337e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.f205073do, R.anim.dx);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C31575b.m65859a();
        C31575b.f75524a.mo57066b(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onResume", true);
        super.onResume();
        this.f93250e.setRightText(C53438a.m98624b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        IBenchmarkService c = BenchmarkServiceImpl.m71140c();
        if (c != null) {
            c.mo61662a(1);
        }
    }

    /* renamed from: a */
    static boolean m80335a() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean e = m80337e();
        C58029j.f132256h = e;
        return e;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void mo68964d() {
        if (this.f93266u == null) {
            C17197a.C17200a aVar = new C17197a.C17200a(this);
            aVar.mo27189a(R.string.as7).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC39549k(this), false).mo27190a(R.string.cy1, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC39550l(this), false);
            this.f93266u = aVar.mo27193a();
        }
        this.f93266u.mo27184b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo68963c() {
        C31575b.m65859a();
        C31575b.f75524a.mo57075k().updateMethodInfo("allow_one_key_login", true);
        mo68964d();
        C39162r.m79460a("remember_login_info_confirm", new C33744d().mo59983a("user_id", C31575b.m65865g().getCurUserId()).f79943a);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        IBenchmarkService c = BenchmarkServiceImpl.m71140c();
        if (c != null) {
            c.mo61661a();
        }
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

    /* renamed from: b */
    public final void mo68962b() {
        C31575b.m65859a();
        AbstractC34889bn k = C31575b.f75524a.mo57075k();
        if (!k.isOneKeyLoginExprimentEnable() || k.getSaveLoginStatus() || !k.isCurrentMethodAvaliable()) {
            mo68964d();
            return;
        }
        C39162r.m79460a("remember_login_info_notify", new C33744d().mo59983a("user_id", C31575b.m65865g().getCurUserId()).f79943a);
        C17197a.C17200a aVar = new C17197a.C17200a(this);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(this);
        C20766v a = C20761r.m39060a(C34735v.m70965a(C31575b.m65865g().getCurUser().getAvatarThumb()));
        a.f49092E = smartAvatarImageView;
        a.mo34186c();
        aVar.mo27191a(smartAvatarImageView, 48, 48);
        aVar.f41067M = false;
        aVar.mo27189a(R.string.bt).mo27194b(R.string.bq).mo27195b(R.string.br, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC39547i(this), false).mo27190a(R.string.bs, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC39548j(this), false);
        aVar.mo27193a().mo27185c();
    }

    public void exit(View view) {
        finish();
    }

    /* renamed from: a */
    public static File m80334a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    @AbstractC90264r
    public void onEvent(C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (TextUtils.equals("user", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(this, this.f93246a, jVar);
        }
    }

    /* renamed from: a */
    public static boolean m80336a(File file) {
        MethodCollector.m26663i(9203);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(9203);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(9203);
        return delete;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo68961a(C1731i iVar) {
        if (!iVar.mo5535a()) {
            return null;
        }
        this.f93256k.setRightText("0 M");
        new C79459a(this).mo123050a(R.string.ag6).mo123053a();
        return null;
    }

    public void onVersionClick(View view) {
        if (System.currentTimeMillis() - this.f93268w < 500) {
            this.f93267v++;
        } else {
            this.f93267v = 0;
        }
        if (this.f93267v >= 4) {
            this.f93257l.setVisibility(0);
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.m113114a().configService().avsettingsConfig();
            StringBuilder sb = new StringBuilder();
            sb.append("UserId: " + C31575b.m65865g().getCurUserId()).append("\n").append("DeviceId: ".concat(String.valueOf(serverDeviceId))).append("\n").append("UpdateVerionCode: " + C17867d.m33083d()).append("\n").append("GitSHA: " + C17867d.f42592p).append("\n").append("VESDK: " + avsettingsConfig.getVESDKVersion()).append("\n").append("EffectSdk: " + avsettingsConfig.getEffectVersion()).append("\n").append(C68432f.f153189a.getReleaseBuildString());
            this.f93257l.setText(sb.toString());
            this.f93267v = 0;
        }
        this.f93268w = System.currentTimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02fb, code lost:
        if (r0 != false) goto L_0x02fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r14) {
        /*
        // Method dump skipped, instructions count: 1019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui.ChildrenModeSettingActivity.onClick(android.view.View):void");
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78671e = R.attr.m;
        xVar.f78672f = R.attr.m;
        xVar.f78674h = true;
        activityConfiguration(new C39541c(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.tx);
        this.f93246a = (ViewGroup) findViewById(R.id.dnb);
        this.f93247b = (TextTitleBar) findViewById(R.id.eiz);
        this.f93248c = (CommonItemView) findViewById(R.id.bm);
        this.f93249d = (CommonItemView) findViewById(R.id.ale);
        this.f93250e = (CommonItemView) findViewById(R.id.abm);
        this.f93251f = (CommonItemView) findViewById(R.id.bev);
        this.f93252g = (CommonItemView) findViewById(R.id.b1a);
        this.f93253h = (CommonItemView) findViewById(R.id.efm);
        this.f93254i = (CommonItemView) findViewById(R.id.d6j);
        this.f93255j = (CommonItemView) findViewById(R.id.aeh);
        this.f93256k = (CommonItemView) findViewById(R.id.a6e);
        this.f93257l = (TextView) findViewById(R.id.f_t);
        this.f93258m = (TextView) findViewById(R.id.fbh);
        this.f93259n = (CommonItemView) findViewById(R.id.cwr);
        this.f93260o = (CommonItemView) findViewById(R.id.cgy);
        this.f93261p = (CommonItemView) findViewById(R.id.abn);
        this.f93262q = (CommonItemView) findViewById(R.id.dot);
        this.f93263r = (CommonItemView) findViewById(R.id.ahk);
        this.f93264s = (CommonItemView) findViewById(R.id.dtm);
        View findViewById = findViewById(R.id.fbh);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC39542d(this));
        }
        this.f93247b.setTitle(R.string.aiu);
        this.f93247b.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui.ChildrenModeSettingActivity.C395371 */

            static {
                Covode.recordClassIndex(47245);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                ChildrenModeSettingActivity.this.exit(view);
            }
        });
        C34729o.m70956a(true, this.f93262q);
        this.f93258m.setText(C1764a.m5928a(getString(R.string.fl2), new Object[]{C17867d.m33088i(), String.valueOf(C17867d.m33087h())}) + "");
        ViewGroup viewGroup = this.f93246a;
        viewGroup.setBackgroundColor(C0643b.m2378c(viewGroup.getContext(), R.color.l));
        this.f93247b.setBackgroundColor(C0643b.m2378c(this.f93246a.getContext(), R.color.l));
        C34729o.m70956a(C68124l.m120413c(), this.f93263r);
        C39534c.m80328a((ViewGroup) this.f93246a.findViewById(R.id.cei));
        this.f93259n.setLeftText("Debug Test");
        this.f93259n.setVisibility(8);
        try {
            ICacheService cacheConfig = AVExternalServiceImpl.m113114a().configService().cacheConfig();
            File[] fileArr = new File[4];
            fileArr[0] = getCacheDir();
            fileArr[1] = C80720e.m139914a();
            fileArr[2] = new File(cacheConfig.stickerDir());
            File file = new File(m80334a(C17867d.m33078a()).getAbsolutePath() + "/aweme_monitor");
            if (!file.exists()) {
                file.mkdir();
            }
            fileArr[3] = file;
            String b = C80256bn.m139105b(fileArr);
            if (!C13627m.m24498a(b)) {
                this.f93256k.setRightText(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.f93256k.setRightText("0.00M");
        }
        this.f93248c.setOnClickListener(this);
        this.f93249d.setOnClickListener(this);
        this.f93250e.setOnClickListener(this);
        this.f93252g.setOnClickListener(this);
        this.f93251f.setOnClickListener(this);
        this.f93253h.setOnClickListener(this);
        this.f93254i.setOnClickListener(this);
        this.f93255j.setOnClickListener(this);
        this.f93256k.setOnClickListener(this);
        this.f93259n.setOnClickListener(this);
        this.f93260o.setOnClickListener(this);
        this.f93261p.setOnClickListener(this);
        this.f93262q.setOnClickListener(this);
        this.f93263r.setOnClickListener(this);
        this.f93264s.setOnClickListener(this);
        C39223a.m79598l().mo68665a("new_kids_mode_visit", true ^ C80580in.m139687c(), new C33744d().mo59983a("activity", "ChildrenModeSettingActivity").f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onCreate", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public void onAccountResult(int i, boolean z, int i2, User user) {
        DialogC58952a aVar;
        if (!isFinishing() && (aVar = this.f93265t) != null && aVar.isShowing()) {
            this.f93265t.dismiss();
        }
    }
}
