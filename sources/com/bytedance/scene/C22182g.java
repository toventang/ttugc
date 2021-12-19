package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.FragmentC22180f;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1622d.C22171k;

/* renamed from: com.bytedance.scene.g */
final class C22182g implements AbstractC22233n {

    /* renamed from: a */
    public final Activity f52430a;

    /* renamed from: b */
    public final FragmentC22180f f52431b;

    /* renamed from: c */
    private final C22239d f52432c;

    /* renamed from: d */
    private final FragmentC22272u f52433d;

    /* renamed from: e */
    private final Boolean f52434e;

    /* renamed from: f */
    private boolean f52435f;

    static {
        Covode.recordClassIndex(25986);
    }

    @Override // com.bytedance.scene.AbstractC22233n
    /* renamed from: a */
    public final boolean mo36340a() {
        if (this.f52435f || !this.f52432c.mo36524E()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.AbstractC22233n
    /* renamed from: b */
    public final void mo36341b() {
        if (!this.f52435f) {
            this.f52435f = true;
            final View view = this.f52432c.f52550n;
            FragmentManager fragmentManager = this.f52430a.getFragmentManager();
            FragmentTransaction remove = fragmentManager.beginTransaction().remove(this.f52431b).remove(this.f52433d);
            if (this.f52434e.booleanValue()) {
                this.f52431b.f52428a = new FragmentC22180f.AbstractC22181a() {
                    /* class com.bytedance.scene.C22182g.C221831 */

                    static {
                        Covode.recordClassIndex(25987);
                    }

                    @Override // com.bytedance.scene.FragmentC22180f.AbstractC22181a
                    /* renamed from: a */
                    public final void mo36371a() {
                        C22173e.m41663b(C22182g.this.f52430a, C22182g.this.f52431b.getTag());
                        View view = view;
                        if (view != null) {
                            C22171k.m41660a(view);
                        }
                    }
                };
                C22171k.m41659a(fragmentManager, remove, true);
                return;
            }
            C22171k.m41659a(fragmentManager, remove, false);
            C22173e.m41663b(this.f52430a, this.f52431b.getTag());
            if (view != null) {
                C22171k.m41660a(view);
            }
        }
    }

    C22182g(Activity activity, C22239d dVar, FragmentC22180f fVar, FragmentC22272u uVar, boolean z) {
        this.f52430a = activity;
        this.f52432c = dVar;
        this.f52431b = fVar;
        this.f52433d = uVar;
        this.f52434e = Boolean.valueOf(z);
    }
}
