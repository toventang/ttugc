package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.core.p1841a.p1842a.p1843a.C24142a;
import com.facebook.core.p1841a.p1842a.p1843a.C24144b;
import com.facebook.internal.C24749k;
import com.facebook.internal.C24786y;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.login.C24865e;
import com.facebook.p1907m.C24885b;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

public class FacebookActivity extends ActivityC0945e {

    /* renamed from: a */
    public static String f56424a = "PassThrough";

    /* renamed from: c */
    private static String f56425c = "SingleFragment";

    /* renamed from: d */
    private static final String f56426d = FacebookActivity.class.getName();

    /* renamed from: b */
    public Fragment f56427b;

    @Override // androidx.fragment.app.ActivityC0945e
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
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

    @Override // androidx.fragment.app.ActivityC0945e
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(27965);
    }

    @Override // androidx.fragment.app.ActivityC0945e
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

    @Override // androidx.fragment.app.ActivityC0945e
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f56427b;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        if (!C24872m.m47685a()) {
            C24872m.m47684a(C17867d.m33078a());
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C24872m.m47685a()) {
            Context applicationContext = getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C24872m.m47684a(applicationContext);
        }
        setContentView(R.layout.na);
        if (f56424a.equals(intent.getAction())) {
            setResult(0, C24786y.m47464a(getIntent(), (Bundle) null, C24786y.m47470a(C24786y.m47478b(getIntent()))));
            finish();
            return;
        }
        Intent intent2 = getIntent();
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo3551a(f56425c);
        C24749k kVar = a;
        if (a == null) {
            if ("FacebookDialogFragment".equals(intent2.getAction())) {
                C24749k kVar2 = new C24749k();
                kVar2.setRetainInstance(true);
                kVar2.show(supportFragmentManager, f56425c);
                kVar = kVar2;
            } else if ("DeviceShareDialogFragment".equals(intent2.getAction())) {
                DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
                deviceShareDialogFragment.setRetainInstance(true);
                deviceShareDialogFragment.f59185b = (ShareContent) intent2.getParcelableExtra("content");
                deviceShareDialogFragment.show(supportFragmentManager, f56425c);
                kVar = deviceShareDialogFragment;
            } else if ("ReferralFragment".equals(intent2.getAction())) {
                C24885b bVar = new C24885b();
                bVar.setRetainInstance(true);
                supportFragmentManager.mo3552a().mo3454a(R.id.a87, bVar, f56425c).mo3467b();
                kVar = bVar;
            } else {
                C24865e eVar = new C24865e();
                eVar.setRetainInstance(true);
                supportFragmentManager.mo3552a().mo3454a(R.id.a87, eVar, f56425c).mo3467b();
                kVar = eVar;
            }
        }
        this.f56427b = kVar;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!C24677a.m47209a(this)) {
            int i = 1;
            if (strArr != null) {
                try {
                    if (strArr.length > 0 && "e2e".equals(strArr[0])) {
                        if (C24144b.f57100a == null) {
                            C24144b.f57100a = new C24144b();
                        }
                        C24144b bVar = C24144b.f57100a;
                        printWriter.print(str);
                        printWriter.println("Top Level Window View Hierarchy:");
                        boolean a = C24144b.m45755a(strArr, "all-roots");
                        boolean a2 = C24144b.m45755a(strArr, "top-root");
                        boolean a3 = C24144b.m45755a(strArr, "webview");
                        boolean a4 = C24144b.m45755a(strArr, "props");
                        try {
                            List<C24142a.C24143a> a5 = bVar.f57102b.mo39731a();
                            if (a5 == null) {
                                return;
                            }
                            if (!a5.isEmpty()) {
                                Collections.reverse(a5);
                                WindowManager.LayoutParams layoutParams = null;
                                for (C24142a.C24143a aVar : a5) {
                                    if (aVar.f57098a.getVisibility() == 0) {
                                        if (!(a || layoutParams == null || Math.abs(aVar.f57099b.type - layoutParams.type) == i)) {
                                            break;
                                        }
                                        bVar.mo39732a(str + "  ", printWriter, aVar.f57098a, 0, 0, a3, a4);
                                        layoutParams = aVar.f57099b;
                                        if (a2) {
                                            break;
                                        }
                                        i = 1;
                                    }
                                }
                                bVar.f57103c.mo39733a(printWriter);
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            printWriter.println("Failure in view hierarchy dump: " + e.getMessage());
                            return;
                        }
                    }
                } catch (Throwable th) {
                    C24677a.m47208a(th, this);
                    return;
                }
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
