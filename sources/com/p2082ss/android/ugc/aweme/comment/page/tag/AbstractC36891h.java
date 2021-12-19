package com.p2082ss.android.ugc.aweme.comment.page.tag;

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

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.h */
public abstract class AbstractC36891h extends C17372a implements AbstractC88084b<Object> {

    /* renamed from: e */
    private ContextWrapper f86885e;

    /* renamed from: f */
    private volatile C88113e f86886f;

    /* renamed from: g */
    private final Object f86887g = new Object();

    static {
        Covode.recordClassIndex(44229);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f86885e;
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m74515d().generatedComponent();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    private void mo64296c() {
        if (this.f86885e == null) {
            this.f86885e = C88113e.m153184a(super.getContext(), this);
            generatedComponent();
        }
    }

    /* renamed from: d */
    private C88113e m74515d() {
        if (this.f86886f == null) {
            synchronized (this.f86887g) {
                if (this.f86886f == null) {
                    this.f86886f = new C88113e(this);
                }
            }
        }
        return this.f86886f;
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
        ContextWrapper contextWrapper = this.f86885e;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo64296c();
    }
}
