package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import dagger.hilt.android.internal.managers.C88113e;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.b */
public abstract class AbstractC37710b extends DialogInterface$OnCancelListenerC0944d implements AbstractC88084b<Object> {

    /* renamed from: a */
    private ContextWrapper f89081a;

    /* renamed from: b */
    private volatile C88113e f89082b;

    /* renamed from: c */
    private final Object f89083c = new Object();

    static {
        Covode.recordClassIndex(45150);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f89081a;
    }

    /* renamed from: c */
    private void mo65730c() {
        ((AbstractC37734e) generatedComponent()).mo60025a((C37712d) this);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo65729b().generatedComponent();
    }

    /* renamed from: a */
    private void mo65728a() {
        if (this.f89081a == null) {
            this.f89081a = C88113e.m153184a(super.getContext(), this);
            mo65730c();
        }
    }

    /* renamed from: b */
    private C88113e mo65729b() {
        if (this.f89082b == null) {
            synchronized (this.f89083c) {
                if (this.f89082b == null) {
                    this.f89082b = new C88113e(this);
                }
            }
        }
        return this.f89082b;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo65728a();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C88113e.m153185a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f89081a;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo65728a();
    }
}
