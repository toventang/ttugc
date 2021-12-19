package com.p2082ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72595ac;
import com.p2082ss.android.ugc.aweme.sticker.text.C75894b;
import com.p2082ss.android.ugc.aweme.sticker.text.C75896c;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78291g;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity */
public class DraftBoxActivity extends ActivityC33402b {

    /* renamed from: d */
    private AbstractC78471x f175422d;

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(91221);
        C75894b.m133079a();
        C75896c.m133081a();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        AbstractC78471x xVar = this.f175422d;
        if (xVar != null) {
            xVar.mo122087b();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AVCommerceServiceImpl.m102988h().mo93966c();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        C63244g.m114602a().mo73287o().mo104788h().mo104819a();
    }

    /* renamed from: h */
    private static AbstractC78471x m136568h() {
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            return new C78291g();
        }
        if (C78208bc.m136692a()) {
            return new C78144at();
        }
        return new C78473z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo122030g() {
        AbstractC78471x xVar = (AbstractC78471x) getSupportFragmentManager().mo3549a(R.id.b82);
        this.f175422d = xVar;
        if (xVar == null) {
            this.f175422d = m136568h();
            if (getIntent() != null) {
                this.f175422d.setArguments(m136564a(getIntent()));
            }
            getSupportFragmentManager().mo3552a().mo3453a(R.id.b82, this.f175422d).mo3473c();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void onStop() {
        C15477a.m28478d(this);
        C63244g.m114602a().mo73287o().mo104788h().mo104821c();
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
    private static Bundle m136564a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m136565a(Context context) {
        if (context != null) {
            m136566a(context, new Intent(context, DraftBoxActivity.class));
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.br);
        C70005cr.m123611a().mo110453c();
        if (C63244g.m114602a().mo73274b().mo101757a(this) == 0) {
            mo122030g();
        } else {
            C63244g.m114602a().mo73274b().mo101758a(this, new C78472y(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        C23073a.C23074a.m43508a(this).mo37494a(R.color.l).mo37503d(R.color.l).mo37495a(true).f54627a.mo33415d();
        TTUploaderService.m123220c();
        C72595ac.m128075a();
        C63244g.m114602a().mo73287o().mo104781a();
        C63244g.m114602a().mo73287o().mo104797q().mo104812a();
        AVCommerceServiceImpl.m102988h().mo93960a((int) C84912r.m145930a(this, 15.0f));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static void m136566a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m136567a(Context context, Bundle bundle) {
        if (context != null) {
            Intent intent = new Intent(context, DraftBoxActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            m136566a(context, intent);
        }
    }
}
