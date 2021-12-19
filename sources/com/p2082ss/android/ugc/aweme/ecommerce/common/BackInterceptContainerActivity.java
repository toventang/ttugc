package com.p2082ss.android.ugc.aweme.ecommerce.common;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity */
public final class BackInterceptContainerActivity extends BulletContainerActivity implements IEventCenter.AbstractC45375b {

    /* renamed from: m */
    public static final C44292a f103293m = new C44292a((byte) 0);

    /* renamed from: n */
    private String f103294n;

    /* renamed from: o */
    private SparseArray f103295o;

    static {
        Covode.recordClassIndex(52605);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: a */
    public final View mo26864a(int i) {
        if (this.f103295o == null) {
            this.f103295o = new SparseArray();
        }
        View view = (View) this.f103295o.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103295o.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity$a */
    public static final class C44292a {
        static {
            Covode.recordClassIndex(52606);
        }

        private C44292a() {
        }

        public /* synthetic */ C44292a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void finish() {
        super.finish();
        String str = this.f103294n;
        if (str != null && str.length() > 0) {
            SmartRouter.buildRoute(this, str).open();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        EventCenter.m87158a().mo75481b("ec_hybrid_container_intercept_back", this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        String str;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        C89219l.m154716b(intent, "");
        Uri data = intent.getData();
        if (data != null) {
            str = data.getQueryParameter("back_open_url");
        } else {
            str = null;
        }
        this.f103294n = str;
        EventCenter.m87158a().mo75480a("ec_hybrid_container_intercept_back", this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onCreate", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C89219l.m154714a((Object) "ec_hybrid_container_intercept_back", (Object) str) && str2.length() > 0) {
            try {
                if (C89219l.m154714a((Object) mo26871g().getReactId(), (Object) new JSONObject(str2).optString("react_id"))) {
                    this.f103294n = new JSONObject(str2).optString("back_open_url");
                }
            } catch (Throwable th) {
                C22708a.m42802a(th);
            }
        }
    }
}
