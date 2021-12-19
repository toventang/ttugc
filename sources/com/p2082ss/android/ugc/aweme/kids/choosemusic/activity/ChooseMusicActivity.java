package com.p2082ss.android.ugc.aweme.kids.choosemusic.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.legacy.widget.Space;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.C57211i;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity */
public class ChooseMusicActivity extends ActivityC17312a implements AbstractC33501c {

    /* renamed from: a */
    public TextView f130222a;

    /* renamed from: b */
    public boolean f130223b;

    /* renamed from: c */
    public ViewPagerBottomSheetBehavior f130224c;

    /* renamed from: d */
    private int f130225d;

    static {
        Covode.recordClassIndex(67088);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        mo94386a();
        super.onBackPressed();
    }

    @Override // com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        return new Analysis().setLabelName("music_homepage");
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        KeyboardUtils.m70897c(this.f130222a);
        overridePendingTransition(0, R.anim.ah);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AVExternalServiceImpl.m113114a().provideAVPerformance().leave(this, "music_select");
    }

    /* renamed from: a */
    public final void mo94386a() {
        if (this.f130223b) {
            AVExternalServiceImpl.m113114a().publishService().setCurMusic(null);
            Intent intent = new Intent();
            intent.putExtra("is_cancel_current_choose_music", true);
            setResult(-1, intent);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        AVExternalServiceImpl.m113114a().provideAVPerformance().pause(this, "music_select", m103638a(getIntent(), "creation_id"), m103638a(getIntent(), "shoot_way"));
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        AVExternalServiceImpl.m113114a().provideAVPerformance().enter(this, "music_select");
        overridePendingTransition(R.anim.af, 0);
        setContentView(R.layout.ad9);
        TextView textView = (TextView) findViewById(R.id.f63);
        this.f130222a = textView;
        textView.setText(m103638a(getIntent(), "title"));
        findViewById(R.id.pi).setOnClickListener(new View$OnClickListenerC57188a(this));
        Bundle bundleExtra = getIntent().getBundleExtra("arguments");
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        ((Space) findViewById(R.id.e4f)).setMinimumHeight(C34723i.m70927b());
        ViewPagerBottomSheetBehavior a = ViewPagerBottomSheetBehavior.m70672a(findViewById(R.id.ajx));
        this.f130224c = a;
        a.f81685k = new ViewPagerBottomSheetBehavior.AbstractC34617a() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity.C571871 */

            static {
                Covode.recordClassIndex(67089);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.AbstractC34617a
            /* renamed from: a */
            public final void mo61099a(View view, float f) {
            }

            @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.AbstractC34617a
            /* renamed from: a */
            public final void mo61100a(View view, int i) {
                if (i == 5) {
                    ChooseMusicActivity.this.mo94386a();
                    ChooseMusicActivity chooseMusicActivity = ChooseMusicActivity.this;
                    chooseMusicActivity.finish();
                    chooseMusicActivity.overridePendingTransition(0, 0);
                }
            }
        };
        this.f130224c.f81678d = true;
        this.f130224c.mo61092b(C34723i.m70924a(this) + C34723i.m70932e(this));
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.mo3549a(R.id.b82) == null) {
            this.f130225d = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            AVExternalServiceImpl.m113114a().publishService().setMusicChooseType(this.f130225d);
            String a2 = m103638a(getIntent(), "challenge");
            String a3 = m103638a(getIntent(), "creation_id");
            String a4 = m103638a(getIntent(), "shoot_way");
            boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("music_is_photomv", false);
            AbstractC0976n a5 = supportFragmentManager.mo3552a();
            int i = this.f130225d;
            C57211i iVar = new C57211i();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            bundle2.putSerializable("challenge", a2);
            bundle2.putSerializable("music_model", (MusicModel) getIntent().getSerializableExtra("music_model"));
            bundle2.putBoolean("music_allow_clear", booleanExtra);
            bundle2.putString("creation_id", a3);
            bundle2.putString("shoot_way", a4);
            bundle2.putBoolean("music_is_photomv", booleanExtra2);
            if (bundleExtra != null) {
                bundle2.putAll(bundleExtra);
            }
            iVar.setArguments(bundle2);
            a5.mo3453a(R.id.b82, iVar).mo3467b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m103638a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }
}
