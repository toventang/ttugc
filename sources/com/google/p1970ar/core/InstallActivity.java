package com.google.p1970ar.core;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.p1970ar.core.ArCoreApk;
import com.google.p1970ar.core.exceptions.FatalException;
import com.google.p1970ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p1970ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.ar.core.InstallActivity */
public class InstallActivity extends Activity {
    private boolean finished;
    private ArCoreApk.InstallBehavior installBehavior;
    private boolean installStarted;
    public EnumC27087aj lastEvent = EnumC27087aj.CANCELLED;
    private ArCoreApk.UserMessageType messageType;
    private final ContextThemeWrapper themeWrapper = new ContextThemeWrapper(this, 16974394);
    public boolean waitingForCompletion;

    static {
        Covode.recordClassIndex(32598);
    }

    /* renamed from: com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m53830xdf5dbf65(String str, String str2) {
        return 0;
    }

    /* renamed from: com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m53831xdf5dbf69(String str, String str2) {
        return 0;
    }

    /* renamed from: com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m53832xdf5dbf77(String str, String str2) {
        return 0;
    }

    public void InstallActivity__onStop$___twin___() {
        super.onStop();
    }

    public void onNewIntent(Intent intent) {
    }

    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public void onStop() {
        C15477a.m28478d(this);
        m53829xc28296b7(this);
    }

    private boolean isOptional() {
        if (this.installBehavior == ArCoreApk.InstallBehavior.OPTIONAL) {
            return true;
        }
        return false;
    }

    public void finish() {
        finishWithFailure(new UnavailableUserDeclinedInstallationException());
    }

    public void onDestroy() {
        C15477a.m28479e(this);
        if (!this.finished) {
            C27117z.f64185a.mo45156a();
        }
        super.onDestroy();
    }

    public void closeInstaller() {
        m53833xbd97359e(this, new Intent(this, InstallActivity.class).setFlags(67108864));
    }

    private void showEducationDialog() {
        setContentView(R.layout.a);
        findViewById(R.id.al).setOnClickListener(new View$OnClickListenerC27083af(this, (byte) 0));
        if (!isOptional()) {
            findViewById(R.id.al).setVisibility(8);
        }
        findViewById(R.id.am).setOnClickListener(new View$OnClickListenerC27083af(this));
        TextView textView = (TextView) findViewById(R.id.an);
        if (this.messageType.ordinal() != 1) {
            textView.setText(R.string.hd);
        } else {
            textView.setText(R.string.he);
        }
    }

    public void animateToSpinner() {
        MethodCollector.m26663i(12780);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        int width = getWindow().getDecorView().getWidth();
        int height = getWindow().getDecorView().getHeight();
        setContentView(new RelativeLayout(this));
        getWindow().getDecorView().setMinimumWidth(i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C27084ag(this, width, i, height));
        ofFloat.addListener(new C27085ah(this));
        ofFloat.start();
        MethodCollector.m26664o(12780);
    }

    public void onResume() {
        MethodCollector.m26663i(12781);
        C15477a.m28476b(this);
        super.onResume();
        if (!this.installStarted) {
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                startInstaller();
                MethodCollector.m26664o(12781);
                return;
            }
            MethodCollector.m26664o(12781);
        } else if (!this.finished) {
            synchronized (this) {
                try {
                    if (this.lastEvent == EnumC27087aj.CANCELLED) {
                        finish();
                    } else if (this.lastEvent == EnumC27087aj.ACCEPTED) {
                        this.waitingForCompletion = true;
                    } else {
                        finishWithFailure(C27117z.f64185a.f64186b);
                    }
                } finally {
                    MethodCollector.m26664o(12781);
                }
            }
        } else {
            MethodCollector.m26664o(12781);
        }
    }

    public void showSpinner() {
        MethodCollector.m26663i(12665);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i, i);
        RelativeLayout relativeLayout = new RelativeLayout(this.themeWrapper);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.themeWrapper);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.themeWrapper);
        textView.setText(R.string.hf);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i, i);
        MethodCollector.m26664o(12665);
    }

    public void startInstaller() {
        this.installStarted = true;
        this.lastEvent = EnumC27087aj.CANCELLED;
        C27088ak a = C27117z.f64185a.mo45155a((Context) this);
        C27086ai aiVar = new C27086ai(this);
        if (a.f64096e == null) {
            a.f64095d = getPackageManager().getPackageInstaller();
            a.f64096e = new C27092ao(a, aiVar);
            a.f64095d.registerSessionCallback(a.f64096e);
        }
        if (a.f64093b == null) {
            a.f64093b = new C27093b(aiVar);
            a.f64094c = this;
            C27088ak.m53849a(a.f64094c, a.f64093b, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
        }
        try {
            a.mo45129a(new RunnableC27096e(a, this, aiVar));
        } catch (C27097f unused) {
            C27088ak.m53851a(this, aiVar);
        }
    }

    public void finishWithFailure(Exception exc) {
        C27117z.f64185a.f64186b = exc;
        C27117z.f64185a.mo45156a();
        this.finished = true;
        super.finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }

    /* renamed from: com_google_ar_core_InstallActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m53828xdee7f450(InstallActivity installActivity) {
        installActivity.InstallActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                installActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m53829xc28296b7(InstallActivity installActivity) {
        m53828xdee7f450(installActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                installActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                finishWithFailure(new FatalException("Install activity was suspended and recreated."));
            } catch (RuntimeException e) {
                finishWithFailure(new FatalException("Exception starting install flow", e));
            }
        } else {
            this.messageType = (ArCoreApk.UserMessageType) getIntent().getSerializableExtra("message");
            ArCoreApk.InstallBehavior installBehavior2 = (ArCoreApk.InstallBehavior) getIntent().getSerializableExtra("behavior");
            this.installBehavior = installBehavior2;
            if (this.messageType == null || installBehavior2 == null) {
                m53830xdf5dbf65("ARCore-InstallActivity", "missing intent data.");
                finishWithFailure(new FatalException("Install activity launched without config data."));
                return;
            }
            setTheme(16974394);
            getWindow().requestFeature(1);
            setFinishOnTouchOutside(isOptional());
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                showSpinner();
                return;
            }
            AtomicReference atomicReference = new AtomicReference(ArCoreApk.Availability.UNKNOWN_CHECKING);
            C27117z.f64185a.mo45155a((Context) this).mo45127a(this, new C27082ae(atomicReference));
            int ordinal = ((ArCoreApk.Availability) atomicReference.get()).ordinal();
            if (ordinal == 0) {
                m53832xdf5dbf77("ARCore-InstallActivity", "Preliminary compatibility check failed.");
            } else if (ordinal == 3) {
                finishWithFailure(new UnavailableDeviceNotCompatibleException());
                return;
            }
            showEducationDialog();
        }
    }

    /* renamed from: com_google_ar_core_InstallActivity_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m53833xbd97359e(InstallActivity installActivity, Intent intent) {
        C84349a.m145093a(intent, installActivity);
        installActivity.startActivity(intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder(27);
        sb.append("activityResult: ");
        sb.append(i2);
        m53831xdf5dbf69("ARCore-InstallActivity", sb.toString());
    }
}
