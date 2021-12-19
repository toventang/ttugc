package com.bytedance.android.livesdk.p643ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.ui.a */
public class C10935a extends Fragment {
    private final C88411a compositeDisposable = new C88411a();
    public boolean mStatusActive;
    public boolean mStatusDestroyed;
    protected boolean mStatusViewValid;

    static {
        Covode.recordClassIndex(12547);
    }

    public boolean isViewValid() {
        return this.mStatusViewValid;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mStatusViewValid = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mStatusActive = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mStatusActive = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mStatusViewValid = false;
        this.mStatusDestroyed = true;
        this.compositeDisposable.mo142944a();
    }

    /* access modifiers changed from: protected */
    public void register(AbstractC88412b bVar) {
        this.compositeDisposable.mo142945a(bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mStatusActive = false;
        this.mStatusViewValid = false;
        this.mStatusDestroyed = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mStatusViewValid = true;
    }
}
