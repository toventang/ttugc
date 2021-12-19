package com.p2082ss.android.ugc.aweme.share.gif.p3751ui;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.share.p3762j.C69271a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.utils.C80508gp;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity */
public class VideoShare2GifPreviewActivity extends ActivityC17312a implements AbstractC33974au {

    /* renamed from: a */
    RemoteImageView f154244a;

    /* renamed from: b */
    LinearLayout f154245b;

    /* renamed from: c */
    LinearLayout f154246c;

    /* renamed from: d */
    VideoShare2GifEditContext f154247d;

    /* renamed from: e */
    boolean f154248e;

    static {
        Covode.recordClassIndex(81256);
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

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", true);
        super.onResume();
        if (this.f154248e) {
            setResult(-1);
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", false);
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
    private void m121640a() {
        AbstractC69581b a;
        MethodCollector.m26663i(6146);
        String[] b = C68863ah.f154028b.mo109366b();
        if (b == null || b.length <= 0) {
            this.f154246c.setVisibility(8);
            MethodCollector.m26664o(6146);
            return;
        }
        for (String str : b) {
            if (!TextUtils.isEmpty(str) && (a = C68963a.C68964a.m121652a(str, this)) != null) {
                String b2 = a.mo109553b();
                Drawable a2 = a.mo109547a(this);
                View$OnClickListenerC68953i iVar = new View$OnClickListenerC68953i(this, a, str);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int b3 = (int) C13628n.m24520b(this, 10.0f);
                layoutParams.leftMargin = b3;
                int i = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(b3);
                C69271a aVar = new C69271a(this);
                aVar.setLayoutParams(layoutParams);
                aVar.setOnClickListener(iVar);
                if (b2 != null) {
                    aVar.setText(b2);
                }
                if (a2 != null) {
                    aVar.setIcon(a2);
                }
                aVar.setTextColor(R.color.c4);
                if (a.mo109557b(this)) {
                    this.f154245b.addView(aVar);
                }
            }
        }
        MethodCollector.m26664o(6146);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", true);
        activityConfiguration(C68951g.f154257a);
        super.onCreate(bundle);
        setContentView(R.layout.ch);
        this.f154244a = (RemoteImageView) findViewById(R.id.bvv);
        this.f154245b = (LinearLayout) findViewById(R.id.cej);
        this.f154246c = (LinearLayout) findViewById(R.id.cek);
        View findViewById = findViewById(R.id.esp);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC68952h(this));
        }
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        this.f154247d = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null) {
            finish();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f154244a.setClipToOutline(true);
            this.f154244a.setOutlineProvider(new C80508gp(C34728n.m70946a(4.0d)));
        }
        if (!TextUtils.isEmpty(this.f154247d.f154196e) && this.f154247d.f154201j > 0 && this.f154247d.f154200i > 0) {
            ViewGroup.LayoutParams layoutParams = this.f154244a.getLayoutParams();
            layoutParams.width = this.f154247d.f154200i;
            layoutParams.height = this.f154247d.f154201j;
            this.f154244a.setLayoutParams(layoutParams);
            Uri fromFile = Uri.fromFile(new File(this.f154247d.f154196e));
            C24428k.m46551a().mo40247e().mo40228a(fromFile);
            C34577e.m70600a(this.f154244a, fromFile.toString(), this.f154247d.f154200i, this.f154247d.f154201j);
        }
        m121640a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", false);
    }
}
