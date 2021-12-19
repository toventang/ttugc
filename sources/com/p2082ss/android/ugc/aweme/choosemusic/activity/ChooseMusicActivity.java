package com.p2082ss.android.ugc.aweme.choosemusic.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.legacy.widget.Space;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35818v;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35938d;
import com.p2082ss.android.ugc.aweme.choosemusic.widgets.p2476a.View$OnClickListenerC36068a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60717d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity */
public class ChooseMusicActivity extends ActivityC17312a implements AbstractC33501c {

    /* renamed from: a */
    public TuxTextView f84269a;

    /* renamed from: b */
    public ViewPagerBottomSheetBehavior f84270b;

    /* renamed from: c */
    public int f84271c;

    /* renamed from: d */
    public boolean f84272d;

    /* renamed from: e */
    public C35938d f84273e;

    /* renamed from: f */
    private TextView f84274f;

    /* renamed from: g */
    private boolean f84275g;

    /* renamed from: h */
    private IAVPerformance f84276h = AVExternalServiceImpl.m113114a().provideAVPerformance();

    static {
        Covode.recordClassIndex(42954);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        mo62766b();
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
        KeyboardUtils.m70897c(this.f84269a);
        overridePendingTransition(0, R.anim.ah);
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.f84276h.end(OpenMusicPanelPerformanceMonitor.f142464a, "animation_finished");
    }

    /* renamed from: c */
    private boolean m72905c() {
        if (AccountService.m65215a().mo57069e().isChildrenMode() || this.f84275g) {
            return false;
        }
        try {
            if (!C52912c.f121688a.f121689b.getEnableLocalMusicEntrance().booleanValue()) {
                return false;
            }
            return true;
        } catch (C16041a e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo62766b() {
        if (((ChooseMusicWithSceneViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class)).f84643b) {
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
        this.f84276h.pause(this, "music_select", m72904a(getIntent(), "creation_id"), m72904a(getIntent(), "shoot_way"));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", true);
        super.onResume();
        if (this.f84271c == 2) {
            C35936b.f84812a = "video_shoot_page";
        } else {
            C35936b.f84812a = "video_edit_page";
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", false);
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

    /* renamed from: a */
    public final void mo62765a() {
        this.f84274f = (TextView) findViewById(R.id.f2v);
        if (!m72905c() || !this.f84273e.mo63057a()) {
            this.f84274f.setVisibility(8);
            return;
        }
        this.f84274f.setVisibility(0);
        if (this.f84272d) {
            this.f84274f.setAlpha(0.5f);
            this.f84274f.setOnClickListener(View$OnClickListenerC36068a.m73522a(new View$OnClickListenerC35725c(this)));
            return;
        }
        this.f84274f.setOnClickListener(View$OnClickListenerC36068a.m73522a(new View$OnClickListenerC35726d(this)));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        String str;
        C15477a.m28479e(this);
        String str2 = ((ChooseMusicWithSceneViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class)).f84645d;
        C69905c curMusic = AVExternalServiceImpl.m113114a().publishService().getCurMusic();
        if (curMusic != null) {
            str = curMusic.getMid();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
            C39162r.m79460a("mission_requirement_modified", new C33744d().mo59980a("value", 1).mo59983a("mission_id", ((ChooseMusicWithSceneViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class)).f84646e).f79943a);
            ((ChooseMusicWithSceneViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class)).f84645d = null;
            ((ChooseMusicWithSceneViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class)).f84646e = null;
        }
        super.onDestroy();
        this.f84276h.leave(this, "music_select");
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f84276h.step(OpenMusicPanelPerformanceMonitor.f142464a, "choose_music_created");
        this.f84276h.enter(this, "music_select");
        overridePendingTransition(R.anim.af, 0);
        setContentView(R.layout.b4);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.f63);
        this.f84269a = tuxTextView;
        tuxTextView.setText(m72904a(getIntent(), "title"));
        this.f84273e = new C35938d(this, findViewById(R.id.dnh));
        this.f84275g = getIntent().getBooleanExtra("hide_local_music", false);
        this.f84272d = getIntent().getBooleanExtra("long_video", false);
        mo62765a();
        findViewById(R.id.pi).setOnClickListener(new View$OnClickListenerC35723a(this));
        Bundle bundleExtra = getIntent().getBundleExtra("arguments");
        Context context = BadParcelableCrashOptimizer.getContext();
        if (bundleExtra != null) {
            if (context != null) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            ((ChooseMusicWithSceneViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class)).f84645d = bundleExtra.getString("mission_music_id");
            ((ChooseMusicWithSceneViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class)).f84646e = bundleExtra.getString("mission_id");
        }
        ((Space) findViewById(R.id.e4f)).setMinimumHeight(C34723i.m70927b());
        ViewPagerBottomSheetBehavior a = ViewPagerBottomSheetBehavior.m70672a(findViewById(R.id.ajx));
        this.f84270b = a;
        a.f81685k = new ViewPagerBottomSheetBehavior.AbstractC34617a() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity.C357221 */

            static {
                Covode.recordClassIndex(42955);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.AbstractC34617a
            /* renamed from: a */
            public final void mo61099a(View view, float f) {
                ChooseMusicActivity.this.f84273e.mo63055a(f);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.AbstractC34617a
            /* renamed from: a */
            public final void mo61100a(View view, int i) {
                if (i == 5) {
                    ChooseMusicActivity.this.mo62766b();
                    ChooseMusicActivity chooseMusicActivity = ChooseMusicActivity.this;
                    chooseMusicActivity.finish();
                    chooseMusicActivity.overridePendingTransition(0, 0);
                }
            }
        };
        this.f84270b.f81678d = true;
        this.f84270b.mo61092b(C34723i.m70924a(this) + C34723i.m70932e(this));
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.mo3549a(R.id.b82) == null) {
            this.f84271c = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            AVExternalServiceImpl.m113114a().publishService().setMusicChooseType(this.f84271c);
            String a2 = m72904a(getIntent(), "challenge");
            String a3 = m72904a(getIntent(), "creation_id");
            String a4 = m72904a(getIntent(), "shoot_way");
            MusicModel musicModel = (MusicModel) getIntent().getSerializableExtra("music_model");
            boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("music_is_photomv", false);
            supportFragmentManager.mo3552a().mo3453a(R.id.b82, C35818v.m73157a(this.f84271c, a2, musicModel, C60717d.EnumC60718a.BtnConfirm, booleanExtra, booleanExtra2, bundleExtra, a4, a3, this.f84272d ? 1 : 0)).mo3467b();
            this.f84273e.mo63056a(new C35724b(this, supportFragmentManager, a2, musicModel, booleanExtra, booleanExtra2, bundleExtra, a4, a3));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m72904a(Intent intent, String str) {
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
