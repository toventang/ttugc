package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.C17372a;
import dagger.hilt.android.internal.managers.C88113e;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.h */
public abstract class AbstractC54180h extends C17372a implements AbstractC88084b<Object> {

    /* renamed from: e */
    private ContextWrapper f124138e;

    /* renamed from: f */
    private volatile C88113e f124139f;

    /* renamed from: g */
    private final Object f124140g = new Object();

    static {
        Covode.recordClassIndex(63862);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f124138e;
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo91268d().generatedComponent();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    private void mo64296c() {
        if (this.f124138e == null) {
            this.f124138e = C88113e.m153184a(super.getContext(), this);
            generatedComponent();
        }
    }

    /* renamed from: d */
    private C88113e mo91268d() {
        if (this.f124139f == null) {
            synchronized (this.f124140g) {
                if (this.f124139f == null) {
                    this.f124139f = new C88113e(this);
                }
            }
        }
        return this.f124139f;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo64296c();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C88113e.m153185a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f124138e;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo64296c();
    }
}
