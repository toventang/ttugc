package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

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

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.favorites.ui.i */
public abstract class AbstractC47712i extends AbstractC34586a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private ContextWrapper f110603a;

    /* renamed from: b */
    private volatile C88113e f110604b;

    /* renamed from: c */
    private final Object f110605c = new Object();

    static {
        Covode.recordClassIndex(56334);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f110603a;
    }

    AbstractC47712i() {
    }

    /* renamed from: c */
    private void m90711c() {
        ((AbstractC47603ab) generatedComponent()).mo60028a((C47742y) this);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m90710b().generatedComponent();
    }

    /* renamed from: a */
    private void mo79839a() {
        if (this.f110603a == null) {
            this.f110603a = C88113e.m153184a(super.getContext(), this);
            m90711c();
        }
    }

    /* renamed from: b */
    private C88113e m90710b() {
        if (this.f110604b == null) {
            synchronized (this.f110605c) {
                if (this.f110604b == null) {
                    this.f110604b = new C88113e(this);
                }
            }
        }
        return this.f110604b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo79839a();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C88113e.m153185a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f110603a;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo79839a();
    }
}
