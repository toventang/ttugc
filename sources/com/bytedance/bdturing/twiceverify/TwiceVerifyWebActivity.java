package com.bytedance.bdturing.twiceverify;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.bdturing.AbstractC13304n;
import com.bytedance.bdturing.C13270e;
import com.bytedance.bdturing.VerifyWebView;
import com.bytedance.bdturing.p863c.C13256b;
import com.bytedance.bdturing.p863c.C13262d;
import com.bytedance.bdturing.twiceverify.C13314c;
import com.bytedance.bdturing.verify.p867a.AbstractC13322a;
import com.bytedance.bdturing.verify.p867a.C13323b;
import com.bytedance.bdturing.verify.p867a.C13329h;
import com.bytedance.bdturing.verify.p867a.C13334m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

public class TwiceVerifyWebActivity extends ActivityC0218d {

    /* renamed from: a */
    private VerifyWebView f32555a;

    /* renamed from: b */
    private View f32556b;

    /* renamed from: c */
    private AbstractC13322a f32557c;

    /* renamed from: d */
    private C13256b f32558d;

    /* renamed from: e */
    private AbstractC13304n f32559e = new AbstractC13304n() {
        /* class com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity.C133101 */

        static {
            Covode.recordClassIndex(15276);
        }

        @Override // com.bytedance.bdturing.AbstractC13304n
        /* renamed from: a */
        public final void mo21467a() {
            C13270e.m23848a(0, "success");
        }

        @Override // com.bytedance.bdturing.AbstractC13304n
        /* renamed from: a */
        public final void mo21468a(int i, String str) {
            C13270e.m23848a(i, str);
        }
    };

    static {
        Covode.recordClassIndex(15275);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        finish();
        C13314c.AbstractC13316a aVar = C13314c.m23939a().f32565b;
        if (aVar != null) {
            aVar.mo21486a(2);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        this.f32555a = null;
        C13314c a = C13314c.m23939a();
        a.f32565b = null;
        a.f32567d = null;
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
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

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        setFinishOnTouchOutside(false);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) decorView.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.width = C13628n.m24504a(this);
        if (C13314c.m23939a().f32566c == null || C13314c.m23939a().f32566c.f32561a <= 0) {
            layoutParams.height = (int) C13628n.m24520b(this, 304.0f);
            AbstractC13322a aVar = this.f32557c;
            if (aVar instanceof C13323b) {
                layoutParams.height = (int) C13628n.m24520b(this, 290.0f);
            } else if (aVar instanceof C13334m) {
                layoutParams.height = (int) C13628n.m24520b(this, 304.0f);
            } else if (aVar instanceof C13329h) {
                layoutParams.height = (int) C13628n.m24520b(this, 272.0f);
            }
        } else {
            layoutParams.height = C13314c.m23939a().f32566c.f32561a;
        }
        getWindowManager().updateViewLayout(decorView, layoutParams);
    }

    /* renamed from: a */
    private static void m23934a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    /* renamed from: a */
    public final void mo21482a(int i) {
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.a23));
        m23934a(Toast.makeText(this, "ERROR:".concat(String.valueOf(i)), 1));
        VerifyWebView verifyWebView = this.f32555a;
        if (verifyWebView != null) {
            verifyWebView.setVisibility(4);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.lu);
        C13314c.m23939a();
        this.f32557c = C13314c.m23939a().f32567d;
        if (this.f32555a == null) {
            VerifyWebView verifyWebView = (VerifyWebView) findViewById(R.id.rb);
            this.f32555a = verifyWebView;
            verifyWebView.mo21379a(this.f32559e);
        }
        VerifyWebView verifyWebView2 = this.f32555a;
        if (verifyWebView2 != null) {
            verifyWebView2.setParentActivity(this);
        }
        this.f32555a.getSettings().setJavaScriptEnabled(true);
        this.f32558d = new C13256b(new C13262d(this), this.f32555a);
        HashMap hashMap = new HashMap();
        VerifyWebView verifyWebView3 = this.f32555a;
        String e = this.f32557c.mo21498e();
        String a = C84357h.f188595a.mo129370a(verifyWebView3, e);
        if (!TextUtils.isEmpty(a)) {
            e = a;
        }
        verifyWebView3.loadUrl(e, hashMap);
        this.f32556b = findViewById(R.id.ek0);
        if (C13314c.m23939a().f32566c != null) {
            Drawable e2 = C0705a.m2506e(getResources().getDrawable(R.drawable.oy));
            C0705a.m2494a(e2, C13314c.m23939a().f32566c.f32562b);
            this.f32556b.setBackgroundDrawable(e2);
        }
    }
}
