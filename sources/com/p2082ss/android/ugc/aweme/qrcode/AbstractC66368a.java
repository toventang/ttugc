package com.p2082ss.android.ugc.aweme.qrcode;

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

/* renamed from: com.ss.android.ugc.aweme.qrcode.a */
public abstract class AbstractC66368a extends C17372a implements AbstractC88084b<Object> {

    /* renamed from: e */
    private ContextWrapper f149263e;

    /* renamed from: f */
    private volatile C88113e f149264f;

    /* renamed from: g */
    private final Object f149265g = new Object();

    static {
        Covode.recordClassIndex(77894);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f149263e;
    }

    AbstractC66368a() {
    }

    /* renamed from: e */
    private void mo105293e() {
        ((AbstractC66412h) generatedComponent()).mo60030a((QRCodeFragment) this);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo105292d().generatedComponent();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    private void mo64296c() {
        if (this.f149263e == null) {
            this.f149263e = C88113e.m153184a(super.getContext(), this);
            mo105293e();
        }
    }

    /* renamed from: d */
    private C88113e mo105292d() {
        if (this.f149264f == null) {
            synchronized (this.f149265g) {
                if (this.f149264f == null) {
                    this.f149264f = new C88113e(this);
                }
            }
        }
        return this.f149264f;
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
        ContextWrapper contextWrapper = this.f149263e;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo64296c();
    }
}
