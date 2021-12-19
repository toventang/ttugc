package com.p2082ss.android.ugc.aweme.splash;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.newmedia.EnumC30143f;
import com.p2082ss.android.ugc.aweme.app.AwemeAppData;
import com.p2082ss.android.ugc.aweme.app.C33796j;
import com.p2082ss.android.ugc.aweme.app.C33802l;
import com.p2082ss.android.ugc.aweme.app.C33836o;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38679bf;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.UploadSysStatusTask;
import com.p2082ss.android.ugc.aweme.legoImpl.task.AntispamApiUploadTask;
import com.p2082ss.android.ugc.aweme.legoImpl.task.MobLaunchEventTask;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2431bz.C35332a;
import com.p2082ss.android.ugc.aweme.setting.C68052ce;
import com.p2082ss.android.ugc.aweme.splash.C75231b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.splash.SplashActivity */
public class SplashActivity extends ActivityC0945e implements WeakHandler.IHandler {
    public static EnumC30143f sConfirmWelcomeType = EnumC30143f.FULL_SCREEN_WELCOME;
    public static boolean sShowWelcomeCheckBox;
    private boolean isFirstShow;
    protected volatile boolean mAlive = true;
    protected boolean mAllowAd = true;
    private Dialog mDialog = null;
    private boolean mDirectlyGoMain;
    protected boolean mFirstResume = true;
    protected final Handler mHandler = new WeakHandler(this);
    protected boolean mInited;
    protected boolean mJumped;
    private C75231b.C75232a mSubmitPreloadHelper = new C75231b.C75232a();
    protected boolean mTrackSession;

    private void submitPreload() {
    }

    /* access modifiers changed from: protected */
    public void doInit() {
    }

