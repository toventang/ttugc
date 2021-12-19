package com.bytedance.sdk.p1625a.p1642e;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1642e.AbstractC22367g;
import com.google.android.gms.auth.api.credentials.C25268d;
import com.google.android.gms.auth.api.credentials.C25269e;
import java.lang.ref.SoftReference;

/* renamed from: com.bytedance.sdk.a.e.b */
public abstract class AbstractC22360b implements AbstractC22369h {

    /* renamed from: a */
    protected C25268d f52840a;

    /* renamed from: b */
    protected SoftReference<Activity> f52841b;

    /* renamed from: c */
    protected SoftReference<AbstractC22361c> f52842c;

    /* renamed from: d */
    public AbstractC22367g.AbstractC22368a f52843d;

    static {
        Covode.recordClassIndex(26176);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo36720c();

    /* renamed from: d */
    private boolean mo36731d() {
        SoftReference<AbstractC22361c> softReference = this.f52842c;
        if (softReference == null || softReference.get() == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22369h
    /* renamed from: b */
    public final void mo36719b() {
        SoftReference<Activity> softReference = this.f52841b;
        if (softReference != null) {
            softReference.clear();
        }
        SoftReference<AbstractC22361c> softReference2 = this.f52842c;
        if (softReference2 != null) {
            softReference2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo36718a() {
        SoftReference<Activity> softReference = this.f52841b;
        if (softReference == null || softReference.get() == null || this.f52841b.get().isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo36717a(AbstractC22361c cVar) {
        this.f52842c = new SoftReference<>(cVar);
    }

    AbstractC22360b(Activity activity) {
        this.f52840a = new C25268d(activity, C25269e.f59946e);
        this.f52841b = new SoftReference<>(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36716a(C22359a aVar) {
        if (mo36731d()) {
            this.f52842c.get().mo36722a(aVar);
        }
        if (this.f52843d != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("result", 1);
            this.f52843d.mo36733a(mo36720c(), bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36715a(int i, String str) {
        mo36714a(i, 0, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36714a(int i, int i2, String str) {
        if (mo36731d()) {
            this.f52842c.get().mo36721a(i, i2);
        }
        if (this.f52843d != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("result", 0);
            bundle.putInt("error_code", i);
            bundle.putInt("gsl_status_code", i2);
            bundle.putString("error_message", str);
            this.f52843d.mo36733a(mo36720c(), bundle);
        }
    }
}
