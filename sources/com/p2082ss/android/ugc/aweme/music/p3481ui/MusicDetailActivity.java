package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.powerpreload.task.C17827e;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkService;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.aweme.setting.C68024bj;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailActivity */
public class MusicDetailActivity extends ActivityC17312a implements AbstractC33501c, AbstractC34472g, AbstractC34585f {

    /* renamed from: a */
    private String f138594a;

    /* renamed from: b */
    private String f138595b;

    /* renamed from: c */
    private String f138596c;

    /* renamed from: d */
    private List<AbstractC34466a> f138597d = new ArrayList();

    /* renamed from: e */
    private String f138598e;

    /* renamed from: f */
    private String f138599f;

    /* renamed from: g */
    private String f138600g;

    /* renamed from: h */
    private String f138601h;

    /* renamed from: i */
    private int f138602i;

    /* renamed from: j */
    private String f138603j;

    /* renamed from: k */
    private String f138604k = "";

    static {
        Covode.recordClassIndex(71682);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo61041c() {
        return "single_song";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        C65691a.m117584a(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        IBenchmarkService c = BenchmarkServiceImpl.m71140c();
        if (c != null) {
            c.mo61662a(4);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        long j;
        Exception e;
        long j2 = 0;
        try {
            j = Long.parseLong(this.f138598e);
            try {
                j2 = Long.parseLong(this.f138594a);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            j = 0;
            e.printStackTrace();
            return new Analysis().setLabelName("single_song").setExt_value(j).setValue(j2);
        }
        return new Analysis().setLabelName("single_song").setExt_value(j).setValue(j2);
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

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public void unRegisterActivityOnKeyDownListener(AbstractC34466a aVar) {
        List<AbstractC34466a> list = this.f138597d;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public void registerActivityOnKeyDownListener(AbstractC34466a aVar) {
        if (!this.f138597d.contains(aVar)) {
            this.f138597d.add(aVar);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", true);
        C35434c.m72461a("single_song");
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.nc;
        activityConfiguration(new C61199r(xVar));
        super.onCreate(bundle);
        if (C68024bj.m120326a()) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.al1);
        View findViewById = findViewById(R.id.e7_);
        if (findViewById != null) {
            C39115e.m79414b(findViewById);
            C34729o.m70958b(this);
        }
        this.f138600g = m110640a(getIntent(), "partnerName");
        this.f138601h = m110640a(getIntent(), "partnerMusicId");
        this.f138598e = m110640a(getIntent(), "id");
        this.f138599f = m110640a(getIntent(), "process_id");
        this.f138594a = m110640a(getIntent(), "aweme_id");
        this.f138595b = m110640a(getIntent(), "extra_music_from");
        this.f138596c = m110640a(getIntent(), "previous_page_position");
        String a = m110640a(getIntent(), "sticker_id");
        String a2 = m110640a(getIntent(), "from_token");
        this.f138602i = getIntent().getIntExtra("extra_video_length", 0);
        this.f138603j = m110640a(getIntent(), "extra_track_info");
        String a3 = m110640a(getIntent(), "shoot_enter_from");
        this.f138604k = m110640a(getIntent(), "banner_id");
        int intExtra = getIntent().getIntExtra("is_bundled", 0);
        int intExtra2 = getIntent().getIntExtra("click_reason", 0);
        String a4 = C17827e.m33010a(getIntent());
        Long valueOf = Long.valueOf(getIntent().getLongExtra("EXTRA_PRELOAD_PAGE_START_TIME", -1));
        if (!TextUtils.isEmpty(this.f138598e) || !TextUtils.isEmpty(this.f138601h)) {
            if (TextUtils.isEmpty(this.f138599f)) {
                this.f138599f = "";
            }
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            AbstractC0976n a5 = supportFragmentManager.mo3552a();
            Fragment a6 = supportFragmentManager.mo3551a("music_detail_fragment_tag");
            if (a6 == null) {
                String str = this.f138598e;
                String str2 = this.f138594a;
                String str3 = this.f138595b;
                String str4 = this.f138596c;
                String str5 = this.f138601h;
                String str6 = this.f138600g;
                String str7 = this.f138599f;
                int i = this.f138602i;
                String str8 = this.f138604k;
                String str9 = this.f138603j;
                Bundle bundle2 = new Bundle(3);
                bundle2.putString("id", str);
                bundle2.putString("partnerName", str6);
                bundle2.putString("partnerMusicId", str5);
                bundle2.putString("aweme_id", str2);
                bundle2.putString("sticker_id", a);
                bundle2.putString("extra_music_from", str3);
                bundle2.putString("extra_previous_page_position", str4);
                bundle2.putInt("click_reason", intExtra2);
                bundle2.putString("from_token", a2);
                bundle2.putString("process_id", str7);
                bundle2.putInt("extra_video_length", i);
                bundle2.putString("extra_track_info", str9);
                bundle2.putString("banner_id", str8);
                C89219l.m154719c(bundle2, "");
                if (a4 != null) {
                    bundle2.putString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", a4);
                }
                bundle2.putLong("EXTRA_PRELOAD_PAGE_START_TIME", valueOf.longValue());
                if (a3 == null) {
                    a3 = "";
                }
                bundle2.putString("shoot_enter_from", a3);
                bundle2.putInt("is_bundled", intExtra);
                a6 = new C61100ah();
                a6.setArguments(bundle2);
            }
            a6.setUserVisibleHint(true);
            a5.mo3470b(R.id.acf, a6, "music_detail_fragment_tag");
            a5.mo3467b();
        } else {
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m110640a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        for (AbstractC34466a aVar : this.f138597d) {
            if (aVar.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
