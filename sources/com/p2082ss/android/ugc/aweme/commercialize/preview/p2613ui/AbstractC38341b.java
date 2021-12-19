package com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import dagger.hilt.android.internal.managers.C88113e;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.b */
public abstract class AbstractC38341b extends Fragment implements AbstractC88084b<Object> {

    /* renamed from: a */
    private ContextWrapper f90604a;

    /* renamed from: b */
    private volatile C88113e f90605b;

    /* renamed from: c */
    private final Object f90606c = new Object();

    static {
        Covode.recordClassIndex(45836);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f90604a;
    }

    /* renamed from: c */
    private void mo66898c() {
        ((AbstractC38340a) generatedComponent()).mo60027a((AdsPreviewFragment) this);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo66897b().generatedComponent();
    }

    /* renamed from: a */
    private void mo66896a() {
        if (this.f90604a == null) {
            this.f90604a = C88113e.m153184a(super.getContext(), this);
            mo66898c();
        }
    }

    /* renamed from: b */
    private C88113e mo66897b() {
        if (this.f90605b == null) {
            synchronized (this.f90606c) {
                if (this.f90605b == null) {
                    this.f90605b = new C88113e(this);
                }
            }
        }
        return this.f90605b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo66896a();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C88113e.m153185a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f90604a;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo66896a();
    }
}
