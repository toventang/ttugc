package com.p2082ss.android.ugc.aweme.download.component_api.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.download.component_api.p2810b.AbstractC43175c;
import com.p2082ss.android.ugc.aweme.download.component_api.p2811c.C43180d;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity */
public class DownloadDelegateActivity extends Activity {

    /* renamed from: a */
    protected Intent f100650a;

    static {
        Covode.recordClassIndex(51349);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
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
    public static void m86100a(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onCreate", true);
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
        Intent intent = getIntent();
        this.f100650a = intent;
        if (intent != null) {
            if (intent.getIntExtra(StringSet.type, 0) != 1) {
                m86100a(this);
            } else {
                final String a = m86099a(this.f100650a, "permission_id_key");
                String[] stringArrayExtra = this.f100650a.getStringArrayExtra("permission_content_key");
                if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
                    m86100a(this);
                } else {
                    final C431701 r2 = new AbstractC43175c() {
                        /* class com.p2082ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity.C431701 */

                        /* renamed from: c */
                        private WeakReference<Activity> f100653c;

                        static {
                            Covode.recordClassIndex(51350);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.download.component_api.p2810b.AbstractC43175c
                        /* renamed from: a */
                        public final void mo73417a() {
                            C43180d.AbstractC43181a a;
                            String str = a;
                            if (!TextUtils.isEmpty(str) && (a = C43180d.m86113a(str)) != null) {
                                a.mo73420a();
                            }
                            DownloadDelegateActivity.m86100a(this.f100653c.get());
                        }

                        @Override // com.p2082ss.android.ugc.aweme.download.component_api.p2810b.AbstractC43175c
                        /* renamed from: b */
                        public final void mo73418b() {
                            String str = a;
                            if (!TextUtils.isEmpty(str)) {
                                C43180d.m86113a(str);
                            }
                            DownloadDelegateActivity.m86100a(this.f100653c.get());
                        }

                        {
                            this.f100653c = new WeakReference<>(DownloadDelegateActivity.this);
                        }
                    };
                    if (Build.VERSION.SDK_INT >= 23) {
                        try {
                            C35444b.m72473a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C35444b.AbstractC35447b() {
                                /* class com.p2082ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity.C431712 */

                                static {
                                    Covode.recordClassIndex(51351);
                                }

                                @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
                                /* renamed from: a */
                                public final void mo53515a(String[] strArr, int[] iArr) {
                                    if (iArr.length <= 0 || iArr[0] != 0) {
                                        r2.mo73418b();
                                    } else {
                                        r2.mo73417a();
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }
                    r2.mo73417a();
                }
            }
            this.f100650a = null;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m86099a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
