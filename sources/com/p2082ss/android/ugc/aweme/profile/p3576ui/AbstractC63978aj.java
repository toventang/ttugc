package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import dagger.hilt.android.internal.managers.C88113e;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.aj */
public abstract class AbstractC63978aj extends AbstractC18234b implements AbstractC88084b<Object> {

    /* renamed from: a */
    private ContextWrapper f145091a;

    /* renamed from: b */
    private volatile C88113e f145092b;

    /* renamed from: c */
    private final Object f145093c = new Object();

    static {
        Covode.recordClassIndex(75422);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f145091a;
    }

    AbstractC63978aj() {
    }

    /* renamed from: c */
    private void mo103583c() {
        ((AbstractC64096cj) generatedComponent()).mo60029a((C64048bm) this);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo103582b().generatedComponent();
    }

    /* renamed from: a */
    private void mo102184a() {
        if (this.f145091a == null) {
            this.f145091a = C88113e.m153184a(super.getContext(), this);
            mo103583c();
        }
    }

    /* renamed from: b */
    private C88113e mo103582b() {
        if (this.f145092b == null) {
            synchronized (this.f145093c) {
                if (this.f145092b == null) {
                    this.f145092b = new C88113e(this);
                }
            }
        }
        return this.f145092b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo102184a();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C88113e.m153185a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f145091a;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo102184a();
    }
}
