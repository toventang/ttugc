package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22266r;
import com.bytedance.scene.C22264q;
import com.bytedance.scene.C22268t;
import com.bytedance.scene.p1622d.C22171k;

/* renamed from: com.bytedance.scene.p */
public final class C22263p<T extends AbstractC22219j & AbstractC22266r> implements AbstractC22232m {

    /* renamed from: a */
    private final int f52659a;

    /* renamed from: b */
    private final AbstractC22285z f52660b;

    /* renamed from: c */
    private final T f52661c;

    /* renamed from: d */
    private final C22268t.AbstractC22270a f52662d;

    /* renamed from: e */
    private final boolean f52663e;

    /* renamed from: f */
    private final C22264q<T> f52664f = new C22264q<>();

    static {
        Covode.recordClassIndex(26075);
    }

    @Override // com.bytedance.scene.AbstractC22232m
    /* renamed from: a */
    public final void mo36503a() {
        this.f52664f.mo36573a();
    }

    @Override // com.bytedance.scene.AbstractC22232m
    /* renamed from: b */
    public final void mo36506b() {
        this.f52664f.mo36575b();
    }

    @Override // com.bytedance.scene.AbstractC22232m
    /* renamed from: c */
    public final void mo36507c() {
        this.f52664f.mo36576c();
    }

    @Override // com.bytedance.scene.AbstractC22232m
    /* renamed from: d */
    public final void mo36508d() {
        this.f52664f.mo36577d();
    }

    @Override // com.bytedance.scene.AbstractC22232m
    /* renamed from: e */
    public final void mo36509e() {
        this.f52664f.mo36578e();
    }

    @Override // com.bytedance.scene.AbstractC22232m
    /* renamed from: a */
    public final void mo36505a(Bundle bundle) {
        if (this.f52663e) {
            bundle.putString("SCENE", this.f52661c.getClass().getName());
            C22264q<T> qVar = this.f52664f;
            C22171k.m41656a(bundle, "outState can't be null");
            if (qVar.f52666b == C22264q.EnumC22265a.NONE) {
                throw new IllegalStateException("invoke onActivityCreated() first, current state " + qVar.f52666b.toString());
            } else if (qVar.f52667c) {
                qVar.f52665a.mo36412d(bundle);
            } else {
                throw new IllegalArgumentException("cant invoke onSaveInstanceState when not support restore");
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22232m
    /* renamed from: a */
    public final void mo36504a(Activity activity, Bundle bundle) {
        Bundle bundle2 = bundle;
        ViewGroup viewGroup = (ViewGroup) this.f52660b.mo36333a(this.f52659a);
        C22264q<T> qVar = this.f52664f;
        T t = this.f52661c;
        C22268t.AbstractC22270a aVar = this.f52662d;
        boolean z = this.f52663e;
        if (!z) {
            bundle2 = null;
        }
        qVar.mo36574a(activity, viewGroup, t, aVar, z, bundle2);
    }

    public C22263p(int i, AbstractC22285z zVar, T t, C22268t.AbstractC22270a aVar, boolean z) {
        this.f52659a = i;
        this.f52660b = zVar;
        this.f52661c = t;
        this.f52662d = aVar;
        this.f52663e = z;
    }
}
