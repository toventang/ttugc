package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import dagger.AbstractC88075a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity */
public class ProfileEditActivity extends AbstractActivityC63977ai {

    /* renamed from: a */
    public AbstractC88075a<C64004az> f145007a;

    static {
        Covode.recordClassIndex(75380);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        this.f145007a.get().mo103634l();
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

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (r11.getY() < ((float) r5)) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r1.hideSoftInputFromWindow(r3.getWindowToken(), 2) == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.ProfileEditActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractActivityC63977ai, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.l;
        activityConfiguration(new C64021bg(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.mb);
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        if (!this.f145007a.get().f145156n) {
            C64004az azVar = this.f145007a.get();
            Bundle bundle2 = new Bundle();
            if (getIntent() != null) {
                bundle2.putInt("jump_school_edit", getIntent().getIntExtra("jump_school_edit", 0));
                if (TextUtils.equals(m115657a(getIntent(), "enter_from"), "message")) {
                    bundle2.putInt("need_focus_id_input", 3);
                } else {
                    bundle2.putInt("need_focus_id_input", getIntent().getIntExtra("need_focus_id_input", 0));
                }
                bundle2.putInt("need_focus_id_input", getIntent().getIntExtra("need_focus_id_input", 0));
                bundle2.putString("enter_from", m115657a(getIntent(), "enter_from"));
                bundle2.putString("enter_method", m115657a(getIntent(), "enter_method"));
                bundle2.putBoolean("change_to_ba", getIntent().getBooleanExtra("change_to_ba", false));
                getIntent();
            }
            azVar.setArguments(bundle2);
            a.mo3470b(R.id.b82, this.f145007a.get(), "user_profile_edit_fragment").mo3467b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m115657a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m115658a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public static void m115659a(Activity activity, Bundle bundle) {
        if (activity != null) {
            if (bundle == null) {
                m115658a(activity, new Intent(activity, ProfileEditActivity.class));
                return;
            }
            Intent intent = new Intent(activity, ProfileEditActivity.class);
            intent.putExtras(bundle);
            m115658a(activity, intent);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f145007a.get().onActivityResult(i, i2, intent);
    }
}
