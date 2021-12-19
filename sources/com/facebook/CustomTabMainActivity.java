package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24742f;
import com.facebook.internal.C24786y;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

public class CustomTabMainActivity extends Activity {

    /* renamed from: a */
    public static final String f56415a = (CustomTabMainActivity.class.getSimpleName() + ".extra_action");

    /* renamed from: b */
    public static final String f56416b = (CustomTabMainActivity.class.getSimpleName() + ".extra_params");

    /* renamed from: c */
    public static final String f56417c = (CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage");

    /* renamed from: d */
    public static final String f56418d = (CustomTabMainActivity.class.getSimpleName() + ".extra_url");

    /* renamed from: e */
    public static final String f56419e = (CustomTabMainActivity.class.getSimpleName() + ".action_refresh");

    /* renamed from: f */
    public static final String f56420f = (CustomTabMainActivity.class.getSimpleName() + ".no_activity_exception");

    /* renamed from: g */
    private boolean f56421g = true;

    /* renamed from: h */
    private BroadcastReceiver f56422h;

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

    /* access modifiers changed from: protected */
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
        if (this.f56421g) {
            m45061a(0, (Intent) null);
        }
        this.f56421g = true;
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

    static {
        Covode.recordClassIndex(27963);
    }

    /* renamed from: a */
    private static Bundle m45059a(String str) {
        Uri parse = Uri.parse(str);
        Bundle c = C24693ad.m47271c(parse.getQuery());
        c.putAll(C24693ad.m47271c(parse.getFragment()));
        return c;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f56419e.equals(intent.getAction())) {
            C0998a.m3454a(this).mo3694a(new Intent(CustomTabActivity.f56412b));
            m45061a(-1, intent);
        } else if (CustomTabActivity.f56411a.equals(intent.getAction())) {
            m45061a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        if (CustomTabActivity.f56411a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String a = m45060a(getIntent(), f56415a);
            Bundle bundleExtra = getIntent().getBundleExtra(f56416b);
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            boolean a2 = new C24742f(a, bundleExtra).mo40570a(this, m45060a(getIntent(), f56417c));
            this.f56421g = false;
            if (!a2) {
                setResult(0, getIntent().putExtra(f56420f, true));
                finish();
                return;
            }
            this.f56422h = new BroadcastReceiver() {
                /* class com.facebook.CustomTabMainActivity.C238491 */

                static {
                    Covode.recordClassIndex(27964);
                }

                /* renamed from: a */
                private static String m45062a(Intent intent, String str) {
                    try {
                        return intent.getStringExtra(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }

                public final void onReceive(Context context, Intent intent) {
                    Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.f56419e);
                    intent2.putExtra(CustomTabMainActivity.f56418d, m45062a(intent, CustomTabMainActivity.f56418d));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity customTabMainActivity = CustomTabMainActivity.this;
                    C84349a.m145093a(intent2, customTabMainActivity);
                    customTabMainActivity.startActivity(intent2);
                }
            };
            C0998a.m3454a(this).mo3693a(this.f56422h, new IntentFilter(CustomTabActivity.f56411a));
        }
    }

    /* renamed from: a */
    private static String m45060a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m45061a(int i, Intent intent) {
        Bundle bundle;
        C0998a.m3454a(this).mo3692a(this.f56422h);
        if (intent != null) {
            String a = m45060a(intent, f56418d);
            if (a != null) {
                bundle = m45059a(a);
            } else {
                bundle = new Bundle();
            }
            Intent a2 = C24786y.m47464a(getIntent(), bundle, (C24798j) null);
            if (a2 != null) {
                intent = a2;
            }
            setResult(i, intent);
        } else {
            setResult(i, C24786y.m47464a(getIntent(), (Bundle) null, (C24798j) null));
        }
        finish();
    }
}
