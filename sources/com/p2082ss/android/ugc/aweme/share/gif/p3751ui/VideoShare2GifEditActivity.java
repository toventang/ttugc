package com.p2082ss.android.ugc.aweme.share.gif.p3751ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.share.gif.C68932a;
import com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity */
public class VideoShare2GifEditActivity extends ActivityC17312a {

    /* renamed from: a */
    boolean f154240a = true;

    /* renamed from: b */
    public VideoShare2GifEditContext f154241b;

    static {
        Covode.recordClassIndex(81253);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onWindowFocusChanged", true);
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

    public void resolveUiClickEvent(View view) {
        if (view.getId() == R.id.pf) {
            C39162r.m79460a("gif_quit_editing", new HashMap());
            finish();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", true);
        activityConfiguration(C68945a.f154249a);
        super.onCreate(bundle);
        setContentView(R.layout.ci);
        View findViewById = findViewById(R.id.pf);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC68946b(this));
        }
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        this.f154241b = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null || !C80720e.m139927b(videoShare2GifEditContext.f154192a)) {
            finish();
        }
        findViewById(R.id.cs9).setOnClickListener(new AbstractView$OnClickListenerC80259bp() {
            /* class com.p2082ss.android.ugc.aweme.share.gif.p3751ui.VideoShare2GifEditActivity.C689442 */

            static {
                Covode.recordClassIndex(81255);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                VideoShare2GifEditActivity videoShare2GifEditActivity = VideoShare2GifEditActivity.this;
                if (videoShare2GifEditActivity.f154240a && videoShare2GifEditActivity.f154241b != null && !TextUtils.isEmpty(videoShare2GifEditActivity.f154241b.f154192a)) {
                    videoShare2GifEditActivity.f154240a = false;
                    videoShare2GifEditActivity.f154241b.f154197f = C68932a.m121630a();
                    VideoShare2GifEditContext videoShare2GifEditContext = videoShare2GifEditActivity.f154241b;
                    String str = videoShare2GifEditActivity.f154241b.f154193b;
                    C89219l.m154721d(str, "");
                    String path = new File(C68932a.m121630a(), str + ".gif").getPath();
                    C89219l.m154716b(path, "");
                    videoShare2GifEditContext.f154196e = path;
                    ProgressDialogC74145d a = ProgressDialogC74145d.m130371a(videoShare2GifEditActivity, videoShare2GifEditActivity.getResources().getString(R.string.c3d));
                    a.setIndeterminate(false);
                    AVExternalServiceImpl.m113114a().abilityService().transformService().video2gif(videoShare2GifEditActivity.f154241b, new C68947c(a), new C68948d(videoShare2GifEditActivity, a));
                }
            }
        });
        if (getSupportFragmentManager().mo3549a(R.id.b40) == null) {
            AVExternalServiceImpl.m113114a().asyncService(this, "Share2Gif", new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.share.gif.p3751ui.VideoShare2GifEditActivity.C689431 */

                static {
                    Covode.recordClassIndex(81254);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    VideoShare2GifEditActivity.this.finish();
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    C1731i.m5640b(new CallableC68950f(this, asyncAVService), ExecutorC34605m.f81660a);
                }
            });
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static void m121637a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            finish();
        }
    }

    /* renamed from: a */
    public static void m121638a(Context context, String str, String str2, boolean z, String str3, String str4, String str5) {
        Intent intent = new Intent(context, VideoShare2GifEditActivity.class);
        VideoShare2GifEditContext videoShare2GifEditContext = new VideoShare2GifEditContext();
        videoShare2GifEditContext.f154193b = str;
        videoShare2GifEditContext.f154209r = str5;
        videoShare2GifEditContext.f154208q = str4;
        videoShare2GifEditContext.f154207p = str2;
        videoShare2GifEditContext.f154192a = str3;
        videoShare2GifEditContext.f154194c = z;
        intent.putExtra("extra_data", videoShare2GifEditContext);
        m121637a(context, intent);
    }
}
