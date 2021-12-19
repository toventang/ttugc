package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom;

import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c */
public final class C53331c extends C53348m {
    static {
        Covode.recordClassIndex(62892);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53348m
    /* renamed from: q */
    public final void mo89798q() {
        if (this.f122471j) {
            mo89819r();
            mo89820s();
            this.f122469h.setTuxFont(93);
            this.f122464c.setImageDrawable(this.f122470i.mo89730a(2131232120, getContext()));
            this.f122469h.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
            this.f122464c.setAlpha(1.0f);
            if (this.f122465d != null) {
                this.f122465d.setAlpha(0.0f);
                return;
            }
            return;
        }
        mo89821t();
        mo89820s();
        this.f122469h.setTuxFont(92);
        this.f122469h.setTextColor(C0643b.m2378c(getContext(), R.color.c5));
        this.f122465d.setImageDrawable(this.f122470i.mo89730a(2131232121, getContext()));
        if (this.f122464c != null) {
            this.f122464c.setAlpha(0.0f);
        }
        this.f122465d.setAlpha(1.0f);
    }

    public C53331c(C33931ar arVar) {
        super(arVar);
    }
}