    public boolean isSplashShowing() {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onDialogShowOrDismiss(DialogInterface dialogInterface, boolean z) {
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onStop() {
        m132005x9a84199e(this);
    }

    /* access modifiers changed from: protected */
    public boolean quickLaunch() {
        return false;
    }

    public void SplashActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void tryShowAdAndGoNext() {
        goMainActivity();
    }

    public void goMainActivity() {
        goMainActivity(null);
    }

    static {
        Covode.recordClassIndex(88117);
    }

    private static boolean enableSplashLaunchFix() {
        try {
            return C52912c.f121688a.f121689b.getEnableSplashLaunchFix().booleanValue();
        } catch (C16041a unused) {
            return true;
        }
    }

    private void hotStartIntercept() {
        if (isHotStart()) {
            C68052ce.f152437b.mo108670a();
        }
    }

    /* access modifiers changed from: protected */
    public void tryInit() {
        if (!this.mInited) {
            doInit();
            this.mInited = true;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onDestroy() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.mHandler.removeMessages(100);
        this.mAlive = false;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void tryShowShortCutDlg() {
        C58945a.C58947b.f134185a.mo96425a("method_splash_try_show_ad_duration", false);
        tryShowAdAndGoNext();
        C58945a.C58947b.f134185a.mo96429b("method_splash_try_show_ad_duration", false);
    }

    private boolean isHotStart() {
        Intent intent = getIntent();
        if (!isTaskRoot() || intent == null || !intent.hasCategory("android.intent.category.LAUNCHER") || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return false;
        }
        return true;
    }

    private void reportLaunchTime() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h;
        int a = C33802l.m69153a();
        int b = AwemeAppData.m60956a().mo53510b();
        if (a != b) {
            z = true;
        } else {
            z = false;
        }
        if (C33796j.m69147a().f80040a) {
            new C58221f.C58224c().mo95703b((AbstractC58264w) new MobLaunchEventTask(z, currentTimeMillis)).mo95706a();
        }
        if (a == 0) {
            C33802l.m69154a(b);
        }
    }

    /* access modifiers changed from: protected */
    public Intent getMainIntent() {
        Intent intent = getIntent();
        Intent intent2 = new Intent(this, AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().mo93775d());
        intent2.setFlags(335544320);
        if (intent != null) {
            intent2.setAction(intent.getAction());
        }
        C38679bf.m78484a(intent, intent2);
        if (!(intent == null || m132006x9a8fcb26(intent) == null)) {
            intent2.putExtras(m132006x9a8fcb26(intent));
        }
        return intent2;
    }

    private void mobLaunchMob() {
        String str = "";
        try {
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (data != null) {
                    str = data.getQueryParameter("gd_label");
                }
                if (booleanExtra || str != null) {
                    C33796j.m69147a().f80041b = false;
                    return;
                }
            }
            C39162r.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            C33796j.m69147a().f80041b = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        Bundle com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        C58945a.C58947b.f134185a.f134176c = false;
        super.onResume();
        if (this.mDirectlyGoMain) {
            goMainActivity();
            return;
        }
        Intent intent = getIntent();
        if (this.mFirstResume && !this.mJumped) {
            this.mFirstResume = false;
            if (!(intent == null || (com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m132006x9a8fcb26(intent)) == null || !com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getBoolean("from_notification"))) {
                C29823c.m60080a(this, "more_tab", "notify_click");
                C29823c.m60080a(this, "apn", "recall");
            }
            if (quickLaunch()) {
                goMainActivity();
            }
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m132006x9a8fcb26(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C49301e.m92379j();
        super.attachBaseContext(context);
    }

    /* renamed from: com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m132004xc038fc37(SplashActivity splashActivity) {
        splashActivity.SplashActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                splashActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m132005x9a84199e(SplashActivity splashActivity) {
        m132004xc038fc37(splashActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                splashActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (this.mAlive && message.what == 100) {
            goMainActivity(message.getData());
        }
    }

    public void goMainActivity(Bundle bundle) {
        submitPreload();
        this.mHandler.removeMessages(100);
        if (!this.mJumped) {
            this.mJumped = true;
            if (this.mAlive) {
                Intent mainIntent = getMainIntent();
                if (bundle != null) {
                    mainIntent.putExtra("extra_splash_data", bundle);
                }
                m132007x920cdd45(this, mainIntent);
                if (!isFinishing()) {
                    finish();
                }
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e
    public void onCreate(Bundle bundle) {
        C58945a.C58947b.f134185a.mo96429b("cold_boot_application_to_splash", true);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_splash_duration", true);
        C35332a.m72316a(this);
        C58945a.C58947b.f134185a.mo96425a("method_splash_super_duration", false);
        getWindow().setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(this, R.color.t)));
        super.onCreate(bundle);
        C58945a.C58947b.f134185a.mo96429b("method_splash_super_duration", false);
        if (getIntent() != null && TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") && getIntent().getCategories() != null && getIntent().getCategories().size() > 0 && getIntent().getCategories().contains("android.intent.category.LAUNCHER") && !isTaskRoot() && C33836o.m69201a().f80094a.mo89311a() && enableSplashLaunchFix()) {
            C51423a.m95791b(4, "SplashActivity", "finish SplashActivity directly");
            finish();
        } else if (!isTaskRoot()) {
            goMainActivity();
        } else {
            this.mAlive = true;
            this.mFirstResume = true;
            this.mJumped = false;
            reportLaunchTime();
            mobLaunchMob();
            C33796j.m69147a().f80040a = false;
            new C58221f.C58224c().mo95703b((AbstractC58264w) new UploadInstallEventTask()).mo95706a();
            if (sConfirmWelcomeType == EnumC30143f.NO_WELCOME) {
                this.mTrackSession = true;
                tryInit();
            }
            hotStartIntercept();
            if (!this.mJumped) {
                tryInit();
                if (!quickLaunch()) {
                    tryShowShortCutDlg();
                }
            }
            new C58221f.C58224c().mo95703b((AbstractC58264w) new AntispamApiUploadTask()).mo95706a();
            new C58221f.C58224c().mo95703b((AbstractC58264w) new UploadSysStatusTask()).mo95706a();
            C58945a.C58947b.f134185a.mo96429b("cold_boot_splash_duration", true);
            C58945a.C58947b.f134185a.mo96425a("cold_boot_splash_to_main", true);
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m132007x920cdd45(SplashActivity splashActivity, Intent intent) {
        C84349a.m145093a(intent, splashActivity);
        splashActivity.startActivity(intent);
    }
}
