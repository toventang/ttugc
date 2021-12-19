package com.zhihu.matisse.internal.p4516ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.internal.entity.Item;
import java.util.ArrayList;

/* renamed from: com.zhihu.matisse.internal.ui.SelectedPreviewActivity */
public class SelectedPreviewActivity extends AbstractView$OnClickListenerC87958a {
    static {
        Covode.recordClassIndex(103976);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
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

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
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

    @Override // com.zhihu.matisse.internal.p4516ui.AbstractView$OnClickListenerC87958a, androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        if (!C87956c.C87957a.f199768a.f199762p) {
            setResult(0);
            finish();
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("extra_default_bundle");
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection");
        this.f199774d.mo142505a(parcelableArrayList);
        this.f199774d.notifyDataSetChanged();
        if (this.f199772b.f199752f) {
            this.f199775e.setCheckedNum(1);
        } else {
            this.f199775e.setChecked(true);
        }
        this.f199779i = 0;
        mo142487a((Item) parcelableArrayList.get(0));
    }
}
