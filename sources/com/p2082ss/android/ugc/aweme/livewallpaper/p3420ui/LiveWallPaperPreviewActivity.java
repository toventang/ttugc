package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.experiment.C46994gu;
import com.p2082ss.android.ugc.aweme.experiment.C47014hj;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.livewallpaper.C58821a;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58905h;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity */
public class LiveWallPaperPreviewActivity extends ActivityC17312a implements SurfaceHolder.Callback {

    /* renamed from: a */
    SurfaceView f134116a;

    /* renamed from: b */
    TuxIconView f134117b;

    /* renamed from: c */
    TuxIconView f134118c;

    /* renamed from: d */
    TuxIconView f134119d;

    /* renamed from: e */
    public LiveWallPaperBean f134120e;

    /* renamed from: f */
    public C58821a f134121f;

    /* renamed from: g */
    public float f134122g;

    /* renamed from: h */
    boolean f134123h;

    /* renamed from: i */
    public String f134124i;

    /* renamed from: j */
    private boolean f134125j;

    static {
        Covode.recordClassIndex(69228);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C58895d.f134069e.mo96317a("paper_set");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96358a() {
        float f = 0.0f;
        if (C47014hj.m90285a(this)) {
            LiveWallPaperBean liveWallPaperBean = this.f134120e;
            if (!liveWallPaperBean.isShouldMute()) {
                f = this.f134122g;
            }
            liveWallPaperBean.setVolume(f);
            return;
        }
        LiveWallPaperBean liveWallPaperBean2 = this.f134120e;
        if (this.f134123h) {
            f = 1.0f;
        }
        liveWallPaperBean2.setVolume(f);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
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

    public void exit(View view) {
        finish();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f134121f.mo96213a();
    }

    /* renamed from: a */
    public static Context m108249a(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        Context applicationContext = liveWallPaperPreviewActivity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public void showSettingDialog(View view) {
        new C58933p().mo96385a(this, this.f134120e.isShouldMute(), "Preview", new SeekBar.OnSeekBarChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.LiveWallPaperPreviewActivity.C589143 */

            static {
                Covode.recordClassIndex(69232);
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    LiveWallPaperPreviewActivity.this.f134122g = C58901f.m108217a(i);
                    LiveWallPaperPreviewActivity.this.f134121f.mo96214a(LiveWallPaperPreviewActivity.this.f134122g);
                }
            }
        });
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f134121f.mo96216a(surfaceHolder, this.f134120e.getVideoPath(), this.f134120e.getWidth(), this.f134120e.getHeight());
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = false;
        xVar.f78674h = false;
        xVar.f78673g = R.color.ur;
        activityConfiguration(new C58919b(xVar));
        super.onCreate(bundle);
        this.f134120e = (LiveWallPaperBean) getIntent().getParcelableExtra("live_wall_paper");
        this.f134125j = getIntent().getBooleanExtra("hide_more_button", false);
        this.f134124i = m108250a(getIntent(), "from");
        if (this.f134120e == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
            return;
        }
        setContentView(R.layout.bjk);
        this.f134116a = (SurfaceView) findViewById(R.id.dwz);
        this.f134117b = (TuxIconView) findViewById(R.id.ejv);
        this.f134118c = (TuxIconView) findViewById(R.id.bxm);
        this.f134119d = (TuxIconView) findViewById(R.id.d5_);
        View findViewById = findViewById(R.id.pi);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC58920c(this));
        }
        View findViewById2 = findViewById(R.id.f3p);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC58921d(this));
        }
        View findViewById3 = findViewById(R.id.bxm);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC58922e(this));
        }
        View findViewById4 = findViewById(R.id.ejv);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new View$OnClickListenerC58923f(this));
        }
        View findViewById5 = findViewById(R.id.d5_);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new View$OnClickListenerC58924g(this));
        }
        C39115e.m79414b(findViewById(R.id.e7_));
        this.f134116a.getHolder().addCallback(this);
        C58821a aVar = new C58821a(null);
        this.f134121f = aVar;
        aVar.f133905f = this.f134120e;
        if (this.f134125j) {
            this.f134118c.setVisibility(8);
        }
        if (!C46994gu.m90274a(this) && !C47014hj.m90285a(this)) {
            this.f134119d.setVisibility(8);
        }
        if (C47014hj.m90285a(this)) {
            this.f134117b.setVisibility(8);
            this.f134122g = C58901f.m108217a(C58905h.m108246f());
        }
        mo96358a();
        C39162r.m79460a("enter_wallpaper_preview", new C33744d().mo59983a("enter_from", this.f134124i).f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m108250a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && C58901f.m108228a(this, getPackageName())) {
            new C79459a(m108249a(this)).mo123050a(R.string.hay).mo123053a();
            C58901f.m108224a(this.f134120e.getId(), this.f134124i, true);
            C58901f.m108220a(0, "");
            finish();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f134121f.mo96215a(surfaceHolder, i2, i3);
    }
}
