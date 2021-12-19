package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.CountryListActivity */
public class CountryListActivity extends ActivityC17312a {

    /* renamed from: a */
    RecyclerView f77043a;

    /* renamed from: b */
    ArrayList<C31966a> f77044b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<C31966a> f77045c = new ArrayList<>();

    /* renamed from: d */
    EditText f77046d;

    /* renamed from: e */
    TextView f77047e;

    /* renamed from: f */
    ImageView f77048f;

    /* renamed from: g */
    private WaveSideBar f77049g;

    static {
        Covode.recordClassIndex(39072);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onWindowFocusChanged", true);
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.a2, 0);
        C31966a.m66334a(this);
        ArrayList<C31966a> arrayList = new ArrayList(C31966a.f76330h);
        List asList = Arrays.asList("CN", "HK", "MO", "TW");
        C31966a[] aVarArr = new C31966a[asList.size()];
        for (C31966a aVar : arrayList) {
            int indexOf = asList.indexOf(aVar.f76334c);
            if (indexOf >= 0) {
                int i = aVar.f76332a;
                String str = aVar.f76333b;
                String str2 = aVar.f76334c;
                String str3 = aVar.f76335d;
                String str4 = aVar.f76336e;
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d(str3, "");
                C89219l.m154721d(str4, "");
                C31966a aVar2 = new C31966a(i, str, str2, str3, str4);
                aVar2.mo57952a("#");
                aVarArr[indexOf] = aVar2;
            }
        }
        arrayList.addAll(0, Arrays.asList(aVarArr));
        this.f77045c.addAll(arrayList);
        this.f77044b.addAll(arrayList);
        setContentView(R.layout.ff);
        this.f77046d = (EditText) findViewById(R.id.drj);
        this.f77047e = (TextView) findViewById(R.id.dsi);
        this.f77048f = (ImageView) findViewById(R.id.pi);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.do5);
        this.f77043a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C32311b bVar = new C32311b(this.f77044b);
        this.f77043a.setAdapter(bVar);
        bVar.f77086a = new C32315c(this);
        WaveSideBar waveSideBar = (WaveSideBar) findViewById(R.id.e11);
        this.f77049g = waveSideBar;
        waveSideBar.setPosition(C80471gb.m139482a() ? 1 : 0);
        this.f77049g.setOnSelectIndexItemListener(new C32316d(this));
        C39115e.m79412a(this, this.f77046d);
        this.f77047e.setOnClickListener(new View$OnClickListenerC32317e(this, bVar));
        this.f77048f.setOnClickListener(new View$OnClickListenerC32318f(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", false);
    }
}
