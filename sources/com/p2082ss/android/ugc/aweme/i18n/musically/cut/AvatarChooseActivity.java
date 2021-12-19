package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IVideo2GifUIService;
import com.p2082ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity */
public class AvatarChooseActivity extends ActivityC17312a implements View.OnClickListener, IVideoChoose.Callback {

    /* renamed from: a */
    TextView f122699a;

    /* renamed from: b */
    View f122700b;

    /* renamed from: c */
    public IVideoChoose f122701c;

    /* renamed from: d */
    private boolean f122702d;

    static {
        Covode.recordClassIndex(63031);
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        IVideoChoose iVideoChoose;
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", true);
        super.onResume();
        if (!this.f122702d && (iVideoChoose = this.f122701c) != null) {
            this.f122702d = true;
            iVideoChoose.loadData();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", false);
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

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (view == this.f122700b) {
            finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback
    public void onData(String str) {
        C53484j jVar = new C53484j();
        jVar.f122775a = new C53484j.AbstractC53489b() {
            /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity.C534622 */

            static {
                Covode.recordClassIndex(63033);
            }

            @Override // com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j.AbstractC53489b
            /* renamed from: a */
            public final void mo90031a(Intent intent) {
                AvatarChooseActivity.this.setResult(-1, intent);
                AvatarChooseActivity.this.finish();
            }
        };
        SmartRouter.buildRoute(this, "//profile/avatar_cut").withParam("file_path", str).open(3, new C53491l(jVar));
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78671e = R.attr.m;
        xVar.f78672f = R.attr.m;
        xVar.f78674h = true;
        activityConfiguration(new C53475a(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.amf);
        this.f122699a = (TextView) findViewById(R.id.title);
        this.f122700b = findViewById(R.id.pi);
        this.f122699a.setText(R.string.d5q);
        this.f122700b.setOnClickListener(this);
        final Fragment a = getSupportFragmentManager().mo3549a(R.id.d1r);
        AVExternalServiceImpl.m113114a().asyncService(this, "AvatarChoose", new SimpleServiceLoadCallback() {
            /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity.C534611 */

            static {
                Covode.recordClassIndex(63032);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                AvatarChooseActivity avatarChooseActivity = AvatarChooseActivity.this;
                IVideo2GifUIService abilityUiService = asyncAVService.uiService().abilityUiService();
                AvatarChooseActivity avatarChooseActivity2 = AvatarChooseActivity.this;
                avatarChooseActivity.f122701c = abilityUiService.toMusVideoChooseFragment(avatarChooseActivity2, a, avatarChooseActivity2, Integer.valueOf((int) R.id.d1r));
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", false);
    }
}
