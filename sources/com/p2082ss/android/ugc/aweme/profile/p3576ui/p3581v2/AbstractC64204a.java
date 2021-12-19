package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al;
import dagger.hilt.android.internal.managers.C88113e;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.a */
public abstract class AbstractC64204a extends AbstractC63980al implements AbstractC88084b<Object> {

    /* renamed from: u */
    private ContextWrapper f145621u;

    /* renamed from: v */
    private volatile C88113e f145622v;

    /* renamed from: w */
    private final Object f145623w = new Object();

    static {
        Covode.recordClassIndex(75649);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f145621u;
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo103783b().generatedComponent();
    }

    /* renamed from: a */
    private void mo103748a() {
        if (this.f145621u == null) {
            this.f145621u = C88113e.m153184a(super.getContext(), this);
            generatedComponent();
        }
    }

    /* renamed from: b */
    private C88113e mo103783b() {
        if (this.f145622v == null) {
            synchronized (this.f145623w) {
                if (this.f145622v == null) {
                    this.f145622v = new C88113e(this);
                }
            }
        }
        return this.f145622v;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo103748a();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C88113e.m153185a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f145621u;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo103748a();
    }
}
