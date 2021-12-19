package com.p2082ss.android.ugc.aweme.relation.recommend;

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

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.d */
public abstract class AbstractC66934d extends AbstractC34586a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private ContextWrapper f150228a;

    /* renamed from: b */
    private volatile C88113e f150229b;

    /* renamed from: c */
    private final Object f150230c = new Object();

    static {
        Covode.recordClassIndex(78511);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f150228a;
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m118676b().generatedComponent();
    }

    /* renamed from: a */
    private void m118675a() {
        if (this.f150228a == null) {
            this.f150228a = C88113e.m153184a(super.getContext(), this);
            generatedComponent();
        }
    }

    /* renamed from: b */
    private C88113e m118676b() {
        if (this.f150229b == null) {
            synchronized (this.f150230c) {
                if (this.f150229b == null) {
                    this.f150229b = new C88113e(this);
                }
            }
        }
        return this.f150229b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m118675a();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C88113e.m153185a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f150228a;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m118675a();
    }
}
