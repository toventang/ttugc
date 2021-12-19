package com.p2082ss.android.ugc.aweme.choosemusic.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35767ab;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35776ai;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35777aj;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35825z;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.aweme.setting.C68024bj;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity */
public class MusicDetailListActivity extends ActivityC17312a {
    static {
        Covode.recordClassIndex(42957);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        super.onBackPressed();
        C65691a.m117584a(this);
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
        int intExtra;
        String str;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.l;
        activityConfiguration(new C35751g(xVar));
        super.onCreate(bundle);
        if (C68024bj.m120326a()) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.bo);
        if (getIntent() != null) {
            String a = m72912a(getIntent(), "cid");
            int intExtra2 = getIntent().getIntExtra("music_class_level", 0);
            if (!TextUtils.isEmpty(a)) {
                intExtra = 2;
            } else {
                intExtra = getIntent().getIntExtra("music_type", 1);
            }
            if (intExtra2 == 1) {
                intExtra = 7;
            }
            int intExtra3 = getIntent().getIntExtra("sound_page_scene", 0);
            switch (intExtra) {
                case 1:
                    str = "hot_music_list";
                    break;
                case 2:
                    str = "music_class_sheet";
                    break;
                case 3:
                    str = "local_music_list";
                    break;
                case 4:
                    str = "tag_music_sheet";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str = "local_music_list_shoot";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str = "local_music_list_edit";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str = "local_second_level_music_list_edit";
                    break;
                default:
                    str = "";
                    break;
            }
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            Fragment a2 = supportFragmentManager.mo3551a(str);
            if (a2 == null) {
                Intent intent = getIntent();
                switch (intExtra) {
                    case 1:
                        a2 = C35825z.m73190a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1), intExtra3);
                        break;
                    case 2:
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        a2 = C35776ai.m73003a(intent, intExtra3);
                        break;
                    case 3:
                        a2 = C35767ab.m72965a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1));
                        break;
                    case 4:
                        int intExtra4 = intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
                        a2 = new C35777aj();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", intExtra4);
                        bundle2.putInt("sound_page_scene", intExtra3);
                        a2.setArguments(bundle2);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        a2 = C35767ab.m72965a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 2));
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        a2 = C35767ab.m72965a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0));
                        break;
                    default:
                        a2 = C35825z.m73190a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1), intExtra3);
                        break;
                }
            }
            AbstractC0976n a3 = supportFragmentManager.mo3552a();
            a3.mo3470b(R.id.b82, a2, str);
            a3.mo3473c();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m72912a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
