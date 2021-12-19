package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2551e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import dagger.hilt.android.internal.managers.C88113e;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.a */
public abstract class AbstractC37752a extends AbstractC34586a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private ContextWrapper f89150a;

    /* renamed from: b */
    private volatile C88113e f89151b;

    /* renamed from: c */
    private final Object f89152c = new Object();

    static {
        Covode.recordClassIndex(45195);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f89150a;
    }

    /* renamed from: c */
    private void mo65752c() {
        ((AbstractC37758c) generatedComponent()).mo60026a((C37753b) this);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo65751b().generatedComponent();
    }

    /* renamed from: a */
    private void mo65750a() {
        if (this.f89150a == null) {
            this.f89150a = C88113e.m153184a(super.getContext(), this);
            mo65752c();
        }
    }

    /* renamed from: b */
    private C88113e mo65751b() {
        if (this.f89151b == null) {
            synchronized (this.f89152c) {
                if (this.f89151b == null) {
                    this.f89151b = new C88113e(this);
                }
            }
        }
        return this.f89151b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo65750a();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C88113e.m153185a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f89150a;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo65750a();
    }
}
