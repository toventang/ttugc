package com.p2082ss.android.ugc.aweme.prop.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity */
public class StickerPropDetailActicity extends ActivityC17312a implements AbstractC34585f {

    /* renamed from: a */
    private List<String> f147265a = new ArrayList();

    /* renamed from: b */
    private String f147266b;

    /* renamed from: c */
    private String f147267c;

    /* renamed from: d */
    private int f147268d;

    /* renamed from: e */
    private String f147269e;

    static {
        Covode.recordClassIndex(76741);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo61041c() {
        return "prop_page";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.nc;
        activityConfiguration(new C65264a(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.c8);
        View findViewById = findViewById(R.id.e7_);
        if (findViewById != null) {
            C39115e.m79414b(findViewById);
            C34729o.m70958b(this);
        }
        String a = m116934a(getIntent(), "extra_log_pb");
        this.f147266b = m116934a(getIntent(), "aweme_id");
        this.f147267c = m116934a(getIntent(), "extra_music_from");
        Serializable serializableExtra = getIntent().getSerializableExtra("sticker_music");
        Serializable serializableExtra2 = getIntent().getSerializableExtra("music_model");
        String a2 = m116934a(getIntent(), "shoot_enter_from");
        String a3 = m116934a(getIntent(), "from_banner_id");
        int intExtra = getIntent().getIntExtra("is_bundled", 0);
        int intExtra2 = getIntent().getIntExtra("media_type", 0);
        m116934a(getIntent(), "sticker_id");
        m116934a(getIntent(), "from_token");
        this.f147268d = getIntent().getIntExtra("extra_video_length", 0);
        this.f147269e = m116934a(getIntent(), "extra_previous_page");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_stickers");
        if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
            stringArrayListExtra = new ArrayList<>();
            String a4 = m116934a(getIntent(), "id");
            if (!TextUtils.isEmpty(a4)) {
                String[] split = a4.split(",");
                if (split.length > 0) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            stringArrayListExtra.add(str);
                        }
                    }
                }
            }
        }
        if (stringArrayListExtra.size() == 0) {
            finish();
        } else {
            this.f147265a.addAll(stringArrayListExtra);
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            AbstractC0976n a5 = supportFragmentManager.mo3552a();
            Fragment a6 = supportFragmentManager.mo3551a("sticker_prop_detail_fragment_tag");
            String a7 = m116934a(getIntent(), "extra_sticker_from");
            if (a6 == null) {
                String str2 = this.f147266b;
                String str3 = this.f147267c;
                int i = this.f147268d;
                String str4 = this.f147269e;
                Bundle bundle2 = new Bundle(3);
                bundle2.putStringArrayList("extra_stickers", stringArrayListExtra);
                bundle2.putString("aweme_id", str2);
                bundle2.putString("extra_music_from", str3);
                bundle2.putString("extra_sticker_from", a7);
                bundle2.putSerializable("sticker_music", serializableExtra);
                bundle2.putSerializable("music_model", serializableExtra2);
                bundle2.putString("extra_log_pb", a);
                bundle2.putInt("media_type", intExtra2);
                bundle2.putInt("EXTRA_VIDEO_LENGTH", i);
                bundle2.putString("extra_previous_page", str4);
                if (a2 == null) {
                    a2 = "";
                }
                bundle2.putString("shoot_enter_from", a2);
                if (!TextUtils.isEmpty(a3)) {
                    bundle2.putString("from_banner_id", a3);
                }
                bundle2.putInt("is_bundled", intExtra);
                a6 = new C65283j();
                a6.setArguments(bundle2);
            }
            a6.setUserVisibleHint(true);
            a5.mo3470b(R.id.acf, a6, "sticker_prop_detail_fragment_tag");
            a5.mo3467b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m116934a(Intent intent, String str) {
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
            overridePendingTransition(0, 0);
        }
    }
}
