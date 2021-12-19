package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.internal.s */
public final class C24776s {

    /* renamed from: a */
    public Fragment f58795a;

    /* renamed from: b */
    public android.app.Fragment f58796b;

    static {
        Covode.recordClassIndex(28929);
    }

    /* renamed from: a */
    public final Activity mo40595a() {
        Fragment fragment = this.f58795a;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return this.f58796b.getActivity();
    }

    public C24776s(android.app.Fragment fragment) {
        C24699ae.m47301a(fragment, "fragment");
        this.f58796b = fragment;
    }

    public C24776s(Fragment fragment) {
        C24699ae.m47301a(fragment, "fragment");
        this.f58795a = fragment;
    }

    /* renamed from: a */
    public final void mo40596a(Intent intent, int i) {
        Fragment fragment = this.f58795a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            this.f58796b.startActivityForResult(intent, i);
        }
    }
}
