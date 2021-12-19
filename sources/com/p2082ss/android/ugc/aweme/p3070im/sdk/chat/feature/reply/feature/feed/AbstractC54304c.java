package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39112b;
import dagger.hilt.android.internal.managers.C88113e;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.c */
public abstract class AbstractC54304c extends C39112b implements AbstractC88084b<Object> {

    /* renamed from: a */
    private ContextWrapper f124388a;

    /* renamed from: b */
    private volatile C88113e f124389b;

    /* renamed from: c */
    private final Object f124390c = new Object();

    static {
        Covode.recordClassIndex(63999);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f124388a;
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo91384b().generatedComponent();
    }

    /* renamed from: a */
    private void mo91381a() {
        if (this.f124388a == null) {
            this.f124388a = C88113e.m153184a(super.getContext(), this);
            generatedComponent();
        }
    }

    /* renamed from: b */
    private C88113e mo91384b() {
        if (this.f124389b == null) {
            synchronized (this.f124390c) {
                if (this.f124389b == null) {
                    this.f124389b = new C88113e(this);
                }
            }
        }
        return this.f124389b;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo91381a();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C88113e.m153185a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f124388a;
        if (contextWrapper == null || C88113e.m153183a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C88085c.m153156a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo91381a();
    }
}
