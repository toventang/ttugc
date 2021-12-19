package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50826b;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d */
public final class C50869d implements AbstractC50826b {

    /* renamed from: a */
    private View.OnClickListener f117360a;

    /* renamed from: b */
    private boolean f117361b;

    /* renamed from: c */
    private final View f117362c;

    /* renamed from: d */
    private final View f117363d;

    static {
        Covode.recordClassIndex(60044);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50826b
    /* renamed from: a */
    public final boolean mo86206a() {
        View view = this.f117362c;
        if (view != null) {
            return view.isSelected();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50826b
    /* renamed from: a */
    public final void mo86204a(View.OnClickListener onClickListener) {
        this.f117360a = onClickListener;
        m95259d(this.f117361b);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50826b
    /* renamed from: a */
    public final void mo86205a(boolean z) {
        View view;
        if (this.f117361b && (view = this.f117362c) != null) {
            view.setSelected(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50826b
    /* renamed from: b */
    public final void mo86207b(boolean z) {
        this.f117361b = z;
        m95258c(z);
        m95259d(this.f117361b);
    }

    /* renamed from: c */
    private final void m95258c(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.f117362c;
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = this.f117363d;
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    /* renamed from: d */
    private final void m95259d(boolean z) {
        if (z) {
            View view = this.f117362c;
            if (view != null) {
                view.setOnClickListener(this.f117360a);
                return;
            }
            return;
        }
        View view2 = this.f117362c;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
    }

    public C50869d(View view, View view2) {
        this.f117362c = view;
        this.f117363d = view2;
        if (view != null) {
            view.setSelected(false);
        }
        m95258c(this.f117361b);
    }
}
