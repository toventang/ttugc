package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a */
public abstract class AbstractActivityC57888a extends ActivityC17312a {

    /* renamed from: a */
    protected Fragment f131965a;

    static {
        Covode.recordClassIndex(67905);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo95212a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo95213b();

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        if (getCurrentFocus() != null) {
            ((InputMethodManager) m104665a(this, "input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        if (getSupportFragmentManager().mo3564e() != 1) {
            try {
                getSupportFragmentManager().mo3562c();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = C29843f.m60127a(this, getPackageName());
            }
            finish();
            if (intent != null) {
                C84349a.m145093a(intent, this);
                startActivity(intent);
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo95212a());
        mo95213b();
    }

    /* renamed from: a */
    public final void mo95214a(Fragment fragment) {
        if (getSupportFragmentManager().mo3565f() == null) {
            getSupportFragmentManager().mo3552a().mo3453a(R.id.b82, fragment).mo3473c();
            return;
        }
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        a.mo3452a(R.anim.dq, R.anim.dv, R.anim.f205073do, R.anim.dx);
        a.mo3469b(R.id.b82, fragment);
        a.mo3457a((String) null);
        a.mo3473c();
    }

    /* renamed from: a */
    private static Object m104665a(Activity activity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return activity.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return activity.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = activity.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
