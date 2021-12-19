package com.p2082ss.android.ugc.aweme.common.p2629a;

import android.graphics.drawable.Animatable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.p1860f.p1861a.AbstractC24269a;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34593a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.performance.C62845i;

/* renamed from: com.ss.android.ugc.aweme.common.a.e */
public abstract class AbstractC39059e<T> extends RecyclerView.ViewHolder implements AbstractC39062g {

    /* renamed from: m */
    public T f92231m;

    /* renamed from: n */
    public SmartImageView f92232n;

    /* renamed from: o */
    protected boolean f92233o;

    /* renamed from: p */
    public boolean f92234p = true;

    static {
        Covode.recordClassIndex(46675);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: e */
    public final boolean mo66995e() {
        return this.f92233o;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    public final void as_() {
        this.f92232n.mo34198c();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    public final void au_() {
        this.f92232n.mo34197b();
    }

    /* renamed from: f */
    private static boolean mo101991f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    public final void at_() {
        SmartImageView smartImageView = this.f92232n;
        if (smartImageView != null && smartImageView.getController() != null && this.f92232n.getController().mo39821i() != null) {
            Animatable i = this.f92232n.getController().mo39821i();
            if (i instanceof AbstractC24269a) {
                ((AbstractC24269a) i).mo40040a();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo67807g() {
        boolean z;
        if (C62845i.m113257a()) {
            return false;
        }
        this.itemView.getContext();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = mo101991f();
        }
        if (!C58029j.f132253e || C51426a.m95802a(this.itemView.getContext())) {
            if (Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            if (C34593a.m70629a("aweme_app", "use_dynamic_cover", z)) {
                return true;
            }
        }
        return false;
    }

    public AbstractC39059e(View view) {
        super(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: b */
    public void mo66994b(boolean z) {
        this.f92232n.setAttached(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: a */
    public final void mo66990a(boolean z) {
        this.f92232n.setUserVisibleHint(z);
    }

    /* renamed from: a */
    public void mo67806a(T t, int i) {
        this.f92232n.setUserVisibleHint(false);
    }

    /* renamed from: a */
    public static void m79277a(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.width != i || marginLayoutParams.height != i2) {
            marginLayoutParams.width = i;
            marginLayoutParams.height = i2;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
