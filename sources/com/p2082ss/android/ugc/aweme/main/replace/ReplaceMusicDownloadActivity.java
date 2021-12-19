package com.p2082ss.android.ugc.aweme.main.replace;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.main.replace.C59121d;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity */
public final class ReplaceMusicDownloadActivity extends ActivityC17312a {
    private SparseArray _$_findViewCache;

    static {
        Covode.recordClassIndex(69467);
    }

    public final void ReplaceMusicDownloadActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new SparseArray();
        }
        View view = (View) this._$_findViewCache.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        m108601xe26df3c9(this);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onResume", false);
    }

    /* renamed from: com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m108600xc456e762(ReplaceMusicDownloadActivity replaceMusicDownloadActivity) {
        replaceMusicDownloadActivity.ReplaceMusicDownloadActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                replaceMusicDownloadActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m108601xe26df3c9(ReplaceMusicDownloadActivity replaceMusicDownloadActivity) {
        m108600xc456e762(replaceMusicDownloadActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                replaceMusicDownloadActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        String string;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onCreate", true);
        super.onCreate(bundle);
        String com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m108602x1221a947(getIntent(), "aweme_id");
        if (TextUtils.isEmpty(com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onCreate", false);
            return;
        }
        C59121d dVar = new C59121d();
        if (com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            C89219l.m154715b();
        }
        C89219l.m154721d(com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, "");
        C89219l.m154721d(this, "");
        C89219l.m154721d("", "");
        dVar.f134531a = this;
        dVar.f134532b = "";
        if (!C80580in.m139687c()) {
            if (!C80720e.m139939e()) {
                Activity activity = dVar.f134531a;
                if (activity == null) {
                    C89219l.m154710a("mContext");
                }
                new C23144b(activity).mo37640e(R.string.fev).mo37637b();
            } else if (C80720e.m139940f() < 20971520) {
                Activity activity2 = dVar.f134531a;
                if (activity2 == null) {
                    C89219l.m154710a("mContext");
                }
                new C23144b(activity2).mo37640e(R.string.fev).mo37637b();
            } else {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132256h = C59121d.m108616a();
                    }
                    if (!C58029j.f132256h) {
                        Activity activity3 = dVar.f134531a;
                        if (activity3 == null) {
                            C89219l.m154710a("mContext");
                        }
                        new C23144b(activity3).mo37640e(R.string.dcr).mo37637b();
                    } else {
                        if (dVar.f134533c == null) {
                            Activity activity4 = dVar.f134531a;
                            if (activity4 == null) {
                                C89219l.m154710a("mContext");
                            }
                            Activity activity5 = dVar.f134531a;
                            if (activity5 == null) {
                                C89219l.m154710a("mContext");
                            } else {
                                Resources resources = activity5.getResources();
                                if (resources != null) {
                                    string = resources.getString(R.string.bde);
                                    dVar.f134533c = ProgressDialogC74145d.m130371a(activity4, string);
                                }
                            }
                            string = null;
                            dVar.f134533c = ProgressDialogC74145d.m130371a(activity4, string);
                        }
                        ProgressDialogC74145d dVar2 = dVar.f134533c;
                        if (dVar2 != null) {
                            dVar2.setIndeterminate(false);
                        }
                        ProgressDialogC74145d dVar3 = dVar.f134533c;
                        if (dVar3 != null) {
                            dVar3.setProgress(0);
                        }
                        C29339a.m58752a(new C59121d.RunnableC59124c(dVar, com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra));
                    }
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onCreate", false);
    }

    /* renamed from: com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m108602x1221a947(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
