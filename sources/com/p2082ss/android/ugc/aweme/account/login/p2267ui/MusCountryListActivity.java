package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.os.Build;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.AbstractC34292ax;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity */
public class MusCountryListActivity extends ActivityC17312a {

    /* renamed from: g */
    public static AbstractC34292ax f77050g;

    /* renamed from: a */
    RecyclerView f77051a;

    /* renamed from: b */
    ArrayList<C31966a> f77052b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<C31966a> f77053c = new ArrayList<>();

    /* renamed from: d */
    EditText f77054d;

    /* renamed from: e */
    TextView f77055e;

    /* renamed from: f */
    ImageView f77056f;

    /* renamed from: h */
    private WaveSideBar f77057h;

    static {
        Covode.recordClassIndex(39073);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.a4);
        AbstractC34292ax axVar = f77050g;
        if (axVar != null) {
            axVar.onExit();
        }
    }

    /* renamed from: a */
    private void m66679a() {
        ArrayList arrayList = new ArrayList();
        Iterator<C31966a> it = this.f77053c.iterator();
        String str = "";
        while (it.hasNext()) {
            String str2 = it.next().f76333b;
            if (!str2.equals(str)) {
                arrayList.add(str2);
                str = str2;
            }
        }
        this.f77057h.setIndexItems((String[]) arrayList.toArray(new String[arrayList.size()]));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2267ui.MusCountryListActivity.onCreate(android.os.Bundle):void");
    }
}
